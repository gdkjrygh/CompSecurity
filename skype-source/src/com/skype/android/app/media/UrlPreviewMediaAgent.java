// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.graphics.Movie;
import android.util.Pair;
import com.skype.MediaDocument;
import com.skype.android.concurrent.ListenableCompletableFuture;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentUrlPreviewObserver, MediaLinkProfile

public class UrlPreviewMediaAgent
{
    public static class OnMovieDecodingResult
    {

        private ListenableCompletableFuture future;
        private Movie movie;
        private String path;

        public ListenableCompletableFuture getFuture()
        {
            return future;
        }

        public String getPath()
        {
            return path;
        }

        public Movie getResult()
        {
            return movie;
        }

        public OnMovieDecodingResult(ListenableCompletableFuture listenablecompletablefuture, Movie movie1, String s)
        {
            future = listenablecompletablefuture;
            movie = movie1;
            path = s;
        }
    }

    public static class OnUrlPreviewResult
    {

        private MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture future;
        private MediaDocumentDownloadUtil.UrlPreviewResult result;

        public MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture getFuture()
        {
            return future;
        }

        public MediaDocumentDownloadUtil.UrlPreviewResult getResult()
        {
            return result;
        }

        public OnUrlPreviewResult(MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture telemetryurlpreviewfuture, MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult)
        {
            future = telemetryurlpreviewfuture;
            result = urlpreviewresult;
        }
    }


    private Map documentObservers;
    private EventBus eventBus;

    public UrlPreviewMediaAgent(EventBus eventbus)
    {
        eventBus = eventbus;
        (new EventSubscriberBinder(eventbus, this)).bind();
        documentObservers = new ConcurrentSkipListMap(new Comparator() {

            final UrlPreviewMediaAgent this$0;

            public final int compare(Pair pair, Pair pair1)
            {
                int i = ((Integer)pair.first).intValue();
                int j = ((Integer)pair1.first).intValue();
                if (i != j)
                {
                    return i - j;
                } else
                {
                    return ((MediaLinkProfile)pair.second).ordinal() - ((MediaLinkProfile)pair1.second).ordinal();
                }
            }

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((Pair)obj, (Pair)obj1);
            }

            
            {
                this$0 = UrlPreviewMediaAgent.this;
                super();
            }
        });
    }

    private void notifyUrlPreviewDocumentObservers(MediaLinkProfile medialinkprofile, com.skype.MediaDocument.MEDIA_STATUS media_status, MediaDocument mediadocument)
    {
        Object obj = new Pair(Integer.valueOf(mediadocument.getObjectID()), medialinkprofile);
        obj = (List)documentObservers.get(obj);
        if (obj != null && ((List) (obj)).size() != 0)
        {
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((MediaDocumentUrlPreviewObserver)((Iterator) (obj)).next()).documentProfileUpdated(mediadocument, medialinkprofile, media_status);
            }
        }
    }

    public void addUrlPreviewDocumentObserver(int i, MediaLinkProfile medialinkprofile, MediaDocumentUrlPreviewObserver mediadocumenturlpreviewobserver)
    {
        Pair pair = new Pair(Integer.valueOf(i), medialinkprofile);
        List list = (List)documentObservers.get(pair);
        medialinkprofile = list;
        if (list == null)
        {
            medialinkprofile = new CopyOnWriteArrayList();
            documentObservers.put(pair, medialinkprofile);
        }
        medialinkprofile.add(mediadocumenturlpreviewobserver);
    }

    public void onEvent(OnMovieDecodingResult onmoviedecodingresult)
    {
        ListenableCompletableFuture listenablecompletablefuture = onmoviedecodingresult.getFuture();
        if (listenablecompletablefuture.isDone())
        {
            return;
        }
        Movie movie = onmoviedecodingresult.getResult();
        onmoviedecodingresult = onmoviedecodingresult.getPath();
        if (movie == null || movie.width() == 0 || movie.height() == 0 || movie.duration() == 0)
        {
            listenablecompletablefuture.completeExceptionally(new IllegalStateException((new StringBuilder("Unable to decode movie file ")).append(onmoviedecodingresult).toString()));
            return;
        } else
        {
            listenablecompletablefuture.complete(movie);
            return;
        }
    }

    public void onEvent(OnUrlPreviewResult onurlpreviewresult)
    {
        MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture telemetryurlpreviewfuture = onurlpreviewresult.getFuture();
        onurlpreviewresult = onurlpreviewresult.getResult();
        if (!telemetryurlpreviewfuture.isDone())
        {
            telemetryurlpreviewfuture.complete(onurlpreviewresult);
        }
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnMediaLinkStatusChange onmedialinkstatuschange)
    {
        MediaLinkProfile medialinkprofile = MediaLinkProfile.fromString(onmedialinkstatuschange.getProfile());
        com.skype.MediaDocument.MEDIA_STATUS media_status = onmedialinkstatuschange.getStatus();
        if (onmedialinkstatuschange.getSender().getDocTypeProp().equals(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_URL_PREVIEW))
        {
            notifyUrlPreviewDocumentObservers(medialinkprofile, media_status, onmedialinkstatuschange.getSender());
        }
    }

    public void postMovieDecodingResultEvent(ListenableCompletableFuture listenablecompletablefuture, Movie movie, String s)
    {
        listenablecompletablefuture = new OnMovieDecodingResult(listenablecompletablefuture, movie, s);
        eventBus.a(listenablecompletablefuture);
    }

    public void postUrlPreviewResultEvent(MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture telemetryurlpreviewfuture, MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult)
    {
        telemetryurlpreviewfuture = new OnUrlPreviewResult(telemetryurlpreviewfuture, urlpreviewresult);
        eventBus.a(telemetryurlpreviewfuture);
    }

    public void removeUrlPreviewDocumentObserver(int i, MediaLinkProfile medialinkprofile, MediaDocumentUrlPreviewObserver mediadocumenturlpreviewobserver)
    {
        medialinkprofile = new Pair(Integer.valueOf(i), medialinkprofile);
        medialinkprofile = (List)documentObservers.get(medialinkprofile);
        if (medialinkprofile != null)
        {
            medialinkprofile.remove(mediadocumenturlpreviewobserver);
        }
    }
}

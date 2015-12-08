// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.media;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.googleapis.media:
//            MediaHttpDownloaderProgressListener

public final class MediaHttpDownloader
{
    public static final class DownloadState extends Enum
    {

        private static final DownloadState $VALUES[];
        public static final DownloadState MEDIA_COMPLETE;
        public static final DownloadState MEDIA_IN_PROGRESS;
        public static final DownloadState NOT_STARTED;

        public static DownloadState valueOf(String s)
        {
            return (DownloadState)Enum.valueOf(com/google/api/client/googleapis/media/MediaHttpDownloader$DownloadState, s);
        }

        public static DownloadState[] values()
        {
            return (DownloadState[])$VALUES.clone();
        }

        static 
        {
            NOT_STARTED = new DownloadState("NOT_STARTED", 0);
            MEDIA_IN_PROGRESS = new DownloadState("MEDIA_IN_PROGRESS", 1);
            MEDIA_COMPLETE = new DownloadState("MEDIA_COMPLETE", 2);
            $VALUES = (new DownloadState[] {
                NOT_STARTED, MEDIA_IN_PROGRESS, MEDIA_COMPLETE
            });
        }

        private DownloadState(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int MAXIMUM_CHUNK_SIZE = 0x2000000;
    private long bytesDownloaded;
    private int chunkSize;
    private boolean directDownloadEnabled;
    private DownloadState downloadState;
    private long lastBytePos;
    private long mediaContentLength;
    private MediaHttpDownloaderProgressListener progressListener;
    private final HttpRequestFactory requestFactory;
    private final HttpTransport transport;

    public MediaHttpDownloader(HttpTransport httptransport, HttpRequestInitializer httprequestinitializer)
    {
        directDownloadEnabled = false;
        chunkSize = 0x2000000;
        downloadState = DownloadState.NOT_STARTED;
        lastBytePos = -1L;
        transport = (HttpTransport)Preconditions.checkNotNull(httptransport);
        if (httprequestinitializer == null)
        {
            httptransport = httptransport.createRequestFactory();
        } else
        {
            httptransport = httptransport.createRequestFactory(httprequestinitializer);
        }
        requestFactory = httptransport;
    }

    private HttpResponse executeCurrentRequest(long l, GenericUrl genericurl, HttpHeaders httpheaders, OutputStream outputstream)
        throws IOException
    {
        genericurl = requestFactory.buildGetRequest(genericurl);
        if (httpheaders != null)
        {
            genericurl.getHeaders().putAll(httpheaders);
        }
        if (bytesDownloaded != 0L || l != -1L)
        {
            httpheaders = new StringBuilder();
            httpheaders.append("bytes=").append(bytesDownloaded).append("-");
            if (l != -1L)
            {
                httpheaders.append(l);
            }
            genericurl.getHeaders().setRange(httpheaders.toString());
        }
        genericurl = genericurl.execute();
        IOUtils.copy(genericurl.getContent(), outputstream);
        genericurl.disconnect();
        return genericurl;
        httpheaders;
        genericurl.disconnect();
        throw httpheaders;
    }

    private long getNextByteIndex(String s)
    {
        if (s == null)
        {
            return 0L;
        } else
        {
            return Long.parseLong(s.substring(s.indexOf('-') + 1, s.indexOf('/'))) + 1L;
        }
    }

    private void setMediaContentLength(String s)
    {
        while (s == null || mediaContentLength != 0L) 
        {
            return;
        }
        mediaContentLength = Long.parseLong(s.substring(s.indexOf('/') + 1));
    }

    private void updateStateAndNotifyListener(DownloadState downloadstate)
        throws IOException
    {
        downloadState = downloadstate;
        if (progressListener != null)
        {
            progressListener.progressChanged(this);
        }
    }

    public void download(GenericUrl genericurl, HttpHeaders httpheaders, OutputStream outputstream)
        throws IOException
    {
        boolean flag;
        if (downloadState == DownloadState.NOT_STARTED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        genericurl.put("alt", "media");
        if (directDownloadEnabled)
        {
            updateStateAndNotifyListener(DownloadState.MEDIA_IN_PROGRESS);
            mediaContentLength = executeCurrentRequest(lastBytePos, genericurl, httpheaders, outputstream).getHeaders().getContentLength().longValue();
            bytesDownloaded = mediaContentLength;
            updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
            return;
        }
        do
        {
            long l1 = (bytesDownloaded + (long)chunkSize) - 1L;
            l = l1;
            if (lastBytePos != -1L)
            {
                l = Math.min(lastBytePos, l1);
            }
            String s = executeCurrentRequest(l, genericurl, httpheaders, outputstream).getHeaders().getContentRange();
            l = getNextByteIndex(s);
            setMediaContentLength(s);
            if (mediaContentLength > l)
            {
                bytesDownloaded = l;
                updateStateAndNotifyListener(DownloadState.MEDIA_IN_PROGRESS);
            } else
            {
                bytesDownloaded = mediaContentLength;
                updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
                return;
            }
        } while (true);
    }

    public void download(GenericUrl genericurl, OutputStream outputstream)
        throws IOException
    {
        download(genericurl, null, outputstream);
    }

    public int getChunkSize()
    {
        return chunkSize;
    }

    public DownloadState getDownloadState()
    {
        return downloadState;
    }

    public long getLastBytePosition()
    {
        return lastBytePos;
    }

    public long getNumBytesDownloaded()
    {
        return bytesDownloaded;
    }

    public double getProgress()
    {
        if (mediaContentLength == 0L)
        {
            return 0.0D;
        } else
        {
            return (double)bytesDownloaded / (double)mediaContentLength;
        }
    }

    public MediaHttpDownloaderProgressListener getProgressListener()
    {
        return progressListener;
    }

    public HttpTransport getTransport()
    {
        return transport;
    }

    public boolean isDirectDownloadEnabled()
    {
        return directDownloadEnabled;
    }

    public MediaHttpDownloader setBytesDownloaded(long l)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        bytesDownloaded = l;
        return this;
    }

    public MediaHttpDownloader setChunkSize(int i)
    {
        boolean flag;
        if (i > 0 && i <= 0x2000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        chunkSize = i;
        return this;
    }

    public MediaHttpDownloader setContentRange(long l, int i)
    {
        boolean flag;
        if ((long)i >= l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        setBytesDownloaded(l);
        lastBytePos = i;
        return this;
    }

    public MediaHttpDownloader setDirectDownloadEnabled(boolean flag)
    {
        directDownloadEnabled = flag;
        return this;
    }

    public MediaHttpDownloader setProgressListener(MediaHttpDownloaderProgressListener mediahttpdownloaderprogresslistener)
    {
        progressListener = mediahttpdownloaderprogresslistener;
        return this;
    }
}

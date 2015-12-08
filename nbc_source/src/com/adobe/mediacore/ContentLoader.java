// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.ContainerType;
import com.adobe.ave.Timeline;
import com.adobe.ave.VideoEngineException;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdAsset;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.ContentTracker;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineDispatcher, MediaResource, ContentCache, MediaPlayerEvent, 
//            AdHandle, AdManifestLoadCompleteListener, AdManifestLoadFailedListener, MediaPlayerNotification, 
//            OperationFailedEvent

final class ContentLoader
{
    private class ContentLoadCompleteListener
        implements AdManifestLoadCompleteListener
    {

        final ContentLoader this$0;

        public void onCompleted(int i, int j, long l)
        {
            AdHandle adhandle = new AdHandle(j, l);
            String s = _contentLoaderMonitor.getUrl(i);
            _contentCache.addContent(s, adhandle);
            _contentLoaderMonitor.markContentResolved(i);
            if (_contentLoaderMonitor.hasFinishedLoading())
            {
                _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.AD_BREAK_MANIFEST_LOAD_COMPLETE));
            }
        }

        private ContentLoadCompleteListener()
        {
            this$0 = ContentLoader.this;
            super();
        }

    }

    private class ContentLoadFailedListener
        implements AdManifestLoadFailedListener
    {

        final ContentLoader this$0;

        public void onError(int i)
        {
            Ad ad = _contentLoaderMonitor.getAd(i);
            if (ad != null && ad.getContentTracker() != null)
            {
                ad.getContentTracker().onAdError(ad);
            }
            _contentLoaderMonitor.markContentResolved(i);
            if (_videoEngineDispatcher != null)
            {
                MediaPlayerNotification.Warning warning = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.AD_MANIFEST_LOAD_FAILED, "fail to load ad manifest");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("AD", ad.toString());
                warning.setMetadata(metadatanode);
                _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(warning));
            }
            if (_contentLoaderMonitor.hasFinishedLoading())
            {
                _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.AD_BREAK_MANIFEST_LOAD_COMPLETE));
            }
        }

        private ContentLoadFailedListener()
        {
            this$0 = ContentLoader.this;
            super();
        }

    }

    private class ContentLoaderMonitor
    {

        private Map _pendingContentLoading;
        final ContentLoader this$0;

        public void addPendingContent(int i, Ad ad)
        {
            _pendingContentLoading.put(Integer.valueOf(i), ad);
        }

        public void clear()
        {
            _pendingContentLoading = null;
        }

        public Ad getAd(int i)
        {
            return (Ad)_pendingContentLoading.get(Integer.valueOf(i));
        }

        public String getUrl(int i)
        {
            Ad ad = (Ad)_pendingContentLoading.get(Integer.valueOf(i));
            if (ad != null && ad.getPrimaryAsset() != null && ad.getPrimaryAsset().getMediaResource() != null)
            {
                return ad.getPrimaryAsset().getMediaResource().getUrl();
            } else
            {
                return "";
            }
        }

        public boolean hasFinishedLoading()
        {
            return _pendingContentLoading.isEmpty();
        }

        public void markContentResolved(int i)
        {
            _pendingContentLoading.remove(Integer.valueOf(i));
        }

        private ContentLoaderMonitor()
        {
            this$0 = ContentLoader.this;
            super();
            _pendingContentLoading = new Hashtable();
        }

    }


    public static final String FLV = "FLV";
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/ContentLoader.getSimpleName()).toString();
    private static final int START_AD_LOADING_ID = 1;
    private final ContentCache _contentCache;
    private final ContentLoadCompleteListener _contentLoadCompleteListener = new ContentLoadCompleteListener();
    private final ContentLoadFailedListener _contentLoadFailedListener = new ContentLoadFailedListener();
    private ContentLoaderMonitor _contentLoaderMonitor;
    private final Logger _logger;
    private int _nextAvailableId;
    private final VideoEngineDispatcher _videoEngineDispatcher;
    private Timeline _videoEngineTimeline;

    public ContentLoader(VideoEngineDispatcher videoenginedispatcher, ContentCache contentcache)
    {
        _logger = Log.getLogger(LOG_TAG);
        _nextAvailableId = 1;
        _contentLoaderMonitor = new ContentLoaderMonitor();
        _videoEngineDispatcher = videoenginedispatcher;
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.AD_MANIFEST_LOAD_COMPLETE, _contentLoadCompleteListener);
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.AD_MANIFEST_LOAD_FAILED, _contentLoadFailedListener);
        _contentCache = contentcache;
    }

    private ContainerType convertType(MediaResource.Type type)
    {
        ContainerType containertype = ContainerType.UNDEFINED;
        if (type.equals(MediaResource.Type.HLS))
        {
            containertype = ContainerType.HLS;
        }
        return containertype;
    }

    private ContentLoaderMonitor createContentLoaderMonitorForAdBreak(AdBreak adbreak, int i)
    {
        ContentLoaderMonitor contentloadermonitor = new ContentLoaderMonitor();
        for (adbreak = adbreak.adsIterator(); adbreak.hasNext();)
        {
            contentloadermonitor.addPendingContent(i, (Ad)adbreak.next());
            i++;
        }

        return contentloadermonitor;
    }

    public void loadContent(AdBreak adbreak)
    {
        if (_videoEngineTimeline == null)
        {
            throw new IllegalStateException("No timeline was set for loading manifests.");
        }
        _contentLoaderMonitor = createContentLoaderMonitorForAdBreak(adbreak, _nextAvailableId);
        adbreak = adbreak.adsIterator();
        while (adbreak.hasNext()) 
        {
            Ad ad = (Ad)adbreak.next();
            String s = ad.getPrimaryAsset().getMediaResource().getUrl();
            if (_contentCache.isCached(s))
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#loadContent").toString(), (new StringBuilder()).append("Retrieving from cache content ").append(_nextAvailableId).append(" location = ").append(s).toString());
                _contentLoaderMonitor.markContentResolved(_nextAvailableId);
            } else
            {
                try
                {
                    _logger.i((new StringBuilder()).append(LOG_TAG).append("#loadContent").toString(), (new StringBuilder()).append("Starting the loading of manifest for content = ").append(_nextAvailableId).append(" location = ").append(s).toString());
                    _videoEngineTimeline.loadManifest(s, _nextAvailableId, convertType(ad.getPrimaryAsset().getMediaResource().getType()));
                }
                catch (VideoEngineException videoengineexception)
                {
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#loadContent").toString(), (new StringBuilder()).append("Received exception { code = ").append(videoengineexception.getErrorCode()).append(", description = ").append(videoengineexception.getDetailMessage()).append("} while loading content { id = ").append(_nextAvailableId).append(", location = ").append(s).append("}").toString());
                    _contentLoaderMonitor.markContentResolved(_nextAvailableId);
                }
            }
            _nextAvailableId = _nextAvailableId + 1;
        }
        if (_contentLoaderMonitor.hasFinishedLoading())
        {
            _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.AD_BREAK_MANIFEST_LOAD_COMPLETE));
        }
    }

    public void releaseHandles()
    {
        removeListeners();
        if (_videoEngineTimeline != null)
        {
            for (Iterator iterator = _contentCache.getCachedUrls().iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                AdHandle adhandle = _contentCache.getHandle(s);
                try
                {
                    _videoEngineTimeline.releaseManifest(adhandle.getHandle());
                }
                catch (VideoEngineException videoengineexception)
                {
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#loadContent").toString(), (new StringBuilder()).append("Received exception { code = ").append(videoengineexception.getErrorCode()).append(", description = ").append(videoengineexception.getDetailMessage()).append("} while releasing content { handle = ").append(adhandle.getHandle()).append(", location = ").append(s).append("}").toString());
                }
            }

            _contentCache.clearCache();
        }
    }

    public void removeListeners()
    {
        _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.AD_MANIFEST_LOAD_COMPLETE, _contentLoadCompleteListener);
        _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.AD_MANIFEST_LOAD_FAILED, _contentLoadFailedListener);
    }

    public void setVideoEngineTimeline(Timeline timeline)
    {
        _videoEngineTimeline = timeline;
    }




}

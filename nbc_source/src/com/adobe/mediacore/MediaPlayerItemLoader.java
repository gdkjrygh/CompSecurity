// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.content.Context;
import com.adobe.ave.ContainerType;
import com.adobe.ave.ListenerType;
import com.adobe.ave.MediaErrorCode;
import com.adobe.ave.UpdateType;
import com.adobe.ave.VideoEngine;
import com.adobe.ave.VideoEngineException;
import com.adobe.ave.VideoEngineListener;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import java.io.File;
import java.util.Arrays;
import java.util.EnumSet;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineDispatcher, MediaResource, VideoEngineItem, MediaPlayerItem, 
//            PSDKConfig, DRMMetadataCache

public class MediaPlayerItemLoader
{
    public static interface LoaderListener
    {

        public abstract void onError(MediaErrorCode mediaerrorcode, String s);

        public abstract void onLoadComplete(MediaPlayerItem mediaplayeritem);
    }


    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/MediaPlayerItemLoader.getSimpleName()).toString();
    private Context _context;
    private boolean _isProtected;
    private LoaderListener _listener;
    private final Logger _logger;
    private MediaResource _mediaResource;
    private VideoEngine _videoEngine;
    private VideoEngineDispatcher _videoEngineDispatcher;
    private VideoEngineItem _videoEngineItem;
    private VideoEngineListener _videoEngineListener;
    private final int contentId = 0;

    public MediaPlayerItemLoader(Context context, LoaderListener loaderlistener)
    {
        _logger = Log.getLogger(LOG_TAG);
        if (context == null)
        {
            throw new IllegalArgumentException("Video engine context parameter must not be null.");
        }
        if (loaderlistener == null)
        {
            throw new IllegalArgumentException("Video engine dispatcher parameter must not be null.");
        }
        _context = context;
        _listener = loaderlistener;
        _videoEngineDispatcher = new VideoEngineDispatcher();
        try
        {
            _videoEngine = new VideoEngine();
            context = EnumSet.of(ListenerType.ERROR, ListenerType.DRM_METADATA, ListenerType.TIMELINE);
            _videoEngineListener = createEngineListener();
            _videoEngine.addListener(context, _videoEngineListener);
            context = _context.getFilesDir().getAbsolutePath();
            _videoEngine.setLocalStoragePath(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            _listener.onError(context.getErrorCode(), context.getMessage());
        }
    }

    private ContainerType convertType(MediaResource.Type type)
    {
        if (type == MediaResource.Type.HDS)
        {
            return ContainerType.F4M;
        }
        if (type == MediaResource.Type.HLS)
        {
            return ContainerType.HLS;
        } else
        {
            return ContainerType.UNDEFINED;
        }
    }

    private VideoEngineListener createEngineListener()
    {
        return new VideoEngineListener() {

            final MediaPlayerItemLoader this$0;

            public void onDRMMetadata(VideoEngine videoengine, byte abyte0[], int i, long l)
            {
                if (_videoEngine == videoengine)
                {
                    _logger.i((new StringBuilder()).append(MediaPlayerItemLoader.LOG_TAG).append("#onDRMMetadata").toString(), (new StringBuilder()).append("DRMMetadata event  received at time [").append(l).append("]").toString());
                    _isProtected = true;
                }
            }

            public void onError(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
            {
                if (_videoEngine == videoengine)
                {
                    _logger.e((new StringBuilder()).append(MediaPlayerItemLoader.LOG_TAG).append("#onError").toString(), (new StringBuilder()).append("[Error] >> ").append(String.valueOf(mediaerrorcode)).append(" - ").append(s).toString());
                }
            }

            public void onTimeline(VideoEngine videoengine, UpdateType updatetype)
            {
                if (_videoEngine == videoengine)
                {
                    _logger.i((new StringBuilder()).append(MediaPlayerItemLoader.LOG_TAG).append("#onTimeline").toString(), (new StringBuilder()).append("Timeline event  received. Update type: ").append(updatetype).toString());
                    videoengine = Arrays.asList(PSDKConfig.getAdTagsWithDefault());
                    updatetype = new DRMMetadataCache();
                    _videoEngineItem = new VideoEngineItem(_videoEngineDispatcher, _mediaResource, 0, updatetype, videoengine);
                    _videoEngineItem.update(_videoEngine);
                    _videoEngineItem.setIsProtected(_isProtected);
                    _listener.onLoadComplete(_videoEngineItem);
                }
            }

            public void onWarning(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
            {
                if (_videoEngine == videoengine)
                {
                    _logger.w((new StringBuilder()).append(MediaPlayerItemLoader.LOG_TAG).append("#onWarning").toString(), (new StringBuilder()).append("[Warning] >> ").append(String.valueOf(mediaerrorcode)).append(" - ").append(s).toString());
                }
            }

            
            {
                this$0 = MediaPlayerItemLoader.this;
                super();
            }
        };
    }

    public void load(MediaResource mediaresource)
    {
        _mediaResource = mediaresource;
        try
        {
            mediaresource = _mediaResource.getUrl();
            ContainerType containertype = convertType(_mediaResource.getType());
            _videoEngine.load(mediaresource, containertype, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaResource mediaresource)
        {
            _listener.onError(mediaresource.getErrorCode(), mediaresource.getMessage());
        }
    }







/*
    static boolean access$302(MediaPlayerItemLoader mediaplayeritemloader, boolean flag)
    {
        mediaplayeritemloader._isProtected = flag;
        return flag;
    }

*/



/*
    static VideoEngineItem access$402(MediaPlayerItemLoader mediaplayeritemloader, VideoEngineItem videoengineitem)
    {
        mediaplayeritemloader._videoEngineItem = videoengineitem;
        return videoengineitem;
    }

*/



}

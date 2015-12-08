// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerView

private class _viewHolderCallback
{

    private boolean _hasSurface;
    private SurfaceHolder _viewHolder;
    private android.view.llback._hasSurface _viewHolderCallback;
    final MediaPlayerView this$0;

    private void release()
    {
        if (_viewHolder != null)
        {
            _viewHolder.removeCallback(_viewHolderCallback);
            _viewHolder = null;
        }
    }

    public boolean hasSurface()
    {
        return _hasSurface;
    }



/*
    static boolean access$302(_cls1 _pcls1, boolean flag)
    {
        _pcls1._hasSurface = flag;
        return flag;
    }

*/

    public _cls1.this._cls1(SurfaceView surfaceview)
    {
        this$0 = MediaPlayerView.this;
        super();
        _hasSurface = false;
        _viewHolderCallback = new android.view.SurfaceHolder.Callback() {

            final MediaPlayerView.VideoEngineViewCallback this$1;

            public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
            {
            }

            public void surfaceCreated(SurfaceHolder surfaceholder)
            {
                MediaPlayerView.access$200().i((new StringBuilder()).append(MediaPlayerView.access$100()).append("#surfaceCreated").toString(), "Media player surface was created.");
                _hasSurface = true;
                MediaPlayerView.access$400(this$0);
            }

            public void surfaceDestroyed(SurfaceHolder surfaceholder)
            {
                MediaPlayerView.access$200().i((new StringBuilder()).append(MediaPlayerView.access$100()).append("#surfaceDestroyed").toString(), "Media player surface was destroyed.");
                _hasSurface = false;
                MediaPlayerView.access$500(this$0);
            }

            
            {
                this$1 = MediaPlayerView.VideoEngineViewCallback.this;
                super();
            }
        };
        if (surfaceview != null && _viewHolder == null)
        {
            _viewHolder = surfaceview.getHolder();
            if (_viewHolder != null)
            {
                _viewHolder.addCallback(_viewHolderCallback);
            }
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.view.SurfaceHolder;
import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerView

class this._cls1
    implements android.view.back._cls1
{

    final is._cls0 this$1;

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        MediaPlayerView.access$200().i((new StringBuilder()).append(MediaPlayerView.access$100()).append("#surfaceCreated").toString(), "Media player surface was created.");
        cess._mth302(this._cls1.this, true);
        MediaPlayerView.access$400(_fld0);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        MediaPlayerView.access$200().i((new StringBuilder()).append(MediaPlayerView.access$100()).append("#surfaceDestroyed").toString(), "Media player surface was destroyed.");
        cess._mth302(this._cls1.this, false);
        MediaPlayerView.access$500(_fld0);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

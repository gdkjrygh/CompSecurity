// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.media.MediaPlayer;
import com.facebook.common.executors.AndroidThreadUtil;

// Referenced classes of package com.facebook.video.view:
//            TextureViewImplementation

class b
    implements Runnable
{

    final MediaPlayer a;
    final com.facebook.video.api.ishedCallback b;
    final TextureViewImplementation c;

    public void run()
    {
        if (a.isPlaying())
        {
            a.stop();
        }
        a.reset();
        a.release();
        class _cls1
            implements Runnable
        {

            final TextureViewImplementation._cls1 a;

            public void run()
            {
                a.b.bU_();
            }

            _cls1()
            {
                a = TextureViewImplementation._cls1.this;
                super();
            }
        }

        TextureViewImplementation.a(c).b(new _cls1());
    }

    shedCallback(TextureViewImplementation textureviewimplementation, MediaPlayer mediaplayer, com.facebook.video.api.ishedCallback ishedcallback)
    {
        c = textureviewimplementation;
        a = mediaplayer;
        b = ishedcallback;
        super();
    }
}

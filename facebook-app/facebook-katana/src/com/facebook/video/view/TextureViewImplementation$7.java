// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.media.MediaPlayer;
import com.facebook.video.api.VideoMetadata;

// Referenced classes of package com.facebook.video.view:
//            TextureViewImplementation

class b
    implements com.facebook.video.api.pareCallback
{

    final com.facebook.video.api.yingCallback a;
    final int b;
    final TextureViewImplementation c;

    public final void a(VideoMetadata videometadata)
    {
        TextureViewImplementation.b(c, false);
        TextureViewImplementation.a(c, b);
        TextureViewImplementation.m(c).seekTo(TextureViewImplementation.n(c));
        if (TextureViewImplementation.o(c) != null)
        {
            videometadata = TextureViewImplementation.o(c);
            TextureViewImplementation.a(c, null);
            c.b(videometadata);
            return;
        } else
        {
            c.a(a);
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        TextureViewImplementation.b(c, false);
        a.a(throwable);
    }

    ingCallback(TextureViewImplementation textureviewimplementation, com.facebook.video.api.yingCallback yingcallback, int i)
    {
        c = textureviewimplementation;
        a = yingcallback;
        b = i;
        super();
    }
}

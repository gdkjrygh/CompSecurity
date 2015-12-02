// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import com.facebook.video.api.VideoMetadata;

// Referenced classes of package com.facebook.video.view:
//            TextureViewImplementation

class b
    implements com.facebook.video.api.pareCallback
{

    final com.facebook.video.api.ishedCallback a;
    final int b;
    final TextureViewImplementation c;

    public final void a(VideoMetadata videometadata)
    {
        c.a(b, a);
    }

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }

    shedCallback(TextureViewImplementation textureviewimplementation, com.facebook.video.api.ishedCallback ishedcallback, int i)
    {
        c = textureviewimplementation;
        a = ishedcallback;
        b = i;
        super();
    }
}

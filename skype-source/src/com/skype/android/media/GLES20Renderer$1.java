// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.media:
//            GLES20Renderer

final class a
    implements Runnable
{

    final String a;
    final GLES20Renderer b;

    public final void run()
    {
        GLES20Renderer.a(b, a);
        GLES20Renderer.a(b).set(true);
    }

    (GLES20Renderer gles20renderer, String s)
    {
        b = gles20renderer;
        a = s;
        super();
    }
}

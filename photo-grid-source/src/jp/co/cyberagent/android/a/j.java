// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

final class j
    implements Runnable
{

    final int a;
    final float b[];
    final h c;

    j(h h, int i, float af[])
    {
        c = h;
        a = i;
        b = af;
        super();
    }

    public final void run()
    {
        GLES20.glUniform4fv(a, 1, FloatBuffer.wrap(b));
    }
}

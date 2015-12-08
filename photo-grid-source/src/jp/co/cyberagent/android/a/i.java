// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h

final class i
    implements Runnable
{

    final int a;
    final float b;
    final h c;

    i(h h, int j, float f)
    {
        c = h;
        a = j;
        b = f;
        super();
    }

    public final void run()
    {
        GLES20.glUniform1f(a, b);
    }
}

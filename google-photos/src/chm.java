// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;
import java.util.concurrent.Callable;

final class chm
    implements Callable
{

    private int a;
    private cie b;
    private cio c;
    private int d;

    chm(int i, cie cie1, cio cio1, int j)
    {
        a = i;
        b = cie1;
        c = cio1;
        d = j;
        super();
    }

    public final Object call()
    {
        if (a != 0)
        {
            GLES20.glEnable(3042);
        }
        a;
        JVM INSTR tableswitch 0 12: default 84
    //                   0 118
    //                   1 177
    //                   2 189
    //                   3 84
    //                   4 84
    //                   5 84
    //                   6 84
    //                   7 84
    //                   8 84
    //                   9 84
    //                   10 199
    //                   11 209
    //                   12 221;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L5 _L6 _L7
_L1:
        int i = a;
        throw new IllegalArgumentException((new StringBuilder(37)).append("Unhandled blend mode type:").append(i).toString());
_L2:
        GLES20.glDisable(3042);
_L9:
        cie cie1 = b;
        cie1.b();
        cie1.c.a(c, b);
        GLES20.glDrawArrays(d, 0, c.b);
        b.a();
        b.i("glDrawArrays");
        return null;
_L3:
        GLES20.glBlendFunc(770, 771);
        continue; /* Loop/switch isn't completed */
_L4:
        GLES20.glBlendFunc(770, 1);
        continue; /* Loop/switch isn't completed */
_L5:
        GLES20.glBlendFunc(1, 771);
        continue; /* Loop/switch isn't completed */
_L6:
        GLES20.glBlendFunc(774, 771);
        continue; /* Loop/switch isn't completed */
_L7:
        GLES20.glBlendFunc(1, 769);
        if (true) goto _L9; else goto _L8
_L8:
    }
}

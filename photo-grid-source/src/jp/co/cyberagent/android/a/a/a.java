// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a.a;


// Referenced classes of package jp.co.cyberagent.android.a.a:
//            b

public final class a
{

    public static final float a[] = {
        0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F
    };
    public static final float b[] = {
        1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F
    };
    public static final float c[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F
    };
    public static final float d[] = {
        0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F
    };

    private static float a(float f)
    {
        float f1 = 0.0F;
        if (f == 0.0F)
        {
            f1 = 1.0F;
        }
        return f1;
    }

    public static float[] a(int i, boolean flag, boolean flag1)
    {
        b.a[i - 1];
        JVM INSTR tableswitch 1 3: default 32
    //                   1 194
    //                   2 201
    //                   3 208;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_208;
_L1:
        float af[] = a;
_L5:
        if (flag)
        {
            float af1[] = new float[8];
            af1[0] = a(af[0]);
            af1[1] = af[1];
            af1[2] = a(af[2]);
            af1[3] = af[3];
            af1[4] = a(af[4]);
            af1[5] = af[5];
            af1[6] = a(af[6]);
            af1[7] = af[7];
            af = af1;
        }
        if (flag1)
        {
            return (new float[] {
                af[0], a(af[1]), af[2], a(af[3]), af[4], a(af[5]), af[6], a(af[7])
            });
        } else
        {
            return af;
        }
_L2:
        af = b;
          goto _L5
_L3:
        af = c;
          goto _L5
        af = d;
          goto _L5
    }

}

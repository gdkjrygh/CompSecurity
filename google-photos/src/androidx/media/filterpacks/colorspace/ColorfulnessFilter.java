// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.colorspace;

import ahn;
import ahs;
import ahu;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class ColorfulnessFilter extends ahn
{

    public ColorfulnessFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.b(200);
        return (new ajw()).a("histogram", 2, aif1).b("score", 2, aif.a(Float.TYPE)).a();
    }

    protected final void e()
    {
        Object obj = a("histogram").a().g();
        Object obj1 = ((ahu) (obj)).a(1);
        ((ByteBuffer) (obj1)).order(ByteOrder.nativeOrder());
        obj1 = ((ByteBuffer) (obj1)).asFloatBuffer();
        ((FloatBuffer) (obj1)).rewind();
        int l = ((ahu) (obj)).m();
        int i1 = ((ahu) (obj)).n();
        float af[] = new float[l];
        float f = 0.0F;
        for (int i = 0; i < i1; i++)
        {
            float f1 = (float)Math.pow(2D, i);
            for (int k = 0; k < l; k++)
            {
                float f3 = ((FloatBuffer) (obj1)).get() * f1;
                af[k] = af[k] + f3;
                f += f3;
            }

        }

        float f2 = 0.0F;
        for (int j = 0; j < l;)
        {
            float f5 = af[j] / f;
            float f4 = f2;
            if (f5 > 0.0F)
            {
                f4 = f2 - f5 * (float)Math.log(f5);
            }
            j++;
            f2 = f4;
        }

        f = (float)((double)f2 / Math.log(2D));
        ((ahu) (obj)).k();
        obj = b("score");
        obj1 = ((aju) (obj)).a(null).d();
        ((aig) (obj1)).a(Float.valueOf(f));
        ((aju) (obj)).a(((ahs) (obj1)));
    }
}

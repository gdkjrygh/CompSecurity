// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.LongSparseArray;
import java.util.ArrayList;

public final class bkw
    implements bjx
{

    private static final String b = bkw.getSimpleName();

    public bkw()
    {
    }

    private static float a(LongSparseArray longsparsearray)
    {
        float f = 0.0F;
        for (int i = 0; i < longsparsearray.size(); i++)
        {
            f += ((Float)longsparsearray.valueAt(i)).floatValue();
        }

        return f / (float)longsparsearray.size();
    }

    public final void a(cmb cmb1, cmi cmi1, cme cme1)
    {
        if (cmb1.a <= 0x19f0a0L)
        {
            cmi1 = b;
            long l = cmb1.a;
            Log.w(cmi1, (new StringBuilder(77)).append("Video duration was ").append(l).append(" us <= minimum ").append(0x19f0a0L).append(" us").toString());
        } else
        {
            long l1 = (cmb1.a - 0x19f0a0L) / 2L;
            cmi1 = cmi1.b(cos.f);
            if (cmi1.size() != 0)
            {
                float f2 = a(((LongSparseArray) (cmi1)));
                int k = -1;
                int j = -1;
                float f1 = 0.0F;
                float f = 0.0F;
                for (int i = 0; (float)i < (float)cmi1.size() * 0.3F; i++)
                {
                    f1 += ((Float)cmi1.valueAt(i)).floatValue();
                    f += ((Float)cmi1.valueAt(cmi1.size() - 1 - i)).floatValue();
                    float f3 = f1 / (float)(i + 1);
                    float f4 = f / (float)(i + 1);
                    float f5 = (1.0F - (float)i / (float)cmi1.size()) * f2;
                    if (f3 < f5)
                    {
                        k = i;
                    }
                    if (f4 < f5)
                    {
                        j = i;
                    }
                }

                ArrayList arraylist = new ArrayList(2);
                if (k >= 0)
                {
                    long l2 = Math.min(cmi1.keyAt(k), l1);
                    if (l2 > 0L)
                    {
                        arraylist.add(new cof(new cod(0L, l2), 3));
                    }
                }
                if (j >= 0)
                {
                    l1 = Math.max(cmi1.keyAt(cmi1.size() - 1 - j), cmb1.a - l1);
                    if (l1 < cmb1.a)
                    {
                        arraylist.add(new cof(new cod(l1, cmb1.a), 3));
                    }
                }
                cme1.a(3, arraylist);
                return;
            }
        }
    }

}

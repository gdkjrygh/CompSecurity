// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class bla
    implements bjx
{

    public bla()
    {
    }

    public final void a(cmb cmb, cmi cmi1, cme cme1)
    {
        cmb = cmi1.b(b.a(cmi1));
        Object obj;
        if (cmb.size() == 0)
        {
            cmb = Collections.emptyList();
        } else
        {
            blb blb1 = new blb(1000000F);
            ArrayList arraylist = new ArrayList();
            obj = new ArrayList();
            float f = 0.0F;
            float f1 = 0.0F;
            int j = 0;
            int i = 0;
            while (i < cmb.size()) 
            {
                long l2 = cmb.keyAt(i);
                float f2 = ((cxh)cmb.get(l2)).c();
                if (blb1.d)
                {
                    blb1.d = false;
                    blb1.b = f2;
                    blb1.c = l2 - 1L;
                }
                float f3 = l2 - blb1.c;
                f3 /= blb1.a + f3;
                f2 = (1.0F - f3) * blb1.b + f2 * f3;
                blb1.c = l2;
                blb1.b = f2;
                arraylist.add(Float.valueOf(f2));
                f1 += f2;
                f += f2 * f2;
                for (; l2 - cmb.keyAt(j) > 0x1e8480L; j++)
                {
                    f3 = ((Float)arraylist.get(j)).floatValue();
                    f1 -= f3;
                    f -= f3 * f3;
                }

                f3 = f1 / (float)(i - j);
                float f4 = (float)Math.sqrt(f / (float)(i - j));
                long l;
                if (((ArrayList) (obj)).isEmpty())
                {
                    l = l2 - 0x7a120L;
                } else
                {
                    l = ((Long)((ArrayList) (obj)).get(((ArrayList) (obj)).size() - 1)).longValue();
                }
                if (Math.abs(f2 - f3) > 2.0F * f4 && l2 - l >= 0x7a120L)
                {
                    ((ArrayList) (obj)).add(Long.valueOf(l2));
                }
                i++;
            }
            ((ArrayList) (obj)).add(Long.valueOf(cmb.keyAt(cmb.size() - 1)));
            long l1 = cmb.keyAt(0);
            cmb = new ArrayList();
            obj = ((ArrayList) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Long long1 = (Long)((Iterator) (obj)).next();
                cmb.add(new cod(l1, long1.longValue()));
                l1 = long1.longValue();
            }
        }
        obj = new ArrayList();
        cod cod1;
        for (cmb = cmb.iterator(); cmb.hasNext(); ((List) (obj)).add(new cof(cod1, cml.a(cmi1, cod1), 1)))
        {
            cod1 = (cod)cmb.next();
        }

        cme1.a(1, ((List) (obj)));
    }

    static 
    {
        bla.getSimpleName();
    }
}

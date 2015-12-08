// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

abstract class cmy extends cmz
{

    public cmy(float f, float f1, int i, cos cos)
    {
        super(0.0F, 1.0F, 10, cos);
    }

    protected final ArrayList b(cmi cmi1, long al[])
    {
        ArrayList arraylist = new ArrayList();
        int k = al.length;
        for (int i = 0; i < k; i++)
        {
            long l1 = al[i];
            cdx acdx[] = (cdx[])cmi1.a(a, l1);
            if (acdx == null)
            {
                continue;
            }
            int l = acdx.length;
            for (int j = 0; j < l; j++)
            {
                arraylist.add(Float.valueOf(acdx[j].c));
            }

        }

        return arraylist;
    }
}

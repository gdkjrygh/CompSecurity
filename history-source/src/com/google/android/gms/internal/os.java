// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            ov, or, jx

public class os
{
    public static class a
    {

        public final ov anb;
        public final or anc;
        public final ra.c and;

        private a(ov ov1, or or1)
        {
            anb = (ov)jx.i(ov1);
            anc = (or)jx.i(or1);
            and = null;
        }

    }


    private final ArrayList amZ;
    private int ana;

    public os()
    {
        this(100);
    }

    public os(int i)
    {
        amZ = new ArrayList();
        ana = i;
    }

    private void oq()
    {
        for (; getSize() > getCapacity(); amZ.remove(0)) { }
    }

    public void a(ov ov, or or)
    {
        amZ.add(new a(ov, or));
        oq();
    }

    public void clear()
    {
        amZ.clear();
    }

    public int getCapacity()
    {
        return ana;
    }

    public int getSize()
    {
        return amZ.size();
    }

    public boolean isEmpty()
    {
        return amZ.isEmpty();
    }

    public ArrayList op()
    {
        return amZ;
    }
}

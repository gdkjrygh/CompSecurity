// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.o;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            nm, ni

public class nj
{
    public static class a
    {

        public final nm akM;
        public final ni akN;
        public final pr.c akO;

        private a(nm nm1, ni ni1)
        {
            akM = (nm)o.i(nm1);
            akN = (ni)o.i(ni1);
            akO = null;
        }

    }


    private final ArrayList akK;
    private int akL;

    public nj()
    {
        this(100);
    }

    public nj(int i)
    {
        akK = new ArrayList();
        akL = i;
    }

    private void mX()
    {
        for (; getSize() > getCapacity(); akK.remove(0)) { }
    }

    public void a(nm nm, ni ni)
    {
        akK.add(new a(nm, ni));
        mX();
    }

    public void clear()
    {
        akK.clear();
    }

    public int getCapacity()
    {
        return akL;
    }

    public int getSize()
    {
        return akK.size();
    }

    public boolean isEmpty()
    {
        return akK.isEmpty();
    }

    public ArrayList mW()
    {
        return akK;
    }
}

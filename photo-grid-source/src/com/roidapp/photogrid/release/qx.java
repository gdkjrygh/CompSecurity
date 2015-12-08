// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            qz

public final class qx
{

    private static qx c = new qx();
    private ArrayList a;
    private ArrayList b;

    private qx()
    {
        a = new ArrayList();
        b = new ArrayList();
    }

    public static qx a()
    {
        if (c == null)
        {
            c = new qx();
        }
        return c;
    }

    public final qz a(int i)
    {
        return (qz)b.get(i);
    }

    public final void a(qz qz1)
    {
        b.add(qz1);
    }

    public final void a(String s)
    {
        a.add(s);
    }

    public final ArrayList b()
    {
        return a;
    }

    public final void b(qz qz1)
    {
        int i = b.indexOf(qz1);
        if (i >= 0 && i < b.size())
        {
            qz1 = ((qz)b.get(i)).K;
            int j = a.indexOf(qz1);
            a.remove(j);
            b.remove(i);
        }
    }

    public final void b(String s)
    {
        int i = a.indexOf(s);
        if (i >= 0)
        {
            a.remove(i);
            b.remove(i);
        }
    }

    public final int c(String s)
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            if (((qz)b.get(i)).K.equalsIgnoreCase(s))
            {
                return i;
            }
        }

        return -1;
    }

    public final boolean c()
    {
        return b.isEmpty();
    }

    public final void d()
    {
        b.clear();
        a.clear();
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class zzc
{

    protected final DataHolder a;
    protected int b;
    private int c;

    public zzc(DataHolder dataholder, int i)
    {
        a = (DataHolder)zzu.a(dataholder);
        a(i);
    }

    protected void a(int i)
    {
        boolean flag;
        if (i >= 0 && i < a.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag);
        b = i;
        c = a.a(b);
    }

    public boolean a(String s)
    {
        return a.a(s);
    }

    protected int b(String s)
    {
        return a.a(s, b, c);
    }

    protected boolean c(String s)
    {
        return a.c(s, b, c);
    }

    protected String d(String s)
    {
        return a.b(s, b, c);
    }

    protected float e(String s)
    {
        return a.d(s, b, c);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof zzc)
        {
            obj = (zzc)obj;
            flag = flag1;
            if (zzt.a(Integer.valueOf(((zzc) (obj)).b), Integer.valueOf(b)))
            {
                flag = flag1;
                if (zzt.a(Integer.valueOf(((zzc) (obj)).c), Integer.valueOf(c)))
                {
                    flag = flag1;
                    if (((zzc) (obj)).a == a)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected byte[] f(String s)
    {
        return a.e(s, b, c);
    }

    protected boolean g(String s)
    {
        return a.f(s, b, c);
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c), a
        });
    }
}

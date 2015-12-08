// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


public class a
    implements a
{

    private final Object a[];
    private int b;

    private boolean b(Object obj)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < b)
                {
                    if (a[i] != obj)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public Object a()
    {
        if (b > 0)
        {
            int i = b - 1;
            Object obj = a[i];
            a[i] = null;
            b = b - 1;
            return obj;
        } else
        {
            return null;
        }
    }

    public boolean a(Object obj)
    {
        if (b(obj))
        {
            throw new IllegalStateException("Already in the pool!");
        }
        if (b < a.length)
        {
            a[b] = obj;
            b = b + 1;
            return true;
        } else
        {
            return false;
        }
    }

    public (int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else
        {
            a = new Object[i];
            return;
        }
    }
}

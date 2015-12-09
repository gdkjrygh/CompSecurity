// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import android.content.Context;
import android.content.res.Resources;
import com.fitbit.util.al;
import java.util.List;

public class g
{

    public static final int a = 3;
    private Context b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public g(Context context)
    {
        c = 3;
        d = 0;
        e = 0;
        f = 0;
        g = 1;
        b = context;
    }

    public g(Context context, int i)
    {
        c = 3;
        d = 0;
        e = 0;
        f = 0;
        g = 1;
        b = context;
        c = i;
    }

    private String a(List list, int i)
    {
        list = ((List) (list.get(i)));
        if (list != null)
        {
            return a(list);
        } else
        {
            return "";
        }
    }

    protected String a(Object obj)
    {
        return obj.toString();
    }

    public String a(List list)
    {
        String s;
        int j;
label0:
        {
            String s1 = "";
            s = s1;
            if (list != null)
            {
                j = list.size();
                s = s1;
                if (j > 0)
                {
                    String s2 = a(list, 0);
                    s = s2;
                    if (j > 1)
                    {
                        int k = Math.min(c, j - g);
                        s = s2;
                        int i;
                        for (i = 1; i < k; i++)
                        {
                            String s3 = a(list, i);
                            s = b.getResources().getString(d, new Object[] {
                                s, s3
                            });
                        }

                        j -= k;
                        if (j != 1)
                        {
                            break label0;
                        }
                        list = a(list, i);
                        s = b.getResources().getString(e, new Object[] {
                            s, list
                        });
                    }
                }
            }
            return s;
        }
        list = al.a(f, j, new Object[] {
            Integer.valueOf(j)
        });
        return b.getResources().getString(e, new Object[] {
            s, list
        });
    }

    public void a(int i)
    {
        g = i;
    }

    public void b(int i)
    {
        c = i;
    }

    public int c()
    {
        return g;
    }

    public void c(int i)
    {
        d = i;
    }

    public Context d()
    {
        return b;
    }

    public void d(int i)
    {
        e = i;
    }

    public int e()
    {
        return c;
    }

    public void e(int i)
    {
        f = i;
    }

    public int f()
    {
        return d;
    }

    public int g()
    {
        return e;
    }

    public int h()
    {
        return f;
    }
}

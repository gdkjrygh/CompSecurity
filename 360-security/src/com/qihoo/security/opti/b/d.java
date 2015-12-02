// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.b;

import android.content.Context;
import android.content.res.Resources;
import com.qihoo.security.opti.trashclear.ui.mainpage.PartionsController;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class d
{

    public static int a(Context context)
    {
        context = PartionsController.a(context);
        long l2;
        long l3;
        if (context != null)
        {
            context = context.iterator();
            long l = 0L;
            long l1 = 0L;
            do
            {
                l3 = l;
                l2 = l1;
                if (!context.hasNext())
                {
                    break;
                }
                com.qihoo.security.opti.trashclear.ui.mainpage.PartionsController.a a1 = (com.qihoo.security.opti.trashclear.ui.mainpage.PartionsController.a)context.next();
                l1 += a1.c;
                l = a1.c() + l;
            } while (true);
        } else
        {
            l3 = 0L;
            l2 = 0L;
        }
        if (l2 > 0L && l3 > 0L)
        {
            return (int)((100L * l3) / l2);
        } else
        {
            return 0;
        }
    }

    public static String a(Context context, long l)
    {
        float f1 = l;
        int i = 0x7f0c01e5;
        float f = f1;
        if (f1 > 1024F)
        {
            i = 0x7f0c01e6;
            f = f1 / 1024F;
        }
        f1 = f;
        if (f > 1024F)
        {
            i = 0x7f0c01e7;
            f1 = f / 1024F;
        }
        f = f1;
        if (f1 > 1024F)
        {
            i = 0x7f0c01e8;
            f = f1 / 1024F;
        }
        f1 = f;
        if (f > 1024F)
        {
            i = 0x7f0c01e9;
            f1 = f / 1024F;
        }
        f = f1;
        if (f1 > 1024F)
        {
            i = 0x7f0c01ea;
            f = f1 / 1024F;
        }
        return (new StringBuilder()).append((int)f).append(context.getResources().getString(i)).append("+").toString();
    }

    public static String a(Context context, long l, boolean flag)
    {
        if (context == null || l <= 0L)
        {
            return context.getResources().getString(0x7f0c01eb, new Object[] {
                Integer.valueOf(0), context.getString(0x7f0c01e7)
            });
        }
        float f1 = l;
        int i = 0x7f0c01e5;
        float f = f1;
        if (f1 > 900F)
        {
            i = 0x7f0c01e6;
            f = f1 / 1024F;
        }
        f1 = f;
        if (f > 900F)
        {
            i = 0x7f0c01e7;
            f1 = f / 1024F;
        }
        f = f1;
        if (f1 > 900F)
        {
            i = 0x7f0c01e8;
            f = f1 / 1024F;
        }
        f1 = f;
        if (f > 900F)
        {
            i = 0x7f0c01e9;
            f1 = f / 1024F;
        }
        String s;
        String s1;
        if (f1 > 900F)
        {
            f = f1 / 1024F;
            i = 0x7f0c01ea;
        } else
        {
            f = f1;
        }
        if (f < 1.0F)
        {
            s = String.format(Locale.US, "%.2f", new Object[] {
                Float.valueOf(f)
            });
        } else
        if (f < 10F)
        {
            s = String.format(Locale.US, "%.2f", new Object[] {
                Float.valueOf(f)
            });
        } else
        if (f < 100F)
        {
            s = String.format(Locale.US, "%.1f", new Object[] {
                Float.valueOf(f)
            });
        } else
        {
            s = String.format(Locale.US, "%.0f", new Object[] {
                Float.valueOf(f)
            });
        }
        s1 = s;
        if (flag)
        {
            s1 = a(s);
        }
        return context.getResources().getString(0x7f0c01eb, new Object[] {
            s1, context.getString(i)
        });
    }

    private static String a(String s)
    {
        String s1 = s;
        if (s.indexOf(".") > 0)
        {
            s1 = s.replaceAll("0+?$", "").replaceAll("[.]$", "");
        }
        return s1;
    }

    public static long b(Context context)
    {
        context = PartionsController.a(context);
        long l1;
        if (context != null)
        {
            context = context.iterator();
            long l = 0L;
            do
            {
                l1 = l;
                if (!context.hasNext())
                {
                    break;
                }
                l = ((com.qihoo.security.opti.trashclear.ui.mainpage.PartionsController.a)context.next()).c() + l;
            } while (true);
        } else
        {
            l1 = 0L;
        }
        return l1;
    }
}

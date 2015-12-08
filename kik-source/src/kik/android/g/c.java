// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.g;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.Vector;
import kik.a.d.a.a;
import kik.a.d.a.d;
import kik.a.d.a.g;
import kik.a.d.f;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.d.s;
import kik.a.e.r;
import kik.android.util.ae;
import kik.android.util.cq;

public final class c
{

    public static int a(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "0";
        }
        return (int)Long.parseLong(s2, 16);
    }

    public static String a(Context context, r r1, List list)
    {
        if (list == null || list.size() == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < 4 && i < list.size(); i++)
        {
            f f1 = (f)list.get(i);
            if (f1 != null)
            {
                stringbuilder.append(a(context, r1, r1.a(f1.b(), true), true, -1)).append(", ");
            }
        }

        if (stringbuilder.length() > 1)
        {
            stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length(), "");
        }
        if (list.size() > 4)
        {
            stringbuilder.append("...");
        }
        return stringbuilder.toString();
    }

    public static String a(Context context, r r1, k k1, boolean flag, int i)
    {
        Object obj;
        String s1;
        s1 = context.getString(0x7f090202);
        obj = s1;
        if (k1 == null) goto _L2; else goto _L1
_L1:
        obj = s1;
        if (k1.g()) goto _L2; else goto _L3
_L3:
        if (!(k1 instanceof n)) goto _L5; else goto _L4
_L4:
        context = ((n)k1).w();
        if (k1.c() != null) goto _L7; else goto _L6
_L6:
        obj = cq.a(context, r1, i);
_L2:
        return ((String) (obj));
_L7:
        return k1.c();
_L5:
        if (k1.c() == null)
        {
            context = context.getString(0x7f090202);
        } else
        {
            context = k1.c();
        }
        obj = context;
        if (flag)
        {
            return cq.b(context);
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public static String a(s s1, Context context)
    {
_L2:
        int j = 0;
        int i = -1;
        int l;
        do
        {
            l = i;
            if (j >= 10)
            {
                break;
            }
            l = i;
            if (s1 == null)
            {
                break;
            }
            i = s1.indexOf(' ', i + 1);
            l = i;
            if (i == -1)
            {
                break;
            }
            j++;
        } while (true);
        Object obj = s1;
        if (l != -1)
        {
            obj = (new StringBuilder()).append(s1.substring(0, l)).append("...").toString();
        }
        if (flag)
        {
            return context.getString(0x7f090188);
        }
        if (a1 != null)
        {
            return context.getString(0x7f090186, new Object[] {
                ae.a(a1)
            });
        } else
        {
            return ((String) (obj));
        }
        a a1 = (a)g.a(s1, kik/a/d/a/a);
        boolean flag;
        if (a1 != null && ("com.kik.ext.camera".equals(a1.u()) || "com.kik.ext.gallery".equals(a1.u())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s1 != null)
        {
            if (!cq.c(s1.a()))
            {
                s1 = s1.a();
                break MISSING_BLOCK_LABEL_60;
            }
            if (s1.l() != null && s1.l().size() > 0)
            {
                s1 = (d)g.a(s1, kik/a/d/a/d);
                if (s1 != null)
                {
                    s1 = s1.e();
                    continue; /* Loop/switch isn't completed */
                }
            }
        }
        s1 = "";
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(Context context)
    {
        if (context == null)
        {
            return false;
        }
        try
        {
            context.getPackageManager().getPackageInfo("com.google.android.wearable.app", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }
}

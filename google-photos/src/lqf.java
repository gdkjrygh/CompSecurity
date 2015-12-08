// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public class lqf
{

    private static String a;
    private static Map b = new HashMap();

    public lqf()
    {
    }

    public static String a(Context context, String s)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        lqf;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        context = context.getSharedPreferences("gtm_install_referrer", 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a = context.getString("referrer", "");
_L3:
        lqf;
        JVM INSTR monitorexit ;
_L2:
        return a(a, s);
        a = "";
          goto _L3
        context;
        lqf;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static String a(Context context, String s, String s1)
    {
        String s2 = (String)b.get(s);
        Object obj = s2;
        if (s2 == null)
        {
            context = context.getSharedPreferences("gtm_click_referrers", 0);
            if (context != null)
            {
                context = context.getString(s, "");
            } else
            {
                context = "";
            }
            b.put(s, context);
            obj = context;
        }
        return a(((String) (obj)), s1);
    }

    private static String a(String s, String s1)
    {
        if (s1 == null)
        {
            if (s.length() > 0)
            {
                return s;
            } else
            {
                return null;
            }
        } else
        {
            return Uri.parse((new StringBuilder("http://hostname/?")).append(s).toString()).getQueryParameter(s1);
        }
    }

    public static void b(Context context, String s)
    {
        String s1 = a(s, "conv");
        if (s1 != null && s1.length() > 0)
        {
            b.put(s1, s);
            b.a(context, "gtm_click_referrers", s1, s);
        }
    }

}

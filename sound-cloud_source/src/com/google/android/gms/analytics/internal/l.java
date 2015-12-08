// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.gms.b.ao;
import com.google.android.gms.common.internal.zzx;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            g

public final class l
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static long a(String s)
    {
        if (s == null)
        {
            return 0L;
        }
        long l1;
        try
        {
            l1 = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l1;
    }

    public static ao a(g g1, String s)
    {
        zzx.zzv(g1);
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        try
        {
            s = URLEncodedUtils.parse(new URI((new StringBuilder("?")).append(s).toString()), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            g1.c("No valid campaign data found", s);
            return null;
        }
        g1 = new HashMap(s.size());
        NameValuePair namevaluepair;
        for (s = s.iterator(); s.hasNext(); g1.put(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)s.next();
        }

        s = new ao();
        s.e = (String)g1.get("utm_content");
        s.c = (String)g1.get("utm_medium");
        s.a = (String)g1.get("utm_campaign");
        s.b = (String)g1.get("utm_source");
        s.d = (String)g1.get("utm_term");
        s.f = (String)g1.get("utm_id");
        s.g = (String)g1.get("anid");
        s.h = (String)g1.get("gclid");
        s.i = (String)g1.get("dclid");
        s.j = (String)g1.get("aclid");
        return s;
    }

    public static String a(Locale locale)
    {
        String s;
        if (locale != null)
        {
            if (!TextUtils.isEmpty(s = locale.getLanguage()))
            {
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append(s.toLowerCase());
                if (!TextUtils.isEmpty(locale.getCountry()))
                {
                    stringbuilder.append("-").append(locale.getCountry().toLowerCase());
                }
                return stringbuilder.toString();
            }
        }
        return null;
    }

    public static void a(Map map, String s, String s1)
    {
        if (s1 != null && !map.containsKey(s))
        {
            map.put(s, s1);
        }
    }

    public static boolean a(double d, String s)
    {
        boolean flag = true;
        if (d > 0.0D && d < 100D) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        int k;
        if (!TextUtils.isEmpty(s))
        {
            int j = s.length() - 1;
            int i = 0;
            do
            {
                k = i;
                if (j < 0)
                {
                    continue; /* Loop/switch isn't completed */
                }
                k = s.charAt(j);
                k = (i << 6 & 0xfffffff) + k + (k << 14);
                int i1 = 0xfe00000 & k;
                i = k;
                if (i1 != 0)
                {
                    i = k ^ i1 >> 21;
                }
                j--;
            } while (true);
        }
        k = 1;
        if ((double)(k % 10000) >= 100D * d) goto _L4; else goto _L3
_L3:
        return false;
    }

    public static boolean a(Context context, Class class1)
    {
        context = context.getPackageManager().getServiceInfo(new ComponentName(context, class1), 4);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        boolean flag = ((ServiceInfo) (context)).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_34;
        context;
        return false;
    }

    public static boolean a(Context context, Class class1, boolean flag)
    {
        context = context.getPackageManager().getReceiverInfo(new ComponentName(context, class1), 2);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (!((ActivityInfo) (context)).enabled)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        flag = ((ActivityInfo) (context)).exported;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        return true;
        context;
        return false;
    }

    public static MessageDigest b(String s)
    {
        int i = 0;
_L3:
        if (i >= 2) goto _L2; else goto _L1
_L1:
        MessageDigest messagedigest = MessageDigest.getInstance(s);
        if (messagedigest != null)
        {
            return messagedigest;
        }
        continue; /* Loop/switch isn't completed */
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        i++;
          goto _L3
_L2:
        return null;
    }

    public static boolean c(String s)
    {
        while (TextUtils.isEmpty(s) || !s.startsWith("http:")) 
        {
            return true;
        }
        return false;
    }

}

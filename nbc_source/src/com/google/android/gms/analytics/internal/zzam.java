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
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzny;
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
//            zzaf

public class zzam
{

    private static final char zzMK[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static double zza(String s, double d)
    {
        if (s == null)
        {
            return d;
        }
        double d1;
        try
        {
            d1 = Double.parseDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return d;
        }
        return d1;
    }

    public static zzny zza(zzaf zzaf1, String s)
    {
        zzu.zzu(zzaf1);
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        try
        {
            s = URLEncodedUtils.parse(new URI((new StringBuilder()).append("?").append(s).toString()), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzaf1.zzd("No valid campaign data found", s);
            return null;
        }
        zzaf1 = new HashMap(s.size());
        NameValuePair namevaluepair;
        for (s = s.iterator(); s.hasNext(); zzaf1.put(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)s.next();
        }

        s = new zzny();
        s.zzdA((String)zzaf1.get("utm_content"));
        s.zzdy((String)zzaf1.get("utm_medium"));
        s.setName((String)zzaf1.get("utm_campaign"));
        s.zzdx((String)zzaf1.get("utm_source"));
        s.zzdz((String)zzaf1.get("utm_term"));
        s.zzdB((String)zzaf1.get("utm_id"));
        s.zzdC((String)zzaf1.get("anid"));
        s.zzdD((String)zzaf1.get("gclid"));
        s.zzdE((String)zzaf1.get("dclid"));
        s.zzdF((String)zzaf1.get("aclid"));
        return s;
    }

    public static String zza(Locale locale)
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

    public static void zza(Map map, String s, Map map1)
    {
        zzb(map, s, (String)map1.get(s));
    }

    public static boolean zza(double d, String s)
    {
        while (d <= 0.0D || d >= 100D || (double)(zzbm(s) % 10000) < 100D * d) 
        {
            return false;
        }
        return true;
    }

    public static boolean zza(Context context, Class class1)
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

    public static boolean zza(Context context, Class class1, boolean flag)
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

    public static void zzb(Map map, String s, String s1)
    {
        if (s1 != null && !map.containsKey(s))
        {
            map.put(s, s1);
        }
    }

    public static void zzb(Map map, String s, boolean flag)
    {
        if (!map.containsKey(s))
        {
            String s1;
            if (flag)
            {
                s1 = "1";
            } else
            {
                s1 = "0";
            }
            map.put(s, s1);
        }
    }

    public static long zzbj(String s)
    {
        if (s == null)
        {
            return 0L;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l;
    }

    public static MessageDigest zzbl(String s)
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

    public static int zzbm(String s)
    {
        int k = 1;
        if (!TextUtils.isEmpty(s))
        {
            int j = s.length();
            int i = 0;
            j--;
            do
            {
                k = i;
                if (j < 0)
                {
                    break;
                }
                k = s.charAt(j);
                k = (i << 6 & 0xfffffff) + k + (k << 14);
                int l = 0xfe00000 & k;
                i = k;
                if (l != 0)
                {
                    i = k ^ l >> 21;
                }
                j--;
            } while (true);
        }
        return k;
    }

    public static boolean zzbn(String s)
    {
        while (TextUtils.isEmpty(s) || !s.startsWith("http:")) 
        {
            return true;
        }
        return false;
    }

    public static void zzc(Map map, String s, String s1)
    {
        if (s1 != null && TextUtils.isEmpty((CharSequence)map.get(s)))
        {
            map.put(s, s1);
        }
    }

    public static boolean zze(String s, boolean flag)
    {
        boolean flag1 = flag;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.equalsIgnoreCase("true") && !s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("1")) goto _L4; else goto _L3
_L3:
        flag1 = true;
_L2:
        return flag1;
_L4:
        if (s.equalsIgnoreCase("false") || s.equalsIgnoreCase("no"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        if (!s.equalsIgnoreCase("0")) goto _L2; else goto _L5
_L5:
        return false;
    }

}

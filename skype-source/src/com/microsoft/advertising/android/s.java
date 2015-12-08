// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.microsoft.advertising.android:
//            af, u, av

final class s
{

    private static final Map a = new TreeMap() {

            
            {
                put("AdSdkTest?", "http://adsmockarc.azurewebsites.net/v3/Delivery/Placement");
                put("AdSdkSi?", "https://mobileads.si.msn-int.com/v3/Delivery/Placement");
                put("AdSdkLocal?", "http://localhost:8990/v3/Delivery/Placement");
            }
    };

    public static final String a(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return "https://mobileads.msn.com:443/v3/Delivery/Placement";
        }
        Iterator iterator = a.keySet().iterator();
        String s2;
        do
        {
            if (!iterator.hasNext())
            {
                return "https://mobileads.msn.com:443/v3/Delivery/Placement";
            }
            s2 = (String)iterator.next();
        } while (!s1.startsWith(s2));
        return (String)a.get(s2);
    }

    public static void a(StringBuilder stringbuilder, u u1, String s1)
    {
        if (af.a(new Object[] {
    u1, s1
}))
        {
            a(stringbuilder, u1.a(), s1);
        }
    }

    public static void a(StringBuilder stringbuilder, String s1)
    {
        stringbuilder.append(URLEncoder.encode(u.r.a(), "UTF-8"));
        stringbuilder.append("=");
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s1 = "";
_L5:
        String s2;
        Iterator iterator;
        try
        {
            stringbuilder.append(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            av.c("ArcClient", stringbuilder.toString());
        }
        break MISSING_BLOCK_LABEL_120;
_L2:
        if (!TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        s2 = s1;
_L7:
        s1 = URLEncoder.encode(s2, "UTF-8");
          goto _L5
_L4:
        iterator = a.keySet().iterator();
_L9:
        s2 = s1;
        if (!iterator.hasNext()) goto _L7; else goto _L6
_L6:
        s2 = (String)iterator.next();
        if (!s1.startsWith(s2)) goto _L9; else goto _L8
_L8:
        s2 = s1.replace(s2, "");
          goto _L7
    }

    public static void a(StringBuilder stringbuilder, String s1, String s2)
    {
        if (!af.a(new Object[] {
    s1, s2
}))
        {
            return;
        }
        try
        {
            stringbuilder.append("&");
            stringbuilder.append(URLEncoder.encode(s1, "UTF-8"));
            stringbuilder.append("=");
            stringbuilder.append(URLEncoder.encode(s2, "UTF-8"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            av.a("ArcClient", stringbuilder.getMessage(), stringbuilder);
        }
    }

}

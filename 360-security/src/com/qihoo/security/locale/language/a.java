// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.language;

import android.content.Context;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.LocaleInfo;
import com.qihoo.security.locale.d;
import com.qihoo360.common.utils.SecurityUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.util.HashMap;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

public class a
{

    public static String a;
    private static final String b[] = {
        "download", "downloading", "switch", "failed", "notice"
    };
    private static a f;
    private final Context c = SecurityApplication.a();
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();

    private a(String s)
    {
        a = s;
        String s2 = SharedPref.b(c, (new StringBuilder()).append("key_language_text_").append(a).append("1.0.8").toString(), null);
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = s2;
            if (!TextUtils.isEmpty(s))
            {
                s1 = s2;
                if (s.length() >= 2)
                {
                    s = s.substring(0, 2);
                    s1 = SharedPref.b(c, (new StringBuilder()).append("key_language_text_").append(s).append("1.0.8").toString(), null);
                    a = s;
                }
            }
        }
        if (!TextUtils.isEmpty(s1))
        {
            c(s1);
        }
    }

    public static a a(String s)
    {
        if (TextUtils.isEmpty(a) || !a.equals(s))
        {
            f = new a(s);
        }
        return f;
    }

    private HashMap a(JSONObject jsonobject, String s)
    {
        s = new HashMap();
        if (jsonobject != null)
        {
            s.put("title", jsonobject.optString("title"));
            s.put("message", jsonobject.optString("message"));
            s.put("more", jsonobject.optString("more"));
            s.put("ok", jsonobject.optString("ok"));
            s.put("cancel", jsonobject.optString("cancel"));
        }
        return s;
    }

    private void c(String s)
    {
        JSONObject jsonobject;
        String as[];
        String s1;
        JSONObject jsonobject1;
        int i;
        int j;
        try
        {
            s = new JSONObject(s);
            jsonobject = new JSONObject(new String(Base64.decodeBase64(s.optString("scene").getBytes())));
            as = b;
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = as[i];
        jsonobject1 = jsonobject.optJSONObject(s1);
        d.put(s1, a(jsonobject1, s1));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_47;
_L1:
        s = s.optJSONObject("lang_pkg");
        e.put("pkg_link", s.optString("pkg_link"));
        e.put("pkg_md5", s.optString("pkg_md5"));
        e.put("pkg_size", s.optString("pkg_size"));
        return;
    }

    public LocaleInfo a()
    {
        LocaleInfo localeinfo = new LocaleInfo(a);
        localeinfo.url = b("pkg_link");
        localeinfo.md5 = b("pkg_md5");
        localeinfo.size = Utils.str2Long(b("pkg_size"), 0L);
        return localeinfo;
    }

    public String b(String s)
    {
        return (String)e.get(s);
    }

    public boolean b()
    {
        LocaleInfo localeinfo = a();
        File file;
        if (!TextUtils.isEmpty(localeinfo.md5) && !TextUtils.isEmpty(localeinfo.url))
        {
            if ((file = com.qihoo.security.locale.d.a().e()) != null)
            {
                file = new File(file.getAbsolutePath(), (new StringBuilder()).append(localeinfo.md5).append(".apk").toString());
                String s1 = file.getAbsolutePath();
                if (file.exists())
                {
                    String s = SecurityUtil.getFileMD5(s1);
                    if (!TextUtils.isEmpty(s) && s.equals(localeinfo.md5))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class agn
{

    private static final Pattern a = Pattern.compile("[0-9a-f]+", 2);

    public static Boolean a()
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        return Boolean.valueOf(false);
    }

    public static Boolean a(WeakReference weakreference)
    {
        weakreference = (Activity)weakreference.get();
        if (weakreference != null)
        {
            weakreference = weakreference.getResources().getConfiguration();
            boolean flag;
            if ((((Configuration) (weakreference)).screenLayout & 0xf) == 3 || (((Configuration) (weakreference)).screenLayout & 0xf) == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public static String a(String s)
    {
        try
        {
            s = URLEncoder.encode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        return s;
    }

    public static final boolean b(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 8) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(s) || !Patterns.EMAIL_ADDRESS.matcher(s).matches()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static String c(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("App ID must not be null.");
        }
        s = s.trim();
        Matcher matcher = a.matcher(s);
        if (s.length() != 32)
        {
            throw new IllegalArgumentException("App ID length must be 32 characters.");
        }
        if (!matcher.matches())
        {
            throw new IllegalArgumentException("App ID must match regex pattern /[0-9a-f]+/i");
        } else
        {
            return s;
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.c;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package android_src.c:
//            b

public final class d
    implements b
{

    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    public static final Pattern d = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");
    public static final Pattern e = Pattern.compile("\\s*\"([^\"]*)\"\\s*");

    public d()
    {
    }

    public static String a(String s)
    {
        Matcher matcher = d.matcher(s);
        if (matcher.matches())
        {
            s = matcher.group(2);
        }
        return s;
    }

    public static boolean b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            s = a(s);
            return Patterns.EMAIL_ADDRESS.matcher(s).matches();
        }
    }

    static 
    {
        a = Uri.parse("content://mms");
        b = Uri.withAppendedPath(a, "report-request");
        c = Uri.withAppendedPath(a, "report-status");
    }
}

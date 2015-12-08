// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fko
{

    private static final Pattern a = Pattern.compile("user:([^:]+)");

    public static String a(String s)
    {
        return (new StringBuilder("spotify:user:")).append(Uri.encode(s)).append(":followers").toString();
    }

    public static String b(String s)
    {
        return (new StringBuilder("spotify:user:")).append(Uri.encode(s)).append(":following").toString();
    }

    public static String c(String s)
    {
        s = a.matcher(s);
        if (s.find())
        {
            return s.group(1);
        } else
        {
            return null;
        }
    }

    public static String d(String s)
    {
        return e((new StringBuilder("spotify:user:")).append(Uri.encode(s)).toString());
    }

    public static String e(String s)
    {
        return (new StringBuilder()).append(s).append(":playlists").toString();
    }

    public static String f(String s)
    {
        return (new StringBuilder()).append(s).append(":artists").toString();
    }

    public static String g(String s)
    {
        return (new StringBuilder()).append(s).append(":invitationcodes").toString();
    }

}

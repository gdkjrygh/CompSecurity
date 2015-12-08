// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fpg
{

    public fpg()
    {
    }

    public static String a(String s, String s1)
    {
label0:
        {
            Object obj = Pattern.compile("https?://.*").matcher(s);
            s = s1;
            if (!((Matcher) (obj)).find())
            {
                break label0;
            }
            obj = ((Matcher) (obj)).group();
            String s2 = Uri.parse(((String) (obj))).getHost();
            if (!"spotify.com".equals(s2))
            {
                s = s1;
                if (!"www.spotify.com".equals(s2))
                {
                    break label0;
                }
            }
            s = ((String) (obj));
        }
        return s;
    }
}

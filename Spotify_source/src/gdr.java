// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;
import java.util.HashMap;
import java.util.Map;

public final class gdr
{

    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public static void a(String s, String s1)
    {
        Assertion.a(s.startsWith("spotify:genre:"), "The given uri is not a spotify genre uri!");
        s = s.substring(14);
        a.put(s, s1);
    }

    public static void b(String s, String s1)
    {
        Assertion.a(s.startsWith("spotify:genre:"), "The given uri is not a spotify genre uri!");
        s = s.substring(14);
        b.put(s, s1);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.TextAlignment;
import java.util.Hashtable;

public final class atl
{

    public static awf a(String s, String s1, String s2, TextAlignment textalignment, Integer integer)
    {
        awf awf1 = new awf();
        awf1.a(integer);
        awf1.a(s);
        awf1.b(s1);
        awf1.b.remove("statusBar");
        if (s2 != null)
        {
            awf1.b.put("mediaClock", s2);
        } else
        {
            awf1.b.remove("mediaClock");
        }
        awf1.b.remove("mediaTrack");
        awf1.a(textalignment);
        return awf1;
    }
}

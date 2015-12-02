// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.alibaba.akita.net.io.TrackListener;
import java.util.HashMap;
import java.util.Map;

class ang.Object
    implements TrackListener
{

    final abd a;

    public void networkProfile(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, String s11, String s12, String s13, 
            String s14)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("api", s);
        hashmap.put("spdyconntime", s1);
        hashmap.put("spdytranstime", s2);
        hashmap.put("httptime", s3);
        hashmap.put("downgrade", s4);
        hashmap.put("downgradeerr", s5);
        hashmap.put("speed", s6);
        hashmap.put("reqsize", s7);
        hashmap.put("respsize", s8);
        hashmap.put("dnstime", s9);
        hashmap.put("ab", s10);
        hashmap.put("rid", s11);
        hashmap.put("errcode", s12);
        hashmap.put("ssl", s13);
        s = s14;
        if (s14 == null)
        {
            s = "null";
        }
        hashmap.put("ip", s);
        lw.c("worker", (new StringBuilder()).append("NetworkProfile:").append(hashmap.toString()).toString(), new Object[0]);
        ky.a("NetworkProfile", hashmap);
    }

    (abd abd1)
    {
        a = abd1;
        super();
    }
}

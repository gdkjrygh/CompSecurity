// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

final class ang.Object
    implements Runnable
{

    private String a;
    private String b;
    private int c;
    private cdz d;

    public final void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheComplete");
        hashmap.put("src", a);
        hashmap.put("cachedSrc", b);
        hashmap.put("totalBytes", Integer.toString(c));
        d.a.a("onPrecacheEvent", hashmap);
    }

    (cdz cdz1, String s, String s1, int i)
    {
        d = cdz1;
        a = s;
        b = s1;
        c = i;
        super();
    }
}

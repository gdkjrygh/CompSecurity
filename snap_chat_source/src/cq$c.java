// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

static final class lang.String
{

    private static final Map a;

    public static lang.String a(String s)
    {
        return (lang.Object)a.get(s);
    }

    static 
    {
        HashMap hashmap = new HashMap(9);
        a = hashmap;
        hashmap.put("xx-small", new <init>(0.694F, .g));
        a.put("x-small", new <init>(0.833F, .g));
        a.put("small", new <init>(10F, .g));
        a.put("medium", new <init>(12F, .g));
        a.put("large", new <init>(14.4F, .g));
        a.put("x-large", new <init>(17.3F, .g));
        a.put("xx-large", new <init>(20.7F, .g));
        a.put("smaller", new <init>(83.33F, .i));
        a.put("larger", new <init>(120F, .i));
    }
}

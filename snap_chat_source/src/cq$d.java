// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

static final class lang.Integer
{

    private static final Map a;

    public static Integer a(String s)
    {
        return (Integer)a.get(s);
    }

    static 
    {
        HashMap hashmap = new HashMap(13);
        a = hashmap;
        hashmap.put("normal", Integer.valueOf(400));
        a.put("bold", Integer.valueOf(700));
        a.put("bolder", Integer.valueOf(1));
        a.put("lighter", Integer.valueOf(-1));
        a.put("100", Integer.valueOf(100));
        a.put("200", Integer.valueOf(200));
        a.put("300", Integer.valueOf(300));
        a.put("400", Integer.valueOf(400));
        a.put("500", Integer.valueOf(500));
        a.put("600", Integer.valueOf(600));
        a.put("700", Integer.valueOf(700));
        a.put("800", Integer.valueOf(800));
        a.put("900", Integer.valueOf(900));
    }
}

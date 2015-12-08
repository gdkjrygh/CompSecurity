// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;

import com.devicecollector.collectors.CollectorEnum;
import com.devicecollector.collectors.SoftErrorCode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DataCollection
{

    private final String a;
    private final String b;
    private String c;
    private final String d;
    private HashMap e;
    private HashMap f;

    public DataCollection(String s, String s1, String s2)
    {
        d = s;
        a = s1;
        b = s2;
        e = new HashMap();
        f = new HashMap();
    }

    public String a()
    {
        return a;
    }

    public void a(PostElement postelement, String s)
    {
        this;
        JVM INSTR monitorenter ;
        e.put(postelement, s);
        this;
        JVM INSTR monitorexit ;
        return;
        postelement;
        throw postelement;
    }

    public void a(CollectorEnum collectorenum, SoftErrorCode softerrorcode)
    {
        this;
        JVM INSTR monitorenter ;
        f.put(collectorenum, softerrorcode);
        this;
        JVM INSTR monitorexit ;
        return;
        collectorenum;
        throw collectorenum;
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        c = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        this;
        JVM INSTR monitorenter ;
        String s = d;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public HashMap e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new HashMap();
        ((HashMap) (obj)).put(PostElement.m.a(), a);
        ((HashMap) (obj)).put(PostElement.n.a(), b);
        PostElement postelement;
        for (Iterator iterator = e.keySet().iterator(); iterator.hasNext(); ((HashMap) (obj)).put(postelement.a(), e.get(postelement)))
        {
            postelement = (PostElement)iterator.next();
        }

        break MISSING_BLOCK_LABEL_97;
        obj;
        throw obj;
        StringBuilder stringbuilder;
        if (f.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        stringbuilder = new StringBuilder("{");
        CollectorEnum collectorenum;
        for (Iterator iterator1 = f.keySet().iterator(); iterator1.hasNext(); stringbuilder.append((new StringBuilder()).append("\"").append(collectorenum.a()).append("\":").append("\"").append(((SoftErrorCode)f.get(collectorenum)).a()).append("\", ").toString()))
        {
            collectorenum = (CollectorEnum)iterator1.next();
        }

        stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length() - 1, "}");
        ((HashMap) (obj)).put(PostElement.l.a(), stringbuilder.toString());
        this;
        JVM INSTR monitorexit ;
        return ((HashMap) (obj));
    }

    private class PostElement extends Enum
    {

        public static final PostElement a;
        public static final PostElement b;
        public static final PostElement c;
        public static final PostElement d;
        public static final PostElement e;
        public static final PostElement f;
        public static final PostElement g;
        public static final PostElement h;
        public static final PostElement i;
        public static final PostElement j;
        public static final PostElement k;
        public static final PostElement l;
        public static final PostElement m;
        public static final PostElement n;
        private static final PostElement o[];
        private String postField;

        public static PostElement valueOf(String s)
        {
            return (PostElement)Enum.valueOf(com/devicecollector/DataCollection$PostElement, s);
        }

        public static PostElement[] values()
        {
            return (PostElement[])o.clone();
        }

        public String a()
        {
            return postField;
        }

        static 
        {
            a = new PostElement("LATITUDE", 0, "lat");
            b = new PostElement("LONGITUDE", 1, "lon");
            c = new PostElement("GEO_DATE", 2, "ltm");
            d = new PostElement("GEO_PROVIDER", 3, "lpv");
            e = new PostElement("OLD_DEVICE_COOKIE", 4, "odc");
            f = new PostElement("DEVICE_COOKIE", 5, "dc");
            g = new PostElement("USER_COOKIE", 6, "uc");
            h = new PostElement("OS_VERSION", 7, "os");
            i = new PostElement("SDK_VERSION", 8, "sv");
            j = new PostElement("SDK_TYPE", 9, "st");
            k = new PostElement("MOBILE_MODEL", 10, "mdl");
            l = new PostElement("ERROR_LIST", 11, "err");
            m = new PostElement("MERCHANT_ID", 12, "m");
            n = new PostElement("SESSION_ID", 13, "s");
            o = (new PostElement[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n
            });
        }

        private PostElement(String s, int i1, String s1)
        {
            super(s, i1);
            postField = s1;
        }
    }

}

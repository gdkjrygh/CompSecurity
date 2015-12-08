// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.util;


// Referenced classes of package com.worklight.jsonstore.util:
//            JSONStoreLogger

public static class operation
{

    private String collection;
    private String operation;
    private long startTime;
    private String username;

    public void end()
    {
        long l = System.currentTimeMillis();
        JSONStoreLogger.logAnalytics(Long.valueOf(startTime), Long.valueOf(l), username, collection, operation);
    }

    public (String s, String s1, String s2)
    {
        startTime = System.currentTimeMillis();
        username = s;
        collection = s1;
        operation = s2;
    }
}

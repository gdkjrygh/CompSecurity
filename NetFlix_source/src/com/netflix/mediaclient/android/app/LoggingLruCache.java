// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.app;

import android.util.LruCache;
import com.netflix.mediaclient.Log;

public class LoggingLruCache extends LruCache
{

    private final String tag;

    public LoggingLruCache(String s, int i)
    {
        super(i);
        tag = s;
    }

    protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        String s1 = tag;
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (flag)
        {
            s = "- Evicted: ";
        } else
        {
            s = "- Entry removed: ";
        }
        Log.v(s1, stringbuilder.append(s).append(obj).toString());
        super.entryRemoved(flag, obj, obj1, obj2);
    }
}

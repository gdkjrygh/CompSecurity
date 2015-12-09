// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.service;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IntentMatcher extends HashMap
{

    private static final String a = "IntentMatcher";
    private static final long serialVersionUID = 0xc3b5fa25ec9cba25L;

    public IntentMatcher()
    {
    }

    private boolean a(Intent intent, IntentFilter intentfilter)
    {
        return intentfilter.match(intent.getAction(), intent.getType(), intent.getScheme(), intent.getData(), intent.getCategories(), "IntentMatcher") > 0;
    }

    public Object a(Intent intent)
    {
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (a(intent, (IntentFilter)entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return null;
    }

    public Object a(String s, Uri uri, Object obj)
    {
        s = new IntentFilter(s);
        s.addDataScheme(uri.getScheme());
        s.addDataAuthority(uri.getAuthority(), String.valueOf(uri.getPort()));
        s.addDataPath(uri.getPath(), 1);
        return put(s, obj);
    }

    public Object a(String s, Object obj)
    {
        return put(new IntentFilter(s), obj);
    }

    public Object a(String s, String s1, Object obj)
        throws android.content.IntentFilter.MalformedMimeTypeException
    {
        return put(new IntentFilter(s, s1), obj);
    }

    public Object b(Intent intent)
    {
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext();)
        {
            IntentFilter intentfilter = (IntentFilter)((java.util.Map.Entry)iterator.next()).getKey();
            if (a(intent, intentfilter))
            {
                return super.remove(intentfilter);
            }
        }

        return null;
    }
}

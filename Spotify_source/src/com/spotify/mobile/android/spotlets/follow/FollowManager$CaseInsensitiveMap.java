// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.follow;

import java.util.HashMap;
import java.util.Locale;

class <init> extends HashMap
{

    private static final long serialVersionUID = 0x642bbcdedc361b34L;

    public boolean containsKey(Object obj)
    {
        return (obj instanceof String) && super.containsKey(((String)obj).toUpperCase(Locale.US));
    }

    public Object get(Object obj)
    {
        if (obj instanceof String)
        {
            return super.get(((String)obj).toUpperCase(Locale.US));
        } else
        {
            return null;
        }
    }

    public Object put(Object obj, Object obj1)
    {
        return super.put(((String)obj).toUpperCase(Locale.US), obj1);
    }

    private Q()
    {
    }

    Q(byte byte0)
    {
        this();
    }
}

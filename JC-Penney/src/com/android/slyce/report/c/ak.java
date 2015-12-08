// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.util.LruCache;

class ak extends LruCache
{

    public ak(int i)
    {
        super(i);
    }

    protected String a(Class class1)
    {
        return class1.getCanonicalName();
    }

    protected Object create(Object obj)
    {
        return a((Class)obj);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class km extends WeakReference
{

    public km(Object obj)
    {
        super(obj);
    }

    public boolean equals(Object obj)
    {
        Object obj2 = get();
        Object obj1 = obj;
        if (obj instanceof Reference)
        {
            obj1 = ((Reference)obj).get();
        }
        if (obj2 == null)
        {
            return obj1 == null;
        } else
        {
            return obj2.equals(obj1);
        }
    }

    public int hashCode()
    {
        Object obj = get();
        if (obj == null)
        {
            return super.hashCode();
        } else
        {
            return obj.hashCode();
        }
    }
}

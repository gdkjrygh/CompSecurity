// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import java.lang.ref.SoftReference;
import java.util.Hashtable;

public class SoftReferenceHashTable
{

    Hashtable mTable;

    public SoftReferenceHashTable()
    {
        mTable = new Hashtable();
    }

    public Object get(Object obj)
    {
        Object obj1 = (SoftReference)mTable.get(obj);
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            Object obj2 = ((SoftReference) (obj1)).get();
            obj1 = obj2;
            if (obj2 == null)
            {
                mTable.remove(obj);
                return obj2;
            }
        }
        return obj1;
    }

    public Object put(Object obj, Object obj1)
    {
        obj = (SoftReference)mTable.put(obj, new SoftReference(obj1));
        if (obj == null)
        {
            return null;
        } else
        {
            return ((SoftReference) (obj)).get();
        }
    }

    public Object remove(Object obj)
    {
        obj = (SoftReference)mTable.remove(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return ((SoftReference) (obj)).get();
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.util.Hashtable;

public class BidirectionalMap extends Hashtable
{

    private static final long serialVersionUID = 0x98826247ea12e613L;
    Hashtable reverseMap;

    public BidirectionalMap()
    {
        reverseMap = new Hashtable();
    }

    public Object getReverse(Object obj)
    {
        return reverseMap.get(obj);
    }

    public Object put(Object obj, Object obj1)
    {
        reverseMap.put(obj1, obj);
        return super.put(obj, obj1);
    }
}

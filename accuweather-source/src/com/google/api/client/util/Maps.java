// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public final class Maps
{

    private Maps()
    {
    }

    public static HashMap newHashMap()
    {
        return new HashMap();
    }

    public static LinkedHashMap newLinkedHashMap()
    {
        return new LinkedHashMap();
    }

    public static TreeMap newTreeMap()
    {
        return new TreeMap();
    }
}

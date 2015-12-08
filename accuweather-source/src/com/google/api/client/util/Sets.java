// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.HashSet;
import java.util.TreeSet;

public final class Sets
{

    private Sets()
    {
    }

    public static HashSet newHashSet()
    {
        return new HashSet();
    }

    public static TreeSet newTreeSet()
    {
        return new TreeSet();
    }
}

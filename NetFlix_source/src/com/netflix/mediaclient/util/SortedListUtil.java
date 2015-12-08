// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import java.util.ArrayList;
import java.util.Collections;

public class SortedListUtil extends ArrayList
{

    private static final long serialVersionUID = 1L;

    public SortedListUtil()
    {
    }

    public void insertSorted(Object obj)
    {
        add(obj);
        obj = (Comparable)obj;
        for (int i = size() - 1; i > 0 && ((Comparable) (obj)).compareTo(get(i - 1)) < 0; i--)
        {
            Collections.swap(this, i, i - 1);
        }

    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

public class ls
{

    public static boolean a(List list, List list1)
    {
        if (list.size() != list1.size())
        {
            return false;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            if (!list1.contains(list.next()))
            {
                return false;
            }
        }

        return true;
    }
}

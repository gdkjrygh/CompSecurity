// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import java.util.Collection;
import java.util.Iterator;

public class m
{

    public m()
    {
    }

    public static String a(Collection collection, CharSequence charsequence)
    {
        StringBuilder stringbuilder = new StringBuilder();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            stringbuilder.append(((Throwable)collection.next()).getLocalizedMessage());
            if (collection.hasNext())
            {
                stringbuilder.append(charsequence);
            }
        } while (true);
        return stringbuilder.toString();
    }
}

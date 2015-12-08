// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.util.List;

public final class e
{

    public static int[] a(List list)
    {
        int ai[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            ai[i] = ((Integer)list.get(i)).intValue();
        }

        return ai;
    }

    public static String b(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
        {
            stringbuilder.append(list.get(i));
            if (i < list.size() - 1)
            {
                stringbuilder.append(" ");
            }
        }

        return stringbuilder.toString();
    }
}

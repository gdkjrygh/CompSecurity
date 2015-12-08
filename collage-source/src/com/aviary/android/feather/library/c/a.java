// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.c;

import java.util.List;

public class a
{

    public static final float a[] = new float[0];

    public a()
    {
    }

    public static float[] a(List list)
    {
        if (list == null)
        {
            return null;
        }
        if (list.size() == 0)
        {
            return a;
        }
        float af[] = new float[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            af[i] = ((Float)list.get(i)).floatValue();
        }

        return af;
    }

}

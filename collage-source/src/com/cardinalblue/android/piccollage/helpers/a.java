// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.helpers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import com.cardinalblue.android.b.k;

public class a
{

    public static SparseArray a = new SparseArray();

    public a()
    {
    }

    public static Bitmap a(int i)
    {
        return a(k.a().getResources(), i);
    }

    public static Bitmap a(Resources resources, int i)
    {
        if (resources == null)
        {
            throw new IllegalArgumentException("Null Resources instance");
        }
        Integer integer = Integer.valueOf(i);
        Bitmap bitmap = (Bitmap)a.get(integer.intValue());
        if (bitmap != null)
        {
            return bitmap;
        } else
        {
            resources = BitmapFactory.decodeResource(resources, i);
            a.put(integer.intValue(), resources);
            return resources;
        }
    }

}

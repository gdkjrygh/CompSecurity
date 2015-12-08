// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.utils;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.lang.ref.SoftReference;
import java.util.HashMap;

public class d
{

    private static final HashMap a = new HashMap();

    public d()
    {
    }

    public static Typeface a(AssetManager assetmanager, String s)
    {
        SoftReference softreference = a(s);
        if (softreference != null && softreference.get() != null)
        {
            return (Typeface)softreference.get();
        } else
        {
            assetmanager = Typeface.createFromAsset(assetmanager, s);
            a(s, ((Typeface) (assetmanager)));
            return assetmanager;
        }
    }

    private static SoftReference a(String s)
    {
        synchronized (a)
        {
            s = (SoftReference)a.get(s);
        }
        return s;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static void a(String s, Typeface typeface)
    {
        synchronized (a)
        {
            a.put(s, new SoftReference(typeface));
        }
        return;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Bundle;
import android.os.Parcelable;

public final class n
{

    private n()
    {
    }

    public static Parcelable a(Bundle bundle, String s)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/m4b/maps/df/n.getClassLoader());
            bundle = bundle.getBundle("map_state");
            if (bundle != null)
            {
                bundle.setClassLoader(com/google/android/m4b/maps/df/n.getClassLoader());
                return bundle.getParcelable(s);
            }
        }
        return null;
    }

    public static void a(Bundle bundle, String s, Parcelable parcelable)
    {
        bundle.setClassLoader(com/google/android/m4b/maps/df/n.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        Bundle bundle1 = bundle2;
        if (bundle2 == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.setClassLoader(com/google/android/m4b/maps/df/n.getClassLoader());
        bundle1.putParcelable(s, parcelable);
        bundle.putBundle("map_state", bundle1);
    }
}

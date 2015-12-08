// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.location.Location;

public interface c
{
    public static interface a
    {

        public abstract void onLocationChanged(Location location);
    }


    public abstract void activate(a a1);

    public abstract void deactivate();
}

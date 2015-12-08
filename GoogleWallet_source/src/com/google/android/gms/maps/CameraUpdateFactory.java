// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;

public final class CameraUpdateFactory
{

    private static ICameraUpdateFactoryDelegate ayr;

    public static void a(ICameraUpdateFactoryDelegate icameraupdatefactorydelegate)
    {
        ayr = (ICameraUpdateFactoryDelegate)kn.k(icameraupdatefactorydelegate);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

public final class StreetViewPanorama
{

    private final IStreetViewPanoramaDelegate azm;

    protected StreetViewPanorama(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
    {
        azm = (IStreetViewPanoramaDelegate)kn.k(istreetviewpanoramadelegate);
    }
}

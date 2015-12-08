// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama
{

    private final IStreetViewPanoramaDelegate a;

    protected StreetViewPanorama(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
    {
        a = (IStreetViewPanoramaDelegate)zzu.a(istreetviewpanoramadelegate);
    }

    // Unreferenced inner class com/google/android/gms/maps/StreetViewPanorama$1

/* anonymous class */
    class _cls1 extends com.google.android.gms.maps.internal.zzs.zza
    {

        final OnStreetViewPanoramaChangeListener a;

        public void a(StreetViewPanoramaLocation streetviewpanoramalocation)
        {
            a.a(streetviewpanoramalocation);
        }

        private class OnStreetViewPanoramaChangeListener
        {

            public abstract void a(StreetViewPanoramaLocation streetviewpanoramalocation);
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/StreetViewPanorama$2

/* anonymous class */
    class _cls2 extends com.google.android.gms.maps.internal.zzr.zza
    {

        final OnStreetViewPanoramaCameraChangeListener a;

        public void a(StreetViewPanoramaCamera streetviewpanoramacamera)
        {
            a.a(streetviewpanoramacamera);
        }

        private class OnStreetViewPanoramaCameraChangeListener
        {

            public abstract void a(StreetViewPanoramaCamera streetviewpanoramacamera);
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/StreetViewPanorama$3

/* anonymous class */
    class _cls3 extends com.google.android.gms.maps.internal.zzt.zza
    {

        final OnStreetViewPanoramaClickListener a;

        public void a(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            a.a(streetviewpanoramaorientation);
        }

        private class OnStreetViewPanoramaClickListener
        {

            public abstract void a(StreetViewPanoramaOrientation streetviewpanoramaorientation);
        }

    }


    // Unreferenced inner class com/google/android/gms/maps/StreetViewPanorama$4

/* anonymous class */
    class _cls4 extends com.google.android.gms.maps.internal.zzu.zza
    {

        final OnStreetViewPanoramaLongClickListener a;

        public void a(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            a.a(streetviewpanoramaorientation);
        }

        private class OnStreetViewPanoramaLongClickListener
        {

            public abstract void a(StreetViewPanoramaOrientation streetviewpanoramaorientation);
        }

    }

}

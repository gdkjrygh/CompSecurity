// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.hn;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama
{
    public static interface OnStreetViewPanoramaCameraChangeListener
    {

        public abstract void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera);
    }

    public static interface OnStreetViewPanoramaChangeListener
    {

        public abstract void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation);
    }

    public static interface OnStreetViewPanoramaClickListener
    {

        public abstract void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation);
    }


    private final IStreetViewPanoramaDelegate ZK;

    protected StreetViewPanorama(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
    {
        ZK = (IStreetViewPanoramaDelegate)hn.f(istreetviewpanoramadelegate);
    }

    public void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
    {
        try
        {
            ZK.animateTo(streetviewpanoramacamera, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StreetViewPanoramaCamera streetviewpanoramacamera)
        {
            throw new RuntimeRemoteException(streetviewpanoramacamera);
        }
    }

    public StreetViewPanoramaLocation getLocation()
    {
        StreetViewPanoramaLocation streetviewpanoramalocation;
        try
        {
            streetviewpanoramalocation = ZK.getStreetViewPanoramaLocation();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return streetviewpanoramalocation;
    }

    public StreetViewPanoramaCamera getPanoramaCamera()
    {
        StreetViewPanoramaCamera streetviewpanoramacamera;
        try
        {
            streetviewpanoramacamera = ZK.getPanoramaCamera();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return streetviewpanoramacamera;
    }

    public boolean isPanningGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = ZK.isPanningGesturesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isStreetNamesEnabled()
    {
        boolean flag;
        try
        {
            flag = ZK.isStreetNamesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isUserNavigationEnabled()
    {
        boolean flag;
        try
        {
            flag = ZK.isUserNavigationEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isZoomGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = ZK.isZoomGesturesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    IStreetViewPanoramaDelegate jw()
    {
        return ZK;
    }

    public Point orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
    {
        try
        {
            streetviewpanoramaorientation = (Point)e.e(ZK.orientationToPoint(streetviewpanoramaorientation));
        }
        // Misplaced declaration of an exception variable
        catch (StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            throw new RuntimeRemoteException(streetviewpanoramaorientation);
        }
        return streetviewpanoramaorientation;
    }

    public StreetViewPanoramaOrientation pointToOrientation(Point point)
    {
        try
        {
            point = ZK.pointToOrientation(e.h(point));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            throw new RuntimeRemoteException(point);
        }
        return point;
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
    {
        if (onstreetviewpanoramacamerachangelistener == null)
        {
            try
            {
                ZK.setOnStreetViewPanoramaCameraChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramacamerachangelistener);
            }
        }
        ZK.setOnStreetViewPanoramaCameraChangeListener(new com.google.android.gms.maps.internal.p.a(onstreetviewpanoramacamerachangelistener) {

            final StreetViewPanorama ZM;
            final OnStreetViewPanoramaCameraChangeListener ZN;

            public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera)
            {
                ZN.onStreetViewPanoramaCameraChange(streetviewpanoramacamera);
            }

            
            {
                ZM = StreetViewPanorama.this;
                ZN = onstreetviewpanoramacamerachangelistener;
                super();
            }
        });
        return;
    }

    public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
    {
        if (onstreetviewpanoramachangelistener == null)
        {
            try
            {
                ZK.setOnStreetViewPanoramaChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramachangelistener);
            }
        }
        ZK.setOnStreetViewPanoramaChangeListener(new com.google.android.gms.maps.internal.q.a(onstreetviewpanoramachangelistener) {

            final OnStreetViewPanoramaChangeListener ZL;
            final StreetViewPanorama ZM;

            public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation)
            {
                ZL.onStreetViewPanoramaChange(streetviewpanoramalocation);
            }

            
            {
                ZM = StreetViewPanorama.this;
                ZL = onstreetviewpanoramachangelistener;
                super();
            }
        });
        return;
    }

    public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
    {
        if (onstreetviewpanoramaclicklistener == null)
        {
            try
            {
                ZK.setOnStreetViewPanoramaClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramaclicklistener);
            }
        }
        ZK.setOnStreetViewPanoramaClickListener(new com.google.android.gms.maps.internal.r.a(onstreetviewpanoramaclicklistener) {

            final StreetViewPanorama ZM;
            final OnStreetViewPanoramaClickListener ZO;

            public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            {
                ZO.onStreetViewPanoramaClick(streetviewpanoramaorientation);
            }

            
            {
                ZM = StreetViewPanorama.this;
                ZO = onstreetviewpanoramaclicklistener;
                super();
            }
        });
        return;
    }

    public void setPanningGesturesEnabled(boolean flag)
    {
        try
        {
            ZK.enablePanning(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setPosition(LatLng latlng)
    {
        try
        {
            ZK.setPosition(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setPosition(LatLng latlng, int i)
    {
        try
        {
            ZK.setPositionWithRadius(latlng, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setPosition(String s)
    {
        try
        {
            ZK.setPositionWithID(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void setStreetNamesEnabled(boolean flag)
    {
        try
        {
            ZK.enableStreetNames(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setUserNavigationEnabled(boolean flag)
    {
        try
        {
            ZK.enableUserNavigation(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZoomGesturesEnabled(boolean flag)
    {
        try
        {
            ZK.enableZoom(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}

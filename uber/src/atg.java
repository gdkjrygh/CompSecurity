// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class atg
{

    private static atz a;

    public static atf a()
    {
        atf atf1;
        try
        {
            atf1 = new atf(c().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return atf1;
    }

    public static atf a(float f)
    {
        atf atf1;
        try
        {
            atf1 = new atf(c().a(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return atf1;
    }

    public static atf a(LatLng latlng)
    {
        try
        {
            latlng = new atf(c().a(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new ayb(latlng);
        }
        return latlng;
    }

    public static atf a(LatLng latlng, float f)
    {
        try
        {
            latlng = new atf(c().a(latlng, f));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new ayb(latlng);
        }
        return latlng;
    }

    public static atf a(LatLngBounds latlngbounds, int i)
    {
        try
        {
            latlngbounds = new atf(c().a(latlngbounds, i));
        }
        // Misplaced declaration of an exception variable
        catch (LatLngBounds latlngbounds)
        {
            throw new ayb(latlngbounds);
        }
        return latlngbounds;
    }

    public static void a(atz atz1)
    {
        a = (atz)wn.a(atz1);
    }

    public static atf b()
    {
        atf atf1;
        try
        {
            atf1 = new atf(c().b());
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return atf1;
    }

    private static atz c()
    {
        return (atz)wn.a(a, "CameraUpdateFactory is not initialized");
    }
}

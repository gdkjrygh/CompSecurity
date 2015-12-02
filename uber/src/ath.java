// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public final class ath
{

    private final auc a;
    private aty b;

    public ath(auc auc1)
    {
        a = (auc)wn.a(auc1);
    }

    public final axz a(GroundOverlayOptions groundoverlayoptions)
    {
        try
        {
            groundoverlayoptions = a.a(groundoverlayoptions);
        }
        // Misplaced declaration of an exception variable
        catch (GroundOverlayOptions groundoverlayoptions)
        {
            throw new ayb(groundoverlayoptions);
        }
        if (groundoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        groundoverlayoptions = new axz(groundoverlayoptions);
        return groundoverlayoptions;
        return null;
    }

    public final aya a(PolylineOptions polylineoptions)
    {
        try
        {
            polylineoptions = new aya(a.a(polylineoptions));
        }
        // Misplaced declaration of an exception variable
        catch (PolylineOptions polylineoptions)
        {
            throw new ayb(polylineoptions);
        }
        return polylineoptions;
    }

    public final CameraPosition a()
    {
        CameraPosition cameraposition;
        try
        {
            cameraposition = a.a();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return cameraposition;
    }

    public final Marker a(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = a.a(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch (MarkerOptions markeroptions)
        {
            throw new ayb(markeroptions);
        }
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        markeroptions = new Marker(markeroptions);
        return markeroptions;
        return null;
    }

    public final void a(int i, int j, int k, int l)
    {
        try
        {
            a.a(i, j, k, l);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void a(atf atf1)
    {
        try
        {
            a.a(atf1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (atf atf1)
        {
            throw new ayb(atf1);
        }
    }

    public final void a(atf atf1, int i, ati ati)
    {
        auc auc1;
        aaf aaf;
        try
        {
            auc1 = a;
            aaf = atf1.a();
        }
        // Misplaced declaration of an exception variable
        catch (atf atf1)
        {
            throw new ayb(atf1);
        }
        if (ati != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        atf1 = null;
        auc1.a(aaf, i, atf1);
        return;
        atf1 = new ato(ati);
        break MISSING_BLOCK_LABEL_18;
    }

    public final void a(atj atj)
    {
        if (atj == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (atj atj)
            {
                throw new ayb(atj);
            }
        }
        a.a(new avn(atj) {

            final atj a;
            final ath b;

            public final aaf a(ayw ayw)
            {
                return aai.a(a.a(new Marker(ayw)));
            }

            public final aaf b(ayw ayw)
            {
                new Marker(ayw);
                return aai.a(null);
            }

            
            {
                b = ath.this;
                a = atj1;
                super();
            }
        });
        return;
    }

    public final void a(atk atk)
    {
        if (atk == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (atk atk)
            {
                throw new ayb(atk);
            }
        }
        a.a(new avt(atk) {

            final atk a;
            final ath b;

            public final void a(CameraPosition cameraposition)
            {
                a.a(cameraposition);
            }

            
            {
                b = ath.this;
                a = atk1;
                super();
            }
        });
        return;
    }

    public final void a(atl atl)
    {
        if (atl == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (atl atl)
            {
                throw new ayb(atl);
            }
        }
        a.a(new avz(atl) {

            final atl a;
            final ath b;

            public final void a(ayw ayw)
            {
                a.b(new Marker(ayw));
            }

            
            {
                b = ath.this;
                a = atl1;
                super();
            }
        });
        return;
    }

    public final void a(atm atm)
    {
        if (atm == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (atm atm)
            {
                throw new ayb(atm);
            }
        }
        a.a(new awf(atm) {

            final atm a;
            final ath b;

            public final void a(LatLng latlng)
            {
                a.a(latlng);
            }

            
            {
                b = ath.this;
                a = atm1;
                super();
            }
        });
        return;
    }

    public final void a(atn atn)
    {
        if (atn == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (atn atn)
            {
                throw new ayb(atn);
            }
        }
        a.a(new awr(atn) {

            final atn a;
            final ath b;

            public final boolean a(ayw ayw)
            {
                return a.c(new Marker(ayw));
            }

            
            {
                b = ath.this;
                a = atn1;
                super();
            }
        });
        return;
    }

    public final boolean a(boolean flag)
    {
        try
        {
            flag = a.b(flag);
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return flag;
    }

    public final void b()
    {
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void b(atf atf1)
    {
        try
        {
            a.b(atf1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (atf atf1)
        {
            throw new ayb(atf1);
        }
    }

    public final void b(boolean flag)
    {
        try
        {
            a.c(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void c()
    {
        try
        {
            a.a(1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void d()
    {
        try
        {
            a.d(true);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final aty e()
    {
        aty aty1;
        try
        {
            if (b == null)
            {
                b = new aty(a.k());
            }
            aty1 = b;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return aty1;
    }

    public final atu f()
    {
        atu atu1;
        try
        {
            atu1 = new atu(a.l());
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return atu1;
    }
}

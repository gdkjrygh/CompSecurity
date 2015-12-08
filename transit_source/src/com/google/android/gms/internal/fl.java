// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.data.d;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            de, fn, fv, dj, 
//            fk, fs, ec, fg

public class fl extends de
    implements GooglePlayServicesClient
{
    final class a extends fg
    {

        private final com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener rq;
        final fl rr;

        public void a(com.google.android.gms.common.data.d d1, String s, String s1)
        {
            Object obj;
            if (d1.aM() != null)
            {
                obj = (PendingIntent)d1.aM().getParcelable("pendingIntent");
            } else
            {
                obj = null;
            }
            obj = new ConnectionResult(d1.getStatusCode(), ((PendingIntent) (obj)));
            if (!((ConnectionResult) (obj)).isSuccess() && d1 != null)
            {
                if (!d1.isClosed())
                {
                    d1.close();
                }
                d1 = null;
            }
            rr.a(rr. new b(rq, ((ConnectionResult) (obj)), d1, s, s1));
        }

        public a(com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener onmomentsloadedlistener)
        {
            rr = fl.this;
            super();
            rq = onmomentsloadedlistener;
        }
    }

    final class b extends de.c
    {

        final fl rr;
        private final ConnectionResult rs;
        private final String rt;
        private final String ru;

        protected void a(com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener onmomentsloadedlistener, com.google.android.gms.common.data.d d1)
        {
            ConnectionResult connectionresult = rs;
            if (d1 != null)
            {
                d1 = new MomentBuffer(d1);
            } else
            {
                d1 = null;
            }
            onmomentsloadedlistener.onMomentsLoaded(connectionresult, d1, rt, ru);
        }

        protected volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener)obj, d1);
        }

        public b(com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener onmomentsloadedlistener, ConnectionResult connectionresult, com.google.android.gms.common.data.d d1, String s, String s1)
        {
            rr = fl.this;
            super(fl.this, onmomentsloadedlistener, d1);
            rs = connectionresult;
            rt = s;
            ru = s1;
        }
    }

    final class c extends fg
    {

        final fl rr;
        private final com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener rv;

        public void a(com.google.android.gms.common.data.d d1, String s)
        {
            Object obj;
            if (d1.aM() != null)
            {
                obj = (PendingIntent)d1.aM().getParcelable("pendingIntent");
            } else
            {
                obj = null;
            }
            obj = new ConnectionResult(d1.getStatusCode(), ((PendingIntent) (obj)));
            if (!((ConnectionResult) (obj)).isSuccess() && d1 != null)
            {
                if (!d1.isClosed())
                {
                    d1.close();
                }
                d1 = null;
            }
            rr.a(rr. new d(rv, ((ConnectionResult) (obj)), d1, s));
        }

        public c(com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener onpeopleloadedlistener)
        {
            rr = fl.this;
            super();
            rv = onpeopleloadedlistener;
        }
    }

    final class d extends de.c
    {

        final fl rr;
        private final ConnectionResult rs;
        private final String rt;

        protected void a(com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener onpeopleloadedlistener, com.google.android.gms.common.data.d d1)
        {
            ConnectionResult connectionresult = rs;
            if (d1 != null)
            {
                d1 = new PersonBuffer(d1);
            } else
            {
                d1 = null;
            }
            onpeopleloadedlistener.onPeopleLoaded(connectionresult, d1, rt);
        }

        protected volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener)obj, d1);
        }

        public d(com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener onpeopleloadedlistener, ConnectionResult connectionresult, com.google.android.gms.common.data.d d1, String s)
        {
            rr = fl.this;
            super(fl.this, onpeopleloadedlistener, d1);
            rs = connectionresult;
            rt = s;
        }
    }

    final class e extends fg
    {

        final fl rr;
        private final com.google.android.gms.plus.PlusClient.OnAccessRevokedListener rw;

        public void b(int i, Bundle bundle)
        {
            PendingIntent pendingintent = null;
            if (bundle != null)
            {
                pendingintent = (PendingIntent)bundle.getParcelable("pendingIntent");
            }
            bundle = new ConnectionResult(i, pendingintent);
            rr.a(rr. new f(rw, bundle));
        }

        public e(com.google.android.gms.plus.PlusClient.OnAccessRevokedListener onaccessrevokedlistener)
        {
            rr = fl.this;
            super();
            rw = onaccessrevokedlistener;
        }
    }

    final class f extends de.b
    {

        final fl rr;
        private final ConnectionResult rs;

        protected void a(com.google.android.gms.plus.PlusClient.OnAccessRevokedListener onaccessrevokedlistener)
        {
            rr.disconnect();
            if (onaccessrevokedlistener != null)
            {
                onaccessrevokedlistener.onAccessRevoked(rs);
            }
        }

        protected volatile void a(Object obj)
        {
            a((com.google.android.gms.plus.PlusClient.OnAccessRevokedListener)obj);
        }

        protected void aF()
        {
        }

        public f(com.google.android.gms.plus.PlusClient.OnAccessRevokedListener onaccessrevokedlistener, ConnectionResult connectionresult)
        {
            rr = fl.this;
            super(fl.this, onaccessrevokedlistener);
            rs = connectionresult;
        }
    }


    private Person ro;
    private fn rp;

    public fl(Context context, fn fn1, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, fn1.cZ());
        rp = fn1;
    }

    public boolean Y(String s)
    {
        return Arrays.asList(aY()).contains(s);
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person"))
        {
            ro = fv.e(bundle.getByteArray("loaded_person"));
        }
        super.a(i, ibinder, bundle);
    }

    protected void a(dj dj1, de.d d1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_id", rp.df());
        bundle.putStringArray("request_visible_actions", rp.da());
        dj1.a(d1, 0x3d8024, rp.dd(), rp.dc(), aY(), rp.getAccountName(), bundle);
    }

    public void a(com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener onpeopleloadedlistener, Collection collection)
    {
        bc();
        onpeopleloadedlistener = new c(onpeopleloadedlistener);
        try
        {
            ((fk)bd()).a(onpeopleloadedlistener, new ArrayList(collection));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            onpeopleloadedlistener.a(com.google.android.gms.common.data.d.r(8), null);
        }
    }

    public void a(com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener onpeopleloadedlistener, String as[])
    {
        a(onpeopleloadedlistener, ((Collection) (Arrays.asList(as))));
    }

    protected String ag()
    {
        return "com.google.android.gms.plus.service.START";
    }

    protected String ah()
    {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    protected fk ar(IBinder ibinder)
    {
        return fk.a.aq(ibinder);
    }

    public void clearDefaultAccount()
    {
        bc();
        try
        {
            ro = null;
            ((fk)bd()).clearDefaultAccount();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public String getAccountName()
    {
        bc();
        String s;
        try
        {
            s = ((fk)bd()).getAccountName();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return s;
    }

    public Person getCurrentPerson()
    {
        bc();
        return ro;
    }

    public void loadMoments(com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener onmomentsloadedlistener)
    {
        loadMoments(onmomentsloadedlistener, 20, null, null, null, "me");
    }

    public void loadMoments(com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener onmomentsloadedlistener, int i, String s, Uri uri, String s1, String s2)
    {
        bc();
        if (onmomentsloadedlistener != null)
        {
            onmomentsloadedlistener = new a(onmomentsloadedlistener);
        } else
        {
            onmomentsloadedlistener = null;
        }
        try
        {
            ((fk)bd()).a(onmomentsloadedlistener, i, s, uri, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            onmomentsloadedlistener.a(com.google.android.gms.common.data.d.r(8), null, null);
        }
    }

    public void loadVisiblePeople(com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener onpeopleloadedlistener, int i, String s)
    {
        bc();
        onpeopleloadedlistener = new c(onpeopleloadedlistener);
        try
        {
            ((fk)bd()).a(onpeopleloadedlistener, 1, i, -1, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            onpeopleloadedlistener.a(com.google.android.gms.common.data.d.r(8), null);
        }
    }

    public void loadVisiblePeople(com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener onpeopleloadedlistener, String s)
    {
        loadVisiblePeople(onpeopleloadedlistener, 0, s);
    }

    protected IInterface p(IBinder ibinder)
    {
        return ar(ibinder);
    }

    public void removeMoment(String s)
    {
        bc();
        try
        {
            ((fk)bd()).removeMoment(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException(s);
        }
    }

    public void revokeAccessAndDisconnect(com.google.android.gms.plus.PlusClient.OnAccessRevokedListener onaccessrevokedlistener)
    {
        bc();
        clearDefaultAccount();
        onaccessrevokedlistener = new e(onaccessrevokedlistener);
        try
        {
            ((fk)bd()).b(onaccessrevokedlistener);
            return;
        }
        catch (RemoteException remoteexception)
        {
            onaccessrevokedlistener.b(8, null);
        }
    }

    public void writeMoment(Moment moment)
    {
        bc();
        try
        {
            moment = ec.a((fs)moment);
            ((fk)bd()).a(moment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Moment moment)
        {
            throw new IllegalStateException(moment);
        }
    }
}

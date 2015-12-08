// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hg;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.kp;
import com.google.android.gms.internal.ks;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.gms.plus.internal:
//            h, d, a

public class com.google.android.gms.plus.internal.e extends hb
{
    final class a extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.a.d abL;
        final com.google.android.gms.plus.internal.e abM;

        public void am(Status status)
        {
            abM.a(abM. new d(abL, status));
        }

        public a(com.google.android.gms.common.api.a.d d1)
        {
            abM = com.google.android.gms.plus.internal.e.this;
            super();
            abL = d1;
        }
    }

    final class b extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.a.d abL;
        final com.google.android.gms.plus.internal.e abM;

        public void a(DataHolder dataholder, String s, String s1)
        {
            Object obj;
            if (dataholder.eU() != null)
            {
                obj = (PendingIntent)dataholder.eU().getParcelable("pendingIntent");
            } else
            {
                obj = null;
            }
            obj = new Status(dataholder.getStatusCode(), null, ((PendingIntent) (obj)));
            if (!((Status) (obj)).isSuccess() && dataholder != null)
            {
                if (!dataholder.isClosed())
                {
                    dataholder.close();
                }
                dataholder = null;
            }
            abM.a(abM. new c(abL, ((Status) (obj)), dataholder, s, s1));
        }

        public b(com.google.android.gms.common.api.a.d d1)
        {
            abM = com.google.android.gms.plus.internal.e.this;
            super();
            abL = d1;
        }
    }

    final class c extends com.google.android.gms.internal.hb.d
        implements com.google.android.gms.plus.Moments.LoadMomentsResult
    {

        private final String HS;
        final com.google.android.gms.plus.internal.e abM;
        private final String abN;
        private MomentBuffer abO;
        private final Status yz;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            if (dataholder != null)
            {
                dataholder = new MomentBuffer(dataholder);
            } else
            {
                dataholder = null;
            }
            abO = dataholder;
            d1.a(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public MomentBuffer getMomentBuffer()
        {
            return abO;
        }

        public String getNextPageToken()
        {
            return HS;
        }

        public Status getStatus()
        {
            return yz;
        }

        public String getUpdated()
        {
            return abN;
        }

        public void release()
        {
            if (abO != null)
            {
                abO.close();
            }
        }

        public c(com.google.android.gms.common.api.a.d d1, Status status, DataHolder dataholder, String s, String s1)
        {
            abM = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, d1, dataholder);
            yz = status;
            HS = s;
            abN = s1;
        }
    }

    final class d extends com.google.android.gms.internal.hb.b
    {

        final com.google.android.gms.plus.internal.e abM;
        private final Status yz;

        protected void d(Object obj)
        {
            n((com.google.android.gms.common.api.a.d)obj);
        }

        protected void fu()
        {
        }

        protected void n(com.google.android.gms.common.api.a.d d1)
        {
            if (d1 != null)
            {
                d1.a(yz);
            }
        }

        public d(com.google.android.gms.common.api.a.d d1, Status status)
        {
            abM = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, d1);
            yz = status;
        }
    }

    final class e extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.a.d abL;
        final com.google.android.gms.plus.internal.e abM;

        public void a(DataHolder dataholder, String s)
        {
            Object obj;
            if (dataholder.eU() != null)
            {
                obj = (PendingIntent)dataholder.eU().getParcelable("pendingIntent");
            } else
            {
                obj = null;
            }
            obj = new Status(dataholder.getStatusCode(), null, ((PendingIntent) (obj)));
            if (!((Status) (obj)).isSuccess() && dataholder != null)
            {
                if (!dataholder.isClosed())
                {
                    dataholder.close();
                }
                dataholder = null;
            }
            abM.a(abM. new f(abL, ((Status) (obj)), dataholder, s));
        }

        public e(com.google.android.gms.common.api.a.d d1)
        {
            abM = com.google.android.gms.plus.internal.e.this;
            super();
            abL = d1;
        }
    }

    final class f extends com.google.android.gms.internal.hb.d
        implements com.google.android.gms.plus.People.LoadPeopleResult
    {

        private final String HS;
        final com.google.android.gms.plus.internal.e abM;
        private PersonBuffer abP;
        private final Status yz;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            if (dataholder != null)
            {
                dataholder = new PersonBuffer(dataholder);
            } else
            {
                dataholder = null;
            }
            abP = dataholder;
            d1.a(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public String getNextPageToken()
        {
            return HS;
        }

        public PersonBuffer getPersonBuffer()
        {
            return abP;
        }

        public Status getStatus()
        {
            return yz;
        }

        public void release()
        {
            if (abP != null)
            {
                abP.close();
            }
        }

        public f(com.google.android.gms.common.api.a.d d1, Status status, DataHolder dataholder, String s)
        {
            abM = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, d1, dataholder);
            yz = status;
            HS = s;
        }
    }

    final class g extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.a.d abL;
        final com.google.android.gms.plus.internal.e abM;

        public void h(int i, Bundle bundle)
        {
            if (bundle != null)
            {
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            } else
            {
                bundle = null;
            }
            bundle = new Status(i, null, bundle);
            abM.a(abM. new h(abL, bundle));
        }

        public g(com.google.android.gms.common.api.a.d d1)
        {
            abM = com.google.android.gms.plus.internal.e.this;
            super();
            abL = d1;
        }
    }

    final class h extends com.google.android.gms.internal.hb.b
    {

        final com.google.android.gms.plus.internal.e abM;
        private final Status yz;

        protected void d(Object obj)
        {
            n((com.google.android.gms.common.api.a.d)obj);
        }

        protected void fu()
        {
        }

        protected void n(com.google.android.gms.common.api.a.d d1)
        {
            abM.disconnect();
            if (d1 != null)
            {
                d1.a(yz);
            }
        }

        public h(com.google.android.gms.common.api.a.d d1, Status status)
        {
            abM = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, d1);
            yz = status;
        }
    }


    private Person abJ;
    private final com.google.android.gms.plus.internal.h abK;

    public com.google.android.gms.plus.internal.e(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.plus.internal.h h1)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, h1.jZ());
        abK = h1;
    }

    public com.google.android.gms.plus.internal.e(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.plus.internal.h h1)
    {
        this(context, context.getMainLooper(), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (new com.google.android.gms.internal.hb.c(connectioncallbacks))), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new com.google.android.gms.internal.hb.g(onconnectionfailedlistener))), h1);
    }

    public hg a(com.google.android.gms.common.api.a.d d1, int i, String s)
    {
        cn();
        d1 = new e(d1);
        try
        {
            s = ((com.google.android.gms.plus.internal.d)ft()).a(d1, 1, i, -1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            d1.a(DataHolder.af(8), null);
            return null;
        }
        return s;
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person"))
        {
            abJ = ks.i(bundle.getByteArray("loaded_person"));
        }
        super.a(i, ibinder, bundle);
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i, String s, Uri uri, String s1, String s2)
    {
        cn();
        if (d1 != null)
        {
            d1 = new b(d1);
        } else
        {
            d1 = null;
        }
        try
        {
            ((com.google.android.gms.plus.internal.d)ft()).a(d1, i, s, uri, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            d1.a(DataHolder.af(8), null, null);
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, Moment moment)
    {
        cn();
        if (d1 != null)
        {
            d1 = new a(d1);
        } else
        {
            d1 = null;
        }
        try
        {
            moment = ie.a((kp)moment);
            ((com.google.android.gms.plus.internal.d)ft()).a(d1, moment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Moment moment) { }
        if (d1 == null)
        {
            throw new IllegalStateException(moment);
        } else
        {
            d1.am(new Status(8, null, null));
            return;
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, Collection collection)
    {
        cn();
        d1 = new e(d1);
        try
        {
            ((com.google.android.gms.plus.internal.d)ft()).a(d1, new ArrayList(collection));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            d1.a(DataHolder.af(8), null);
        }
    }

    protected void a(hi hi1, com.google.android.gms.internal.hb.e e1)
        throws RemoteException
    {
        Bundle bundle = abK.kh();
        bundle.putStringArray("request_visible_actions", abK.ka());
        hi1.a(e1, 0x4da6e8, abK.kd(), abK.kc(), fs(), abK.getAccountName(), bundle);
    }

    protected com.google.android.gms.plus.internal.d bn(IBinder ibinder)
    {
        return com.google.android.gms.plus.internal.d.a.bm(ibinder);
    }

    protected String bu()
    {
        return "com.google.android.gms.plus.service.START";
    }

    protected String bv()
    {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    public boolean by(String s)
    {
        return Arrays.asList(fs()).contains(s);
    }

    public void clearDefaultAccount()
    {
        cn();
        try
        {
            abJ = null;
            ((com.google.android.gms.plus.internal.d)ft()).clearDefaultAccount();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, String as[])
    {
        a(d1, Arrays.asList(as));
    }

    public String getAccountName()
    {
        cn();
        String s;
        try
        {
            s = ((com.google.android.gms.plus.internal.d)ft()).getAccountName();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return s;
    }

    public Person getCurrentPerson()
    {
        cn();
        return abJ;
    }

    public void k(com.google.android.gms.common.api.a.d d1)
    {
        a(d1, 20, null, null, null, "me");
    }

    public void l(com.google.android.gms.common.api.a.d d1)
    {
        cn();
        d1 = new e(d1);
        try
        {
            ((com.google.android.gms.plus.internal.d)ft()).a(d1, 2, 1, -1, null);
            return;
        }
        catch (RemoteException remoteexception)
        {
            d1.a(DataHolder.af(8), null);
        }
    }

    public void m(com.google.android.gms.common.api.a.d d1)
    {
        cn();
        clearDefaultAccount();
        d1 = new g(d1);
        try
        {
            ((com.google.android.gms.plus.internal.d)ft()).b(d1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            d1.h(8, null);
        }
    }

    public hg r(com.google.android.gms.common.api.a.d d1, String s)
    {
        return a(d1, 0, s);
    }

    public void removeMoment(String s)
    {
        cn();
        try
        {
            ((com.google.android.gms.plus.internal.d)ft()).removeMoment(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException(s);
        }
    }

    protected IInterface x(IBinder ibinder)
    {
        return bn(ibinder);
    }
}

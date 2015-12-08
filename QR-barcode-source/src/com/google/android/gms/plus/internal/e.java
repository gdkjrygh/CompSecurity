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
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.nw;
import com.google.android.gms.internal.nz;
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

public class com.google.android.gms.plus.internal.e extends com.google.android.gms.common.internal.e
{
    final class a extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b alv;
        final com.google.android.gms.plus.internal.e alw;

        public void aB(Status status)
        {
            alw.a(alw. new d(alv, status));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            alw = com.google.android.gms.plus.internal.e.this;
            super();
            alv = b1;
        }
    }

    final class b extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b alv;
        final com.google.android.gms.plus.internal.e alw;

        public void a(DataHolder dataholder, String s, String s1)
        {
            Object obj;
            if (dataholder.gy() != null)
            {
                obj = (PendingIntent)dataholder.gy().getParcelable("pendingIntent");
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
            alw.a(alw. new c(alv, ((Status) (obj)), dataholder, s, s1));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            alw = com.google.android.gms.plus.internal.e.this;
            super();
            alv = b1;
        }
    }

    final class c extends com.google.android.gms.common.internal.d
        implements com.google.android.gms.plus.Moments.LoadMomentsResult
    {

        private final Status CM;
        private final String Nq;
        final com.google.android.gms.plus.internal.e alw;
        private final String alx;
        private MomentBuffer aly;

        protected void a(com.google.android.gms.common.api.BaseImplementation.b b1, DataHolder dataholder)
        {
            if (dataholder != null)
            {
                dataholder = new MomentBuffer(dataholder);
            } else
            {
                dataholder = null;
            }
            aly = dataholder;
            b1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.BaseImplementation.b)obj, dataholder);
        }

        public MomentBuffer getMomentBuffer()
        {
            return aly;
        }

        public String getNextPageToken()
        {
            return Nq;
        }

        public Status getStatus()
        {
            return CM;
        }

        public String getUpdated()
        {
            return alx;
        }

        public void release()
        {
            if (aly != null)
            {
                aly.close();
            }
        }

        public c(com.google.android.gms.common.api.BaseImplementation.b b1, Status status, DataHolder dataholder, String s, String s1)
        {
            alw = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, b1, dataholder);
            CM = status;
            Nq = s;
            alx = s1;
        }
    }

    final class d extends com.google.android.gms.common.internal.b
    {

        private final Status CM;
        final com.google.android.gms.plus.internal.e alw;

        protected void g(Object obj)
        {
            n((com.google.android.gms.common.api.BaseImplementation.b)obj);
        }

        protected void gT()
        {
        }

        protected void n(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            if (b1 != null)
            {
                b1.b(CM);
            }
        }

        public d(com.google.android.gms.common.api.BaseImplementation.b b1, Status status)
        {
            alw = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, b1);
            CM = status;
        }
    }

    final class e extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b alv;
        final com.google.android.gms.plus.internal.e alw;

        public void a(DataHolder dataholder, String s)
        {
            Object obj;
            if (dataholder.gy() != null)
            {
                obj = (PendingIntent)dataholder.gy().getParcelable("pendingIntent");
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
            alw.a(alw. new f(alv, ((Status) (obj)), dataholder, s));
        }

        public e(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            alw = com.google.android.gms.plus.internal.e.this;
            super();
            alv = b1;
        }
    }

    final class f extends com.google.android.gms.common.internal.d
        implements com.google.android.gms.plus.People.LoadPeopleResult
    {

        private final Status CM;
        private final String Nq;
        final com.google.android.gms.plus.internal.e alw;
        private PersonBuffer alz;

        protected void a(com.google.android.gms.common.api.BaseImplementation.b b1, DataHolder dataholder)
        {
            if (dataholder != null)
            {
                dataholder = new PersonBuffer(dataholder);
            } else
            {
                dataholder = null;
            }
            alz = dataholder;
            b1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.BaseImplementation.b)obj, dataholder);
        }

        public String getNextPageToken()
        {
            return Nq;
        }

        public PersonBuffer getPersonBuffer()
        {
            return alz;
        }

        public Status getStatus()
        {
            return CM;
        }

        public void release()
        {
            if (alz != null)
            {
                alz.close();
            }
        }

        public f(com.google.android.gms.common.api.BaseImplementation.b b1, Status status, DataHolder dataholder, String s)
        {
            alw = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, b1, dataholder);
            CM = status;
            Nq = s;
        }
    }

    final class g extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b alv;
        final com.google.android.gms.plus.internal.e alw;

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
            alw.a(alw. new h(alv, bundle));
        }

        public g(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            alw = com.google.android.gms.plus.internal.e.this;
            super();
            alv = b1;
        }
    }

    final class h extends com.google.android.gms.common.internal.b
    {

        private final Status CM;
        final com.google.android.gms.plus.internal.e alw;

        protected void g(Object obj)
        {
            n((com.google.android.gms.common.api.BaseImplementation.b)obj);
        }

        protected void gT()
        {
        }

        protected void n(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            alw.disconnect();
            if (b1 != null)
            {
                b1.b(CM);
            }
        }

        public h(com.google.android.gms.common.api.BaseImplementation.b b1, Status status)
        {
            alw = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, b1);
            CM = status;
        }
    }


    private Person alt;
    private final com.google.android.gms.plus.internal.h alu;

    public com.google.android.gms.plus.internal.e(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.plus.internal.h h1)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, h1.ng());
        alu = h1;
    }

    public com.google.android.gms.plus.internal.e(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.plus.internal.h h1)
    {
        this(context, context.getMainLooper(), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (new com.google.android.gms.common.internal.c(connectioncallbacks))), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new com.google.android.gms.common.internal.g(onconnectionfailedlistener))), h1);
    }

    public j a(com.google.android.gms.common.api.BaseImplementation.b b1, int i, String s)
    {
        dJ();
        b1 = new e(b1);
        try
        {
            s = ((com.google.android.gms.plus.internal.d)gS()).a(b1, 1, i, -1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b1.a(DataHolder.as(8), null);
            return null;
        }
        return s;
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person"))
        {
            alt = nz.i(bundle.getByteArray("loaded_person"));
        }
        super.a(i, ibinder, bundle);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i, String s, Uri uri, String s1, String s2)
    {
        dJ();
        if (b1 != null)
        {
            b1 = new b(b1);
        } else
        {
            b1 = null;
        }
        try
        {
            ((com.google.android.gms.plus.internal.d)gS()).a(b1, i, s, uri, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b1.a(DataHolder.as(8), null, null);
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, Moment moment)
    {
        dJ();
        if (b1 != null)
        {
            b1 = new a(b1);
        } else
        {
            b1 = null;
        }
        try
        {
            moment = jp.a((nw)moment);
            ((com.google.android.gms.plus.internal.d)gS()).a(b1, moment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Moment moment) { }
        if (b1 == null)
        {
            throw new IllegalStateException(moment);
        } else
        {
            b1.aB(new Status(8, null, null));
            return;
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, Collection collection)
    {
        dJ();
        b1 = new e(b1);
        try
        {
            ((com.google.android.gms.plus.internal.d)gS()).a(b1, new ArrayList(collection));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            b1.a(DataHolder.as(8), null);
        }
    }

    protected void a(l l1, com.google.android.gms.common.internal.e e1)
        throws RemoteException
    {
        Bundle bundle = alu.no();
        bundle.putStringArray("request_visible_actions", alu.nh());
        l1.a(e1, 0x5e2978, alu.nk(), alu.nj(), gR(), alu.getAccountName(), bundle);
    }

    protected com.google.android.gms.plus.internal.d bH(IBinder ibinder)
    {
        return com.google.android.gms.plus.internal.d.a.bG(ibinder);
    }

    public boolean cg(String s)
    {
        return Arrays.asList(gR()).contains(s);
    }

    public void clearDefaultAccount()
    {
        dJ();
        try
        {
            alt = null;
            ((com.google.android.gms.plus.internal.d)gS()).clearDefaultAccount();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String as[])
    {
        a(b1, Arrays.asList(as));
    }

    public String getAccountName()
    {
        dJ();
        String s;
        try
        {
            s = ((com.google.android.gms.plus.internal.d)gS()).getAccountName();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return s;
    }

    public Person getCurrentPerson()
    {
        dJ();
        return alt;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.plus.service.START";
    }

    protected IInterface j(IBinder ibinder)
    {
        return bH(ibinder);
    }

    public void k(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        a(b1, 20, null, null, null, "me");
    }

    public void l(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        dJ();
        b1 = new e(b1);
        try
        {
            ((com.google.android.gms.plus.internal.d)gS()).a(b1, 2, 1, -1, null);
            return;
        }
        catch (RemoteException remoteexception)
        {
            b1.a(DataHolder.as(8), null);
        }
    }

    public void m(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        dJ();
        clearDefaultAccount();
        b1 = new g(b1);
        try
        {
            ((com.google.android.gms.plus.internal.d)gS()).b(b1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            b1.h(8, null);
        }
    }

    public j r(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        return a(b1, 0, s);
    }

    public void removeMoment(String s)
    {
        dJ();
        try
        {
            ((com.google.android.gms.plus.internal.d)gS()).removeMoment(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException(s);
        }
    }
}

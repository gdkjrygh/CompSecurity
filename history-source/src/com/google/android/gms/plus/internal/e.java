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
import com.google.android.gms.internal.jd;
import com.google.android.gms.internal.jj;
import com.google.android.gms.internal.jl;
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.ky;
import com.google.android.gms.internal.lm;
import com.google.android.gms.internal.pf;
import com.google.android.gms.internal.pi;
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

public class com.google.android.gms.plus.internal.e extends jl
{
    final class a extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b anI;
        final com.google.android.gms.plus.internal.e anJ;

        public void aA(Status status)
        {
            anJ.a(anJ. new d(anI, status));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            anJ = com.google.android.gms.plus.internal.e.this;
            super();
            anI = b1;
        }
    }

    final class b extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b anI;
        final com.google.android.gms.plus.internal.e anJ;

        public void a(DataHolder dataholder, String s, String s1)
        {
            Object obj;
            if (dataholder.gV() != null)
            {
                obj = (PendingIntent)dataholder.gV().getParcelable("pendingIntent");
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
            anJ.a(anJ. new c(anI, ((Status) (obj)), dataholder, s, s1));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            anJ = com.google.android.gms.plus.internal.e.this;
            super();
            anI = b1;
        }
    }

    final class c extends com.google.android.gms.internal.jl.d
        implements com.google.android.gms.plus.Moments.LoadMomentsResult
    {

        private final Status Eb;
        private final String OB;
        final com.google.android.gms.plus.internal.e anJ;
        private final String anK;
        private MomentBuffer anL;

        protected void a(com.google.android.gms.common.api.BaseImplementation.b b1, DataHolder dataholder)
        {
            if (dataholder != null)
            {
                dataholder = new MomentBuffer(dataholder);
            } else
            {
                dataholder = null;
            }
            anL = dataholder;
            b1.b(this);
        }

        protected void b(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.BaseImplementation.b)obj, dataholder);
        }

        public MomentBuffer getMomentBuffer()
        {
            return anL;
        }

        public String getNextPageToken()
        {
            return OB;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public String getUpdated()
        {
            return anK;
        }

        public void release()
        {
            if (anL != null)
            {
                anL.close();
            }
        }

        public c(com.google.android.gms.common.api.BaseImplementation.b b1, Status status, DataHolder dataholder, String s, String s1)
        {
            anJ = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, b1, dataholder);
            Eb = status;
            OB = s;
            anK = s1;
        }
    }

    final class d extends com.google.android.gms.internal.jl.b
    {

        private final Status Eb;
        final com.google.android.gms.plus.internal.e anJ;

        protected void g(Object obj)
        {
            m((com.google.android.gms.common.api.BaseImplementation.b)obj);
        }

        protected void hx()
        {
        }

        protected void m(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            if (b1 != null)
            {
                b1.b(Eb);
            }
        }

        public d(com.google.android.gms.common.api.BaseImplementation.b b1, Status status)
        {
            anJ = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, b1);
            Eb = status;
        }
    }

    final class e extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b anI;
        final com.google.android.gms.plus.internal.e anJ;

        public void a(DataHolder dataholder, String s)
        {
            Object obj;
            if (dataholder.gV() != null)
            {
                obj = (PendingIntent)dataholder.gV().getParcelable("pendingIntent");
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
            anJ.a(anJ. new f(anI, ((Status) (obj)), dataholder, s));
        }

        public e(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            anJ = com.google.android.gms.plus.internal.e.this;
            super();
            anI = b1;
        }
    }

    final class f extends com.google.android.gms.internal.jl.d
        implements com.google.android.gms.plus.People.LoadPeopleResult
    {

        private final Status Eb;
        private final String OB;
        final com.google.android.gms.plus.internal.e anJ;
        private PersonBuffer anM;

        protected void a(com.google.android.gms.common.api.BaseImplementation.b b1, DataHolder dataholder)
        {
            if (dataholder != null)
            {
                dataholder = new PersonBuffer(dataholder);
            } else
            {
                dataholder = null;
            }
            anM = dataholder;
            b1.b(this);
        }

        protected void b(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.BaseImplementation.b)obj, dataholder);
        }

        public String getNextPageToken()
        {
            return OB;
        }

        public PersonBuffer getPersonBuffer()
        {
            return anM;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public void release()
        {
            if (anM != null)
            {
                anM.close();
            }
        }

        public f(com.google.android.gms.common.api.BaseImplementation.b b1, Status status, DataHolder dataholder, String s)
        {
            anJ = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, b1, dataholder);
            Eb = status;
            OB = s;
        }
    }

    final class g extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b anI;
        final com.google.android.gms.plus.internal.e anJ;

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
            anJ.a(anJ. new h(anI, bundle));
        }

        public g(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            anJ = com.google.android.gms.plus.internal.e.this;
            super();
            anI = b1;
        }
    }

    final class h extends com.google.android.gms.internal.jl.b
    {

        private final Status Eb;
        final com.google.android.gms.plus.internal.e anJ;

        protected void g(Object obj)
        {
            m((com.google.android.gms.common.api.BaseImplementation.b)obj);
        }

        protected void hx()
        {
        }

        protected void m(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            anJ.disconnect();
            if (b1 != null)
            {
                b1.b(Eb);
            }
        }

        public h(com.google.android.gms.common.api.BaseImplementation.b b1, Status status)
        {
            anJ = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, b1);
            Eb = status;
        }
    }


    private Person anG;
    private final com.google.android.gms.plus.internal.h anH;

    public com.google.android.gms.plus.internal.e(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.plus.internal.h h1)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, h1.oz());
        anH = h1;
    }

    public jr a(com.google.android.gms.common.api.BaseImplementation.b b1, int i, String s)
    {
        dS();
        b1 = new e(b1);
        try
        {
            s = ((com.google.android.gms.plus.internal.d)hw()).a(b1, 1, i, -1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b1.a(DataHolder.av(8), null);
            return null;
        }
        return s;
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person"))
        {
            anG = pi.i(bundle.getByteArray("loaded_person"));
        }
        super.a(i, ibinder, bundle);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i, String s, Uri uri, String s1, String s2)
    {
        dS();
        if (b1 != null)
        {
            b1 = new b(b1);
        } else
        {
            b1 = null;
        }
        try
        {
            ((com.google.android.gms.plus.internal.d)hw()).a(b1, i, s, uri, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b1.a(DataHolder.av(8), null, null);
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, Moment moment)
    {
        dS();
        if (b1 != null)
        {
            b1 = new a(b1);
        } else
        {
            b1 = null;
        }
        try
        {
            moment = ky.a((pf)moment);
            ((com.google.android.gms.plus.internal.d)hw()).a(b1, moment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Moment moment) { }
        if (b1 == null)
        {
            throw new IllegalStateException(moment);
        } else
        {
            b1.aA(new Status(8, null, null));
            return;
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, Collection collection)
    {
        dS();
        b1 = new e(b1);
        try
        {
            ((com.google.android.gms.plus.internal.d)hw()).a(b1, new ArrayList(collection));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            b1.a(DataHolder.av(8), null);
        }
    }

    protected void a(jt jt1, com.google.android.gms.internal.jl.e e1)
        throws RemoteException
    {
        Bundle bundle = anH.oH();
        bundle.putStringArray("request_visible_actions", anH.oA());
        bundle.putString("auth_package", anH.oC());
        jt1.a(e1, (new jj(2)).aX(anH.oD()).a(jd.aT(anH.getAccountName())).a(lm.d(hv())).e(bundle));
    }

    protected String bK()
    {
        return "com.google.android.gms.plus.service.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    protected com.google.android.gms.plus.internal.d bN(IBinder ibinder)
    {
        return com.google.android.gms.plus.internal.d.a.bM(ibinder);
    }

    public boolean cj(String s)
    {
        return Arrays.asList(hv()).contains(s);
    }

    public void clearDefaultAccount()
    {
        dS();
        try
        {
            anG = null;
            ((com.google.android.gms.plus.internal.d)hw()).clearDefaultAccount();
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
        dS();
        String s;
        try
        {
            s = ((com.google.android.gms.plus.internal.d)hw()).getAccountName();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return s;
    }

    public Person getCurrentPerson()
    {
        dS();
        return anG;
    }

    public void j(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        a(b1, 20, null, null, null, "me");
    }

    public void k(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        dS();
        b1 = new e(b1);
        try
        {
            ((com.google.android.gms.plus.internal.d)hw()).a(b1, 2, 1, -1, null);
            return;
        }
        catch (RemoteException remoteexception)
        {
            b1.a(DataHolder.av(8), null);
        }
    }

    protected IInterface l(IBinder ibinder)
    {
        return bN(ibinder);
    }

    public void l(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        dS();
        clearDefaultAccount();
        b1 = new g(b1);
        try
        {
            ((com.google.android.gms.plus.internal.d)hw()).b(b1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            b1.h(8, null);
        }
    }

    public jr q(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        return a(b1, 0, s);
    }

    public void removeMoment(String s)
    {
        dS();
        try
        {
            ((com.google.android.gms.plus.internal.d)hw()).removeMoment(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException(s);
        }
    }
}

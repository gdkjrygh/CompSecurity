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
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ff;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.fm;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.ih;
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

public class com.google.android.gms.plus.internal.e extends ff
    implements GooglePlayServicesClient
{
    final class a extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.a.d TG;
        final com.google.android.gms.plus.internal.e Ud;

        public void Z(Status status)
        {
            Ud.a(Ud. new d(TG, status));
        }

        public a(com.google.android.gms.common.api.a.d d1)
        {
            Ud = com.google.android.gms.plus.internal.e.this;
            super();
            TG = d1;
        }
    }

    final class b extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.a.d TG;
        final com.google.android.gms.plus.internal.e Ud;

        public void a(DataHolder dataholder, String s, String s1)
        {
            Object obj;
            if (dataholder.getMetadata() != null)
            {
                obj = (PendingIntent)dataholder.getMetadata().getParcelable("pendingIntent");
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
            Ud.a(Ud. new c(TG, ((Status) (obj)), dataholder, s, s1));
        }

        public b(com.google.android.gms.common.api.a.d d1)
        {
            Ud = com.google.android.gms.plus.internal.e.this;
            super();
            TG = d1;
        }
    }

    final class c extends com.google.android.gms.internal.ff.d
        implements com.google.android.gms.plus.Moments.LoadMomentsResult
    {

        private final String EM;
        final com.google.android.gms.plus.internal.e Ud;
        private final String Ue;
        private MomentBuffer Uf;
        private final Status wJ;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            if (dataholder != null)
            {
                dataholder = new MomentBuffer(dataholder);
            } else
            {
                dataholder = null;
            }
            Uf = dataholder;
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public MomentBuffer getMomentBuffer()
        {
            return Uf;
        }

        public String getNextPageToken()
        {
            return EM;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public String getUpdated()
        {
            return Ue;
        }

        public void release()
        {
            if (Uf != null)
            {
                Uf.close();
            }
        }

        public c(com.google.android.gms.common.api.a.d d1, Status status, DataHolder dataholder, String s, String s1)
        {
            Ud = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, d1, dataholder);
            wJ = status;
            EM = s;
            Ue = s1;
        }
    }

    final class d extends com.google.android.gms.internal.ff.b
    {

        final com.google.android.gms.plus.internal.e Ud;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            if (d1 != null)
            {
                d1.b(wJ);
            }
        }

        protected void dx()
        {
        }

        public d(com.google.android.gms.common.api.a.d d1, Status status)
        {
            Ud = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, d1);
            wJ = status;
        }
    }

    final class e extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.a.d TG;
        final com.google.android.gms.plus.internal.e Ud;

        public void a(DataHolder dataholder, String s)
        {
            Object obj;
            if (dataholder.getMetadata() != null)
            {
                obj = (PendingIntent)dataholder.getMetadata().getParcelable("pendingIntent");
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
            Ud.a(Ud. new f(TG, ((Status) (obj)), dataholder, s));
        }

        public e(com.google.android.gms.common.api.a.d d1)
        {
            Ud = com.google.android.gms.plus.internal.e.this;
            super();
            TG = d1;
        }
    }

    final class f extends com.google.android.gms.internal.ff.d
        implements com.google.android.gms.plus.People.LoadPeopleResult
    {

        private final String EM;
        final com.google.android.gms.plus.internal.e Ud;
        private PersonBuffer Ug;
        private final Status wJ;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            if (dataholder != null)
            {
                dataholder = new PersonBuffer(dataholder);
            } else
            {
                dataholder = null;
            }
            Ug = dataholder;
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public String getNextPageToken()
        {
            return EM;
        }

        public PersonBuffer getPersonBuffer()
        {
            return Ug;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public void release()
        {
            if (Ug != null)
            {
                Ug.close();
            }
        }

        public f(com.google.android.gms.common.api.a.d d1, Status status, DataHolder dataholder, String s)
        {
            Ud = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, d1, dataholder);
            wJ = status;
            EM = s;
        }
    }

    final class g extends com.google.android.gms.plus.internal.a
    {

        private final com.google.android.gms.common.api.a.d TG;
        final com.google.android.gms.plus.internal.e Ud;

        public void e(int i, Bundle bundle)
        {
            if (bundle != null)
            {
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            } else
            {
                bundle = null;
            }
            bundle = new Status(i, null, bundle);
            Ud.a(Ud. new h(TG, bundle));
        }

        public g(com.google.android.gms.common.api.a.d d1)
        {
            Ud = com.google.android.gms.plus.internal.e.this;
            super();
            TG = d1;
        }
    }

    final class h extends com.google.android.gms.internal.ff.b
    {

        final com.google.android.gms.plus.internal.e Ud;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            Ud.disconnect();
            if (d1 != null)
            {
                d1.b(wJ);
            }
        }

        protected void dx()
        {
        }

        public h(com.google.android.gms.common.api.a.d d1, Status status)
        {
            Ud = com.google.android.gms.plus.internal.e.this;
            super(com.google.android.gms.plus.internal.e.this, d1);
            wJ = status;
        }
    }


    private Person Ub;
    private final com.google.android.gms.plus.internal.h Uc;

    public com.google.android.gms.plus.internal.e(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.plus.internal.h h1)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, h1.iP());
        Uc = h1;
    }

    public com.google.android.gms.plus.internal.e(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.plus.internal.h h1)
    {
        this(context, context.getMainLooper(), ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (new com.google.android.gms.internal.ff.c(connectioncallbacks))), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new com.google.android.gms.internal.ff.g(onconnectionfailedlistener))), h1);
    }

    public fk a(com.google.android.gms.common.api.a.d d1, int i, String s)
    {
        bT();
        d1 = new e(d1);
        try
        {
            s = ((com.google.android.gms.plus.internal.d)eM()).a(d1, 1, i, -1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            d1.a(DataHolder.empty(8), null);
            return null;
        }
        return s;
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person"))
        {
            Ub = ih.i(bundle.getByteArray("loaded_person"));
        }
        super.a(i, ibinder, bundle);
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i, String s, Uri uri, String s1, String s2)
    {
        bT();
        if (d1 != null)
        {
            d1 = new b(d1);
        } else
        {
            d1 = null;
        }
        try
        {
            ((com.google.android.gms.plus.internal.d)eM()).a(d1, i, s, uri, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            d1.a(DataHolder.empty(8), null, null);
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, Moment moment)
    {
        bT();
        if (d1 != null)
        {
            d1 = new a(d1);
        } else
        {
            d1 = null;
        }
        try
        {
            moment = gg.a((ie)moment);
            ((com.google.android.gms.plus.internal.d)eM()).a(d1, moment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Moment moment) { }
        if (d1 == null)
        {
            throw new IllegalStateException(moment);
        } else
        {
            d1.Z(new Status(8, null, null));
            return;
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, Collection collection)
    {
        bT();
        d1 = new e(d1);
        try
        {
            ((com.google.android.gms.plus.internal.d)eM()).a(d1, new ArrayList(collection));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            d1.a(DataHolder.empty(8), null);
        }
    }

    protected void a(fm fm1, com.google.android.gms.internal.ff.e e1)
        throws RemoteException
    {
        Bundle bundle = Uc.iX();
        bundle.putStringArray("request_visible_actions", Uc.iQ());
        fm1.a(e1, 0x43eea0, Uc.iT(), Uc.iS(), eL(), Uc.getAccountName(), bundle);
    }

    protected com.google.android.gms.plus.internal.d aR(IBinder ibinder)
    {
        return com.google.android.gms.plus.internal.d.a.aQ(ibinder);
    }

    protected String bg()
    {
        return "com.google.android.gms.plus.service.START";
    }

    public boolean bg(String s)
    {
        return Arrays.asList(eL()).contains(s);
    }

    protected String bh()
    {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    public void clearDefaultAccount()
    {
        bT();
        try
        {
            Ub = null;
            ((com.google.android.gms.plus.internal.d)eM()).clearDefaultAccount();
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
        bT();
        String s;
        try
        {
            s = ((com.google.android.gms.plus.internal.d)eM()).getAccountName();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return s;
    }

    public Person getCurrentPerson()
    {
        bT();
        return Ub;
    }

    public void l(com.google.android.gms.common.api.a.d d1)
    {
        a(d1, 20, null, null, null, "me");
    }

    public void m(com.google.android.gms.common.api.a.d d1)
    {
        bT();
        d1 = new e(d1);
        try
        {
            ((com.google.android.gms.plus.internal.d)eM()).a(d1, 2, 1, -1, null);
            return;
        }
        catch (RemoteException remoteexception)
        {
            d1.a(DataHolder.empty(8), null);
        }
    }

    public void n(com.google.android.gms.common.api.a.d d1)
    {
        bT();
        clearDefaultAccount();
        d1 = new g(d1);
        try
        {
            ((com.google.android.gms.plus.internal.d)eM()).b(d1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            d1.e(8, null);
        }
    }

    public fk o(com.google.android.gms.common.api.a.d d1, String s)
    {
        return a(d1, 0, s);
    }

    protected IInterface r(IBinder ibinder)
    {
        return aR(ibinder);
    }

    public void removeMoment(String s)
    {
        bT();
        try
        {
            ((com.google.android.gms.plus.internal.d)eM()).removeMoment(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException(s);
        }
    }
}

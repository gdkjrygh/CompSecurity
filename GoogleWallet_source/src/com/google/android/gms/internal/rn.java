// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.people.model.OwnerBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            kb, rg, ry, rm, 
//            kj, ro, kh, ra

public final class rn extends kb
{
    final class aa extends kb.b
        implements com.google.android.gms.people.Graph.LoadOwnersResult
    {

        private final Status EU;
        final rn aCC;
        private final OwnerBuffer aCQ;

        private void p(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            if (b1 != null)
            {
                b1.d(this);
            }
        }

        public final OwnerBuffer getOwners()
        {
            return aCQ;
        }

        public final Status getStatus()
        {
            return EU;
        }

        protected final void i(Object obj)
        {
            p((com.google.android.gms.common.api.BaseImplementation.b)obj);
        }

        protected final void iQ()
        {
            release();
        }

        public final void release()
        {
            if (aCQ != null)
            {
                aCQ.close();
            }
        }

        public aa(com.google.android.gms.common.api.BaseImplementation.b b1, Status status, OwnerBuffer ownerbuffer)
        {
            aCC = rn.this;
            super(rn.this, b1);
            EU = status;
            aCQ = ownerbuffer;
        }
    }

    final class ab extends kb.b
        implements com.google.android.gms.people.Images.LoadImageResult
    {

        private final Status EU;
        final rn aCC;
        private final ParcelFileDescriptor aCR;
        private final boolean aCS;
        private final int lh;
        private final int li;

        private void p(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            if (b1 != null)
            {
                b1.d(this);
            }
        }

        public final int getHeight()
        {
            return li;
        }

        public final ParcelFileDescriptor getParcelFileDescriptor()
        {
            return aCR;
        }

        public final Status getStatus()
        {
            return EU;
        }

        public final int getWidth()
        {
            return lh;
        }

        protected final void i(Object obj)
        {
            p((com.google.android.gms.common.api.BaseImplementation.b)obj);
        }

        protected final void iQ()
        {
            release();
        }

        public final void release()
        {
            if (aCR != null)
            {
                IOUtils.closeQuietly(aCR);
            }
        }

        public ab(com.google.android.gms.common.api.BaseImplementation.b b1, Status status, ParcelFileDescriptor parcelfiledescriptor, boolean flag, int j, int k)
        {
            aCC = rn.this;
            super(rn.this, b1);
            EU = status;
            aCR = parcelfiledescriptor;
            aCS = flag;
            lh = j;
            li = k;
        }
    }

    final class e extends kb.b
    {

        private final String aBg;
        final rn aCC;
        private final int aCF;
        private final String mAccount;

        private void b(com.google.android.gms.people.PeopleClient.OnDataChangedListener ondatachangedlistener)
        {
label0:
            {
                if (ondatachangedlistener == null)
                {
                    break MISSING_BLOCK_LABEL_54;
                }
                synchronized (rn.a(aCC))
                {
                    if (rn.a(aCC).containsKey(ondatachangedlistener))
                    {
                        break label0;
                    }
                }
                return;
            }
            hashmap;
            JVM INSTR monitorexit ;
            ondatachangedlistener = mAccount;
            ondatachangedlistener = aBg;
            int j = aCF;
            return;
            ondatachangedlistener;
            hashmap;
            JVM INSTR monitorexit ;
            throw ondatachangedlistener;
        }

        protected final void i(Object obj)
        {
            b((com.google.android.gms.people.PeopleClient.OnDataChangedListener)obj);
        }

        protected final void iQ()
        {
        }

        public e(com.google.android.gms.people.PeopleClient.OnDataChangedListener ondatachangedlistener, String s, String s1, int j)
        {
            aCC = rn.this;
            super(rn.this, ondatachangedlistener);
            mAccount = s;
            aBg = s1;
            aCF = j;
        }
    }

    final class n extends ra
    {

        final rn aCC;
        private final com.google.android.gms.common.api.BaseImplementation.b auM;

        public final void a(int i, Bundle bundle, Bundle bundle1)
        {
            Object obj = null;
            if (ro.qQ())
            {
                ro.t("PeopleClient", (new StringBuilder("Bundle callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nbundle=").append(bundle1).toString());
            }
            Status status = rn.b(i, null, bundle);
            if (bundle1 == null)
            {
                bundle = obj;
            } else
            {
                bundle = bundle1.getString("avatarurl");
            }
            aCC.b(aCC. new o(auM, status, bundle));
        }

        public n(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            aCC = rn.this;
            super();
            auM = b1;
        }
    }

    final class o extends kb.b
        implements com.google.android.gms.people.Images.SetAvatarResult
    {

        private final Status EU;
        final rn aCC;
        private final String vf;

        private void p(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            if (b1 != null)
            {
                b1.d(this);
            }
        }

        public final Status getStatus()
        {
            return EU;
        }

        protected final void i(Object obj)
        {
            p((com.google.android.gms.common.api.BaseImplementation.b)obj);
        }

        protected final void iQ()
        {
        }

        public o(com.google.android.gms.common.api.BaseImplementation.b b1, Status status, String s)
        {
            aCC = rn.this;
            super(rn.this, b1);
            EU = status;
            vf = s;
        }
    }

    final class r extends ra
    {

        final rn aCC;
        private final com.google.android.gms.people.PeopleClient.OnDataChangedListener aCN;

        public final void a(int i, Bundle bundle, Bundle bundle1)
        {
            if (ro.qQ())
            {
                ro.t("PeopleClient", (new StringBuilder("Bundle callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nbundle=").append(bundle1).toString());
            }
            if (i != 0)
            {
                ro.w("PeopleClient", "Non-success data changed callback received.");
                return;
            } else
            {
                aCC.b(aCC. new e(aCN, bundle1.getString("account"), bundle1.getString("pagegaiaid"), bundle1.getInt("scope")));
                return;
            }
        }
    }

    final class u extends ra
    {

        final rn aCC;
        private final com.google.android.gms.common.api.BaseImplementation.b auM;

        public final void a(int i, Bundle bundle, DataHolder dataholder)
        {
            Object obj = null;
            if (ro.qQ())
            {
                ro.t("PeopleClient", (new StringBuilder("Owner callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder).toString());
            }
            Status status = rn.b(i, null, bundle);
            if (dataholder == null)
            {
                bundle = obj;
            } else
            {
                bundle = new OwnerBuffer(dataholder);
            }
            aCC.b(aCC. new aa(auM, status, bundle));
        }

        public u(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            aCC = rn.this;
            super();
            auM = b1;
        }
    }

    final class v extends ra
    {

        final rn aCC;
        private final com.google.android.gms.common.api.BaseImplementation.b auM;

        public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1)
        {
            int j = 0;
            if (ro.qQ())
            {
                ro.t("PeopleClient", (new StringBuilder("Avatar callback: status=")).append(i).append(" resolution=").append(bundle).append(" pfd=").append(parcelfiledescriptor).toString());
            }
            bundle = rn.b(i, null, bundle);
            boolean flag;
            if (bundle1 != null)
            {
                flag = bundle1.getBoolean("rewindable");
                i = bundle1.getInt("width");
                j = bundle1.getInt("height");
            } else
            {
                i = 0;
                flag = false;
            }
            aCC.b(aCC. new ab(auM, bundle, parcelfiledescriptor, flag, i, j));
        }

        public v(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            aCC = rn.this;
            super();
            auM = b1;
        }
    }


    private static volatile Bundle aCy;
    private static volatile Bundle aCz;
    public final String Sw;
    private Long aCA;
    public final String aCw;
    private final HashMap aCx = new HashMap();

    public rn(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String s1)
    {
        super(context.getApplicationContext(), looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        aCA = null;
        aCw = s;
        Sw = s1;
    }

    private static Status a(int i, String s, Bundle bundle)
    {
        return new Status(i, s, v(bundle));
    }

    static HashMap a(rn rn1)
    {
        return rn1.aCx;
    }

    static Status b(int i, String s, Bundle bundle)
    {
        return a(i, s, bundle);
    }

    private static rg dr(IBinder ibinder)
    {
        return rg.a.dq(ibinder);
    }

    private void oY()
    {
        super.dR();
    }

    private rg qL()
        throws DeadObjectException
    {
        return (rg)super.iP();
    }

    private void u(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ry.V(bundle.getBoolean("use_contactables_api", true));
        rm.aCt.t(bundle);
        aCy = bundle.getBundle("config.email_type_map");
        aCz = bundle.getBundle("config.phone_type_map");
        if (true) goto _L1; else goto _L3
_L3:
        bundle;
        throw bundle;
    }

    private static PendingIntent v(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        } else
        {
            return (PendingIntent)bundle.getParcelable("pendingIntent");
        }
    }

    public final kh a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, int i)
    {
        b1 = new v(b1);
        try
        {
            s = qL().c(b1, s, s1, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b1.a(8, null, null, null);
            return null;
        }
        return s;
    }

    protected final void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (i == 0 && bundle != null)
        {
            u(bundle.getBundle("post_init_configuration"));
        }
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            bundle = bundle.getBundle("post_init_resolution");
        }
        super.a(i, ibinder, bundle);
    }

    public final void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, Uri uri, boolean flag)
    {
        oY();
        b1 = new n(b1);
        try
        {
            qL().a(b1, s, s1, uri, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b1.a(8, null, null);
        }
    }

    public final void a(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag, boolean flag1, String s, String s1, int i)
    {
        oY();
        b1 = new u(b1);
        try
        {
            qL().a(b1, flag, flag1, s, s1, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b1.a(8, null, null);
        }
    }

    protected final void a(kj kj1, kb.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", aCw);
        bundle.putString("real_client_package_name", Sw);
        bundle.putBoolean("support_new_image_callback", true);
        kj1.b(e1, 0x648278, getContext().getPackageName(), bundle);
    }

    public final kh b(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, int i, int j)
    {
        b1 = new v(b1);
        try
        {
            s = qL().b(b1, s, s1, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b1.a(8, null, null, null);
            return null;
        }
        return s;
    }

    public final void b(kb.b b1)
    {
        super.a(b1);
    }

    protected final String bK()
    {
        return "com.google.android.gms.people.service.START";
    }

    protected final String bL()
    {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    public final void disconnect()
    {
        HashMap hashmap = aCx;
        hashmap;
        JVM INSTR monitorenter ;
        if (isConnected())
        {
            r r1;
            for (Iterator iterator = aCx.values().iterator(); iterator.hasNext(); qL().a(r1, false, null, null, 0))
            {
                r1 = (r)iterator.next();
            }

        }
        break MISSING_BLOCK_LABEL_75;
        Object obj;
        obj;
        ro.b("PeopleClient", "Failed to unregister listener", ((Throwable) (obj)));
_L1:
        aCx.clear();
        hashmap;
        JVM INSTR monitorexit ;
        super.disconnect();
        return;
        obj;
        ro.b("PeopleClient", "PeopleService is in unexpected state", ((Throwable) (obj)));
          goto _L1
        obj;
        hashmap;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected final IInterface p(IBinder ibinder)
    {
        return dr(ibinder);
    }
}

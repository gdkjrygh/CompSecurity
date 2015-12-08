// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.dp;
import com.google.android.gms.wearable.n;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ab, ap, aq, z, 
//            ay

public final class ad
    implements n
{

    private static final ab.a a = new ab.a() {

        public final void a(ap ap1, com.google.android.gms.internal.dg.b b1, Object obj, dp dp)
            throws RemoteException
        {
            obj = (com.google.android.gms.wearable.n.a)obj;
            ap1.k.a(ap1, b1, obj, com.google.android.gms.wearable.internal.aq.c(dp));
        }

    };
    private static final ab.a b = new ab.a() {

        public final void a(ap ap1, com.google.android.gms.internal.dg.b b1, Object obj, dp dp)
            throws RemoteException
        {
            obj = (com.google.android.gms.wearable.n.b)obj;
            ap1.l.a(ap1, b1, obj, com.google.android.gms.wearable.internal.aq.d(dp));
        }

    };

    public ad()
    {
    }

    public final d a(c c1, com.google.android.gms.wearable.n.a a1)
    {
        return ab.a(c1, a, a1);
    }

    public final d b(c c1, com.google.android.gms.wearable.n.a a1)
    {
        return c1.a(new ay(c1, a1) {

            final com.google.android.gms.wearable.n.a c;
            final ad d;

            protected final void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                b1 = (ap)b1;
                com.google.android.gms.wearable.n.a a2 = c;
                ((ap) (b1)).k.a(b1, this, a2);
            }

            public final f c(Status status)
            {
                return status;
            }

            
            {
                d = ad.this;
                c = a1;
                super(c1);
            }
        });
    }

}

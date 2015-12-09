// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.k;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.i;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ch

public class cd
    implements i
{
    private static abstract class a extends com.google.android.gms.location.l.a
    {

        public k a(Status status)
        {
            return c(status);
        }

        public Status c(Status status)
        {
            return status;
        }

        public a(h h1)
        {
            super(h1);
        }
    }


    public cd()
    {
    }

    public com.google.android.gms.common.api.i a(h h1, PendingIntent pendingintent)
    {
        return h1.b(new a(h1, pendingintent) {

            final PendingIntent b;
            final cd c;

            protected void a(ch ch1)
                throws RemoteException
            {
            /* block-local class not found */
            class _cls1 {}

                _cls1 _lcls1 = new _cls1();
                ch1.a(b, _lcls1);
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                c = cd.this;
                b = pendingintent;
                super(h1);
            }
        });
    }

    public com.google.android.gms.common.api.i a(h h1, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        return h1.b(new a(h1, geofencingrequest, pendingintent) {

            final GeofencingRequest b;
            final PendingIntent c;
            final cd d;

            protected void a(ch ch1)
                throws RemoteException
            {
            /* block-local class not found */
            class _cls1 {}

                _cls1 _lcls1 = new _cls1();
                ch1.a(b, c, _lcls1);
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                d = cd.this;
                b = geofencingrequest;
                c = pendingintent;
                super(h1);
            }
        });
    }

    public com.google.android.gms.common.api.i a(h h1, List list)
    {
        return h1.b(new a(h1, list) {

            final List b;
            final cd c;

            protected void a(ch ch1)
                throws RemoteException
            {
            /* block-local class not found */
            class _cls1 {}

                _cls1 _lcls1 = new _cls1();
                ch1.a(b, _lcls1);
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                c = cd.this;
                b = list;
                super(h1);
            }
        });
    }

    public com.google.android.gms.common.api.i a(h h1, List list, PendingIntent pendingintent)
    {
        com.google.android.gms.location.GeofencingRequest.a a1 = new com.google.android.gms.location.GeofencingRequest.a();
        a1.a(list);
        a1.a(5);
        return a(h1, a1.a(), pendingintent);
    }
}

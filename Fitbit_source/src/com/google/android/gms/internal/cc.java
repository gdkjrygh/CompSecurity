// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.f;
import com.google.android.gms.location.k;
import com.google.android.gms.location.l;

// Referenced classes of package com.google.android.gms.internal:
//            ch

public class cc
    implements f
{
    private static abstract class a extends com.google.android.gms.location.l.a
    {

        public com.google.android.gms.common.api.k a(Status status)
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


    public cc()
    {
    }

    public Location a(h h1)
    {
        h1 = l.a(h1);
        try
        {
            h1 = h1.l();
        }
        // Misplaced declaration of an exception variable
        catch (h h1)
        {
            return null;
        }
        return h1;
    }

    public i a(h h1, PendingIntent pendingintent)
    {
        return h1.b(new a(h1, pendingintent) {

            final PendingIntent b;
            final cc c;

            protected void a(ch ch1)
                throws RemoteException
            {
                ch1.b(b);
                a(((com.google.android.gms.common.api.k) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                c = cc.this;
                b = pendingintent;
                super(h1);
            }
        });
    }

    public i a(h h1, Location location)
    {
        return h1.b(new a(h1, location) {

            final Location b;
            final cc c;

            protected void a(ch ch1)
                throws RemoteException
            {
                ch1.a(b);
                a(((com.google.android.gms.common.api.k) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                c = cc.this;
                b = location;
                super(h1);
            }
        });
    }

    public i a(h h1, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return h1.b(new a(h1, locationrequest, pendingintent) {

            final LocationRequest b;
            final PendingIntent c;
            final cc d;

            protected void a(ch ch1)
                throws RemoteException
            {
                ch1.a(b, c);
                a(((com.google.android.gms.common.api.k) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                d = cc.this;
                b = locationrequest;
                c = pendingintent;
                super(h1);
            }
        });
    }

    public i a(h h1, LocationRequest locationrequest, k k)
    {
        return h1.b(new a(h1, locationrequest, k) {

            final LocationRequest b;
            final k c;
            final cc d;

            protected void a(ch ch1)
                throws RemoteException
            {
                ch1.a(b, c, null);
                a(((com.google.android.gms.common.api.k) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                d = cc.this;
                b = locationrequest;
                c = k;
                super(h1);
            }
        });
    }

    public i a(h h1, LocationRequest locationrequest, k k, Looper looper)
    {
        return h1.b(new a(h1, locationrequest, k, looper) {

            final LocationRequest b;
            final k c;
            final Looper d;
            final cc e;

            protected void a(ch ch1)
                throws RemoteException
            {
                ch1.a(b, c, d);
                a(((com.google.android.gms.common.api.k) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                e = cc.this;
                b = locationrequest;
                c = k;
                d = looper;
                super(h1);
            }
        });
    }

    public i a(h h1, k k)
    {
        return h1.b(new a(h1, k) {

            final k b;
            final cc c;

            protected void a(ch ch1)
                throws RemoteException
            {
                ch1.a(b);
                a(((com.google.android.gms.common.api.k) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                c = cc.this;
                b = k;
                super(h1);
            }
        });
    }

    public i a(h h1, boolean flag)
    {
        return h1.b(new a(h1, flag) {

            final boolean b;
            final cc c;

            protected void a(ch ch1)
                throws RemoteException
            {
                ch1.a(b);
                a(((com.google.android.gms.common.api.k) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                a((ch)b1);
            }

            
            {
                c = cc.this;
                b = flag;
                super(h1);
            }
        });
    }
}

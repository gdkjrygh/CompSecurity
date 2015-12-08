// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.f;

// Referenced classes of package com.google.android.gms.location.internal:
//            i

public final class c
    implements com.google.android.gms.location.c
{
    private static abstract class a extends com.google.android.gms.location.h.a
    {

        public final g a(Status status)
        {
            return status;
        }

        public a(com.google.android.gms.common.api.c c1)
        {
            super(c1);
        }
    }


    public c()
    {
    }

    public final e a(com.google.android.gms.common.api.c c1, LocationRequest locationrequest, f f)
    {
        return c1.b(new a(c1, locationrequest, f) {

            final LocationRequest b;
            final f c;
            final c d;

            protected final volatile void a(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                ((i)b1).a(b, c);
                a(((g) (Status.a)));
            }

            
            {
                d = c.this;
                b = locationrequest;
                c = f;
                super(c2);
            }
        });
    }

    public final e a(com.google.android.gms.common.api.c c1, f f)
    {
        return c1.b(new a(c1, f) {

            final f b;
            final c c;

            protected final volatile void a(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                ((i)b1).a(b);
                a(((g) (Status.a)));
            }

            
            {
                c = c.this;
                b = f;
                super(c2);
            }
        });
    }
}

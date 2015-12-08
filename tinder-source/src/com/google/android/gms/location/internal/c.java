// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.ContentProviderClient;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;
import java.util.Map;

// Referenced classes of package com.google.android.gms.location.internal:
//            k, j, o, h, 
//            LocationRequestInternal, LocationRequestUpdateData, FusedLocationProviderResult

public final class c
    implements com.google.android.gms.location.c
{
    private static abstract class a extends com.google.android.gms.location.i.a
    {

        public final f c(Status status)
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

    public final Location a(com.google.android.gms.common.api.c c1)
    {
        c1 = i.a(c1);
        try
        {
            c1 = ((k) (c1)).f.a();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.c c1)
        {
            return null;
        }
        return c1;
    }

    public final d a(com.google.android.gms.common.api.c c1, LocationRequest locationrequest, g g)
    {
        return c1.b(new a(c1, locationrequest, g) {

            final LocationRequest c;
            final g d;
            final c e;

            protected final void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                Object obj1 = (k)b1;
                f.a a1 = new f.a(this) {

                    final _cls1 a;

                    public final void a(FusedLocationProviderResult fusedlocationproviderresult)
                    {
                        a.a(fusedlocationproviderresult.c);
                    }

            
            {
                a = _pcls1;
                super();
            }
                };
                LocationRequest locationrequest1 = c;
                Object obj = d;
                synchronized (((k) (obj1)).f)
                {
                    obj1 = ((k) (obj1)).f;
                    ((j) (obj1)).a.a();
                    obj = ((j) (obj1)).a(((g) (obj)));
                    ((h)((j) (obj1)).a.b()).a(LocationRequestUpdateData.a(LocationRequestInternal.a(locationrequest1), ((com.google.android.gms.location.n) (obj)), a1));
                }
                return;
                exception;
                b1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                e = c.this;
                c = locationrequest;
                d = g;
                super(c2);
            }
        });
    }

    public final d a(com.google.android.gms.common.api.c c1, g g)
    {
        return c1.b(new a(c1, g) {

            final g c;
            final c d;

            protected final void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                Object obj;
                j j1;
                k k1 = (k)b1;
                b1 = new f.a(this) {

                    final _cls2 a;

                    public final void a(FusedLocationProviderResult fusedlocationproviderresult)
                    {
                        a.a(fusedlocationproviderresult.c);
                    }

            
            {
                a = _pcls2;
                super();
            }
                };
                obj = c;
                j1 = k1.f;
                j1.a.a();
                u.a(obj, "Invalid null listener");
                Map map = j1.d;
                map;
                JVM INSTR monitorenter ;
                obj = (j.c)j1.d.remove(obj);
                if (j1.b != null && j1.d.isEmpty())
                {
                    j1.b.release();
                    j1.b = null;
                }
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_133;
                }
                obj.a = null;
                ((h)j1.a.b()).a(LocationRequestUpdateData.a(((com.google.android.gms.location.n) (obj)), b1));
                map;
                JVM INSTR monitorexit ;
                return;
                b1;
                map;
                JVM INSTR monitorexit ;
                throw b1;
            }

            
            {
                d = c.this;
                c = g;
                super(c2);
            }
        });
    }
}

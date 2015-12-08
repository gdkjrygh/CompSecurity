// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.j;

// Referenced classes of package com.google.android.gms.location.internal:
//            k, h

public final class p
    implements j
{

    public p()
    {
    }

    public final d a(c c1, LocationSettingsRequest locationsettingsrequest)
    {
        return c1.a(new com.google.android.gms.location.i.a(c1, locationsettingsrequest) {

            final LocationSettingsRequest c;
            final String d = null;
            final p e;

            protected final void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                boolean flag1 = true;
                b1 = (k)b1;
                LocationSettingsRequest locationsettingsrequest1 = c;
                String s = d;
                b1.l();
                k.a a1;
                boolean flag;
                if (locationsettingsrequest1 != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                u.b(flag, "locationSettingsRequest can't be null nor empty.");
                if (this != null)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                u.b(flag, "listener can't be null.");
                a1 = new k.a(this);
                ((h)b1.m()).a(locationsettingsrequest1, a1, s);
            }

            public final f c(Status status)
            {
                return new LocationSettingsResult(status);
            }

            
            {
                e = p.this;
                c = locationsettingsrequest;
                super(c1);
            }
        });
    }
}

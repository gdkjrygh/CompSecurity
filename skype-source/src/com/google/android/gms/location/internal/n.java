// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.i;

// Referenced classes of package com.google.android.gms.location.internal:
//            i

public final class n
    implements i
{

    public n()
    {
    }

    public final e a(c c1, LocationSettingsRequest locationsettingsrequest)
    {
        return c1.a(new com.google.android.gms.location.h.a(c1, locationsettingsrequest) {

            final LocationSettingsRequest b;
            final String c = null;
            final n d;

            public final g a(Status status)
            {
                return new LocationSettingsResult(status);
            }

            protected final volatile void a(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                ((com.google.android.gms.location.internal.i)b1).a(b, this, c);
            }

            
            {
                d = n.this;
                b = locationsettingsrequest;
                super(c1);
            }
        });
    }
}

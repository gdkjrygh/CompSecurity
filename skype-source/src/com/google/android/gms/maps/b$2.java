// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.a.t;
import com.google.android.gms.maps.model.c;

// Referenced classes of package com.google.android.gms.maps:
//            b, c

final class nit> extends com.google.android.gms.maps.a.t>
{

    final com.google.android.gms.maps.c a;
    final b b;

    public final void a()
    {
        a.deactivate();
    }

    public final void a(t t)
    {
        a.activate(new c.a(t) {

            final t a;
            final b._cls2 b;

            public final void onLocationChanged(Location location)
            {
                try
                {
                    a.a(location);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Location location)
                {
                    throw new c(location);
                }
            }

            
            {
                b = b._cls2.this;
                a = t1;
                super();
            }
        });
    }

    _cls1.a(b b1, com.google.android.gms.maps.c c1)
    {
        b = b1;
        a = c1;
        super();
    }
}

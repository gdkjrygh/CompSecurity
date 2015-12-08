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

final class a
    implements a
{

    final t a;
    final c b;

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

    <init>(<init> <init>1, t t1)
    {
        b = <init>1;
        a = t1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/maps/b$2

/* anonymous class */
    final class b._cls2 extends com.google.android.gms.maps.a.c.a
    {

        final com.google.android.gms.maps.c a;
        final b b;

        public final void a()
        {
            a.deactivate();
        }

        public final void a(t t1)
        {
            a.activate(new b._cls2._cls1(this, t1));
        }

            
            {
                b = b1;
                a = c1;
                super();
            }
    }

}

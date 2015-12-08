// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.j.l;

// Referenced classes of package com.google.android.m4b.maps.q:
//            p, f

public class a extends l
{

    protected final p d = new p() {

        private a a;

        public final void a()
        {
            a.a(a);
        }

        public final IInterface b()
        {
            return (f)a.l();
        }

            
            {
                a = a.this;
                super();
            }
    };
    private final String e;

    public a(Context context, Looper looper, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d1, String s, g g)
    {
        super(context, looper, 23, b1, d1, g);
        e = s;
    }

    static void a(a a1)
    {
        a1.k();
    }

    protected final IInterface a(IBinder ibinder)
    {
        return f.a.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected final String b()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected final Bundle j()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", e);
        return bundle;
    }
}

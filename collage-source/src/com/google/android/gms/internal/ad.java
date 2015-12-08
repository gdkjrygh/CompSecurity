// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            ae, ac, hh, gw, 
//            n

public class ad
{

    public ad()
    {
    }

    private ac a(Context context, VersionInfoParcel versioninfoparcel, hh hh1, n n)
    {
        context = new ae(context, versioninfoparcel, n);
        context.a(new ac.a(hh1, context) {

            final hh a;
            final ac b;
            final ad c;

            public void a()
            {
                a.b(b);
            }

            
            {
                c = ad.this;
                a = hh1;
                b = ac1;
                super();
            }
        });
        return context;
    }

    static ac a(ad ad1, Context context, VersionInfoParcel versioninfoparcel, hh hh1, n n)
    {
        return ad1.a(context, versioninfoparcel, hh1, n);
    }

    public Future a(Context context, VersionInfoParcel versioninfoparcel, String s, n n)
    {
        hh hh1 = new hh();
        gw.a.post(new zzbc._cls1(this, context, versioninfoparcel, hh1, n, s));
        return hh1;
    }
}

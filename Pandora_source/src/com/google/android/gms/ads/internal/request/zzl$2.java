// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzbx;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzfx;
import com.google.android.gms.internal.zzy;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

class b
    implements Runnable
{

    final JSONObject a;
    final String b;
    final zzl c;

    public void run()
    {
        zzl.zza(c, zzl.zzeu().zzda());
        com.google.android.gms.ads.internal.request.zzl.zzb(c).zza(new com.google.android.gms.internal.zzfx.zzd() {

            final zzl._cls2 a;

            public void a(zzy zzy1)
            {
                try
                {
                    zzy1.zza("AFMA_getAdapterLessMediationAd", a.a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zzy zzy1)
                {
                    zzb.zzb("Error requesting an ad url", zzy1);
                }
                zzl.zzet().zzH(a.b);
            }

            public void zza(Object obj)
            {
                a((zzy)obj);
            }

            
            {
                a = zzl._cls2.this;
                super();
            }
        }, new com.google.android.gms.internal.zzfx.zza() {

            final zzl._cls2 a;

            public void run()
            {
                zzl.zzet().zzH(a.b);
            }

            
            {
                a = zzl._cls2.this;
                super();
            }
        });
    }

    _cls2.a(zzl zzl1, JSONObject jsonobject, String s)
    {
        c = zzl1;
        a = jsonobject;
        b = s;
        super();
    }
}

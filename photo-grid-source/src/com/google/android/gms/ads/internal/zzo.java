// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.qa;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            p, zza

public class zzo
{

    private final zza a;
    private final Runnable b;
    private AdRequestParcel c;
    private boolean d;
    private boolean e;
    private long f;

    public zzo(zza zza1)
    {
        this(zza1, new zza(qa.a));
    }

    private zzo(com.google.android.gms.ads.internal.zza zza1, zza zza2)
    {
        d = false;
        e = false;
        f = 0L;
        a = zza2;
        b = new p(this, new WeakReference(zza1));
    }

    static boolean a(zzo zzo1)
    {
        zzo1.d = false;
        return false;
    }

    static AdRequestParcel b(zzo zzo1)
    {
        return zzo1.c;
    }

    public void cancel()
    {
        d = false;
        a.removeCallbacks(b);
    }

    public void pause()
    {
        e = true;
        if (d)
        {
            a.removeCallbacks(b);
        }
    }

    public void resume()
    {
        e = false;
        if (d)
        {
            d = false;
            zza(c, f);
        }
    }

    public void zza(AdRequestParcel adrequestparcel, long l)
    {
        if (d)
        {
            zzb.zzaH("An ad refresh is already scheduled.");
        } else
        {
            c = adrequestparcel;
            d = true;
            f = l;
            if (!e)
            {
                zzb.zzaG((new StringBuilder("Scheduling ad refresh ")).append(l).append(" milliseconds from now.").toString());
                a.postDelayed(b, l);
                return;
            }
        }
    }

    public boolean zzbp()
    {
        return d;
    }

    public void zzg(AdRequestParcel adrequestparcel)
    {
        zza(adrequestparcel, 60000L);
    }

    private class zza
    {

        private final Handler a;

        public boolean postDelayed(Runnable runnable, long l)
        {
            return a.postDelayed(runnable, l);
        }

        public void removeCallbacks(Runnable runnable)
        {
            a.removeCallbacks(runnable);
        }

        public zza(Handler handler)
        {
            a = handler;
        }
    }

}

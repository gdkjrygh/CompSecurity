// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zznr;
import com.google.android.gms.internal.zznu;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.analytics:
//            zzb

public class zza extends zznr
{

    private final zzf b;
    private boolean c;

    public zza(zzf zzf1)
    {
        super(zzf1.h(), zzf1.d());
        b = zzf1;
    }

    protected void a(zzno zzno1)
    {
        zzno1 = (zzip)zzno1.b(com/google/android/gms/internal/zzip);
        if (TextUtils.isEmpty(zzno1.b()))
        {
            zzno1.b(b.p().b());
        }
        if (c && TextUtils.isEmpty(zzno1.d()))
        {
            com.google.android.gms.analytics.internal.zza zza1 = b.o();
            zzno1.d(zza1.c());
            zzno1.a(zza1.b());
        }
    }

    public void a(String s)
    {
        zzu.a(s);
        b(s);
        n().add(new zzb(b, s));
    }

    public void b(String s)
    {
        s = zzb.a(s);
        ListIterator listiterator = n().listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            if (s.equals(((zznu)listiterator.next()).a()))
            {
                listiterator.remove();
            }
        } while (true);
    }

    public void b(boolean flag)
    {
        c = flag;
    }

    zzf k()
    {
        return b;
    }

    public zzno l()
    {
        zzno zzno1 = m().a();
        zzno1.a(b.q().c());
        zzno1.a(b.r().b());
        b(zzno1);
        return zzno1;
    }
}

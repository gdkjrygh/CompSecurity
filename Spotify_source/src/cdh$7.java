// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.overlay.zzd;
import java.util.Map;

final class 
    implements cdi
{

    public final void a(ckw ckw1, Map map)
    {
        map = ckw1.h();
        if (map != null)
        {
            map.a();
            return;
        }
        ckw1 = ckw1.i();
        if (ckw1 != null)
        {
            ckw1.a();
            return;
        } else
        {
            bka.e("A GMSG tried to close something that wasn't an overlay.");
            return;
        }
    }

    ()
    {
    }
}

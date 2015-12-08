// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;

final class 
    implements cdi
{

    public final void a(ckw ckw1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            bka.e("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new ckc(ckw1.getContext(), ckw1.n().b, map)).e();
            return;
        }
    }

    ()
    {
    }
}

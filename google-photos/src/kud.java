// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;

final class kud
    implements kuf
{

    kud()
    {
    }

    public final void a(kxu kxu1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            b.m("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            kwv.a(((kwr) (new kxq(kxu1.getContext(), kxu1.m().b, map))).c);
            return;
        }
    }
}

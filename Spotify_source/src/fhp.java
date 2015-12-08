// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

public final class fhp
{

    private fhn a;

    protected fhp(fhn fhn1)
    {
        a = fhn1;
        super();
    }

    public final fho a(com.spotify.mobile.android.spotlets.share.model.Network.Type type)
    {
        switch (fhn._cls7.a[type.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new fho(a, (fhs)fhn.l(a).get(com.spotify.mobile.android.spotlets.share.model.Network.Type.a), fhn.q(a));

        case 2: // '\002'
            return new fho(a, (fhs)fhn.l(a).get(com.spotify.mobile.android.spotlets.share.model.Network.Type.b), fhn.r(a));

        case 3: // '\003'
            return new fho(a, (fhs)fhn.l(a).get(com.spotify.mobile.android.spotlets.share.model.Network.Type.c), fhn.s(a));
        }
    }
}

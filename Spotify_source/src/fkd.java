// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.tinkerbell.Onboarding;

public final class fkd
    implements fka
{

    public fkd()
    {
    }

    public final String a()
    {
        return "spotify:tinkerbell:onboarding:player-bar";
    }

    public final void a(Context context)
    {
        ((giq)dmz.a(giq)).b(context).b().a(Onboarding.d, false).b();
    }
}

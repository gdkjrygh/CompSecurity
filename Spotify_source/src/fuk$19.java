// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

final class ng.Object
    implements fxo
{

    private String a;
    private fuk b;

    public final void a(fxp fxp)
    {
        b.a(com.spotify.mobile.android.util.vent.Event.w);
        b.b.startService(RadioActionsService.a(b.b, a, b.c, b.d));
    }

    ng.String(fuk fuk1, String s)
    {
        b = fuk1;
        a = s;
        super();
    }
}

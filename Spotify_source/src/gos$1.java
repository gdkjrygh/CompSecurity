// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

final class ang.Object
    implements android.view.nClickListener
{

    private gos a;

    public final void onClick(View view)
    {
        if (gos.a(a))
        {
            a.k().startService(RadioActionsService.b(a.k(), ((goo) (a)).a, a.v_(), com.spotify.mobile.android.util.viewuri.i.SubView.g));
        } else
        if (gos.b(a) != null)
        {
            a.k().startService(RadioActionsService.a(a.k(), (RadioStationModel)gos.c(a), a.v_(), com.spotify.mobile.android.util.viewuri.i.SubView.g));
            return;
        }
    }

    (gos gos1)
    {
        a = gos1;
        super();
    }
}

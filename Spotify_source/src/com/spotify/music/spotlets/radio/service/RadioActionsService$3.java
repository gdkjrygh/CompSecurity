// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.service;

import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dwx;
import gex;
import gox;
import gpl;

// Referenced classes of package com.spotify.music.spotlets.radio.service:
//            RadioActionsService

final class a
    implements dwx
{

    private RadioActionsService a;

    public final void a(Flags flags)
    {
        RadioActionsService.b(a).h = gex.a(flags);
        RadioActionsService.b(a).g = gpl.a(flags);
    }

    (RadioActionsService radioactionsservice)
    {
        a = radioactionsservice;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;

final class ang.Object
    implements android.view.nClickListener
{

    private gop a;

    public final void onClick(View view)
    {
        gop gop1 = a;
        fuj fuj = gop.d(a);
        view = (RadioStationsModel)view.getTag();
        fud.a(gop1.k(), fuj, view);
    }

    (gop gop1)
    {
        a = gop1;
        super();
    }
}

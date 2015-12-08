// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

final class ang.Object
    implements android.view.nLongClickListener
{

    private gok a;

    public final boolean onLongClick(View view)
    {
        gok gok1 = a;
        view = (RadioStationModel)view.getTag();
        fud.a(gok1.getContext(), gok1.c, view);
        return true;
    }

    (gok gok1)
    {
        a = gok1;
        super();
    }
}

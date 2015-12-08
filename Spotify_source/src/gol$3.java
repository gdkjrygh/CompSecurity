// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

final class ang.Object
    implements android.view.nLongClickListener
{

    private gol a;

    public final boolean onLongClick(View view)
    {
        gol gol1 = a;
        view = (RadioStationModel)view.getTag();
        fud.a(gol1.c, gol1.i, view);
        return true;
    }

    (gol gol1)
    {
        a = gol1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

final class ang.Object
    implements android.view.nClickListener
{

    private gok a;

    public final void onClick(View view)
    {
        view = gok.b(view);
        if (gpl.a(gok.c(a)))
        {
            view = gms.a(a.getContext(), ((RadioStationModel) (view)).uri).a(((RadioStationModel) (view)).title).a;
            a.getContext().startActivity(view);
            return;
        } else
        {
            gok gok1 = a;
            fos.a(gok1.getContext(), ((RadioStationModel) (view)).seeds, gok1.a, gok1.b);
            return;
        }
    }

    (gok gok1)
    {
        a = gok1;
        super();
    }
}

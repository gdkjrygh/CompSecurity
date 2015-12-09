// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

final class ang.Object
    implements android.view.nClickListener
{

    private emr a;

    public final void onClick(View view)
    {
        view = (RadioStationModel)view.getTag();
        view = gms.a(a.d, ((RadioStationModel) (view)).uri).a(((RadioStationModel) (view)).title).a;
        a.d.startActivity(view);
    }

    (emr emr1)
    {
        a = emr1;
        super();
    }
}

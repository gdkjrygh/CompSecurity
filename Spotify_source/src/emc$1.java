// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.view.nClickListener
{

    private emc a;

    public final void onClick(View view)
    {
        emc.a(a);
        fop.a(a.k(), a.v_(), ClientEventFactory.a("chart", com.spotify.mobile.android.util.Event.SubEvent.X, null, null));
        view = emc.b(a);
        com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions;
        boolean flag;
        if (((emg) (view)).j != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.b(flag, "This should be called after the view is ready.");
        playoptions = (new com.spotify.mobile.android.cosmos.player.v2.tions.Builder()).playerOptionsOverride(true, false, false).build();
        ((emg) (view)).f.play(((emg) (view)).j, playoptions);
    }

    (emc emc1)
    {
        a = emc1;
        super();
    }
}

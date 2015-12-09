// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.spotlets.browse.view.CoverCardHorizontal;
import com.spotify.mobile.android.spotlets.tinkerbell.Onboarding;
import com.spotify.mobile.android.spotlets.tinkerbell.TooltipContainer;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private ekt a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (a.k() == null)
        {
            return;
        }
        view = ((CoverCardHorizontal)view).a;
        adapterview = ((Playlist) (view)).b;
        view = ((Playable) (view)).c;
        if (i == 0)
        {
            ekt.b(a);
            fjm.a(TooltipContainer.a(a.k()));
        }
        u u = a.k();
        gip gip1 = Onboarding.a;
        String s = gip1.a;
        AsyncTask.execute(new <init>(u, gip1));
        ekt.c(a).a(a.k(), i, "featured", adapterview, view);
    }

    (ekt ekt1)
    {
        a = ekt1;
        super();
    }
}

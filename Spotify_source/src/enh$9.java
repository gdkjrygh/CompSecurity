// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.view.nClickListener
{

    private enh a;

    public final void onClick(View view)
    {
        enh.h(a);
        Object obj = a.k();
        com.spotify.mobile.android.util.viewuri.Verified verified = enh.f(a);
        boolean flag;
        if (enh.g(a))
        {
            view = com.spotify.mobile.android.util.Event.SubEvent.bJ;
        } else
        {
            view = com.spotify.mobile.android.util.Event.SubEvent.bI;
        }
        fop.a(((android.content.Context) (obj)), verified, ClientEventFactory.a("artist", view, null, null));
        view = a.b;
        obj = enh.i(a);
        if (!enh.g(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        enh.j(a);
        view.a(((String) (obj)), flag);
    }

    (enh enh1)
    {
        a = enh1;
        super();
    }
}

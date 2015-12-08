// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;

final class ang.Object
    implements android.view.nClickListener
{

    private fig a;

    public final void onClick(View view)
    {
        fig.W(a);
        u u = a.k();
        Verified verified = fig.V(a);
        if (fig.al(a))
        {
            view = com.spotify.mobile.android.util.Event.SubEvent.bJ;
        } else
        {
            view = com.spotify.mobile.android.util.Event.SubEvent.bI;
        }
        fop.a(u, verified, ClientEventFactory.a("show", view, null, null));
        if (fig.al(a))
        {
            CollectionService.b(a.k(), fig.G(a), fig.V(a).toString(), fig.w(a), com.spotify.mobile.android.spotlets.collection.service.tionService.Messaging.b);
        } else
        {
            CollectionService.a(a.k(), fig.G(a), fig.V(a).toString(), fig.w(a), com.spotify.mobile.android.spotlets.collection.service.tionService.Messaging.b);
        }
        fig.J(a);
    }

    (fig fig1)
    {
        a = fig1;
        super();
    }
}

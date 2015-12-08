// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.ClientEvent;

final class ang.Object
    implements gav
{

    private fig a;

    public final void a(gfp gfp1)
    {
        fig.a(a, gfp1);
        fig.b(a).a(fig.ab(a));
        fig.b(a).b(a.a);
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.Event.Event.aa);
        clientevent.a("order", fig.ab(a).a());
        clientevent.a("reversed", String.valueOf(gfp1.b()));
        fig.W(a);
        fop.a(a.k(), fig.V(a), clientevent);
        fig.ac(a).a(fig.G(a), fig.ab(a).a());
        fig.b(a, true);
    }

    (fig fig1)
    {
        a = fig1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements android.view.nClickListener
{

    private fjd a;

    public final void onClick(View view)
    {
        fjd.d(a);
        view = fjd.e(a);
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.Event.Event.O, com.spotify.mobile.android.util.Event.SubEvent.U);
        fop.a(((fjj) (view)).a, ViewUri.o, com.spotify.mobile.android.util.viewuri.i.SubView.a, clientevent);
    }

    (fjd fjd1)
    {
        a = fjd1;
        super();
    }
}

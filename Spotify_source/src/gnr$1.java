// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.music.spotlets.discover.model.DiscoverStoryModel;

final class ang.Object
    implements android.view.nClickListener
{

    private gnr a;

    public final void onClick(View view)
    {
        DiscoverStoryModel discoverstorymodel = gnr.a(view);
        int i = ((Integer)view.getTag(0x7f110047)).intValue();
        view = a.getContext();
        String s = gnr.a(a);
        int j = gnr.b(a);
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.Event.Event.O, com.spotify.mobile.android.util.Event.SubEvent.V);
        clientevent.a("title", discoverstorymodel.title);
        clientevent.a("target_uri", discoverstorymodel.titleUri);
        clientevent.a("context", (new StringBuilder("section-")).append(j).append('/').append(s).append("/item-").append(i).toString());
        gnv.a(view, clientevent);
        a.getContext().startActivity(gms.a(a.getContext(), discoverstorymodel.titleUri).a);
    }

    (gnr gnr1)
    {
        a = gnr1;
        super();
    }
}

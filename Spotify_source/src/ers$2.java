// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private ers a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (ers.a(a).e().a().getAdapter().getItem(i)));
        if (adapterview instanceof ConcertResult)
        {
            adapterview = (ConcertResult)adapterview;
            Object obj = a.b;
            view = a.k();
            obj = ((ert) (obj)).b;
            Assertion.a(adapterview);
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.Event.Event.O, com.spotify.mobile.android.util.Event.SubEvent.dF);
            ese.a(clientevent, adapterview.getConcert());
            ese.a(clientevent, adapterview.getSourceType(), i);
            ((ese) (obj)).a(com.spotify.mobile.android.util.viewuri.i.SubView.Y, clientevent);
            view.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(adapterview.getClickThruUrl())));
        }
    }

    (ers ers1)
    {
        a = ers1;
        super();
    }
}

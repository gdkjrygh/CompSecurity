// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.spotlets.connect.Tech;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private erb a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ConnectDevice connectdevice;
        erc erc1;
label0:
        {
            connectdevice = (ConnectDevice)view.getTag();
            erc1 = erb.a(a);
            boolean flag = view.isEnabled();
            if (!connectdevice.e && connectdevice.g && flag)
            {
                view = erc1.g;
                ClientEvent clientevent;
                if (connectdevice.f)
                {
                    adapterview = com.spotify.mobile.android.util.viewuri.i.SubView.x;
                } else
                if (connectdevice.j)
                {
                    adapterview = com.spotify.mobile.android.util.viewuri.i.SubView.v;
                } else
                if (Tech.a(connectdevice) == Tech.b)
                {
                    adapterview = com.spotify.mobile.android.util.viewuri.i.SubView.t;
                } else
                if (connectdevice.i)
                {
                    adapterview = com.spotify.mobile.android.util.viewuri.i.SubView.u;
                } else
                {
                    adapterview = com.spotify.mobile.android.util.viewuri.i.SubView.w;
                }
                clientevent = new ClientEvent(com.spotify.mobile.android.util.Event.Event.O, com.spotify.mobile.android.util.Event.SubEvent.ad);
                clientevent.a("name", connectdevice.d);
                fop.a(((erg) (view)).a, ViewUri.bA, adapterview, clientevent);
                if (!erc1.e.J())
                {
                    break label0;
                }
                erc1.b(connectdevice.b);
            }
            return;
        }
        erc1.a(connectdevice.b);
    }

    (erb erb1)
    {
        a = erb1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private ene a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = ene.b(a).b(i);
        j;
        JVM INSTR tableswitch 0 0: default 32
    //                   0 86;
           goto _L1 _L2
_L1:
        Assertion.a((new StringBuilder("Section ")).append(j).append(" is unhandled.").toString());
_L4:
        adapterview = null;
_L7:
        if (adapterview != null)
        {
            ene.f(a);
            fop.a(a.k(), ViewUri.bj, adapterview);
        }
        return;
_L2:
        adapterview = ((AdapterView) (view.getTag()));
        if (!(adapterview instanceof RecentlyPlayedItem)) goto _L4; else goto _L3
_L3:
        view = (RecentlyPlayedItem)adapterview;
        if (!((RecentlyPlayedItem) (view)).available) goto _L6; else goto _L5
_L5:
        adapterview = ((RecentlyPlayedItem) (view)).navigationLink;
        if (((RecentlyPlayedItem) (view)).type == com.spotify.mobile.android.spotlets.recentlyplayed.lyPlayedItem.Type.e)
        {
            adapterview = gpl.b(gpl.c(((RecentlyPlayedItem) (view)).navigationLink));
        }
        a.a(gms.a(a.k(), adapterview).a);
        l = ene.b(a).a(i, 0);
        adapterview = ClientEventFactory.a("", com.spotify.mobile.android.util.Event.SubEvent.L, ((RecentlyPlayedItem) (view)).link, Long.valueOf(l));
          goto _L7
_L6:
        switch (a[((RecentlyPlayedItem) (view)).type.ordinal()])
        {
        default:
            dmz.a(ggc);
            ggc.a(a.k(), 0x7f08057a);
            adapterview = null;
            break;

        case 1: // '\001'
            dmz.a(ggc);
            ggc.a(a.k(), 0x7f08057b);
            adapterview = null;
            break;

        case 2: // '\002'
            dmz.a(ggc);
            ggc.a(a.k(), 0x7f080575);
            adapterview = null;
            break;

        case 3: // '\003'
            dmz.a(ggc);
            ggc.a(a.k(), 0x7f080576);
            adapterview = null;
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    (ene ene1)
    {
        a = ene1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private emy a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = emy.c(a).b(i);
        j;
        JVM INSTR tableswitch 0 9: default 68
    //                   0 93
    //                   1 228
    //                   2 191
    //                   3 265
    //                   4 302
    //                   5 68
    //                   6 338
    //                   7 592
    //                   8 592
    //                   9 154;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7 _L8 _L8 _L9
_L1:
        throw new AssertionError((new StringBuilder("Unexpected section ")).append(j).toString());
_L2:
        a.a(gms.a(a.k(), enj.b).a);
        adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.Event.SubEvent.aP, null, null);
_L11:
        if (adapterview != null)
        {
            emy.j(a);
            fop.a(a.k(), ViewUri.bj, adapterview);
        }
        return;
_L9:
        a.a(gms.a(a.k(), enb.a).a);
        adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.Event.SubEvent.aQ, null, null);
        continue; /* Loop/switch isn't completed */
_L4:
        a.a(gms.a(a.k(), eng.a).a);
        adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.Event.SubEvent.aO, null, null);
        continue; /* Loop/switch isn't completed */
_L3:
        a.a(gms.a(a.k(), enk.b).a);
        adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.Event.SubEvent.aU, null, null);
        continue; /* Loop/switch isn't completed */
_L5:
        a.a(gms.a(a.k(), eni.a).a);
        adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.Event.SubEvent.aN, null, null);
        continue; /* Loop/switch isn't completed */
_L6:
        a.a(gms.a(a.k(), "spotify:internal:collection:shows").a);
        adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.Event.SubEvent.aR, null, null);
        continue; /* Loop/switch isn't completed */
_L7:
        adapterview = ((AdapterView) (view.getTag()));
        if (adapterview instanceof RecentlyPlayedItem)
        {
            view = (RecentlyPlayedItem)adapterview;
            if (((RecentlyPlayedItem) (view)).available)
            {
                if (gpl.e(((RecentlyPlayedItem) (view)).navigationLink))
                {
                    adapterview = gpl.b(gpl.c(((RecentlyPlayedItem) (view)).navigationLink));
                } else
                {
                    adapterview = ((RecentlyPlayedItem) (view)).navigationLink;
                }
                adapterview = gms.a(a.k(), adapterview).a;
                adapterview.putExtra("referer", ViewUri.bj);
                a.a(adapterview);
                l = emy.c(a).a(i, 6);
                adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.Event.SubEvent.L, ((RecentlyPlayedItem) (view)).link, Long.valueOf(l));
            } else
            {
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
                if (false)
                {
                }
            }
        } else
        {
            adapterview = null;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        adapterview = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    (emy emy1)
    {
        a = emy1;
        super();
    }
}

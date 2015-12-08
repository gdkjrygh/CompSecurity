// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private enc a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i = enc.e(a).b(i);
        switch (i)
        {
        default:
            throw new AssertionError((new StringBuilder("Unexpected section ")).append(i).toString());

        case 0: // '\0'
            a.a(ClientEventFactory.a("shows", com.spotify.mobile.android.util.Event.SubEvent.aS, null, null));
            a.a(gms.a(a.k(), "spotify:internal:collection:unplayed-episodes").a);
            // fall through

        case 4: // '\004'
            return;

        case 1: // '\001'
            a.a(ClientEventFactory.a("shows", com.spotify.mobile.android.util.Event.SubEvent.aT, null, null));
            a.a(gms.a(a.k(), "spotify:internal:collection:offlined-episodes").a);
            return;

        case 2: // '\002'
            a.a(ClientEventFactory.a("shows", com.spotify.mobile.android.util.Event.SubEvent.aR, null, null));
            a.a(gms.a(a.k(), "spotify:internal:collection:saved-episodes").a);
            return;

        case 3: // '\003'
            adapterview = (Show)view.getTag();
            break;
        }
        a.a(ClientEventFactory.a("shows", com.spotify.mobile.android.util.Event.SubEvent.aj, adapterview.b(), Long.valueOf(l)));
        a.a(gms.a(a.k(), adapterview.b()).a(adapterview.a()).a);
    }

    (enc enc1)
    {
        a = enc1;
        super();
    }
}

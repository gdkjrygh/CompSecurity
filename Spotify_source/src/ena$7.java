// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private ena a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = ((AdapterView) (view.getTag()));
            if (adapterview instanceof fdj)
            {
                adapterview = (fdj)adapterview;
                a.a(ClientEventFactory.a("playlists", com.spotify.mobile.android.util.Event.SubEvent.au, adapterview.a(), Long.valueOf(l)));
                if (!ena.a(a).a())
                {
                    break label0;
                }
                ena.a(a).a(adapterview.a(), adapterview.b(), false);
            }
            return;
        }
        a.a(gms.a(a.k(), adapterview.a()).a(adapterview.b()).a);
    }

    (ena ena1)
    {
        a = ena1;
        super();
    }
}

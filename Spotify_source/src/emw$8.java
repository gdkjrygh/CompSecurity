// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private emw a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
label1:
            {
                adapterview = ((AdapterView) (view.getTag()));
                if (adapterview instanceof enr)
                {
                    adapterview = (enr)adapterview;
                    if (adapterview.getCollectionUri().length() <= 0)
                    {
                        break label0;
                    }
                    a.a(ClientEventFactory.a("albums", com.spotify.mobile.android.util.Event.SubEvent.as, adapterview.getUri(), Long.valueOf(l)));
                    if (!emw.a(a).a())
                    {
                        break label1;
                    }
                    emw.a(a).a(adapterview.getCollectionUri(), adapterview.getName(), false);
                }
                return;
            }
            a.a(gms.a(a.k(), adapterview.getCollectionUri()).a(adapterview.getName()).a);
            return;
        }
        dmz.a(ggc);
        ggc.a(a.k(), 0x7f080575);
    }

    (emw emw1)
    {
        a = emw1;
        super();
    }
}

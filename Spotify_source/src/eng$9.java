// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private eng a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
label1:
            {
                adapterview = ((AdapterView) (view.getTag()));
                if (adapterview instanceof dnv)
                {
                    adapterview = (dnv)adapterview;
                    if (adapterview.c().length() <= 0)
                    {
                        break label0;
                    }
                    eng.m(a);
                    fop.a(a.k(), eng.b(a), ClientEventFactory.a("albums", com.spotify.mobile.android.util.Event.SubEvent.as, adapterview.c(), Long.valueOf(l)));
                    if (!eng.n(a).a())
                    {
                        break label1;
                    }
                    eng.n(a).a(adapterview.c(), adapterview.h(), false);
                }
                return;
            }
            a.k().startActivity(gms.a(a.k(), adapterview.c()).a(adapterview.h()).a);
            return;
        }
        dmz.a(ggc);
        ggc.a(a.k(), 0x7f080575);
    }

    (eng eng1)
    {
        a = eng1;
        super();
    }
}

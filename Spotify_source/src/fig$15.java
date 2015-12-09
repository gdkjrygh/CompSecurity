// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ng.Object
    implements android.widget.View.OnItemClickListener
{

    private fig a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        while (fig.q(a) || i < fig.g(a).getHeaderViewsCount()) 
        {
            return;
        }
        adapterview = (fio)view.getTag();
        fig.W(a);
        fop.a(a.k(), fig.V(a), ClientEventFactory.a("show", com.spotify.mobile.android.util.vent.SubEvent.ak, adapterview.b(), Long.valueOf(l)));
        fig.a(a, l);
        fig.o(a);
    }

    iew(fig fig1)
    {
        a = fig1;
        super();
    }
}

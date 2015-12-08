// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.openaccess.model.Track;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private exi a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i -= exi.a(a).f().getHeaderViewsCount();
        if (exi.g(a).b(i) == 0)
        {
            i = exi.g(a).a(i, 0);
            adapterview = (Track)exi.d(a).getItem(i);
            exi.c(a).a(exi.b(a), adapterview.getUri(), i);
            if (adapterview.isCurrentTrack())
            {
                exi.f(a).d();
            } else
            {
                exi.f(a).a(exi.d(a).a(i), exi.d(a), exi.e(a));
            }
            a.b(exi.b(a));
        }
    }

    (exi exi1)
    {
        a = exi1;
        super();
    }
}

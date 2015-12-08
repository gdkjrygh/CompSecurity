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

    private exl a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i -= exl.a(a).f().getHeaderViewsCount();
        if (exl.g(a).b(i) == 0)
        {
            i = exl.g(a).a(i, 0);
            adapterview = (Track)exl.d(a).getItem(i);
            exl.c(a).a(exl.b(a), adapterview.getUri(), i);
            if (adapterview.isCurrentTrack())
            {
                exl.f(a).d();
            } else
            {
                exl.f(a).a(exl.d(a).a(i), exl.d(a), exl.e(a));
            }
            a.b(exl.b(a));
        }
    }

    (exl exl1)
    {
        a = exl1;
        super();
    }
}

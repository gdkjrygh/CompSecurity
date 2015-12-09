// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.model.Artist;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private eni a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = ((AdapterView) (view.getTag()));
            if (adapterview instanceof Artist)
            {
                view = (Artist)adapterview;
                eni.g(a);
                fop.a(a.k(), eni.f(a), ClientEventFactory.a("artists", com.spotify.mobile.android.util.Event.SubEvent.at, ((Artist) (view)).e, Long.valueOf(l)));
                adapterview = ((Artist) (view)).f;
                if (((Artist) (view)).c == 0 || TextUtils.isEmpty(((Artist) (view)).f) || eom.c(eni.h(a)))
                {
                    adapterview = ((Artist) (view)).e;
                }
                if (!eni.i(a).a())
                {
                    break label0;
                }
                eni.i(a).a(adapterview, ((Artist) (view)).d, false);
            }
            return;
        }
        a.a(gms.a(a.k(), adapterview).a(((Artist) (view)).d).a);
    }

    (eni eni1)
    {
        a = eni1;
        super();
    }
}

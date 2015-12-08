// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.spotlets.share.model.Network;

final class ang.Object
    implements android.view.nClickListener
{

    private fho a;

    public final void onClick(View view)
    {
        boolean flag = false;
        if (a.a.a())
        {
            view = a.b;
            fhs fhs1 = a.a;
            if (!fhs1.b())
            {
                flag = true;
            }
            fhs1.a(flag);
            view.setSelected(fhs1.b());
            fhn.i(a.c).a(a.a, fhn.d(a.c));
        } else
        {
            view = a.a.a.getNetworkType().a(fhn.t(a.c));
            if (view != null)
            {
                view.a(a.c, 0);
                view.a(a.c.m(), (new StringBuilder("spotify:share:post:")).append(a.a.a.getNetworkType().toString()).toString());
                return;
            }
        }
    }

    (fho fho1)
    {
        a = fho1;
        super();
    }
}

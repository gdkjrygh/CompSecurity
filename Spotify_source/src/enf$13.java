// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ng.Object
    implements android.view.ClickListener
{

    private enf a;

    public final void onClick(View view)
    {
        enf.e(a);
        fop.a(a.k(), enf.b(a), ClientEventFactory.a("album", com.spotify.mobile.android.util.vent.SubEvent.ar, null, null));
        view = gms.a(a.k(), enf.l(a)).a(enf.k(a)).a;
        a.k().startActivity(view);
    }

    iew(enf enf1)
    {
        a = enf1;
        super();
    }
}

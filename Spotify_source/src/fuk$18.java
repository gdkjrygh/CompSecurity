// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

final class ng.Object
    implements fxo
{

    private Flags a;
    private String b[];
    private String c;
    private fuk d;

    public final void a(fxp fxp)
    {
        if (gpl.a(a))
        {
            fxp = gms.a(d.b, gpl.b(b[0])).a(c).a;
            d.b.startActivity(fxp);
            return;
        } else
        {
            fuk.a(d, com.spotify.mobile.android.util.vent.Event.v);
            fos.a(d.b, b, d.c, d.d);
            return;
        }
    }

    ng.String(fuk fuk1, Flags flags, String as[], String s)
    {
        d = fuk1;
        a = flags;
        b = as;
        c = s;
        super();
    }
}

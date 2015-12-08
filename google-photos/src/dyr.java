// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Toast;

final class dyr
    implements dwg
{

    private dum a;

    dyr(dyq dyq, dum dum1)
    {
        a = dum1;
        super();
    }

    public final void a(Context context)
    {
        if (b.a(context, "rate_the_app_card"))
        {
            ((dyb)olm.a(context, dyb)).a(a.c, a.a);
            return;
        } else
        {
            Toast.makeText(context, context.getString(p.k), 0).show();
            return;
        }
    }
}

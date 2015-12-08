// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class hdn
    implements nkq
{

    private final Context a;
    private final mmv b;
    private final flb c;

    public hdn(Context context)
    {
        a = context;
        b = (mmv)olm.a(context, mmv);
        c = (flb)olm.a(context, flb);
    }

    public final void a()
    {
        Integer integer;
        for (Iterator iterator = b.a(new String[] {
    "logged_in"
}).iterator(); iterator.hasNext(); c.a(integer.intValue()))
        {
            integer = (Integer)iterator.next();
        }

        ((hdr)olm.a(a, hdr)).a(false);
    }
}

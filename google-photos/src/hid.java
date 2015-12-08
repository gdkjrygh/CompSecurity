// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public final class hid
    implements dhs, omb, opv
{

    private hhr a;
    private hhq b;
    private ekq c;

    public hid(opd opd1)
    {
        opd1.a(this);
    }

    public final void a()
    {
        hhr hhr1 = a;
        Object obj = c;
        Object obj1 = b;
        obj = new hht(hhr1.c.d(), ((ekq) (obj)), ((hhq) (obj1)));
        obj1 = hhr1.a.getResources().getString(b.vU);
        hhr1.b.b.a(((String) (obj1)), ((mtf) (obj)).d);
        hhr1.b.a(((mtf) (obj)));
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (hhr)olm1.a(hhr);
        b = (hhq)olm1.a(hhq);
        c = ((ejz)olm1.a(ejz)).b();
    }
}

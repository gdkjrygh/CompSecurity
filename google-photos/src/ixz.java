// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class ixz
    implements dhu, ixl, omb, opn, opv
{

    private ekb a;
    private ixk b;

    public ixz(opd opd1)
    {
        opd1.a(this);
    }

    public ixz(opd opd1, byte byte0)
    {
        opd1.a(this);
    }

    public final void a()
    {
        Object obj1 = a.a();
        Object obj = b;
        Object obj2 = new hyw(new ArrayList((new hyw(((Collection) (obj1)))).a));
        obj1 = ((ixk) (obj)).a.getResources().getQuantityString(b.Bq, ((hyw) (obj2)).a.size());
        obj2 = new ixj(((ixk) (obj)).d.d(), ((hyw) (obj2)));
        ((ixk) (obj)).c.b.a(((String) (obj1)), ((mtf) (obj2)).d);
        ((ixk) (obj)).c.a(((mtf) (obj2)));
        for (obj = ((ixk) (obj)).b.iterator(); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).next()) { }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (ekb)olm1.a(ekb);
        b = (ixk)olm1.a(ixk);
        b.a(this);
    }

    public final void b(hyw hyw1)
    {
        a.b();
    }

    public final void c()
    {
        b.b(this);
    }
}

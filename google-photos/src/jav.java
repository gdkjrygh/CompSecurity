// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import java.util.Collection;
import java.util.Iterator;

public final class jav
    implements iwy, ixl, omb, opp, opr, opv
{

    private final ehr a;
    private ixk b;
    private iwx c;
    private gaj d;

    public jav(opd opd1, ehr ehr1)
    {
        opd1.a(this);
        a = ehr1;
    }

    private void a(Collection collection)
    {
        boolean flag = true;
        Object obj;
        ehr ehr1;
        if (collection.size() != 1)
        {
            flag = false;
        }
        p.a(flag, "Don't allow bulk removal for pager.");
        obj = d;
        ehr1 = a;
        collection = (ekp)collection.iterator().next();
        if (((gaj) (obj)).b != null && ((gaj) (obj)).b.a.equals(ehr1))
        {
            if (((gaj) (obj)).b.a(collection))
            {
                ((gaj) (obj)).a(((gaj) (obj)).b);
            }
        } else
        {
            obj = (gai)((gaj) (obj)).a.get(ehr1);
            if (obj != null)
            {
                ((gai) (obj)).a(collection);
                return;
            }
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (iwx)olm1.a(iwx);
        b = (ixk)olm1.a(ixk);
        d = (gaj)olm1.a(gaj);
    }

    public final void a(hyw hyw1)
    {
        a(hyw1.a);
    }

    public final void al_()
    {
        c.a(this);
        b.a(this);
    }

    public final void am_()
    {
        c.b(this);
        b.b(this);
    }

    public final void b(hyw hyw1)
    {
        a(hyw1.a);
    }
}

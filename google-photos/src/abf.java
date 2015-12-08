// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class abf
    implements wk
{

    private aay a;

    abf(aay aay)
    {
        a = aay;
        super();
    }

    public final void a(vu vu1, boolean flag)
    {
        if (vu1 instanceof wo)
        {
            ((wo)vu1).k.a(false);
        }
        wk wk1 = ((vp) (a)).d;
        if (wk1 != null)
        {
            wk1.a(vu1, flag);
        }
    }

    public final boolean a_(vu vu1)
    {
        if (vu1 == null)
        {
            return false;
        }
        ((wo)vu1).getItem().getItemId();
        wk wk1 = ((vp) (a)).d;
        if (wk1 != null)
        {
            return wk1.a_(vu1);
        } else
        {
            return false;
        }
    }
}

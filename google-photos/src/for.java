// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class for
    implements dhf
{

    private fok a;

    for(fok fok1)
    {
        a = fok1;
        super();
    }

    public final void a(MenuItem menuitem)
    {
    }

    public final void b(MenuItem menuitem)
    {
        gog gog1 = fok.j(a);
        boolean flag;
        if (gog1.a == gon.g || gog1.a == gon.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            sa sa1 = fok.k(a).a();
            if (menuitem != null && menuitem.getItemId() == 0x102002c && sa1.a)
            {
                sa1.b();
                return;
            }
        }
    }
}

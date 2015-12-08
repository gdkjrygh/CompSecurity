// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class hoz
    implements dhf, omb, opv
{

    private hov a;
    private ejz b;

    public hoz()
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (hov)olm1.a(hov);
        b = (ejz)olm1.a(ejz);
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(true);
    }

    public final void b(MenuItem menuitem)
    {
        menuitem = b.b();
        hov hov1 = a;
        hov1.c = null;
        hov1.b = menuitem;
        hov1.a();
    }
}

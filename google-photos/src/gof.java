// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

final class gof
    implements dhf, omb, opv
{

    private dhz a;

    gof(gnw gnw)
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (dhz)olm1.a(dhz);
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(true);
    }

    public final void b(MenuItem menuitem)
    {
        a.c();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

final class hxg
    implements dhf, omb, opv
{

    boolean a;
    private hxh b;

    hxg()
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (hxh)olm1.a(hxh);
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(a);
    }

    public final void b(MenuItem menuitem)
    {
        b.a(hxi.b);
    }
}

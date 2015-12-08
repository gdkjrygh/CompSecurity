// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class fnn
    implements dhf, omb, opv
{

    private final fnl a;
    private fnt b;

    public fnn(fnl fnl)
    {
        a = fnl;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (fnt)olm1.a(fnt);
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(true);
    }

    public final void b(MenuItem menuitem)
    {
        b.a(a);
    }
}

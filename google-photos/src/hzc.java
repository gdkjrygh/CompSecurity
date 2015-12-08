// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class hzc
    implements dhf, omb, opv
{

    public boolean a;
    private final k b;
    private hyy c;

    public hzc()
    {
        this(null);
    }

    private hzc(k k)
    {
        a = true;
        b = null;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (hyy)olm1.a(hyy);
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(a);
    }

    public final void b(MenuItem menuitem)
    {
        if (!c.b())
        {
            c.a(3);
        }
    }
}

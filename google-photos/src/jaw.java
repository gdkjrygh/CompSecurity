// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class jaw
    implements dhf, omb, opv
{

    private grg a;
    private dhp b;

    public jaw()
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (dhp)olm1.a(dhp);
        a = (grg)olm1.a(grg);
    }

    public final void a(MenuItem menuitem)
    {
        boolean flag;
        if (a.h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
    }

    public final void b(MenuItem menuitem)
    {
        b.a();
    }
}

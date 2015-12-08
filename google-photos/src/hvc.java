// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class hvc
    implements dhf, omb, opv
{

    private hvd a;
    private hvf b;
    private myf c;
    private mmr d;

    public hvc()
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (hvd)olm1.a(hvd);
        b = (hvf)olm1.a(hvf);
        c = (myf)olm1.a(myf);
        d = (mmr)olm1.a(mmr);
    }

    public final void a(MenuItem menuitem)
    {
        if (!c.a(hul.a, d.d()))
        {
            return;
        }
        boolean flag;
        if (b.d() != null && b.d().ar_() != -1L)
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
        a.b();
    }
}

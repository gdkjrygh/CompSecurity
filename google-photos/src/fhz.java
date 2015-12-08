// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class fhz
    implements dhf, omb, opl, ops, opv
{

    public ekq a;
    private fia b;

    public fhz()
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (fia)olm1.a(fia);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            a = (ekq)bundle.getParcelable("envelope_media_collection");
        }
    }

    public final void a(MenuItem menuitem)
    {
        boolean flag;
        if (a != null)
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
        b.h();
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("envelope_media_collection", a);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.widget.Button;
import android.widget.FrameLayout;

final class gis
    implements Runnable
{

    private gip a;

    gis(gip gip1)
    {
        a = gip1;
        super();
    }

    public final void run()
    {
        gip.a(a, false);
        gip.h(a).setVisibility(8);
        gip.f(a).b("onboarding_prepare_accounts");
        gip.i(a).create().show();
        if (gip.j(a) != null)
        {
            gip.j(a).setEnabled(true);
        }
    }
}

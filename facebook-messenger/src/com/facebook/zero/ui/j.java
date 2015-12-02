// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import android.view.View;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;

// Referenced classes of package com.facebook.zero.ui:
//            ExtraChargesDialog, k

class j
    implements android.view.View.OnClickListener
{

    final ExtraChargesDialog a;

    j(ExtraChargesDialog extrachargesdialog)
    {
        a = extrachargesdialog;
        super();
    }

    public void onClick(View view)
    {
        if (ExtraChargesDialog.a(a) != null)
        {
            ExtraChargesDialog.d(a).a((new cb("click")).a(a.g_()).f("button").h(ExtraChargesDialog.c(a)).g("zero_extra_charges_dialog_confirm").b("dialogName", ExtraChargesDialog.b(a)));
            ExtraChargesDialog.a(a).a(ExtraChargesDialog.e(a));
        }
        ExtraChargesDialog.g(a);
    }
}

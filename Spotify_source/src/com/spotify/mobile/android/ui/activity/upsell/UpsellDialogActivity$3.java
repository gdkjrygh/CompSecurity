// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.widget.Button;
import fsv;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            UpsellDialogActivity

final class a
    implements fsv
{

    private UpsellDialogActivity a;

    public final void a(int i)
    {
        if (i == 0)
        {
            UpsellDialogActivity.a(UpsellDialogActivity.b(a));
            UpsellDialogActivity.a(UpsellDialogActivity.c(a));
        }
    }

    public final void a(String s)
    {
        UpsellDialogActivity.b(a).setText(s);
        UpsellDialogActivity.a(UpsellDialogActivity.b(a), UpsellDialogActivity.c(a));
    }

    (UpsellDialogActivity upselldialogactivity)
    {
        a = upselldialogactivity;
        super();
    }
}

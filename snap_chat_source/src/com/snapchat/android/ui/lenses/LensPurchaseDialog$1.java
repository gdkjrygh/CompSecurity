// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.lenses;

import BY;
import android.view.View;

// Referenced classes of package com.snapchat.android.ui.lenses:
//            LensPurchaseDialog

final class a
    implements android.view.sPurchaseDialog._cls1
{

    private BY a;
    private LensPurchaseDialog b;

    public final void onClick(View view)
    {
        b.dismiss();
        LensPurchaseDialog.a(b).a(nsPurchaseDialogResult.BUY, a);
    }

    nsPurchaseDialogResult(LensPurchaseDialog lenspurchasedialog, BY by)
    {
        b = lenspurchasedialog;
        a = by;
        super();
    }
}

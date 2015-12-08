// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.lenses;

import android.view.View;

// Referenced classes of package com.snapchat.android.ui.lenses:
//            LensPurchaseDialog

final class a
    implements android.view.sPurchaseDialog._cls2
{

    private LensPurchaseDialog a;

    public final void onClick(View view)
    {
        a.dismiss();
        LensPurchaseDialog.a(a).a(nsPurchaseDialogResult.CANCEL, null);
    }

    nsPurchaseDialogResult(LensPurchaseDialog lenspurchasedialog)
    {
        a = lenspurchasedialog;
        super();
    }
}

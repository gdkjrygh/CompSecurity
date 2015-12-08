// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class c
    implements android.content.DialogInterface.OnCancelListener
{

    final Camera2InputPopup a;

    c(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (Camera2InputPopup.f(a))
        {
            Camera2InputPopup.g(a);
            return;
        } else
        {
            a.onBackPressed();
            return;
        }
    }
}

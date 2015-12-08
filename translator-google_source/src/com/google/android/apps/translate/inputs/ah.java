// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class ah
    implements android.content.DialogInterface.OnClickListener
{

    final Camera2InputPopup a;

    ah(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
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

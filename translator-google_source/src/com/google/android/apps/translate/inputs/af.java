// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import com.google.android.apps.translate.wordlens.GTRNativeUI;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class af
    implements Runnable
{

    final Camera2InputPopup a;

    af(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void run()
    {
        GTRNativeUI.a().a(false);
    }
}

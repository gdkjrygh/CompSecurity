// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.view.View;
import com.google.android.apps.translate.m;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class ae
    implements Runnable
{

    final Camera2InputPopup a;

    ae(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void run()
    {
        a.findViewById(m.btn_back).setEnabled(true);
    }
}

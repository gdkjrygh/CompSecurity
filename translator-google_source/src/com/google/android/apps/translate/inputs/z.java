// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.widget.TextView;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class z
    implements Runnable
{

    final Camera2InputPopup a;

    z(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void run()
    {
        if (Camera2InputPopup.d(a).getVisibility() == 0)
        {
            Camera2InputPopup.d(a).setVisibility(8);
        }
    }
}

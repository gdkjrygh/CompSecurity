// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.widget.TextView;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class v
    implements Runnable
{

    final String a;
    final Camera2InputPopup b;

    v(Camera2InputPopup camera2inputpopup, String s)
    {
        b = camera2inputpopup;
        a = s;
        super();
    }

    public final void run()
    {
        Camera2InputPopup.t(b).setText(a);
        Camera2InputPopup.u(b);
        Camera2InputPopup.t(b).sendAccessibilityEvent(32);
    }
}

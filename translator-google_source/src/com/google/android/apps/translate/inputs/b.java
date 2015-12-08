// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.content.Context;
import android.content.res.Resources;
import android.view.Display;
import android.view.OrientationEventListener;
import com.google.android.apps.unveil.sensors.CameraManager;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class b extends OrientationEventListener
{

    final Display a;
    final Camera2InputPopup b;

    b(Camera2InputPopup camera2inputpopup, Context context, Display display)
    {
        b = camera2inputpopup;
        a = display;
        super(context, 3);
    }

    public final void onOrientationChanged(int i)
    {
        if (Camera2InputPopup.a(b) != a.getRotation())
        {
            Camera2InputPopup.a(b, a.getRotation());
            Camera2InputPopup.b(b).onConfigurationChanged(b.getContext().getResources().getConfiguration());
            Camera2InputPopup.c(b);
        }
    }
}

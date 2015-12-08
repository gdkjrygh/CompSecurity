// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import com.google.android.apps.unveil.sensors.CameraManager;
import com.google.android.libraries.translate.logging.Event;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class aa
    implements Runnable
{

    final Camera2InputPopup a;

    aa(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void run()
    {
        Camera2InputPopup.b(a).a(null);
        Camera2InputPopup.w(a);
        Camera2InputPopup camera2inputpopup = a;
        Event event;
        if (Camera2InputPopup.f(a))
        {
            event = Event.WORDLENS_FOCUS_USED;
        } else
        {
            event = Event.FOCUS_USED;
        }
        camera2inputpopup.a(event);
    }
}

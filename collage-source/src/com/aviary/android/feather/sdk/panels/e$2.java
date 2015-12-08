// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.overlays.AviaryOverlay;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            e

class a
    implements com.aviary.android.feather.sdk.overlays.ryOverlay.a
{

    final e a;

    public void a(AviaryOverlay aviaryoverlay)
    {
        aviaryoverlay.i();
        try
        {
            if (a.B() != null)
            {
                a.B().e();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AviaryOverlay aviaryoverlay)
        {
            aviaryoverlay.printStackTrace();
        }
    }

    iaryOverlay(e e1)
    {
        a = e1;
        super();
    }
}

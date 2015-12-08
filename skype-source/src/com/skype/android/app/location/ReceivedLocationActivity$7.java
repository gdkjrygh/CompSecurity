// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.view.ViewGroup;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.skype.android.app.location:
//            ReceivedLocationActivity

final class this._cls0
    implements com.google.android.gms.maps.._cls7
{

    final ReceivedLocationActivity this$0;

    public final void onCameraChange(CameraPosition cameraposition)
    {
        if (!ReceivedLocationActivity.access$500(ReceivedLocationActivity.this)) goto _L2; else goto _L1
_L1:
        if (ReceivedLocationActivity.access$700(ReceivedLocationActivity.this).getVisibility() == 8)
        {
            ReceivedLocationActivity.access$700(ReceivedLocationActivity.this).startAnimation(ReceivedLocationActivity.access$800(ReceivedLocationActivity.this));
        }
_L4:
        ReceivedLocationActivity.access$502(ReceivedLocationActivity.this, false);
        return;
_L2:
        if (ReceivedLocationActivity.access$700(ReceivedLocationActivity.this).getVisibility() == 0)
        {
            ReceivedLocationActivity.access$700(ReceivedLocationActivity.this).startAnimation(ReceivedLocationActivity.access$900(ReceivedLocationActivity.this));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = ReceivedLocationActivity.this;
        super();
    }
}

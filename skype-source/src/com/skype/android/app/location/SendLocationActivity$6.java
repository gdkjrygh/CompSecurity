// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.os.Handler;
import android.widget.TextView;
import com.google.android.gms.maps.model.CameraPosition;
import com.skype.android.widget.ProgressCircleView;

// Referenced classes of package com.skype.android.app.location:
//            SendLocationActivity

final class this._cls0
    implements com.google.android.gms.maps.._cls6
{

    final SendLocationActivity this$0;

    public final void onCameraChange(CameraPosition cameraposition)
    {
        if (SendLocationActivity.access$1100(SendLocationActivity.this).getVisibility() == 8)
        {
            SendLocationActivity.access$1200(SendLocationActivity.this).setText("");
            SendLocationActivity.access$1100(SendLocationActivity.this).setVisibility(0);
        }
        SendLocationActivity.access$402(SendLocationActivity.this, false);
        SendLocationActivity.access$1300(SendLocationActivity.this).removeMessages(1);
        SendLocationActivity.access$1300(SendLocationActivity.this).sendEmptyMessageDelayed(1, 1000L);
    }

    ()
    {
        this$0 = SendLocationActivity.this;
        super();
    }
}

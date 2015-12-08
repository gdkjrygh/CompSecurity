// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.content.Context;
import android.view.OrientationEventListener;
import com.pinterest.ui.camera.CameraManager;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0 extends OrientationEventListener
{

    final CameraActivity this$0;

    public void onOrientationChanged(int i)
    {
        if (i != -1)
        {
            CameraActivity.access$102(CameraActivity.this, CameraManager.normalizeRotation(CameraActivity.access$200(), i));
        }
    }

    (Context context)
    {
        this$0 = CameraActivity.this;
        super(context);
    }
}

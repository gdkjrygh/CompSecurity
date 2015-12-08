// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0
    implements android.view.ner
{

    final CameraActivity this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (_captureLayout.getVisibility() == 0)
        {
            CameraActivity.access$000(CameraActivity.this);
        }
        return false;
    }

    ()
    {
        this$0 = CameraActivity.this;
        super();
    }
}

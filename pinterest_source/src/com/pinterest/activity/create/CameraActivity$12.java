// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.net.Uri;
import android.view.View;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0
    implements android.view.er
{

    final CameraActivity this$0;

    public void onClick(View view)
    {
        if (CameraActivity.access$400(CameraActivity.this) != null)
        {
            view = Uri.fromFile(CameraActivity.access$400(CameraActivity.this));
            CameraActivity.access$1000(CameraActivity.this, view);
        }
    }

    ()
    {
        this$0 = CameraActivity.this;
        super();
    }
}

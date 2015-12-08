// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.view.View;

// Referenced classes of package com.pinterest.activity.create.helper:
//            CreateImageHelper

class val.view
    implements Runnable
{

    final l.intent this$0;
    final View val$view;

    public void run()
    {
        CreateImageHelper.showCustomCameraDialog(val$view.getContext(), intent);
    }

    ()
    {
        this$0 = final_;
        val$view = View.this;
        super();
    }
}

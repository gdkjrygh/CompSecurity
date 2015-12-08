// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.content.Intent;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.create.helper:
//            CreateImageHelper

class this._cls0
    implements Runnable
{

    final l.intent this$0;

    public void run()
    {
        intent.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070732));
        CreateImageHelper.showCustomCameraDialog(context, intent);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}

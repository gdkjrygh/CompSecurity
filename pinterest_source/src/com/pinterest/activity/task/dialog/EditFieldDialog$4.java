// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            EditFieldDialog

class this._cls0
    implements Runnable
{

    final EditFieldDialog this$0;

    public void run()
    {
        Device.showSoftKeyboard(_editText);
    }

    ()
    {
        this$0 = EditFieldDialog.this;
        super();
    }
}

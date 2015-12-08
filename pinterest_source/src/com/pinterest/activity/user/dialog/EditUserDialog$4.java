// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.user.dialog:
//            EditUserDialog

class this._cls0
    implements Runnable
{

    final EditUserDialog this$0;

    public void run()
    {
        Device.showSoftKeyboard(_aboutEt);
    }

    _cls9()
    {
        this$0 = EditUserDialog.this;
        super();
    }
}

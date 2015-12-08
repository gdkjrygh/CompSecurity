// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.widget.EditText;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            AddMessageDialog

public class 
{

    public static void inject(butterknife.geDialog gedialog, AddMessageDialog addmessagedialog, Object obj)
    {
        addmessagedialog._messageEt = (EditText)gedialog._messageEt(obj, 0x7f0f0163, "field '_messageEt'");
    }

    public static void reset(AddMessageDialog addmessagedialog)
    {
        addmessagedialog._messageEt = null;
    }

    public ()
    {
    }
}

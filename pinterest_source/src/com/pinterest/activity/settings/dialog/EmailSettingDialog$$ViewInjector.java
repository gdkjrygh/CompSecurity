// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.widget.EditText;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            EmailSettingDialog

public class 
{

    public static void inject(butterknife.ettingDialog ettingdialog, EmailSettingDialog emailsettingdialog, Object obj)
    {
        emailsettingdialog._emailEt = (EditText)ettingdialog._emailEt(obj, 0x7f0f016b, "field '_emailEt'");
    }

    public static void reset(EmailSettingDialog emailsettingdialog)
    {
        emailsettingdialog._emailEt = null;
    }

    public ()
    {
    }
}

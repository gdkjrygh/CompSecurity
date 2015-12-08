// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.widget.EditText;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            UsernameSettingDialog

public class 
{

    public static void inject(butterknife.ettingDialog ettingdialog, UsernameSettingDialog usernamesettingdialog, Object obj)
    {
        usernamesettingdialog._username = (EditText)ettingdialog._username(obj, 0x7f0f01a9, "field '_username'");
    }

    public static void reset(UsernameSettingDialog usernamesettingdialog)
    {
        usernamesettingdialog._username = null;
    }

    public ()
    {
    }
}

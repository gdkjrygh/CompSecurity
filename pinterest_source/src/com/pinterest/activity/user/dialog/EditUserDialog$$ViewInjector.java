// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.widget.EditText;

// Referenced classes of package com.pinterest.activity.user.dialog:
//            EditUserDialog

public class 
{

    public static void inject(butterknife.erDialog erdialog, EditUserDialog edituserdialog, Object obj)
    {
        edituserdialog._aboutEt = (EditText)erdialog._aboutEt(obj, 0x7f0f0164, "field '_aboutEt'");
        edituserdialog._locationEt = (EditText)erdialog._locationEt(obj, 0x7f0f0165, "field '_locationEt'");
    }

    public static void reset(EditUserDialog edituserdialog)
    {
        edituserdialog._aboutEt = null;
        edituserdialog._locationEt = null;
    }

    public ()
    {
    }
}

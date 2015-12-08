// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.widget.EditText;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            OneFieldBaseDialog

public class I
{

    public static void inject(butterknife.seDialog sedialog, OneFieldBaseDialog onefieldbasedialog, Object obj)
    {
        onefieldbasedialog._et = (EditText)sedialog._et(obj, 0x7f0f017a, "field '_et'");
    }

    public static void reset(OneFieldBaseDialog onefieldbasedialog)
    {
        onefieldbasedialog._et = null;
    }

    public I()
    {
    }
}

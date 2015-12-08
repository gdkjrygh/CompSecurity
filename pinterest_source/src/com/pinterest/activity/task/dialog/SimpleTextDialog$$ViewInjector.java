// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            SimpleTextDialog

public class 
{

    public static void inject(butterknife.xtDialog xtdialog, SimpleTextDialog simpletextdialog, Object obj)
    {
        simpletextdialog._textView = (TextView)xtdialog._textView(obj, 0x7f0f0096, "field '_textView'");
    }

    public static void reset(SimpleTextDialog simpletextdialog)
    {
        simpletextdialog._textView = null;
    }

    public ()
    {
    }
}

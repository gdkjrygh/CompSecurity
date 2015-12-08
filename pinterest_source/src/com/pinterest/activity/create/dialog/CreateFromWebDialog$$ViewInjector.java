// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.dialog;

import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.create.dialog:
//            CreateFromWebDialog

public class 
{

    public static void inject(butterknife.mWebDialog mwebdialog, CreateFromWebDialog createfromwebdialog, Object obj)
    {
        createfromwebdialog._editText = (EditText)mwebdialog._editText(obj, 0x7f0f017e, "field '_editText'");
        createfromwebdialog._textView = (TextView)mwebdialog._textView(obj, 0x7f0f017d, "field '_textView'");
    }

    public static void reset(CreateFromWebDialog createfromwebdialog)
    {
        createfromwebdialog._editText = null;
        createfromwebdialog._textView = null;
    }

    public ()
    {
    }
}

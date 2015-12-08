// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceErrorDialog

public class 
{

    public static void inject(butterknife.eErrorDialog eerrordialog, CommerceErrorDialog commerceerrordialog, Object obj)
    {
        commerceerrordialog.errorBody = (PTextView)eerrordialog.errorBody(obj, 0x7f0f0138, "field 'errorBody'");
    }

    public static void reset(CommerceErrorDialog commerceerrordialog)
    {
        commerceerrordialog.errorBody = null;
    }

    public ()
    {
    }
}

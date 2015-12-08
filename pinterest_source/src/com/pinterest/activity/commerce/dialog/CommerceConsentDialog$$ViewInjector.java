// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceConsentDialog

public class 
{

    public static void inject(butterknife.onsentDialog onsentdialog, CommerceConsentDialog commerceconsentdialog, Object obj)
    {
        commerceconsentdialog.consentText = (PTextView)onsentdialog.consentText(obj, 0x7f0f0137, "field 'consentText'");
    }

    public static void reset(CommerceConsentDialog commerceconsentdialog)
    {
        commerceconsentdialog.consentText = null;
    }

    public ()
    {
    }
}

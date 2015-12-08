// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXContinueBar

public class 
{

    public static void inject(butterknife.ueBar uebar, NUXContinueBar nuxcontinuebar, Object obj)
    {
        nuxcontinuebar._continueBt = (PButton)uebar._continueBt(obj, 0x7f0f04b1, "field '_continueBt'");
        nuxcontinuebar._descTv = (PTextView)uebar._descTv(obj, 0x7f0f04b0, "field '_descTv'");
    }

    public static void reset(NUXContinueBar nuxcontinuebar)
    {
        nuxcontinuebar._continueBt = null;
        nuxcontinuebar._descTv = null;
    }

    public ()
    {
    }
}

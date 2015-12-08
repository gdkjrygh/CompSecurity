// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionsheet;

import com.pinterest.ui.text.PButton;

// Referenced classes of package com.pinterest.ui.actionsheet:
//            ShareExtensionFragment

public class 
{

    public static void inject(butterknife.nt nt, ShareExtensionFragment shareextensionfragment, Object obj)
    {
        shareextensionfragment._dismissButton = (PButton)nt._dismissButton(obj, 0x7f0f0422, "field '_dismissButton'");
        shareextensionfragment._sharePositiveButton = (PButton)nt._sharePositiveButton(obj, 0x7f0f0423, "field '_sharePositiveButton'");
    }

    public static void reset(ShareExtensionFragment shareextensionfragment)
    {
        shareextensionfragment._dismissButton = null;
        shareextensionfragment._sharePositiveButton = null;
    }

    public ()
    {
    }
}

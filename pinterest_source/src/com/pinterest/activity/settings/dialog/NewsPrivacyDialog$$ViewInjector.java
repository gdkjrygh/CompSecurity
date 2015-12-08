// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.widget.CheckedTextView;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            NewsPrivacyDialog

public class 
{

    public static void inject(butterknife.rivacyDialog rivacydialog, NewsPrivacyDialog newsprivacydialog, Object obj)
    {
        newsprivacydialog._activityCb = (CheckedTextView)rivacydialog._activityCb(obj, 0x7f0f0179, "field '_activityCb'");
    }

    public static void reset(NewsPrivacyDialog newsprivacydialog)
    {
        newsprivacydialog._activityCb = null;
    }

    public ()
    {
    }
}

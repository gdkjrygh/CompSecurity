// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.widget.ListView;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            CountrySettingDialog

public class 
{

    public static void inject(butterknife.ettingDialog ettingdialog, CountrySettingDialog countrysettingdialog, Object obj)
    {
        countrysettingdialog._listView = (ListView)ettingdialog._listView(obj, 0x7f0f0128, "field '_listView'");
    }

    public static void reset(CountrySettingDialog countrysettingdialog)
    {
        countrysettingdialog._listView = null;
    }

    public ()
    {
    }
}

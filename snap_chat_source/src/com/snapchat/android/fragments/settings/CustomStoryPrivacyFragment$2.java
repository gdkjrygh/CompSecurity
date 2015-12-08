// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            CustomStoryPrivacyFragment

final class 
    implements android.widget.er
{

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (CheckBox)view.findViewById(0x7f0d01f1);
        if (adapterview == null)
        {
            return;
        }
        boolean flag;
        if (!adapterview.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        adapterview.setChecked(flag);
    }

    ()
    {
    }
}

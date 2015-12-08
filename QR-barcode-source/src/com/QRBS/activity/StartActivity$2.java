// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.TabHost;
import com.scannerfire.fragment.FragmentCronology;
import com.scannerfire.utils.Utils;
import java.util.List;

// Referenced classes of package com.QRBS.activity:
//            StartActivity

class this._cls0
    implements android.widget.ngeListener
{

    final StartActivity this$0;

    public void onTabChanged(String s)
    {
        int i = StartActivity.access$1(StartActivity.this).getCurrentTab();
        StartActivity.access$2(StartActivity.this).setCurrentItem(i);
        if (!s.contentEquals("History"))
        {
            ((FragmentCronology)getSupportFragmentManager().getFragments().get(1)).clearCronology();
            Utils.setLastElem(-1);
        }
    }

    ronology()
    {
        this$0 = StartActivity.this;
        super();
    }
}

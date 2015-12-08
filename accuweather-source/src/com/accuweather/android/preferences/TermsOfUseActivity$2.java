// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.widget.ListView;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.preferences:
//            TermsOfUseActivity

class this._cls0 extends TimerTask
{

    final TermsOfUseActivity this$0;

    public void run()
    {
        for (int i = 0; i < getListView().getChildCount(); i++)
        {
            ListView listview = getListView();
            TermsOfUseActivity.access$200(TermsOfUseActivity.this, listview);
        }

    }

    ()
    {
        this$0 = TermsOfUseActivity.this;
        super();
    }
}

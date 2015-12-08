// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package com.phunware.nbc.sochi:
//            MainNavigationContentActivity

private class <init>
    implements android.widget.istener
{

    final MainNavigationContentActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        MainNavigationContentActivity.access$200(MainNavigationContentActivity.this, i);
        MainNavigationContentActivity.access$300(MainNavigationContentActivity.this).clearChoices();
    }

    private ()
    {
        this$0 = MainNavigationContentActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

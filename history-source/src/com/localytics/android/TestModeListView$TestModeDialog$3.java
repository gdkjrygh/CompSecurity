// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.view.View;
import android.widget.AdapterView;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            TestModeListView, AmpCallable

class this._cls1
    implements android.widget.ialog._cls3
{

    final is._cls0 this$1;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (TestModeListView.access$200(_fld0) != null)
        {
            view = (AmpCallable)TestModeListView.access$200(_fld0).get(Integer.valueOf(11));
            if (view != null)
            {
                view.call(new Object[] {
                    adapterview.getItemAtPosition(i)
                });
            }
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

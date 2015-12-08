// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.view.View;
import android.widget.AdapterView;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            TestModeListView, AmpConstants, AmpCallable

class this._cls1
    implements android.widget.r
{

    final is._cls0 this$1;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        AmpConstants.setTestModeEnabled(false);
        dismiss();
_L4:
        smiss();
        return;
_L2:
        if (i == 1)
        {
            if (TestModeListView.access$200(_fld0) != null)
            {
                adapterview = (AmpCallable)TestModeListView.access$200(_fld0).get(Integer.valueOf(12));
                if (adapterview != null)
                {
                    adapterview.call(null);
                }
            }
        } else
        if (i == 2)
        {
            if (TestModeListView.access$200(_fld0) != null)
            {
                adapterview = (AmpCallable)TestModeListView.access$200(_fld0).get(Integer.valueOf(13));
                if (adapterview != null)
                {
                    adapterview.call(null);
                }
            }
        } else
        if (i == 3 && TestModeListView.access$200(_fld0) != null)
        {
            adapterview = (AmpCallable)TestModeListView.access$200(_fld0).get(Integer.valueOf(14));
            if (adapterview != null)
            {
                adapterview.call(null);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

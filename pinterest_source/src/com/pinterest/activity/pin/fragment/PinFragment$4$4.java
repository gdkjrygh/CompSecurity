// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinFragment

class this._cls1
    implements Runnable
{

    final olEvent this$1;

    public void run()
    {
        FragmentManager fragmentmanager = getChildFragmentManager();
        FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
        fragmenttransaction.remove(fragmentmanager.findFragmentByTag("flashlight_results_fragment"));
        fragmenttransaction.commit();
        if (PinFragment.access$600(_fld0))
        {
            PinFragment.access$200(_fld0);
        }
        Events.post(new com.pinterest.activity.task.view.ntrolEvent(1));
    }

    olEvent()
    {
        this$1 = this._cls1.this;
        super();
    }
}

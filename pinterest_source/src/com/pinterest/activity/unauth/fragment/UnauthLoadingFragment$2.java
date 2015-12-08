// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import com.pinterest.experiment.Experiments;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            UnauthLoadingFragment

class this._cls0
    implements com.pinterest.base.thLoadingFragment._cls2
{

    final UnauthLoadingFragment this$0;

    public void onEventMainThread(com.pinterest.api.remote.idationResult idationresult)
    {
        boolean flag = true;
        if (UnauthLoadingFragment.access$300(UnauthLoadingFragment.this).get() || UnauthLoadingFragment.access$100(UnauthLoadingFragment.this))
        {
            return;
        }
        UnauthLoadingFragment.access$102(UnauthLoadingFragment.this, true);
        UnauthLoadingFragment unauthloadingfragment = UnauthLoadingFragment.this;
        if (idationresult.a())
        {
            flag = false;
        }
        UnauthLoadingFragment.access$502(unauthloadingfragment, flag);
        UnauthLoadingFragment.access$200(UnauthLoadingFragment.this);
    }

    public void onEventMainThread(com.pinterest.experiment.oaded oaded)
    {
        if (UnauthLoadingFragment.access$300(UnauthLoadingFragment.this).get() || UnauthLoadingFragment.access$000(UnauthLoadingFragment.this))
        {
            return;
        }
        UnauthLoadingFragment.access$002(UnauthLoadingFragment.this, true);
        if (oaded.a)
        {
            Experiments.a("pinvitational_philippines");
            UnauthLoadingFragment.access$402(UnauthLoadingFragment.this, Experiments.l());
        }
        UnauthLoadingFragment.access$200(UnauthLoadingFragment.this);
    }

    ()
    {
        this$0 = UnauthLoadingFragment.this;
        super();
    }
}

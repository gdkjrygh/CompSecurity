// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import com.pinterest.activity.FragmentHelper;

// Referenced classes of package com.pinterest.activity.create:
//            CreateActivity

class this._cls0
    implements com.pinterest.base.criber
{

    final CreateActivity this$0;

    public void onEventMainThread(com.pinterest.base.ateEvent ateevent)
    {
        FragmentHelper.updateFragmentWidth(CreateActivity.this);
    }

    ()
    {
        this$0 = CreateActivity.this;
        super();
    }
}

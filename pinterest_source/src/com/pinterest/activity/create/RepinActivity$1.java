// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import com.pinterest.activity.FragmentHelper;

// Referenced classes of package com.pinterest.activity.create:
//            RepinActivity

class this._cls0
    implements com.pinterest.base.scriber
{

    final RepinActivity this$0;

    public void onEventMainThread(com.pinterest.base.dateEvent dateevent)
    {
        FragmentHelper.updateFragmentWidth(RepinActivity.this);
    }

    ()
    {
        this$0 = RepinActivity.this;
        super();
    }
}

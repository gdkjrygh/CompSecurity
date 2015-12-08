// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import com.amobee.richmedia.view.AmobeeView;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaUtilityController

class this._cls0
    implements Runnable
{

    final OrmmaUtilityController this$0;

    public void run()
    {
        mOrmmaView.calculateCurrentPosition(true);
        init(mOrmmaView.mDensity);
    }

    ()
    {
        this$0 = OrmmaUtilityController.this;
        super();
    }
}

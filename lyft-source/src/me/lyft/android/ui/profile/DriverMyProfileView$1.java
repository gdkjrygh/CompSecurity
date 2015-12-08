// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            DriverMyProfileView, ProfileToolBarView

class this._cls0
    implements Action1
{

    final DriverMyProfileView this$0;

    public void call(Boolean boolean1)
    {
        if (DriverMyProfileView.access$000(DriverMyProfileView.this) != boolean1.booleanValue())
        {
            profileToolBarView.setFade(boolean1.booleanValue());
            DriverMyProfileView.access$002(DriverMyProfileView.this, boolean1.booleanValue());
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = DriverMyProfileView.this;
        super();
    }
}

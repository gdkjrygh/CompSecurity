// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerMyProfileView, ProfileToolBarView

class this._cls0
    implements Action1
{

    final PassengerMyProfileView this$0;

    public void call(Boolean boolean1)
    {
        if (PassengerMyProfileView.access$000(PassengerMyProfileView.this) != boolean1.booleanValue())
        {
            profileToolBarView.setFade(boolean1.booleanValue());
            PassengerMyProfileView.access$002(PassengerMyProfileView.this, boolean1.booleanValue());
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    _cls9()
    {
        this$0 = PassengerMyProfileView.this;
        super();
    }
}

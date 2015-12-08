// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            LoginPhoneView, EnterPhoneView

class this._cls0
    implements Action1
{

    final LoginPhoneView this$0;

    public void call(Integer integer)
    {
        enterPhoneView.requestPhoneAuth();
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ()
    {
        this$0 = LoginPhoneView.this;
        super();
    }
}

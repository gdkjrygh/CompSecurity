// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.landing:
//            EnterInfoView

class this._cls0 extends AsyncCall
{

    final EnterInfoView this$0;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((me.lyft.android.providers.PhoneProfile)obj);
    }

    public void onSuccess(me.lyft.android.providers.PhoneProfile phoneprofile)
    {
        EnterInfoView.access$000(EnterInfoView.this, phoneprofile);
    }

    honeProfile()
    {
        this$0 = EnterInfoView.this;
        super();
    }
}

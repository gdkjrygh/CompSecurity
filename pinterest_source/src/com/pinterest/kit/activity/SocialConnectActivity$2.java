// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;


// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class this._cls0
    implements com.pinterest.base.ivity._cls2
{

    final SocialConnectActivity this$0;

    public void onEventMainThread(com.pinterest.base.nt nt)
    {
        SocialConnectActivity.access$002(SocialConnectActivity.this, nt.isForSignup());
        SocialConnectActivity.access$102(SocialConnectActivity.this, nt.getNetwork());
        switch (..SwitchMap.com.pinterest.base.Social.Network[nt.getNetwork().getNetwork()])
        {
        default:
            return;

        case 1: // '\001'
            SocialConnectActivity.access$200(SocialConnectActivity.this, nt);
            return;

        case 2: // '\002'
            SocialConnectActivity.access$300(SocialConnectActivity.this);
            return;

        case 3: // '\003'
            SocialConnectActivity.access$400(SocialConnectActivity.this);
            return;

        case 4: // '\004'
            SocialConnectActivity.access$500(SocialConnectActivity.this);
            break;
        }
    }

    public void onEventMainThread(com.pinterest.base.Event event)
    {
        SocialConnectActivity.access$602(SocialConnectActivity.this, event.getNetwork());
        switch (..SwitchMap.com.pinterest.base.Social.Network[event.getNetwork().getNetwork()])
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
            disconnectGPlus();
            break;
        }
    }

    ()
    {
        this$0 = SocialConnectActivity.this;
        super();
    }
}

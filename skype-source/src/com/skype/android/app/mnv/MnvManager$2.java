// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.event.EventBus;

// Referenced classes of package com.skype.android.app.mnv:
//            a, MnvManager

final class this._cls0
    implements a
{

    final MnvManager this$0;

    public final void handle(String s)
    {
        MnvManager.access$300(MnvManager.this).a(new PinReceived(s));
    }

    PinReceived()
    {
        this$0 = MnvManager.this;
        super();
    }
}

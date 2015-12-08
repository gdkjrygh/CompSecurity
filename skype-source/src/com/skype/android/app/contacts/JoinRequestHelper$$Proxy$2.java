// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.android.event.EventFilter;

// Referenced classes of package com.skype.android.app.contacts:
//            JoinRequestHelper

final class this._cls0
    implements EventFilter
{

    final e this$0;

    public final boolean accept(com.skype.android.gen.ertyChange ertychange)
    {
        return ((JoinRequestHelper)tTarget()).onAcceptEvent(ertychange);
    }

    public final volatile boolean accept(Object obj)
    {
        return accept((com.skype.android.gen.ertyChange)obj);
    }

    e()
    {
        this$0 = this._cls0.this;
        super();
    }
}

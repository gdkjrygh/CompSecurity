// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.event.EventFilter;

// Referenced classes of package com.skype.android.app.chat:
//            ChatFragment

final class this._cls0
    implements EventFilter
{

    final rtyChange this$0;

    public final boolean accept(com.skype.android.gen.PropertyChange propertychange)
    {
        return ((ChatFragment)Target()).onAcceptEvent(propertychange);
    }

    public final volatile boolean accept(Object obj)
    {
        return accept((com.skype.android.gen.PropertyChange)obj);
    }

    rtyChange()
    {
        this$0 = this._cls0.this;
        super();
    }
}

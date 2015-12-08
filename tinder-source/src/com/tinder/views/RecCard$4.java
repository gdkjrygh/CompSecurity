// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.webkit.ConsoleMessage;
import com.tinder.h.a;

// Referenced classes of package com.tinder.views:
//            RecCard

class this._cls0 extends a
{

    final RecCard this$0;

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        String.format("Console: %s [%s:%s] %s", new Object[] {
            consolemessage.messageLevel().name(), consolemessage.sourceId(), Integer.valueOf(consolemessage.lineNumber()), consolemessage.message()
        });
        if (consolemessage.messageLevel() == android.webkit.sage.MessageLevel.ERROR)
        {
            RecCard.access$302(RecCard.this, true);
        }
        return true;
    }

    ge()
    {
        this$0 = RecCard.this;
        super();
    }
}

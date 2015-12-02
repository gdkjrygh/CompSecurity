// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.switcher;

import android.os.Message;

// Referenced classes of package com.qihoo.security.widget.switcher:
//            Switch

class a
    implements android.os.allback
{

    final Switch a;

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            Switch.a(a, Switch.a(a));
            Switch.b(a);
            a.invalidate();
            return true;

        case 0: // '\0'
            Switch.b(a, Switch.a(a));
            Switch.b(a);
            a.invalidate();
            return true;
        }
    }

    (Switch switch1)
    {
        a = switch1;
        super();
    }
}

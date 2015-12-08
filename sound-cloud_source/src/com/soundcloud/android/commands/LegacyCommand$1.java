// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import rx.b.b;

// Referenced classes of package com.soundcloud.android.commands:
//            LegacyCommand

class this._cls0
    implements b
{

    final LegacyCommand this$0;

    public void call(Object obj)
    {
        try
        {
            with(obj).call();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new mmandFailedException(((Throwable) (obj)));
        }
    }

    mmandFailedException()
    {
        this$0 = LegacyCommand.this;
        super();
    }
}

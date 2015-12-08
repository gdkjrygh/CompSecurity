// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.fordsync.interactions:
//            ErrorHandler_

class this._cls0 extends c
{

    final ErrorHandler_ this$0;

    public void execute()
    {
        try
        {
            ErrorHandler_.access$001(ErrorHandler_.this);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (String s, int i, String s1)
    {
        this$0 = ErrorHandler_.this;
        super(s, i, s1);
    }
}

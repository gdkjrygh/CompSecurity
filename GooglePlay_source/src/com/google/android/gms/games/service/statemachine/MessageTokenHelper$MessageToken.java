// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            MessageTokenHelper

public final class mToken
{

    private final int mToken;
    final MessageTokenHelper this$0;

    public final boolean isValid()
    {
        return mToken == mCurrentToken.get();
    }

    (int i)
    {
        this$0 = MessageTokenHelper.this;
        super();
        mToken = i;
    }
}

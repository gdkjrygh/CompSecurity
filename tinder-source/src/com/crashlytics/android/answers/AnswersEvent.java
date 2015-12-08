// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.c;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventValidator, AnswersAttributes

public abstract class AnswersEvent
{

    final AnswersEventValidator b = new AnswersEventValidator(io.fabric.sdk.android.c.b());
    final AnswersAttributes c;

    public AnswersEvent()
    {
        c = new AnswersAttributes(b);
    }
}

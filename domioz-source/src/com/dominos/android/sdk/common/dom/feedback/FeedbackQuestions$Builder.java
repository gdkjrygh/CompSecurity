// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.feedback;

import com.google.a.b.av;

// Referenced classes of package com.dominos.android.sdk.common.dom.feedback:
//            FeedbackQuestions

public class questions
{

    private av questions;

    public FeedbackQuestions build()
    {
        return new FeedbackQuestions(questions, null);
    }

    public questions setQuestions(av av1)
    {
        questions = av1;
        return this;
    }

    public ()
    {
        questions = av.g();
    }
}

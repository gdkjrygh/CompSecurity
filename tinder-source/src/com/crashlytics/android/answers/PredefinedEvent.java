// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEvent, AnswersAttributes

public abstract class PredefinedEvent extends AnswersEvent
{

    final AnswersAttributes d;

    public PredefinedEvent()
    {
        d = new AnswersAttributes(b);
    }

    abstract String a();

    public String toString()
    {
        return (new StringBuilder("{type:\"")).append(a()).append('"').append(", predefinedAttributes:").append(d).append(", customAttributes:").append(c).append("}").toString();
    }
}

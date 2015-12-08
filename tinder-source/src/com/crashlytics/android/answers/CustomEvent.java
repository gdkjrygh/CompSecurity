// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEvent

public class CustomEvent extends AnswersEvent
{

    private final String a;

    public String toString()
    {
        return (new StringBuilder("{eventName:\"")).append(a).append('"').append(", customAttributes:").append(c).append("}").toString();
    }
}

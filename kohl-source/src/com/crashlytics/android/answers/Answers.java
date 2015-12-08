// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersKit

public class Answers extends AnswersKit
{

    public Answers()
    {
    }

    public static Answers getInstance()
    {
        return (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
    }

    public volatile String getIdentifier()
    {
        return super.getIdentifier();
    }

    public volatile String getVersion()
    {
        return super.getVersion();
    }

    public volatile void onException(io.fabric.sdk.android.services.common.Crash.FatalException fatalexception)
    {
        super.onException(fatalexception);
    }

    public volatile void onException(io.fabric.sdk.android.services.common.Crash.LoggedException loggedexception)
    {
        super.onException(loggedexception);
    }
}

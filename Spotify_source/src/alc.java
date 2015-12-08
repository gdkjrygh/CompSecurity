// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Map;

public final class alc
{

    final com.crashlytics.android.answers.SessionEvent.Type a;
    final long b = System.currentTimeMillis();
    public Map c;
    Map d;
    Map e;

    public alc(com.crashlytics.android.answers.SessionEvent.Type type)
    {
        a = type;
        c = Collections.emptyMap();
        d = Collections.emptyMap();
        e = Collections.emptyMap();
    }
}

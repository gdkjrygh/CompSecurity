// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            EventFilter, SessionEvent

class KeepAllEventFilter
    implements EventFilter
{

    KeepAllEventFilter()
    {
    }

    public final boolean a(SessionEvent sessionevent)
    {
        return false;
    }
}

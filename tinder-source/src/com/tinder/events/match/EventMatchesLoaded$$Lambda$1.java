// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.match;

import com.b.a.a.b;
import com.tinder.model.Match;

// Referenced classes of package com.tinder.events.match:
//            EventMatchesLoaded

final class 
    implements b
{

    private static final bda._cls0 instance = new <init>();

    public static b lambdaFactory$()
    {
        return instance;
    }

    public final boolean test(Object obj)
    {
        return EventMatchesLoaded.access$lambda$0((Match)obj);
    }


    private ()
    {
    }
}

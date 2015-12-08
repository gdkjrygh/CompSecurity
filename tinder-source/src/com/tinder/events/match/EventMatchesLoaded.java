// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.match;

import com.b.a.d;
import com.tinder.model.Match;
import java.util.List;
import java.util.Set;

public class EventMatchesLoaded
{

    private List newMatches;

    public EventMatchesLoaded(List list)
    {
        newMatches = list;
    }

    private static boolean lambda$getMessagedMatches$49(Match match)
    {
        return match.hasMessages();
    }

    private static boolean lambda$getNewMatches$48(Match match)
    {
        return !match.hasMessages();
    }

    private static boolean lambda$hasMessagedMatches$51(Match match)
    {
        return match.hasMessages();
    }

    private static boolean lambda$hasNewMatches$50(Match match)
    {
        return !match.hasMessages();
    }

    public Set getMessagedMatches()
    {
        class .Lambda._cls2
            implements b
        {

            private static final .Lambda._cls2 instance = new .Lambda._cls2();

            public static b lambdaFactory$()
            {
                return instance;
            }

            public final boolean test(Object obj)
            {
                return EventMatchesLoaded.lambda$getMessagedMatches$49((Match)obj);
            }


            private .Lambda._cls2()
            {
            }
        }

        return (Set)d.a(newMatches).a(.Lambda._cls2.lambdaFactory.()).a(new com.b.a.b._cls2());
    }

    public Set getNewMatches()
    {
        class .Lambda._cls1
            implements b
        {

            private static final .Lambda._cls1 instance = new .Lambda._cls1();

            public static b lambdaFactory$()
            {
                return instance;
            }

            public final boolean test(Object obj)
            {
                return EventMatchesLoaded.lambda$getNewMatches$48((Match)obj);
            }


            private .Lambda._cls1()
            {
            }
        }

        return (Set)d.a(newMatches).a(.Lambda._cls1.lambdaFactory.()).a(new com.b.a.b._cls2());
    }

    public boolean hasMatches()
    {
        return !newMatches.isEmpty();
    }

    public boolean hasMessagedMatches()
    {
        class .Lambda._cls4
            implements b
        {

            private static final .Lambda._cls4 instance = new .Lambda._cls4();

            public static b lambdaFactory$()
            {
                return instance;
            }

            public final boolean test(Object obj)
            {
                return EventMatchesLoaded.lambda$hasMessagedMatches$51((Match)obj);
            }


            private .Lambda._cls4()
            {
            }
        }

        return d.a(newMatches).b(.Lambda._cls4.lambdaFactory.());
    }

    public boolean hasNewMatches()
    {
        class .Lambda._cls3
            implements b
        {

            private static final .Lambda._cls3 instance = new .Lambda._cls3();

            public static b lambdaFactory$()
            {
                return instance;
            }

            public final boolean test(Object obj)
            {
                return EventMatchesLoaded.lambda$hasNewMatches$50((Match)obj);
            }


            private .Lambda._cls3()
            {
            }
        }

        return d.a(newMatches).b(.Lambda._cls3.lambdaFactory.());
    }




}

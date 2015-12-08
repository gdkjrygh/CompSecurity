// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventMetadata

final class SessionEvent
{

    public final SessionEventMetadata a;
    public final long b;
    public final Type c;
    public final Map d;
    public final String e;
    public final Map f;
    private String g;

    private SessionEvent(SessionEventMetadata sessioneventmetadata, long l, Type type, Map map, String s, Map map1)
    {
        a = sessioneventmetadata;
        b = l;
        c = type;
        d = map;
        e = s;
        f = map1;
    }

    public static SessionEvent a(SessionEventMetadata sessioneventmetadata)
    {
        return a(sessioneventmetadata, Type.j, Collections.emptyMap());
    }

    public static SessionEvent a(SessionEventMetadata sessioneventmetadata, Type type, Activity activity)
    {
        return a(sessioneventmetadata, type, Collections.singletonMap("activity", activity.getClass().getName()));
    }

    private static SessionEvent a(SessionEventMetadata sessioneventmetadata, Type type, Map map)
    {
        return a(sessioneventmetadata, type, map, null, Collections.emptyMap());
    }

    private static SessionEvent a(SessionEventMetadata sessioneventmetadata, Type type, Map map, String s, Map map1)
    {
        return new SessionEvent(sessioneventmetadata, System.currentTimeMillis(), type, map, s, map1);
    }

    public static SessionEvent a(SessionEventMetadata sessioneventmetadata, String s)
    {
        s = Collections.singletonMap("sessionId", s);
        return a(sessioneventmetadata, Type.h, ((Map) (s)));
    }

    public static SessionEvent b(SessionEventMetadata sessioneventmetadata, String s)
    {
        s = Collections.singletonMap("sessionId", s);
        return a(sessioneventmetadata, Type.i, s);
    }

    public String toString()
    {
        if (g == null)
        {
            g = (new StringBuilder()).append("[").append(getClass().getSimpleName()).append(": ").append("timestamp=").append(b).append(", type=").append(c).append(", details=").append(d.toString()).append(", customType=").append(e).append(", customAttributes=").append(f.toString()).append(", metadata=[").append(a).append("]]").toString();
        }
        return g;
    }

    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final Type h;
        public static final Type i;
        public static final Type j;
        public static final Type k;
        private static final Type l[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/crashlytics/android/answers/SessionEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])l.clone();
        }

        static 
        {
            a = new Type("CREATE", 0);
            b = new Type("START", 1);
            c = new Type("RESUME", 2);
            d = new Type("SAVE_INSTANCE_STATE", 3);
            e = new Type("PAUSE", 4);
            f = new Type("STOP", 5);
            g = new Type("DESTROY", 6);
            h = new Type("ERROR", 7);
            i = new Type("CRASH", 8);
            j = new Type("INSTALL", 9);
            k = new Type("CUSTOM", 10);
            l = (new Type[] {
                a, b, c, d, e, f, g, h, i, j, 
                k
            });
        }

        private Type(String s, int i1)
        {
            super(s, i1);
        }
    }

}

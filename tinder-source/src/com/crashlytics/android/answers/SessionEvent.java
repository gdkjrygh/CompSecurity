// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventMetadata

public final class SessionEvent
{
    static class Builder
    {

        final Type a;
        final long b = System.currentTimeMillis();
        Map c;
        String d;
        Map e;
        String f;
        Map g;

        public Builder(Type type)
        {
            a = type;
            c = Collections.emptyMap();
            d = null;
            e = Collections.emptyMap();
            f = null;
            g = Collections.emptyMap();
        }
    }

    static final class Type extends Enum
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
        public static final Type l;
        private static final Type m[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/crashlytics/android/answers/SessionEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])m.clone();
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
            l = new Type("PREDEFINED", 11);
            m = (new Type[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l
            });
        }

        private Type(String s, int i1)
        {
            super(s, i1);
        }
    }


    public final SessionEventMetadata a;
    public final long b;
    public final Type c;
    public final Map d;
    public final String e;
    public final Map f;
    public final String g;
    public final Map h;
    private String i;

    private SessionEvent(SessionEventMetadata sessioneventmetadata, long l, Type type, Map map, String s, Map map1, 
            String s1, Map map2)
    {
        a = sessioneventmetadata;
        b = l;
        c = type;
        d = map;
        e = s;
        f = map1;
        g = s1;
        h = map2;
    }

    SessionEvent(SessionEventMetadata sessioneventmetadata, long l, Type type, Map map, String s, Map map1, 
            String s1, Map map2, byte byte0)
    {
        this(sessioneventmetadata, l, type, map, s, map1, s1, map2);
    }

    public static Builder a()
    {
        return new Builder(Type.j);
    }

    public static Builder a(Type type, Activity activity)
    {
        activity = Collections.singletonMap("activity", activity.getClass().getName());
        type = new Builder(type);
        type.c = activity;
        return type;
    }

    public static Builder a(String s)
    {
        s = Collections.singletonMap("sessionId", s);
        Builder builder = new Builder(Type.h);
        builder.c = s;
        return builder;
    }

    public static Builder b(String s)
    {
        s = Collections.singletonMap("sessionId", s);
        Builder builder = new Builder(Type.i);
        builder.c = s;
        return builder;
    }

    public final String toString()
    {
        if (i == null)
        {
            i = (new StringBuilder("[")).append(getClass().getSimpleName()).append(": timestamp=").append(b).append(", type=").append(c).append(", details=").append(d.toString()).append(", customType=").append(e).append(", customAttributes=").append(f.toString()).append(", predefinedType=").append(g).append(", predefinedAttributes=").append(h.toString()).append(", metadata=[").append(a).append("]]").toString();
        }
        return i;
    }
}

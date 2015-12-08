// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.core;

import java.util.HashMap;

public class Interaction
{
    public static final class DEFAULTS extends Enum
    {

        public static final DEFAULTS A;
        private static final DEFAULTS B[];
        public static final DEFAULTS a;
        public static final DEFAULTS b;
        public static final DEFAULTS c;
        public static final DEFAULTS d;
        public static final DEFAULTS e;
        public static final DEFAULTS f;
        public static final DEFAULTS g;
        public static final DEFAULTS h;
        public static final DEFAULTS i;
        public static final DEFAULTS j;
        public static final DEFAULTS k;
        public static final DEFAULTS l;
        public static final DEFAULTS m;
        public static final DEFAULTS n;
        public static final DEFAULTS o;
        public static final DEFAULTS p;
        public static final DEFAULTS q;
        public static final DEFAULTS r;
        public static final DEFAULTS s;
        public static final DEFAULTS t;
        public static final DEFAULTS u;
        public static final DEFAULTS v;
        public static final DEFAULTS w;
        public static final DEFAULTS x;
        public static final DEFAULTS y;
        public static final DEFAULTS z;
        String interactionId;
        Type type;
        Version version;

        public static DEFAULTS valueOf(String s1)
        {
            return (DEFAULTS)Enum.valueOf(com/fitbit/analytics/core/Interaction$DEFAULTS, s1);
        }

        public static DEFAULTS[] values()
        {
            return (DEFAULTS[])B.clone();
        }

        static 
        {
            a = new DEFAULTS("DASHBOARD", 0, Version.b, "1", Type.a);
            b = new DEFAULTS("APP_OPEN", 1, Version.b, "0", Type.b);
            c = new DEFAULTS("APP_EXIT", 2, Version.c, "2", Type.b);
            d = new DEFAULTS("PAIR_TRACKER_SEARCHING", 3, Version.c, "10", Type.b);
            e = new DEFAULTS("PAIR_TRACKER_COMPLETE", 4, Version.c, "11", Type.b);
            f = new DEFAULTS("VIEW_SELF_PROFILE", 5, Version.c, "1000", Type.a);
            g = new DEFAULTS("VIEW_USER_PROFILE", 6, Version.c, "1001", Type.a);
            h = new DEFAULTS("VIEW_DEVICE_SETTINGS", 7, Version.c, "1010", Type.a);
            i = new DEFAULTS("VIEW_SILENT_ALARMS", 8, Version.c, "1020", Type.a);
            j = new DEFAULTS("VIEW_GOALS", 9, Version.c, "1030", Type.a);
            k = new DEFAULTS("VIEW_STEPS", 10, Version.c, "1100", Type.a);
            l = new DEFAULTS("VIEW_HEARTRATE", 11, Version.c, "1200", Type.a);
            m = new DEFAULTS("VIEW_DISTANCE", 12, Version.c, "1400", Type.a);
            n = new DEFAULTS("VIEW_CALORIES_BURNED", 13, Version.c, "1600", Type.a);
            o = new DEFAULTS("VIEW_FLOORS", 14, Version.c, "1800", Type.a);
            p = new DEFAULTS("VIEW_ACTIVE_MINUTES", 15, Version.c, "2000", Type.a);
            q = new DEFAULTS("VIEW_EXERCISE", 16, Version.c, "2200", Type.a);
            r = new DEFAULTS("VIEW_WEIGHT", 17, Version.c, "2400", Type.a);
            s = new DEFAULTS("VIEW_SLEEP", 18, Version.c, "2600", Type.a);
            t = new DEFAULTS("VIEW_FOOD", 19, Version.c, "2800", Type.a);
            u = new DEFAULTS("VIEW_WATER", 20, Version.c, "3000", Type.a);
            v = new DEFAULTS("VIEW_CHALLENGES", 21, Version.c, "3200", Type.a);
            w = new DEFAULTS("CHALLENGE_ACTION_SHEET", 22, Version.c, "3201", Type.a);
            x = new DEFAULTS("ACTIVE_PENDING_CHALLENGE", 23, Version.c, "3202", Type.a);
            y = new DEFAULTS("FRIENDS_TAB", 24, Version.c, "3203", Type.a);
            z = new DEFAULTS("FIND_FRIEND", 25, Version.c, "3204", Type.a);
            A = new DEFAULTS("VIEW_HELP", 26, Version.c, "5200", Type.a);
            B = (new DEFAULTS[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A
            });
        }

        private DEFAULTS(String s1, int i1, Version version1, String s2, Type type1)
        {
            super(s1, i1);
            version = version1;
            interactionId = s2;
            type = type1;
        }
    }

    public static final class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        private static final Type c[];
        public final String name;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/fitbit/analytics/core/Interaction$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        static 
        {
            a = new Type("SCREEN", 0, "screen");
            b = new Type("EVENT", 1, "event");
            c = (new Type[] {
                a, b
            });
        }

        private Type(String s, int i, String s1)
        {
            super(s, i);
            name = s1;
        }
    }

    public static final class Version extends Enum
    {

        public static final Version a;
        public static final Version b;
        public static final Version c;
        private static final Version d[];
        public final String name;

        public static Version valueOf(String s)
        {
            return (Version)Enum.valueOf(com/fitbit/analytics/core/Interaction$Version, s);
        }

        public static Version[] values()
        {
            return (Version[])d.clone();
        }

        static 
        {
            a = new Version("V0", 0, "v0");
            b = new Version("V1", 1, "v1");
            c = new Version("V2", 2, "v2");
            d = (new Version[] {
                a, b, c
            });
        }

        private Version(String s, int i, String s1)
        {
            super(s, i);
            name = s1;
        }
    }


    public final Version a;
    public final String b;
    public final Type c;
    public final HashMap d;

    public Interaction(DEFAULTS defaults)
    {
        this(defaults.version, defaults.interactionId, defaults.type);
    }

    public Interaction(Version version)
    {
        this(version, null, null);
    }

    public Interaction(Version version, String s, Type type)
    {
        a = version;
        b = s;
        c = type;
        d = new HashMap();
        a("cid", "1147");
        a("os", "Android");
        if (a != Version.a)
        {
            a("type", type.name);
            a("id", s);
        }
    }

    public Interaction(Version version, String s, Type type, HashMap hashmap)
    {
        this(version, s, type);
        d.putAll(hashmap);
    }

    public void a(String s, String s1)
    {
        d.put(s, s1);
    }
}

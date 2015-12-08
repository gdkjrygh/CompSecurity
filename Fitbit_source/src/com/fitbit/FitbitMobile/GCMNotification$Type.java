// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.FitbitMobile;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;

// Referenced classes of package com.fitbit.FitbitMobile:
//            GCMNotification

public static final class requiresProfile extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    public static final g h;
    private static final EnumSet i;
    private static final g j[];
    private boolean requiresProfile;

    public static requiresProfile a(String s)
    {
        if (s == null)
        {
            return a;
        }
        if (s.contains("friend/invite/"))
        {
            return c;
        }
        if (s.contains("friend/message/"))
        {
            return d;
        }
        if (s.contains("corporate/"))
        {
            return e;
        }
        if (s.matches("challenge/[a-zA-Z0-9]*/invite"))
        {
            return f;
        }
        if (s.matches("challenge/[a-zA-Z0-9]*/message") || s.matches("challenge/[a-zA-Z0-9]*/cheer/[a-zA-Z0-9]*"))
        {
            return g;
        }
        if (s.contains("badge/"))
        {
            return h;
        }
        requiresProfile requiresprofile = a;
        try
        {
            s = valueOf(s.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return b;
        }
        return s;
    }

    public static Collection a()
    {
        return Collections.unmodifiableSet(i);
    }

    static boolean a(i k)
    {
        return k.requiresProfile;
    }

    public static requiresProfile valueOf(String s)
    {
        return (requiresProfile)Enum.valueOf(com/fitbit/FitbitMobile/GCMNotification$Type, s);
    }

    public static requiresProfile[] values()
    {
        return (requiresProfile[])j.clone();
    }

    public boolean b()
    {
        return i.contains(this);
    }

    static 
    {
        a = new <init>("GOAL_RELATED", 0, true);
        b = new <init>("UNKNOWN", 1, true);
        c = new <init>("FRIEND_INVITE", 2, true);
        d = new <init>("FRIEND_MESSAGE", 3, true);
        e = new <init>("CORPORATE", 4, true);
        f = new <init>("CHALLENGE_INVITE", 5, true);
        g = new <init>("CHALLENGE_MESSAGE", 6, true);
        h = new <init>("NEW_BADGE", 7, true);
        j = (new j[] {
            a, b, c, d, e, f, g, h
        });
        i = EnumSet.of(d, e, c, f, g);
    }

    private (String s, int k, boolean flag)
    {
        super(s, k);
        requiresProfile = flag;
    }
}

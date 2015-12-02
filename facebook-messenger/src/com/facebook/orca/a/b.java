// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.a;

import com.google.common.a.ev;
import java.util.Map;

public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b ANY_THREAD;
    private static final Map LOOK_UP;
    public static final b NEW_THREAD;
    public static final b NONE;
    private final String mValue;

    private b(String s, int i, String s1)
    {
        super(s, i);
        mValue = s1;
    }

    public static b lookup(String s)
    {
        return (b)LOOK_UP.get(s);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/orca/a/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    public String toString()
    {
        return mValue;
    }

    static 
    {
        NONE = new b("NONE", 0, "none");
        NEW_THREAD = new b("NEW_THREAD", 1, "new_thread");
        ANY_THREAD = new b("ANY_THREAD", 2, "any_thread");
        $VALUES = (new b[] {
            NONE, NEW_THREAD, ANY_THREAD
        });
        LOOK_UP = ev.a("none", NONE, "new_thread", NEW_THREAD, "any_thread", ANY_THREAD);
    }
}

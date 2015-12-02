// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import com.b.a.a.a.a;
import com.b.a.a.a.b;
import com.b.a.a.a.d;
import com.b.a.a.a.e;
import com.b.a.a.a.f;

// Referenced classes of package com.b.a.a:
//            g

public final class c extends Enum
    implements g
{

    private static final c $VALUES[];
    public static final c DetectAll;
    public static final c Lax;
    public static final c PenaltyDeath;
    public static final c PenaltyDropBox;
    public static final c PenaltyLog;
    public static final c Reset;
    private final g mSetter;

    private c(String s, int i, g g1)
    {
        super(s, i);
        mSetter = g1;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/b/a/a/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    public void set()
    {
        mSetter.set();
    }

    static 
    {
        Lax = new c("Lax", 0, new b());
        Reset = new c("Reset", 1, new f());
        DetectAll = new c("DetectAll", 2, new a());
        PenaltyDeath = new c("PenaltyDeath", 3, new com.b.a.a.a.c());
        PenaltyDropBox = new c("PenaltyDropBox", 4, new d());
        PenaltyLog = new c("PenaltyLog", 5, new e());
        $VALUES = (new c[] {
            Lax, Reset, DetectAll, PenaltyDeath, PenaltyDropBox, PenaltyLog
        });
    }
}

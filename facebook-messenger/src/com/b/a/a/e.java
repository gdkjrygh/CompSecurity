// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import com.b.a.a.a.aa;
import com.b.a.a.a.ab;
import com.b.a.a.a.ac;
import com.b.a.a.a.ad;
import com.b.a.a.a.ae;
import com.b.a.a.a.af;
import com.b.a.a.a.ag;
import com.b.a.a.a.ah;
import com.b.a.a.a.y;
import com.b.a.a.a.z;

// Referenced classes of package com.b.a.a:
//            g

public final class e extends Enum
    implements g
{

    private static final e $VALUES[];
    public static final e DetectActivityLeaks;
    public static final e DetectAll;
    public static final e DetectLeakedClosableObjects;
    public static final e DetectLeakedRegistrationObjects;
    public static final e DetectLeakedSqlLiteObjects;
    public static final e Lax;
    public static final e PenaltyDeath;
    public static final e PenaltyDropBox;
    public static final e PenaltyLog;
    public static final e Reset;
    private final g mSetter;

    private e(String s, int i, g g1)
    {
        super(s, i);
        mSetter = g1;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/b/a/a/e, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    public void set()
    {
        mSetter.set();
    }

    static 
    {
        Lax = new e("Lax", 0, new ad());
        Reset = new e("Reset", 1, new ah());
        DetectAll = new e("DetectAll", 2, new z());
        DetectActivityLeaks = new e("DetectActivityLeaks", 3, new y());
        DetectLeakedClosableObjects = new e("DetectLeakedClosableObjects", 4, new aa());
        DetectLeakedRegistrationObjects = new e("DetectLeakedRegistrationObjects", 5, new ab());
        DetectLeakedSqlLiteObjects = new e("DetectLeakedSqlLiteObjects", 6, new ac());
        PenaltyDeath = new e("PenaltyDeath", 7, new ae());
        PenaltyDropBox = new e("PenaltyDropBox", 8, new af());
        PenaltyLog = new e("PenaltyLog", 9, new ag());
        $VALUES = (new e[] {
            Lax, Reset, DetectAll, DetectActivityLeaks, DetectLeakedClosableObjects, DetectLeakedRegistrationObjects, DetectLeakedSqlLiteObjects, PenaltyDeath, PenaltyDropBox, PenaltyLog
        });
    }
}

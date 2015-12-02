// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import com.b.a.a.a.h;
import com.b.a.a.a.i;
import com.b.a.a.a.j;
import com.b.a.a.a.k;
import com.b.a.a.a.l;
import com.b.a.a.a.m;
import com.b.a.a.a.n;
import com.b.a.a.a.o;
import com.b.a.a.a.p;
import com.b.a.a.a.q;
import com.b.a.a.a.r;
import com.b.a.a.a.s;
import com.b.a.a.a.t;
import com.b.a.a.a.u;
import com.b.a.a.a.v;
import com.b.a.a.a.w;

// Referenced classes of package com.b.a.a:
//            g

public final class d extends Enum
    implements g
{

    private static final d $VALUES[];
    public static final d DetectAll;
    public static final d DetectCustomSlowCalls;
    public static final d DetectDisk;
    public static final d DetectNetwork;
    public static final d Lax;
    public static final d PenaltyDeath;
    public static final d PenaltyDeathOnNetwork;
    public static final d PenaltyDialog;
    public static final d PenaltyDropBox;
    public static final d PenaltyFlashScreen;
    public static final d PenaltyLog;
    public static final d PermitAll;
    public static final d PermitCustomSlowCalls;
    public static final d PermitDisk;
    public static final d PermitNetwork;
    public static final d Reset;
    private final g mSetter;

    private d(String s1, int i1, g g1)
    {
        super(s1, i1);
        mSetter = g1;
    }

    public static d valueOf(String s1)
    {
        return (d)Enum.valueOf(com/b/a/a/d, s1);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    public void set()
    {
        mSetter.set();
    }

    static 
    {
        Lax = new d("Lax", 0, new l());
        Reset = new d("Reset", 1, new w());
        PermitAll = new d("PermitAll", 2, new s());
        DetectAll = new d("DetectAll", 3, new h());
        PermitDisk = new d("PermitDisk", 4, new u());
        DetectDisk = new d("DetectDisk", 5, new j());
        PermitNetwork = new d("PermitNetwork", 6, new v());
        DetectNetwork = new d("DetectNetwork", 7, new k());
        PermitCustomSlowCalls = new d("PermitCustomSlowCalls", 8, new t());
        DetectCustomSlowCalls = new d("DetectCustomSlowCalls", 9, new i());
        PenaltyDeath = new d("PenaltyDeath", 10, new m());
        PenaltyDeathOnNetwork = new d("PenaltyDeathOnNetwork", 11, new n());
        PenaltyDialog = new d("PenaltyDialog", 12, new o());
        PenaltyDropBox = new d("PenaltyDropBox", 13, new p());
        PenaltyLog = new d("PenaltyLog", 14, new r());
        PenaltyFlashScreen = new d("PenaltyFlashScreen", 15, new q());
        $VALUES = (new d[] {
            Lax, Reset, PermitAll, DetectAll, PermitDisk, DetectDisk, PermitNetwork, DetectNetwork, PermitCustomSlowCalls, DetectCustomSlowCalls, 
            PenaltyDeath, PenaltyDeathOnNetwork, PenaltyDialog, PenaltyDropBox, PenaltyLog, PenaltyFlashScreen
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.common.internal.n;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState

public final class a
    implements AppState
{

    private final int CO;
    private final String CP;
    private final byte CQ[];
    private final boolean CR;
    private final String CS;
    private final byte CT[];

    public a(AppState appstate)
    {
        CO = appstate.getKey();
        CP = appstate.getLocalVersion();
        CQ = appstate.getLocalData();
        CR = appstate.hasConflict();
        CS = appstate.getConflictVersion();
        CT = appstate.getConflictData();
    }

    static int a(AppState appstate)
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(appstate.getKey()), appstate.getLocalVersion(), appstate.getLocalData(), Boolean.valueOf(appstate.hasConflict()), appstate.getConflictVersion(), appstate.getConflictData()
        });
    }

    static boolean a(AppState appstate, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppState) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appstate == obj) goto _L4; else goto _L3
_L3:
        obj = (AppState)obj;
        if (!n.equal(Integer.valueOf(((AppState) (obj)).getKey()), Integer.valueOf(appstate.getKey())) || !n.equal(((AppState) (obj)).getLocalVersion(), appstate.getLocalVersion()) || !n.equal(((AppState) (obj)).getLocalData(), appstate.getLocalData()) || !n.equal(Boolean.valueOf(((AppState) (obj)).hasConflict()), Boolean.valueOf(appstate.hasConflict())) || !n.equal(((AppState) (obj)).getConflictVersion(), appstate.getConflictVersion()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((AppState) (obj)).getConflictData(), appstate.getConflictData())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppState appstate)
    {
        return n.h(appstate).a("Key", Integer.valueOf(appstate.getKey())).a("LocalVersion", appstate.getLocalVersion()).a("LocalData", appstate.getLocalData()).a("HasConflict", Boolean.valueOf(appstate.hasConflict())).a("ConflictVersion", appstate.getConflictVersion()).a("ConflictData", appstate.getConflictData()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public AppState fo()
    {
        return this;
    }

    public Object freeze()
    {
        return fo();
    }

    public byte[] getConflictData()
    {
        return CT;
    }

    public String getConflictVersion()
    {
        return CS;
    }

    public int getKey()
    {
        return CO;
    }

    public byte[] getLocalData()
    {
        return CQ;
    }

    public String getLocalVersion()
    {
        return CP;
    }

    public boolean hasConflict()
    {
        return CR;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return b(this);
    }
}

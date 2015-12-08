// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState

public final class a
    implements AppState
{

    private final int DK;
    private final String DL;
    private final byte DM[];
    private final boolean DN;
    private final String DO;
    private final byte DP[];

    public a(AppState appstate)
    {
        DK = appstate.getKey();
        DL = appstate.getLocalVersion();
        DM = appstate.getLocalData();
        DN = appstate.hasConflict();
        DO = appstate.getConflictVersion();
        DP = appstate.getConflictData();
    }

    static int a(AppState appstate)
    {
        return jv.hashCode(new Object[] {
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
        if (!jv.equal(Integer.valueOf(((AppState) (obj)).getKey()), Integer.valueOf(appstate.getKey())) || !jv.equal(((AppState) (obj)).getLocalVersion(), appstate.getLocalVersion()) || !jv.equal(((AppState) (obj)).getLocalData(), appstate.getLocalData()) || !jv.equal(Boolean.valueOf(((AppState) (obj)).hasConflict()), Boolean.valueOf(appstate.hasConflict())) || !jv.equal(((AppState) (obj)).getConflictVersion(), appstate.getConflictVersion()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((AppState) (obj)).getConflictData(), appstate.getConflictData())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppState appstate)
    {
        return jv.h(appstate).a("Key", Integer.valueOf(appstate.getKey())).a("LocalVersion", appstate.getLocalVersion()).a("LocalData", appstate.getLocalData()).a("HasConflict", Boolean.valueOf(appstate.hasConflict())).a("ConflictVersion", appstate.getConflictVersion()).a("ConflictData", appstate.getConflictData()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public AppState fJ()
    {
        return this;
    }

    public Object freeze()
    {
        return fJ();
    }

    public byte[] getConflictData()
    {
        return DP;
    }

    public String getConflictVersion()
    {
        return DO;
    }

    public int getKey()
    {
        return DK;
    }

    public byte[] getLocalData()
    {
        return DM;
    }

    public String getLocalVersion()
    {
        return DL;
    }

    public boolean hasConflict()
    {
        return DN;
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

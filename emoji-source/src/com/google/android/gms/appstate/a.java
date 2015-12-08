// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.internal.hk;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState

public final class a
    implements AppState
{

    private final int yB;
    private final String yC;
    private final byte yD[];
    private final boolean yE;
    private final String yF;
    private final byte yG[];

    public a(AppState appstate)
    {
        yB = appstate.getKey();
        yC = appstate.getLocalVersion();
        yD = appstate.getLocalData();
        yE = appstate.hasConflict();
        yF = appstate.getConflictVersion();
        yG = appstate.getConflictData();
    }

    static int a(AppState appstate)
    {
        return hk.hashCode(new Object[] {
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
        if (!hk.equal(Integer.valueOf(((AppState) (obj)).getKey()), Integer.valueOf(appstate.getKey())) || !hk.equal(((AppState) (obj)).getLocalVersion(), appstate.getLocalVersion()) || !hk.equal(((AppState) (obj)).getLocalData(), appstate.getLocalData()) || !hk.equal(Boolean.valueOf(((AppState) (obj)).hasConflict()), Boolean.valueOf(appstate.hasConflict())) || !hk.equal(((AppState) (obj)).getConflictVersion(), appstate.getConflictVersion()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((AppState) (obj)).getConflictData(), appstate.getConflictData())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppState appstate)
    {
        return hk.e(appstate).a("Key", Integer.valueOf(appstate.getKey())).a("LocalVersion", appstate.getLocalVersion()).a("LocalData", appstate.getLocalData()).a("HasConflict", Boolean.valueOf(appstate.hasConflict())).a("ConflictVersion", appstate.getConflictVersion()).a("ConflictData", appstate.getConflictData()).toString();
    }

    public AppState dS()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return dS();
    }

    public byte[] getConflictData()
    {
        return yG;
    }

    public String getConflictVersion()
    {
        return yF;
    }

    public int getKey()
    {
        return yB;
    }

    public byte[] getLocalData()
    {
        return yD;
    }

    public String getLocalVersion()
    {
        return yC;
    }

    public boolean hasConflict()
    {
        return yE;
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

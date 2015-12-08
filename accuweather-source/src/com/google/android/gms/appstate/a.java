// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.internal.hl;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState

public final class a
    implements AppState
{

    private final byte yA[];
    private final boolean yB;
    private final String yC;
    private final byte yD[];
    private final int yy;
    private final String yz;

    public a(AppState appstate)
    {
        yy = appstate.getKey();
        yz = appstate.getLocalVersion();
        yA = appstate.getLocalData();
        yB = appstate.hasConflict();
        yC = appstate.getConflictVersion();
        yD = appstate.getConflictData();
    }

    static int a(AppState appstate)
    {
        return hl.hashCode(new Object[] {
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
        if (!hl.equal(Integer.valueOf(((AppState) (obj)).getKey()), Integer.valueOf(appstate.getKey())) || !hl.equal(((AppState) (obj)).getLocalVersion(), appstate.getLocalVersion()) || !hl.equal(((AppState) (obj)).getLocalData(), appstate.getLocalData()) || !hl.equal(Boolean.valueOf(((AppState) (obj)).hasConflict()), Boolean.valueOf(appstate.hasConflict())) || !hl.equal(((AppState) (obj)).getConflictVersion(), appstate.getConflictVersion()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((AppState) (obj)).getConflictData(), appstate.getConflictData())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppState appstate)
    {
        return hl.e(appstate).a("Key", Integer.valueOf(appstate.getKey())).a("LocalVersion", appstate.getLocalVersion()).a("LocalData", appstate.getLocalData()).a("HasConflict", Boolean.valueOf(appstate.hasConflict())).a("ConflictVersion", appstate.getConflictVersion()).a("ConflictData", appstate.getConflictData()).toString();
    }

    public AppState dN()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return dN();
    }

    public byte[] getConflictData()
    {
        return yD;
    }

    public String getConflictVersion()
    {
        return yC;
    }

    public int getKey()
    {
        return yy;
    }

    public byte[] getLocalData()
    {
        return yA;
    }

    public String getLocalVersion()
    {
        return yz;
    }

    public boolean hasConflict()
    {
        return yB;
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

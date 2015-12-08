// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.internal.dl;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState

public final class a
    implements AppState
{

    private final int iu;
    private final String iv;
    private final byte iw[];
    private final boolean ix;
    private final String iy;
    private final byte iz[];

    public a(AppState appstate)
    {
        iu = appstate.getKey();
        iv = appstate.getLocalVersion();
        iw = appstate.getLocalData();
        ix = appstate.hasConflict();
        iy = appstate.getConflictVersion();
        iz = appstate.getConflictData();
    }

    static int a(AppState appstate)
    {
        return dl.hashCode(new Object[] {
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
        if (!dl.equal(Integer.valueOf(((AppState) (obj)).getKey()), Integer.valueOf(appstate.getKey())) || !dl.equal(((AppState) (obj)).getLocalVersion(), appstate.getLocalVersion()) || !dl.equal(((AppState) (obj)).getLocalData(), appstate.getLocalData()) || !dl.equal(Boolean.valueOf(((AppState) (obj)).hasConflict()), Boolean.valueOf(appstate.hasConflict())) || !dl.equal(((AppState) (obj)).getConflictVersion(), appstate.getConflictVersion()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (dl.equal(((AppState) (obj)).getConflictData(), appstate.getConflictData())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppState appstate)
    {
        return dl.d(appstate).a("Key", Integer.valueOf(appstate.getKey())).a("LocalVersion", appstate.getLocalVersion()).a("LocalData", appstate.getLocalData()).a("HasConflict", Boolean.valueOf(appstate.hasConflict())).a("ConflictVersion", appstate.getConflictVersion()).a("ConflictData", appstate.getConflictData()).toString();
    }

    public AppState aE()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return aE();
    }

    public byte[] getConflictData()
    {
        return iz;
    }

    public String getConflictVersion()
    {
        return iy;
    }

    public int getKey()
    {
        return iu;
    }

    public byte[] getLocalData()
    {
        return iw;
    }

    public String getLocalVersion()
    {
        return iv;
    }

    public boolean hasConflict()
    {
        return ix;
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

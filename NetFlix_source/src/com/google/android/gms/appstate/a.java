// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState

public final class a
    implements AppState
{

    private final int wr;
    private final String ws;
    private final byte wt[];
    private final boolean wu;
    private final String wv;
    private final byte ww[];

    public a(AppState appstate)
    {
        wr = appstate.getKey();
        ws = appstate.getLocalVersion();
        wt = appstate.getLocalData();
        wu = appstate.hasConflict();
        wv = appstate.getConflictVersion();
        ww = appstate.getConflictData();
    }

    static int a(AppState appstate)
    {
        return fo.hashCode(new Object[] {
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
        if (!fo.equal(Integer.valueOf(((AppState) (obj)).getKey()), Integer.valueOf(appstate.getKey())) || !fo.equal(((AppState) (obj)).getLocalVersion(), appstate.getLocalVersion()) || !fo.equal(((AppState) (obj)).getLocalData(), appstate.getLocalData()) || !fo.equal(Boolean.valueOf(((AppState) (obj)).hasConflict()), Boolean.valueOf(appstate.hasConflict())) || !fo.equal(((AppState) (obj)).getConflictVersion(), appstate.getConflictVersion()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (fo.equal(((AppState) (obj)).getConflictData(), appstate.getConflictData())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppState appstate)
    {
        return fo.e(appstate).a("Key", Integer.valueOf(appstate.getKey())).a("LocalVersion", appstate.getLocalVersion()).a("LocalData", appstate.getLocalData()).a("HasConflict", Boolean.valueOf(appstate.hasConflict())).a("ConflictVersion", appstate.getConflictVersion()).a("ConflictData", appstate.getConflictData()).toString();
    }

    public AppState dt()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return dt();
    }

    public byte[] getConflictData()
    {
        return ww;
    }

    public String getConflictVersion()
    {
        return wv;
    }

    public int getKey()
    {
        return wr;
    }

    public byte[] getLocalData()
    {
        return wt;
    }

    public String getLocalVersion()
    {
        return ws;
    }

    public boolean hasConflict()
    {
        return wu;
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

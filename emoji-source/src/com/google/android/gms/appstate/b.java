// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState, a

public final class b extends d
    implements AppState
{

    b(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public AppState dS()
    {
        return new a(this);
    }

    public boolean equals(Object obj)
    {
        return a.a(this, obj);
    }

    public Object freeze()
    {
        return dS();
    }

    public byte[] getConflictData()
    {
        return getByteArray("conflict_data");
    }

    public String getConflictVersion()
    {
        return getString("conflict_version");
    }

    public int getKey()
    {
        return getInteger("key");
    }

    public byte[] getLocalData()
    {
        return getByteArray("local_data");
    }

    public String getLocalVersion()
    {
        return getString("local_version");
    }

    public boolean hasConflict()
    {
        return !ax("conflict_version");
    }

    public int hashCode()
    {
        return a.a(this);
    }

    public String toString()
    {
        return a.b(this);
    }
}

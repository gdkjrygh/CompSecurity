// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, Status

public abstract class a
    implements Releasable, Result
{

    protected final Status CM;
    protected final DataHolder II;

    protected a(DataHolder dataholder)
    {
        CM = new Status(dataholder.getStatusCode());
        II = dataholder;
    }

    public Status getStatus()
    {
        return CM;
    }

    public void release()
    {
        if (II != null)
        {
            II.close();
        }
    }
}

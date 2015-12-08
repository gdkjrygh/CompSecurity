// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, Status

public abstract class b
    implements Releasable, Result
{

    protected final Status Eb;
    protected final DataHolder JG;

    protected b(DataHolder dataholder)
    {
        Eb = new Status(dataholder.getStatusCode());
        JG = dataholder;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public void release()
    {
        if (JG != null)
        {
            JG.close();
        }
    }
}

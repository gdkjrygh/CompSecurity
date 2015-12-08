// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.MomentBuffer;

// Referenced classes of package com.google.android.gms.plus.internal:
//            e

final class Ue extends com.google.android.gms.internal.
    implements com.google.android.gms.plus.nts.LoadMomentsResult
{

    private final String EM;
    final e Ud;
    private final String Ue;
    private MomentBuffer Uf;
    private final Status wJ;

    protected void a(com.google.android.gms.common.api..c c1, DataHolder dataholder)
    {
        if (dataholder != null)
        {
            dataholder = new MomentBuffer(dataholder);
        } else
        {
            dataholder = null;
        }
        Uf = dataholder;
        c1.b(this);
    }

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.)obj, dataholder);
    }

    public MomentBuffer getMomentBuffer()
    {
        return Uf;
    }

    public String getNextPageToken()
    {
        return EM;
    }

    public Status getStatus()
    {
        return wJ;
    }

    public String getUpdated()
    {
        return Ue;
    }

    public void release()
    {
        if (Uf != null)
        {
            Uf.close();
        }
    }

    public lder(e e1, com.google.android.gms.common.api. , Status status, DataHolder dataholder, String s, String s1)
    {
        Ud = e1;
        super(e1, , dataholder);
        wJ = status;
        EM = s;
        Ue = s1;
    }
}

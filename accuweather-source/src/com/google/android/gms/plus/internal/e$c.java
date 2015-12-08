// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.MomentBuffer;

// Referenced classes of package com.google.android.gms.plus.internal:
//            e

final class abK extends com.google.android.gms.internal.
    implements com.google.android.gms.plus.nts.LoadMomentsResult
{

    private final String HP;
    final e abJ;
    private final String abK;
    private MomentBuffer abL;
    private final Status yw;

    protected void a(com.google.android.gms.common.api..c c1, DataHolder dataholder)
    {
        if (dataholder != null)
        {
            dataholder = new MomentBuffer(dataholder);
        } else
        {
            dataholder = null;
        }
        abL = dataholder;
        c1.a(this);
    }

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.)obj, dataholder);
    }

    public MomentBuffer getMomentBuffer()
    {
        return abL;
    }

    public String getNextPageToken()
    {
        return HP;
    }

    public Status getStatus()
    {
        return yw;
    }

    public String getUpdated()
    {
        return abK;
    }

    public void release()
    {
        if (abL != null)
        {
            abL.close();
        }
    }

    public lder(e e1, com.google.android.gms.common.api. , Status status, DataHolder dataholder, String s, String s1)
    {
        abJ = e1;
        super(e1, , dataholder);
        yw = status;
        HP = s;
        abK = s1;
    }
}

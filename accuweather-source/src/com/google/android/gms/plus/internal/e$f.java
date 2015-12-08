// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.people.PersonBuffer;

// Referenced classes of package com.google.android.gms.plus.internal:
//            e

final class HP extends com.google.android.gms.internal.
    implements com.google.android.gms.plus.le.LoadPeopleResult
{

    private final String HP;
    final e abJ;
    private PersonBuffer abM;
    private final Status yw;

    protected void a(com.google.android.gms.common.api..f f1, DataHolder dataholder)
    {
        if (dataholder != null)
        {
            dataholder = new PersonBuffer(dataholder);
        } else
        {
            dataholder = null;
        }
        abM = dataholder;
        f1.a(this);
    }

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.)obj, dataholder);
    }

    public String getNextPageToken()
    {
        return HP;
    }

    public PersonBuffer getPersonBuffer()
    {
        return abM;
    }

    public Status getStatus()
    {
        return yw;
    }

    public void release()
    {
        if (abM != null)
        {
            abM.close();
        }
    }

    public lder(e e1, com.google.android.gms.common.api. , Status status, DataHolder dataholder, String s)
    {
        abJ = e1;
        super(e1, , dataholder);
        yw = status;
        HP = s;
    }
}

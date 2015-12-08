// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

// Referenced classes of package com.google.android.gms.internal:
//            kp, kq

public final class kr extends d
    implements Moment
{

    private kp adp;

    public kr(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private kp kE()
    {
        this;
        JVM INSTR monitorenter ;
        if (adp == null)
        {
            byte abyte0[] = getByteArray("momentImpl");
            Parcel parcel = Parcel.obtain();
            parcel.unmarshall(abyte0, 0, abyte0.length);
            parcel.setDataPosition(0);
            adp = kp.CREATOR.bF(parcel);
            parcel.recycle();
        }
        this;
        JVM INSTR monitorexit ;
        return adp;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object freeze()
    {
        return kD();
    }

    public String getId()
    {
        return kE().getId();
    }

    public ItemScope getResult()
    {
        return kE().getResult();
    }

    public String getStartDate()
    {
        return kE().getStartDate();
    }

    public ItemScope getTarget()
    {
        return kE().getTarget();
    }

    public String getType()
    {
        return kE().getType();
    }

    public boolean hasId()
    {
        return kE().hasId();
    }

    public boolean hasResult()
    {
        return kE().hasId();
    }

    public boolean hasStartDate()
    {
        return kE().hasStartDate();
    }

    public boolean hasTarget()
    {
        return kE().hasTarget();
    }

    public boolean hasType()
    {
        return kE().hasType();
    }

    public kp kD()
    {
        return kE();
    }
}

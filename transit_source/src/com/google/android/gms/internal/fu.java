// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.b;
import com.google.android.gms.common.data.d;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

// Referenced classes of package com.google.android.gms.internal:
//            fs, ft

public final class fu extends b
    implements Moment
{

    private fs sI;

    public fu(d d, int i)
    {
        super(d, i);
    }

    private fs dC()
    {
        this;
        JVM INSTR monitorenter ;
        if (sI == null)
        {
            byte abyte0[] = getByteArray("momentImpl");
            Parcel parcel = Parcel.obtain();
            parcel.unmarshall(abyte0, 0, abyte0.length);
            parcel.setDataPosition(0);
            sI = fs.CREATOR.C(parcel);
            parcel.recycle();
        }
        this;
        JVM INSTR monitorexit ;
        return sI;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public fs dB()
    {
        return dC();
    }

    public Object freeze()
    {
        return dB();
    }

    public String getId()
    {
        return dC().getId();
    }

    public ItemScope getResult()
    {
        return dC().getResult();
    }

    public String getStartDate()
    {
        return dC().getStartDate();
    }

    public ItemScope getTarget()
    {
        return dC().getTarget();
    }

    public String getType()
    {
        return dC().getType();
    }

    public boolean hasId()
    {
        return dC().hasId();
    }

    public boolean hasResult()
    {
        return dC().hasId();
    }

    public boolean hasStartDate()
    {
        return dC().hasStartDate();
    }

    public boolean hasTarget()
    {
        return dC().hasTarget();
    }

    public boolean hasType()
    {
        return dC().hasType();
    }
}

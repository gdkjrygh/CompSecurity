// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.parcels.a;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.fbservice.service:
//            ag

public class OperationType
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ag();
    private final String a;
    private final boolean b;

    private OperationType(Parcel parcel)
    {
        a = parcel.readString();
        b = com.facebook.common.parcels.a.a(parcel);
    }

    OperationType(Parcel parcel, ag ag1)
    {
        this(parcel);
    }

    public OperationType(String s)
    {
        this(s, false);
    }

    private OperationType(String s, boolean flag)
    {
        a = (String)Preconditions.checkNotNull(s);
        b = flag;
    }

    public String a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public OperationType c()
    {
        OperationType operationtype = this;
        if (b)
        {
            operationtype = new OperationType(a);
        }
        return operationtype;
    }

    public OperationType d()
    {
        if (b)
        {
            return this;
        } else
        {
            return new OperationType(a, true);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (OperationType)obj;
            if (!Objects.equal(a, ((OperationType) (obj)).a) || b != ((OperationType) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b)
        {
            j = 1;
        }
        return i * 31 + j;
    }

    public String toString()
    {
        return Objects.toStringHelper(com/facebook/fbservice/service/OperationType).add("Operation Name", a).add("forRemote", Boolean.valueOf(b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        com.facebook.common.parcels.a.a(parcel, b);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models.entry;

import android.os.Parcel;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.contacts.models.entry:
//            Entry, e, d

public class PhoneEntry
    implements Entry
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private final String a;
    private final boolean b;
    private final String c;
    private final long d;
    private final String e;
    private final int f;

    protected PhoneEntry(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        b = flag;
        c = parcel.readString();
        d = parcel.readLong();
        e = parcel.readString();
        f = parcel.readInt();
    }

    public PhoneEntry(String s, boolean flag, String s1, long l, String s2, int i)
    {
        a = s;
        b = flag;
        c = s1;
        d = l;
        e = s2;
        f = i;
    }

    public d a()
    {
        return d.PHONE_NUMBER;
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
            obj = (PhoneEntry)obj;
            if (!Objects.equal(a, ((PhoneEntry) (obj)).getGraphApiWriteId()) || !Objects.equal(Boolean.valueOf(b), Boolean.valueOf(((PhoneEntry) (obj)).getIsVerified())) || !Objects.equal(c, ((PhoneEntry) (obj)).getSource()) || !Objects.equal(Long.valueOf(d), Long.valueOf(((PhoneEntry) (obj)).getCreationTime())) || !Objects.equal(e, ((PhoneEntry) (obj)).getNumber()) || !Objects.equal(Integer.valueOf(f), Integer.valueOf(((PhoneEntry) (obj)).getType())))
            {
                return false;
            }
        }
        return true;
    }

    public long getCreationTime()
    {
        return d;
    }

    public String getGraphApiWriteId()
    {
        return a;
    }

    public boolean getIsVerified()
    {
        return b;
    }

    public String getNumber()
    {
        return e;
    }

    public String getSource()
    {
        return c;
    }

    public int getType()
    {
        return f;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, Boolean.valueOf(b), c, Long.valueOf(d), e, Integer.valueOf(f)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(c);
        parcel.writeLong(d);
        parcel.writeString(e);
        parcel.writeInt(f);
    }

}

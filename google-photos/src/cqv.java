// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

public final class cqv
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cqw();
    public final List a;

    cqv(Parcel parcel)
    {
        a = Collections.unmodifiableList(parcel.readArrayList(getClass().getClassLoader()));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof cqv))
        {
            return false;
        } else
        {
            return ((cqv)obj).a.equals(a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return String.format("ReorderingConstraint( %s )", new Object[] {
            a
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(a);
    }

}

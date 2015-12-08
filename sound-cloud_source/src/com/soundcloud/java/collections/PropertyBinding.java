// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.soundcloud.java.collections:
//            Property

public final class PropertyBinding
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    final Property property;
    final Object value;

    PropertyBinding(Property property1, Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Attempting to bind a null reference to ")).append(property1).toString());
        } else
        {
            property = property1;
            value = obj;
            return;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PropertyBinding)obj;
            if (!property.equals(((PropertyBinding) (obj)).property))
            {
                return false;
            }
            if (value != null && !value.equals(((PropertyBinding) (obj)).value))
            {
                return false;
            }
            if (((PropertyBinding) (obj)).value != value)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = property.hashCode();
        int i;
        if (value == null)
        {
            i = 0;
        } else
        {
            i = value.hashCode();
        }
        return i + j * 31;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(property.toString()).append(" => [").append(value).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(property, 0);
        parcel.writeValue(value);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PropertyBinding createFromParcel(Parcel parcel)
        {
            return new PropertyBinding((Property)parcel.readParcelable(getClass().getClassLoader()), parcel.readValue(getClass().getClassLoader()));
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PropertyBinding[] newArray(int i)
        {
            return new PropertyBinding[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}

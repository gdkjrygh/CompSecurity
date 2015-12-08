// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.pinterest.model.commerce:
//            Address, UserCard

public class DetailedShipping
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final Address address;
    private final long createdAt;
    private final String email;
    private final String firstName;
    private final String id;
    private final boolean isActive;
    private final String lastName;
    private final String phone;
    private final String type;
    private final long updatedAt;
    private final String userId;

    public DetailedShipping()
    {
        firstName = null;
        lastName = null;
        userId = null;
        createdAt = 0L;
        isActive = false;
        updatedAt = 0L;
        email = null;
        phone = null;
        address = null;
        type = null;
        id = null;
    }

    protected DetailedShipping(Parcel parcel)
    {
        boolean flag = true;
        super();
        firstName = parcel.readString();
        lastName = parcel.readString();
        userId = parcel.readString();
        createdAt = parcel.readLong();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        isActive = flag;
        updatedAt = parcel.readLong();
        email = parcel.readString();
        phone = parcel.readString();
        address = (Address)parcel.readParcelable(com/pinterest/model/commerce/Address.getClassLoader());
        type = parcel.readString();
        id = parcel.readString();
    }

    public DetailedShipping(UserCard usercard)
    {
        firstName = usercard.getFirstName();
        lastName = usercard.getLastName();
        phone = usercard.getPhone();
        address = usercard.getAddress();
        email = usercard.getEmail();
        userId = null;
        createdAt = 0L;
        isActive = false;
        updatedAt = 0L;
        type = null;
        id = null;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (DetailedShipping)obj;
        if (createdAt != ((DetailedShipping) (obj)).createdAt)
        {
            return false;
        }
        if (isActive != ((DetailedShipping) (obj)).isActive)
        {
            return false;
        }
        if (updatedAt != ((DetailedShipping) (obj)).updatedAt)
        {
            return false;
        }
        if (firstName == null ? ((DetailedShipping) (obj)).firstName != null : !firstName.equals(((DetailedShipping) (obj)).firstName))
        {
            return false;
        }
        if (lastName == null ? ((DetailedShipping) (obj)).lastName != null : !lastName.equals(((DetailedShipping) (obj)).lastName))
        {
            return false;
        }
        if (userId == null ? ((DetailedShipping) (obj)).userId != null : !userId.equals(((DetailedShipping) (obj)).userId))
        {
            return false;
        }
        if (email == null ? ((DetailedShipping) (obj)).email != null : !email.equals(((DetailedShipping) (obj)).email))
        {
            return false;
        }
        if (phone == null ? ((DetailedShipping) (obj)).phone != null : !phone.equals(((DetailedShipping) (obj)).phone))
        {
            return false;
        }
        if (address == null ? ((DetailedShipping) (obj)).address != null : !address.equals(((DetailedShipping) (obj)).address))
        {
            return false;
        }
        if (type == null ? ((DetailedShipping) (obj)).type != null : !type.equals(((DetailedShipping) (obj)).type))
        {
            return false;
        }
        if (id == null) goto _L4; else goto _L3
_L3:
        if (id.equals(((DetailedShipping) (obj)).id)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((DetailedShipping) (obj)).id == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public Address getAddress()
    {
        return address;
    }

    public long getCreatedAt()
    {
        return createdAt;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getId()
    {
        return id;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getType()
    {
        return type;
    }

    public long getUpdatedAt()
    {
        return updatedAt;
    }

    public String getUserId()
    {
        return userId;
    }

    public int hashCode()
    {
        int i2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int j2;
        int k2;
        if (firstName != null)
        {
            i = firstName.hashCode();
        } else
        {
            i = 0;
        }
        if (lastName != null)
        {
            j = lastName.hashCode();
        } else
        {
            j = 0;
        }
        if (userId != null)
        {
            k = userId.hashCode();
        } else
        {
            k = 0;
        }
        j2 = (int)(createdAt ^ createdAt >>> 32);
        if (isActive)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k2 = (int)(updatedAt ^ updatedAt >>> 32);
        if (email != null)
        {
            i1 = email.hashCode();
        } else
        {
            i1 = 0;
        }
        if (phone != null)
        {
            j1 = phone.hashCode();
        } else
        {
            j1 = 0;
        }
        if (address != null)
        {
            k1 = address.hashCode();
        } else
        {
            k1 = 0;
        }
        if (type != null)
        {
            l1 = type.hashCode();
        } else
        {
            l1 = 0;
        }
        if (id != null)
        {
            i2 = id.hashCode();
        }
        return (l1 + (k1 + (j1 + (i1 + ((l + ((k + (j + i * 31) * 31) * 31 + j2) * 31) * 31 + k2) * 31) * 31) * 31) * 31) * 31 + i2;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(userId);
        parcel.writeLong(createdAt);
        int j;
        if (isActive)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeLong(updatedAt);
        parcel.writeString(email);
        parcel.writeString(phone);
        parcel.writeParcelable(address, i);
        parcel.writeString(type);
        parcel.writeString(id);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final DetailedShipping createFromParcel(Parcel parcel)
        {
            return new DetailedShipping(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final DetailedShipping[] newArray(int i)
        {
            return new DetailedShipping[i];
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

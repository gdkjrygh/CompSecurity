// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.model.commerce:
//            Address

public class UserCard
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final Address address;
    private final int brand;
    private final String brandName;
    private final String email;
    private final Map enrolledIncentiveProgramsMap;
    private final int expMonth;
    private final int expYear;
    private final String firstName;
    private final String id;
    private final String last4;
    private final String lastName;
    private final String phone;
    private final String type;
    private final String userId;

    public UserCard()
    {
        firstName = null;
        lastName = null;
        userId = null;
        phone = null;
        brand = 0;
        brandName = null;
        email = null;
        last4 = null;
        expMonth = 0;
        address = null;
        expYear = 0;
        type = null;
        id = null;
        enrolledIncentiveProgramsMap = null;
    }

    protected UserCard(Parcel parcel)
    {
        firstName = parcel.readString();
        lastName = parcel.readString();
        userId = parcel.readString();
        phone = parcel.readString();
        brand = parcel.readInt();
        brandName = parcel.readString();
        email = parcel.readString();
        last4 = parcel.readString();
        expMonth = parcel.readInt();
        address = (Address)parcel.readParcelable(com/pinterest/model/commerce/Address.getClassLoader());
        expYear = parcel.readInt();
        type = parcel.readString();
        id = parcel.readString();
        int j = parcel.readInt();
        if (j > 0)
        {
            enrolledIncentiveProgramsMap = new HashMap(j);
            int i = 0;
            while (i < j) 
            {
                String s = parcel.readString();
                boolean flag;
                if (parcel.readInt() == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                enrolledIncentiveProgramsMap.put(s, Boolean.valueOf(flag));
                i++;
            }
        } else
        {
            enrolledIncentiveProgramsMap = null;
        }
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
        obj = (UserCard)obj;
        if (brand != ((UserCard) (obj)).brand)
        {
            return false;
        }
        if (expMonth != ((UserCard) (obj)).expMonth)
        {
            return false;
        }
        if (expYear != ((UserCard) (obj)).expYear)
        {
            return false;
        }
        if (firstName == null ? ((UserCard) (obj)).firstName != null : !firstName.equals(((UserCard) (obj)).firstName))
        {
            return false;
        }
        if (lastName == null ? ((UserCard) (obj)).lastName != null : !lastName.equals(((UserCard) (obj)).lastName))
        {
            return false;
        }
        if (userId == null ? ((UserCard) (obj)).userId != null : !userId.equals(((UserCard) (obj)).userId))
        {
            return false;
        }
        if (phone == null ? ((UserCard) (obj)).phone != null : !phone.equals(((UserCard) (obj)).phone))
        {
            return false;
        }
        if (brandName == null ? ((UserCard) (obj)).brandName != null : !brandName.equals(((UserCard) (obj)).brandName))
        {
            return false;
        }
        if (email == null ? ((UserCard) (obj)).email != null : !email.equals(((UserCard) (obj)).email))
        {
            return false;
        }
        if (last4 == null ? ((UserCard) (obj)).last4 != null : !last4.equals(((UserCard) (obj)).last4))
        {
            return false;
        }
        if (address == null ? ((UserCard) (obj)).address != null : !address.equals(((UserCard) (obj)).address))
        {
            return false;
        }
        if (type == null ? ((UserCard) (obj)).type != null : !type.equals(((UserCard) (obj)).type))
        {
            return false;
        }
        if (id == null) goto _L4; else goto _L3
_L3:
        if (id.equals(((UserCard) (obj)).id)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((UserCard) (obj)).id == null)
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

    public int getBrand()
    {
        return brand;
    }

    public String getBrandName()
    {
        return brandName;
    }

    public String getEmail()
    {
        return email;
    }

    public Map getEnrolledIncentiveProgramsMap()
    {
        return enrolledIncentiveProgramsMap;
    }

    public int getExpMonth()
    {
        return expMonth;
    }

    public int getExpYear()
    {
        return expYear;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getId()
    {
        return id;
    }

    public String getLast4()
    {
        return last4;
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

    public String getUserId()
    {
        return userId;
    }

    public int hashCode()
    {
        int j2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int k2;
        int l2;
        int i3;
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
        if (phone != null)
        {
            l = phone.hashCode();
        } else
        {
            l = 0;
        }
        k2 = brand;
        if (brandName != null)
        {
            i1 = brandName.hashCode();
        } else
        {
            i1 = 0;
        }
        if (email != null)
        {
            j1 = email.hashCode();
        } else
        {
            j1 = 0;
        }
        if (last4 != null)
        {
            k1 = last4.hashCode();
        } else
        {
            k1 = 0;
        }
        l2 = expMonth;
        if (address != null)
        {
            l1 = address.hashCode();
        } else
        {
            l1 = 0;
        }
        i3 = expYear;
        if (type != null)
        {
            i2 = type.hashCode();
        } else
        {
            i2 = 0;
        }
        if (id != null)
        {
            j2 = id.hashCode();
        }
        return (i2 + ((l1 + ((k1 + (j1 + (i1 + ((l + (k + (j + i * 31) * 31) * 31) * 31 + k2) * 31) * 31) * 31) * 31 + l2) * 31) * 31 + i3) * 31) * 31 + j2;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(userId);
        parcel.writeString(phone);
        parcel.writeInt(brand);
        parcel.writeString(brandName);
        parcel.writeString(email);
        parcel.writeString(last4);
        parcel.writeInt(expMonth);
        parcel.writeParcelable(address, i);
        parcel.writeInt(expYear);
        parcel.writeString(type);
        parcel.writeString(id);
        if (enrolledIncentiveProgramsMap == null)
        {
            parcel.writeInt(0);
        } else
        {
            parcel.writeInt(enrolledIncentiveProgramsMap.size());
            Iterator iterator = enrolledIncentiveProgramsMap.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                parcel.writeString((String)entry.getKey());
                if (((Boolean)entry.getValue()).booleanValue())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel.writeInt(i);
            }
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final UserCard createFromParcel(Parcel parcel)
        {
            return new UserCard(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UserCard[] newArray(int i)
        {
            return new UserCard[i];
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

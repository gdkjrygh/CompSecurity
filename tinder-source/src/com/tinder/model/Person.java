// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tinder.enums.Gender;
import com.tinder.enums.UserPhotoSize;
import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.model:
//            ProfilePhoto, Badge, Career, ProcessedPhoto

public class Person
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Person createFromParcel(Parcel parcel)
        {
            return new Person(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Person[] newArray(int i)
        {
            return new Person[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public List badges;
    public Date birthDate;
    private Career career;
    public Gender gender;
    public boolean isVerified;
    public final String name;
    public List profilePhotos;
    public final String userId;
    public String username;

    protected Person(Parcel parcel)
    {
        Object obj = null;
        super();
        gender = Gender.MALE;
        userId = parcel.readString();
        name = parcel.readString();
        int i = parcel.readInt();
        Gender gender1;
        long l;
        boolean flag;
        if (i == -1)
        {
            gender1 = null;
        } else
        {
            gender1 = Gender.values()[i];
        }
        gender = gender1;
        profilePhotos = parcel.createTypedArrayList(ProfilePhoto.CREATOR);
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isVerified = flag;
        badges = parcel.createTypedArrayList(Badge.CREATOR);
        username = parcel.readString();
        career = (Career)parcel.readParcelable(com/tinder/model/Career.getClassLoader());
        l = parcel.readLong();
        if (l == -1L)
        {
            parcel = obj;
        } else
        {
            parcel = new Date(l);
        }
        birthDate = parcel;
    }

    public Person(String s, String s1, Gender gender1, boolean flag, List list, String s2, Career career1, 
            Date date)
    {
        gender = Gender.MALE;
        userId = s;
        name = s1;
        profilePhotos = new ArrayList(0);
        gender = gender1;
        isVerified = flag;
        badges = list;
        username = s2;
        career = career1;
        birthDate = date;
    }

    public Person(String s, String s1, List list, Gender gender1, boolean flag, List list1, String s2, 
            Career career1, Date date)
    {
        gender = Gender.MALE;
        userId = s;
        name = s1;
        profilePhotos = list;
        gender = gender1;
        isVerified = flag;
        badges = list1;
        username = s2;
        career = career1;
        birthDate = date;
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
            obj = (Person)obj;
            if (userId == null ? ((Person) (obj)).userId != null : !userId.equals(((Person) (obj)).userId))
            {
                return false;
            }
        }
        return true;
    }

    public String getAge()
    {
        StringBuilder stringbuilder = new StringBuilder("birthdate null ? ");
        boolean flag;
        if (birthDate == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder.append(flag);
        if (birthDate != null)
        {
            return Integer.toString(DateUtils.a(birthDate));
        } else
        {
            return null;
        }
    }

    public String getAvatarUrl(int i, UserPhotoSize userphotosize)
    {
        if (profilePhotos.size() > i)
        {
            ProfilePhoto profilephoto = (ProfilePhoto)profilePhotos.get(i);
            if (profilephoto != null)
            {
                userphotosize = profilephoto.getProcessedPhoto(userphotosize);
                if (userphotosize != null)
                {
                    return ((ProcessedPhoto) (userphotosize)).imageUrl;
                } else
                {
                    v.a("Couldn't find processed photo at that size");
                    return "";
                }
            }
            v.a("Couldn't find photo at that position");
        } else
        {
            v.a("Not enough photos");
        }
        return "";
    }

    public List getAvatarUrlsForSize(UserPhotoSize userphotosize)
    {
        ArrayList arraylist = new ArrayList(profilePhotos.size());
        Iterator iterator = profilePhotos.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ProcessedPhoto processedphoto = ((ProfilePhoto)iterator.next()).getProcessedPhoto(userphotosize);
            if (processedphoto != null)
            {
                arraylist.add(processedphoto.imageUrl);
            }
        } while (true);
        return arraylist;
    }

    public Career getCareer()
    {
        if (career == null)
        {
            return new Career();
        } else
        {
            return career;
        }
    }

    public int hashCode()
    {
        if (userId != null)
        {
            return userId.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return (new StringBuilder("(id: ")).append(userId).append(" name: ").append(name).append(')').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(userId);
        parcel.writeString(name);
        byte byte0;
        int j;
        long l;
        if (gender == null)
        {
            j = -1;
        } else
        {
            j = gender.ordinal();
        }
        parcel.writeInt(j);
        parcel.writeTypedList(profilePhotos);
        if (isVerified)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeTypedList(badges);
        parcel.writeString(username);
        parcel.writeParcelable(career, i);
        if (birthDate != null)
        {
            l = birthDate.getTime();
        } else
        {
            l = -1L;
        }
        parcel.writeLong(l);
    }

}

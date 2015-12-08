// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ekk
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ekl();
    public static final ekk a = (new ekm()).a();
    private final Set b;
    private final Set c;

    ekk(Parcel parcel)
    {
        b = Collections.unmodifiableSet(new HashSet(ekj.a(parcel.createStringArray())));
        c = Collections.unmodifiableSet(new HashSet(ekj.a(parcel.createStringArray())));
    }

    ekk(Set set, Set set1)
    {
        b = Collections.unmodifiableSet(set);
        c = Collections.unmodifiableSet(set1);
    }

    static Set a(ekk ekk1)
    {
        return ekk1.b;
    }

    static Set b(ekk ekk1)
    {
        return ekk1.c;
    }

    public final Collection a()
    {
        HashSet hashset = new HashSet();
        hashset.addAll(b);
        hashset.addAll(c);
        return hashset;
    }

    public final boolean a(Class class1)
    {
        if (!b.contains(class1) && !c.contains(class1))
        {
            class1 = String.valueOf(class1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(class1).length() + 43)).append("Feature request does not contain feature : ").append(class1).toString());
        } else
        {
            return b.contains(class1);
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
            obj = (ekk)obj;
            if (!c.equals(((ekk) (obj)).c))
            {
                return false;
            }
            if (!b.equals(((ekk) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.hashCode() * 31 + c.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("FeaturesRequest{required=");
        String s1 = String.valueOf(Arrays.toString(b.toArray(new Class[b.size()])));
        String s2 = String.valueOf(c);
        String s3 = String.valueOf(Arrays.toString(c.toArray(new Class[c.size()])));
        return (new StringBuilder(String.valueOf(s).length() + 12 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(", optional=").append(s2).append(s3).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringArray(ekj.a(b));
        parcel.writeStringArray(ekj.a(c));
    }

}

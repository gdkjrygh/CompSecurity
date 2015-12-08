// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.java.optional.Optional;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.soundcloud.java.collections:
//            PropertyBinding

public final class Property
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final AtomicInteger propertyIds = new AtomicInteger();
    final int id;
    private final Class owner;
    final Class type;

    Property(Class class1, Class class2)
    {
        this(class1, class2, propertyIds.getAndIncrement());
    }

    Property(Class class1, Class class2, int i)
    {
        owner = class1;
        type = class2;
        id = i;
    }

    public static Property of(Class class1, Class class2)
    {
        return new Property(class1, class2);
    }

    public static Property ofList(Class class1, Class class2)
    {
        return new Property(class1, java/util/List);
    }

    public static Property ofMap(Class class1, Class class2, Class class3)
    {
        return new Property(class1, java/util/Map);
    }

    public static Property ofOptional(Class class1, Class class2)
    {
        return of(class1, com/soundcloud/java/optional/Optional);
    }

    public static Property ofOptionalList(Class class1, Class class2)
    {
        return of(class1, com/soundcloud/java/optional/Optional);
    }

    public static Property ofOptionalSet(Class class1, Class class2)
    {
        return of(class1, com/soundcloud/java/optional/Optional);
    }

    public static Property ofSet(Class class1, Class class2)
    {
        return new Property(class1, java/util/Set);
    }

    public final PropertyBinding bind(Object obj)
    {
        return new PropertyBinding(this, obj);
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
            obj = (Property)obj;
            if (id != ((Property) (obj)).id)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return id;
    }

    public final String toString()
    {
        int i;
        Field afield[];
        String s;
        Field field;
        int j;
        try
        {
            afield = owner.getDeclaredFields();
            j = afield.length;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            return super.toString();
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        field = afield[i];
        if (field.get(this) == this)
        {
            return (new StringBuilder()).append(owner.getSimpleName()).append("#").append(field.getName()).append("[").append(type.getSimpleName()).append("]").toString();
        }
        break MISSING_BLOCK_LABEL_99;
        s = super.toString();
        return s;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(owner.getName());
        parcel.writeString(type.getName());
        parcel.writeInt(id);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Property createFromParcel(Parcel parcel)
        {
            Class class1;
            Class class2;
            try
            {
                class1 = Class.forName(parcel.readString());
                class2 = Class.forName(parcel.readString());
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new IllegalStateException((new StringBuilder("Unable to restore parceled property type\n")).append(parcel).toString());
            }
            return new Property(class1, class2, parcel.readInt());
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Property[] newArray(int i)
        {
            return new Property[i];
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

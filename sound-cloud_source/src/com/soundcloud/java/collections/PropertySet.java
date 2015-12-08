// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            PropertyBinding, Property

public final class PropertySet
    implements Parcelable, Iterable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final SparseArray table;

    PropertySet()
    {
        table = new SparseArray();
    }

    PropertySet(int i)
    {
        table = new SparseArray(i);
    }

    private PropertySet(SparseArray sparsearray)
    {
        table = sparsearray;
    }

    PropertySet(SparseArray sparsearray, _cls1 _pcls1)
    {
        this(sparsearray);
    }

    private void addBinding(PropertyBinding propertybinding)
    {
        table.put(propertybinding.property.id, propertybinding);
    }

    public static PropertySet create()
    {
        return new PropertySet();
    }

    public static PropertySet create(int i)
    {
        return new PropertySet(i);
    }

    public static transient PropertySet from(PropertyBinding apropertybinding[])
    {
        PropertySet propertyset = new PropertySet(apropertybinding.length);
        int j = apropertybinding.length;
        for (int i = 0; i < j; i++)
        {
            propertyset.addBinding(apropertybinding[i]);
        }

        return propertyset;
    }

    public final boolean contains(Property property)
    {
        return table.indexOfKey(property.id) >= 0;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (getClass() != obj.getClass()) goto _L4; else goto _L5
_L5:
        obj = (PropertySet)obj;
        flag = flag1;
        if (table.size() != ((PropertySet) (obj)).table.size()) goto _L4; else goto _L6
_L6:
        int i = 0;
_L9:
        PropertyBinding propertybinding;
        if (i >= table.size())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        propertybinding = (PropertyBinding)table.get(table.keyAt(i));
        flag = flag1;
        if (!((PropertySet) (obj)).contains(propertybinding.property)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!propertybinding.value.equals(((PropertySet) (obj)).get(propertybinding.property))) goto _L4; else goto _L8
_L8:
        i++;
          goto _L9
        return true;
    }

    public final Object get(Property property)
    {
        Object obj = getOrElseNull(property);
        if (obj == null)
        {
            throw new AssertionError((new StringBuilder("Attempt to read a property that doesn't exist: ")).append(property).append("; set = ").append(this).toString());
        } else
        {
            return obj;
        }
    }

    public final Object getOrElse(Property property, Property property1)
    {
        PropertyBinding propertybinding = (PropertyBinding)table.get(property.id);
        if (propertybinding == null)
        {
            return get(property1);
        } else
        {
            return property.type.cast(propertybinding.value);
        }
    }

    public final Object getOrElse(Property property, Object obj)
    {
        PropertyBinding propertybinding = (PropertyBinding)table.get(property.id);
        if (propertybinding == null)
        {
            return obj;
        } else
        {
            return property.type.cast(propertybinding.value);
        }
    }

    public final Object getOrElseNull(Property property)
    {
        return getOrElse(property, null);
    }

    public final int hashCode()
    {
        PropertyBinding apropertybinding[] = new PropertyBinding[table.size()];
        for (int i = 0; i < table.size(); i++)
        {
            apropertybinding[i] = (PropertyBinding)table.get(table.keyAt(i));
        }

        return Arrays.hashCode(apropertybinding);
    }

    public final boolean isEmpty()
    {
        return table.size() == 0;
    }

    public final Iterator iterator()
    {
        return new _cls2();
    }

    public final PropertySet merge(PropertySet propertyset)
    {
        PropertySet propertyset1 = create(size() + propertyset.size());
        for (Iterator iterator1 = iterator(); iterator1.hasNext(); propertyset1.addBinding((PropertyBinding)iterator1.next())) { }
        for (propertyset = propertyset.iterator(); propertyset.hasNext(); propertyset1.addBinding((PropertyBinding)propertyset.next())) { }
        return propertyset1;
    }

    public final PropertySet put(Property property, Object obj)
    {
        addBinding(property.bind(obj));
        return this;
    }

    public final int size()
    {
        return table.size();
    }

    public final transient PropertySet slice(Property aproperty[])
    {
        PropertySet propertyset = create(aproperty.length);
        int j = aproperty.length;
        for (int i = 0; i < j; i++)
        {
            Property property = aproperty[i];
            propertyset.addBinding(property.bind(get(property)));
        }

        return propertyset;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("PropertySet{\n");
        for (int i = 0; i < table.size(); i++)
        {
            stringbuilder.append('\t');
            stringbuilder.append(((PropertyBinding)table.get(table.keyAt(i))).toString());
            stringbuilder.append('\n');
        }

        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public final void update(PropertySet propertyset)
    {
        for (propertyset = propertyset.iterator(); propertyset.hasNext(); addBinding((PropertyBinding)propertyset.next())) { }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSparseArray(table);
    }



    private class _cls2
        implements Iterator
    {

        private int currentIndex;
        final PropertySet this$0;

        public boolean hasNext()
        {
            return currentIndex < table.size();
        }

        public PropertyBinding next()
        {
            SparseArray sparsearray = table;
            int i = currentIndex;
            currentIndex = i + 1;
            return (PropertyBinding)sparsearray.valueAt(i);
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        _cls2()
        {
            this$0 = PropertySet.this;
            super();
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PropertySet createFromParcel(Parcel parcel)
        {
            return new PropertySet(parcel.readSparseArray(com/soundcloud/java/collections/PropertySet.getClassLoader()), null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PropertySet[] newArray(int i)
        {
            return new PropertySet[i];
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

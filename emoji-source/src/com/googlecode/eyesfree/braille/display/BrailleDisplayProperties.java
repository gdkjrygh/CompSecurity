// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.googlecode.eyesfree.braille.display:
//            BrailleKeyBinding

public class BrailleDisplayProperties
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public BrailleDisplayProperties createFromParcel(Parcel parcel)
        {
            return new BrailleDisplayProperties(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public BrailleDisplayProperties[] newArray(int i)
        {
            return new BrailleDisplayProperties[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final Map mFriendlyKeyNames;
    private final BrailleKeyBinding mKeyBindings[];
    private final int mNumStatusCells;
    private final int mNumTextCells;

    public BrailleDisplayProperties(int i, int j, BrailleKeyBinding abraillekeybinding[], Map map)
    {
        mNumTextCells = i;
        mNumStatusCells = j;
        mKeyBindings = abraillekeybinding;
        mFriendlyKeyNames = map;
    }

    private BrailleDisplayProperties(Parcel parcel)
    {
        mNumTextCells = parcel.readInt();
        mNumStatusCells = parcel.readInt();
        mKeyBindings = (BrailleKeyBinding[])parcel.createTypedArray(BrailleKeyBinding.CREATOR);
        int j = parcel.readInt();
        HashMap hashmap = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            hashmap.put(parcel.readString(), parcel.readString());
        }

        mFriendlyKeyNames = Collections.unmodifiableMap(hashmap);
    }


    public int describeContents()
    {
        return 0;
    }

    public Map getFriendlyKeyNames()
    {
        return mFriendlyKeyNames;
    }

    public BrailleKeyBinding[] getKeyBindings()
    {
        return mKeyBindings;
    }

    public int getNumStatusCells()
    {
        return mNumStatusCells;
    }

    public int getNumTextCells()
    {
        return mNumTextCells;
    }

    public String toString()
    {
        return String.format("BrailleDisplayProperties [numTextCells: %d, numStatusCells: %d, keyBindings: %d]", new Object[] {
            Integer.valueOf(mNumTextCells), Integer.valueOf(mNumStatusCells), Integer.valueOf(mKeyBindings.length)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mNumTextCells);
        parcel.writeInt(mNumStatusCells);
        parcel.writeTypedArray(mKeyBindings, i);
        parcel.writeInt(mFriendlyKeyNames.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = mFriendlyKeyNames.entrySet().iterator(); iterator.hasNext(); parcel.writeString((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            parcel.writeString((String)entry.getKey());
        }

    }

}

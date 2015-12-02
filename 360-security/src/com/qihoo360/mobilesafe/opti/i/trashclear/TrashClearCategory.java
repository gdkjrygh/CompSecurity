// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.trashclear;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.trashclear:
//            TrashInfo

public class TrashClearCategory
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public TrashClearCategory a(Parcel parcel)
        {
            return new TrashClearCategory(parcel);
        }

        public TrashClearCategory[] a(int i)
        {
            return new TrashClearCategory[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public long count;
    public String desc;
    public int iconResId;
    public boolean isClearMediaFile;
    public boolean isSelectedAll;
    public long selectedCount;
    public long selectedSize;
    public long size;
    public ArrayList trashInfoList;
    public int type;

    public TrashClearCategory(int i)
    {
        isClearMediaFile = true;
        trashInfoList = new ArrayList(8);
        type = i;
    }

    public TrashClearCategory(Parcel parcel)
    {
        isClearMediaFile = true;
        trashInfoList = new ArrayList(8);
        readFromParcel(parcel);
    }

    public TrashClearCategory clone()
    {
        TrashClearCategory trashclearcategory = new TrashClearCategory(type);
        trashclearcategory.iconResId = iconResId;
        trashclearcategory.desc = desc;
        trashclearcategory.type = type;
        trashclearcategory.count = count;
        trashclearcategory.size = size;
        trashclearcategory.selectedCount = selectedCount;
        trashclearcategory.selectedSize = selectedSize;
        trashclearcategory.isSelectedAll = isSelectedAll;
        trashclearcategory.isClearMediaFile = isClearMediaFile;
        ArrayList arraylist;
        if (trashInfoList == null)
        {
            arraylist = null;
        } else
        {
            arraylist = new ArrayList(trashInfoList);
        }
        trashclearcategory.trashInfoList = arraylist;
        return trashclearcategory;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public int describeContents()
    {
        return 0;
    }

    public void readFromParcel(Parcel parcel)
    {
        boolean flag1 = true;
        iconResId = parcel.readInt();
        desc = parcel.readString();
        type = parcel.readInt();
        count = parcel.readLong();
        size = parcel.readLong();
        selectedCount = parcel.readLong();
        selectedSize = parcel.readLong();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isSelectedAll = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isClearMediaFile = flag;
        try
        {
            trashInfoList = parcel.readArrayList(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeInt(iconResId);
        parcel.writeString(desc);
        parcel.writeInt(type);
        parcel.writeLong(count);
        parcel.writeLong(size);
        parcel.writeLong(selectedCount);
        parcel.writeLong(selectedSize);
        if (isSelectedAll)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isClearMediaFile)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeList(trashInfoList);
    }

}

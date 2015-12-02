// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.service;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TrashInfoSub
    implements Parcelable, Cloneable
{

    public static final int CLEAR_TYPE_KEEP = 1;
    public static final int CLEAR_TYPE_ONEKEY = 2;
    public static final int CLEAR_TYPE_OTHER = 0;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public TrashInfoSub a(Parcel parcel)
        {
            return new TrashInfoSub(parcel);
        }

        public TrashInfoSub[] a(int i)
        {
            return new TrashInfoSub[i];
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
    public int appType;
    public int appTypeFromDB;
    public int argInt1;
    public int argInt2;
    public String argStr1;
    public String argStr2;
    public String clearAdvice;
    public int clearType;
    public int dateNum;
    public String desc;
    public long fileLength;
    public long fileNum;
    public String filePath;
    public int floderType;
    public boolean hasMediaFile;
    public int id;
    public boolean isChecked;
    public boolean isInDate;
    public boolean isWhiteList;
    public List list;
    public long modifyTime;
    public List multiPathList;
    public List overlapList;
    public TrashInfoSub parentInfo;
    public List stringList;

    public TrashInfoSub()
    {
    }

    public TrashInfoSub(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    private void a(List list1)
    {
        if (list1 != null)
        {
            list1 = list1.iterator();
            while (list1.hasNext()) 
            {
                TrashInfoSub trashinfosub = (TrashInfoSub)list1.next();
                if (trashinfosub != null)
                {
                    trashinfosub.onChecked(isChecked);
                }
            }
        }
    }

    public TrashInfoSub clone()
    {
        TrashInfoSub trashinfosub1 = new TrashInfoSub();
        trashinfosub1.id = id;
        trashinfosub1.desc = desc;
        trashinfosub1.filePath = filePath;
        trashinfosub1.fileLength = fileLength;
        trashinfosub1.fileNum = fileNum;
        trashinfosub1.modifyTime = modifyTime;
        trashinfosub1.hasMediaFile = hasMediaFile;
        trashinfosub1.isChecked = isChecked;
        trashinfosub1.isWhiteList = isWhiteList;
        trashinfosub1.appType = appType;
        trashinfosub1.appTypeFromDB = appTypeFromDB;
        trashinfosub1.floderType = floderType;
        trashinfosub1.clearType = clearType;
        trashinfosub1.clearAdvice = clearAdvice;
        trashinfosub1.argStr1 = argStr1;
        trashinfosub1.argStr2 = argStr2;
        trashinfosub1.argInt1 = argInt1;
        trashinfosub1.argInt2 = argInt2;
        trashinfosub1.list = new ArrayList(list);
        trashinfosub1.stringList = stringList;
        TrashInfoSub trashinfosub;
        if (parentInfo == null)
        {
            trashinfosub = null;
        } else
        {
            trashinfosub = parentInfo.clone();
        }
        trashinfosub1.parentInfo = trashinfosub;
        trashinfosub1.overlapList = new ArrayList(overlapList);
        trashinfosub1.multiPathList = multiPathList;
        trashinfosub1.dateNum = dateNum;
        trashinfosub1.isInDate = isInDate;
        return trashinfosub1;
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

    public void initChecked()
    {
        boolean flag;
        if (clearType == 2 && !isWhiteList)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isChecked = flag;
    }

    public void onChecked(boolean flag)
    {
        isChecked = flag;
        a(list);
        a(overlapList);
    }

    public void readFromParcel(Parcel parcel)
    {
        boolean flag1 = true;
        id = parcel.readInt();
        desc = parcel.readString();
        filePath = parcel.readString();
        fileLength = parcel.readLong();
        fileNum = parcel.readLong();
        modifyTime = parcel.readLong();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hasMediaFile = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isChecked = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isWhiteList = flag;
        appType = parcel.readInt();
        appTypeFromDB = parcel.readInt();
        floderType = parcel.readInt();
        clearType = parcel.readInt();
        clearAdvice = parcel.readString();
        argStr1 = parcel.readString();
        argStr2 = parcel.readString();
        argInt1 = parcel.readInt();
        argInt2 = parcel.readInt();
        try
        {
            list = parcel.readArrayList(com/qihoo/security/opti/trashclear/service/TrashInfoSub.getClassLoader());
        }
        catch (Throwable throwable3) { }
        try
        {
            stringList = parcel.readArrayList(java/lang/String.getClassLoader());
        }
        catch (Throwable throwable2) { }
        parentInfo = (TrashInfoSub)parcel.readParcelable(com/qihoo/security/opti/trashclear/service/TrashInfoSub.getClassLoader());
        try
        {
            overlapList = parcel.readArrayList(com/qihoo/security/opti/trashclear/service/TrashInfoSub.getClassLoader());
        }
        catch (Throwable throwable1) { }
        try
        {
            multiPathList = parcel.readArrayList(java/lang/String.getClassLoader());
        }
        catch (Throwable throwable) { }
        dateNum = parcel.readInt();
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isInDate = flag;
    }

    public String toString()
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("TrashInfo [id=");
        stringbuilder.append(id);
        stringbuilder.append(", desc=");
        stringbuilder.append(desc);
        stringbuilder.append(", filePath=");
        stringbuilder.append(filePath);
        stringbuilder.append(", fileLength=");
        stringbuilder.append(fileLength);
        stringbuilder.append(", fileNum=");
        stringbuilder.append(fileNum);
        stringbuilder.append(", modifyTime=");
        stringbuilder.append(modifyTime);
        stringbuilder.append(", hasMediaFile=");
        stringbuilder.append(hasMediaFile);
        stringbuilder.append(", isChecked=");
        stringbuilder.append(isChecked);
        stringbuilder.append(", isWhiteList=");
        stringbuilder.append(isWhiteList);
        stringbuilder.append(", appType=");
        stringbuilder.append(appType);
        stringbuilder.append(", appTypeFromDB=");
        stringbuilder.append(appTypeFromDB);
        stringbuilder.append(", floderType=");
        stringbuilder.append(floderType);
        stringbuilder.append(", clearType=");
        stringbuilder.append(clearType);
        stringbuilder.append(", clearAdvice=");
        stringbuilder.append(clearAdvice);
        stringbuilder.append(", argStr1=");
        stringbuilder.append(argStr1);
        stringbuilder.append(", argStr2=");
        stringbuilder.append(argStr2);
        stringbuilder.append(", argInt1=");
        stringbuilder.append(argInt1);
        stringbuilder.append(", argInt2=");
        stringbuilder.append(argInt2);
        stringbuilder.append(", list=");
        int i;
        boolean flag1;
        if (list == null)
        {
            i = 0;
        } else
        {
            i = list.size();
        }
        stringbuilder.append(i);
        stringbuilder.append(", stringList=");
        stringbuilder.append(stringList);
        stringbuilder.append(", parentInfo=");
        if (parentInfo != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        stringbuilder.append(flag1);
        stringbuilder.append(", overlapList=");
        if (overlapList == null)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = overlapList.size();
        }
        stringbuilder.append(i);
        stringbuilder.append(", multiPathList=");
        stringbuilder.append(multiPathList);
        stringbuilder.append(", dayNum=");
        stringbuilder.append(dateNum);
        stringbuilder.append(", isInDay=");
        stringbuilder.append(isInDate);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeInt(id);
        parcel.writeString(desc);
        parcel.writeString(filePath);
        parcel.writeLong(fileLength);
        parcel.writeLong(fileNum);
        parcel.writeLong(modifyTime);
        int j;
        if (hasMediaFile)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        if (isChecked)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        if (isWhiteList)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeInt(appType);
        parcel.writeInt(appTypeFromDB);
        parcel.writeInt(floderType);
        parcel.writeInt(clearType);
        parcel.writeString(clearAdvice);
        parcel.writeString(argStr1);
        parcel.writeString(argStr2);
        parcel.writeInt(argInt1);
        parcel.writeInt(argInt2);
        parcel.writeList(list);
        parcel.writeList(stringList);
        parcel.writeParcelable(parentInfo, i);
        parcel.writeList(overlapList);
        parcel.writeList(multiPathList);
        parcel.writeInt(dateNum);
        if (isInDate)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}

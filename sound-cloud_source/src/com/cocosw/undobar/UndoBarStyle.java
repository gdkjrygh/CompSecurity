// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cocosw.undobar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Animation;

// Referenced classes of package com.cocosw.undobar:
//            d

public class UndoBarStyle
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    int a;
    int b;
    int c;
    public long d;
    public Animation e;
    public Animation f;

    public UndoBarStyle(int i, int j)
    {
        d = 5000L;
        a = i;
        b = j;
    }

    public UndoBarStyle(int i, int j, long l)
    {
        this(i, j);
        d = l;
    }

    public UndoBarStyle(Parcel parcel)
    {
        d = 5000L;
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readLong();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            obj = (UndoBarStyle)obj;
            if (c != ((UndoBarStyle) (obj)).c || d != ((UndoBarStyle) (obj)).d || a != ((UndoBarStyle) (obj)).a || b != ((UndoBarStyle) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        return (new StringBuilder("UndoBarStyle{iconRes=")).append(a).append(", titleRes=").append(b).append(", bgRes=").append(c).append(", duration=").append(d).append(", inAnimation=").append(e).append(", outAnimation=").append(f).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeLong(d);
    }

}

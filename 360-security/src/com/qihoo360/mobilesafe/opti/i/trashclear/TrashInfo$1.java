// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.trashclear;

import android.os.Parcel;

// Referenced classes of package com.qihoo360.mobilesafe.opti.i.trashclear:
//            TrashInfo

class 
    implements android.os.reator
{

    public TrashInfo a(Parcel parcel)
    {
        return new TrashInfo(parcel);
    }

    public TrashInfo[] a(int i)
    {
        return new TrashInfo[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}

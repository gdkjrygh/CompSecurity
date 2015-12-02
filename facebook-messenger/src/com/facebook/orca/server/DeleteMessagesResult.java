// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.ev;
import java.util.Map;

// Referenced classes of package com.facebook.orca.server:
//            f

public class DeleteMessagesResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    ev a;
    boolean b;

    DeleteMessagesResult(Parcel parcel)
    {
        a = (ev)parcel.readSerializable();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    public DeleteMessagesResult(Map map, boolean flag)
    {
        a = ev.a(map);
        b = flag;
    }

    public ev a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(a);
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}

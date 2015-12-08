// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

// Referenced classes of package com.google.android.gms.gcm:
//            f

public abstract class Task
    implements Parcelable
{

    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final int e = 2;
    private final boolean f = false;
    private final f g;
    private final Bundle h = null;

    Task(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        Log.e("Task", "Constructing a Task object using a parcel.");
        a = parcel.readString();
        b = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d = flag;
        g = f.a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(a);
        parcel.writeString(b);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (d)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }
}

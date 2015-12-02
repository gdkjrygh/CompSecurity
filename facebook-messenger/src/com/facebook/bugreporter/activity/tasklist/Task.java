// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.json.jsonmirror.JMStaticKeysDictDestination;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            a

public class Task
    implements Parcelable, JMStaticKeysDictDestination
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    private Task()
    {
        a = "-1";
        b = "-1";
        c = null;
        d = null;
    }

    private Task(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
    }

    Task(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public Task(String s, String s1, String s2, String s3)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}

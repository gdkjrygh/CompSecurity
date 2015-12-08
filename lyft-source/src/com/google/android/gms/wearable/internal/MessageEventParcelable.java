// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaw

public class MessageEventParcelable
    implements SafeParcelable, MessageEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaw();
    final int a;
    private final int b;
    private final String c;
    private final byte d[];
    private final String e;

    MessageEventParcelable(int i, int j, String s, byte abyte0[], String s1)
    {
        a = i;
        b = j;
        c = s;
        d = abyte0;
        e = s1;
    }

    public String a()
    {
        return c;
    }

    public int b()
    {
        return b;
    }

    public byte[] c()
    {
        return d;
    }

    public String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("MessageEventParcelable[").append(b).append(",").append(c).append(", size=");
        Object obj;
        if (d == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(d.length);
        }
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaw.a(this, parcel, i);
    }

}

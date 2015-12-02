// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.annotation.a;
import com.facebook.ipc.annotation.b;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.messages.ipc:
//            b, FrozenGroupMessageInfo

public class FrozenNewMessageNotification
    implements Parcelable, a, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.facebook.messages.ipc.b();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final PendingIntent g;
    private final String h;
    private final String i;
    private final long j;
    private final long k;
    private final FrozenGroupMessageInfo l;

    public FrozenNewMessageNotification(String s, String s1, String s2, String s3, String s4, String s5, PendingIntent pendingintent, 
            String s6, String s7, long l1, long l2, FrozenGroupMessageInfo frozengroupmessageinfo)
    {
        a = (String)Preconditions.checkNotNull(s);
        b = (String)Preconditions.checkNotNull(s1);
        c = s2;
        d = s3;
        e = (String)Preconditions.checkNotNull(s4);
        f = (String)Preconditions.checkNotNull(s5);
        g = (PendingIntent)Preconditions.checkNotNull(pendingintent);
        h = (String)Preconditions.checkNotNull(s6);
        i = (String)Preconditions.checkNotNull(s7);
        j = l1;
        k = l2;
        l = frozengroupmessageinfo;
    }

    public int a(FrozenNewMessageNotification frozennewmessagenotification)
    {
        if (equals(frozennewmessagenotification))
        {
            return 0;
        } else
        {
            return (int)(j - frozennewmessagenotification.j);
        }
    }

    public void a(Parcel parcel, int i1)
    {
        parcel.writeInt(1);
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        PendingIntent.writePendingIntentOrNullToParcel(g, parcel);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeLong(j);
        parcel.writeLong(k);
        parcel.writeParcelable(l, i1);
    }

    public int compareTo(Object obj)
    {
        return a((FrozenNewMessageNotification)obj);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof FrozenNewMessageNotification))
        {
            return false;
        } else
        {
            obj = (FrozenNewMessageNotification)obj;
            return Objects.equal(a, ((FrozenNewMessageNotification) (obj)).a);
        }
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a
        });
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.facebook.ipc.annotation.b.a(parcel, i1, this);
    }

}

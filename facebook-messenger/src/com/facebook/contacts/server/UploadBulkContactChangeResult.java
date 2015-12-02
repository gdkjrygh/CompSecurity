// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.server:
//            ae, ag, UploadBulkContactFieldMatch, af

public class UploadBulkContactChangeResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ae();
    private final ag a;
    private final String b;
    private final String c;
    private final es d;
    private final af e;

    private UploadBulkContactChangeResult(Parcel parcel)
    {
        a = (ag)Enum.valueOf(com/facebook/contacts/server/ag, parcel.readString());
        b = parcel.readString();
        c = parcel.readString();
        d = es.a(parcel.readArrayList(com/facebook/contacts/server/UploadBulkContactFieldMatch.getClassLoader()));
        e = (af)Enum.valueOf(com/facebook/contacts/server/af, parcel.readString());
    }

    UploadBulkContactChangeResult(Parcel parcel, ae ae1)
    {
        this(parcel);
    }

    public UploadBulkContactChangeResult(ag ag1, String s, String s1, es es1, af af1)
    {
        a = ag1;
        b = s;
        c = s1;
        d = es1;
        e = af1;
    }

    public ag a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public af d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("UploadBulkContactChangeResult (").append(a).append(") confidence: ").append(e).append(" local id: [").append(b).append("] -> remote id: [").append(c).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeList(d);
        parcel.writeString(e.toString());
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.libraries.handwriting.base:
//            h

public class ScoredCandidate
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    public final String a;
    public final float b;
    public final List c;

    public ScoredCandidate(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readFloat();
        c = new ArrayList();
        parcel.readStringList(c);
    }

    public ScoredCandidate(String s, float f)
    {
        this(s, f, ((List) (new ArrayList(0))));
    }

    public ScoredCandidate(String s, float f, List list)
    {
        a = s;
        b = f;
        c = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeFloat(b);
        parcel.writeStringList(c);
    }

}

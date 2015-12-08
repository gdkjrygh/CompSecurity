// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import android.os.Parcel;
import android.os.Parcelable;

public class ChallengeUserRank
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final int a = 1;
    private int b;
    private int c;
    private String d;

    public ChallengeUserRank()
    {
    }

    static int a(ChallengeUserRank challengeuserrank, int i)
    {
        challengeuserrank.b = i;
        return i;
    }

    static String a(ChallengeUserRank challengeuserrank, String s)
    {
        challengeuserrank.d = s;
        return s;
    }

    static int b(ChallengeUserRank challengeuserrank, int i)
    {
        challengeuserrank.c = i;
        return i;
    }

    public int a()
    {
        return b;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(String s)
    {
        d = s;
    }

    public int b()
    {
        return c;
    }

    public void b(int i)
    {
        c = i;
    }

    public String c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
    }


    /* member class not found */
    class _cls1 {}

}

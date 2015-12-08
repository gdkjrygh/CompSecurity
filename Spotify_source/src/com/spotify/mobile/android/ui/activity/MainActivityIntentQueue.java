// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import gen;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivityIntentQueue
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MainActivityIntentQueue(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new MainActivityIntentQueue[i];
        }

    };
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public List f;

    public MainActivityIntentQueue()
    {
        f = new CopyOnWriteArrayList();
    }

    private MainActivityIntentQueue(Parcel parcel)
    {
        f = new CopyOnWriteArrayList();
        a = gen.a(parcel);
        b = gen.a(parcel);
        c = gen.a(parcel);
        d = gen.a(parcel);
    }

    MainActivityIntentQueue(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final void a(Intent intent)
    {
        f.add(intent);
    }

    public final boolean a()
    {
        return !f.isEmpty();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, a);
        gen.a(parcel, b);
        gen.a(parcel, c);
        gen.a(parcel, d);
    }

}

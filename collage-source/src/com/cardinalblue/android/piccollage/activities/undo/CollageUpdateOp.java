// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.undo;

import android.os.Parcel;
import com.cardinalblue.android.piccollage.activities.undo.a.f;
import com.cardinalblue.android.piccollage.controller.d;
import com.squareup.a.b;

public class CollageUpdateOp extends com.cardinalblue.android.piccollage.UndoManager.UndoOperation
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public CollageUpdateOp a(Parcel parcel)
        {
            return new CollageUpdateOp(parcel);
        }

        public CollageUpdateOp[] a(int i)
        {
            return new CollageUpdateOp[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private final String a;
    private final String b;

    protected CollageUpdateOp(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    public CollageUpdateOp(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public void b()
    {
    }

    public void c()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new f(a));
    }

    public void d()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new f(b));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }

}

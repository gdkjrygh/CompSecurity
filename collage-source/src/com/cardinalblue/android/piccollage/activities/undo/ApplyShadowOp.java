// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.undo;

import android.os.Parcel;
import com.cardinalblue.android.piccollage.activities.undo.a.b;
import com.cardinalblue.android.piccollage.controller.d;

public class ApplyShadowOp extends com.cardinalblue.android.piccollage.UndoManager.UndoOperation
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ApplyShadowOp a(Parcel parcel)
        {
            return new ApplyShadowOp(parcel);
        }

        public ApplyShadowOp[] a(int i)
        {
            return new ApplyShadowOp[i];
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
    private final long a;
    private final boolean b;
    private final boolean c;

    public ApplyShadowOp(long l, boolean flag, boolean flag1)
    {
        a = l;
        b = flag;
        c = flag1;
    }

    protected ApplyShadowOp(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readLong();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    public void b()
    {
    }

    public void c()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new b(a, b));
    }

    public void d()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new b(a, c));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeLong(a);
        byte byte0;
        if (b)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (c)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;

public abstract class i
    implements Parcelable
{

    private volatile transient boolean NL;

    public i()
    {
        NL = false;
    }

    protected abstract void I(Parcel parcel, int j);

    public final boolean hT()
    {
        return NL;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        boolean flag;
        if (!hT())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.I(flag);
        NL = true;
        I(parcel, j);
    }
}

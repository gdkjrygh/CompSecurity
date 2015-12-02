// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.bundle.a;
import com.google.common.a.es;
import com.google.common.a.ev;

// Referenced classes of package com.facebook.nux.status:
//            i, NuxStep

public class NuxStatusResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final String a;
    private final boolean b;
    private final es c;
    private final ev d;

    private NuxStatusResult(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        b = flag;
        c = es.a(parcel.readArrayList(com/facebook/nux/status/NuxStep.getClassLoader()));
        d = ev.a(com.facebook.common.bundle.a.a(parcel.readBundle()));
    }

    NuxStatusResult(Parcel parcel, i j)
    {
        this(parcel);
    }

    public NuxStatusResult(String s, boolean flag, es es1, ev ev1)
    {
        a = s;
        b = flag;
        c = es1;
        d = ev1;
    }

    public int describeContents()
    {
        return 0;
    }

    public ev getExtraData()
    {
        return d;
    }

    public boolean getIsEligible()
    {
        return b;
    }

    public String getNuxId()
    {
        return a;
    }

    public es getNuxSteps()
    {
        return c;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(a);
        if (b)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeList(c);
        parcel.writeBundle(com.facebook.common.bundle.a.a(d));
    }

}

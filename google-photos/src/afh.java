// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class afh extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new afi();
    public Parcelable a;

    afh(Parcel parcel)
    {
        super(parcel);
        a = parcel.readParcelable(aex.getClassLoader());
    }

    public afh(Parcelable parcelable)
    {
        super(parcelable);
    }

    public static void a(afh afh1, afh afh2)
    {
        afh1.a = afh2.a;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(a, 0);
    }

}

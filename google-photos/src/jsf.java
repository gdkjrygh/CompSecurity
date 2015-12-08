// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.analytics.internal.Command;

public final class jsf
    implements android.os.Parcelable.Creator
{

    public jsf()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new Command(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new Command[i];
    }
}

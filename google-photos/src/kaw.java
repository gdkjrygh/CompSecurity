// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.BinderWrapper;

public final class kaw
    implements android.os.Parcelable.Creator
{

    public kaw()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new BinderWrapper(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new BinderWrapper[i];
    }
}

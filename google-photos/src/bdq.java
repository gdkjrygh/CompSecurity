// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.apps.consumerphotoeditor.core.Look;

public final class bdq
    implements android.os.Parcelable.Creator
{

    public bdq()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new Look(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new Look[i];
    }
}

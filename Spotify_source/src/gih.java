// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class gih
    implements gig
{

    gih()
    {
    }

    public final void a(Object obj, Parcel parcel)
    {
        ((Parcelable)obj).writeToParcel(parcel, 0);
    }
}

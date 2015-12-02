// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.compose:
//            MessageDraft

final class ba
    implements android.os.Parcelable.Creator
{

    ba()
    {
    }

    public MessageDraft a(Parcel parcel)
    {
        return new MessageDraft(parcel, null);
    }

    public MessageDraft[] a(int i)
    {
        return new MessageDraft[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}

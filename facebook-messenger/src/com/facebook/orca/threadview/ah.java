// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.threadview:
//            RowReceiptParticipant

final class ah
    implements android.os.Parcelable.Creator
{

    ah()
    {
    }

    public RowReceiptParticipant a(Parcel parcel)
    {
        return new RowReceiptParticipant(parcel);
    }

    public RowReceiptParticipant[] a(int i)
    {
        return new RowReceiptParticipant[i];
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

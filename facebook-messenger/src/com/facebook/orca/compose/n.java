// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.os.Parcel;

final class n
    implements android.os.Parcelable.Creator
{

    n()
    {
    }

    public ComposeAttachmentContainer.SavedAttachmentState a(Parcel parcel)
    {
        return new ComposeAttachmentContainer.SavedAttachmentState(parcel);
    }

    public ComposeAttachmentContainer.SavedAttachmentState[] a(int i)
    {
        return new ComposeAttachmentContainer.SavedAttachmentState[i];
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

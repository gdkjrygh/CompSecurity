// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.os.Parcel;

// Referenced classes of package com.pandora.android.inbox:
//            InboxNotification

static final class 
    implements android.os.Notification._cls1
{

    public InboxNotification a(Parcel parcel)
    {
        return new InboxNotification(parcel);
    }

    public InboxNotification[] a(int i)
    {
        return new InboxNotification[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}

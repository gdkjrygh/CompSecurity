// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;

import android.os.Parcel;

// Referenced classes of package com.snapchat.android.util.eventbus:
//            QuickSnapEvent

static final class _cls9
    implements android.os.r
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new QuickSnapEvent(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new QuickSnapEvent[i];
    }

    _cls9()
    {
    }
}

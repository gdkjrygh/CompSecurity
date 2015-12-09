// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;

// Referenced classes of package com.google.android.gtalkservice:
//            GroupChatInvitation

static final class 
    implements android.os.roupChatInvitation._cls1
{

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return new GroupChatInvitation(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GroupChatInvitation[i];
    }

    ()
    {
    }
}

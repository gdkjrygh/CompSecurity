// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.os.Parcel;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout

static final class 
    implements android.os.ListLayout.SavedState._cls1
{

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return new nit>(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new nit>[i];
    }

    ()
    {
    }
}

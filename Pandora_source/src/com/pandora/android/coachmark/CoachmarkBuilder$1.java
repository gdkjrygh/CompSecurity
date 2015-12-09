// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.os.Parcel;

// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkBuilder

static final class 
    implements android.os.CoachmarkBuilder._cls1
{

    public CoachmarkBuilder a(Parcel parcel)
    {
        return new CoachmarkBuilder(parcel);
    }

    public CoachmarkBuilder[] a(int i)
    {
        return new CoachmarkBuilder[i];
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

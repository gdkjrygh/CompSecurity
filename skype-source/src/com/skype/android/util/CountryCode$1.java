// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.os.Parcel;

// Referenced classes of package com.skype.android.util:
//            CountryCode

static final class 
    implements android.os.ator
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new CountryCode(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CountryCode[0];
    }

    ()
    {
    }
}

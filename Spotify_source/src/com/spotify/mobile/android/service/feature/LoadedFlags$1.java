// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import android.os.Parcel;
import java.lang.ref.WeakReference;

// Referenced classes of package com.spotify.mobile.android.service.feature:
//            LoadedFlags

public final class 
    implements android.os.ator
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new LoadedFlags(parcel.readHashMap(getClass().getClassLoader()), parcel.readHashMap(getClass().getClassLoader()), new WeakReference(null), (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LoadedFlags[i];
    }

    ()
    {
    }
}

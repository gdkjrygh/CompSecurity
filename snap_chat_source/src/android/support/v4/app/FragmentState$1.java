// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;

// Referenced classes of package android.support.v4.app:
//            FragmentState

static final class 
    implements android.os.or
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new FragmentState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FragmentState[i];
    }

    ()
    {
    }
}

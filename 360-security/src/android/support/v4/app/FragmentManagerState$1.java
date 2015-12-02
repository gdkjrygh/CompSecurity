// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;

// Referenced classes of package android.support.v4.app:
//            FragmentManagerState

static final class 
    implements android.os.agerState._cls1
{

    public FragmentManagerState a(Parcel parcel)
    {
        return new FragmentManagerState(parcel);
    }

    public FragmentManagerState[] a(int i)
    {
        return new FragmentManagerState[i];
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

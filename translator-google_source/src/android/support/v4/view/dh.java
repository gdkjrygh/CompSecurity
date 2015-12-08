// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.os.d;

final class dh
    implements d
{

    dh()
    {
    }

    public final Object a(Parcel parcel, ClassLoader classloader)
    {
        return new ViewPager.SavedState(parcel, classloader);
    }

    public final Object[] a(int i)
    {
        return new ViewPager.SavedState[i];
    }
}

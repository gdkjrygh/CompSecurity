// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.d.e;

final class dl
    implements e
{

    dl()
    {
    }

    public Object a(Parcel parcel, ClassLoader classloader)
    {
        return b(parcel, classloader);
    }

    public Object[] a(int i)
    {
        return b(i);
    }

    public ViewPager.SavedState b(Parcel parcel, ClassLoader classloader)
    {
        return new ViewPager.SavedState(parcel, classloader);
    }

    public ViewPager.SavedState[] b(int i)
    {
        return new ViewPager.SavedState[i];
    }
}

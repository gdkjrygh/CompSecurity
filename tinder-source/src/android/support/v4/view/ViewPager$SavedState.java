// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.e.b;
import android.support.v4.e.c;

// Referenced classes of package android.support.v4.view:
//            ViewPager

public static class c extends android.view.SavedState
{

    public static final android.os.r.SavedState.CREATOR CREATOR;
    int a;
    Parcelable b;
    ClassLoader c;

    public String toString()
    {
        return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(a).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.riteToParcel(parcel, i);
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
    }

    static 
    {
        Object obj = new b() {

            public final Object a(Parcel parcel, ClassLoader classloader)
            {
                return new ViewPager.SavedState(parcel, classloader);
            }

            public final volatile Object[] a(int i)
            {
                return new ViewPager.SavedState[i];
            }

        };
        if (android.os. >= 13)
        {
            obj = new c(((b) (obj)));
        } else
        {
            obj = new android.support.v4.e.te(((b) (obj)));
        }
        CREATOR = ((android.os.r.SavedState.CREATOR) (obj));
    }

    _cls1(Parcel parcel, ClassLoader classloader)
    {
        super(parcel);
        ClassLoader classloader1 = classloader;
        if (classloader == null)
        {
            classloader1 = getClass().getClassLoader();
        }
        a = parcel.readInt();
        b = parcel.readParcelable(classloader1);
        c = classloader1;
    }

    public c(Parcelable parcelable)
    {
        super(parcelable);
    }
}

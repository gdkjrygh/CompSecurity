// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.c;
import android.support.v4.os.e;

// Referenced classes of package android.support.v4.view:
//            dh

public class c extends android.view.SavedState
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
        Object obj = new dh();
        if (android.os. >= 13)
        {
            obj = new e(((android.support.v4.os.d) (obj)));
        } else
        {
            obj = new c(((android.support.v4.os.d) (obj)));
        }
        CREATOR = ((android.os.r.SavedState.CREATOR) (obj));
    }

    (Parcel parcel, ClassLoader classloader)
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

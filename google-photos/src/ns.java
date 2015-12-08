// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class ns extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR;
    public int a;
    public Parcelable b;
    public ClassLoader c;

    ns(Parcel parcel, ClassLoader classloader)
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

    public ns(Parcelable parcelable)
    {
        super(parcelable);
    }

    public final String toString()
    {
        return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(a).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
    }

    static 
    {
        Object obj = new nt();
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            obj = new iq(((ip) (obj)));
        } else
        {
            obj = new io(((ip) (obj)));
        }
        CREATOR = ((android.os.Parcelable.Creator) (obj));
    }
}

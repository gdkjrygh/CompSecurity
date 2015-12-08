// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;

public class lockModeRight extends android.view.t.SavedState
{

    public static final android.os.out.SavedState._cls1 CREATOR = new _cls1();
    int lockModeLeft;
    int lockModeRight;
    int openDrawerGravity;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.eToParcel(parcel, i);
        parcel.writeInt(openDrawerGravity);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        openDrawerGravity = 0;
        lockModeLeft = 0;
        lockModeRight = 0;
        openDrawerGravity = parcel.readInt();
    }

    public openDrawerGravity(Parcelable parcelable)
    {
        super(parcelable);
        openDrawerGravity = 0;
        lockModeLeft = 0;
        lockModeRight = 0;
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final DrawerLayout.SavedState createFromParcel(Parcel parcel)
        {
            return new DrawerLayout.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final DrawerLayout.SavedState[] newArray(int i)
        {
            return new DrawerLayout.SavedState[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}

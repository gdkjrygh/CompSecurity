// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompatApi21

public final class mInner
    implements Parcelable
{

    public static final android.os.iaSessionCompat.Token._cls1 CREATOR = new _cls1();
    private final Object mInner;

    public static mInner fromToken(Object obj)
    {
        if (obj == null || android.os.iaSessionCompat.Token < 21)
        {
            return null;
        } else
        {
            return new <init>(MediaSessionCompatApi21.verifyToken(obj));
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Object getToken()
    {
        return mInner;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (android.os.iaSessionCompat.Token >= 21)
        {
            parcel.writeParcelable((Parcelable)mInner, i);
            return;
        } else
        {
            parcel.writeStrongBinder((IBinder)mInner);
            return;
        }
    }


    _cls1(Object obj)
    {
        mInner = obj;
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final MediaSessionCompat.Token createFromParcel(Parcel parcel)
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                parcel = parcel.readParcelable(null);
            } else
            {
                parcel = parcel.readStrongBinder();
            }
            return new MediaSessionCompat.Token(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final MediaSessionCompat.Token[] newArray(int i)
        {
            return new MediaSessionCompat.Token[i];
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

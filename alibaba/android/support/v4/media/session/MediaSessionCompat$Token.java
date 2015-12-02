// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat

public static final class a
    implements Parcelable
{

    public static final android.os.iaSessionCompat.Token.a CREATOR = new android.os.Parcelable.Creator() {

        public MediaSessionCompat.Token a(Parcel parcel)
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

        public MediaSessionCompat.Token[] a(int i)
        {
            return new MediaSessionCompat.Token[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private final Object a;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (android.os.iaSessionCompat.Token >= 21)
        {
            parcel.writeParcelable((Parcelable)a, i);
            return;
        } else
        {
            parcel.writeStrongBinder((IBinder)a);
            return;
        }
    }


    _cls1(Object obj)
    {
        a = obj;
    }
}

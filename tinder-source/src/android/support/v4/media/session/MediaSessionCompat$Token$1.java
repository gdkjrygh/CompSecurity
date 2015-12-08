// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat

static final class A
    implements android.os.SessionCompat.Token._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        if (android.os.SessionCompat.Token._fld1 >= 21)
        {
            parcel = parcel.readParcelable(null);
        } else
        {
            parcel = parcel.readStrongBinder();
        }
        return new nit>(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new nit>[i];
    }

    A()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

final class I
    implements android.os.Compat.CustomAction._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new nit>(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new nit>[i];
    }

    I()
    {
    }
}

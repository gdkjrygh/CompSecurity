// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.os.Parcel;
import com.immersion.hapticmediasdk.models.HapticFileInformation;

public final class rrrcrr
    implements android.os.Parcelable.Creator
{

    public static int b044604460446044604460446 = 0;
    public static int b044604460446044604460446 = 1;
    public static int b044604460446044604460446 = 2;
    public static int b044604460446044604460446 = 84;

    public rrrcrr()
    {
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446() != b044604460446044604460446)
        {
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = b044604460446044604460446();
        }
        try
        {
            super();
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public static int b044604460446044604460446()
    {
        return 2;
    }

    public static int b044604460446044604460446()
    {
        return 0;
    }

    public static int b044604460446044604460446()
    {
        return 1;
    }

    public static int b044604460446044604460446()
    {
        return 54;
    }

    public final HapticFileInformation createFromParcel(Parcel parcel)
    {
        if (((b044604460446044604460446() + b044604460446044604460446()) * b044604460446044604460446()) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = b044604460446044604460446();
        }
        return new HapticFileInformation(parcel);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        try
        {
            parcel = createFromParcel(parcel);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446() != b044604460446044604460446())
        {
            b044604460446044604460446 = 46;
            b044604460446044604460446 = b044604460446044604460446();
        }
        return parcel;
    }

    public final HapticFileInformation[] newArray(int i)
    {
        HapticFileInformation ahapticfileinformation[] = new HapticFileInformation[i];
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = 32;
            b044604460446044604460446 = 80;
        }
        return ahapticfileinformation;
    }

    public final Object[] newArray(int i)
    {
        int j = b044604460446044604460446;
        switch ((j * (b044604460446044604460446 + j)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 47;
            // fall through

        case 0: // '\0'
            return newArray(i);
        }
    }
}

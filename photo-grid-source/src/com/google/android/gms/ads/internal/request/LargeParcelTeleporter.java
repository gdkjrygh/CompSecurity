// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.pe;
import com.google.android.gms.internal.wk;
import java.io.DataInputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl, a

public final class LargeParcelTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    final int a;
    ParcelFileDescriptor b;
    private Parcelable c;
    private boolean d;

    LargeParcelTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor)
    {
        a = i;
        b = parcelfiledescriptor;
        c = null;
        d = true;
    }

    public LargeParcelTeleporter(SafeParcelable safeparcelable)
    {
        a = 1;
        b = null;
        c = safeparcelable;
        d = false;
    }

    private ParcelFileDescriptor a(byte abyte0[])
    {
        android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
        ParcelFileDescriptor aparcelfiledescriptor[];
        aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
        autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(aparcelfiledescriptor[1]);
        (new Thread(new a(this, autocloseoutputstream, abyte0))).start();
        abyte0 = aparcelfiledescriptor[0];
        return abyte0;
        abyte0;
        autocloseoutputstream = null;
_L2:
        zzb.zzb("Error transporting the ad response", abyte0);
        zzp.zzby().a(abyte0, true);
        wk.a(autocloseoutputstream);
        return null;
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        Parcel parcel1;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        parcel1 = Parcel.obtain();
        byte abyte0[];
        c.writeToParcel(parcel1, 0);
        abyte0 = parcel1.marshall();
        parcel1.recycle();
        b = a(abyte0);
        zzl.a(this, parcel, i);
        return;
        parcel;
        parcel1.recycle();
        throw parcel;
    }

    public final SafeParcelable zza(android.os.Parcelable.Creator creator)
    {
        Object obj;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (b == null)
        {
            zzb.e("File descriptor is empty, returning null.");
            return null;
        }
        obj = new DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(b));
        byte abyte0[];
        abyte0 = new byte[((DataInputStream) (obj)).readInt()];
        ((DataInputStream) (obj)).readFully(abyte0, 0, abyte0.length);
        wk.a(((java.io.Closeable) (obj)));
        obj = Parcel.obtain();
        ((Parcel) (obj)).unmarshall(abyte0, 0, abyte0.length);
        ((Parcel) (obj)).setDataPosition(0);
        c = (SafeParcelable)creator.createFromParcel(((Parcel) (obj)));
        ((Parcel) (obj)).recycle();
        d = false;
        return (SafeParcelable)c;
        creator;
        throw new IllegalStateException("Could not read from parcel file descriptor", creator);
        creator;
        wk.a(((java.io.Closeable) (obj)));
        throw creator;
        creator;
        ((Parcel) (obj)).recycle();
        throw creator;
    }

}

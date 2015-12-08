// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.iq;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            l

public final class LargeParcelTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
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
        ParcelFileDescriptor aparcelfiledescriptor[];
        try
        {
            aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
            (new Thread(new Runnable(new android.os.ParcelFileDescriptor.AutoCloseOutputStream(aparcelfiledescriptor[1]), abyte0) {

                final OutputStream a;
                final byte b[];
                final LargeParcelTeleporter c;

                public final void run()
                {
                    DataOutputStream dataoutputstream = new DataOutputStream(a);
                    dataoutputstream.writeInt(b.length);
                    dataoutputstream.write(b);
                    iq.a(dataoutputstream);
                    return;
                    Object obj;
                    obj;
                    com.google.android.gms.ads.internal.util.client.b.a("Error transporting the ad response", ((Throwable) (obj)));
                    p.h().a(((Throwable) (obj)), true);
                    iq.a(dataoutputstream);
                    return;
                    obj;
                    iq.a(dataoutputstream);
                    throw obj;
                }

            
            {
                c = LargeParcelTeleporter.this;
                a = outputstream;
                b = abyte0;
                super();
            }
            })).start();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            com.google.android.gms.ads.internal.util.client.b.a("Error transporting the ad response", abyte0);
            p.h().a(abyte0, true);
            return null;
        }
        abyte0 = aparcelfiledescriptor[0];
        return abyte0;
    }

    public final SafeParcelable a(android.os.Parcelable.Creator creator)
    {
        Object obj;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (b == null)
        {
            com.google.android.gms.ads.internal.util.client.b.a("File descriptor is empty, returning null.");
            return null;
        }
        obj = new DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(b));
        byte abyte0[];
        abyte0 = new byte[((DataInputStream) (obj)).readInt()];
        ((DataInputStream) (obj)).readFully(abyte0, 0, abyte0.length);
        iq.a(((java.io.Closeable) (obj)));
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
        iq.a(((java.io.Closeable) (obj)));
        throw creator;
        creator;
        ((Parcel) (obj)).recycle();
        throw creator;
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
        l.a(this, parcel, i);
        return;
        parcel;
        parcel1.recycle();
        throw parcel;
    }

}

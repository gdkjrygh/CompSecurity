// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.ei;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            e

public final class LargeParcelTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
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
        (new Thread(new Runnable(autocloseoutputstream, abyte0) {

            final OutputStream a;
            final byte b[];
            final LargeParcelTeleporter c;

            public final void run()
            {
                DataOutputStream dataoutputstream1 = new DataOutputStream(a);
                DataOutputStream dataoutputstream = dataoutputstream1;
                dataoutputstream1.writeInt(b.length);
                dataoutputstream = dataoutputstream1;
                dataoutputstream1.write(b);
                ei.a(dataoutputstream1);
                return;
                IOException ioexception;
                ioexception;
                dataoutputstream1 = null;
_L4:
                dataoutputstream = dataoutputstream1;
                com.google.android.gms.ads.internal.util.client.b.b("Error transporting the ad response", ioexception);
                dataoutputstream = dataoutputstream1;
                com.google.android.gms.ads.internal.d.f().a(ioexception, true);
                if (dataoutputstream1 == null)
                {
                    ei.a(a);
                    return;
                } else
                {
                    ei.a(dataoutputstream1);
                    return;
                }
                Exception exception;
                exception;
                dataoutputstream = null;
_L2:
                if (dataoutputstream == null)
                {
                    ei.a(a);
                } else
                {
                    ei.a(dataoutputstream);
                }
                throw exception;
                exception;
                if (true) goto _L2; else goto _L1
_L1:
                ioexception;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                c = LargeParcelTeleporter.this;
                a = outputstream;
                b = abyte0;
                super();
            }
        })).start();
        abyte0 = aparcelfiledescriptor[0];
        return abyte0;
        abyte0;
        autocloseoutputstream = null;
_L2:
        com.google.android.gms.ads.internal.util.client.b.b("Error transporting the ad response", abyte0);
        com.google.android.gms.ads.internal.d.f().a(abyte0, true);
        ei.a(autocloseoutputstream);
        return null;
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
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
            com.google.android.gms.ads.internal.util.client.b.b("File descriptor is empty, returning null.");
            return null;
        }
        obj = new DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(b));
        byte abyte0[];
        abyte0 = new byte[((DataInputStream) (obj)).readInt()];
        ((DataInputStream) (obj)).readFully(abyte0, 0, abyte0.length);
        ei.a(((java.io.Closeable) (obj)));
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
        ei.a(((java.io.Closeable) (obj)));
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
        e.a(this, parcel, i);
        return;
        parcel;
        parcel1.recycle();
        throw parcel;
    }

}

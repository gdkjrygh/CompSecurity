// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzlg;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzk

public final class LargeParcelTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int zzCY;
    ParcelFileDescriptor zzCZ;
    private Parcelable zzDa;
    private boolean zzDb;

    LargeParcelTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor)
    {
        zzCY = i;
        zzCZ = parcelfiledescriptor;
        zzDa = null;
        zzDb = true;
    }

    public LargeParcelTeleporter(SafeParcelable safeparcelable)
    {
        zzCY = 1;
        zzCZ = null;
        zzDa = safeparcelable;
        zzDb = false;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Parcel parcel1;
        if (zzCZ != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        parcel1 = Parcel.obtain();
        byte abyte0[];
        zzDa.writeToParcel(parcel1, 0);
        abyte0 = parcel1.marshall();
        parcel1.recycle();
        zzCZ = zzf(abyte0);
        zzk.zza(this, parcel, i);
        return;
        parcel;
        parcel1.recycle();
        throw parcel;
    }

    public SafeParcelable zza(android.os.Parcelable.Creator creator)
    {
        Object obj;
        if (!zzDb)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (zzCZ == null)
        {
            zzb.zzaz("File descriptor is empty, returning null.");
            return null;
        }
        obj = new DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzCZ));
        byte abyte0[];
        abyte0 = new byte[((DataInputStream) (obj)).readInt()];
        ((DataInputStream) (obj)).readFully(abyte0, 0, abyte0.length);
        zzlg.zzb(((java.io.Closeable) (obj)));
        obj = Parcel.obtain();
        ((Parcel) (obj)).unmarshall(abyte0, 0, abyte0.length);
        ((Parcel) (obj)).setDataPosition(0);
        zzDa = (SafeParcelable)creator.createFromParcel(((Parcel) (obj)));
        ((Parcel) (obj)).recycle();
        zzDb = false;
        return (SafeParcelable)zzDa;
        creator;
        throw new IllegalStateException("Could not read from parcel file descriptor", creator);
        creator;
        zzlg.zzb(((java.io.Closeable) (obj)));
        throw creator;
        creator;
        ((Parcel) (obj)).recycle();
        throw creator;
    }

    protected ParcelFileDescriptor zzf(byte abyte0[])
    {
        ParcelFileDescriptor aparcelfiledescriptor[];
        try
        {
            aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
            (new Thread(new Runnable(new android.os.ParcelFileDescriptor.AutoCloseOutputStream(aparcelfiledescriptor[1]), abyte0) {

                final OutputStream zzDc;
                final byte zzDd[];
                final LargeParcelTeleporter zzDe;

                public void run()
                {
                    DataOutputStream dataoutputstream = new DataOutputStream(zzDc);
                    dataoutputstream.writeInt(zzDd.length);
                    dataoutputstream.write(zzDd);
                    zzlg.zzb(dataoutputstream);
                    return;
                    Object obj;
                    obj;
                    zzb.zzb("Error transporting the ad response", ((Throwable) (obj)));
                    zzo.zzby().zzc(((Throwable) (obj)), true);
                    zzlg.zzb(dataoutputstream);
                    return;
                    obj;
                    zzlg.zzb(dataoutputstream);
                    throw obj;
                }

            
            {
                zzDe = LargeParcelTeleporter.this;
                zzDc = outputstream;
                zzDd = abyte0;
                super();
            }
            })).start();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzb.zzb("Error transporting the ad response", abyte0);
            zzo.zzby().zzc(abyte0, true);
            return null;
        }
        abyte0 = aparcelfiledescriptor[0];
        return abyte0;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.feedback:
//            c

public class FileTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    ParcelFileDescriptor TQ;
    private File TT;
    final String afU;
    final String afV;
    private byte afW[];
    final int mVersionCode;

    FileTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor, String s, String s1)
    {
        mVersionCode = i;
        TQ = parcelfiledescriptor;
        afU = s;
        afV = s1;
    }

    private static void a(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            Log.w("FileTeleporter", "Could not close stream", closeable);
        }
    }

    private FileOutputStream ip()
    {
        if (TT == null)
        {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        File file;
        FileOutputStream fileoutputstream;
        try
        {
            file = File.createTempFile("teleporter", ".tmp", TT);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Could not create temporary file", ioexception);
        }
        try
        {
            fileoutputstream = new FileOutputStream(file);
            TQ = ParcelFileDescriptor.open(file, 0x10000000);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw new IllegalStateException("Temporary file is somehow already deleted");
        }
        file.delete();
        return fileoutputstream;
    }

    public int describeContents()
    {
        return 0;
    }

    public final void setTempDir(File file)
    {
        if (file == null)
        {
            throw new NullPointerException("Cannot set null temp directory");
        } else
        {
            TT = file;
            return;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DataOutputStream dataoutputstream;
        if (TQ != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        dataoutputstream = new DataOutputStream(ip());
        dataoutputstream.writeInt(afW.length);
        dataoutputstream.writeUTF(afU);
        dataoutputstream.writeUTF(afV);
        dataoutputstream.write(afW);
        a(dataoutputstream);
        c.a(this, parcel, i);
        return;
        parcel;
        throw new IllegalStateException("Could not write into unlinked file", parcel);
        parcel;
        a(dataoutputstream);
        throw parcel;
    }

}

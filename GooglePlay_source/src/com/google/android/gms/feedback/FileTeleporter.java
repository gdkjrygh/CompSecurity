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
//            FileTeleporterCreator

public class FileTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new FileTeleporterCreator();
    ParcelFileDescriptor mFileDescriptor;
    final String mFileName;
    final String mMimeType;
    public File mTempDir;
    final int mVersionCode;

    FileTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor, String s, String s1)
    {
        mVersionCode = i;
        mFileDescriptor = parcelfiledescriptor;
        mMimeType = s;
        mFileName = s1;
    }

    private FileOutputStream getUnlinkedFileOutputStream()
    {
        if (mTempDir == null)
        {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        File file;
        FileOutputStream fileoutputstream;
        try
        {
            file = File.createTempFile("teleporter", ".tmp", mTempDir);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Could not create temporary file", ioexception);
        }
        try
        {
            fileoutputstream = new FileOutputStream(file);
            mFileDescriptor = ParcelFileDescriptor.open(file, 0x10000000);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw new IllegalStateException("Temporary file is somehow already deleted");
        }
        file.delete();
        return fileoutputstream;
    }

    private static void safeClose(Closeable closeable)
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

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DataOutputStream dataoutputstream;
        if (mFileDescriptor != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        dataoutputstream = new DataOutputStream(getUnlinkedFileOutputStream());
        dataoutputstream.writeInt(null.length);
        dataoutputstream.writeUTF(mMimeType);
        dataoutputstream.writeUTF(mFileName);
        dataoutputstream.write(null);
        safeClose(dataoutputstream);
        FileTeleporterCreator.writeToParcel(this, parcel, i);
        return;
        parcel;
        throw new IllegalStateException("Could not write into unlinked file", parcel);
        parcel;
        safeClose(dataoutputstream);
        throw parcel;
    }

}

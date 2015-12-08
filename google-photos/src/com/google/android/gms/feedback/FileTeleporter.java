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
import koy;

public class FileTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new koy();
    public final int a;
    public ParcelFileDescriptor b;
    public final String c;
    public final String d;
    public File e;

    public FileTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor, String s, String s1)
    {
        a = i;
        b = parcelfiledescriptor;
        c = s;
        d = s1;
    }

    private FileOutputStream a()
    {
        if (e == null)
        {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        File file;
        FileOutputStream fileoutputstream;
        try
        {
            file = File.createTempFile("teleporter", ".tmp", e);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Could not create temporary file", ioexception);
        }
        try
        {
            fileoutputstream = new FileOutputStream(file);
            b = ParcelFileDescriptor.open(file, 0x10000000);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw new IllegalStateException("Temporary file is somehow already deleted");
        }
        file.delete();
        return fileoutputstream;
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

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DataOutputStream dataoutputstream;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        dataoutputstream = new DataOutputStream(a());
        dataoutputstream.writeInt(null.length);
        dataoutputstream.writeUTF(c);
        dataoutputstream.writeUTF(d);
        dataoutputstream.write(null);
        a(dataoutputstream);
        koy.a(this, parcel, i);
        return;
        parcel;
        throw new IllegalStateException("Could not write into unlinked file", parcel);
        parcel;
        a(dataoutputstream);
        throw parcel;
    }

}

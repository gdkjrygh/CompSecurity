// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.common.data:
//            b

public class a
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int AT;
    ParcelFileDescriptor Ew;
    private Bitmap Ex;
    private boolean Ey;
    private File Ez;
    final int xM;

    a(int i, ParcelFileDescriptor parcelfiledescriptor, int j)
    {
        xM = i;
        Ew = parcelfiledescriptor;
        AT = j;
        Ex = null;
        Ey = false;
    }

    public a(Bitmap bitmap)
    {
        xM = 1;
        Ew = null;
        AT = 0;
        Ex = bitmap;
        Ey = true;
    }

    private void a(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            Log.w("BitmapTeleporter", "Could not close stream", closeable);
        }
    }

    private FileOutputStream eT()
    {
        if (Ez == null)
        {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        File file;
        FileOutputStream fileoutputstream;
        try
        {
            file = File.createTempFile("teleporter", ".tmp", Ez);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Could not create temporary file", ioexception);
        }
        try
        {
            fileoutputstream = new FileOutputStream(file);
            Ew = ParcelFileDescriptor.open(file, 0x10000000);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw new IllegalStateException("Temporary file is somehow already deleted");
        }
        file.delete();
        return fileoutputstream;
    }

    public void a(File file)
    {
        if (file == null)
        {
            throw new NullPointerException("Cannot set null temp directory");
        } else
        {
            Ez = file;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Bitmap eS()
    {
        Object obj;
        if (Ey)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = new DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(Ew));
        Object obj1;
        byte abyte0[];
        int i;
        int j;
        abyte0 = new byte[((DataInputStream) (obj)).readInt()];
        i = ((DataInputStream) (obj)).readInt();
        j = ((DataInputStream) (obj)).readInt();
        obj1 = android.graphics.Bitmap.Config.valueOf(((DataInputStream) (obj)).readUTF());
        ((DataInputStream) (obj)).read(abyte0);
        a(((Closeable) (obj)));
        obj = ByteBuffer.wrap(abyte0);
        obj1 = Bitmap.createBitmap(i, j, ((android.graphics.Bitmap.Config) (obj1)));
        ((Bitmap) (obj1)).copyPixelsFromBuffer(((java.nio.Buffer) (obj)));
        Ex = ((Bitmap) (obj1));
        Ey = true;
        return Ex;
        Object obj2;
        obj2;
        throw new IllegalStateException("Could not read from parcel file descriptor", ((Throwable) (obj2)));
        obj2;
        a(((Closeable) (obj)));
        throw obj2;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj;
        Bitmap bitmap;
        byte abyte0[];
        if (Ew != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        bitmap = Ex;
        obj = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(((java.nio.Buffer) (obj)));
        abyte0 = ((ByteBuffer) (obj)).array();
        obj = new DataOutputStream(eT());
        ((DataOutputStream) (obj)).writeInt(abyte0.length);
        ((DataOutputStream) (obj)).writeInt(bitmap.getWidth());
        ((DataOutputStream) (obj)).writeInt(bitmap.getHeight());
        ((DataOutputStream) (obj)).writeUTF(bitmap.getConfig().toString());
        ((DataOutputStream) (obj)).write(abyte0);
        a(((Closeable) (obj)));
        b.a(this, parcel, i);
        return;
        parcel;
        throw new IllegalStateException("Could not write into unlinked file", parcel);
        parcel;
        a(((Closeable) (obj)));
        throw parcel;
    }

}

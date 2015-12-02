// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;

import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class b
{

    private final File a;
    private final File b;

    public b(File file)
    {
        a = file;
        b = new File((new StringBuilder()).append(file.getPath()).append(".bak").toString());
    }

    static boolean c(FileOutputStream fileoutputstream)
    {
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.getFD().sync();
            }
            // Misplaced declaration of an exception variable
            catch (FileOutputStream fileoutputstream)
            {
                return false;
            }
        }
        return true;
    }

    public FileOutputStream a()
        throws IOException
    {
        FileOutputStream fileoutputstream;
        if (a.exists())
        {
            if (!b.exists())
            {
                if (!a.renameTo(b))
                {
                    Log.w("AtomicFile", (new StringBuilder()).append("Couldn't rename file ").append(a).append(" to backup file ").append(b).toString());
                }
            } else
            {
                a.delete();
            }
        }
        try
        {
            fileoutputstream = new FileOutputStream(a);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            if (!a.getParentFile().mkdir())
            {
                throw new IOException((new StringBuilder()).append("Couldn't create directory ").append(a).toString());
            }
            FileOutputStream fileoutputstream1;
            try
            {
                fileoutputstream1 = new FileOutputStream(a);
            }
            catch (FileNotFoundException filenotfoundexception1)
            {
                throw new IOException((new StringBuilder()).append("Couldn't create ").append(a).toString());
            }
            return fileoutputstream1;
        }
        return fileoutputstream;
    }

    public void a(FileOutputStream fileoutputstream)
    {
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        c(fileoutputstream);
        fileoutputstream.close();
        b.delete();
        return;
        fileoutputstream;
        Log.w("AtomicFile", "finishWrite: Got exception:", fileoutputstream);
        return;
    }

    public FileInputStream b()
        throws FileNotFoundException
    {
        if (b.exists())
        {
            a.delete();
            b.renameTo(a);
        }
        return new FileInputStream(a);
    }

    public void b(FileOutputStream fileoutputstream)
    {
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        c(fileoutputstream);
        fileoutputstream.close();
        a.delete();
        b.renameTo(a);
        return;
        fileoutputstream;
        Log.w("AtomicFile", "failWrite: Got exception:", fileoutputstream);
        return;
    }

    public byte[] c()
        throws IOException
    {
        FileInputStream fileinputstream;
        int i;
        i = 0;
        fileinputstream = b();
        byte abyte0[] = new byte[fileinputstream.available()];
_L2:
        int j = fileinputstream.read(abyte0, i, abyte0.length - i);
        if (j <= 0)
        {
            fileinputstream.close();
            return abyte0;
        }
        i = j + i;
        j = fileinputstream.available();
        if (j <= abyte0.length - i) goto _L2; else goto _L1
_L1:
        byte abyte1[];
        abyte1 = new byte[j + i];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        abyte0 = abyte1;
          goto _L2
        Exception exception;
        exception;
        fileinputstream.close();
        throw exception;
    }
}

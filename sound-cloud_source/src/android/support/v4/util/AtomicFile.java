// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AtomicFile
{

    private final File mBackupName;
    private final File mBaseName;

    public AtomicFile(File file)
    {
        mBaseName = file;
        mBackupName = new File((new StringBuilder()).append(file.getPath()).append(".bak").toString());
    }

    static boolean sync(FileOutputStream fileoutputstream)
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

    public void delete()
    {
        mBaseName.delete();
        mBackupName.delete();
    }

    public void failWrite(FileOutputStream fileoutputstream)
    {
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        sync(fileoutputstream);
        fileoutputstream.close();
        mBaseName.delete();
        mBackupName.renameTo(mBaseName);
        return;
        fileoutputstream;
    }

    public void finishWrite(FileOutputStream fileoutputstream)
    {
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        sync(fileoutputstream);
        fileoutputstream.close();
        mBackupName.delete();
        return;
        fileoutputstream;
    }

    public File getBaseFile()
    {
        return mBaseName;
    }

    public FileInputStream openRead()
        throws FileNotFoundException
    {
        if (mBackupName.exists())
        {
            mBaseName.delete();
            mBackupName.renameTo(mBaseName);
        }
        return new FileInputStream(mBaseName);
    }

    public byte[] readFully()
        throws IOException
    {
        FileInputStream fileinputstream;
        int i;
        i = 0;
        fileinputstream = openRead();
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

    public FileOutputStream startWrite()
        throws IOException
    {
        FileOutputStream fileoutputstream;
        if (mBaseName.exists())
        {
            if (!mBackupName.exists())
            {
                if (!mBaseName.renameTo(mBackupName))
                {
                    (new StringBuilder("Couldn't rename file ")).append(mBaseName).append(" to backup file ").append(mBackupName);
                }
            } else
            {
                mBaseName.delete();
            }
        }
        try
        {
            fileoutputstream = new FileOutputStream(mBaseName);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            if (!mBaseName.getParentFile().mkdir())
            {
                throw new IOException((new StringBuilder("Couldn't create directory ")).append(mBaseName).toString());
            }
            FileOutputStream fileoutputstream1;
            try
            {
                fileoutputstream1 = new FileOutputStream(mBaseName);
            }
            catch (FileNotFoundException filenotfoundexception1)
            {
                throw new IOException((new StringBuilder("Couldn't create ")).append(mBaseName).toString());
            }
            return fileoutputstream1;
        }
        return fileoutputstream;
    }
}

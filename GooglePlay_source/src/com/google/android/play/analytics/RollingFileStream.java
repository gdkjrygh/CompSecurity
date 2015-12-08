// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import android.util.Log;
import com.google.android.play.utils.Assertions;
import com.google.android.play.utils.FileModifiedDateComparator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class RollingFileStream
{
    public static interface WriteCallbacks
    {

        public abstract void onNewOutputFile();

        public abstract void onWrite(Object obj, OutputStream outputstream)
            throws IOException;
    }


    final WriteCallbacks mCallbacks;
    File mCurrentOutputFile;
    private final File mDirectory;
    private final String mFileNamePrefix;
    private final String mFileNameSuffix;
    FileOutputStream mFileOutputStream;
    private final long mMaxStorageSize;
    final ArrayList mReadFiles = new ArrayList();
    final long mRecommendedFileSize;
    final ArrayList mWrittenFiles = new ArrayList();

    public RollingFileStream(File file, String s, String s1, long l, long l1, 
            WriteCallbacks writecallbacks)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkArgument(flag, "recommendedFileSize must be positive");
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkArgument(flag, "maxStorageSize must be positive");
        if (writecallbacks != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assertions.checkArgument(flag, "callbacks cannot be null");
        mDirectory = file;
        mFileNamePrefix = s;
        mFileNameSuffix = s1;
        mRecommendedFileSize = l;
        mMaxStorageSize = l1;
        mCallbacks = writecallbacks;
        createNewOutputFile();
        if (mCurrentOutputFile == null)
        {
            Log.e("RollingFileStream", (new StringBuilder("Could not create a temp file with prefix: \"")).append(mFileNamePrefix).append("\" and suffix: \"").append(mFileNameSuffix).append("\" in dir: \"").append(mDirectory.getAbsolutePath()).append("\".").toString());
        }
        loadWrittenFiles();
        ensureMaxStorageSizeLimit();
    }

    private void loadWrittenFiles()
    {
        if (!mDirectory.exists())
        {
            mDirectory.mkdirs();
        }
        Assertions.checkState(mDirectory.isDirectory(), (new StringBuilder("Expected a directory for path: ")).append(mDirectory.getAbsolutePath()).toString());
        mWrittenFiles.clear();
        File afile[] = mDirectory.listFiles();
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            if (file.isFile() && !file.equals(mCurrentOutputFile))
            {
                if (file.length() == 0L)
                {
                    file.delete();
                } else
                {
                    mWrittenFiles.add(file);
                }
            }
            i++;
        }
        Collections.sort(mWrittenFiles, FileModifiedDateComparator.INSTANCE);
    }

    static byte[] toByteArray(File file)
        throws IOException
    {
        int i;
        long l = file.length();
        if (l > 0x7fffffffL)
        {
            throw new OutOfMemoryError((new StringBuilder("Too large to fit in a byte array: ")).append(l).toString());
        }
        if (l == 0L)
        {
            return new byte[0];
        }
        file = new FileInputStream(file);
        i = (int)l;
        Object obj = new byte[i];
        i = 0;
_L2:
        int j;
        if (i >= obj.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j = file.read(((byte []) (obj)), i, obj.length - i);
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        throw new IOException((new StringBuilder("Unexpected EOS: ")).append(obj.length).append(", ").append(i).toString());
        obj;
        file.close();
        throw obj;
        i += j;
        if (true) goto _L2; else goto _L1
_L1:
        file.close();
        return ((byte []) (obj));
    }

    final void createNewOutputFile()
    {
        if (!mDirectory.exists())
        {
            mDirectory.mkdirs();
        }
        mCurrentOutputFile = null;
        try
        {
            mCurrentOutputFile = File.createTempFile(mFileNamePrefix, mFileNameSuffix, mDirectory);
            mFileOutputStream = new FileOutputStream(mCurrentOutputFile);
            mCallbacks.onNewOutputFile();
            return;
        }
        catch (FileNotFoundException filenotfoundexception) { }
        catch (IOException ioexception)
        {
            return;
        }
        if (mCurrentOutputFile != null)
        {
            mCurrentOutputFile.delete();
        }
        mCurrentOutputFile = null;
    }

    public final void deleteAllReadFiles()
    {
        for (Iterator iterator = mReadFiles.iterator(); iterator.hasNext(); ((File)iterator.next()).delete()) { }
        mReadFiles.clear();
    }

    final void ensureMaxStorageSizeLimit()
    {
        long l = 0L;
        for (Iterator iterator = mReadFiles.iterator(); iterator.hasNext();)
        {
            l += ((File)iterator.next()).length();
        }

        for (Iterator iterator1 = mWrittenFiles.iterator(); iterator1.hasNext();)
        {
            l += ((File)iterator1.next()).length();
        }

        long l1 = l;
        if (mCurrentOutputFile != null)
        {
            l1 = l + mCurrentOutputFile.length();
        }
        int i = 0;
        l = l1;
        do
        {
            if (l <= mMaxStorageSize)
            {
                break;
            }
            int j = i + 1;
            if (mReadFiles.size() > 0)
            {
                File file = (File)mReadFiles.remove(0);
                l -= file.length();
                file.delete();
                i = j;
            } else
            if (mWrittenFiles.size() > 0)
            {
                File file1 = (File)mWrittenFiles.remove(0);
                l -= file1.length();
                file1.delete();
                i = j;
            } else
            {
                i = j;
                if (mCurrentOutputFile != null)
                {
                    l -= mCurrentOutputFile.length();
                    mCurrentOutputFile.delete();
                    mCurrentOutputFile = null;
                    i = j;
                }
            }
        } while (true);
        if (i > 0)
        {
            Log.d("RollingFileStream", (new StringBuilder()).append(i).append(" files were purged due to exceeding total storage size of: ").append(mMaxStorageSize).toString());
        }
    }

    public final void markAllFilesAsUnread()
    {
        mWrittenFiles.addAll(mReadFiles);
        Collections.sort(mWrittenFiles, FileModifiedDateComparator.INSTANCE);
        mReadFiles.clear();
    }
}

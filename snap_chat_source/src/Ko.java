// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import com.snapchat.android.Timber;
import com.snapchat.android.util.cache.CacheType;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.io.FileUtils;

public final class Ko extends JY
{

    private static final String TAG = "ZipFileCache";

    public Ko(CacheType cachetype)
    {
        super(cachetype, 0L);
    }

    private static boolean a(String s, ZipInputStream zipinputstream)
    {
_L5:
        Object obj = zipinputstream.getNextEntry();
        if (obj == null) goto _L2; else goto _L1
_L1:
        byte abyte0[] = null;
        File file;
        file = new File((new StringBuilder()).append(s).append("/").append(((ZipEntry) (obj)).getName()).toString());
        File file1 = file.getParentFile();
        if (!file1.exists() && !file1.mkdirs())
        {
            throw new IOException((new StringBuilder("Could not create directory ")).append(file1).toString());
        }
          goto _L3
        s;
        obj = null;
_L6:
        Pf.a(((java.io.Closeable) (obj)));
        throw s;
_L3:
        if (file.exists() && !file.delete())
        {
            throw new IOException((new StringBuilder("Could not delete file ")).append(file).toString());
        }
        if (!((ZipEntry) (obj)).isDirectory())
        {
            break MISSING_BLOCK_LABEL_196;
        }
        obj = abyte0;
        if (file.mkdirs())
        {
            break MISSING_BLOCK_LABEL_283;
        }
        obj = abyte0;
        if (!file.exists())
        {
            throw new IOException((new StringBuilder("Could not create directory: ")).append(file).toString());
        }
        break MISSING_BLOCK_LABEL_283;
        if (!file.createNewFile())
        {
            throw new IOException((new StringBuilder("Could not create new file ")).append(file).toString());
        }
        abyte0 = new byte[1024];
        obj = new BufferedOutputStream(new FileOutputStream(file), 1024);
_L4:
        int i = zipinputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        ((BufferedOutputStream) (obj)).write(abyte0, 0, i);
          goto _L4
        ((BufferedOutputStream) (obj)).flush();
        Pf.a(((java.io.Closeable) (obj)));
          goto _L5
_L2:
        return true;
        s;
          goto _L6
    }

    public final Bitmap a(Context context, String s, KK kk)
    {
        throw new UnsupportedOperationException("Not supported by ZipFileCache");
    }

    public final Bitmap a(Context context, String s, KK kk, android.graphics.Bitmap.Config config)
    {
        throw new UnsupportedOperationException("Not supported by ZipFileCache");
    }

    protected final String a(byte abyte0[], int i)
    {
        File file = new File((new StringBuilder()).append(mCacheType.getDirectory()).append("/").append(mCacheType.generateFilename()).toString());
        File file1 = mCacheType.getDirectory();
        if (file1.exists() || file1.mkdirs())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        Timber.c("ZipFileCache", (new StringBuilder("Failed to create directory ")).append(file1.getAbsolutePath()).toString(), new Object[0]);
        return null;
        if (file.exists())
        {
            FileUtils.deleteDirectory(file);
        }
        file.mkdirs();
        abyte0 = new ZipInputStream(new ByteArrayInputStream(abyte0, 0, i));
        a(file.getAbsolutePath(), ((ZipInputStream) (abyte0)));
        Pf.a(abyte0);
        return file.getAbsolutePath();
        Exception exception;
        exception;
        try
        {
            Pf.a(abyte0);
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Timber.a("ZipFileCache", abyte0);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Timber.c("ZipFileCache", "Failed to write file...", new Object[0]);
        }
        Timber.a("ZipFileCache", abyte0);
        return null;
    }

    public final void a(String s, Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat)
    {
        throw new UnsupportedOperationException("Not supported by ZipFileCache");
    }

    public final byte[] b(String s)
    {
        throw new UnsupportedOperationException("Not supported by ZipFileCache");
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.snapchat.android.Timber;
import com.snapchat.android.util.cache.CacheType;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import com.snapchat.android.util.debug.ReleaseManager;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public final class Kb extends JY
{

    private static final String TAG = "DiscoverEditionChunkZipFileCache";

    public Kb(CacheType cachetype)
    {
        super(cachetype, 10080L);
    }

    private String a(byte abyte0[], int i, vu vu1)
    {
        File file = new File((new StringBuilder()).append(mCacheType.getDirectory()).append("/").append(mCacheType.generateFilename()).toString());
        File file1 = mCacheType.getDirectory();
        if (file1.exists() || file1.mkdirs())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        Timber.c("DiscoverEditionChunkZipFileCache", (new StringBuilder("Failed to create directory ")).append(file1.getAbsolutePath()).toString(), new Object[0]);
        return null;
        if (file.exists())
        {
            FileUtils.deleteDirectory(file);
        }
        file.mkdirs();
        abyte0 = new ZipInputStream(new ByteArrayInputStream(abyte0, 0, i));
        a(file.getAbsolutePath(), ((ZipInputStream) (abyte0)), vu1);
        Pf.a(abyte0);
        return file.getAbsolutePath();
        vu1;
        try
        {
            Pf.a(abyte0);
            throw vu1;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Timber.a("DiscoverEditionChunkZipFileCache", abyte0);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Timber.c("DiscoverEditionChunkZipFileCache", "Failed to write file...", new Object[0]);
        }
        Timber.a("DiscoverEditionChunkZipFileCache", abyte0);
        return null;
    }

    private static void a(ZipInputStream zipinputstream, File file)
    {
        byte abyte0[];
        abyte0 = new byte[1024];
        file = new BufferedOutputStream(new FileOutputStream(file), 1024);
_L3:
        int i = zipinputstream.read(abyte0);
        if (i == -1) goto _L2; else goto _L1
_L1:
        file.write(abyte0, 0, i);
          goto _L3
        zipinputstream;
_L5:
        Pf.a(file);
        throw zipinputstream;
_L2:
        file.flush();
        Pf.a(file);
        return;
        zipinputstream;
        file = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean a(String s, ZipInputStream zipinputstream, vu vu1)
    {
        do
        {
            ZipEntry zipentry = zipinputstream.getNextEntry();
            if (zipentry == null)
            {
                break;
            }
            if (vu.a(zipentry.getName()))
            {
                Object obj = zipentry.getName();
                Object obj1 = (new StringBuilder()).append(s).append("/").append(((String) (obj)));
                boolean flag;
                if (vu1.b(((String) (obj))))
                {
                    obj = ".encrypted";
                } else
                {
                    obj = "";
                }
                obj = new File(((StringBuilder) (obj1)).append(((String) (obj))).toString());
                obj1 = ((File) (obj)).getParentFile();
                if (((File) (obj1)).exists() || ((File) (obj1)).mkdirs())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    throw new IOException((new StringBuilder("Could not create directory ")).append(obj1).toString());
                }
                if (!((File) (obj)).exists() || ((File) (obj)).delete())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    throw new IOException((new StringBuilder("Could not delete file ")).append(obj).toString());
                }
                if (zipentry.isDirectory())
                {
                    if (!((File) (obj)).mkdirs() && !((File) (obj)).exists())
                    {
                        throw new IOException((new StringBuilder("Could not create directory: ")).append(obj).toString());
                    }
                } else
                {
                    if (!((File) (obj)).createNewFile())
                    {
                        throw new IOException((new StringBuilder("Could not create new file ")).append(obj).toString());
                    }
                    if (vu1.b(zipentry.getName()))
                    {
                        byte abyte0[] = a(IOUtils.toByteArray(zipinputstream));
                        Ke.a(((File) (obj)), abyte0, abyte0.length);
                    } else
                    {
                        a(zipinputstream, ((File) (obj)));
                    }
                }
            }
        } while (true);
        return true;
    }

    public static String c(String s, String s1)
    {
        return (new StringBuilder()).append(Uri.parse(s).getPath()).append(s1).append(".encrypted").toString();
    }

    public final Bitmap a(Context context, String s, KK kk)
    {
        throw new UnsupportedOperationException("Not supported by DiscoverEditionChunkZipFileCache");
    }

    public final Bitmap a(Context context, String s, KK kk, android.graphics.Bitmap.Config config)
    {
        throw new UnsupportedOperationException("Not supported by DiscoverEditionChunkZipFileCache");
    }

    public final String a(String s, byte abyte0[], int i)
    {
        throw new UnsupportedOperationException("Not supported by DiscoverEditionChunkZipFileCache");
    }

    public final String a(String s, byte abyte0[], int i, vu vu1)
    {
        PG.b();
        if (s == null)
        {
            Timber.e("DiscoverEditionChunkZipFileCache", (new StringBuilder("put: Trying to put null key in ")).append(mCacheType.name()).toString(), new Object[0]);
            if (ReleaseManager.e())
            {
                throw new NullPointerException();
            }
            abyte0 = null;
        } else
        {
            vu1 = a(abyte0, i, vu1);
            abyte0 = vu1;
            if (vu1 != null)
            {
                Timber.c("DiscoverEditionChunkZipFileCache", "Put %d bytes in cache for key %s at %s", new Object[] {
                    Integer.valueOf(i), s, vu1
                });
                if (mKeyToItemMap.get(s) != null)
                {
                    e(s);
                }
                mKeyToItemMap.put(s, JY.b.a(vu1, System.currentTimeMillis()));
                return vu1;
            }
        }
        return abyte0;
    }

    public final void a(String s, Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat)
    {
        throw new UnsupportedOperationException("Not supported by DiscoverEditionChunkZipFileCache");
    }

    public final void a(String s, byte abyte0[])
    {
        throw new UnsupportedOperationException("Not supported by DiscoverEditionChunkZipFileCache");
    }

    public final byte[] b(String s)
    {
        throw new UnsupportedOperationException("Not supported by DiscoverEditionChunkZipFileCache");
    }

    public final InputStream h(String s)
    {
        return mCacheType.getCbcEncryptionAlgorithm().a(new FileInputStream((new StringBuilder()).append(Uri.parse(s).getPath()).append(".encrypted").toString()));
    }
}

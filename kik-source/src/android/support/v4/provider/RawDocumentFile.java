// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.provider:
//            DocumentFile

class RawDocumentFile extends DocumentFile
{

    private File mFile;

    RawDocumentFile(DocumentFile documentfile, File file)
    {
        super(documentfile);
        mFile = file;
    }

    private static boolean deleteContents(File file)
    {
        file = file.listFiles();
        boolean flag1 = true;
        boolean flag = true;
        if (file != null)
        {
            int j = file.length;
            int i = 0;
            do
            {
                flag1 = flag;
                if (i >= j)
                {
                    break;
                }
                File file1 = file[i];
                flag1 = flag;
                if (file1.isDirectory())
                {
                    flag1 = flag & deleteContents(file1);
                }
                flag = flag1;
                if (!file1.delete())
                {
                    Log.w("DocumentFile", (new StringBuilder("Failed to delete ")).append(file1).toString());
                    flag = false;
                }
                i++;
            } while (true);
        }
        return flag1;
    }

    private static String getTypeForName(String s)
    {
        int i = s.lastIndexOf('.');
        if (i >= 0)
        {
            s = s.substring(i + 1).toLowerCase();
            s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
            if (s != null)
            {
                return s;
            }
        }
        return "application/octet-stream";
    }

    public boolean canRead()
    {
        return mFile.canRead();
    }

    public boolean canWrite()
    {
        return mFile.canWrite();
    }

    public DocumentFile createDirectory(String s)
    {
        s = new File(mFile, s);
        if (s.isDirectory() || s.mkdir())
        {
            return new RawDocumentFile(this, s);
        } else
        {
            return null;
        }
    }

    public DocumentFile createFile(String s, String s1)
    {
        String s2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
        s = s1;
        if (s2 != null)
        {
            s = (new StringBuilder()).append(s1).append(".").append(s2).toString();
        }
        s = new File(mFile, s);
        try
        {
            s.createNewFile();
            s = new RawDocumentFile(this, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("DocumentFile", (new StringBuilder("Failed to createFile: ")).append(s).toString());
            return null;
        }
        return s;
    }

    public boolean delete()
    {
        deleteContents(mFile);
        return mFile.delete();
    }

    public boolean exists()
    {
        return mFile.exists();
    }

    public String getName()
    {
        return mFile.getName();
    }

    public String getType()
    {
        if (mFile.isDirectory())
        {
            return null;
        } else
        {
            return getTypeForName(mFile.getName());
        }
    }

    public Uri getUri()
    {
        return Uri.fromFile(mFile);
    }

    public boolean isDirectory()
    {
        return mFile.isDirectory();
    }

    public boolean isFile()
    {
        return mFile.isFile();
    }

    public long lastModified()
    {
        return mFile.lastModified();
    }

    public long length()
    {
        return mFile.length();
    }

    public DocumentFile[] listFiles()
    {
        ArrayList arraylist = new ArrayList();
        File afile[] = mFile.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(new RawDocumentFile(this, afile[i]));
            }

        }
        return (DocumentFile[])arraylist.toArray(new DocumentFile[arraylist.size()]);
    }

    public boolean renameTo(String s)
    {
        s = new File(mFile.getParentFile(), s);
        if (mFile.renameTo(s))
        {
            mFile = s;
            return true;
        } else
        {
            return false;
        }
    }
}

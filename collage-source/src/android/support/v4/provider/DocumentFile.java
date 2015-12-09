// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.provider;

import android.content.Context;
import android.net.Uri;
import java.io.File;

// Referenced classes of package android.support.v4.provider:
//            RawDocumentFile, SingleDocumentFile, TreeDocumentFile, DocumentsContractApi21, 
//            DocumentsContractApi19

public abstract class DocumentFile
{

    static final String TAG = "DocumentFile";
    private final DocumentFile mParent;

    DocumentFile(DocumentFile documentfile)
    {
        mParent = documentfile;
    }

    public static DocumentFile fromFile(File file)
    {
        return new RawDocumentFile(null, file);
    }

    public static DocumentFile fromSingleUri(Context context, Uri uri)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return new SingleDocumentFile(null, context, uri);
        } else
        {
            return null;
        }
    }

    public static DocumentFile fromTreeUri(Context context, Uri uri)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return new TreeDocumentFile(null, context, DocumentsContractApi21.prepareTreeUri(uri));
        } else
        {
            return null;
        }
    }

    public static boolean isDocumentUri(Context context, Uri uri)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return DocumentsContractApi19.isDocumentUri(context, uri);
        } else
        {
            return false;
        }
    }

    public abstract boolean canRead();

    public abstract boolean canWrite();

    public abstract DocumentFile createDirectory(String s);

    public abstract DocumentFile createFile(String s, String s1);

    public abstract boolean delete();

    public abstract boolean exists();

    public DocumentFile findFile(String s)
    {
        DocumentFile adocumentfile[] = listFiles();
        int j = adocumentfile.length;
        for (int i = 0; i < j; i++)
        {
            DocumentFile documentfile = adocumentfile[i];
            if (s.equals(documentfile.getName()))
            {
                return documentfile;
            }
        }

        return null;
    }

    public abstract String getName();

    public DocumentFile getParentFile()
    {
        return mParent;
    }

    public abstract String getType();

    public abstract Uri getUri();

    public abstract boolean isDirectory();

    public abstract boolean isFile();

    public abstract long lastModified();

    public abstract long length();

    public abstract DocumentFile[] listFiles();

    public abstract boolean renameTo(String s);
}

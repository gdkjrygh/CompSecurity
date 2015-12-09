// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package retrofit.mime:
//            TypedInput, TypedOutput

public class TypedFile
    implements TypedInput, TypedOutput
{

    private static final int BUFFER_SIZE = 4096;
    private final File file;
    private final String mimeType;

    public TypedFile(String s, File file1)
    {
        if (s == null)
        {
            throw new NullPointerException("mimeType");
        }
        if (file1 == null)
        {
            throw new NullPointerException("file");
        } else
        {
            mimeType = s;
            file = file1;
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof TypedFile)
        {
            obj = (TypedFile)obj;
            return file.equals(((TypedFile) (obj)).file);
        } else
        {
            return false;
        }
    }

    public File file()
    {
        return file;
    }

    public String fileName()
    {
        return file.getName();
    }

    public int hashCode()
    {
        return file.hashCode();
    }

    public InputStream in()
    {
        return new FileInputStream(file);
    }

    public long length()
    {
        return file.length();
    }

    public String mimeType()
    {
        return mimeType;
    }

    public void moveTo(TypedFile typedfile)
    {
        if (!mimeType().equals(typedfile.mimeType()))
        {
            throw new IOException("Type mismatch.");
        }
        if (!file.renameTo(typedfile.file()))
        {
            throw new IOException("Rename failed!");
        } else
        {
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(file.getAbsolutePath()).append(" (").append(mimeType()).append(")").toString();
    }

    public void writeTo(OutputStream outputstream)
    {
        FileInputStream fileinputstream;
        byte abyte0[];
        abyte0 = new byte[4096];
        fileinputstream = new FileInputStream(file);
_L1:
        int i = fileinputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        outputstream;
        fileinputstream.close();
        throw outputstream;
        fileinputstream.close();
        return;
    }
}

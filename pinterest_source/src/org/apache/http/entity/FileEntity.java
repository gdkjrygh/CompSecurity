// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.apache.http.entity:
//            AbstractHttpEntity, ContentType

public class FileEntity extends AbstractHttpEntity
    implements Cloneable
{

    protected final File file;

    public FileEntity(File file1)
    {
        if (file1 == null)
        {
            throw new IllegalArgumentException("File may not be null");
        } else
        {
            file = file1;
            return;
        }
    }

    public FileEntity(File file1, String s)
    {
        if (file1 == null)
        {
            throw new IllegalArgumentException("File may not be null");
        } else
        {
            file = file1;
            setContentType(s);
            return;
        }
    }

    public FileEntity(File file1, ContentType contenttype)
    {
        if (file1 == null)
        {
            throw new IllegalArgumentException("File may not be null");
        }
        file = file1;
        if (contenttype != null)
        {
            setContentType(contenttype.toString());
        }
    }

    public Object clone()
    {
        return super.clone();
    }

    public InputStream getContent()
    {
        return new FileInputStream(file);
    }

    public long getContentLength()
    {
        return file.length();
    }

    public boolean isRepeatable()
    {
        return true;
    }

    public boolean isStreaming()
    {
        return false;
    }

    public void writeTo(OutputStream outputstream)
    {
        FileInputStream fileinputstream;
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        fileinputstream = new FileInputStream(file);
        byte abyte0[] = new byte[4096];
_L1:
        int i = fileinputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        outputstream;
        fileinputstream.close();
        throw outputstream;
        outputstream.flush();
        fileinputstream.close();
        return;
    }
}

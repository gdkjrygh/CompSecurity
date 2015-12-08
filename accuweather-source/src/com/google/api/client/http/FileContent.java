// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

// Referenced classes of package com.google.api.client.http:
//            AbstractInputStreamContent

public final class FileContent extends AbstractInputStreamContent
{

    private final File file;

    public FileContent(String s, File file1)
    {
        super(s);
        file = (File)Preconditions.checkNotNull(file1);
    }

    public File getFile()
    {
        return file;
    }

    public InputStream getInputStream()
        throws FileNotFoundException
    {
        return new FileInputStream(file);
    }

    public long getLength()
    {
        return file.length();
    }

    public boolean retrySupported()
    {
        return true;
    }

    public volatile AbstractInputStreamContent setCloseInputStream(boolean flag)
    {
        return setCloseInputStream(flag);
    }

    public FileContent setCloseInputStream(boolean flag)
    {
        return (FileContent)super.setCloseInputStream(flag);
    }

    public volatile AbstractInputStreamContent setType(String s)
    {
        return setType(s);
    }

    public FileContent setType(String s)
    {
        return (FileContent)super.setType(s);
    }
}

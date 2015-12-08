// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.apache.cordova.file:
//            Filesystem, LocalFilesystemURL

class emURL
    implements adFileCallback
{

    final Filesystem this$0;
    final LocalFilesystemURL val$destination;

    public void handleData(InputStream inputstream, String s)
        throws IOException
    {
        if (inputstream != null)
        {
            s = getOutputStreamForURL(val$destination);
            byte abyte0[] = new byte[8192];
            do
            {
                int i = inputstream.read(abyte0, 0, 8192);
                if (i <= 0)
                {
                    s.close();
                    return;
                }
                s.write(abyte0, 0, i);
            } while (true);
        } else
        {
            throw new IOException("Cannot read file at source URL");
        }
    }

    emURL()
    {
        this$0 = final_filesystem;
        val$destination = LocalFilesystemURL.this;
        super();
    }
}

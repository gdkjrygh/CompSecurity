// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.facebook:
//            NativeAppCallAttachmentStore

class this._cls0
    implements ocessAttachment
{

    final NativeAppCallAttachmentStore this$0;

    public void processAttachment(File file, File file1)
        throws IOException
    {
        FileOutputStream fileoutputstream;
        fileoutputstream = new FileOutputStream(file1);
        file1 = null;
        file = new FileInputStream(file);
        file1 = new byte[1024];
_L1:
        int i = file.read(file1);
        if (i <= 0)
        {
            Utility.closeQuietly(fileoutputstream);
            Utility.closeQuietly(file);
            return;
        }
        fileoutputstream.write(file1, 0, i);
          goto _L1
        file1;
_L3:
        Utility.closeQuietly(fileoutputstream);
        Utility.closeQuietly(file);
        throw file1;
        Exception exception;
        exception;
        file = file1;
        file1 = exception;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public volatile void processAttachment(Object obj, File file)
        throws IOException
    {
        processAttachment((File)obj, file);
    }

    ocessAttachment()
    {
        this$0 = NativeAppCallAttachmentStore.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// Referenced classes of package com.facebook:
//            NativeAppCallAttachmentStore

class this._cls0
    implements ocessAttachment
{

    final NativeAppCallAttachmentStore this$0;

    public void processAttachment(File file, File file1)
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file1);
        file1 = new FileInputStream(file);
        file = new byte[1024];
_L3:
        int i = file1.read(file);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        fileoutputstream.write(file, 0, i);
          goto _L3
        file;
_L5:
        Utility.closeQuietly(fileoutputstream);
        Utility.closeQuietly(file1);
        throw file;
_L2:
        Utility.closeQuietly(fileoutputstream);
        Utility.closeQuietly(file1);
        return;
        file;
        file1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public volatile void processAttachment(Object obj, File file)
    {
        processAttachment((File)obj, file);
    }

    ocessAttachment()
    {
        this$0 = NativeAppCallAttachmentStore.this;
        super();
    }
}

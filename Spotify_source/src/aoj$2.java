// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class 
    implements aok
{

    public final void a(Object obj, File file)
    {
        FileOutputStream fileoutputstream;
        obj = (File)obj;
        fileoutputstream = new FileOutputStream(file);
        file = new FileInputStream(((File) (obj)));
        obj = new byte[1024];
_L3:
        int i = file.read(((byte []) (obj)));
        if (i <= 0) goto _L2; else goto _L1
_L1:
        fileoutputstream.write(((byte []) (obj)), 0, i);
          goto _L3
        obj;
_L5:
        arp.a(fileoutputstream);
        arp.a(file);
        throw obj;
_L2:
        arp.a(fileoutputstream);
        arp.a(file);
        return;
        obj;
        file = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public ()
    {
    }
}

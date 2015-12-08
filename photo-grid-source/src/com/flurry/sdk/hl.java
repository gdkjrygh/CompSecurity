// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

// Referenced classes of package com.flurry.sdk:
//            kc, lp, kx, iz

public final class hl
{

    private static final String a = com/flurry/sdk/hl.getSimpleName();

    public hl()
    {
    }

    public static iz a(File file)
    {
        Object obj;
        if (file == null || !file.exists())
        {
            return null;
        }
        obj = new iz.a();
        FileInputStream fileinputstream = new FileInputStream(file);
        file = new DataInputStream(fileinputstream);
        FileInputStream fileinputstream1;
        File file1;
        file1 = file;
        fileinputstream1 = fileinputstream;
        if (file.readUnsignedShort() == 46586)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        file1 = file;
        fileinputstream1 = fileinputstream;
        kc.a(3, a, "Unexpected file type");
        lp.a(file);
        lp.a(fileinputstream);
        return null;
        file1 = file;
        fileinputstream1 = fileinputstream;
        int i = file.readUnsignedShort();
        if (i == 2)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        file1 = file;
        fileinputstream1 = fileinputstream;
        kc.a(6, a, (new StringBuilder("Unknown agent file version: ")).append(i).toString());
        lp.a(file);
        lp.a(fileinputstream);
        return null;
        file1 = file;
        fileinputstream1 = fileinputstream;
        obj = (iz)((kx) (obj)).b(file);
        lp.a(file);
        lp.a(fileinputstream);
        file = ((File) (obj));
_L1:
        return file;
        Exception exception;
        exception;
        file = null;
        fileinputstream = null;
_L4:
        file1 = file;
        fileinputstream1 = fileinputstream;
        kc.a(3, a, "Error loading legacy agent data.", exception);
        lp.a(file);
        lp.a(fileinputstream);
        file = null;
          goto _L1
        file;
        file1 = null;
        fileinputstream = null;
_L3:
        lp.a(file1);
        lp.a(fileinputstream);
        throw file;
        file;
        file1 = null;
        continue; /* Loop/switch isn't completed */
        file;
        fileinputstream = fileinputstream1;
        if (true) goto _L3; else goto _L2
_L2:
        exception;
        file = null;
          goto _L4
        exception;
          goto _L4
    }

}

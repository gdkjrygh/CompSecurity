// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class jdh
{

    final File a;
    private final ContentResolver b;

    public jdh(File file, ContentResolver contentresolver)
    {
        a = new File(new File(file, "upload"), "temporary-file");
        b = contentresolver;
    }

    public final void a(Uri uri)
    {
        Object obj = null;
        InputStream inputstream = b.openInputStream(uri);
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        uri = String.valueOf(uri);
        throw new FileNotFoundException((new StringBuilder(String.valueOf(uri).length() + 40)).append("Content resolver returned null for Uri: ").append(uri).toString());
        uri;
_L5:
        p.a(inputstream);
        if (obj != null)
        {
            ((OutputStream) (obj)).close();
        }
        throw uri;
_L2:
        uri = new BufferedOutputStream(new FileOutputStream(a));
        obj = new byte[8192];
_L3:
        int i = inputstream.read(((byte []) (obj)));
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        uri.write(((byte []) (obj)), 0, i);
          goto _L3
        Exception exception;
        exception;
        obj = uri;
        uri = exception;
        continue; /* Loop/switch isn't completed */
        p.a(inputstream);
        uri.close();
        return;
        uri;
        inputstream = null;
        if (true) goto _L5; else goto _L4
_L4:
    }
}

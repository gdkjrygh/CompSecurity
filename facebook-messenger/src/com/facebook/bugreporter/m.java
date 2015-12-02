// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.content.Context;
import android.net.Uri;
import com.facebook.debug.log.b;
import com.facebook.debug.log.f;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.bugreporter:
//            n

public class m
{

    private static final Class a = com/facebook/bugreporter/m;
    private final Context b;
    private final Executor c;

    public m(Context context, Executor executor)
    {
        b = context;
        c = executor;
    }

    public File a()
    {
        Object obj;
        File file;
        file = new File(b.getExternalCacheDir(), "bugreports");
        obj = null;
_L5:
        Object obj1 = new File(file, String.valueOf(System.nanoTime()));
        if (((File) (obj1)).exists()) goto _L2; else goto _L1
_L1:
        boolean flag = ((File) (obj1)).mkdirs();
        if (!flag)
        {
            obj1 = null;
        }
        return ((File) (obj1));
        obj1;
_L3:
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Exception caught in createReportDirectory: ").append(obj1).toString());
        return ((File) (obj));
        NullPointerException nullpointerexception;
        nullpointerexception;
        obj = obj1;
        obj1 = nullpointerexception;
        if (true) goto _L3; else goto _L2
_L2:
        obj = obj1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(Uri uri)
    {
        c.execute(new n(this, uri));
    }

    public void b(Uri uri)
    {
        File afile[];
        uri = new File(new URI(uri.toString()));
        afile = uri.listFiles();
        if (afile == null) goto _L2; else goto _L1
_L1:
        int j = afile.length;
        int i = 0;
_L6:
        if (i >= j) goto _L2; else goto _L3
_L3:
        File file = afile[i];
        if (file.exists())
        {
            file.delete();
        }
          goto _L4
_L2:
        try
        {
            uri.delete();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            f.a(a, (new StringBuilder()).append("Cannot parse Bug Report Directory URI: ").append(uri).toString());
        }
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

}

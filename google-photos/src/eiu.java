// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.ExecutionException;

final class eiu
{

    private final eiv a;
    private final eje b;
    private final noz c;
    private final ejg d;
    private final amh e;
    private final fli f;

    eiu(Context context)
    {
        d = (ejg)olm.a(context, ejg);
        e = (amh)olm.a(context, amh);
        f = (fli)olm.a(context, fli);
        a = (eiv)olm.a(context, eiv);
        b = (eje)olm.a(context, eje);
        c = noz.a(context, "MediaContentProvider", new String[0]);
    }

    final int a(ejm ejm)
    {
        int j = a.a(ejm);
        int i = j;
        if (j == -1)
        {
            i = 0x80000000;
        }
        return i;
    }

    final File a(eiz eiz1)
    {
        Object obj;
        mjw mjw1;
        int i;
        boolean flag;
        if (eiz1.c != euv.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "ImageFileProvider can not download video files");
        obj = b(eiz1);
        if (obj == null)
        {
            if (c.a())
            {
                noy.a("identifier", eiz1);
            }
            return null;
        }
        mjw1 = (new mjw()).b().a();
        i = a(eiz1.e);
        if (TextUtils.isEmpty(((gap) (obj)).a()))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        if (((gap) (obj)).g().f())
        {
            obj = ((gap) (obj)).g();
        } else
        {
            obj = ((gap) (obj)).h();
        }
        obj = e.b(obj).a(ayt.b(f.a(), mjw1)).a(i, i);
_L1:
        return (File)((ayn) (obj)).get();
        obj = e.b(((gap) (obj)).b()).a(i, i);
          goto _L1
        Object obj1;
        obj1;
_L3:
        if (c.a())
        {
            noy.a("identifier", eiz1);
        }
        return null;
        obj1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    final gap b(eiz eiz1)
    {
        Object obj = eiz1.d.getScheme();
        if ("mediaKey".equals(obj))
        {
            obj = d.a(eiz1);
            if (obj == null)
            {
                return null;
            } else
            {
                return new gat(((Uri) (obj)).toString(), eiz1.b);
            }
        }
        if ("content".equals(obj))
        {
            return new gan(eiz1.d);
        }
        if ("file".equals(obj))
        {
            obj = new File(eiz1.d.getPath());
            if (b.a(((File) (obj))))
            {
                return new gan(eiz1.d);
            } else
            {
                eiz1 = String.valueOf(eiz1.d);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(eiz1).length() + 52)).append("Invalid file, must be within cache directory.  Uri: ").append(eiz1).toString());
            }
        }
        eiz1 = String.valueOf(obj);
        if (eiz1.length() != 0)
        {
            eiz1 = "Unknown scheme: ".concat(eiz1);
        } else
        {
            eiz1 = new String("Unknown scheme: ");
        }
        throw new IllegalArgumentException(eiz1);
    }
}

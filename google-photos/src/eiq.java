// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

final class eiq
    implements eip
{

    private final Context a;
    private final eiu b;
    private final noz c;
    private final ejg d;

    eiq(Context context)
    {
        a = context;
        d = (ejg)olm.a(context, ejg);
        b = (eiu)olm.a(context, eiu);
        c = noz.a(context, "MediaContentProvider", new String[0]);
    }

    private static ParcelFileDescriptor a(File file)
    {
        if (file != null && file.exists())
        {
            return ParcelFileDescriptor.open(file, 0x10000000);
        } else
        {
            file = String.valueOf(file);
            throw new FileNotFoundException((new StringBuilder(String.valueOf(file).length() + 16)).append("File not found: ").append(file).toString());
        }
    }

    private File a(eiz eiz1)
    {
        return b.a(eiz1);
    }

    private File b(eiz eiz1)
    {
        Uri uri = d.a(eiz1);
        if (uri != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        File file;
        file = new File(a.getCacheDir(), "content-provider-cache-video-file.mpg");
        if (file.exists())
        {
            file.delete();
        }
        file.createNewFile();
        eio eio1 = new eio(a);
        eio1.d = uri;
        eio1.e = eiz1.b;
        eio1.c = file;
        eiz1 = eio1.a();
        eiz1.a();
        if (eiz1.b())
        {
            return file;
        }
        try
        {
            String s = String.valueOf("Request was not successful. status code: ");
            int i = ((eim) (eiz1)).b;
            throw new IOException((new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString());
        }
        // Misplaced declaration of an exception variable
        catch (eiz eiz1) { }
        if (c.a())
        {
            noy.a("uri", uri);
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final ParcelFileDescriptor a(eiz eiz1, eit eit1)
    {
        String s = eiz1.d.getScheme();
        if (eiz1.e != ejm.c && eiz1.c != euv.c)
        {
            return a(a(eiz1));
        }
        if ("file".equals(s))
        {
            eiz1 = new File(eiz1.d.getPath());
            if (!eit1.a(eiz1))
            {
                eiz1 = null;
            }
            return a(((File) (eiz1)));
        }
        if ("content".equals(s))
        {
            eiz1 = eiz1.d;
            return a.getContentResolver().openFileDescriptor(eiz1, "r");
        }
        if ("mediaKey".equals(s))
        {
            if (eiz1.c == euv.c)
            {
                eiz1 = b(eiz1);
            } else
            {
                eiz1 = a(eiz1);
            }
            return a(((File) (eiz1)));
        }
        eiz1 = String.valueOf(s);
        if (eiz1.length() != 0)
        {
            eiz1 = "Uri has unknown scheme: ".concat(eiz1);
        } else
        {
            eiz1 = new String("Uri has unknown scheme: ");
        }
        throw new IllegalArgumentException(eiz1);
    }
}

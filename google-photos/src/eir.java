// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

public class eir
{

    private final Context a;
    private final eiu b;
    private final eje c;
    private final noz d;
    private final ejg e;

    public eir(Context context)
    {
        a = context;
        e = (ejg)olm.a(context, ejg);
        b = (eiu)olm.a(context, eiu);
        c = (eje)olm.a(context, eje);
        d = noz.a(context, "MediaContentProvider", new String[0]);
    }

    private long a(Uri uri)
    {
        uri = a.getContentResolver().query(uri, new String[] {
            "_size"
        }, null, null, null);
        long l;
        if (!uri.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        l = uri.getLong(uri.getColumnIndexOrThrow("_size"));
        if (uri != null)
        {
            uri.close();
        }
        return l;
        if (uri != null)
        {
            uri.close();
        }
        return 0L;
        Exception exception;
        exception;
        if (uri != null)
        {
            uri.close();
        }
        throw exception;
    }

    private long b(eiz eiz1)
    {
        eiz1 = b.a(eiz1);
        if (eiz1 != null && eiz1.exists())
        {
            return eiz1.length();
        } else
        {
            return 0L;
        }
    }

    private long c(eiz eiz1)
    {
        Uri uri = e.a(eiz1);
        if (uri != null)
        {
            eio eio1 = new eio(a);
            eio1.b = "HEAD";
            eio1.e = eiz1.b;
            eio1.d = uri;
            eiz1 = eio1.a();
            try
            {
                eiz1.a();
                if (eiz1.b())
                {
                    return ((eim) (eiz1)).c;
                } else
                {
                    throw new IOException("Request was not successful");
                }
            }
            catch (IOException ioexception) { }
            if (d.a())
            {
                noy.a("statusCode", Integer.valueOf(((eim) (eiz1)).b));
                return 0L;
            }
        }
        return 0L;
    }

    public final long a(eiz eiz1)
    {
        String s = eiz1.d.getScheme();
        if (eiz1.e != ejm.c && eiz1.c != euv.c)
        {
            return b(eiz1);
        }
        if ("file".equals(s))
        {
            eiz1 = new File(eiz1.d.getPath());
            if (eiz1.exists() && c.a(eiz1))
            {
                return eiz1.length();
            } else
            {
                return 0L;
            }
        }
        if ("content".equals(s))
        {
            return a(eiz1.d);
        }
        if ("mediaKey".equals(s))
        {
            if (eiz1.c == euv.c)
            {
                return c(eiz1);
            } else
            {
                return b(eiz1);
            }
        } else
        {
            eiz1 = String.valueOf(eiz1.d);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(eiz1).length() + 24)).append("Uri has unknown scheme: ").append(eiz1).toString());
        }
    }
}

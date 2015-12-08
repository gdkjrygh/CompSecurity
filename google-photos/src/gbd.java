// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public class gbd
{

    private final ContentResolver a;
    private final gbg b;
    private final noz c;

    private gbd(Context context, ContentResolver contentresolver, gbg gbg1)
    {
        a = contentresolver;
        b = gbg1;
        c = noz.a(context, 2, "FingerprintCache", new String[0]);
    }

    public gbd(Context context, gbg gbg1)
    {
        this(context, context.getContentResolver(), gbg1);
    }

    public final nko a(String s)
    {
        nko nko = c(s);
        if (nko != null)
        {
            return nko;
        } else
        {
            return b(s);
        }
    }

    public final nko b(String s)
    {
        long l = noy.a();
        Object obj = a.openInputStream(Uri.parse(s));
        Object obj1;
label0:
        {
            {
                if (obj != null)
                {
                    break label0;
                }
                nkp nkp1;
                ContentValues contentvalues;
                if (obj != null)
                {
                    try
                    {
                        ((InputStream) (obj)).close();
                    }
                    catch (IOException ioexception) { }
                }
                if (c.a())
                {
                    noy.a("uri", s);
                    noy.a("duration", l);
                }
            }
            return null;
        }
        nkp1 = nkp.b(((InputStream) (obj)));
        contentvalues = new ContentValues();
        contentvalues.put("fingerprint", nkp1.a);
        contentvalues.put("size", Long.valueOf(nkp1.b));
        b.a("media_store_extra_fingerprint", s, contentvalues);
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        if (c.a())
        {
            noy.a("uri", s);
            noy.a("duration", l);
        }
        return nkp1;
        obj;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception2) { }
        }
        if (c.a())
        {
            noy.a("uri", s);
            noy.a("duration", l);
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj1;
        obj = null;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception3) { }
        }
        if (c.a())
        {
            noy.a("uri", s);
            noy.a("duration", l);
        }
        throw obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final nko c(String s)
    {
        s = b.a("media_store_extra_fingerprint", s);
        nkp nkp1;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        nkp1 = new nkp(s.getBlob(s.getColumnIndexOrThrow("fingerprint")), s.getLong(s.getColumnIndexOrThrow("size")));
        s.close();
        return nkp1;
        s.close();
        return null;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }
}

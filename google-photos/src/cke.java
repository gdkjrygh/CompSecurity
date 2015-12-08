// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class cke
    implements cjv
{

    private static final String a = cke.getSimpleName();
    private final ContentResolver b;
    private final Uri c;
    private final cln d;
    private long e;
    private int f;
    private int g;
    private int h;
    private boolean i;

    public cke(ContentResolver contentresolver, Uri uri, cln cln1)
    {
        e = -1L;
        f = -1;
        g = -1;
        h = -1;
        i = false;
        b = (ContentResolver)b.a(contentresolver, "contentResolver", null);
        c = (Uri)b.a(uri, "uri", null);
        d = cln1;
    }

    private static long a(String s)
    {
        String s1;
        SimpleDateFormat simpledateformat;
        s1 = (new ExifInterface(s)).getAttribute("DateTime");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        simpledateformat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        long l = simpledateformat.parse(s1).getTime();
        return l * 1000L;
        ParseException parseexception;
        parseexception;
        String s2 = a;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Creation time cannot be parsed For File : ".concat(s);
        } else
        {
            s = new String("Creation time cannot be parsed For File : ");
        }
        Log.w(s2, s, parseexception);
        return -1L;
    }

    private static int b(String s)
    {
        switch ((new ExifInterface(s)).getAttributeInt("Orientation", 0))
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 3: // '\003'
            return 180;

        case 6: // '\006'
            return 90;

        case 8: // '\b'
            return 270;
        }
    }

    private void b()
    {
        java.io.InputStream inputstream;
        java.io.InputStream inputstream1;
        inputstream1 = null;
        inputstream = null;
        try
        {
            if (d != null)
            {
                FileInputStream fileinputstream = new FileInputStream(d.b());
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileinputstream, null, options);
                g = options.outWidth;
                h = options.outHeight;
                b.a(fileinputstream);
                return;
            }
        }
        catch (IOException ioexception) { }
        Object obj = b.openInputStream(c);
        inputstream = ((java.io.InputStream) (obj));
        inputstream1 = ((java.io.InputStream) (obj));
        Object obj1 = new android.graphics.BitmapFactory.Options();
        inputstream = ((java.io.InputStream) (obj));
        inputstream1 = ((java.io.InputStream) (obj));
        obj1.inJustDecodeBounds = true;
        inputstream = ((java.io.InputStream) (obj));
        inputstream1 = ((java.io.InputStream) (obj));
        BitmapFactory.decodeStream(((java.io.InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj1)));
        inputstream = ((java.io.InputStream) (obj));
        inputstream1 = ((java.io.InputStream) (obj));
        g = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        inputstream = ((java.io.InputStream) (obj));
        inputstream1 = ((java.io.InputStream) (obj));
        h = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        b.a(((java.io.Closeable) (obj)));
        return;
        IOException ioexception1;
        ioexception1;
        inputstream1 = inputstream;
        obj = a;
        inputstream1 = inputstream;
        ioexception1 = String.valueOf(ioexception1);
        inputstream1 = inputstream;
        Log.e(((String) (obj)), (new StringBuilder(String.valueOf(ioexception1).length() + 37)).append("Could not retrieve photo dimensions: ").append(ioexception1).toString());
        b.a(inputstream);
        return;
        Exception exception;
        exception;
        b.a(inputstream1);
        throw exception;
    }

    public final void a()
    {
    }

    public final coi i()
    {
        if (i) goto _L2; else goto _L1
_L1:
        if (d == null) goto _L4; else goto _L3
_L3:
        e = d.a();
        String s = d.b().getAbsolutePath();
        if (e == 0L || e == -1L)
        {
            e = a(s);
        }
        f = b(s);
_L6:
        b();
        i = true;
_L2:
        return new cop(e, f, g, h);
_L4:
        Cursor cursor = b.query(c, new String[] {
            "datetaken", "orientation"
        }, null, null, null);
        if (cursor != null)
        {
            if (cursor.moveToFirst())
            {
                e = 1000L * cursor.getLong(cursor.getColumnIndex("datetaken"));
                f = cursor.getInt(cursor.getColumnIndex("orientation"));
            }
            cursor.close();
        }
        if ((e == 0L || e == -1L) && c.getScheme().equals("file"))
        {
            e = a(c.getPath());
        }
        if (f == 0 || f == -1)
        {
            f = b(c.getPath());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void j()
    {
    }

}

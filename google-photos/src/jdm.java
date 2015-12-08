// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class jdm extends mtf
{

    final List a;
    jdk b;
    Uri c;
    private final nmt j = new jdn(this);
    private final int k;
    private final String l;
    private jdh m;
    private nmp n;
    private ContentResolver o;
    private noz p;
    private noz q;

    public jdm(int i, String s, List list)
    {
        super("UploadContentToAlbumTask");
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "uriList must be non-empty");
        k = i;
        a = list;
        l = s;
    }

    private jdo a(Uri uri, File file)
    {
        Object obj1;
        Uri uri1;
        obj1 = null;
        uri1 = Uri.fromFile(file);
        Object obj = o.query(uri, null, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        int i;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_213;
        }
        i = ((Cursor) (obj)).getColumnIndex("mime_type");
        if (i < 0) goto _L2; else goto _L1
_L1:
        String s = ((Cursor) (obj)).getString(i);
_L7:
        i = ((Cursor) (obj)).getColumnIndex("_display_name");
        file = obj1;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        file = ((Cursor) (obj)).getString(i);
        i = ((Cursor) (obj)).getColumnIndex("date_added");
        if (i < 0) goto _L4; else goto _L3
_L3:
        long l1 = TimeUnit.SECONDS.toMillis(((Cursor) (obj)).getLong(i));
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = file;
        if (TextUtils.isEmpty(file))
        {
            obj = "image.jpg";
        }
        file = s;
        if (TextUtils.isEmpty(s))
        {
            file = "image/jpeg";
        }
        return new jdo(((String) (obj)), l1, file, uri, uri1);
        uri;
        file = null;
_L5:
        if (file != null)
        {
            file.close();
        }
        throw uri;
        uri;
        file = ((File) (obj));
        if (true) goto _L5; else goto _L4
_L4:
        l1 = 0L;
          goto _L6
_L2:
        s = null;
          goto _L7
        s = null;
        l1 = 0L;
        file = null;
          goto _L6
    }

    private nmo a(String s, jdo jdo1)
    {
        try
        {
            nmp nmp1 = n;
            nnd nnd1 = new nnd();
            nnd1.a = jdo1.d;
            nnd1.d = s;
            nnd1.b = jdo1.a;
            nnd1.e = jdo1.b;
            nnd1.c = jdo1.c;
            nnd1.g = false;
            s = nmp1.a(nnd1.a());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException("Error while uploading", s);
        }
        return s;
    }

    private void f()
    {
        try
        {
            Object obj = m;
            if (!((jdh) (obj)).a.delete())
            {
                obj = String.valueOf(((jdh) (obj)).a);
                throw new IOException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Could not delete temporary file: ").append(((String) (obj))).toString());
            }
        }
        catch (IOException ioexception) { }
    }

    private static mue g()
    {
        return new mue(0, null, null);
    }

    public final mtf a(boolean flag)
    {
        super.a(flag);
        if (flag)
        {
            n.a();
        }
        return this;
    }

    protected final mue a(Context context)
    {
        m = (jdh)olm.a(context, jdh);
        jdd jdd1 = (jdd)olm.a(context, jdd);
        int i = k;
        nmt nmt = j;
        n = (new nmr(jdd1.a)).a(i).a(nmt).a();
        b = (jdk)olm.a(context, jdk);
        o = context.getContentResolver();
        p = noz.a(context, 3, "UploadContentTask", new String[0]);
        q = noz.a(context, "UploadContentTask", new String[0]);
        if (p.a())
        {
            noy.a("albumId", l);
        }
        Object obj;
        context = new ArrayList();
        obj = a.iterator();
_L8:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1 = (Uri)((Iterator) (obj)).next();
        if (!super.g) goto _L4; else goto _L3
_L3:
        context = g();
        f();
        return context;
_L4:
        jdh jdh1;
        c = ((Uri) (obj1));
        jdh1 = m;
        File file = jdh1.a.getParentFile();
        if (!file.isDirectory() && !file.mkdirs())
        {
            context = String.valueOf(file);
            throw new IOException((new StringBuilder(String.valueOf(context).length() + 35)).append("Could not create parent directory: ").append(context).toString());
        }
          goto _L5
_L7:
        context = new mue(0, context, null);
        f();
        return context;
_L5:
        try
        {
            if (jdh1.a.exists() && !jdh1.a.delete())
            {
                context = String.valueOf(jdh1.a);
                throw new IOException((new StringBuilder(String.valueOf(context).length() + 32)).append("Could not delete existing file: ").append(context).toString());
            }
            if (!jdh1.a.createNewFile())
            {
                context = String.valueOf(jdh1.a);
                throw new IOException((new StringBuilder(String.valueOf(context).length() + 29)).append("Could not create empty file: ").append(context).toString());
            }
            break MISSING_BLOCK_LABEL_421;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        finally
        {
            f();
            throw context;
        }
        if (true) goto _L7; else goto _L6
_L6:
        m.a(((Uri) (obj1)));
        obj1 = a(((Uri) (obj1)), m.a);
        if (!super.g)
        {
            break MISSING_BLOCK_LABEL_459;
        }
        context = g();
        f();
        return context;
        context.add(a(l, ((jdo) (obj1))).b);
          goto _L8
_L2:
        obj = new mue(true);
        ((mue) (obj)).a().putStringArrayList("uploaded_media_keys", context);
        f();
        return ((mue) (obj));
    }
}

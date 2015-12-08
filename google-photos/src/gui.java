// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public final class gui
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private final ContentResolver b;
    private final gvk c;
    private final gva d;
    private final gvf e;
    private final gvg f;

    public gui(Context context)
    {
        this(context, context.getContentResolver());
    }

    private gui(Context context, ContentResolver contentresolver)
    {
        b = contentresolver;
        c = (gvk)olm.a(context, gvk);
        d = (gva)olm.a(context, gva);
        e = (gvf)olm.a(context, gvf);
        f = (gvg)olm.a(context, gvg);
    }

    private static Uri a(ekp ekp1)
    {
        for (Iterator iterator = ((hpg)ekp1.a(hpg)).a.iterator(); iterator.hasNext();)
        {
            hpk hpk1 = (hpk)iterator.next();
            if (hpk1.e())
            {
                return Uri.parse(hpk1.a);
            }
        }

        ekp1 = String.valueOf(ekp1);
        throw new eke((new StringBuilder(String.valueOf(ekp1).length() + 39)).append("Local content URI not found for media: ").append(ekp1).toString());
    }

    public static ekk a()
    {
        return a;
    }

    private static void a(Uri uri, Uri uri1)
    {
        boolean flag = "file".equals(uri.getScheme());
        Object obj = String.valueOf(uri);
        p.a(flag, (new StringBuilder(String.valueOf(obj).length() + 30)).append("tempUri must point to a file: ").append(((String) (obj))).toString());
        flag = "file".equals(uri1.getScheme());
        obj = String.valueOf(uri1);
        p.a(flag, (new StringBuilder(String.valueOf(obj).length() + 32)).append("outputUri must point to a file: ").append(((String) (obj))).toString());
        obj = new File(uri1.getPath());
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        File file = new File(uri.getPath());
        if (!file.renameTo(((File) (obj))))
        {
            file.delete();
            String s = String.valueOf("Could not rename temp file to output file.tempUri: ");
            uri = String.valueOf(uri);
            uri1 = String.valueOf(uri1);
            throw new IOException((new StringBuilder(String.valueOf(s).length() + 12 + String.valueOf(uri).length() + String.valueOf(uri1).length())).append(s).append(uri).append(" outputUri: ").append(uri1).toString());
        } else
        {
            return;
        }
    }

    private Uri b(gue gue1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Uri uri;
        Object obj4;
        obj3 = null;
        boolean flag = true;
        gvm gvm1;
        Point point;
        Point point1;
        Object obj5;
        if (gue1.h != gvl.b || !"file".equals(gue1.g.getScheme()))
        {
            flag = false;
        }
        uri = a(gue1.c);
        obj2 = gue1.g;
        obj4 = Uri.parse(String.valueOf(((Uri) (obj2)).toString()).concat(".tmp"));
        point = b.a(b, gue1.e);
        point1 = b.a(b, uri);
        gvm1 = new gvm(point.x, point.y);
        obj = b.openInputStream(uri);
        obj1 = b.openInputStream(gue1.e);
        obj5 = b;
        if (flag)
        {
            obj3 = obj4;
        } else
        {
            obj3 = obj2;
        }
        obj3 = ((ContentResolver) (obj5)).openOutputStream(((Uri) (obj3)));
        obj5 = d.a();
        obj5.a = ((java.io.InputStream) (obj));
        obj5.b = ((java.io.InputStream) (obj1));
        obj5.f = ((OutputStream) (obj3));
        obj5.c = true;
        obj5.d = true;
        obj5.g = gvm1;
        if (!point.equals(point1))
        {
            obj5.e = true;
        }
        ((guz) (obj5)).a();
        ((OutputStream) (obj3)).close();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        a(((Uri) (obj4)), ((Uri) (obj2)));
        if (!gue1.i) goto _L2; else goto _L1
_L1:
        obj4 = c.a();
        obj4.a = gvm1;
        obj4.b = true;
        if (gue1.h != gvl.a) goto _L4; else goto _L3
_L3:
        gue1 = ((gvi) (obj4)).a(uri, ((Uri) (obj2)), euv.b);
_L5:
        f.a(gue1);
_L7:
        p.a(((java.io.Closeable) (obj)));
        p.a(((java.io.Closeable) (obj1)));
        p.a(((java.io.Closeable) (obj3)));
        return gue1;
_L4:
        ((gvi) (obj4)).a(uri, euv.b);
        gue1 = uri;
          goto _L5
        gue1;
        obj = null;
        obj1 = null;
        obj2 = obj3;
_L6:
        p.a(((java.io.Closeable) (obj1)));
        p.a(((java.io.Closeable) (obj2)));
        p.a(((java.io.Closeable) (obj)));
        throw gue1;
        gue1;
        obj2 = null;
        obj1 = obj;
        obj = obj2;
        obj2 = obj3;
        continue; /* Loop/switch isn't completed */
        gue1;
        obj2 = null;
        obj3 = obj;
        obj = obj2;
        obj2 = obj1;
        obj1 = obj3;
        continue; /* Loop/switch isn't completed */
        gue1;
        obj2 = obj3;
        obj3 = obj;
        obj = obj2;
        obj2 = obj1;
        obj1 = obj3;
        if (true) goto _L6; else goto _L2
_L2:
        gue1 = ((gue) (obj2));
          goto _L7
    }

    public final Uri a(ekp ekp1, gvl gvl1)
    {
        Uri uri = a(ekp1);
        if (gvl1 == gvl.b)
        {
            ekp1 = uri;
            if (oql.b(uri))
            {
                ekp1 = Uri.fromFile(new File(e.b(uri)));
            }
            return ekp1;
        } else
        {
            return Uri.fromFile(e.a(uri));
        }
    }

    public final elb a(gue gue1)
    {
        euv euv1;
        boolean flag;
        if (!b.c(gue1.g))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify outputUri in details");
        euv1 = gue1.c.c();
        guj.a[euv1.ordinal()];
        JVM INSTR tableswitch 1 2: default 223
    //                   1 115
    //                   2 126;
           goto _L1 _L2 _L3
_L1:
        gue1 = String.valueOf(euv1);
        throw new UnsupportedOperationException((new StringBuilder(String.valueOf(gue1).length() + 26)).append("Cannot edit media of type ").append(gue1).toString());
        gue1;
_L10:
        return b.a(gue1);
_L2:
        Object obj = b(gue1);
_L5:
        return b.b(obj);
_L3:
        Uri uri;
        Uri uri1;
        uri = a(gue1.c);
        obj = gue1.e;
        uri1 = gue1.g;
        if (!((Uri) (obj)).equals(uri1))
        {
            a(((Uri) (obj)), uri1);
        }
        obj = uri1;
        if (!gue1.i) goto _L5; else goto _L4
_L4:
        obj = c.a();
        if (gue1.h != gvl.a) goto _L7; else goto _L6
_L6:
        obj = ((gvi) (obj)).a(uri, uri1, euv.c);
_L8:
        f.a(((Uri) (obj)));
          goto _L5
_L7:
        ((gvi) (obj)).a(uri, euv.c);
        obj = uri;
          goto _L8
        gue1;
        if (true) goto _L10; else goto _L9
_L9:
    }

}

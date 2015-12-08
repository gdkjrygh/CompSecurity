// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TimeZone;

public final class guk
{

    private static final ekk a = (new ekm()).a(hpg).a(elt).a(fzu).a();
    private static final ekk b = (new ekm()).b(hpe).a();
    private final Context c;
    private final ContentResolver d;
    private final gul e;
    private final gva f;
    private final eto g;
    private final ejn h;
    private final noz i;

    public guk(Context context)
    {
        this(context, context.getContentResolver(), new gul(context));
    }

    private guk(Context context, ContentResolver contentresolver, gul gul1)
    {
        c = context;
        d = contentresolver;
        e = gul1;
        f = (gva)olm.a(context, gva);
        g = (eto)olm.a(context, eto);
        h = (ejn)olm.a(context, ejn);
        i = noz.a(context, "SaveEditAction", new String[0]);
    }

    public static ekk a()
    {
        return a;
    }

    public final elb a(gue gue1)
    {
        File file;
        Object obj6;
        Object obj7;
        fzw fzw1;
        int j;
        j = gue1.a;
        obj6 = gue1.c;
        obj7 = gue1.b;
        fzw1 = ((fzu)((ekp) (obj6)).a(fzu)).a;
        file = new File(c.getCacheDir(), "server-save-edit.jpg");
        Object obj2;
        Object obj8;
        obj8 = h.a(((ekp) (obj6)), ejm.c);
        gue1 = gue1.e;
        obj2 = d.openInputStream(((Uri) (obj8)));
        Object obj1 = d.openInputStream(gue1);
        Object obj = new FileOutputStream(file);
        Object obj3;
        Object obj5;
        FileOutputStream fileoutputstream;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        Point point = b.a(d, gue1);
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        obj8 = b.a(d, ((Uri) (obj8)));
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gvm gvm1 = new gvm(point.x, point.y);
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz guz1 = f.a();
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.a = ((java.io.InputStream) (obj2));
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.b = ((java.io.InputStream) (obj1));
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.f = ((java.io.OutputStream) (obj));
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.c = true;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.d = true;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.i = Long.valueOf(fzw1.c.longValue());
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        long l = fzw1.r.longValue();
        nnd nnd1;
        boolean flag;
        if (l > 0xffffffff80000000L && l < 0x7fffffffL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        p.b(flag, "Invalid timezone offset");
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = TimeZone.getAvailableIDs((int)l);
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        if (gue1.length <= 0) goto _L2; else goto _L1
_L1:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = TimeZone.getTimeZone(gue1[0]);
_L9:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.j = gue1;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.g = gvm1;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        if (point.equals(obj8))
        {
            break MISSING_BLOCK_LABEL_476;
        }
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.e = true;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        guz1.a();
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        ((FileOutputStream) (obj)).close();
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = (hpe)((ekq)b.b(c, ((ekq) (obj7))).a(((ekg) (obj7)), b).a()).b(hpe);
        if (gue1 != null) goto _L4; else goto _L3
_L3:
        gue1 = "instant";
_L10:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        obj7 = ((fzu)((ekp) (obj6)).a(fzu)).a.g;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        l = ((ekp) (obj6)).d();
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        obj6 = (new nmr(e.a)).a(j).a();
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        nnd1 = new nnd();
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        nnd1.a = Uri.fromFile(file);
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        nnd1.d = gue1;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        nnd1.f = true;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        nnd1.b = ((String) (obj7));
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        nnd1.e = l + 5L;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = ((nmp) (obj6)).a(nnd1.a()).b;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        obj6 = Arrays.asList(new djf[] {
            djf.a(gue1)
        });
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        obj7 = djh.a(c, j, ((java.util.List) (obj6)));
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        ((djh) (obj7)).d();
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        if (!((djh) (obj7)).l()) goto _L6; else goto _L5
_L5:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = String.valueOf(gue1);
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        if (gue1.length() == 0) goto _L8; else goto _L7
_L7:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = "Error reading Media by Id from server.  mediaKey: ".concat(gue1);
_L11:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        throw new eke(gue1);
        obj3;
        gue1 = ((gue) (obj));
        obj = obj2;
        obj2 = obj3;
_L15:
        obj2 = b.a(((Exception) (obj2)));
        if (!file.delete() && i.a())
        {
            noy.a("file", file);
        }
        p.a(((java.io.Closeable) (obj1)));
        p.a(((java.io.Closeable) (obj)));
        p.a(gue1);
        return ((elb) (obj2));
_L2:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = TimeZone.getDefault();
          goto _L9
_L4:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = Long.toString(((hpe) (gue1)).a.b.longValue());
          goto _L10
_L8:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = new String("Error reading Media by Id from server.  mediaKey: ");
          goto _L11
        gue1;
_L14:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = b.a(gue1);
        if (!file.delete() && i.a())
        {
            noy.a("file", file);
        }
        p.a(((java.io.Closeable) (obj1)));
        p.a(((java.io.Closeable) (obj2)));
        p.a(((java.io.Closeable) (obj)));
        return gue1;
_L6:
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        if (((djh) (obj7)).a.b.length > 0)
        {
            break MISSING_BLOCK_LABEL_1163;
        }
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        throw new eke("MediaItem not found in response");
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        if (((djh) (obj7)).a.c.length > 0)
        {
            break MISSING_BLOCK_LABEL_1206;
        }
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        throw new eke("MediaActor not found in response");
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        qgg aqgg[] = ((djh) (obj7)).a.b;
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        obj7 = ((djh) (obj7)).a.c[0];
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        g.a(j, aqgg, new qgi[0], ((qfu) (obj7)), true);
        fileoutputstream = ((FileOutputStream) (obj));
        obj5 = obj2;
        obj3 = obj1;
        gue1 = b.b(gue1);
        if (!file.delete() && i.a())
        {
            noy.a("file", file);
        }
        p.a(((java.io.Closeable) (obj1)));
        p.a(((java.io.Closeable) (obj2)));
        p.a(((java.io.Closeable) (obj)));
        return gue1;
        gue1;
        obj = null;
        obj2 = null;
        obj1 = null;
_L13:
        if (!file.delete() && i.a())
        {
            noy.a("file", file);
        }
        p.a(((java.io.Closeable) (obj1)));
        p.a(((java.io.Closeable) (obj2)));
        p.a(((java.io.Closeable) (obj)));
        throw gue1;
        gue1;
        obj = null;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        gue1;
        obj = null;
        continue; /* Loop/switch isn't completed */
        gue1;
        obj = fileoutputstream;
        obj2 = obj5;
        obj1 = obj3;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj2 = gue1;
        Object obj4 = obj;
        gue1 = exception;
        obj = obj2;
        obj2 = obj4;
        if (true) goto _L13; else goto _L12
_L12:
        gue1;
        obj = null;
        obj2 = null;
        obj1 = null;
          goto _L14
        gue1;
        obj = null;
        obj1 = null;
          goto _L14
        gue1;
        obj = null;
          goto _L14
        gue1;
        obj = null;
        obj2 = null;
        obj1 = null;
          goto _L14
        gue1;
        obj = null;
        obj1 = null;
          goto _L14
        gue1;
        obj = null;
          goto _L14
        gue1;
        obj = null;
        obj2 = null;
        obj1 = null;
          goto _L14
        gue1;
        obj = null;
        obj1 = null;
          goto _L14
        gue1;
        obj = null;
          goto _L14
        obj2;
        gue1 = null;
        obj = null;
        obj1 = null;
          goto _L15
        nmj nmj1;
        nmj1;
        gue1 = null;
        obj1 = null;
        obj = obj2;
        obj2 = nmj1;
          goto _L15
        nmj1;
        gue1 = null;
        obj = obj2;
        obj2 = nmj1;
          goto _L15
        gue1;
          goto _L14
        gue1;
          goto _L14
    }

}

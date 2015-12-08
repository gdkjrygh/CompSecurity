// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.UUID;

public class gvs
{

    private final Context a;
    private final ContentResolver b;
    private final gur c;
    private final gbd d;
    private final gva e;
    private final izo f;
    private final gvk g;
    private final gvg h;
    private final gvf i;
    private final gvz j;
    private final gvy k;
    private final gvt l;
    private final gvx m;
    private final hdu n;

    gvs(Context context)
    {
        this(context, context.getContentResolver(), new gvy(), new gvt(), new gvx());
    }

    private gvs(Context context, ContentResolver contentresolver, gvy gvy1, gvt gvt1, gvx gvx1)
    {
        a = context;
        b = contentresolver;
        c = (gur)olm.a(context, gur);
        d = (gbd)olm.a(context, gbd);
        e = (gva)olm.a(context, gva);
        f = (izo)olm.a(context, izo);
        g = (gvk)olm.a(context, gvk);
        i = (gvf)olm.a(context, gvf);
        h = (gvg)olm.a(context, gvg);
        j = (gvz)olm.a(context, gvz);
        n = (hdu)olm.a(context, hdu);
        k = gvy1;
        l = gvt1;
        m = gvx1;
    }

    private Uri a(Uri uri, Uri uri1)
    {
        Uri uri2;
        Uri uri3;
        Uri uri4;
        Object obj;
        Object obj1;
        uri4 = null;
        uri2 = null;
        obj = null;
        uri3 = null;
        String s = f.a(uri);
        obj1 = String.valueOf(UUID.randomUUID().toString());
        obj1 = Uri.fromFile(new File((new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(obj1).length())).append(s).append(((String) (obj1))).append(".tmp").toString()));
        Point point;
        Point point1;
        gvm gvm1;
        point = b.a(b, uri1);
        point1 = b.a(b, uri);
        gvm1 = new gvm(point.x, point.y);
        uri = b.openInputStream(uri);
        IOException ioexception;
        OutputStream outputstream;
        guz guz1;
        try
        {
            uri1 = b.openInputStream(uri1);
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            uri2 = null;
            uri1 = uri3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            uri3 = null;
        }
        uri2 = uri1;
        uri1 = uri4;
        uri3 = uri2;
        uri4 = uri;
        outputstream = b.openOutputStream(((Uri) (obj1)));
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1 = e.a();
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1.a = uri;
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1.b = uri2;
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1.f = outputstream;
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1.h = "Google";
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1.c = true;
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1.d = true;
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1.g = gvm1;
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        if (point.equals(point1))
        {
            break MISSING_BLOCK_LABEL_369;
        }
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1.e = true;
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        guz1.a();
        uri1 = outputstream;
        uri3 = uri2;
        uri4 = uri;
        obj = outputstream;
        outputstream.close();
        p.a(uri);
        p.a(uri2);
        p.a(outputstream);
        return ((Uri) (obj1));
        ioexception;
        uri2 = null;
        uri = null;
        uri1 = uri3;
_L4:
        uri3 = uri2;
        uri4 = uri;
        throw new gwa("Failed to make temp copy", ioexception);
        obj;
        uri = uri4;
        uri2 = uri1;
        uri1 = ((Uri) (obj));
_L2:
        p.a(uri);
        p.a(uri3);
        p.a(uri2);
        throw uri1;
        uri1;
        uri3 = null;
        uri = null;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
        ioexception;
        uri1 = ((Uri) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private gum a(gum gum, Uri uri)
    {
        Uri uri1;
        Uri uri2;
        uri2 = null;
        uri1 = null;
        uri = b.openInputStream(uri);
        uri1 = uri;
        uri2 = uri;
        nkp nkp1 = nkp.b(uri);
        p.a(uri);
        gum = (new guo()).a(gum);
        gum.e = nkp1.b();
        return gum.a();
        gum;
        uri2 = uri1;
        throw new gwa("Failed to calculate fingerprint", gum);
        gum;
        p.a(uri2);
        throw gum;
    }

    static gvf a(gvs gvs1)
    {
        return gvs1.i;
    }

    private gvi a(Uri uri)
    {
        gvi gvi1;
        try
        {
            uri = b.a(b, uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new gwa("Failed to get image bounds", uri);
        }
        uri = new gvm(((Point) (uri)).x, ((Point) (uri)).y);
        gvi1 = g.a();
        gvi1.a = uri;
        gvi1.b = true;
        return gvi1;
    }

    private static gvu a(gvl gvl1, gvu gvu1, gvi gvi1)
    {
        if (gvl1 == gvl.a)
        {
            try
            {
                gvl1 = gvi1.a(gvu1.a, gvu1.b, euv.b);
            }
            // Misplaced declaration of an exception variable
            catch (gvl gvl1)
            {
                throw new gwa("Failed to insert new media into media store", gvl1);
            }
            gvi1 = (new guo()).a(gvu1.c);
            gvi1.a = -1L;
            gvi1.d = gvl1;
            gvi1 = gvi1.a();
            gvu1.a = gvl1;
            gvu1.c = gvi1;
        }
        return gvu1;
    }

    static izo b(gvs gvs1)
    {
        return gvs1.f;
    }

    public final ekp a(gue gue1, Uri uri)
    {
        int i1 = gue1.a;
        ekp ekp1 = gue1.c;
        n.a(gue1.a, Collections.singletonList(uri));
        if (gue1.h == gvl.b)
        {
            return ekp1;
        } else
        {
            gue1 = gue1.b;
            hpm hpm1 = new hpm();
            hpm1.b = uri.toString();
            uri = hpm1.a();
            return gvx.a(a, i1, gue1, uri);
        }
    }

    public final gvv a(gue gue1)
    {
        Object obj;
        Object obj1;
        Uri uri;
        Object obj2;
        gvu gvu2;
        File file;
        int i1;
        obj = j.a(gue1);
        i1 = gue1.a;
        uri = Uri.parse(((hpg)gue1.c.a(hpg)).c().a);
        obj1 = gue1.e;
        obj2 = j.a(((gum) (obj)), gue1);
        obj = a(uri, ((Uri) (obj1)));
        obj2 = a(((gum) (obj2)), ((Uri) (obj)));
        obj1 = a(((Uri) (obj1)));
        gvu2 = new gvu(this, uri, gue1.h, ((gum) (obj2)));
        uri = gvu2.b;
        boolean flag = "file".equals(((Uri) (obj)).getScheme());
        obj2 = String.valueOf(obj);
        p.a(flag, (new StringBuilder(String.valueOf(obj2).length() + 30)).append("tempUri must point to a file: ").append(((String) (obj2))).toString());
        flag = "file".equals(uri.getScheme());
        obj2 = String.valueOf(uri);
        p.a(flag, (new StringBuilder(String.valueOf(obj2).length() + 32)).append("outputUri must point to a file: ").append(((String) (obj2))).toString());
        file = new File(uri.getPath());
        if (file.exists() && !file.delete())
        {
            gue1 = String.valueOf(uri);
            throw new gwa((new StringBuilder(String.valueOf(gue1).length() + 29)).append("Failed to delete output file ").append(gue1).toString());
        }
        obj2 = new File(((Uri) (obj)).getPath());
        if (!((File) (obj2)).renameTo(file))
        {
            gue1 = String.valueOf("Could not rename temp file to output file. tempUri: ");
            obj = String.valueOf(obj);
            obj1 = String.valueOf(uri);
            throw new gwa((new StringBuilder(String.valueOf(gue1).length() + 12 + String.valueOf(obj).length() + String.valueOf(obj1).length())).append(gue1).append(((String) (obj))).append(" outputUri: ").append(((String) (obj1))).toString());
        }
        break MISSING_BLOCK_LABEL_403;
        gue1;
        ((File) (obj2)).delete();
        throw gue1;
        ((File) (obj2)).delete();
        gvu gvu1 = a(gue1.h, gvu2, ((gvi) (obj1)));
        gvu1.c = c.a(i1, gvu1.c);
        Uri uri1;
        try
        {
            h.a(gvu1.a);
        }
        // Misplaced declaration of an exception variable
        catch (gue gue1)
        {
            throw new gwa("Failed to update thumbnail", gue1);
        }
        uri1 = gvu1.a;
        if (gue1.h == gvl.b)
        {
            d.b(uri1.toString());
            try
            {
                ((gvi) (obj1)).a(uri1, euv.b);
            }
            // Misplaced declaration of an exception variable
            catch (gue gue1)
            {
                throw new gwa("Failed to update media store", gue1);
            }
        }
        return new gvv(gvu1.a, gvu1.c);
    }

    public final ekp b(gue gue1)
    {
        Object obj = new gwb(a, gue1);
        obj = new dim(a, "com.google.android.apps.photos.photoeditor.save.LocalMediaSaver", gue1.a, ((dir) (obj)));
        obj = mtj.b(a, ((mtf) (obj)));
        if (((mue) (obj)).c())
        {
            throw new gwa("Failed to save", ((mue) (obj)).c);
        }
        obj = (Uri)((mue) (obj)).a().get("MEDIA_LOCAL_URI");
        if (obj != null)
        {
            return a(gue1, ((Uri) (obj)));
        } else
        {
            return gue1.c;
        }
    }
}

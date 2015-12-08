// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gvi
{

    public gvm a;
    public boolean b;
    private final Context c;
    private final ContentResolver d;
    private final muz e;
    private final gvf f;
    private final noz g;
    private final noz h;

    public gvi(Context context)
    {
        this(context, context.getContentResolver());
    }

    private gvi(Context context, ContentResolver contentresolver)
    {
        c = context;
        d = contentresolver;
        e = (muz)olm.a(context, muz);
        f = (gvf)olm.a(context, gvf);
        g = noz.a(context, 3, "MediaStoreWriter", new String[0]);
        h = noz.a(context, "MediaStoreWriter", new String[0]);
    }

    private static long a(String s)
    {
        return (new File(s)).length();
    }

    private Uri a(gvb gvb1, Uri uri)
    {
        Object obj;
        boolean flag;
        if (a == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "ImageSize does not apply to video");
        obj = new MediaMetadataRetriever();
        ((MediaMetadataRetriever) (obj)).setDataSource(c, uri);
        a(gvb1, ((MediaMetadataRetriever) (obj)));
        uri = ((MediaMetadataRetriever) (obj)).extractMetadata(23);
        if (uri != null)
        {
            Matcher matcher = Pattern.compile("(-?[0-9]+\\.[0-9]+)\\+(-?[0-9]+\\.[0-9]+)").matcher(uri);
            if (matcher.groupCount() == 2)
            {
                try
                {
                    gvb1.a(Double.parseDouble(matcher.group(2)), Double.parseDouble(matcher.group(1)));
                }
                catch (NumberFormatException numberformatexception)
                {
                    if (g.a())
                    {
                        uri = String.valueOf(uri);
                        if (uri.length() != 0)
                        {
                            "Failed to parse lat/long: ".concat(uri);
                        } else
                        {
                            new String("Failed to parse lat/long: ");
                        }
                    }
                }
            }
        }
        uri = ((MediaMetadataRetriever) (obj)).extractMetadata(18);
        obj = ((MediaMetadataRetriever) (obj)).extractMetadata(19);
        try
        {
            gvb1.a(Integer.parseInt(uri), Integer.parseInt(((String) (obj))));
        }
        catch (NumberFormatException numberformatexception1)
        {
            if (g.a())
            {
                (new StringBuilder(String.valueOf(uri).length() + 31 + String.valueOf(obj).length())).append("Failed to parse width/height: ").append(uri).append("/").append(((String) (obj)));
            }
        }
        gvb1.a("video/mpeg");
        return b.a(d, gvb1.a, true);
    }

    private void a(gvb gvb1, MediaMetadataRetriever mediametadataretriever)
    {
        mediametadataretriever = mediametadataretriever.extractMetadata(9);
        gvb1.d(Long.parseLong(mediametadataretriever));
_L1:
        return;
        gvb1;
        if (g.a())
        {
            gvb1 = String.valueOf(mediametadataretriever);
            if (gvb1.length() != 0)
            {
                "Failed to parse duration: ".concat(gvb1);
                return;
            } else
            {
                new String("Failed to parse duration: ");
                return;
            }
        }
          goto _L1
    }

    public final Uri a(Uri uri, Uri uri1, euv euv1)
    {
        gvb gvb1;
        gvb1 = gvb.a(euv1);
        Object obj = d;
        long l = b.a(((ContentResolver) (obj)), uri, "datetaken", 0L);
        Object obj1;
        String s;
        String s1;
        int i;
        long l1;
        long l2;
        if (l > 0L)
        {
            l = b.b(l);
        } else
        {
            l = b.a(((ContentResolver) (obj)), uri, "date_added", 0L);
            if (l > 0L)
            {
                l = b.b(l);
            } else
            {
                l = b.a(((ContentResolver) (obj)), uri, "date_modified", 0L);
                if (l > 0L)
                {
                    l = b.b(l);
                } else
                {
                    l = b.b(System.currentTimeMillis());
                }
            }
        }
        obj1 = Long.valueOf(l);
        l = TimeUnit.MILLISECONDS.toSeconds(e.a());
        obj = obj1;
        if (obj1 == null)
        {
            obj = Long.valueOf(l);
        }
        l1 = ((Long) (obj)).longValue();
        l2 = ((Long) (obj)).longValue();
        gvb1.a.put("date_added", Long.valueOf(l2));
        gvb1.b(l).c(l1 + 5L);
        p.a("file".equals(uri1.getScheme()), "mediaFileUri must be a File Uri");
        s = uri1.getPath();
        obj = new File(s);
        s1 = ((File) (obj)).getName();
        obj1 = ((File) (obj)).getName();
        i = ((String) (obj1)).lastIndexOf('.');
        obj = obj1;
        if (i != -1)
        {
            obj = ((String) (obj1)).substring(0, i);
        }
        obj1 = gvb1.a(a(s));
        ((gvb) (obj1)).a.put("title", ((String) (obj)));
        ((gvb) (obj1)).a.put("_display_name", s1);
        ((gvb) (obj1)).a.put("_data", s);
        gvj.a[euv1.ordinal()];
        JVM INSTR tableswitch 1 2: default 280
    //                   1 391
    //                   2 605;
           goto _L1 _L2 _L3
_L1:
        uri = String.valueOf(euv1);
        throw new UnsupportedOperationException((new StringBuilder(String.valueOf(uri).length() + 24)).append("Unsupported media type: ").append(uri).toString());
_L2:
        mxm mxm1;
        p.a(oql.b(uri), "originalUri must be a MediaStore Uri");
        mxm1 = new mxm();
        uri1 = null;
        euv1 = d.openInputStream(uri);
        uri1 = euv1;
        mxm1.a(euv1);
_L5:
        p.a(euv1);
        int j;
        boolean flag;
        if (b)
        {
            j = 0;
        } else
        {
            uri = mxm1.d(mxm.g);
            short word0;
            if (uri == null)
            {
                word0 = 0;
            } else
            {
                word0 = uri.shortValue();
            }
            j = mxm.b(word0);
        }
        gvb1.a(j);
        uri = mxm1.c();
        if (uri != null)
        {
            gvb1.a(uri[0], uri[1]);
        }
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must set image size");
        gvb1.a(a.a, a.b).a("image/jpeg");
        return b.a(d, gvb1.a, false);
        uri1;
        uri1 = euv1;
        if (!h.a())
        {
            continue; /* Loop/switch isn't completed */
        }
        uri1 = euv1;
        noy.a("uri", uri);
        continue; /* Loop/switch isn't completed */
        uri;
        p.a(uri1);
        throw uri;
_L3:
        return a(gvb1, uri1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(Uri uri, euv euv1)
    {
        String s;
        gvb gvb1;
        p.a(oql.b(uri), "mediaStoreUri must be a MediaStore Uri");
        long l = TimeUnit.MILLISECONDS.toSeconds(e.a());
        s = f.b(uri);
        gvb1 = gvb.a(euv1).a(a(s)).b(l);
        gvj.a[euv1.ordinal()];
        JVM INSTR tableswitch 1 2: default 84
    //                   1 127
    //                   2 208;
           goto _L1 _L2 _L3
_L1:
        uri = String.valueOf(euv1);
        throw new UnsupportedOperationException((new StringBuilder(String.valueOf(uri).length() + 24)).append("Unsupported media type: ").append(uri).toString());
_L2:
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must set image size");
        gvb1.a("image/jpeg").a(a.a, a.b);
        if (b)
        {
            gvb1.a(0);
        }
_L5:
        d.update(uri, gvb1.a, null, null);
        return;
_L3:
        euv1 = new MediaMetadataRetriever();
        euv1.setDataSource(s);
        a(gvb1, ((MediaMetadataRetriever) (euv1)));
        gvb1.a("video/mpeg");
        if (true) goto _L5; else goto _L4
_L4:
    }
}

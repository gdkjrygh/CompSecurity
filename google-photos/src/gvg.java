// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Locale;

public class gvg
{

    private final Context a;
    private final ContentResolver b;

    public gvg(Context context)
    {
        ContentResolver contentresolver = context.getContentResolver();
        if (b.GJ == 0)
        {
            b.GJ = context.getResources().getDimensionPixelSize(b.GK);
        }
        this(context, contentresolver, b.GJ);
    }

    private gvg(Context context, ContentResolver contentresolver, int i)
    {
        a = context;
        b = contentresolver;
    }

    private String b(Uri uri)
    {
        Cursor cursor = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(b, ContentUris.parseId(uri), 1, null);
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        uri = cursor.getString(cursor.getColumnIndex("_data"));
        cursor.close();
        return uri;
        uri = String.valueOf(uri);
        throw new FileNotFoundException((new StringBuilder(String.valueOf(uri).length() + 56)).append("Could not find image thumbnail in MediaStore. ImageUri: ").append(uri).toString());
        uri;
        cursor.close();
        throw uri;
    }

    private String c(Uri uri)
    {
        Object obj;
        obj = String.format(Locale.ENGLISH, "%s = %d AND %s = %d", new Object[] {
            "video_id", Long.valueOf(ContentUris.parseId(uri)), "kind", Integer.valueOf(1)
        });
        obj = b.query(android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, null, ((String) (obj)), null, null);
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        uri = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("_data"));
        ((Cursor) (obj)).close();
        return uri;
        uri = String.valueOf(uri);
        throw new FileNotFoundException((new StringBuilder(String.valueOf(uri).length() + 56)).append("Could not find video thumbnail in MediaStore. VideoUri: ").append(uri).toString());
        uri;
        ((Cursor) (obj)).close();
        throw uri;
    }

    public final void a(Uri uri)
    {
        Object obj;
        euv euv1;
        obj = null;
        String s;
        boolean flag;
        if (!b.c(uri))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "mediaUri must be non-empty");
        p.a(b.h(uri), "mediaUri must be a MediaStore Uri");
        euv1 = ejv.d(oql.b(b, uri));
        if (euv1 == euv.b || euv1 == euv.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = String.valueOf(euv1);
        p.a(flag, (new StringBuilder(String.valueOf(s).length() + 19)).append("Unexpected avType: ").append(s).toString());
        gvh.a[euv1.ordinal()];
        JVM INSTR tableswitch 1 2: default 132
    //                   1 187
    //                   2 338;
           goto _L1 _L2 _L3
_L1:
        uri = String.valueOf(euv1);
        throw new UnsupportedOperationException((new StringBuilder(String.valueOf(uri).length() + 20)).append("Unsupported AvType: ").append(uri).toString());
_L2:
        b.delete(android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, "image_id = ?", new String[] {
            Long.toString(ContentUris.parseId(uri))
        });
_L7:
        Bitmap bitmap = b.a(a, uri, null);
        Bitmap bitmap1 = b.a(a.getContentResolver(), uri, bitmap);
        gvh.a[euv1.ordinal()];
        JVM INSTR tableswitch 1 2: default 467
    //                   1 368
    //                   2 438;
           goto _L4 _L5 _L6
_L4:
        uri = String.valueOf(euv1);
        throw new UnsupportedOperationException((new StringBuilder(String.valueOf(uri).length() + 20)).append("Unsupported AvType: ").append(uri).toString());
        uri;
        obj = bitmap1;
_L9:
        if (bitmap != null && bitmap != obj)
        {
            bitmap.recycle();
        }
        if (obj != null)
        {
            ((Bitmap) (obj)).recycle();
        }
        throw uri;
_L3:
        b.delete(android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, "video_id = ?", new String[] {
            Long.toString(ContentUris.parseId(uri))
        });
          goto _L7
_L5:
        uri = b(uri);
_L8:
        obj = b.openOutputStream(Uri.fromFile(new File(uri)));
        bitmap1.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, ((OutputStream) (obj)));
        ((OutputStream) (obj)).close();
        p.a(((java.io.Closeable) (obj)));
        if (bitmap != null && bitmap != bitmap1)
        {
            bitmap.recycle();
        }
        if (bitmap1 != null)
        {
            bitmap1.recycle();
        }
        return;
_L6:
        uri = c(uri);
          goto _L8
_L10:
        p.a(((java.io.Closeable) (obj)));
        throw uri;
        uri;
        bitmap = null;
          goto _L9
        uri;
          goto _L9
        uri;
          goto _L10
        uri;
        obj = null;
          goto _L10
    }
}

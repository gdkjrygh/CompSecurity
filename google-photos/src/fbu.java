// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class fbu
    implements fci
{

    private static final List a;
    private static final String b[] = {
        "_id", "_size", "_data"
    };
    private final noz c;
    private final ContentResolver d;

    public fbu(Context context)
    {
        d = context.getContentResolver();
        c = noz.a(context, 5, "PhotosDeviceMgmt", new String[0]);
    }

    private Point a(Uri uri)
    {
label0:
        {
label1:
            {
                Point point;
                int i;
                try
                {
                    point = b.a(d, uri);
                    if (point.x <= 0)
                    {
                        break label1;
                    }
                    i = point.y;
                }
                catch (IOException ioexception)
                {
                    if (c.a())
                    {
                        noy.a("entryUri", uri);
                    }
                    return null;
                }
                uri = point;
                if (i > 0)
                {
                    break label0;
                }
            }
            uri = null;
        }
        return uri;
    }

    private void a(Uri uri, Cursor cursor, long l, List list)
    {
        int i = cursor.getColumnIndexOrThrow("_id");
        int j = cursor.getColumnIndexOrThrow("_size");
        int k = cursor.getColumnIndexOrThrow("_data");
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            Uri uri1 = ContentUris.withAppendedId(uri, cursor.getLong(i));
            long l1 = cursor.getLong(j);
            String s = cursor.getString(k);
            if (!TextUtils.isEmpty(s))
            {
                long l2 = (new File(s)).lastModified();
                if (l2 <= l)
                {
                    Point point = null;
                    fck fck1;
                    if (!oql.c(uri1))
                    {
                        fck1 = fck.a;
                        point = a(uri1);
                    } else
                    {
                        fck1 = fck.b;
                    }
                    list.add(new fbs(uri1.toString(), s, l1, l2, fck1, point));
                }
            }
        } while (true);
    }

    public final List a(long l)
    {
        Object obj;
        Iterator iterator;
        long l1;
        obj = new ArrayList();
        l1 = System.currentTimeMillis();
        iterator = a.iterator();
_L2:
        Cursor cursor;
        Uri uri;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_99;
            }
            uri = (Uri)iterator.next();
            cursor = d.query(uri, b, null, null, null);
        } while (cursor == null);
        a(uri, cursor, l1 - l, ((List) (obj)));
        cursor.close();
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        cursor.close();
        throw obj;
        return ((List) (obj));
    }

    public final boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public final long b()
    {
        return Environment.getExternalStorageDirectory().getFreeSpace();
    }

    static 
    {
        a = Collections.unmodifiableList(Arrays.asList(new Uri[] {
            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI, android.provider.MediaStore.Video.Media.INTERNAL_CONTENT_URI
        }));
    }
}

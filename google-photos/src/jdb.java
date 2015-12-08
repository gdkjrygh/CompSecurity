// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class jdb extends mtf
{

    private static final String a[] = {
        "mime_type", "_size"
    };
    private final List b;

    public jdb(List list)
    {
        super("com.google.android.apps.photos.uploadtoalbum.GetContentMetadataTask");
        Iterator iterator;
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Must provide non-empty uriList");
        iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            Uri uri = (Uri)iterator.next();
            if (!b.c(uri) && ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "Uris must all have scheme content or file");
        }
        b = list;
    }

    private static jdc a(ContentResolver contentresolver, Uri uri)
    {
        Object obj = null;
        uri = contentresolver.query(uri, a, null, null, null);
        if (uri == null) goto _L2; else goto _L1
_L1:
        if (!uri.moveToFirst()) goto _L2; else goto _L3
_L3:
        int i = uri.getColumnIndex("mime_type");
        contentresolver = obj;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        contentresolver = uri.getString(i);
        i = uri.getColumnIndex("_size");
        if (i < 0) goto _L5; else goto _L4
_L4:
        long l = uri.getLong(i);
_L8:
        if (uri != null)
        {
            uri.close();
        }
        uri = contentresolver;
        if (TextUtils.isEmpty(contentresolver))
        {
            uri = "image/jpeg";
        }
        return new jdc(uri, l);
        contentresolver;
        uri = null;
_L6:
        if (uri != null)
        {
            uri.close();
        }
        throw contentresolver;
        contentresolver;
        if (true) goto _L6; else goto _L5
_L5:
        l = 0L;
        continue; /* Loop/switch isn't completed */
_L2:
        l = 0L;
        contentresolver = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final mue a(Context context)
    {
        int i;
        int j;
        long l;
        context = context.getContentResolver();
        Iterator iterator;
        jdc jdc1;
        long l1;
        try
        {
            iterator = b.iterator();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        l = 0L;
        j = 0;
        i = 0;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        jdc1 = a(((ContentResolver) (context)), (Uri)iterator.next());
        if (ejv.b(jdc1.a))
        {
            i++;
        } else
        {
            j++;
        }
        l1 = jdc1.b;
        l = l1 + l;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_24;
_L1:
        context = new mue(true);
        Bundle bundle = context.a();
        bundle.putInt("num_photos", j);
        bundle.putInt("num_videos", i);
        bundle.putLong("total_bytes", l);
        return context;
    }

}

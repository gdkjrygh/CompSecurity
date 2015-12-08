// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.aviary.android.feather.common.utils.d;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.cds:
//            d, h, f

static class .a.c extends .a.c
{

    public String a(Context context, long l, boolean flag)
        throws IOException, AssertionError
    {
        Object obj2;
        String s1;
        Assert.assertNotNull("null context", context);
        .a.c c = h.b(context);
        Assert.assertNotNull("null manifest", c);
        s1 = c.b();
        Assert.assertNotNull("null baseUrl", s1);
        obj2 = context.getContentResolver().query(h.b(context, (new StringBuilder()).append("pack/id/").append(l).append("/content").toString()), new String[] {
            "pack_id", "pack_identifier", "pack_type", "content_id", "content_packId", "content_previewURL"
        }, null, null, null);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        if (!((Cursor) (obj2)).moveToFirst()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = a(((Cursor) (obj2)));
        obj = a(((Cursor) (obj2)));
_L3:
        com.aviary.android.feather.common.utils.d.a(((Cursor) (obj2)));
_L4:
        Assert.assertNotNull("null pack", obj1);
        Assert.assertNotNull("null context", obj);
        String s = ((l) (obj)).d();
        obj2 = s;
        if (!TextUtils.isEmpty(s))
        {
            obj2 = s;
            if (!s.startsWith("http://"))
            {
                obj2 = s;
                if (!s.startsWith("https://"))
                {
                    obj2 = (new StringBuilder()).append(s1).append(s).toString();
                }
            }
        }
        d.a.b("previewUrl: %s", new Object[] {
            obj2
        });
        s = ((.b) (obj1)).a();
        obj1 = ((a) (obj1)).b();
        long l1 = ((b) (obj)).p();
        obj2 = com.aviary.android.feather.common.utils.d.a(((String) (obj2)), null);
        s = h.e(s);
        obj = new File(context.getFilesDir(), s);
        ((File) (obj)).mkdirs();
        Assert.assertTrue((new StringBuilder()).append("failed to create dest folder: ").append(s).toString(), ((File) (obj)).isDirectory());
        ((File) (obj)).setReadable(true, false);
        com.aviary.android.feather.common.utils.d.a(((java.io.InputStream) (obj2)), ((File) (obj)));
        com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj2)));
        obj1 = valueOf(((String) (obj1)).toUpperCase(Locale.US));
        Assert.assertTrue("invalid preview content", f.a(a, ((a) (obj1))).a(context, l, ((File) (obj)), false));
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("content_previewPath", ((File) (obj)).getAbsolutePath());
        d.a.a((new StringBuilder()).append("updating: ").append(l).append(", ").append(l1).toString());
        d.a.a((new StringBuilder()).append("destFolder: ").append(((File) (obj)).getAbsolutePath()).toString());
        boolean flag1;
        if (context.getContentResolver().update(h.b(context, (new StringBuilder()).append("pack/id/").append(l).append("/content/id/").append(l1).append("/update").toString()), ((ContentValues) (obj1)), null, null) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assert.assertTrue("failed to update the provider", flag1);
        if (flag)
        {
            h.g(context, l);
        }
        return ((File) (obj)).getAbsolutePath();
        context;
        com.aviary.android.feather.common.utils.d.a(((Cursor) (obj2)));
        throw context;
_L2:
        obj = null;
        obj1 = null;
          goto _L3
        obj = null;
        obj1 = null;
          goto _L4
    }

    .a.c()
    {
    }
}

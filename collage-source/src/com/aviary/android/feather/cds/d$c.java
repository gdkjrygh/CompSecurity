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
import java.io.FileOutputStream;
import java.io.IOException;
import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.cds:
//            d, h

static class .a.c extends .a.c
{

    public String a(Context context, long l, boolean flag)
        throws IOException, AssertionError
    {
        Object obj;
        Object obj2;
        Assert.assertNotNull("null context", context);
        .a.c c1 = h.b(context);
        Assert.assertNotNull("null manifest", c1);
        obj2 = c1.b();
        Assert.assertNotNull("null baseUrl", obj2);
        obj = context.getContentResolver().query(h.b(context, (new StringBuilder()).append("message/id/").append(l).append("/content").toString()), new String[] {
            "msg_id", "msg_identifier", "msg_type", "msgcnt_id", "msgcnt_messageId", "msgcnt_contentURL"
        }, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
        .a.c c2;
        .a.c c3;
        c3 = a(((Cursor) (obj)));
        c2 = a(((Cursor) (obj)));
_L3:
        d.a(((Cursor) (obj)));
_L4:
        Assert.assertNotNull("message is null", c3);
        Assert.assertNotNull("messageContent is null", c2);
        Object obj1 = c2.a();
        obj = obj1;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            obj = obj1;
            if (!((String) (obj1)).startsWith("http://"))
            {
                obj = obj1;
                if (!((String) (obj1)).startsWith("https://"))
                {
                    obj = (new StringBuilder()).append(((String) (obj2))).append(((String) (obj1))).toString();
                }
            }
        }
        d.a.b("messageUrl: %s", new Object[] {
            obj
        });
        obj1 = c3.c();
        obj = d.a(((String) (obj)), null);
        obj1 = h.b(((String) (obj1)));
        obj2 = new File(context.getFilesDir(), ((String) (obj1)));
        ((File) (obj2)).mkdirs();
        Assert.assertTrue((new StringBuilder()).append("failed to create dest folder: ").append(((String) (obj1))).toString(), ((File) (obj2)).isDirectory());
        ((File) (obj2)).setReadable(true, false);
        obj1 = File.createTempFile("message_", ".jpg", ((File) (obj2)));
        obj2 = new FileOutputStream(((File) (obj1)));
        d.a(((java.io.InputStream) (obj)), ((java.io.OutputStream) (obj2)));
        d.a(((java.io.Closeable) (obj)));
        d.a(((java.io.Closeable) (obj2)));
        obj = new ContentValues();
        ((ContentValues) (obj)).put("msgcnt_contentPath", ((File) (obj1)).getAbsolutePath());
        d.a.a((new StringBuilder()).append("updating: ").append(c3.p()).append(", ").append(c2.p()).toString());
        boolean flag1;
        if (context.getContentResolver().update(h.b(context, (new StringBuilder()).append("message/id/").append(c3.p()).append("/content/id/").append(c2.p()).append("/update").toString()), ((ContentValues) (obj)), null, null) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assert.assertTrue("failed to update the provider", flag1);
        if (flag)
        {
            h.f(context, l);
        }
        return ((File) (obj1)).getAbsolutePath();
        context;
        d.a(((Cursor) (obj)));
        throw context;
_L2:
        c2 = null;
        c3 = null;
          goto _L3
        c2 = null;
        c3 = null;
          goto _L4
    }

    .a.c()
    {
    }
}

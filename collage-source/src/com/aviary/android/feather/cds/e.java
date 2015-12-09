// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.aviary.android.feather.common.utils.d;
import java.io.File;
import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.cds:
//            h, a

final class e extends f.a
{

    public e(a.b b)
    {
        super(b);
    }

    public boolean a(Context context, long l, File file, boolean flag)
    {
        String s;
        boolean flag1;
        flag1 = false;
        Assert.assertNotNull("input dir is null", file);
        Assert.assertNotNull("context is null", context);
        context = context.getContentResolver().query(h.b(context, (new StringBuilder()).append("pack/").append(l).append("/item/list").toString()), new String[] {
            "item_id", "item_identifier"
        }, null, null, null);
        Assert.assertNotNull("cursor is null", context);
        s = com.aviary.android.feather.cds.a.a(c);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        int i = context.getColumnIndex("item_identifier");
        if (i > -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue("index column < 0", flag);
        flag = flag1;
        if (context.getCount() > 0)
        {
            flag = true;
        }
        Assert.assertTrue("cursor is empty", flag);
        String s1;
        for (; context.moveToNext(); Assert.assertTrue("file does not exists", (new File(file, (new StringBuilder()).append(s1).append(s).toString())).exists()))
        {
            s1 = context.getString(i);
            Assert.assertNotNull("identifier is null", s1);
        }

        break MISSING_BLOCK_LABEL_218;
        file;
        d.a(context);
        throw file;
        d.a(context);
        return true;
        return false;
    }
}

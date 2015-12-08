// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.aviary.android.feather.common.utils.d;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.cds:
//            h

class com.aviary.android.feather.cds.b extends f.a
{
    static abstract class a
    {

        abstract boolean a(String s, List list)
            throws AssertionError;

        abstract boolean a(String s, ZipFile zipfile)
            throws AssertionError;

        a()
        {
        }
    }

    static class b extends a
    {

        boolean a(String s, List list)
            throws AssertionError
        {
            return list.contains((new StringBuilder()).append(s).append(".json").toString());
        }

        boolean a(String s, ZipFile zipfile)
            throws AssertionError
        {
            Assert.assertNotNull("identifier is null", s);
            Assert.assertNotNull("zip is null", zipfile);
            zipfile = zipfile.getEntry((new StringBuilder()).append(s).append(".json").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append(".json").toString(), zipfile);
            return true;
        }

        b()
        {
        }
    }

    static class c extends a
    {

        boolean a(String s, List list)
            throws AssertionError
        {
            while (!list.contains((new StringBuilder()).append(s).append("-small.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-br-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-r-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-tr-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-t-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-tl-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-l-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-b-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-bl-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-br-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-br-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-r-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-tr-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-t-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-tl-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-l-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-b-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-bl-large.png").toString())) 
            {
                return false;
            }
            return list.contains((new StringBuilder()).append(s).append("-br-large.png").toString());
        }

        boolean a(String s, ZipFile zipfile)
        {
            Assert.assertNotNull("identifier is null", s);
            Assert.assertNotNull("zip is null", zipfile);
            java.util.zip.ZipEntry zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-small.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-small.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-br-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-br-medium.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-r-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-r-medium.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-tr-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-tr-medium.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-t-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-t-medium.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-tl-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-tl-medium.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-l-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-l-medium.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-b-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-b-medium.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-bl-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-bl-medium.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-br-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-br-medium.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-br-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-br-large.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-r-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-r-large.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-tr-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-tr-large.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-t-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-t-large.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-tl-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-tl-large.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-l-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-l-large.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-b-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-b-large.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-bl-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-bl-large.png").toString(), zipentry);
            zipfile = zipfile.getEntry((new StringBuilder()).append(s).append("-br-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-br-large.png").toString(), zipfile);
            return true;
        }

        c()
        {
        }
    }

    static class d extends a
    {

        boolean a(String s, List list)
            throws AssertionError
        {
            while (!list.contains((new StringBuilder()).append(s).append("-small.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-medium.png").toString())) 
            {
                return false;
            }
            return list.contains((new StringBuilder()).append(s).append("-large.png").toString());
        }

        boolean a(String s, ZipFile zipfile)
            throws AssertionError
        {
            Assert.assertNotNull("identifier is null", s);
            Assert.assertNotNull("zip is null", zipfile);
            java.util.zip.ZipEntry zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-small.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-small.png").toString(), zipentry);
            zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-medium.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-medium.png").toString(), zipentry);
            zipfile = zipfile.getEntry((new StringBuilder()).append(s).append("-large.png").toString());
            Assert.assertNotNull((new StringBuilder()).append(s).append("-large.png").toString(), zipfile);
            return true;
        }

        d()
        {
        }
    }


    a a;

    public com.aviary.android.feather.cds.b(a.b b1)
    {
        super(b1);
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.aviary.android.feather.cds.a.b.values().length];
                try
                {
                    a[a.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[b1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a = new c();
            return;

        case 2: // '\002'
            a = new b();
            return;

        case 3: // '\003'
            a = new d();
            break;
        }
    }

    public boolean a(Context context, long l, File file, boolean flag)
    {
        List list;
        String s;
        boolean flag1;
        b.b((new StringBuilder()).append("validate: ").append(l).append(", ").append(file.getAbsolutePath()).toString());
        if (flag)
        {
            int i;
            try
            {
                file = new ZipFile(file);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return false;
            }
            list = null;
        } else
        {
            list = Arrays.asList(file.list());
            file = null;
        }
        context = context.getContentResolver().query(h.b(context, (new StringBuilder()).append("pack/").append(l).append("/item/list").toString()), new String[] {
            "item_id", "item_identifier"
        }, null, null, null);
        Assert.assertNotNull("cannot fetch list of items", context);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        i = context.getColumnIndex("item_identifier");
        if (i > -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assert.assertTrue("unable to find identifier column index", flag1);
        if (context.getCount() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assert.assertTrue("item cursor has '0' rows", flag1);
_L2:
        if (!context.moveToNext())
        {
            break MISSING_BLOCK_LABEL_351;
        }
        s = context.getString(i);
        Assert.assertNotNull("identifier is null", s);
        b.b("checking.. %s", new Object[] {
            s
        });
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a.a(s, file)) goto _L2; else goto _L1
_L1:
        b.e("failed to validate %s", new Object[] {
            s
        });
        com.aviary.android.feather.common.utils.d.a(context);
        com.aviary.android.feather.common.utils.d.a(file);
        return false;
        if (a.a(s, list)) goto _L2; else goto _L3
_L3:
        b.e("failed to validate %s", new Object[] {
            s
        });
        com.aviary.android.feather.common.utils.d.a(context);
        com.aviary.android.feather.common.utils.d.a(file);
        return false;
        com.aviary.android.feather.common.utils.d.a(context);
        com.aviary.android.feather.common.utils.d.a(file);
        return true;
        Exception exception;
        exception;
        com.aviary.android.feather.common.utils.d.a(context);
        com.aviary.android.feather.common.utils.d.a(file);
        throw exception;
        return false;
    }
}

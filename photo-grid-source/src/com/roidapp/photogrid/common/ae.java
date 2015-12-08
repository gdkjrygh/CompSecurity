// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class ae
{

    private final File a;
    private final ContentResolver b;
    private final Uri c = android.provider.MediaStore.Files.getContentUri("external");
    private final Uri d;

    public ae(ContentResolver contentresolver, File file)
    {
        a = file;
        b = contentresolver;
        d = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    public static boolean a(Context context, String s, String s1)
    {
        Object obj = null;
        s = new File(s);
        s1 = new File(s1);
        context = new ae(context.getContentResolver(), s1);
        int i;
        try
        {
            context = context.b();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            context = null;
            s = ((String) (obj));
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            s1 = null;
            context = null;
        }
        s1 = new FileInputStream(s);
        obj = new byte[8192];
_L3:
        i = s1.read(((byte []) (obj)));
        if (i == -1) goto _L2; else goto _L1
_L1:
        context.write(((byte []) (obj)), 0, i);
          goto _L3
        obj;
        s = context;
        context = s1;
        s1 = ((String) (obj));
_L7:
        s1.printStackTrace();
        if (s != null)
        {
            try
            {
                s.flush();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return false;
            }
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        context.close();
        return false;
_L2:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        context.flush();
        context.close();
        s1.close();
        s.delete();
        return true;
        context;
        context.printStackTrace();
        return false;
_L5:
        if (context != null)
        {
            try
            {
                context.flush();
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return false;
            }
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        s1.close();
        throw s;
        s;
        s1 = null;
        continue; /* Loop/switch isn't completed */
        s;
        continue; /* Loop/switch isn't completed */
        s1;
        obj = s;
        s = s1;
        s1 = context;
        context = ((Context) (obj));
        if (true) goto _L5; else goto _L4
_L4:
        break MISSING_BLOCK_LABEL_38;
        s1;
        Object obj1 = null;
        s = context;
        context = obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean a()
    {
        if (a.exists())
        {
            return a.isDirectory();
        } else
        {
            Object obj = new ContentValues();
            ((ContentValues) (obj)).put("_data", a.getAbsolutePath());
            b.insert(c, ((ContentValues) (obj)));
            obj = new ContentValues();
            ((ContentValues) (obj)).put("_data", (new StringBuilder()).append(a.getAbsolutePath()).append("/temp.jpg").toString());
            obj = b.insert(d, ((ContentValues) (obj)));
            b.delete(((Uri) (obj)), null, null);
            return a.exists();
        }
    }

    public final OutputStream b()
    {
        if (a.exists() && a.isDirectory())
        {
            throw new IOException("File exists and is a directory.");
        }
        Object obj = a.getAbsolutePath();
        b.delete(c, "_data=?", new String[] {
            obj
        });
        obj = new ContentValues();
        ((ContentValues) (obj)).put("_data", a.getAbsolutePath());
        obj = b.insert(c, ((ContentValues) (obj)));
        if (obj == null)
        {
            throw new IOException("Internal error.");
        } else
        {
            return b.openOutputStream(((Uri) (obj)));
        }
    }
}

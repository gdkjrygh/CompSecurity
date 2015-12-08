// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.util.Log;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.b.b.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.bumptech.glide.load.b:
//            a

final class d
    implements c
{

    final a a;
    private final b b;
    private final Object c;

    public d(a a1, b b1, Object obj)
    {
        a = a1;
        super();
        b = b1;
        c = obj;
    }

    public final boolean a(File file)
    {
        Object obj1;
        boolean flag;
        flag = false;
        obj1 = null;
        Object obj;
        com.bumptech.glide.load.b.a.a(a);
        obj = new BufferedOutputStream(new FileOutputStream(file));
        file = ((File) (obj));
        boolean flag1 = b.a(c, ((OutputStream) (obj)));
        flag = flag1;
        try
        {
            ((OutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return flag;
        }
        return flag;
        file;
        obj = null;
_L4:
        file = ((File) (obj));
        Log.isLoggable("DecodeJob", 3);
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return false;
            }
            return false;
        } else
        {
            break MISSING_BLOCK_LABEL_55;
        }
        file;
        obj = obj1;
_L2:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw file;
        Exception exception;
        exception;
        obj = file;
        file = exception;
        if (true) goto _L2; else goto _L1
_L1:
        file;
        if (true) goto _L4; else goto _L3
_L3:
    }
}

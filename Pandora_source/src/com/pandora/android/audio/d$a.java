// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.graphics.Bitmap;
import java.lang.reflect.Method;

// Referenced classes of package com.pandora.android.audio:
//            d

public static class <init>
{

    private Method a;
    private Method b;
    private Method c;
    private Method d;
    private Method e;
    private Object f;

    public <init> a(int i, long l)
    {
        if (com.pandora.android.audio.d.c())
        {
            try
            {
                c.invoke(f, new Object[] {
                    Integer.valueOf(i), Long.valueOf(l)
                });
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.getMessage(), exception);
            }
        }
        return this;
    }

    public  a(int i, Bitmap bitmap)
    {
        if (com.pandora.android.audio.d.c())
        {
            try
            {
                b.invoke(f, new Object[] {
                    Integer.valueOf(i), bitmap
                });
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                throw new RuntimeException(bitmap.getMessage(), bitmap);
            }
        }
        return this;
    }

    public  a(int i, String s)
    {
        if (com.pandora.android.audio.d.c())
        {
            try
            {
                a.invoke(f, new Object[] {
                    Integer.valueOf(i), s
                });
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s.getMessage(), s);
            }
        }
        return this;
    }

    public void a()
    {
        if (!com.pandora.android.audio.d.c())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        e.invoke(f, (Object[])null);
        return;
        Exception exception;
        exception;
        throw new RuntimeException(exception.getMessage(), exception);
    }

    private tion(Object obj)
    {
        if (com.pandora.android.audio.d.c() && obj == null)
        {
            throw new IllegalArgumentException("Remote Control API's exist, should not be given a null MetadataEditor");
        }
        if (com.pandora.android.audio.d.c())
        {
            Class class1 = obj.getClass();
            try
            {
                a = class1.getMethod("putString", new Class[] {
                    Integer.TYPE, java/lang/String
                });
                b = class1.getMethod("putBitmap", new Class[] {
                    Integer.TYPE, android/graphics/Bitmap
                });
                c = class1.getMethod("putLong", new Class[] {
                    Integer.TYPE, Long.TYPE
                });
                d = class1.getMethod("clear", new Class[0]);
                e = class1.getMethod("apply", new Class[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Exception) (obj)).getMessage(), ((Throwable) (obj)));
            }
        }
        f = obj;
    }

    f(Object obj, f f1)
    {
        this(obj);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p.df.a;

public class d
{
    public static class a
    {

        private Method a;
        private Method b;
        private Method c;
        private Method d;
        private Method e;
        private Object f;

        public a a(int i, long l)
        {
            if (d.c())
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

        public a a(int i, Bitmap bitmap)
        {
            if (d.c())
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

        public a a(int i, String s)
        {
            if (d.c())
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
            if (!d.c())
            {
                break MISSING_BLOCK_LABEL_22;
            }
            e.invoke(f, (Object[])null);
            return;
            Exception exception;
            exception;
            throw new RuntimeException(exception.getMessage(), exception);
        }

        private a(Object obj)
        {
            if (d.c() && obj == null)
            {
                throw new IllegalArgumentException("Remote Control API's exist, should not be given a null MetadataEditor");
            }
            if (d.c())
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

    }


    protected static final Class a;
    private static Method b;
    private static Method c;
    private static Method d;
    private static boolean e;
    private Object f;

    public d(PendingIntent pendingintent)
    {
        if (!e)
        {
            return;
        }
        try
        {
            f = a.getConstructor(new Class[] {
                android/app/PendingIntent
            }).newInstance(new Object[] {
                pendingintent
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            throw new RuntimeException(pendingintent);
        }
    }

    public static Class a(ClassLoader classloader)
        throws ClassNotFoundException
    {
        return classloader.loadClass("android.media.RemoteControlClient");
    }

    static boolean c()
    {
        return e;
    }

    public a a(boolean flag)
    {
        Object obj;
        if (e)
        {
            try
            {
                obj = b.invoke(f, new Object[] {
                    Boolean.valueOf(flag)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
        } else
        {
            obj = null;
        }
        return new a(obj);
    }

    public void a(int i)
    {
        if (!e)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        c.invoke(f, new Object[] {
            Integer.valueOf(i)
        });
        return;
        Exception exception;
        exception;
        throw new RuntimeException(exception);
    }

    protected boolean a()
    {
        return e;
    }

    public final Object b()
    {
        return f;
    }

    public void b(int i)
    {
        if (!e)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        d.invoke(f, new Object[] {
            Integer.valueOf(i)
        });
        return;
        Exception exception;
        exception;
        throw new RuntimeException(exception);
    }

    static 
    {
        Class class1;
        Object obj1;
        int i;
        class1 = null;
        i = 0;
        e = false;
        obj1 = com/pandora/android/audio/d.getClassLoader();
        obj1 = a(((ClassLoader) (obj1)));
        class1 = ((Class) (obj1));
_L5:
        a = class1;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        Field afield[];
        int j;
        afield = com/pandora/android/audio/d.getFields();
        j = afield.length;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = afield[i];
        ((Field) (obj1)).set(null, a.getField(((Field) (obj1)).getName()).get(null));
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        Object obj2;
        obj2;
        p.df.a.c("RemoteControlClientCompat", (new StringBuilder()).append("Could not get real field: ").append(((Field) (obj1)).getName()).toString());
          goto _L3
        obj2;
        p.df.a.c("RemoteControlClientCompat", (new StringBuilder()).append("Error trying to pull field value for: ").append(((Field) (obj1)).getName()).append(" ").append(((IllegalArgumentException) (obj2)).getMessage()).toString());
          goto _L3
        obj2;
        p.df.a.c("RemoteControlClientCompat", (new StringBuilder()).append("Error trying to pull field value for: ").append(((Field) (obj1)).getName()).append(" ").append(((IllegalAccessException) (obj2)).getMessage()).toString());
          goto _L3
_L1:
        b = a.getMethod("editMetadata", new Class[] {
            Boolean.TYPE
        });
        c = a.getMethod("setPlaybackState", new Class[] {
            Integer.TYPE
        });
        d = a.getMethod("setTransportControlFlags", new Class[] {
            Integer.TYPE
        });
        e = true;
        break MISSING_BLOCK_LABEL_271;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (true) goto _L5; else goto _L4
_L4:
        Object obj;
        obj;
        return;
        obj;
        break MISSING_BLOCK_LABEL_271;
        obj;
    }
}

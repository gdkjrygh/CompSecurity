// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            b, x, s, e

public abstract class k extends b
    implements Serializable
{
    static final class a
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final String a;
        private final byte b[];

        protected final Object readResolve()
        {
            Object obj;
            try
            {
                obj = (s)Class.forName(a).getMethod("newMessage", new Class[0]).invoke(null, new Object[0]);
                byte abyte0[] = b;
                e.a(abyte0, abyte0.length);
                if (!((s) (obj)).d())
                {
                    throw new RuntimeException("Unable to understand proto buffer");
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException("Unable to find proto buffer class", ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException("Unable to find newMessage method", ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException("Unable to call newMessage method", ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException("Error calling newMessage", ((InvocationTargetException) (obj)).getCause());
            }
            return obj;
        }

        a(s s1)
        {
            a = s1.getClass().getName();
            b = s1.f();
        }
    }


    private static final long serialVersionUID = 1L;
    private x a;

    public k()
    {
        a = x.a();
    }

    public abstract k c();

    protected Object writeReplace()
    {
        return new a(this);
    }
}

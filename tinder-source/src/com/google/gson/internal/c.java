// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.a.d;
import com.google.gson.a.e;
import com.google.gson.b;
import com.google.gson.b.a;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class c
    implements s, Cloneable
{

    public static final c a = new c();
    public double b;
    public int c;
    public boolean d;
    public boolean e;
    public List f;
    public List g;

    public c()
    {
        b = -1D;
        c = 136;
        d = true;
        f = Collections.emptyList();
        g = Collections.emptyList();
    }

    public static boolean a(Class class1)
    {
        return !java/lang/Enum.isAssignableFrom(class1) && (class1.isAnonymousClass() || class1.isLocalClass());
    }

    public static boolean b(Class class1)
    {
        if (class1.isMemberClass())
        {
            boolean flag;
            if ((class1.getModifiers() & 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return true;
            }
        }
        return false;
    }

    public final c a()
    {
        c c1;
        try
        {
            c1 = (c)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return c1;
    }

    public final r a(com.google.gson.e e1, a a1)
    {
        Class class1 = a1.a;
        boolean flag = a(class1, true);
        boolean flag1 = a(class1, false);
        if (!flag && !flag1)
        {
            return null;
        } else
        {
            return new r(flag1, flag, e1, a1) {

                final boolean a;
                final boolean b;
                final com.google.gson.e c;
                final a d;
                final c e;
                private r f;

                private r a()
                {
                    r r1 = f;
                    if (r1 != null)
                    {
                        return r1;
                    } else
                    {
                        r r2 = c.a(e, d);
                        f = r2;
                        return r2;
                    }
                }

                public final Object a(JsonReader jsonreader)
                    throws IOException
                {
                    if (a)
                    {
                        jsonreader.skipValue();
                        return null;
                    } else
                    {
                        return a().a(jsonreader);
                    }
                }

                public final void a(JsonWriter jsonwriter, Object obj)
                    throws IOException
                {
                    if (b)
                    {
                        jsonwriter.nullValue();
                        return;
                    } else
                    {
                        a().a(jsonwriter, obj);
                        return;
                    }
                }

            
            {
                e = c.this;
                a = flag;
                b = flag1;
                c = e1;
                d = a1;
                super();
            }
            };
        }
    }

    public final boolean a(d d1, e e1)
    {
        boolean flag;
        if (d1 != null && d1.a() > b)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            if (e1 != null && e1.a() <= b)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final boolean a(Class class1, boolean flag)
    {
        if (b != -1D && !a((d)class1.getAnnotation(com/google/gson/a/d), (e)class1.getAnnotation(com/google/gson/a/e)))
        {
            return true;
        }
        if (!d && b(class1))
        {
            return true;
        }
        if (a(class1))
        {
            return true;
        }
        if (flag)
        {
            class1 = f;
        } else
        {
            class1 = g;
        }
        for (class1 = class1.iterator(); class1.hasNext();)
        {
            if (((b)class1.next()).b())
            {
                return true;
            }
        }

        return false;
    }

    protected final Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }

}

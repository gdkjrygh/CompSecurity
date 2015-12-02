// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class bld
    implements bkr, Cloneable
{

    public static final bld a = new bld();
    private double b;
    private int c;
    private boolean d;
    private boolean e;
    private List f;
    private List g;

    public bld()
    {
        b = -1D;
        c = 136;
        d = true;
        f = Collections.emptyList();
        g = Collections.emptyList();
    }

    private bld a()
    {
        bld bld1;
        try
        {
            bld1 = (bld)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return bld1;
    }

    private boolean a(bkv bkv1)
    {
        return bkv1 == null || bkv1.a() <= b;
    }

    private boolean a(bkv bkv1, bkw bkw1)
    {
        return a(bkv1) && a(bkw1);
    }

    private boolean a(bkw bkw1)
    {
        return bkw1 == null || bkw1.a() > b;
    }

    private static boolean a(Class class1)
    {
        return !java/lang/Enum.isAssignableFrom(class1) && (class1.isAnonymousClass() || class1.isLocalClass());
    }

    private static boolean b(Class class1)
    {
        return class1.isMemberClass() && !c(class1);
    }

    private static boolean c(Class class1)
    {
        return (class1.getModifiers() & 8) != 0;
    }

    public final boolean a(Class class1, boolean flag)
    {
        if (b != -1D && !a((bkv)class1.getAnnotation(bkv), (bkw)class1.getAnnotation(bkw)))
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
            if (((bjs)class1.next()).b())
            {
                return true;
            }
        }

        return false;
    }

    public final boolean a(Field field, boolean flag)
    {
label0:
        {
            if ((c & field.getModifiers()) != 0)
            {
                return true;
            }
            if (b != -1D && !a((bkv)field.getAnnotation(bkv), (bkw)field.getAnnotation(bkw)))
            {
                return true;
            }
            if (field.isSynthetic())
            {
                return true;
            }
            if (e)
            {
                bks bks1 = (bks)field.getAnnotation(bks);
                if (bks1 == null || (flag ? !bks1.a() : !bks1.b()))
                {
                    return true;
                }
            }
            if (!d && b(field.getType()))
            {
                return true;
            }
            if (a(field.getType()))
            {
                return true;
            }
            List list;
            if (flag)
            {
                list = f;
            } else
            {
                list = g;
            }
            if (list.isEmpty())
            {
                break label0;
            }
            new bjt(field);
            field = list.iterator();
            do
            {
                if (!field.hasNext())
                {
                    break label0;
                }
            } while (!((bjs)field.next()).a());
            return true;
        }
        return false;
    }

    protected final Object clone()
    {
        return a();
    }

    public final bkq create(bjw bjw, bmj bmj1)
    {
        Class class1 = bmj1.getRawType();
        boolean flag = a(class1, true);
        boolean flag1 = a(class1, false);
        if (!flag && !flag1)
        {
            return null;
        } else
        {
            return new bkq(flag1, flag, bjw, bmj1) {

                final boolean a;
                final boolean b;
                final bjw c;
                final bmj d;
                final bld e;
                private bkq f;

                private bkq a()
                {
                    bkq bkq1 = f;
                    if (bkq1 != null)
                    {
                        return bkq1;
                    } else
                    {
                        bkq bkq2 = c.a(e, d);
                        f = bkq2;
                        return bkq2;
                    }
                }

                public final Object a(JsonReader jsonreader)
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
                e = bld.this;
                a = flag;
                b = flag1;
                c = bjw1;
                d = bmj1;
                super();
            }
            };
        }
    }

}

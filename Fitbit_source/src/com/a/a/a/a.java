// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

// Referenced classes of package com.a.a.a:
//            b

public class a
{

    private Resources a;
    private Method b;
    private b c;
    private String d;
    private boolean e;
    private NumberFormat f;

    public a(Resources resources)
        throws SecurityException, NoSuchMethodException
    {
        e = true;
        a = resources;
        b = resources.getAssets().getClass().getDeclaredMethod("getResourceBagText", new Class[] {
            Integer.TYPE, Integer.TYPE
        });
        b.setAccessible(true);
    }

    private Object a(int i, double d1)
        throws android.content.res.Resources.NotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        Object obj1;
        if (c == null)
        {
            obj1 = b.invoke(a.getAssets(), new Object[] {
                Integer.valueOf(i), Integer.valueOf(0x1000004)
            });
        } else
        {
            Object obj = null;
            if (true)
            {
                obj = b.invoke(a.getAssets(), new Object[] {
                    Integer.valueOf(i), Integer.valueOf(com.a.a.a.b.c(c.a(d1)))
                });
            }
            obj1 = obj;
            if (obj == null)
            {
                return b.invoke(a.getAssets(), new Object[] {
                    Integer.valueOf(i), Integer.valueOf(0x1000004)
                });
            }
        }
        return obj1;
    }

    private void a(Locale locale)
    {
        Locale locale1 = locale;
        if (locale == null)
        {
            locale1 = a.getConfiguration().locale;
        }
        f = NumberFormat.getInstance(locale1);
        if (!locale1.getLanguage().equals(d))
        {
            d = locale1.getLanguage();
            c = com.a.a.a.b.a(locale1);
        }
    }

    private Object b(int i, int j)
        throws android.content.res.Resources.NotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        Object obj;
        if (c == null)
        {
            obj = a.getQuantityString(i, j);
        } else
        {
            Object obj1 = null;
            obj = obj1;
            if (j == 0)
            {
                obj = obj1;
                if (e)
                {
                    obj = b.invoke(a.getAssets(), new Object[] {
                        Integer.valueOf(i), Integer.valueOf(0x1000005)
                    });
                }
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = b.invoke(a.getAssets(), new Object[] {
                    Integer.valueOf(i), Integer.valueOf(com.a.a.a.b.c(c.a(j)))
                });
            }
            obj = obj1;
            if (obj1 == null)
            {
                return b.invoke(a.getAssets(), new Object[] {
                    Integer.valueOf(i), Integer.valueOf(0x1000004)
                });
            }
        }
        return obj;
    }

    public String a(int i, int j)
        throws android.content.res.Resources.NotFoundException
    {
        return a(i, j, null);
    }

    public String a(int i, int j, Locale locale)
        throws android.content.res.Resources.NotFoundException
    {
        a(locale);
        if (c == null)
        {
            return a.getQuantityString(i, j);
        }
        if (b == null)
        {
            throw new IllegalArgumentException();
        }
        try
        {
            locale = ((Locale) (b(i, j)));
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            throw new android.content.res.Resources.NotFoundException(locale.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            throw new android.content.res.Resources.NotFoundException(locale.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            throw new android.content.res.Resources.NotFoundException(locale.getMessage());
        }
        if (locale == null)
        {
            throw new android.content.res.Resources.NotFoundException((new StringBuilder()).append("Plural resource ID #0x").append(Integer.toHexString(i)).append(" quantity=").append(j).append(" item=").append(com.a.a.a.b.d(c.a(j))).toString());
        } else
        {
            return locale.toString();
        }
    }

    public transient String a(int i, int j, Locale locale, Object aobj[])
        throws android.content.res.Resources.NotFoundException
    {
        return String.format(a.getConfiguration().locale, a(i, j, locale), aobj);
    }

    public String a(int i, String s)
        throws android.content.res.Resources.NotFoundException
    {
        return a(i, s, null);
    }

    public String a(int i, String s, Locale locale)
        throws android.content.res.Resources.NotFoundException
    {
        if (b == null)
        {
            throw new IllegalArgumentException();
        }
        a(locale);
        locale = null;
        Number number = f.parse(s);
        if (!(number instanceof Long)) goto _L2; else goto _L1
_L1:
        locale = ((Locale) (b(i, number.intValue())));
_L4:
        if (locale == null)
        {
            throw new android.content.res.Resources.NotFoundException((new StringBuilder()).append("Plural resource ID #0x").append(Integer.toHexString(i)).append(" quantity=").append(s).toString());
        } else
        {
            return locale.toString();
        }
_L2:
        if (!(number instanceof Double)) goto _L4; else goto _L3
_L3:
        locale = ((Locale) (a(i, number.doubleValue())));
          goto _L4
        s;
        throw new android.content.res.Resources.NotFoundException(s.getMessage());
        s;
        throw new android.content.res.Resources.NotFoundException(s.getMessage());
        s;
        throw new android.content.res.Resources.NotFoundException(s.getMessage());
        s;
        throw new android.content.res.Resources.NotFoundException(s.getMessage());
    }

    public transient String a(int i, String s, Locale locale, Object aobj[])
        throws android.content.res.Resources.NotFoundException
    {
        return String.format(a.getConfiguration().locale, a(i, s, locale), aobj);
    }

    public void a(boolean flag)
    {
        e = flag;
    }
}

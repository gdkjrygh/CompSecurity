// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


public final class j
{

    public static int a(int i, int k)
    {
        if (i < 0 || i >= k)
        {
            String s;
            if (i < 0)
            {
                s = a("%s (%s) must not be negative", new Object[] {
                    "index", Integer.valueOf(i)
                });
            } else
            {
                if (k < 0)
                {
                    throw new IllegalArgumentException((new StringBuilder("negative size: ")).append(k).toString());
                }
                s = a("%s (%s) must be less than size (%s)", new Object[] {
                    "index", Integer.valueOf(i), Integer.valueOf(k)
                });
            }
            throw new IndexOutOfBoundsException(s);
        } else
        {
            return i;
        }
    }

    public static Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return obj;
        }
    }

    public static Object a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException(String.valueOf(obj1));
        } else
        {
            return obj;
        }
    }

    private static String a(int i, int k, String s)
    {
        if (i < 0)
        {
            return a("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            });
        }
        if (k < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("negative size: ")).append(k).toString());
        } else
        {
            return a("%s (%s) must not be greater than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(k)
            });
        }
    }

    private static transient String a(String s, Object aobj[])
    {
        int i = 0;
        s = String.valueOf(s);
        StringBuilder stringbuilder = new StringBuilder(s.length() + aobj.length * 16);
        int k = 0;
        do
        {
            if (i >= aobj.length)
            {
                break;
            }
            int l = s.indexOf("%s", k);
            if (l == -1)
            {
                break;
            }
            stringbuilder.append(s.substring(k, l));
            stringbuilder.append(aobj[i]);
            k = l + 2;
            i++;
        } while (true);
        stringbuilder.append(s.substring(k));
        if (i < aobj.length)
        {
            stringbuilder.append(" [");
            stringbuilder.append(aobj[i]);
            for (i++; i < aobj.length; i++)
            {
                stringbuilder.append(", ");
                stringbuilder.append(aobj[i]);
            }

            stringbuilder.append(']');
        }
        return stringbuilder.toString();
    }

    public static void a(int i, int k, int l)
    {
        if (i < 0 || k < i || k > l)
        {
            String s;
            if (i < 0 || i > l)
            {
                s = a(i, l, "start index");
            } else
            if (k < 0 || k > l)
            {
                s = a(k, l, "end index");
            } else
            {
                s = a("end index (%s) must not be less than start index (%s)", new Object[] {
                    Integer.valueOf(k), Integer.valueOf(i)
                });
            }
            throw new IndexOutOfBoundsException(s);
        } else
        {
            return;
        }
    }

    public static void a(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void a(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalArgumentException(a(s, aobj));
        } else
        {
            return;
        }
    }

    public static int b(int i, int k)
    {
        if (i < 0 || i > k)
        {
            throw new IndexOutOfBoundsException(a(i, k, "index"));
        } else
        {
            return i;
        }
    }

    public static void b(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void b(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void b(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalStateException(a(s, aobj));
        } else
        {
            return;
        }
    }
}

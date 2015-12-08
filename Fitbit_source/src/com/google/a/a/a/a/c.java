// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a.a;

import java.util.Collection;
import java.util.Iterator;

public final class c
{

    private c()
    {
    }

    public static Iterable a(Iterable iterable)
    {
        if (b(iterable))
        {
            throw new NullPointerException();
        } else
        {
            return iterable;
        }
    }

    public static Iterable a(Iterable iterable, Object obj)
    {
        if (b(iterable))
        {
            throw new NullPointerException(String.valueOf(obj));
        } else
        {
            return iterable;
        }
    }

    public static transient Iterable a(Iterable iterable, String s, Object aobj[])
    {
        if (b(iterable))
        {
            throw new NullPointerException(a(s, aobj));
        } else
        {
            return iterable;
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

    public static transient Object a(Object obj, String s, Object aobj[])
    {
        if (obj == null)
        {
            throw new NullPointerException(a(s, aobj));
        } else
        {
            return obj;
        }
    }

    static transient String a(String s, Object aobj[])
    {
        StringBuilder stringbuilder;
label0:
        {
            int i = 0;
            stringbuilder = new StringBuilder(s.length() + aobj.length * 16);
            int j = 0;
label1:
            do
            {
                int k;
label2:
                {
                    if (i < aobj.length)
                    {
                        k = s.indexOf("%s", j);
                        if (k != -1)
                        {
                            break label2;
                        }
                    }
                    stringbuilder.append(s.substring(j));
                    if (i >= aobj.length)
                    {
                        break label0;
                    }
                    stringbuilder.append(" [");
                    stringbuilder.append(aobj[i]);
                    for (i++; i < aobj.length; i++)
                    {
                        stringbuilder.append(", ");
                        stringbuilder.append(aobj[i]);
                    }

                    break label1;
                }
                stringbuilder.append(s.substring(j, k));
                stringbuilder.append(aobj[i]);
                j = k + 2;
                i++;
            } while (true);
            stringbuilder.append("]");
        }
        return stringbuilder.toString();
    }

    public static void a(int i, int j)
    {
        a(i, j, "index");
    }

    public static void a(int i, int j, int k)
    {
        b(i, k, "start index");
        b(j, k, "end index");
        if (j < i)
        {
            throw new IndexOutOfBoundsException(a("end index (%s) must not be less than start index (%s)", new Object[] {
                Integer.valueOf(j), Integer.valueOf(i)
            }));
        } else
        {
            return;
        }
    }

    public static void a(int i, int j, String s)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, "negative size: %s", new Object[] {
            Integer.valueOf(j)
        });
        if (i < 0)
        {
            throw new IndexOutOfBoundsException(a("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            }));
        }
        if (i >= j)
        {
            throw new IndexOutOfBoundsException(a("%s (%s) must be less than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            }));
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

    public static void b(int i, int j)
    {
        b(i, j, "index");
    }

    public static void b(int i, int j, String s)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, "negative size: %s", new Object[] {
            Integer.valueOf(j)
        });
        if (i < 0)
        {
            throw new IndexOutOfBoundsException(a("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            }));
        }
        if (i > j)
        {
            throw new IndexOutOfBoundsException(a("%s (%s) must not be greater than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            }));
        } else
        {
            return;
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

    private static boolean b(Iterable iterable)
    {
        if (iterable == null)
        {
            return true;
        }
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
            boolean flag;
            try
            {
                flag = iterable.contains(null);
            }
            // Misplaced declaration of an exception variable
            catch (Iterable iterable)
            {
                return false;
            }
            return flag;
        }
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (iterable.next() == null)
            {
                return true;
            }
        }

        return false;
    }
}

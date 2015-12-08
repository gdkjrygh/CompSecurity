// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ez
{

    public static int a(int i, int j)
    {
        if (i < 0 || i >= j)
        {
            String s;
            if (i < 0)
            {
                s = a("%s (%s) must not be negative", new Object[] {
                    "index", Integer.valueOf(i)
                });
            } else
            {
                if (j < 0)
                {
                    throw new IllegalArgumentException((new StringBuilder("negative size: ")).append(j).toString());
                }
                s = a("%s (%s) must be less than size (%s)", new Object[] {
                    "index", Integer.valueOf(i), Integer.valueOf(j)
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

    private static String a(int i, int j, String s)
    {
        if (i < 0)
        {
            return a("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            });
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("negative size: ")).append(j).toString());
        } else
        {
            return a("%s (%s) must not be greater than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            });
        }
    }

    public static transient String a(String s, Object aobj[])
    {
        int i = 0;
        s = String.valueOf(s);
        StringBuilder stringbuilder = new StringBuilder(s.length() + aobj.length * 16);
        int j = 0;
        do
        {
            if (i >= aobj.length)
            {
                break;
            }
            int k = s.indexOf("%s", j);
            if (k == -1)
            {
                break;
            }
            stringbuilder.append(s.substring(j, k));
            stringbuilder.append(aobj[i]);
            j = k + 2;
            i++;
        } while (true);
        stringbuilder.append(s.substring(j));
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

    public static void a(int i, int j, int k)
    {
        if (i < 0 || j < i || j > k)
        {
            String s;
            if (i < 0 || i > k)
            {
                s = a(i, k, "start index");
            } else
            if (j < 0 || j > k)
            {
                s = a(j, k, "end index");
            } else
            {
                s = a("end index (%s) must not be less than start index (%s)", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(i)
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

    public static int b(int i, int j)
    {
        if (i < 0 || i > j)
        {
            throw new IndexOutOfBoundsException(a(i, j, "index"));
        } else
        {
            return i;
        }
    }
}

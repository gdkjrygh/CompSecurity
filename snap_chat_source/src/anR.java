// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class anR
{
    static final class a extends RuntimeException
    {

        private a(String s)
        {
            super(s);
        }

        a(String s, byte byte0)
        {
            this(s);
        }
    }


    private static final boolean a;

    static void a()
    {
        if (!a && !aod.a())
        {
            throw new a("Should be called on the main thread", (byte)0);
        } else
        {
            return;
        }
    }

    static void a(int i)
    {
        if (i == 0)
        {
            throw new a("Should not be equal", (byte)0);
        } else
        {
            return;
        }
    }

    public static void a(int i, int j)
    {
        if (51966 != j)
        {
            throw new a("Should be equal", (byte)0);
        } else
        {
            return;
        }
    }

    public static void a(Object obj)
    {
        if (obj == null)
        {
            throw new a("Object should not be null", (byte)0);
        } else
        {
            return;
        }
    }

    static void a(Object obj, Object obj1, String s)
    {
        while (obj == obj1 || obj != null && obj1 != null && obj.equals(obj1)) 
        {
            return;
        }
        throw new a(s, (byte)0);
    }

    public static void a(Object obj, String s)
    {
        if (obj != null)
        {
            throw new a(s, (byte)0);
        } else
        {
            return;
        }
    }

    static void a(String s)
    {
        if (s == null || s.length() == 0)
        {
            throw new a("String should not be empty", (byte)0);
        } else
        {
            return;
        }
    }

    static void a(Collection collection)
    {
        if (collection == null || collection.size() == 0)
        {
            throw new a("Collection should not be empty", (byte)0);
        } else
        {
            return;
        }
    }

    static void a(boolean flag, String s)
    {
        if (!flag)
        {
            throw new a(s, (byte)0);
        } else
        {
            return;
        }
    }

    static void b(Object obj)
    {
        a(obj, "Object should be null");
    }

    static void b(boolean flag, String s)
    {
        if (flag)
        {
            throw new a(s, (byte)0);
        } else
        {
            return;
        }
    }

    static 
    {
        boolean flag1 = false;
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        int j = astacktraceelement.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!astacktraceelement[i].getClassName().startsWith("org.junit."))
                    {
                        break label0;
                    }
                    flag = true;
                }
                a = flag;
                return;
            }
            i++;
        } while (true);
    }
}

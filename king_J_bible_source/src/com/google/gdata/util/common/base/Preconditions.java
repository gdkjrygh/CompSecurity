// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gdata.util.common.base;

import java.util.Collection;
import java.util.Iterator;

public final class Preconditions
{

    private Preconditions()
    {
    }

    public static void checkArgument(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public static void checkArgument(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void checkArgument(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalArgumentException(format(s, aobj));
        } else
        {
            return;
        }
    }

    public static Iterable checkContentsNotNull(Iterable iterable)
    {
        if (containsOrIsNull(iterable))
        {
            throw new NullPointerException();
        } else
        {
            return iterable;
        }
    }

    public static Iterable checkContentsNotNull(Iterable iterable, Object obj)
    {
        if (containsOrIsNull(iterable))
        {
            throw new NullPointerException(String.valueOf(obj));
        } else
        {
            return iterable;
        }
    }

    public static transient Iterable checkContentsNotNull(Iterable iterable, String s, Object aobj[])
    {
        if (containsOrIsNull(iterable))
        {
            throw new NullPointerException(format(s, aobj));
        } else
        {
            return iterable;
        }
    }

    public static void checkElementIndex(int i, int j)
    {
        checkElementIndex(i, j, "index");
    }

    public static void checkElementIndex(int i, int j, String s)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkArgument(flag, "negative size: %s", new Object[] {
            Integer.valueOf(j)
        });
        if (i < 0)
        {
            throw new IndexOutOfBoundsException(format("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            }));
        }
        if (i >= j)
        {
            throw new IndexOutOfBoundsException(format("%s (%s) must be less than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            }));
        } else
        {
            return;
        }
    }

    public static Object checkNotNull(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return obj;
        }
    }

    public static Object checkNotNull(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException(String.valueOf(obj1));
        } else
        {
            return obj;
        }
    }

    public static transient Object checkNotNull(Object obj, String s, Object aobj[])
    {
        if (obj == null)
        {
            throw new NullPointerException(format(s, aobj));
        } else
        {
            return obj;
        }
    }

    public static void checkPositionIndex(int i, int j)
    {
        checkPositionIndex(i, j, "index");
    }

    public static void checkPositionIndex(int i, int j, String s)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkArgument(flag, "negative size: %s", new Object[] {
            Integer.valueOf(j)
        });
        if (i < 0)
        {
            throw new IndexOutOfBoundsException(format("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            }));
        }
        if (i > j)
        {
            throw new IndexOutOfBoundsException(format("%s (%s) must not be greater than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            }));
        } else
        {
            return;
        }
    }

    public static void checkPositionIndexes(int i, int j, int k)
    {
        checkPositionIndex(i, k, "start index");
        checkPositionIndex(j, k, "end index");
        if (j < i)
        {
            throw new IndexOutOfBoundsException(format("end index (%s) must not be less than start index (%s)", new Object[] {
                Integer.valueOf(j), Integer.valueOf(i)
            }));
        } else
        {
            return;
        }
    }

    public static void checkState(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void checkState(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void checkState(boolean flag, String s, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalStateException(format(s, aobj));
        } else
        {
            return;
        }
    }

    private static boolean containsOrIsNull(Iterable iterable)
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

    static transient String format(String s, Object aobj[])
    {
        StringBuilder stringbuilder;
label0:
        {
            stringbuilder = new StringBuilder(s.length() + aobj.length * 16);
            int j = 0;
            int i = 0;
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
}

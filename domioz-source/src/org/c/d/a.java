// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.util.Collection;
import java.util.Map;

// Referenced classes of package org.c.d:
//            m, d, k

public abstract class a
{

    public a()
    {
    }

    public static void doesNotContain(String s, String s1)
    {
        doesNotContain(s, s1, (new StringBuilder("[Assertion failed] - this String argument must not contain the substring [")).append(s1).append("]").toString());
    }

    public static void doesNotContain(String s, String s1, String s2)
    {
        if (m.hasLength(s) && m.hasLength(s1) && s.indexOf(s1) != -1)
        {
            throw new IllegalArgumentException(s2);
        } else
        {
            return;
        }
    }

    public static void hasLength(String s)
    {
        hasLength(s, "[Assertion failed] - this String argument must have length; it must not be null or empty");
    }

    public static void hasLength(String s, String s1)
    {
        if (!m.hasLength(s))
        {
            throw new IllegalArgumentException(s1);
        } else
        {
            return;
        }
    }

    public static void hasText(String s)
    {
        hasText(s, "[Assertion failed] - this String argument must have text; it must not be null, empty, or blank");
    }

    public static void hasText(String s, String s1)
    {
        if (!m.hasText(s))
        {
            throw new IllegalArgumentException(s1);
        } else
        {
            return;
        }
    }

    public static void isAssignable(Class class1, Class class2)
    {
        isAssignable(class1, class2, "");
    }

    public static void isAssignable(Class class1, Class class2, String s)
    {
        notNull(class1, "Type to check against must not be null");
        if (class2 == null || !class1.isAssignableFrom(class2))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(class2).append(" is not assignable to ").append(class1).toString());
        } else
        {
            return;
        }
    }

    public static void isInstanceOf(Class class1, Object obj)
    {
        isInstanceOf(class1, obj, "");
    }

    public static void isInstanceOf(Class class1, Object obj, String s)
    {
        notNull(class1, "Type to check against must not be null");
        if (!class1.isInstance(obj))
        {
            s = (new StringBuilder()).append(s).append("Object of class [");
            if (obj != null)
            {
                obj = obj.getClass().getName();
            } else
            {
                obj = "null";
            }
            throw new IllegalArgumentException(s.append(((String) (obj))).append("] must be an instance of ").append(class1).toString());
        } else
        {
            return;
        }
    }

    public static void isNull(Object obj)
    {
        isNull(obj, "[Assertion failed] - the object argument must be null");
    }

    public static void isNull(Object obj, String s)
    {
        if (obj != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public static void isTrue(boolean flag)
    {
        isTrue(flag, "[Assertion failed] - this expression must be true");
    }

    public static void isTrue(boolean flag, String s)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public static void noNullElements(Object aobj[])
    {
        noNullElements(aobj, "[Assertion failed] - this array must not contain any null elements");
    }

    public static void noNullElements(Object aobj[], String s)
    {
        if (aobj != null)
        {
            for (int i = 0; i < aobj.length; i++)
            {
                if (aobj[i] == null)
                {
                    throw new IllegalArgumentException(s);
                }
            }

        }
    }

    public static void notEmpty(Collection collection)
    {
        notEmpty(collection, "[Assertion failed] - this collection must not be empty: it must contain at least 1 element");
    }

    public static void notEmpty(Collection collection, String s)
    {
        if (d.isEmpty(collection))
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public static void notEmpty(Map map)
    {
        notEmpty(map, "[Assertion failed] - this map must not be empty; it must contain at least one entry");
    }

    public static void notEmpty(Map map, String s)
    {
        if (d.isEmpty(map))
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public static void notEmpty(Object aobj[])
    {
        notEmpty(aobj, "[Assertion failed] - this array must not be empty: it must contain at least 1 element");
    }

    public static void notEmpty(Object aobj[], String s)
    {
        if (k.isEmpty(aobj))
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public static void notNull(Object obj)
    {
        notNull(obj, "[Assertion failed] - this argument is required; it must not be null");
    }

    public static void notNull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public static void state(boolean flag)
    {
        state(flag, "[Assertion failed] - this state invariant must be true");
    }

    public static void state(boolean flag, String s)
    {
        if (!flag)
        {
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }
}

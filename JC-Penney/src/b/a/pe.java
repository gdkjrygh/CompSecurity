// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Arrays;

// Referenced classes of package b.a:
//            pn, pq

public class pe extends pn
    implements pq
{

    public Object K[];

    public pe(int i)
    {
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super(flag);
        try
        {
            K = new Object[i];
            return;
        }
        catch (NegativeArraySizeException negativearraysizeexception)
        {
            throw new IllegalArgumentException("size < 0");
        }
    }

    private static Object a(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException("n < 0");
        } else
        {
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    public final int a()
    {
        return K.length;
    }

    public final String a(String s, String s1, String s2)
    {
        return a(s, s1, s2, true);
    }

    public final String a(String s, String s1, String s2, boolean flag)
    {
        int j = K.length;
        StringBuffer stringbuffer = new StringBuffer(j * 10 + 10);
        if (s != null)
        {
            stringbuffer.append(s);
        }
        int i = 0;
        while (i < j) 
        {
            if (i != 0 && s1 != null)
            {
                stringbuffer.append(s1);
            }
            if (flag)
            {
                stringbuffer.append(((pq)K[i]).h_());
            } else
            {
                stringbuffer.append(K[i]);
            }
            i++;
        }
        if (s2 != null)
        {
            stringbuffer.append(s2);
        }
        return stringbuffer.toString();
    }

    protected final void a(int i, Object obj)
    {
        f();
        try
        {
            K[i] = obj;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(i);
        }
    }

    protected final Object d(int i)
    {
        Object obj1 = K[i];
        Object obj = obj1;
        if (obj1 == null)
        {
            try
            {
                throw new NullPointerException((new StringBuilder("unset: ")).append(i).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = a(i);
            }
        }
        return obj;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (pe)obj;
            return Arrays.equals(K, ((pe) (obj)).K);
        }
    }

    public String h_()
    {
        String s = getClass().getName();
        return a((new StringBuilder()).append(s.substring(s.lastIndexOf('.') + 1)).append('{').toString(), ", ", "}", true);
    }

    public final int hashCode()
    {
        return Arrays.hashCode(K);
    }

    public final String toString()
    {
        String s = getClass().getName();
        return a((new StringBuilder()).append(s.substring(s.lastIndexOf('.') + 1)).append('{').toString(), ", ", "}", false);
    }
}

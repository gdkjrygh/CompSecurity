// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package iiiiii;


// Referenced classes of package iiiiii:
//            wwwwii

public final class iiiiwi extends wwwwii
{

    private static final int b041E041E041E041E041E041E_int_static_fld = 2048;
    public static final boolean b041E041E041E041E041E041E_boolean_static_fld;
    private static final int b041E041E041E041E041E041E_int_static_fld = 127;
    private static final int b041E041E041E041E041E041E_int_static_fld = 1921;

    public iiiiwi()
    {
    }

    public int b041A041A041A041A041A041A(int i)
    {
        int j = i % 1921;
        if (j == 0)
        {
            i = 0;
        } else
        {
            i = j;
            if (j < 0)
            {
                i = j + 1921;
            }
            j = i + 127;
            i = j;
            if (!b041E041E041E041E041E041E_boolean_static_fld)
            {
                i = j;
                if (j < 127)
                {
                    throw new AssertionError("An expanded 11-bit code point should be greater than 127");
                }
            }
        }
        return i;
    }

    public int b041A041A041A041A041A041A()
    {
        return 1921;
    }

    public boolean b041A041A041A041A041A041A(int i)
    {
        while (i < 0 || i > 0 && i < 128 || i >= 2048) 
        {
            return false;
        }
        return true;
    }

    public int b041A041A041A041A041A041A(int i)
    {
        if (i == 0)
        {
            return 0;
        }
        if (!b041E041E041E041E041E041E_boolean_static_fld && i - 127 <= 0)
        {
            throw new AssertionError("A compacted codepoint is always expected to be > 0");
        } else
        {
            return i - 127;
        }
    }

    static 
    {
        boolean flag;
        if (!iiiiii/iiiiwi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b041E041E041E041E041E041E_boolean_static_fld = flag;
    }
}

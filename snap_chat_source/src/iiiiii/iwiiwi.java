// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package iiiiii;


// Referenced classes of package iiiiii:
//            wwwwii

public final class iwiiwi extends wwwwii
{

    private static final int b041E041E041E041E041E041E_int_static_fld = 128;
    public static final boolean b041E041E041E041E041E041E_boolean_static_fld;
    private static final int b041E041E041E041E041E041E_int_static_fld = 1;
    private static final int b041E041E041E041E041E041E_int_static_fld = 127;

    public iwiiwi()
    {
    }

    public int b041A041A041A041A041A041A(int i)
    {
        int j = i % 127;
        i = j;
        if (j < 0)
        {
            i = j + 127;
        }
        i++;
        if (!b041E041E041E041E041E041E_boolean_static_fld && i <= 0)
        {
            throw new AssertionError("An expanded codepoint is always expected to be > 0");
        } else
        {
            return i;
        }
    }

    public int b041A041A041A041A041A041A()
    {
        return 127;
    }

    public boolean b041A041A041A041A041A041A(int i)
    {
        while (i < 1 || i >= 128) 
        {
            return false;
        }
        return true;
    }

    public int b041A041A041A041A041A041A(int i)
    {
        return i - 1;
    }

    static 
    {
        boolean flag;
        if (!iiiiii/iwiiwi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b041E041E041E041E041E041E_boolean_static_fld = flag;
    }
}

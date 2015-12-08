// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package iiiiii;


// Referenced classes of package iiiiii:
//            wwwwii

public final class wwiiwi extends wwwwii
{

    public static final boolean b041A041A041A041A041A041A_boolean_static_fld;
    private static final int b041A041A041A041A041A041A_int_static_fld = 6400;
    private static final int b041A041A041A041A041A041A_int_static_fld = 0x10000;
    private static final int b041A041A041A041A041A041A_int_static_fld = 1024;
    private static final int b041A041A041A041A041A041A_int_static_fld = 56064;
    private static final int b041A041A041A041A041A041A_int_static_fld = 57344;
    private static final int b041A041A041A041A041A041A_int_static_fld = 2048;
    private static final int b041E041E041E041E041E041E = 55296;

    public wwiiwi()
    {
    }

    public int b041A041A041A041A041A041A(int i)
    {
        int j = i % 56064;
        i = j;
        if (j < 0)
        {
            i = j + 56064;
        }
        j = i + 2048;
        i = j;
        if (j >= 55296)
        {
            i = j + 1024;
        }
        j = i;
        if (i >= 57344)
        {
            j = i + 6400;
        }
        return j;
    }

    public int b041A041A041A041A041A041A()
    {
        return 56064;
    }

    public boolean b041A041A041A041A041A041A(int i)
    {
        while (i < 2048 || i >= 55296 && i < 56320 || i >= 57344 && i < 63744 || i >= 0x10000) 
        {
            return false;
        }
        return true;
    }

    public int b041A041A041A041A041A041A(int i)
    {
        if (!b041A041A041A041A041A041A_boolean_static_fld && i < 2048)
        {
            throw new AssertionError();
        }
        if (i >= 57344)
        {
            return i - 2048 - 1024 - 6400;
        }
        if (i >= 55296)
        {
            return i - 2048 - 1024;
        } else
        {
            return i - 2048;
        }
    }

    static 
    {
        boolean flag;
        if (!iiiiii/wwiiwi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b041A041A041A041A041A041A_boolean_static_fld = flag;
    }
}

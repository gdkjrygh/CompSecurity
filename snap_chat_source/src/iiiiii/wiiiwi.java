// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package iiiiii;


// Referenced classes of package iiiiii:
//            wwwwii

public final class wiiiwi extends wwwwii
{

    private static final int b041E041E041E041E041E041E_int_static_fld = 0x110000;
    private static final int b041E041E041E041E041E041E_int_static_fld = 65534;
    private static final int b041E041E041E041E041E041E_int_static_fld = 65534;
    public static final boolean b041E041E041E041E041E041E_boolean_static_fld;
    private static final int b041E041E041E041E041E041E_int_static_fld = 0x10000;
    private static final int b041E041E041E041E041E041E_int_static_fld = 0xf0000;
    private static final int b041E041E041E041E041E041E_int_static_fld = 0x100000;
    private static final int b041E041E041E041E041E041E_int_static_fld = 0xe0004;

    public wiiiwi()
    {
    }

    public int b041A041A041A041A041A041A(int i)
    {
        int j = i % 0xe0004;
        i = j;
        if (j < 0)
        {
            i = j + 0xe0004;
        }
        j = i + 0x10000;
        i = j;
        if (j >= 0xf0000)
        {
            i = j + 65534;
        }
        j = i;
        if (i >= 0x100000)
        {
            j = i + 65534;
        }
        return j;
    }

    public int b041A041A041A041A041A041A()
    {
        return 0xe0004;
    }

    public boolean b041A041A041A041A041A041A(int i)
    {
        while (i < 0x10000 || i >= 0xf0000 && i < 0xffffe || i >= 0x100000 && i < 0x10fffe || i >= 0x110000) 
        {
            return false;
        }
        return true;
    }

    public int b041A041A041A041A041A041A(int i)
    {
        if (!b041E041E041E041E041E041E_boolean_static_fld && i < 0x10000)
        {
            throw new AssertionError("A pre-compacted codepoint should be greater than 65536");
        }
        if (i >= 0x100000)
        {
            return i - 0x10000 - 65534 - 65534;
        }
        if (i >= 0xf0000)
        {
            return i - 0x10000 - 65534;
        } else
        {
            return i - 0x10000;
        }
    }

    static 
    {
        boolean flag;
        if (!iiiiii/wiiiwi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b041E041E041E041E041E041E_boolean_static_fld = flag;
    }
}

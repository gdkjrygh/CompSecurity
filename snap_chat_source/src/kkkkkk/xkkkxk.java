// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kkxkxk

public final class xkkkxk extends kkxkxk
{

    private static final int b044E044E044E044E044E044E_int_static_fld = 6400;
    public static int b044E044E044E044E044E044E_int_static_fld = 0;
    public static final boolean b044E044E044E044E044E044E_boolean_static_fld;
    private static final int b044E044E044E044E044E044E_int_static_fld = 1024;
    public static int b044E044E044E044E044E044E_int_static_fld = 1;
    private static final int b044E044E044E044E044E044E_int_static_fld = 0x10000;
    private static final int b044E044E044E044E044E044E_int_static_fld = 57344;
    public static int b044E044E044E044E044E044E_int_static_fld = 2;
    private static final int b044E044E044E044E044E044E_int_static_fld = 56064;
    private static final int b044E044E044E044E044E044E_int_static_fld = 55296;
    public static int b044E044E044E044E044E044E_int_static_fld = 28;
    private static final int b044E044E044E044E044E044E_int_static_fld = 2048;

    public xkkkxk()
    {
        int i = b044E044E044E044E044E044E_int_static_fld;
        switch ((i * (b044E044E044E044E044E044E_int_static_fld + i)) % b044E044E044E044E044E044E_int_static_fld)
        {
        default:
            if (((b044E044E044E044E044E044E_int_static_fld + b044E044E044E044E044E044E_int_static_fld) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld != b041E041E041E041E041E041E())
            {
                b044E044E044E044E044E044E_int_static_fld = 29;
                b044E044E044E044E044E044E_int_static_fld = b041E041E041E041E041E041E();
            }
            b044E044E044E044E044E044E_int_static_fld = 68;
            b044E044E044E044E044E044E_int_static_fld = b041E041E041E041E041E041E();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            super();
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public static int b041E041E041E041E041E041E()
    {
        return 61;
    }

    public static int b041E041E041E041E041E041E()
    {
        return 1;
    }

    public static int b041E041E041E041E041E041E()
    {
        return 0;
    }

    public boolean b041D041D041D041D041D041D(int i)
    {
        if (i >= 2048 && (i < 55296 || i >= 56320))
        {
            int j = b044E044E044E044E044E044E_int_static_fld;
            switch ((j * (b044E044E044E044E044E044E_int_static_fld + j)) % b044E044E044E044E044E044E_int_static_fld)
            {
            default:
                b044E044E044E044E044E044E_int_static_fld = b041E041E041E041E041E041E();
                b044E044E044E044E044E044E_int_static_fld = 83;
                break;

            case 0: // '\0'
                break;
            }
            if ((i < 57344 || i >= 63744) && i < 0x10000)
            {
                return true;
            }
        }
        return false;
    }

    public int b041D041D041D041D041D041D()
    {
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        if (((b044E044E044E044E044E044E_int_static_fld + b041E041E041E041E041E041E()) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld != b044E044E044E044E044E044E_int_static_fld)
        {
            int i = b041E041E041E041E041E041E();
            int j = b044E044E044E044E044E044E_int_static_fld;
            switch ((j * (b044E044E044E044E044E044E_int_static_fld + j)) % b044E044E044E044E044E044E_int_static_fld)
            {
            default:
                b044E044E044E044E044E044E_int_static_fld = 85;
                b044E044E044E044E044E044E_int_static_fld = b041E041E041E041E041E041E();
                // fall through

            case 0: // '\0'
                b044E044E044E044E044E044E_int_static_fld = i;
                break;
            }
            b044E044E044E044E044E044E_int_static_fld = 53;
        }
        return 56064;
    }

    public int b041D041D041D041D041D041D(int i)
    {
        if (!b044E044E044E044E044E044E_boolean_static_fld && i < 2048)
        {
            throw new AssertionError();
        }
        if (i >= 57344)
        {
label0:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break;
                }
            } while (true);
            return i - 2048 - 1024 - 6400;
        }
        if (i >= 55296)
        {
            if (((b044E044E044E044E044E044E_int_static_fld + b044E044E044E044E044E044E_int_static_fld) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld != b041E041E041E041E041E041E())
            {
                b044E044E044E044E044E044E_int_static_fld = b041E041E041E041E041E041E();
                b044E044E044E044E044E044E_int_static_fld = 17;
                if (((b044E044E044E044E044E044E_int_static_fld + b041E041E041E041E041E041E()) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld != b044E044E044E044E044E044E_int_static_fld)
                {
                    b044E044E044E044E044E044E_int_static_fld = b041E041E041E041E041E041E();
                    b044E044E044E044E044E044E_int_static_fld = b041E041E041E041E041E041E();
                }
            }
label1:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label1;

                        case 1: // '\001'
                            continue label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label1;

                case 1: // '\001'
                    break;
                }
            } while (true);
            return i - 2048 - 1024;
        } else
        {
            return i - 2048;
        }
    }

    public int b041D041D041D041D041D041D(int i)
    {
        int j = i % 56064;
        i = j;
        if (j < 0)
        {
            i = b044E044E044E044E044E044E_int_static_fld;
            switch ((i * (b044E044E044E044E044E044E_int_static_fld + i)) % b044E044E044E044E044E044E_int_static_fld)
            {
            default:
                b044E044E044E044E044E044E_int_static_fld = 96;
                b044E044E044E044E044E044E_int_static_fld = b041E041E041E041E041E041E();
                // fall through

            case 0: // '\0'
                i = j + 56064;
                break;
            }
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

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (!kkkkkk/xkkkxk.desiredAssertionStatus())
        {
label0:
            do
            {
                switch (1)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            int i = b044E044E044E044E044E044E_int_static_fld;
            int k = b044E044E044E044E044E044E_int_static_fld;
            int l = b044E044E044E044E044E044E_int_static_fld;
            int i1 = b044E044E044E044E044E044E_int_static_fld;
label1:
            do
            {
                switch (1)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label1;

                        case 1: // '\001'
                            break label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label1;
                }
            } while (true);
            flag = flag1;
            if (((i + k) * l) % i1 != b044E044E044E044E044E044E_int_static_fld)
            {
                b044E044E044E044E044E044E_int_static_fld = 42;
                b044E044E044E044E044E044E_int_static_fld = 16;
                int j = b044E044E044E044E044E044E_int_static_fld;
                flag = flag1;
                switch ((j * (b044E044E044E044E044E044E_int_static_fld + j)) % b044E044E044E044E044E044E_int_static_fld)
                {
                default:
                    b044E044E044E044E044E044E_int_static_fld = 13;
                    b044E044E044E044E044E044E_int_static_fld = b041E041E041E041E041E041E();
                    flag = flag1;
                    break;

                case 0: // '\0'
                    break;
                }
            }
        } else
        {
            flag = false;
        }
        b044E044E044E044E044E044E_boolean_static_fld = flag;
    }
}

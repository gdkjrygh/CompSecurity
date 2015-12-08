// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kkxkxk

public final class kkxxkk extends kkxkxk
{

    public static final boolean b044E044E044E044E044E044E_boolean_static_fld;
    public static int b044E044E044E044E044E044E_int_static_fld = 0;
    private static final int b044E044E044E044E044E044E_int_static_fld = 65534;
    private static final int b044E044E044E044E044E044E_int_static_fld = 0x110000;
    public static int b044E044E044E044E044E044E_int_static_fld = 2;
    private static final int b044E044E044E044E044E044E_int_static_fld = 65534;
    private static final int b044E044E044E044E044E044E_int_static_fld = 0xe0004;
    public static int b044E044E044E044E044E044E_int_static_fld = 1;
    private static final int b044E044E044E044E044E044E_int_static_fld = 0x100000;
    private static final int b044E044E044E044E044E044E_int_static_fld = 0x10000;
    public static int b044E044E044E044E044E044E_int_static_fld = 88;
    private static final int b044E044E044E044E044E044E_int_static_fld = 0xf0000;

    public kkxxkk()
    {
        int i;
        try
        {
            super();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        i = b044E044E044E044E044E044E_int_static_fld;
        switch ((i * (b041D041D041D041D041D041D() + i)) % b044E044E044E044E044E044E_int_static_fld)
        {
        default:
            int j = b044E044E044E044E044E044E_int_static_fld;
            switch ((j * (b044E044E044E044E044E044E_int_static_fld + j)) % b044E044E044E044E044E044E_int_static_fld)
            {
            default:
                b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
                b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
                // fall through

            case 0: // '\0'
                b044E044E044E044E044E044E_int_static_fld = 74;
                break;
            }
            b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b041D041D041D041D041D041D()
    {
        return 11;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 0;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 1;
    }

    public boolean b041D041D041D041D041D041D(int i)
    {
        if (i >= 0x10000) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j;
        int k;
        int l;
        if (i < 0xf0000 || i >= 0xffffe)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = b044E044E044E044E044E044E_int_static_fld;
        j = b044E044E044E044E044E044E_int_static_fld;
        k = b044E044E044E044E044E044E_int_static_fld;
        l = b044E044E044E044E044E044E_int_static_fld;
        int i1 = b044E044E044E044E044E044E_int_static_fld;
        switch ((i1 * (b044E044E044E044E044E044E_int_static_fld + i1)) % b044E044E044E044E044E044E_int_static_fld)
        {
        default:
            b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
            b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
            break;

        case 0: // '\0'
            break;
        }
        if (((i + j) * k) % l == b044E044E044E044E044E044E_int_static_fld) goto _L1; else goto _L3
_L3:
        b044E044E044E044E044E044E_int_static_fld = 21;
        b044E044E044E044E044E044E_int_static_fld = 9;
        return false;
        if (i >= 0x100000 && i < 0x10fffe || i >= 0x110000) goto _L1; else goto _L4
_L4:
        return true;
    }

    public int b041D041D041D041D041D041D()
    {
        return 0xe0004;
    }

    public int b041D041D041D041D041D041D(int i)
    {
        boolean flag;
        try
        {
            flag = b044E044E044E044E044E044E_boolean_static_fld;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        if (((b041D041D041D041D041D041D() + b044E044E044E044E044E044E_int_static_fld) * b041D041D041D041D041D041D()) % b044E044E044E044E044E044E_int_static_fld != b044E044E044E044E044E044E_int_static_fld)
        {
            b044E044E044E044E044E044E_int_static_fld = 98;
            b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
        }
        if (!flag)
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
            if (i < 0x10000)
            {
                try
                {
                    throw new AssertionError("A pre-compacted codepoint should be greater than 65536");
                }
                catch (Exception exception)
                {
                    throw exception;
                }
            }
        }
        if (i >= 0x100000)
        {
            i = i - 0x10000 - 65534 - 65534;
        } else
        if (i >= 0xf0000)
        {
            int j = i - 0x10000 - 65534;
            i = j;
            if (((b044E044E044E044E044E044E_int_static_fld + b044E044E044E044E044E044E_int_static_fld) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld != b044E044E044E044E044E044E_int_static_fld)
            {
                b044E044E044E044E044E044E_int_static_fld = 26;
                b044E044E044E044E044E044E_int_static_fld = 91;
                return j;
            }
        } else
        {
            return i - 0x10000;
        }
        return i;
    }

    public int b041D041D041D041D041D041D(int i)
    {
label0:
        {
            int j = i % 0xe0004;
            i = j;
            if (j >= 0)
            {
                break label0;
            }
            j += 0xe0004;
            i = j;
            try
            {
                if (((b044E044E044E044E044E044E_int_static_fld + b041D041D041D041D041D041D()) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld == b041D041D041D041D041D041D())
                {
                    break label0;
                }
                b044E044E044E044E044E044E_int_static_fld = 37;
                b044E044E044E044E044E044E_int_static_fld = 45;
            }
            catch (Exception exception)
            {
                throw exception;
            }
            i = j;
        }
        j = i + 0x10000;
        i = j;
        if (j >= 0xf0000)
        {
            j += 65534;
            i = b044E044E044E044E044E044E_int_static_fld;
            switch ((i * (b044E044E044E044E044E044E_int_static_fld + i)) % b044E044E044E044E044E044E_int_static_fld)
            {
            default:
                b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
                b044E044E044E044E044E044E_int_static_fld = 33;
                break;

            case 0: // '\0'
                break;
            }
label1:
            do
            {
                i = j;
                switch (1)
                {
                default:
                    while (true) 
                    {
                        i = j;
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
        }
        j = i;
        if (i >= 0x100000)
        {
            j = i + 65534;
        }
        return j;
    }

    static 
    {
        boolean flag;
        boolean flag1 = false;
        int i;
        try
        {
            flag = kkkkkk/kkxxkk.desiredAssertionStatus();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        i = b041D041D041D041D041D041D();
        (i * (b044E044E044E044E044E044E_int_static_fld + i)) % b044E044E044E044E044E044E_int_static_fld;
        JVM INSTR tableswitch 0 0: default 44
    //                   0 150;
           goto _L3 _L4
_L3:
        b044E044E044E044E044E044E_int_static_fld = 99;
        b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
        flag = true;
_L6:
        b044E044E044E044E044E044E_boolean_static_fld = flag;
        return;
_L2:
        flag = flag1;
        if (((b044E044E044E044E044E044E_int_static_fld + b041D041D041D041D041D041D()) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld == b044E044E044E044E044E044E_int_static_fld)
        {
            continue; /* Loop/switch isn't completed */
        }
        b044E044E044E044E044E044E_int_static_fld = 13;
        b044E044E044E044E044E044E_int_static_fld = 5;
label0:
        do
        {
            flag = flag1;
            switch (1)
            {
            case 0: // '\0'
                continue;

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
            do
            {
                flag = flag1;
                switch (0)
                {
                default:
                    break;

                case 0: // '\0'
                    continue; /* Loop/switch isn't completed */

                case 1: // '\001'
                    continue label0;
                }
            } while (true);
        } while (true);
_L4:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }
}

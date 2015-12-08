// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


public final class kxkxkk
{

    public static int b044E044E044E044E044E044E_int_static_fld = 0;
    public static int b044E044E044E044E044E044E_int_static_fld = 1;
    public static int b044E044E044E044E044E044E_int_static_fld = 2;
    public static int b044E044E044E044E044E044E_int_static_fld = 92;
    private int b044E044E044E044E044E044E_int_fld;
    public final String b044E044E044E044E044E044E_java_lang_String_fld;
    public final int b044E044E044E044E044E044E_int_fld;

    public kxkxkk(String s)
    {
        int i;
        try
        {
            super();
            b044E044E044E044E044E044E_java_lang_String_fld = s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            b044E044E044E044E044E044E_int_fld = s.length();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        i = b044E044E044E044E044E044E_int_static_fld;
        switch ((i * (b044E044E044E044E044E044E_int_static_fld + i)) % b044E044E044E044E044E044E_int_static_fld)
        {
        default:
            b044E044E044E044E044E044E_int_static_fld = 91;
            b044E044E044E044E044E044E_int_static_fld = 26;
            if (((b044E044E044E044E044E044E_int_static_fld + b044E044E044E044E044E044E_int_static_fld) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld != b044E044E044E044E044E044E_int_static_fld)
            {
                b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
                b044E044E044E044E044E044E_int_static_fld = 5;
            }
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b041D041D041D041D041D041D()
    {
        return 99;
    }

    public int b041D041D041D041D041D041D()
    {
        int i;
        int j;
        int k;
        try
        {
            i = b044E044E044E044E044E044E_java_lang_String_fld.codePointAt(b044E044E044E044E044E044E_int_fld);
            j = b044E044E044E044E044E044E_int_fld;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
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
        try
        {
            b044E044E044E044E044E044E_int_fld = j + 1;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (i < 0x10000)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        j = b044E044E044E044E044E044E_int_fld;
        k = b044E044E044E044E044E044E_int_fld;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        if (((b041D041D041D041D041D041D() + b044E044E044E044E044E044E_int_static_fld) * b041D041D041D041D041D041D()) % b044E044E044E044E044E044E_int_static_fld != b044E044E044E044E044E044E_int_static_fld)
        {
            b044E044E044E044E044E044E_int_static_fld = 38;
            b044E044E044E044E044E044E_int_static_fld = 89;
        }
        j = b044E044E044E044E044E044E_java_lang_String_fld.codePointAt(b044E044E044E044E044E044E_int_fld);
        if (j >= 0x10000)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        if (((b044E044E044E044E044E044E_int_static_fld + b044E044E044E044E044E044E_int_static_fld) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld != b044E044E044E044E044E044E_int_static_fld)
        {
            b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
            b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
        }
        b044E044E044E044E044E044E_int_fld = b044E044E044E044E044E044E_int_fld + 1;
        return i;
    }

    public boolean b041D041D041D041D041D041D()
    {
        int i;
        int j;
        try
        {
            i = b044E044E044E044E044E044E_int_fld;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b044E044E044E044E044E044E_int_static_fld + b044E044E044E044E044E044E_int_static_fld) * b044E044E044E044E044E044E_int_static_fld) % b044E044E044E044E044E044E_int_static_fld != b044E044E044E044E044E044E_int_static_fld)
        {
            b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
            b044E044E044E044E044E044E_int_static_fld = b041D041D041D041D041D041D();
        }
        j = b044E044E044E044E044E044E_int_fld;
        return i < j;
    }
}

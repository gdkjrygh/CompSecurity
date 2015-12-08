// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kxxkkk, xxkxkk, kxkxkk, kkxkxk

public class kxxxkk extends kxxkkk
{

    public static int b044E044E044E044E044E044E = 90;
    public static int b044E044E044E044E044E044E = 1;
    public static int b044E044E044E044E044E044E = 2;
    public static int b044E044E044E044E044E044E;

    public kxxxkk()
    {
        int i = b041D041D041D041D041D041D();
        int j = b044E044E044E044E044E044E;
        int k = b041D041D041D041D041D041D();
        int l = b044E044E044E044E044E044E;
        int i1 = b044E044E044E044E044E044E;
        switch ((i1 * (b044E044E044E044E044E044E + i1)) % b041D041D041D041D041D041D())
        {
        default:
            b044E044E044E044E044E044E = 52;
            b044E044E044E044E044E044E = 47;
            break;

        case 0: // '\0'
            break;
        }
        if (((i + j) * k) % l != b044E044E044E044E044E044E)
        {
            b044E044E044E044E044E044E = b041D041D041D041D041D041D();
        }
        super();
_L8:
        0;
        JVM INSTR tableswitch 0 1: default 108
    //                   0 135
    //                   1 86;
           goto _L1 _L2 _L3
_L3:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (1)
            {
            default:
                break;

            case 0: // '\0'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                break label0;
            }
        }
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 160
    //                   0 86
    //                   1 187;
           goto _L4 _L5 _L6
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            switch (1)
            {
            default:
                break;

            case 0: // '\0'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                break; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static int b041D041D041D041D041D041D()
    {
        return 2;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 18;
    }

    public String b041D041D041D041D041D041D(String s, char c)
    {
        int i = 0;
        int ai[];
        kkxkxk kkxkxk1;
        int j;
        try
        {
            ai = new int[s.length()];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
label0:
        do
        {
            switch (0)
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
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        j = b044E044E044E044E044E044E;
        switch ((j * (b044E044E044E044E044E044E + j)) % b044E044E044E044E044E044E)
        {
        default:
            b044E044E044E044E044E044E = 86;
            b044E044E044E044E044E044E = 0;
            break;

        case 0: // '\0'
            break;
        }
        s = new kxkxkk(s);
_L1:
        if (!s.b041D041D041D041D041D041D())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        j = s.b041D041D041D041D041D041D();
        kkxkxk1 = kkxkxk.b041E041E041E041E041E041E(j);
        ai[i] = kkxkxk1.b041D041D041D041D041D041D(kkxkxk1.b041D041D041D041D041D041D(j) - (c + c + i));
        j = i + 1;
        i = j;
        if (((b044E044E044E044E044E044E + b044E044E044E044E044E044E) * b044E044E044E044E044E044E) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
        {
            b044E044E044E044E044E044E = b041D041D041D041D041D041D();
            b044E044E044E044E044E044E = b041D041D041D041D041D041D();
            i = j;
        }
          goto _L1
        s = new String(ai, 0, i);
        return s;
        s;
        throw s;
    }
}

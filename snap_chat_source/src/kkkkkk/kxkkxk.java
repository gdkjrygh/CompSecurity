// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kkkkxk, xxkxkk, kxkxkk, kkxkxk

public class kxkkxk extends kkkkxk
{

    public static int b044E044E044E044E044E044E = 0;
    public static int b044E044E044E044E044E044E = 1;
    public static int b044E044E044E044E044E044E = 2;
    public static int b044E044E044E044E044E044E = 60;

    public kxkkxk()
    {
        if (((b044E044E044E044E044E044E + b044E044E044E044E044E044E) * b044E044E044E044E044E044E) % b044E044E044E044E044E044E != b041E041E041E041E041E041E())
        {
            b044E044E044E044E044E044E = 96;
            b044E044E044E044E044E044E = b041E041E041E041E041E041E();
        }
    }

    public static int b041E041E041E041E041E041E()
    {
        return 1;
    }

    public static int b041E041E041E041E041E041E()
    {
        return 2;
    }

    public static int b041E041E041E041E041E041E()
    {
        return 61;
    }

    public static int b041E041E041E041E041E041E()
    {
        return 0;
    }

    public String b041D041D041D041D041D041D(String s, char c, char c1)
    {
        int ai[];
        kkxkxk kkxkxk1;
        int i;
        int j;
        int k;
        boolean flag;
        try
        {
            ai = new int[s.length()];
            s = new kxkxkk(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        i = 0;
        flag = s.b041D041D041D041D041D041D();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            j = s.b041D041D041D041D041D041D();
            kkxkxk1 = kkxkxk.b041E041E041E041E041E041E(j);
            j = kkxkxk1.b041D041D041D041D041D041D(j);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((b044E044E044E044E044E044E + b044E044E044E044E044E044E) * b044E044E044E044E044E044E) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
        {
            b044E044E044E044E044E044E = 89;
            b044E044E044E044E044E044E = b041E041E041E041E041E041E();
        }
        ai[i] = kkxkxk1.b041D041D041D041D041D041D((j + (c + i)) - c1);
        j = i + 1;
        k = b044E044E044E044E044E044E;
        i = j;
        switch ((k * (b041E041E041E041E041E041E() + k)) % b044E044E044E044E044E044E)
        {
        case 0: // '\0'
            if (false)
            {
            }
            break;

        default:
            b044E044E044E044E044E044E = b041E041E041E041E041E041E();
            b044E044E044E044E044E044E = b041E041E041E041E041E041E();
            i = j;
            break;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_20;
_L4:
        s = new String(ai, 0, i);
        return s;
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 208
    //                   0 186
    //                   1 171;
           goto _L3 _L1 _L4
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 232
    //                   0 171
    //                   1 186;
           goto _L3 _L4 _L1
    }
}

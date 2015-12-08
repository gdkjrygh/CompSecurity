// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kxxkkk, xxkxkk, kxkxkk, kkxkxk

public class xxkkxk extends kxxkkk
{

    public static int b041D041D041D041D041D041D = 47;
    public static int b044E044E044E044E044E044E = 1;
    public static int b044E044E044E044E044E044E = 2;
    public static int b044E044E044E044E044E044E;

    public xxkkxk()
    {
        if (((b041D041D041D041D041D041D + b044E044E044E044E044E044E) * b041D041D041D041D041D041D) % b041E041E041E041E041E041E() != b044E044E044E044E044E044E)
        {
            b041D041D041D041D041D041D = b041E041E041E041E041E041E();
            b044E044E044E044E044E044E = 59;
        }
    }

    public static int b041E041E041E041E041E041E()
    {
        return 2;
    }

    public static int b041E041E041E041E041E041E()
    {
        return 39;
    }

    public String b041D041D041D041D041D041D(String s, char c)
    {
        int ai[];
        kkxkxk kkxkxk1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            ai = new int[s.length()];
            i = b041D041D041D041D041D041D;
            j = b044E044E044E044E044E044E;
            k = b041D041D041D041D041D041D;
            l = b041E041E041E041E041E041E();
            i1 = b044E044E044E044E044E044E;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((i + j) * k) % l != i1)
        {
            try
            {
                b041D041D041D041D041D041D = b041E041E041E041E041E041E();
                b044E044E044E044E044E044E = b041E041E041E041E041E041E();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        s = new kxkxkk(s);
        i = 0;
_L10:
        if (!s.b041D041D041D041D041D041D()) goto _L2; else goto _L1
_L1:
        j = s.b041D041D041D041D041D041D();
          goto _L3
_L8:
        kkxkxk1 = kkxkxk.b041E041E041E041E041E041E(j);
        j = kkxkxk1.b041D041D041D041D041D041D(j);
        ai[i] = kkxkxk1.b041D041D041D041D041D041D(j + (c + i));
        j = i + 1;
        i = j;
        if (((b041D041D041D041D041D041D + b044E044E044E044E044E044E) * b041D041D041D041D041D041D) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
        {
            b041D041D041D041D041D041D = b041E041E041E041E041E041E();
            b044E044E044E044E044E044E = 45;
            i = j;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        s = new String(ai, 0, i);
        return s;
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 212
    //                   0 88
    //                   1 189;
           goto _L4 _L5 _L3
_L5:
        continue; /* Loop/switch isn't completed */
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 236
    //                   0 189
    //                   1 88;
           goto _L4 _L3 _L6
_L6:
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L9:
    }
}

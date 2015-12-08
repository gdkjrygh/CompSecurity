// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kxxkkk, xxkxkk, kxkxkk, kkxkxk

public class xxkkkk extends kxxkkk
{

    public static int b043A043A043A043A043A043A = 0;
    public static int b043A043A043A043A043A043A = 2;
    public static int b043A043A043A043A043A043A = 60;
    public static int b043A043A043A043A043A043A = 1;

    public xxkkkk()
    {
        int i;
        int j;
        int k;
        try
        {
            i = b041D041D041D041D041D041D();
            j = b043A043A043A043A043A043A;
            k = b041D041D041D041D041D041D();
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        if (((i + j) * k) % b043A043A043A043A043A043A == b041D041D041D041D041D041D())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        b043A043A043A043A043A043A = b041D041D041D041D041D041D();
        if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            b043A043A043A043A043A043A = b041D041D041D041D041D041D();
            b043A043A043A043A043A043A = b041D041D041D041D041D041D();
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

    public static int b041D041D041D041D041D041D()
    {
        return 0;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 67;
    }

    public String b041D041D041D041D041D041D(String s, char c)
    {
        int i = 0;
        int ai[];
        kkxkxk kkxkxk1;
        int j;
        int k;
        try
        {
            j = s.length();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        k = b043A043A043A043A043A043A;
        (k * (b043A043A043A043A043A043A + k)) % b043A043A043A043A043A043A;
        JVM INSTR tableswitch 0 0: default 183
    //                   0 54;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_54;
_L1:
        b043A043A043A043A043A043A = 41;
        b043A043A043A043A043A043A = 91;
        ai = new int[j];
        s = new kxkxkk(s);
_L5:
        if (!s.b041D041D041D041D041D041D()) goto _L4; else goto _L3
_L3:
        j = s.b041D041D041D041D041D041D();
        kkxkxk1 = kkxkxk.b041E041E041E041E041E041E(j);
        if (((b041D041D041D041D041D041D() + b043A043A043A043A043A043A) * b041D041D041D041D041D041D()) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            b043A043A043A043A043A043A = b041D041D041D041D041D041D();
            b043A043A043A043A043A043A = b041D041D041D041D041D041D();
        }
        j = kkxkxk1.b041D041D041D041D041D041D(kkxkxk1.b041D041D041D041D041D041D(j) + (c + c + i));
        ai[i] = j;
        i++;
          goto _L5
_L4:
        s = new String(ai, 0, i);
        return s;
        s;
        throw s;
        s;
        throw s;
    }
}

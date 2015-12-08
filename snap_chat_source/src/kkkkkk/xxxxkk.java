// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kkkkxk, xxkxkk, kxkxkk, kkxkxk

public class xxxxkk extends kkkkxk
{

    public static int b044E044E044E044E044E044E = 1;
    public static int b044E044E044E044E044E044E = 0;
    public static int b044E044E044E044E044E044E = 2;
    public static int b044E044E044E044E044E044E = 97;

    public xxxxkk()
    {
        int i = b044E044E044E044E044E044E;
        switch ((i * (b041E041E041E041E041E041E() + i)) % b044E044E044E044E044E044E)
        {
        default:
            b044E044E044E044E044E044E = b041D041D041D041D041D041D();
            b044E044E044E044E044E044E = b041D041D041D041D041D041D();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            super();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b044E044E044E044E044E044E + b041E041E041E041E041E041E()) * b044E044E044E044E044E044E) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
        {
            b044E044E044E044E044E044E = b041D041D041D041D041D041D();
            b044E044E044E044E044E044E = b041D041D041D041D041D041D();
        }
    }

    public static int b041D041D041D041D041D041D()
    {
        return 2;
    }

    public static int b041E041E041E041E041E041E()
    {
        return 1;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 99;
    }

    public String b041D041D041D041D041D041D(String s, char c, char c1)
    {
        int i = 0;
        int ai[];
        kkxkxk kkxkxk1;
        int j;
        int k;
        int l;
        try
        {
            ai = new int[s.length()];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        switch (1)
        {
        default:
label0:
            do
            {
                switch (0)
                {
                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break MISSING_BLOCK_LABEL_11;
                }
            } while (true);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_11;

        case 1: // '\001'
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
        k = b044E044E044E044E044E044E;
        l = b041E041E041E041E041E041E();
        try
        {
            if (((k + l) * b044E044E044E044E044E044E) % b041D041D041D041D041D041D() != b044E044E044E044E044E044E)
            {
                b044E044E044E044E044E044E = 84;
                b044E044E044E044E044E044E = 65;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        j = kkxkxk1.b041D041D041D041D041D041D(j);
        ai[i] = kkxkxk1.b041D041D041D041D041D041D(j + (c + i) + c1);
        j = i + 1;
        i = j;
        if (((b044E044E044E044E044E044E + b044E044E044E044E044E044E) * b044E044E044E044E044E044E) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
        {
            b044E044E044E044E044E044E = 18;
            b044E044E044E044E044E044E = 40;
            i = j;
        }
          goto _L1
        s = new String(ai, 0, i);
        return s;
    }
}

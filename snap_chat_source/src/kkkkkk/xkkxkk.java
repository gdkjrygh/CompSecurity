// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kxxkkk, xxkxkk, kxkxkk, kkxkxk

public class xkkxkk extends kxxkkk
{

    public static int b043A043A043A043A043A043A = 88;
    public static int b043A043A043A043A043A043A = 1;
    public static int b043A043A043A043A043A043A = 2;
    public static int b043A043A043A043A043A043A;

    public xkkxkk()
    {
label0:
        {
            int i;
            try
            {
                if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A == b043A043A043A043A043A043A)
                {
                    break label0;
                }
                b043A043A043A043A043A043A = b041D041D041D041D041D041D();
            }
            catch (Exception exception)
            {
                throw exception;
            }
            try
            {
                b043A043A043A043A043A043A = b041D041D041D041D041D041D();
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
            i = b043A043A043A043A043A043A;
            switch ((i * (b041D041D041D041D041D041D() + i)) % b043A043A043A043A043A043A)
            {
            default:
                b043A043A043A043A043A043A = 79;
                b043A043A043A043A043A043A = 52;
                break;

            case 0: // '\0'
                break;
            }
        }
        super();
label1:
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
                        break label1;

                    case 1: // '\001'
                        continue label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
        return;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 1;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 7;
    }

    public String b041D041D041D041D041D041D(String s, char c)
    {
        int ai[] = new int[s.length()];
        s = new kxkxkk(s);
        int i = 0;
label0:
        do
        {
            int j;
            do
            {
                if (!s.b041D041D041D041D041D041D())
                {
                    break label0;
                }
                j = s.b041D041D041D041D041D041D();
                kkxkxk kkxkxk1 = kkxkxk.b041E041E041E041E041E041E(j);
                j = kkxkxk1.b041D041D041D041D041D041D(kkxkxk1.b041D041D041D041D041D041D(j) - (c + c + c + i));
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
                ai[i] = j;
                j = i + 1;
                i = j;
            } while (((b043A043A043A043A043A043A + b041D041D041D041D041D041D()) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A == b043A043A043A043A043A043A);
            b043A043A043A043A043A043A = 32;
            b043A043A043A043A043A043A = b041D041D041D041D041D041D();
            int k = b043A043A043A043A043A043A;
            i = j;
            switch ((k * (b043A043A043A043A043A043A + k)) % b043A043A043A043A043A043A)
            {
            default:
                b043A043A043A043A043A043A = 52;
                b043A043A043A043A043A043A = 2;
                i = j;
                break;

            case 0: // '\0'
                break;
            }
        } while (true);
        return new String(ai, 0, i);
    }
}

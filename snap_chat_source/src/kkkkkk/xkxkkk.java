// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kkkkxk, xxkxkk, kxkxkk, kkxkxk

public class xkxkkk extends kkkkxk
{

    public static int b043A043A043A043A043A043A = 2;
    public static int b043A043A043A043A043A043A = 0;
    public static int b043A043A043A043A043A043A = 1;
    public static int b043A043A043A043A043A043A = 29;

    public xkxkkk()
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
        try
        {
            if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
            {
                b043A043A043A043A043A043A = 47;
                b043A043A043A043A043A043A = b041D041D041D041D041D041D();
            }
            super();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            b043A043A043A043A043A043A = 65;
            b043A043A043A043A043A043A = b041D041D041D041D041D041D();
        }
    }

    public static int b041D041D041D041D041D041D()
    {
        return 91;
    }

    public String b041D041D041D041D041D041D(String s, char c, char c1)
    {
        int ai[] = new int[s.length()];
        s = new kxkxkk(s);
        int i = 0;
        do
        {
            if (!s.b041D041D041D041D041D041D())
            {
                break;
            }
            int j = s.b041D041D041D041D041D041D();
            kkxkxk kkxkxk1 = kkxkxk.b041E041E041E041E041E041E(j);
            j = kkxkxk1.b041D041D041D041D041D041D(j);
            int k = b043A043A043A043A043A043A;
            switch ((k * (b043A043A043A043A043A043A + k)) % b043A043A043A043A043A043A)
            {
            default:
                b043A043A043A043A043A043A = b041D041D041D041D041D041D();
                b043A043A043A043A043A043A = b041D041D041D041D041D041D();
                // fall through

            case 0: // '\0'
                ai[i] = kkxkxk1.b041D041D041D041D041D041D(j - (c + i) - c1);
                break;
            }
            j = i + 1;
            i = j;
            if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
            {
                b043A043A043A043A043A043A = 92;
                b043A043A043A043A043A043A = 98;
                i = j;
            }
        } while (true);
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
        return new String(ai, 0, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kkkkxk, xxkxkk, kxkxkk, kkxkxk

public class kkkxkk extends kkkkxk
{

    public static int b043A043A043A043A043A043A = 1;
    public static int b043A043A043A043A043A043A = 2;
    public static int b043A043A043A043A043A043A = 90;

    public kkkxkk()
    {
        if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b041D041D041D041D041D041D() != b041D041D041D041D041D041D())
        {
            int i = b043A043A043A043A043A043A;
            switch ((i * (b043A043A043A043A043A043A + i)) % b043A043A043A043A043A043A)
            {
            default:
                b043A043A043A043A043A043A = b041D041D041D041D041D041D();
                b043A043A043A043A043A043A = 62;
                // fall through

            case 0: // '\0'
                b043A043A043A043A043A043A = b041D041D041D041D041D041D();
                break;
            }
            b043A043A043A043A043A043A = b041D041D041D041D041D041D();
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
        super();
    }

    public static int b041D041D041D041D041D041D()
    {
        return 0;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 22;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 2;
    }

    public String b041D041D041D041D041D041D(String s, char c, char c1)
    {
        int ai[] = new int[s.length()];
        int i = b041D041D041D041D041D041D();
        switch ((i * (b043A043A043A043A043A043A + i)) % b043A043A043A043A043A043A)
        {
        default:
            b043A043A043A043A043A043A = b041D041D041D041D041D041D();
            b043A043A043A043A043A043A = 52;
            // fall through

        case 0: // '\0'
            s = new kxkxkk(s);
            break;
        }
        i = 0;
        do
        {
            if (!s.b041D041D041D041D041D041D())
            {
                break;
            }
            int j = s.b041D041D041D041D041D041D();
            kkxkxk kkxkxk1 = kkxkxk.b041E041E041E041E041E041E(j);
            ai[i] = kkxkxk1.b041D041D041D041D041D041D((kkxkxk1.b041D041D041D041D041D041D(j) - (c + i)) + c1);
            j = i + 1;
            int k = b043A043A043A043A043A043A;
            i = j;
            switch ((k * (b043A043A043A043A043A043A + k)) % b043A043A043A043A043A043A)
            {
            default:
                b043A043A043A043A043A043A = 18;
                b043A043A043A043A043A043A = b041D041D041D041D041D041D();
                i = j;
                break;

            case 0: // '\0'
                break;
            }
        } while (true);
        return new String(ai, 0, i);
    }
}

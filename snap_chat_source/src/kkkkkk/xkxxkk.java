// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kkkkkk;


// Referenced classes of package kkkkkk:
//            kxxkkk, xxkxkk, kxkxkk, kkxkxk

public class xkxxkk extends kxxkkk
{

    public static int b044E044E044E044E044E044E = 1;
    public static int b044E044E044E044E044E044E = 2;
    public static int b044E044E044E044E044E044E = 0;
    public static int b044E044E044E044E044E044E = 67;

    public xkxxkk()
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
        i = b044E044E044E044E044E044E;
        switch ((i * (b041D041D041D041D041D041D() + i)) % b044E044E044E044E044E044E)
        {
        default:
            b044E044E044E044E044E044E = b041D041D041D041D041D041D();
            b044E044E044E044E044E044E = b041D041D041D041D041D041D();
            int j = b044E044E044E044E044E044E;
            switch ((j * (b041D041D041D041D041D041D() + j)) % b044E044E044E044E044E044E)
            {
            default:
                b044E044E044E044E044E044E = 26;
                b044E044E044E044E044E044E = b041D041D041D041D041D041D();
                break;

            case 0: // '\0'
                break;
            }
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b041D041D041D041D041D041D()
    {
        return 1;
    }

    public static int b041D041D041D041D041D041D()
    {
        return 10;
    }

    public String b041D041D041D041D041D041D(String s, char c)
    {
        int ai[] = new int[s.length()];
        s = new kxkxkk(s);
        int i = 0;
        do
        {
            int j = b044E044E044E044E044E044E;
            switch ((j * (b044E044E044E044E044E044E + j)) % b044E044E044E044E044E044E)
            {
            default:
                b044E044E044E044E044E044E = 63;
                b044E044E044E044E044E044E = b041D041D041D041D041D041D();
                break;

            case 0: // '\0'
                break;
            }
            if (!s.b041D041D041D041D041D041D())
            {
                break;
            }
            j = s.b041D041D041D041D041D041D();
label0:
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
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            kkxkxk kkxkxk1 = kkxkxk.b041E041E041E041E041E041E(j);
            ai[i] = kkxkxk1.b041D041D041D041D041D041D(kkxkxk1.b041D041D041D041D041D041D(j) + (c + c + c + i));
            j = i + 1;
label1:
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
                            break label1;

                        case 1: // '\001'
                            continue label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label1;

                case 1: // '\001'
                    break;
                }
            } while (true);
            i = j;
            if (((b044E044E044E044E044E044E + b044E044E044E044E044E044E) * b044E044E044E044E044E044E) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
            {
                b044E044E044E044E044E044E = 49;
                b044E044E044E044E044E044E = 63;
                i = j;
            }
        } while (true);
        return new String(ai, 0, i);
    }
}

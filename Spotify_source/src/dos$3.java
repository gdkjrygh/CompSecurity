// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements djw
{

    private dos a;

    public final int a(int i)
    {
        boolean flag = false;
        byte byte0 = flag;
        if (drg.e(dos.a(a, i)))
        {
            int j = dos.a(a, i - 1);
            if (drg.a(dos.e(a, i)))
            {
                drf drf = dos.e(a, i - 1);
                flag = true;
                byte0 = flag;
                if (i > 0)
                {
                    byte0 = flag;
                    if (!drg.a(drf))
                    {
                        byte0 = 3;
                    }
                }
            } else
            {
                byte0 = flag;
                if (drg.d(j))
                {
                    return 2;
                }
            }
        }
        return byte0;
    }

    (dos dos1)
    {
        a = dos1;
        super();
    }
}

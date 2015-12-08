// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gbx
{

    private static final String a[] = {
        "Various", "Various Artists", "Various Artist", "Various Artists.", "Various Artistes"
    };

    public static boolean a(String s)
    {
        boolean flag1 = false;
        String as[] = a;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < 5)
                {
                    if (!as[i].equalsIgnoreCase(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

}

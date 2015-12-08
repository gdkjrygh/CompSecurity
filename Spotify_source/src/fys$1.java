// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.String extends fyo
{

    public final boolean a(int i)
    {
        boolean flag1 = false;
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 2) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag || i != 0)
        {
            flag1 = true;
        }
        return flag1;
    }

    (String s, fyt fyt)
    {
        super(s, fyt);
    }
}

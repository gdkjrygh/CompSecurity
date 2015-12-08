// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ecd
{

    private Object a;

    public ecd()
    {
        a = null;
    }

    public final boolean a(Object obj)
    {
        boolean flag;
        if (!obj.equals(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a = obj;
        }
        return flag;
    }
}

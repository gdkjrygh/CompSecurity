// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cbg
{

    public static cbi a(cbk cbk1)
    {
        if (cbk1 == null)
        {
            return null;
        } else
        {
            return cbk1.a();
        }
    }

    public static transient boolean a(cbk cbk1, cbi cbi, String as[])
    {
        if (cbk1 == null || cbi == null)
        {
            return false;
        } else
        {
            return cbk1.a(cbi, as);
        }
    }
}

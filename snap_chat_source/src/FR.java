// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class FR
{

    private static FR a;

    private FR()
    {
    }

    public static FR a()
    {
        if (a == null)
        {
            a = new FR();
        }
        return a;
    }
}

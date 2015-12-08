// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aaE
{

    public int a;
    public int b;

    public aaE(Throwable throwable)
    {
label0:
        {
            super();
            a = 3;
            b = aaD.a.ordinal();
            if (throwable != null)
            {
                a = aaF.a(throwable);
                if (a != 3)
                {
                    break label0;
                }
                b = aaD.a(throwable).b;
            }
            return;
        }
        b = Integer.parseInt(throwable.getMessage());
    }
}

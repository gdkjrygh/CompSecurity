// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ddm extends ThreadLocal
{

    private int a;

    ddm(int i)
    {
        a = i;
        super();
    }

    protected final Object initialValue()
    {
        return new float[a];
    }
}

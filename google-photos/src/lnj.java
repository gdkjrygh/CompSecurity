// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lnj extends ThreadLocal
{

    lnj()
    {
    }

    protected final Object initialValue()
    {
        return new StringBuilder();
    }
}

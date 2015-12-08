// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class ec extends dY
{
    static final class a extends ec
    {

        final ec a()
        {
            return null;
        }

        a(Object obj, Object obj1)
        {
            super(obj, obj1);
        }
    }


    ec(ec ec1)
    {
        super(ec1.getKey(), ec1.getValue());
    }

    ec(Object obj, Object obj1)
    {
        super(obj, obj1);
        dF.a(obj, obj1);
    }

    abstract ec a();
}

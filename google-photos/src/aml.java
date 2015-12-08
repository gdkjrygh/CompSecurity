// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class aml
    implements Cloneable
{

    azr a;

    public aml()
    {
        a = azn.a();
    }

    protected final aml a()
    {
        aml aml1;
        try
        {
            aml1 = (aml)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new RuntimeException(clonenotsupportedexception);
        }
        return aml1;
    }

    public final aml a(azr azr1)
    {
        a = (azr)b.a(azr1, "Argument must not be null");
        return this;
    }

    protected Object clone()
    {
        return a();
    }
}

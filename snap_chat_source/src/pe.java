// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class pe extends oB
{

    private final Iu mGson;

    public pe(Iu iu)
    {
        super(java/lang/Object);
        mGson = iu;
    }

    private oR c(Object obj)
    {
        if (obj instanceof byte[])
        {
            return new oE((byte[])obj);
        }
        if (obj instanceof String)
        {
            return new pt((String)obj);
        }
        if (IJ.a(obj.getClass()))
        {
            return new pt(obj.toString());
        }
        pt pt1;
        try
        {
            pt1 = new pt(mGson.a(obj));
        }
        catch (Exception exception)
        {
            throw new RuntimeException((new StringBuilder("Trouble serializing: Class=")).append(obj.getClass().getName()).append(", with toString()=").append(obj.toString()).toString(), exception);
        }
        return pt1;
    }

    protected final Object b(Object obj)
    {
        return c(obj);
    }
}

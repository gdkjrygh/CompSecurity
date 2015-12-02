// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class s
    implements bkr
{

    public final bkq create(bjw bjw, bmj bmj1)
    {
        bmj1 = bmj1.getRawType();
        if (!java/lang/Enum.isAssignableFrom(bmj1) || bmj1 == java/lang/Enum)
        {
            return null;
        }
        bjw = bmj1;
        if (!bmj1.isEnum())
        {
            bjw = bmj1.getSuperclass();
        }
        return new bmi(bjw);
    }

    s()
    {
    }
}

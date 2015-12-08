// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ekh extends RuntimeException
{

    public ekh(Class class1)
    {
        class1 = String.valueOf(class1);
        super((new StringBuilder(String.valueOf(class1).length() + 17)).append("Missing feature ").append(class1).append("!").toString());
    }

    public ekh(Class class1, Class class2)
    {
        class2 = String.valueOf(class2);
        class1 = String.valueOf(class1);
        super((new StringBuilder(String.valueOf(class2).length() + 28 + String.valueOf(class1).length())).append("No registered ").append(class2).append(" for feature: ").append(class1).toString());
    }
}

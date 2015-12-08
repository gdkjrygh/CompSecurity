// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ek
{

    public static Object a(Object obj, Class class1)
    {
        if (class1.isAssignableFrom(obj.getClass()))
        {
            return class1.cast(obj);
        } else
        {
            return null;
        }
    }
}

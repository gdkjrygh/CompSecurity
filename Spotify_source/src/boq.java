// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class boq
{

    public static String a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        StringBuilder stringbuilder = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        if (s != null)
        {
            String s1 = s.toUpperCase();
            if (!s1.matches("[A-F0-9]+"))
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid application ID: ")).append(s).toString());
            }
            stringbuilder.append("/").append(s1);
        }
        return stringbuilder.toString();
    }
}

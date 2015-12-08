// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;

final class ajp
    implements ajq
{

    private Field a;
    private ajo b;

    public ajp(ajo ajo1, Field field)
    {
        b = ajo1;
        super();
        a = field;
    }

    public final void a(ajo ajo1, ahs ahs1)
    {
        if (ajo1.c.a.b > 0)
        {
            ajo1 = ahs1.e();
            a.set(b.a, ajo1.n());
            return;
        }
        try
        {
            ajo1 = ahs1.d();
            a.set(b.a, ajo1.m());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ajo ajo1)
        {
            ahs1 = String.valueOf(ahs1);
        }
        String s = String.valueOf(a);
        String s1 = String.valueOf(b.a);
        throw new RuntimeException((new StringBuilder(String.valueOf(ahs1).length() + 55 + String.valueOf(s).length() + String.valueOf(s1).length())).append("Assigning frame ").append(ahs1).append(" to field ").append(s).append(" of filter ").append(s1).append(" caused exception!").toString(), ajo1);
    }
}

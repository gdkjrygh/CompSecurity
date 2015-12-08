// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class LocaleInfo extends Entity
{

    private String country;
    private String locale;

    public LocaleInfo(long l, String s, String s1)
    {
        setEntityId(Long.valueOf(l));
        setEntityStatus(Entity.EntityStatus.SYNCED);
        a(s, s1);
    }

    public LocaleInfo(String s, String s1)
    {
        a(s, s1);
    }

    private void a(String s, String s1)
    {
        locale = s;
        country = s1;
    }

    public String a()
    {
        return locale;
    }

    public String b()
    {
        return country;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" locale: ").append(a());
        stringbuilder.append(" country: ").append(b());
        return stringbuilder.toString();
    }
}

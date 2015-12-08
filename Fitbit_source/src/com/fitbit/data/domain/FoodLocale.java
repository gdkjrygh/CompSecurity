// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class FoodLocale extends Entity
{

    private boolean imageUpload;
    private String label;
    private boolean supportsLookupByBarCode;
    private String value;

    public FoodLocale(long l, String s, String s1, boolean flag, boolean flag1)
    {
        setEntityId(Long.valueOf(l));
        setEntityStatus(Entity.EntityStatus.SYNCED);
        a(s, s1, flag, flag1);
    }

    public FoodLocale(String s, String s1)
    {
        a(s, s1, false, false);
    }

    public FoodLocale(String s, String s1, boolean flag, boolean flag1)
    {
        a(s, s1, flag, flag1);
    }

    private void a(String s, String s1, boolean flag, boolean flag1)
    {
        value = s;
        label = s1;
        supportsLookupByBarCode = flag;
        imageUpload = flag1;
    }

    public String a()
    {
        return value;
    }

    public String b()
    {
        return label;
    }

    public boolean c()
    {
        return supportsLookupByBarCode;
    }

    public boolean d()
    {
        return imageUpload;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" value: ").append(a());
        stringbuilder.append(" label: ").append(b());
        stringbuilder.append(" supportsLookupByBarCode: ").append(c());
        stringbuilder.append(" imageUpload: ").append(d());
        return stringbuilder.toString();
    }
}

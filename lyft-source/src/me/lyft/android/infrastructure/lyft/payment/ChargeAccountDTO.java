// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.payment;


public class ChargeAccountDTO
{

    public final String email;
    public final Boolean failed;
    public final String id;
    public final Boolean isDefault;
    public final String label;
    public final String labelType;
    public final String lastFour;
    public final String method;
    public final Boolean requestNotes;
    public final String token;
    public final String type;

    public ChargeAccountDTO(String s, String s1, String s2, Boolean boolean1, String s3, String s4, String s5, 
            Boolean boolean2, String s6, Boolean boolean3, String s7)
    {
        id = s;
        lastFour = s1;
        type = s2;
        isDefault = boolean1;
        labelType = s3;
        label = s4;
        token = s5;
        failed = boolean2;
        method = s6;
        requestNotes = boolean3;
        email = s7;
    }

    public String getEmail()
    {
        return email;
    }

    public String getId()
    {
        return id;
    }

    public String getLabel()
    {
        return label;
    }

    public String getLabelType()
    {
        return labelType;
    }

    public String getLastFour()
    {
        return lastFour;
    }

    public String getMethod()
    {
        return method;
    }

    public String getToken()
    {
        return token;
    }

    public String getType()
    {
        return type;
    }

    public Boolean isDefault()
    {
        return isDefault;
    }

    public Boolean isFailed()
    {
        return failed;
    }

    public Boolean isRequestNotes()
    {
        return requestNotes;
    }
}

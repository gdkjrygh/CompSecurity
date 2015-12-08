// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;


public class Demographic
{

    private Integer a;
    private Gender b;

    Demographic()
    {
    }

    public Integer getAge()
    {
        return a;
    }

    public Gender getGender()
    {
        return b;
    }

    public boolean isEmpty()
    {
        return a == null && b == null;
    }

    public void setAge(Integer integer)
    {
        a = integer;
    }

    public void setGender(Gender gender)
    {
        b = gender;
    }

    // Unreferenced inner class com/vungle/publisher/Demographic$Gender
    /* block-local class not found */
    class Gender {}

}

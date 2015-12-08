// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;


public class SpinnerOption
{

    private String title;
    private String value;

    public SpinnerOption()
    {
    }

    public String getTitle()
    {
        return title;
    }

    public String getValue()
    {
        return value;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setValue(String s)
    {
        value = s;
    }

    public String toString()
    {
        return title;
    }
}

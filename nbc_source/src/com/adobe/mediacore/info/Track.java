// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.info;


public abstract class Track
{

    private final boolean _isDefault;
    private final String _language;
    private final String _name;

    public Track(String s, String s1, boolean flag)
    {
        _name = s;
        _language = s1;
        _isDefault = flag;
    }

    public String getLanguage()
    {
        return _language;
    }

    public String getName()
    {
        return _name;
    }

    public boolean isDefault()
    {
        return _isDefault;
    }
}

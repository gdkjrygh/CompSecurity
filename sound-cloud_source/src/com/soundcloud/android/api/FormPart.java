// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;


public abstract class FormPart
{

    protected final String contentType;
    protected final String partName;

    protected FormPart(String s, String s1)
    {
        partName = s;
        contentType = s1;
    }

    public String getContentType()
    {
        return contentType;
    }

    public String getPartName()
    {
        return partName;
    }
}

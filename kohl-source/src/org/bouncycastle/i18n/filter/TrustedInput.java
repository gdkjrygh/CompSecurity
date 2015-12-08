// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n.filter;


public class TrustedInput
{

    protected Object input;

    public TrustedInput(Object obj)
    {
        input = obj;
    }

    public Object getInput()
    {
        return input;
    }

    public String toString()
    {
        return input.toString();
    }
}

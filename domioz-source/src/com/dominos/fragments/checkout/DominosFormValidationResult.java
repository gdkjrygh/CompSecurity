// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.checkout;


public class DominosFormValidationResult
{

    boolean isValid;
    private StringBuffer message;

    public DominosFormValidationResult()
    {
        isValid = false;
        message = new StringBuffer();
    }

    public void appendMessage(String s)
    {
        message.append(s);
    }

    public StringBuffer getMessage()
    {
        return message;
    }

    public boolean hasError()
    {
        return message.length() > 0;
    }
}

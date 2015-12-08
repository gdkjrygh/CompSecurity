// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;


public class DecoderRuntimeException extends RuntimeException
{

    private String file;

    public DecoderRuntimeException(String s)
    {
        super(s);
    }

    public DecoderRuntimeException(String s, Throwable throwable, String s1)
    {
        super(s, throwable);
        file = s1;
    }

    public String getMessage()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (file != null)
        {
            stringbuilder.append("DreFile");
            stringbuilder.append("=");
            stringbuilder.append(file);
            stringbuilder.append(" ");
        }
        stringbuilder.append("DreMsg");
        stringbuilder.append("=");
        stringbuilder.append(super.getMessage());
        if (getCause() != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append("DreCause");
            stringbuilder.append("=");
            stringbuilder.append(super.getCause());
        }
        StackTraceElement astacktraceelement[] = getStackTrace();
        if (astacktraceelement != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append("DreCause");
            stringbuilder.append("DreStackTrace");
            int j = astacktraceelement.length;
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append(astacktraceelement[i].toString());
                stringbuilder.append("+++");
            }

        }
        return stringbuilder.toString();
    }
}

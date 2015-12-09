// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;


public class PromptModel
{

    protected Boolean is_default;
    protected String speech;
    protected String text;

    public PromptModel()
    {
        speech = "";
        text = "";
    }

    public transient String getSpeech(Object aobj[])
    {
        return String.format(speech.trim(), aobj);
    }

    public transient String getText(Object aobj[])
    {
        return String.format(text.trim(), aobj);
    }

    public void setSpeech(String s)
    {
        speech = s;
    }

    public void setText(String s)
    {
        text = s;
    }

    public String toString()
    {
        return text;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


class r
{

    static final int $SwitchMap$com$facebook$AsyncTask$Status[];

    static 
    {
        $SwitchMap$com$facebook$AsyncTask$Status = new int[atus.values().length];
        try
        {
            $SwitchMap$com$facebook$AsyncTask$Status[atus.RUNNING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$facebook$AsyncTask$Status[atus.FINISHED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

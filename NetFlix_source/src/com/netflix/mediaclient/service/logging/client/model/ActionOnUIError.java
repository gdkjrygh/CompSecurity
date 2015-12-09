// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;


public final class ActionOnUIError extends Enum
{

    private static final ActionOnUIError $VALUES[];
    public static final ActionOnUIError displayedError;
    public static final ActionOnUIError handledSilently;

    private ActionOnUIError(String s, int i)
    {
        super(s, i);
    }

    public static ActionOnUIError valueOf(String s)
    {
        return (ActionOnUIError)Enum.valueOf(com/netflix/mediaclient/service/logging/client/model/ActionOnUIError, s);
    }

    public static ActionOnUIError[] values()
    {
        return (ActionOnUIError[])$VALUES.clone();
    }

    static 
    {
        handledSilently = new ActionOnUIError("handledSilently", 0);
        displayedError = new ActionOnUIError("displayedError", 1);
        $VALUES = (new ActionOnUIError[] {
            handledSilently, displayedError
        });
    }
}

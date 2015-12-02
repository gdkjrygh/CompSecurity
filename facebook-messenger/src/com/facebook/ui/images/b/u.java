// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;


public final class u extends Enum
{

    private static final u $VALUES[];
    public static final u DOWNLOAD_NOT_FOUND;
    public static final u DOWNLOAD_PIPELINE_ERROR;
    public static final u PREV_FAILURE_RETRY_BLOCKED;

    private u(String s, int i)
    {
        super(s, i);
    }

    public static u valueOf(String s)
    {
        return (u)Enum.valueOf(com/facebook/ui/images/b/u, s);
    }

    public static u[] values()
    {
        return (u[])$VALUES.clone();
    }

    static 
    {
        PREV_FAILURE_RETRY_BLOCKED = new u("PREV_FAILURE_RETRY_BLOCKED", 0);
        DOWNLOAD_PIPELINE_ERROR = new u("DOWNLOAD_PIPELINE_ERROR", 1);
        DOWNLOAD_NOT_FOUND = new u("DOWNLOAD_NOT_FOUND", 2);
        $VALUES = (new u[] {
            PREV_FAILURE_RETRY_BLOCKED, DOWNLOAD_PIPELINE_ERROR, DOWNLOAD_NOT_FOUND
        });
    }
}

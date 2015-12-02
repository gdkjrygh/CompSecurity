// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.threads.ui.name;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d USE_PARTICIPANTS_NAMES_ONLY;
    public static final d USE_THREAD_NAME_IF_AVAILABLE;
    private final int value;

    private d(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/messages/threads/ui/name/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        USE_THREAD_NAME_IF_AVAILABLE = new d("USE_THREAD_NAME_IF_AVAILABLE", 0, 0);
        USE_PARTICIPANTS_NAMES_ONLY = new d("USE_PARTICIPANTS_NAMES_ONLY", 1, 1);
        $VALUES = (new d[] {
            USE_THREAD_NAME_IF_AVAILABLE, USE_PARTICIPANTS_NAMES_ONLY
        });
    }

}

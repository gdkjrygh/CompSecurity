// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.refreshablelistview;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d BUFFERING;
    public static final d LOADING;
    public static final d NORMAL;
    public static final d PULL_TO_REFRESH;
    public static final d PUSH_TO_REFRESH;
    public static final d RELEASE_TO_REFRESH;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/widget/refreshablelistview/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        NORMAL = new d("NORMAL", 0);
        PULL_TO_REFRESH = new d("PULL_TO_REFRESH", 1);
        PUSH_TO_REFRESH = new d("PUSH_TO_REFRESH", 2);
        RELEASE_TO_REFRESH = new d("RELEASE_TO_REFRESH", 3);
        LOADING = new d("LOADING", 4);
        BUFFERING = new d("BUFFERING", 5);
        $VALUES = (new d[] {
            NORMAL, PULL_TO_REFRESH, PUSH_TO_REFRESH, RELEASE_TO_REFRESH, LOADING, BUFFERING
        });
    }
}

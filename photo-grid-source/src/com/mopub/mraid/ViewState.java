// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import java.util.Locale;

public final class ViewState extends Enum
{

    public static final ViewState DEFAULT;
    public static final ViewState EXPANDED;
    public static final ViewState HIDDEN;
    public static final ViewState LOADING;
    public static final ViewState RESIZED;
    private static final ViewState a[];

    private ViewState(String s, int i)
    {
        super(s, i);
    }

    public static ViewState valueOf(String s)
    {
        return (ViewState)Enum.valueOf(com/mopub/mraid/ViewState, s);
    }

    public static ViewState[] values()
    {
        return (ViewState[])a.clone();
    }

    public final String toJavascriptString()
    {
        return toString().toLowerCase(Locale.US);
    }

    static 
    {
        LOADING = new ViewState("LOADING", 0);
        DEFAULT = new ViewState("DEFAULT", 1);
        RESIZED = new ViewState("RESIZED", 2);
        EXPANDED = new ViewState("EXPANDED", 3);
        HIDDEN = new ViewState("HIDDEN", 4);
        a = (new ViewState[] {
            LOADING, DEFAULT, RESIZED, EXPANDED, HIDDEN
        });
    }
}

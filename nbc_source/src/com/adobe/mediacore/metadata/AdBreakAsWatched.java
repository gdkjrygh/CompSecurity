// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;


public final class AdBreakAsWatched extends Enum
{

    private static final AdBreakAsWatched $VALUES[];
    public static final AdBreakAsWatched AD_BREAK_AS_WATCHED_NEVER;
    public static final AdBreakAsWatched AD_BREAK_AS_WATCHED_ON_BEGIN;
    public static final AdBreakAsWatched AD_BREAK_AS_WATCHED_ON_END;
    private String _value;

    private AdBreakAsWatched(String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }

    public static AdBreakAsWatched createFrom(String s)
    {
        AdBreakAsWatched aadbreakaswatched[] = values();
        int j = aadbreakaswatched.length;
        for (int i = 0; i < j; i++)
        {
            AdBreakAsWatched adbreakaswatched = aadbreakaswatched[i];
            if (adbreakaswatched.getValue().equalsIgnoreCase(s))
            {
                return adbreakaswatched;
            }
        }

        return AD_BREAK_AS_WATCHED_ON_BEGIN;
    }

    public static AdBreakAsWatched valueOf(String s)
    {
        return (AdBreakAsWatched)Enum.valueOf(com/adobe/mediacore/metadata/AdBreakAsWatched, s);
    }

    public static AdBreakAsWatched[] values()
    {
        return (AdBreakAsWatched[])$VALUES.clone();
    }

    public String getValue()
    {
        return _value;
    }

    static 
    {
        AD_BREAK_AS_WATCHED_ON_BEGIN = new AdBreakAsWatched("AD_BREAK_AS_WATCHED_ON_BEGIN", 0, "break_watched_on_begin");
        AD_BREAK_AS_WATCHED_ON_END = new AdBreakAsWatched("AD_BREAK_AS_WATCHED_ON_END", 1, "break_watched_on_end");
        AD_BREAK_AS_WATCHED_NEVER = new AdBreakAsWatched("AD_BREAK_AS_WATCHED_NEVER", 2, "break_watched_never");
        $VALUES = (new AdBreakAsWatched[] {
            AD_BREAK_AS_WATCHED_ON_BEGIN, AD_BREAK_AS_WATCHED_ON_END, AD_BREAK_AS_WATCHED_NEVER
        });
    }
}

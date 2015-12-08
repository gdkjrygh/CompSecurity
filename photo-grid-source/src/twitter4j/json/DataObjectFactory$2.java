// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.json;


class 
{

    static final int $SwitchMap$twitter4j$json$JSONObjectType$Type[];

    static 
    {
        $SwitchMap$twitter4j$json$JSONObjectType$Type = new int[values().length];
        try
        {
            $SwitchMap$twitter4j$json$JSONObjectType$Type[SENDER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$twitter4j$json$JSONObjectType$Type[STATUS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$twitter4j$json$JSONObjectType$Type[DIRECT_MESSAGE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$twitter4j$json$JSONObjectType$Type[DELETE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$twitter4j$json$JSONObjectType$Type[LIMIT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$twitter4j$json$JSONObjectType$Type[SCRUB_GEO.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

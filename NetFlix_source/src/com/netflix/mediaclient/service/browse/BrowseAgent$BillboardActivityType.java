// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;


// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent

public static final class name extends Enum
{

    private static final ACTION $VALUES[];
    public static final ACTION ACTION;
    public static final ACTION IMPRESSION;
    private final String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/netflix/mediaclient/service/browse/BrowseAgent$BillboardActivityType, s);
    }

    public static name[] values()
    {
        return (name[])$VALUES.clone();
    }

    public String getName()
    {
        return name;
    }

    static 
    {
        IMPRESSION = new <init>("IMPRESSION", 0, "impression");
        ACTION = new <init>("ACTION", 1, "action");
        $VALUES = (new .VALUES[] {
            IMPRESSION, ACTION
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}

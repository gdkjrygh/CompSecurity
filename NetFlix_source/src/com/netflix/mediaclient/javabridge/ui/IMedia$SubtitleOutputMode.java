// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;


// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            IMedia

public static final class mValue extends Enum
{

    private static final DATA_JSON $VALUES[];
    public static final DATA_JSON DATA_JSON;
    public static final DATA_JSON DATA_XML;
    public static final DATA_JSON EVENTS;
    protected int mValue;

    public static mValue valueOf(String s)
    {
        return (mValue)Enum.valueOf(com/netflix/mediaclient/javabridge/ui/IMedia$SubtitleOutputMode, s);
    }

    public static mValue[] values()
    {
        return (mValue[])$VALUES.clone();
    }

    public final int getValue()
    {
        return mValue;
    }

    static 
    {
        EVENTS = new <init>("EVENTS", 0, 0);
        DATA_XML = new <init>("DATA_XML", 1, 1);
        DATA_JSON = new <init>("DATA_JSON", 2, 2);
        $VALUES = (new .VALUES[] {
            EVENTS, DATA_XML, DATA_JSON
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mValue = j;
    }
}

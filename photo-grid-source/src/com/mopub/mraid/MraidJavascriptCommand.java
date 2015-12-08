// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


// Referenced classes of package com.mopub.mraid:
//            u, v, w, x, 
//            y, z, PlacementType

public class MraidJavascriptCommand extends Enum
{

    public static final MraidJavascriptCommand CLOSE;
    public static final MraidJavascriptCommand CREATE_CALENDAR_EVENT;
    public static final MraidJavascriptCommand EXPAND;
    public static final MraidJavascriptCommand OPEN;
    public static final MraidJavascriptCommand PLAY_VIDEO;
    public static final MraidJavascriptCommand RESIZE;
    public static final MraidJavascriptCommand SET_ORIENTATION_PROPERTIES;
    public static final MraidJavascriptCommand STORE_PICTURE;
    public static final MraidJavascriptCommand UNSPECIFIED;
    public static final MraidJavascriptCommand USE_CUSTOM_CLOSE;
    private static final MraidJavascriptCommand b[];
    private final String a;

    private MraidJavascriptCommand(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    MraidJavascriptCommand(String s, int i, String s1, byte byte0)
    {
        this(s, i, s1);
    }

    static MraidJavascriptCommand a(String s)
    {
        MraidJavascriptCommand amraidjavascriptcommand[] = values();
        int j = amraidjavascriptcommand.length;
        for (int i = 0; i < j; i++)
        {
            MraidJavascriptCommand mraidjavascriptcommand = amraidjavascriptcommand[i];
            if (mraidjavascriptcommand.a.equals(s))
            {
                return mraidjavascriptcommand;
            }
        }

        return UNSPECIFIED;
    }

    public static MraidJavascriptCommand valueOf(String s)
    {
        return (MraidJavascriptCommand)Enum.valueOf(com/mopub/mraid/MraidJavascriptCommand, s);
    }

    public static MraidJavascriptCommand[] values()
    {
        return (MraidJavascriptCommand[])b.clone();
    }

    final String a()
    {
        return a;
    }

    boolean a(PlacementType placementtype)
    {
        return false;
    }

    static 
    {
        CLOSE = new MraidJavascriptCommand("CLOSE", 0, "close");
        EXPAND = new u("EXPAND", "expand");
        USE_CUSTOM_CLOSE = new MraidJavascriptCommand("USE_CUSTOM_CLOSE", 2, "usecustomclose");
        OPEN = new v("OPEN", "open");
        RESIZE = new w("RESIZE", "resize");
        SET_ORIENTATION_PROPERTIES = new MraidJavascriptCommand("SET_ORIENTATION_PROPERTIES", 5, "setOrientationProperties");
        PLAY_VIDEO = new x("PLAY_VIDEO", "playVideo");
        STORE_PICTURE = new y("STORE_PICTURE", "storePicture");
        CREATE_CALENDAR_EVENT = new z("CREATE_CALENDAR_EVENT", "createCalendarEvent");
        UNSPECIFIED = new MraidJavascriptCommand("UNSPECIFIED", 9, "");
        b = (new MraidJavascriptCommand[] {
            CLOSE, EXPAND, USE_CUSTOM_CLOSE, OPEN, RESIZE, SET_ORIENTATION_PROPERTIES, PLAY_VIDEO, STORE_PICTURE, CREATE_CALENDAR_EVENT, UNSPECIFIED
        });
    }
}

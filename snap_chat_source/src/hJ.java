// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hJ extends Enum
{

    private static final hJ $VALUES[];
    public static final hJ IMAGE;
    public static final hJ TEXT;
    public static final hJ VIDEO;
    public static final hJ VIDEO_NO_SOUND;

    private hJ(String s, int i)
    {
        super(s, i);
    }

    public static hJ valueOf(String s)
    {
        return (hJ)Enum.valueOf(hJ, s);
    }

    public static hJ[] values()
    {
        return (hJ[])$VALUES.clone();
    }

    static 
    {
        VIDEO_NO_SOUND = new hJ("VIDEO_NO_SOUND", 0);
        VIDEO = new hJ("VIDEO", 1);
        IMAGE = new hJ("IMAGE", 2);
        TEXT = new hJ("TEXT", 3);
        $VALUES = (new hJ[] {
            VIDEO_NO_SOUND, VIDEO, IMAGE, TEXT
        });
    }
}

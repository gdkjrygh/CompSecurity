// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.media;


public final class MediaProvider extends Enum
{

    private static final MediaProvider $VALUES[];
    public static final MediaProvider IMG_LY;
    public static final MediaProvider LOCKERZ;
    public static final MediaProvider MOBYPICTURE;
    public static final MediaProvider PLIXI;
    public static final MediaProvider POSTEROUS;
    public static final MediaProvider TWIPPLE;
    public static final MediaProvider TWITGOO;
    public static final MediaProvider TWITPIC;
    public static final MediaProvider TWITTER;
    public static final MediaProvider YFROG;

    private MediaProvider(String s, int i)
    {
        super(s, i);
    }

    public static MediaProvider valueOf(String s)
    {
        return (MediaProvider)Enum.valueOf(twitter4j/media/MediaProvider, s);
    }

    public static MediaProvider[] values()
    {
        return (MediaProvider[])$VALUES.clone();
    }

    static 
    {
        TWITTER = new MediaProvider("TWITTER", 0);
        IMG_LY = new MediaProvider("IMG_LY", 1);
        PLIXI = new MediaProvider("PLIXI", 2);
        LOCKERZ = new MediaProvider("LOCKERZ", 3);
        TWIPPLE = new MediaProvider("TWIPPLE", 4);
        TWITGOO = new MediaProvider("TWITGOO", 5);
        TWITPIC = new MediaProvider("TWITPIC", 6);
        YFROG = new MediaProvider("YFROG", 7);
        MOBYPICTURE = new MediaProvider("MOBYPICTURE", 8);
        POSTEROUS = new MediaProvider("POSTEROUS", 9);
        $VALUES = (new MediaProvider[] {
            TWITTER, IMG_LY, PLIXI, LOCKERZ, TWIPPLE, TWITGOO, TWITPIC, YFROG, MOBYPICTURE, POSTEROUS
        });
    }
}

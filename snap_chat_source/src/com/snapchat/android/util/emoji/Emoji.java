// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.emoji;


public final class Emoji extends Enum
{

    private static final Emoji $VALUES[];
    public static final Emoji CAMERA;
    public static final Emoji CLAPPING_HANDS_SIGN;
    public static final Emoji CONFUSED_FACE;
    public static final Emoji CONSTRUCTION_WORKER;
    public static final Emoji DISAPPOINTED_FACE;
    public static final Emoji FACE_WITH_NO_GOOD_GESTURE;
    public static final Emoji FIRE;
    public static final Emoji FLUSHED_FACE;
    public static final Emoji GHOST;
    public static final Emoji GRINNING_FACE_WITH_SMILING_EYES;
    public static final Emoji HAPPY_PERSON_RAISING_ONE_HAND;
    public static final Emoji HEAVY_BLACK_HEART;
    public static final Emoji MISCELLANEOUS_TECHNICAL;
    public static final Emoji OK_HAND_SIGN;
    public static final Emoji POOP;
    public static final Emoji SEE_NO_EVIL_MONKEY;
    public static final Emoji SMILING_FACE_WITH_OPEN_MOUTH;
    public static final Emoji SMILING_FACE_WITH_SMILING_EYES;
    public static final Emoji SMILING_FACE_WITH_SUNGLASSES;
    public static final Emoji SMIRKING_FACE;
    public static final Emoji THUMBS_DOWN_SIGN;
    public static final Emoji THUMBS_UP_SIGN;
    public static final Emoji WEARY_FACE;
    public static final Emoji WHITE_MEDIUM_STAR;
    public static final Emoji WHITE_SMILING_FACE;
    public static final Emoji WHITE_UP_POINTING_BACKHAND_INDEX;
    public static final Emoji WORRIED_FACE;
    public static final Emoji YELLOW_HEART;
    private final byte mBytes[];
    private final int mUnicode;

    private Emoji(String s, int i, int j, byte abyte0[])
    {
        super(s, i);
        mUnicode = j;
        mBytes = abyte0;
    }

    public static Emoji valueOf(String s)
    {
        return (Emoji)Enum.valueOf(com/snapchat/android/util/emoji/Emoji, s);
    }

    public static Emoji[] values()
    {
        return (Emoji[])$VALUES.clone();
    }

    public final byte[] getBytes()
    {
        return mBytes;
    }

    public final int getUnicode()
    {
        return mUnicode;
    }

    static 
    {
        OK_HAND_SIGN = new Emoji("OK_HAND_SIGN", 0, 0x1f44c, new byte[] {
            -16, -97, -111, -116
        });
        THUMBS_UP_SIGN = new Emoji("THUMBS_UP_SIGN", 1, 0x1f44d, new byte[] {
            -16, -97, -111, -115
        });
        THUMBS_DOWN_SIGN = new Emoji("THUMBS_DOWN_SIGN", 2, 0x1f44e, new byte[] {
            -16, -97, -111, -114
        });
        CLAPPING_HANDS_SIGN = new Emoji("CLAPPING_HANDS_SIGN", 3, 0x1f44f, new byte[] {
            -16, -97, -111, -113
        });
        WHITE_UP_POINTING_BACKHAND_INDEX = new Emoji("WHITE_UP_POINTING_BACKHAND_INDEX", 4, 0x1f446, new byte[] {
            -16, -97, -111, -122
        });
        GHOST = new Emoji("GHOST", 5, 0x1f47b, new byte[] {
            -16, -97, -111, -69
        });
        YELLOW_HEART = new Emoji("YELLOW_HEART", 6, 0x1f49b, new byte[] {
            -16, -97, -110, -101
        });
        FIRE = new Emoji("FIRE", 7, 0x1f525, new byte[] {
            -16, -97, -108, -91
        });
        POOP = new Emoji("POOP", 8, 0x1f4a9, new byte[] {
            -16, -97, -110, -87
        });
        CAMERA = new Emoji("CAMERA", 9, 0x1f4f9, new byte[] {
            -16, -97, -109, -71
        });
        CONSTRUCTION_WORKER = new Emoji("CONSTRUCTION_WORKER", 10, 0x1f477, new byte[] {
            -16, -97, -111, -73
        });
        MISCELLANEOUS_TECHNICAL = new Emoji("MISCELLANEOUS_TECHNICAL", 11, 9200, new byte[] {
            -30, -113, -80
        });
        GRINNING_FACE_WITH_SMILING_EYES = new Emoji("GRINNING_FACE_WITH_SMILING_EYES", 12, 0x1f601, new byte[] {
            -16, -97, -104, -127
        });
        SMILING_FACE_WITH_SMILING_EYES = new Emoji("SMILING_FACE_WITH_SMILING_EYES", 13, 0x1f60a, new byte[] {
            -16, -97, -104, -118
        });
        SMILING_FACE_WITH_SUNGLASSES = new Emoji("SMILING_FACE_WITH_SUNGLASSES", 14, 0x1f60e, new byte[] {
            -16, -97, -104, -114
        });
        SMILING_FACE_WITH_OPEN_MOUTH = new Emoji("SMILING_FACE_WITH_OPEN_MOUTH", 15, 0x1f603, new byte[] {
            -16, -97, -104, -125
        });
        SMIRKING_FACE = new Emoji("SMIRKING_FACE", 16, 0x1f60f, new byte[] {
            -16, -97, -104, -113
        });
        CONFUSED_FACE = new Emoji("CONFUSED_FACE", 17, 0x1f615, new byte[] {
            -16, -97, -104, -107
        });
        DISAPPOINTED_FACE = new Emoji("DISAPPOINTED_FACE", 18, 0x1f61e, new byte[] {
            -16, -97, -104, -98
        });
        FLUSHED_FACE = new Emoji("FLUSHED_FACE", 19, 0x1f633, new byte[] {
            -16, -97, -104, -77
        });
        WEARY_FACE = new Emoji("WEARY_FACE", 20, 0x1f629, new byte[] {
            -16, -97, -104, -87
        });
        WHITE_SMILING_FACE = new Emoji("WHITE_SMILING_FACE", 21, 9786, new byte[] {
            -30, -104, -70
        });
        WORRIED_FACE = new Emoji("WORRIED_FACE", 22, 0x1f61f, new byte[] {
            -16, -97, -104, -97
        });
        FACE_WITH_NO_GOOD_GESTURE = new Emoji("FACE_WITH_NO_GOOD_GESTURE", 23, 0x1f645, new byte[] {
            -16, -97, -103, -123
        });
        SEE_NO_EVIL_MONKEY = new Emoji("SEE_NO_EVIL_MONKEY", 24, 0x1f648, new byte[] {
            -16, -97, -103, -120
        });
        HAPPY_PERSON_RAISING_ONE_HAND = new Emoji("HAPPY_PERSON_RAISING_ONE_HAND", 25, 0x1f64b, new byte[] {
            -16, -97, -103, -117
        });
        HEAVY_BLACK_HEART = new Emoji("HEAVY_BLACK_HEART", 26, 10084, new byte[] {
            -30, -99, -92
        });
        WHITE_MEDIUM_STAR = new Emoji("WHITE_MEDIUM_STAR", 27, 11088, new byte[] {
            -30, -83, -112
        });
        $VALUES = (new Emoji[] {
            OK_HAND_SIGN, THUMBS_UP_SIGN, THUMBS_DOWN_SIGN, CLAPPING_HANDS_SIGN, WHITE_UP_POINTING_BACKHAND_INDEX, GHOST, YELLOW_HEART, FIRE, POOP, CAMERA, 
            CONSTRUCTION_WORKER, MISCELLANEOUS_TECHNICAL, GRINNING_FACE_WITH_SMILING_EYES, SMILING_FACE_WITH_SMILING_EYES, SMILING_FACE_WITH_SUNGLASSES, SMILING_FACE_WITH_OPEN_MOUTH, SMIRKING_FACE, CONFUSED_FACE, DISAPPOINTED_FACE, FLUSHED_FACE, 
            WEARY_FACE, WHITE_SMILING_FACE, WORRIED_FACE, FACE_WITH_NO_GOOD_GESTURE, SEE_NO_EVIL_MONKEY, HAPPY_PERSON_RAISING_ONE_HAND, HEAVY_BLACK_HEART, WHITE_MEDIUM_STAR
        });
    }
}

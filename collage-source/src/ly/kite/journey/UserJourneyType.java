// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey;


public final class UserJourneyType extends Enum
{

    private static final UserJourneyType $VALUES[];
    public static final UserJourneyType CIRCLE;
    public static final UserJourneyType FRAME;
    public static final UserJourneyType GREETING_CARD;
    public static final UserJourneyType PHONE_CASE;
    public static final UserJourneyType PHOTOBOOK;
    public static final UserJourneyType POSTCARD;
    public static final UserJourneyType POSTER;
    public static final UserJourneyType RECTANGLE;
    private int mMaskResourceId;
    private boolean mUsesSingleImage;

    private UserJourneyType(String s, int i)
    {
        this(s, i, false, 0);
    }

    private UserJourneyType(String s, int i, int j)
    {
        this(s, i, false, j);
    }

    private UserJourneyType(String s, int i, boolean flag)
    {
        this(s, i, flag, 0);
    }

    private UserJourneyType(String s, int i, boolean flag, int j)
    {
        super(s, i);
        mUsesSingleImage = flag;
        mMaskResourceId = j;
    }

    public static UserJourneyType valueOf(String s)
    {
        return (UserJourneyType)Enum.valueOf(ly/kite/journey/UserJourneyType, s);
    }

    public static UserJourneyType[] values()
    {
        return (UserJourneyType[])$VALUES.clone();
    }

    public int maskResourceId()
    {
        return mMaskResourceId;
    }

    public boolean usesSingleImage()
    {
        return mUsesSingleImage;
    }

    static 
    {
        CIRCLE = new UserJourneyType("CIRCLE", 0, ly.kite.R.drawable.filled_white_circle);
        FRAME = new UserJourneyType("FRAME", 1);
        GREETING_CARD = new UserJourneyType("GREETING_CARD", 2);
        PHONE_CASE = new UserJourneyType("PHONE_CASE", 3, true);
        PHOTOBOOK = new UserJourneyType("PHOTOBOOK", 4);
        POSTCARD = new UserJourneyType("POSTCARD", 5);
        POSTER = new UserJourneyType("POSTER", 6);
        RECTANGLE = new UserJourneyType("RECTANGLE", 7, ly.kite.R.drawable.filled_white_rectangle);
        $VALUES = (new UserJourneyType[] {
            CIRCLE, FRAME, GREETING_CARD, PHONE_CASE, PHOTOBOOK, POSTCARD, POSTER, RECTANGLE
        });
    }
}

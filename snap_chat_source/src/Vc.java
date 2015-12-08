// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Vc extends Enum
{

    private static final Vc $VALUES[];
    public static final Vc ADD_FRIEND;
    public static final Vc AMAZON_OFFER;
    public static final Vc DEEP_LINK;
    public static final Vc MESSAGE;
    public static final Vc OPEN_URL;
    public static final Vc UNRECOGNIZED_VALUE;
    public final String value;

    private Vc(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static Vc valueOf(String s)
    {
        return (Vc)Enum.valueOf(Vc, s);
    }

    public static Vc[] values()
    {
        return (Vc[])$VALUES.clone();
    }

    public final String toString()
    {
        return value;
    }

    static 
    {
        ADD_FRIEND = new Vc("ADD_FRIEND", 0, "ADD_FRIEND");
        AMAZON_OFFER = new Vc("AMAZON_OFFER", 1, "AMAZON_OFFER");
        OPEN_URL = new Vc("OPEN_URL", 2, "OPEN_URL");
        DEEP_LINK = new Vc("DEEP_LINK", 3, "DEEP_LINK");
        MESSAGE = new Vc("MESSAGE", 4, "MESSAGE");
        UNRECOGNIZED_VALUE = new Vc("UNRECOGNIZED_VALUE", 5, "UNRECOGNIZED_VALUE");
        $VALUES = (new Vc[] {
            ADD_FRIEND, AMAZON_OFFER, OPEN_URL, DEEP_LINK, MESSAGE, UNRECOGNIZED_VALUE
        });
    }
}

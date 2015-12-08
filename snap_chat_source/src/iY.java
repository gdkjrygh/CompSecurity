// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iY extends Enum
{

    private static final iY $VALUES[];
    public static final iY EMAIL_EXISTS;
    public static final iY EMAIL_INVALID;
    public static final iY PASSWORD_TOO_COMMON;
    public static final iY PASSWORD_TOO_EASY;
    public static final iY PASSWORD_TOO_SHORT;
    public static final iY PASSWORD_TOO_SIMILAR_TO_EMAIL;
    public static final iY PASSWORD_TOO_SIMILAR_TO_USERNAME;

    private iY(String s, int i)
    {
        super(s, i);
    }

    public static iY valueOf(String s)
    {
        return (iY)Enum.valueOf(iY, s);
    }

    public static iY[] values()
    {
        return (iY[])$VALUES.clone();
    }

    static 
    {
        EMAIL_INVALID = new iY("EMAIL_INVALID", 0);
        EMAIL_EXISTS = new iY("EMAIL_EXISTS", 1);
        PASSWORD_TOO_SHORT = new iY("PASSWORD_TOO_SHORT", 2);
        PASSWORD_TOO_COMMON = new iY("PASSWORD_TOO_COMMON", 3);
        PASSWORD_TOO_EASY = new iY("PASSWORD_TOO_EASY", 4);
        PASSWORD_TOO_SIMILAR_TO_USERNAME = new iY("PASSWORD_TOO_SIMILAR_TO_USERNAME", 5);
        PASSWORD_TOO_SIMILAR_TO_EMAIL = new iY("PASSWORD_TOO_SIMILAR_TO_EMAIL", 6);
        $VALUES = (new iY[] {
            EMAIL_INVALID, EMAIL_EXISTS, PASSWORD_TOO_SHORT, PASSWORD_TOO_COMMON, PASSWORD_TOO_EASY, PASSWORD_TOO_SIMILAR_TO_USERNAME, PASSWORD_TOO_SIMILAR_TO_EMAIL
        });
    }
}

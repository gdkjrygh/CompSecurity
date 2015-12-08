// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.addressbook;


// Referenced classes of package com.skype.android.addressbook:
//            ContactIngestionJNI

public static final class message extends Enum
{

    private static final AUTH_SkypeToken $VALUES[];
    public static final AUTH_SkypeToken AUTH_LiveIDToken;
    public static final AUTH_SkypeToken AUTH_SkypeToken;
    private final String message;
    private final int value;

    public static message valueOf(String s)
    {
        return (message)Enum.valueOf(com/skype/android/addressbook/ContactIngestionJNI$AuthTicketType, s);
    }

    public static message[] values()
    {
        return (message[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    public final String toString()
    {
        return message;
    }

    static 
    {
        AUTH_LiveIDToken = new <init>("AUTH_LiveIDToken", 0, 0, "MSA aka LiveID token! It can be for example retrived from CoreLib by SkyLib::RequestAccessToken(999, ...)");
        AUTH_SkypeToken = new <init>("AUTH_SkypeToken", 1, 1, "Skype token It can be for example retrived from CoreLib by SkyLib::RequestSkypeToken(999, ...)");
        $VALUES = (new .VALUES[] {
            AUTH_LiveIDToken, AUTH_SkypeToken
        });
    }

    private (String s, int i, int j, String s1)
    {
        super(s, i);
        value = j;
        message = s1;
    }
}

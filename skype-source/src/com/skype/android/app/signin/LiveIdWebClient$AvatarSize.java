// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            LiveIdWebClient

public static final class  extends Enum
{

    private static final Win8Dynamic $VALUES[];
    public static final Win8Dynamic UserTileMedium;
    public static final Win8Dynamic UserTileSmall;
    public static final Win8Dynamic UserTileStatic;
    public static final Win8Dynamic Win8Dynamic;
    public static final Win8Dynamic Win8Ready;
    public static final Win8Dynamic Win8Static;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/signin/LiveIdWebClient$AvatarSize, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UserTileSmall = new <init>("UserTileSmall", 0);
        UserTileStatic = new <init>("UserTileStatic", 1);
        UserTileMedium = new <init>("UserTileMedium", 2);
        Win8Static = new <init>("Win8Static", 3);
        Win8Ready = new <init>("Win8Ready", 4);
        Win8Dynamic = new <init>("Win8Dynamic", 5);
        $VALUES = (new .VALUES[] {
            UserTileSmall, UserTileStatic, UserTileMedium, Win8Static, Win8Ready, Win8Dynamic
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

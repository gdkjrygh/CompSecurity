// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


// Referenced classes of package com.facebook.widget:
//            FacebookDialog

public static final class minVersion extends Enum
    implements minVersion
{

    private static final PHOTOS $VALUES[];
    public static final PHOTOS MESSAGE_DIALOG;
    public static final PHOTOS PHOTOS;
    private int minVersion;

    public static minVersion valueOf(String s)
    {
        return (minVersion)Enum.valueOf(com/facebook/widget/FacebookDialog$MessageDialogFeature, s);
    }

    public static minVersion[] values()
    {
        return (minVersion[])$VALUES.clone();
    }

    public String getAction()
    {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    public int getMinVersion()
    {
        return minVersion;
    }

    static 
    {
        MESSAGE_DIALOG = new <init>("MESSAGE_DIALOG", 0, 0x13350ac);
        PHOTOS = new <init>("PHOTOS", 1, 0x1335124);
        $VALUES = (new .VALUES[] {
            MESSAGE_DIALOG, PHOTOS
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }
}

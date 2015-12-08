// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            LikeActionController

private static final class minVersion extends Enum
    implements com.facebook.widget.e
{

    private static final LIKE_DIALOG ENUM$VALUES[];
    public static final LIKE_DIALOG LIKE_DIALOG;
    private int minVersion;

    public static minVersion valueOf(String s)
    {
        return (minVersion)Enum.valueOf(com/facebook/internal/LikeActionController$LikeDialogFeature, s);
    }

    public static minVersion[] values()
    {
        minVersion aminversion[] = ENUM$VALUES;
        int i = aminversion.length;
        minVersion aminversion1[] = new ENUM.VALUES[i];
        System.arraycopy(aminversion, 0, aminversion1, 0, i);
        return aminversion1;
    }

    public String getAction()
    {
        return "com.facebook.platform.action.request.LIKE_DIALOG";
    }

    public int getMinVersion()
    {
        return minVersion;
    }

    static 
    {
        LIKE_DIALOG = new <init>("LIKE_DIALOG", 0, 0x133529d);
        ENUM$VALUES = (new ENUM.VALUES[] {
            LIKE_DIALOG
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }
}

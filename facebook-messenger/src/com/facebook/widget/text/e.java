// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;


final class e extends Enum
{

    private static final e $VALUES[];
    public static final e HELVETICA_NEUE_BOLD;
    public static final e HELVETICA_NEUE_LIGHT;
    public static final e HELVETICA_NEUE_REGULAR;
    public String mFontAssetFilePath;

    private e(String s, int i, String s1)
    {
        super(s, i);
        mFontAssetFilePath = s1;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/widget/text/e, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    static 
    {
        HELVETICA_NEUE_LIGHT = new e("HELVETICA_NEUE_LIGHT", 0, "fonts/HelveticaNeue-Light.ttf");
        HELVETICA_NEUE_REGULAR = new e("HELVETICA_NEUE_REGULAR", 1, "fonts/HelveticaNeue-Roman.ttf");
        HELVETICA_NEUE_BOLD = new e("HELVETICA_NEUE_BOLD", 2, "fonts/HelveticaNeue-Bold.ttf");
        $VALUES = (new e[] {
            HELVETICA_NEUE_LIGHT, HELVETICA_NEUE_REGULAR, HELVETICA_NEUE_BOLD
        });
    }
}

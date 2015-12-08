// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            ContentViewRenderView

public static final class  extends Enum
{

    private static final TEXTURE_VIEW $VALUES[];
    public static final TEXTURE_VIEW SURFACE_VIEW;
    public static final TEXTURE_VIEW TEXTURE_VIEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SURFACE_VIEW = new <init>("SURFACE_VIEW", 0);
        TEXTURE_VIEW = new <init>("TEXTURE_VIEW", 1);
        $VALUES = (new .VALUES[] {
            SURFACE_VIEW, TEXTURE_VIEW
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

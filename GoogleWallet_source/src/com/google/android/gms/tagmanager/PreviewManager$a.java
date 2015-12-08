// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            PreviewManager

static final class  extends Enum
{

    public static final aOI aOG;
    public static final aOI aOH;
    public static final aOI aOI;
    private static final aOI aOJ[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/PreviewManager$a, s);
    }

    public static [] values()
    {
        return ([])aOJ.clone();
    }

    static 
    {
        aOG = new <init>("NONE", 0);
        aOH = new <init>("CONTAINER", 1);
        aOI = new <init>("CONTAINER_DEBUG", 2);
        aOJ = (new aOJ[] {
            aOG, aOH, aOI
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

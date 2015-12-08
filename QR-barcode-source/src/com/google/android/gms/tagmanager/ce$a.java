// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            ce

static final class  extends Enum
{

    public static final aqj aqh;
    public static final aqj aqi;
    public static final aqj aqj;
    private static final aqj aqk[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/ce$a, s);
    }

    public static [] values()
    {
        return ([])aqk.clone();
    }

    static 
    {
        aqh = new <init>("NONE", 0);
        aqi = new <init>("CONTAINER", 1);
        aqj = new <init>("CONTAINER_DEBUG", 2);
        aqk = (new aqk[] {
            aqh, aqi, aqj
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

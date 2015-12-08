// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcb

static final class  extends Enum
{

    public static final zzaMK zzaMI;
    public static final zzaMK zzaMJ;
    public static final zzaMK zzaMK;
    private static final zzaMK zzaML[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzcb$zza, s);
    }

    public static [] values()
    {
        return ([])zzaML.clone();
    }

    static 
    {
        zzaMI = new <init>("NONE", 0);
        zzaMJ = new <init>("CONTAINER", 1);
        zzaMK = new <init>("CONTAINER_DEBUG", 2);
        zzaML = (new zzaML[] {
            zzaMI, zzaMJ, zzaMK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

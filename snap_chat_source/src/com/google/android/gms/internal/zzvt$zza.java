// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzvt

public static final class  extends Enum
{

    public static final zzaCK zzaCI;
    public static final zzaCK zzaCJ;
    public static final zzaCK zzaCK;
    private static final zzaCK zzaCL[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/internal/zzvt$zza, s);
    }

    public static [] values()
    {
        return ([])zzaCL.clone();
    }

    static 
    {
        zzaCI = new <init>("NOT_AVAILABLE", 0);
        zzaCJ = new <init>("IO_ERROR", 1);
        zzaCK = new <init>("SERVER_ERROR", 2);
        zzaCL = (new zzaCL[] {
            zzaCI, zzaCJ, zzaCK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

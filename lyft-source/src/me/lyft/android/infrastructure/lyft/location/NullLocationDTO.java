// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.location;


// Referenced classes of package me.lyft.android.infrastructure.lyft.location:
//            LocationDTO

public class NullLocationDTO extends LocationDTO
{

    private static final NullLocationDTO INSTANCE = new NullLocationDTO();

    private NullLocationDTO()
    {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static LocationDTO getInstance()
    {
        return INSTANCE;
    }

    public static boolean isNull(LocationDTO locationdto)
    {
        return INSTANCE == locationdto;
    }

}

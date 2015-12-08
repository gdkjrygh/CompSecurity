// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.ats;


// Referenced classes of package me.lyft.android.infrastructure.ats:
//            DriverApplicationDTO

public class  extends DriverApplicationDTO
{

    private static final DriverApplicationDTO INSTANCE = new <init>();

    public static DriverApplicationDTO getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }


    private ()
    {
        super(null);
    }
}

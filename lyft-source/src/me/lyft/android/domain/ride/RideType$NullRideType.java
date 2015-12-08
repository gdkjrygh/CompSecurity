// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;


// Referenced classes of package me.lyft.android.domain.ride:
//            RideType

class  extends RideType
{

    private static final RideType INSTANCE = new <init>();

    public static RideType getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }


    private ()
    {
        super("standard", null);
    }
}

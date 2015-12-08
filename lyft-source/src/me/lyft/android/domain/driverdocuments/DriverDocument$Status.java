// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driverdocuments;


public final class  extends Enum
{

    private static final EXPIRED $VALUES[];
    public static final EXPIRED APPROVED;
    public static final EXPIRED EXPIRED;
    public static final EXPIRED PENDING;
    public static final EXPIRED REJECTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/domain/driverdocuments/DriverDocument$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        APPROVED = new <init>("APPROVED", 0);
        PENDING = new <init>("PENDING", 1);
        REJECTED = new <init>("REJECTED", 2);
        EXPIRED = new <init>("EXPIRED", 3);
        $VALUES = (new .VALUES[] {
            APPROVED, PENDING, REJECTED, EXPIRED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

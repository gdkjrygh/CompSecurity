// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;


// Referenced classes of package me.lyft.android.ui.passenger:
//            PrimeTimeRequestRideDialogView

class questType
{

    static final int $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[];

    static 
    {
        $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType = new int[questType.values().length];
        try
        {
            $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[questType.LYFT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[questType.COURIER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[questType.CANCEL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

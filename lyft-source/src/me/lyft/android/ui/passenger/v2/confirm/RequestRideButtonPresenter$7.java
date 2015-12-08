// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;


// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            RequestRideButtonPresenter

class pe
{

    static final int $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[];

    static 
    {
        $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType = new int[me.lyft.android.ui.passenger.w.RequestType.values().length];
        try
        {
            $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[me.lyft.android.ui.passenger.w.RequestType.LYFT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[me.lyft.android.ui.passenger.w.RequestType.COURIER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[me.lyft.android.ui.passenger.w.RequestType.ALERT_TIME_OUT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[me.lyft.android.ui.passenger.w.RequestType.CANCEL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

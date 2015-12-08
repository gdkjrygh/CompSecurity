// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ridehistory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Preconditions;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.ridehistory.charge.CouponAccountInfoItem;
import me.lyft.android.domain.ridehistory.charge.CreditCardAccountInfoItem;
import me.lyft.android.domain.ridehistory.charge.CreditLineAccountInfoItem;
import me.lyft.android.domain.ridehistory.charge.GoogleWalletAccountInfoItem;
import me.lyft.android.domain.ridehistory.charge.NullAccountInfoItem;
import me.lyft.android.domain.ridehistory.charge.PayPalAccountInfoItem;
import me.lyft.android.infrastructure.lyft.payment.MoneyDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.AccountInfoDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.ChargeItemDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryDetailsDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.PassengerRideHistoryItemDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.PaymentBreakdownDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.ReceiptItemDTO;
import me.lyft.android.infrastructure.lyft.ridehistory.SplitPaymentDTO;

// Referenced classes of package me.lyft.android.domain.ridehistory:
//            IPassengerRideHistoryMapper, PaymentBreakdown, PassengerRideHistory, PassengerRideHistoryDetails, 
//            PassengerRideHistoryItem

public class PassengerRideHistoryMapper
    implements IPassengerRideHistoryMapper
{

    public static final int CONVERT_TO_MILES_TRESHOLD = 321;
    public static final SimpleDateFormat DATE_FORMAT_FULL = new SimpleDateFormat("MMM dd yyyy - h:mm aaa");
    public static final SimpleDateFormat DATE_FORMAT_SIMPLE = new SimpleDateFormat("MMM dd h:mm aaa");
    public static final SimpleDateFormat DATE_FORMAT_TIME_ONLY = new SimpleDateFormat("h:mm aaa");
    public static final float METERS_IN_FEET = 0.3048F;
    public static final int METERS_IN_MILE = 1609;

    public PassengerRideHistoryMapper()
    {
    }

    public static String formatDate(long l, DateFormat dateformat, String s)
    {
        dateformat.setTimeZone(getTimeZone(s));
        return dateformat.format(new Date(1000L * l));
    }

    public static String formatDistanceMiles(int i)
    {
        if (i > 321)
        {
            return String.format("%.1fmi", new Object[] {
                Float.valueOf((float)i / 1609F)
            });
        } else
        {
            return String.format("%.0fft", new Object[] {
                Float.valueOf((float)i / 0.3048F)
            });
        }
    }

    public static String formatDuration(long l)
    {
        StringBuffer stringbuffer = new StringBuffer(20);
        long l1 = TimeUnit.SECONDS.toHours(l);
        if (l1 > 0L)
        {
            stringbuffer.append((new StringBuilder()).append(l1).append("h ").toString());
        }
        long l2 = TimeUnit.SECONDS.toMinutes(l - TimeUnit.HOURS.toSeconds(l1));
        if (l2 > 0L)
        {
            stringbuffer.append((new StringBuilder()).append(l2).append("m ").toString());
        }
        l = l - TimeUnit.HOURS.toSeconds(l1) - TimeUnit.MINUTES.toSeconds(l2);
        if (l > 0L)
        {
            stringbuffer.append((new StringBuilder()).append(l).append("s").toString());
        }
        return stringbuffer.toString();
    }

    public static TimeZone getTimeZone(String s)
    {
        boolean flag;
        if (s.contains("UTC") || s.contains("GMT"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Timezone format should contain UTC or GMT");
        return TimeZone.getTimeZone(s.replace("UTC", "GMT"));
    }

    private PaymentBreakdown mapPaymentBreakdown(PaymentBreakdownDTO paymentbreakdowndto)
    {
        PaymentBreakdown.SplitPayment splitpayment;
        Object obj1;
        ArrayList arraylist2;
        PaymentBreakdown.ReceiptItem receiptitem;
        arraylist2 = new ArrayList(paymentbreakdowndto.lineItems.size());
        int j = paymentbreakdowndto.lineItems.size();
        for (int i = 0; i < j; i++)
        {
            ReceiptItemDTO receiptitemdto = (ReceiptItemDTO)paymentbreakdowndto.lineItems.get(i);
            arraylist2.add(new PaymentBreakdown.ReceiptItem(receiptitemdto.title, Money.format(((Integer)Objects.firstNonNull(receiptitemdto.money.getAmount(), Integer.valueOf(0))).intValue())));
        }

        receiptitem = new PaymentBreakdown.ReceiptItem(paymentbreakdowndto.lineItemTotal.title, Money.format(((Integer)Objects.firstNonNull(paymentbreakdowndto.lineItemTotal.money.getAmount(), Integer.valueOf(0))).intValue()));
        splitpayment = null;
        if (paymentbreakdowndto.splitPayment != null)
        {
            splitpayment = new PaymentBreakdown.SplitPayment(new PaymentBreakdown.ReceiptItem(paymentbreakdowndto.splitPayment.title, (new StringBuilder()).append("\367").append(paymentbreakdowndto.splitPayment.contributorsCount).toString()), new PaymentBreakdown.ReceiptItem(paymentbreakdowndto.splitPayment.subtotal.title, Money.format(((Integer)Objects.firstNonNull(paymentbreakdowndto.splitPayment.subtotal.money.getAmount(), Integer.valueOf(0))).intValue())), paymentbreakdowndto.splitPayment.contributorPhotoUrls);
        }
        if (paymentbreakdowndto.coupons != null)
        {
            ArrayList arraylist = new ArrayList(paymentbreakdowndto.coupons.size());
            Iterator iterator = paymentbreakdowndto.coupons.iterator();
            do
            {
                obj1 = arraylist;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj1 = (ChargeItemDTO)iterator.next();
                arraylist.add(new CouponAccountInfoItem(((ChargeItemDTO) (obj1)).title, Money.format(((Integer)Objects.firstNonNull(((ChargeItemDTO) (obj1)).money.getAmount(), Integer.valueOf(0))).intValue()), ((ChargeItemDTO) (obj1)).accountInfo.clientPaymentMethod, ((ChargeItemDTO) (obj1)).accountInfo.type));
            } while (true);
        } else
        {
            obj1 = Collections.emptyList();
        }
        if (paymentbreakdowndto.charges == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist1;
        Iterator iterator1;
        arraylist1 = new ArrayList(paymentbreakdowndto.charges.size());
        iterator1 = paymentbreakdowndto.charges.iterator();
_L19:
        Object obj = arraylist1;
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        String s;
        String s1;
        byte byte0;
        obj = (ChargeItemDTO)iterator1.next();
        s = Money.format(((Integer)Objects.firstNonNull(((ChargeItemDTO) (obj)).money.getAmount(), Integer.valueOf(0))).intValue());
        s1 = ((ChargeItemDTO) (obj)).accountInfo.clientPaymentMethod;
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 5: default 536
    //                   -2032709742: 643
    //                   -1354573786: 660
    //                   -995205389: 626
    //                   -564548979: 609
    //                   3046160: 592;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        byte0;
        JVM INSTR tableswitch 0 4: default 572
    //                   0 677
    //                   1 708
    //                   2 739
    //                   3 770
    //                   4 801;
           goto _L11 _L12 _L13 _L14 _L15 _L16
_L11:
        obj = new NullAccountInfoItem();
_L17:
        arraylist1.add(obj);
        continue; /* Loop/switch isn't completed */
_L10:
        if (s1.equals("card"))
        {
            byte0 = 0;
        }
          goto _L5
_L9:
        if (s1.equals("creditLine"))
        {
            byte0 = 1;
        }
          goto _L5
_L8:
        if (s1.equals("paypal"))
        {
            byte0 = 2;
        }
          goto _L5
_L6:
        if (s1.equals("googleWallet"))
        {
            byte0 = 3;
        }
          goto _L5
_L7:
        if (s1.equals("coupon"))
        {
            byte0 = 4;
        }
          goto _L5
_L12:
        obj = new CreditCardAccountInfoItem(((ChargeItemDTO) (obj)).title, s, ((ChargeItemDTO) (obj)).accountInfo.clientPaymentMethod, ((ChargeItemDTO) (obj)).accountInfo.type);
          goto _L17
_L13:
        obj = new CreditLineAccountInfoItem(((ChargeItemDTO) (obj)).title, s, ((ChargeItemDTO) (obj)).accountInfo.clientPaymentMethod, ((ChargeItemDTO) (obj)).accountInfo.type);
          goto _L17
_L14:
        obj = new PayPalAccountInfoItem(((ChargeItemDTO) (obj)).title, s, ((ChargeItemDTO) (obj)).accountInfo.clientPaymentMethod, ((ChargeItemDTO) (obj)).accountInfo.type);
          goto _L17
_L15:
        obj = new GoogleWalletAccountInfoItem(((ChargeItemDTO) (obj)).title, s, ((ChargeItemDTO) (obj)).accountInfo.clientPaymentMethod, ((ChargeItemDTO) (obj)).accountInfo.type);
          goto _L17
_L16:
        obj = new CouponAccountInfoItem(((ChargeItemDTO) (obj)).title, s, ((ChargeItemDTO) (obj)).accountInfo.clientPaymentMethod, ((ChargeItemDTO) (obj)).accountInfo.type);
          goto _L17
_L2:
        obj = Collections.emptyList();
_L4:
        return new PaymentBreakdown(paymentbreakdowndto.title, arraylist2, receiptitem, splitpayment, ((List) (obj1)), ((List) (obj)));
        if (true) goto _L19; else goto _L18
_L18:
    }

    public final PassengerRideHistory fromDTO(PassengerRideHistoryDTO passengerridehistorydto)
    {
        PassengerRideHistory passengerridehistory = new PassengerRideHistory(passengerridehistorydto.hasMore, passengerridehistorydto.limit, passengerridehistorydto.skip);
        Object obj = passengerridehistorydto.data;
        if (obj == null || ((List) (obj)).size() <= 0)
        {
            return passengerridehistory;
        }
        passengerridehistorydto = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); passengerridehistorydto.add(fromDTO((PassengerRideHistoryItemDTO)((Iterator) (obj)).next()))) { }
        passengerridehistory.setRideHistory(passengerridehistorydto);
        return passengerridehistory;
    }

    public PassengerRideHistoryDetails fromDTO(PassengerRideHistoryDetailsDTO passengerridehistorydetailsdto)
    {
        ArrayList arraylist = new ArrayList(passengerridehistorydetailsdto.paymentBreakdownItems.size());
        for (Iterator iterator = passengerridehistorydetailsdto.paymentBreakdownItems.iterator(); iterator.hasNext(); arraylist.add(mapPaymentBreakdown((PaymentBreakdownDTO)iterator.next()))) { }
        return new PassengerRideHistoryDetails(passengerridehistorydetailsdto.mapImageUrl, passengerridehistorydetailsdto.driverRating, formatDistanceMiles(passengerridehistorydetailsdto.distance), formatDuration(passengerridehistorydetailsdto.dropoffTimestamp - passengerridehistorydetailsdto.pickupTimestamp), passengerridehistorydetailsdto.rideTypeLabel, passengerridehistorydetailsdto.pickupAddress, passengerridehistorydetailsdto.dropoffAddress, formatDate(passengerridehistorydetailsdto.pickupTimestamp, DATE_FORMAT_TIME_ONLY, passengerridehistorydetailsdto.timezone), formatDate(passengerridehistorydetailsdto.dropoffTimestamp, DATE_FORMAT_TIME_ONLY, passengerridehistorydetailsdto.timezone), formatDate(passengerridehistorydetailsdto.pickupTimestamp, DATE_FORMAT_FULL, passengerridehistorydetailsdto.timezone), passengerridehistorydetailsdto.driverPhotoUrl, passengerridehistorydetailsdto.driverName, Money.format(passengerridehistorydetailsdto.totalMoney.getAmount().intValue()), passengerridehistorydetailsdto.region, arraylist);
    }

    PassengerRideHistoryItem fromDTO(PassengerRideHistoryItemDTO passengerridehistoryitemdto)
    {
        return new PassengerRideHistoryItem(passengerridehistoryitemdto.rideId, passengerridehistoryitemdto.driverPhotoUrl, Money.format(((Integer)Objects.firstNonNull(passengerridehistoryitemdto.totalMoney.getAmount(), Integer.valueOf(0))).intValue()), formatDistanceMiles(passengerridehistoryitemdto.distance), formatDuration(passengerridehistoryitemdto.dropoffTimestamp - passengerridehistoryitemdto.pickupTimestamp), formatDate(passengerridehistoryitemdto.pickupTimestamp, DATE_FORMAT_SIMPLE, passengerridehistoryitemdto.timezone), passengerridehistoryitemdto.rideTypeLabel);
    }

}

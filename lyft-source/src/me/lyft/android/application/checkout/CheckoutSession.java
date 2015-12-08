// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.checkout;

import java.util.List;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.checkout.FareCalculator;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.Coupon;
import me.lyft.android.domain.payment.CreditLineChargeAccount;
import me.lyft.android.domain.payment.IPaymentFactory;
import me.lyft.android.domain.payment.NullChargeAccount;
import me.lyft.android.domain.ride.RideFare;
import me.lyft.android.domain.splitfare.SplitFareState;
import me.lyft.android.logging.L;
import me.lyft.android.persistence.checkout.ICheckoutStateStorage;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.application.checkout:
//            ICheckoutSession

public class CheckoutSession
    implements ICheckoutSession
{

    private IChargeAccountsProvider chargeAccountsProvider;
    private IRideFareRepository fareRepository;
    private IPaymentFactory paymentFactory;
    private String selectedChargeAccountId;
    private String selectedCouponId;
    private int selectedTip;
    private ISplitFareStateRepository splitFareStateRepository;
    private final ICheckoutStateStorage stateStorage;
    private PublishSubject tipChangeSubject;

    public CheckoutSession(IRideFareRepository iridefarerepository, ICheckoutStateStorage icheckoutstatestorage, IPaymentFactory ipaymentfactory, IChargeAccountsProvider ichargeaccountsprovider, ISplitFareStateRepository isplitfarestaterepository)
    {
        tipChangeSubject = PublishSubject.create();
        selectedTip = 0;
        selectedChargeAccountId = "";
        selectedCouponId = "";
        fareRepository = iridefarerepository;
        stateStorage = icheckoutstatestorage;
        paymentFactory = ipaymentfactory;
        chargeAccountsProvider = ichargeaccountsprovider;
        splitFareStateRepository = isplitfarestaterepository;
        selectedChargeAccountId = icheckoutstatestorage.getSelectedChargeAccountId();
        selectedCouponId = icheckoutstatestorage.getSelectedCouponId();
        selectedTip = icheckoutstatestorage.getSelectedTip();
    }

    private Coupon findValidCouponById(String s)
    {
        return fareRepository.getFare().findValidCouponById(s);
    }

    private Coupon getFirstValidCoupon()
    {
        return fareRepository.getFare().getFirstValidCoupon();
    }

    private boolean hasSelectedChargeAccount()
    {
        return !Strings.isNullOrEmpty(selectedChargeAccountId);
    }

    public List getPayments()
    {
        RideFare ridefare = fareRepository.getFare();
        SplitFareState splitfarestate = splitFareStateRepository.getSplitFareState();
        FareCalculator farecalculator = new FareCalculator(paymentFactory);
        farecalculator.setSelectedCoupon(getSelectedOrFirstEligibleCoupon());
        farecalculator.setSelectedChargeAccount(getSelectedOrDefaultChargeAccount());
        farecalculator.setRideTotal(ridefare.getTotalMoney());
        farecalculator.setTip(Integer.valueOf(selectedTip));
        farecalculator.setTotalContributorsCount(splitfarestate.getTotalContributorsCount());
        return farecalculator.calculatePayments();
    }

    Coupon getSelectedCoupon()
    {
        return findValidCouponById(selectedCouponId);
    }

    public ChargeAccount getSelectedOrDefaultChargeAccount()
    {
        ChargeAccount chargeaccount1 = chargeAccountsProvider.findChargeAccountById(selectedChargeAccountId);
        ChargeAccount chargeaccount = chargeaccount1;
        if (chargeaccount1 == null)
        {
            chargeaccount = chargeAccountsProvider.getDefaultOrFirstValidChargeAccount();
        }
        chargeaccount = (ChargeAccount)Objects.firstNonNull(chargeaccount, NullChargeAccount.getInstance());
        if (chargeaccount.isNull())
        {
            L.e(new NullPointerException("CheckoutSession using NullChargeAccount"), (new StringBuilder()).append("Using NullChargeAccount hasNoChargeAccounts? ").append(chargeAccountsProvider.hasNoChargeAccounts()).append(" hasValidChargeAccount? ").append(chargeAccountsProvider.hasValidChargeAccount()).toString(), new Object[0]);
        }
        return chargeaccount;
    }

    public Coupon getSelectedOrFirstEligibleCoupon()
    {
        Coupon coupon = getSelectedCoupon();
        if (coupon != null)
        {
            return coupon;
        }
        if (hasSelectedChargeAccount())
        {
            return null;
        } else
        {
            return getFirstValidCoupon();
        }
    }

    public String getSelectedPaymentMethodId()
    {
        Coupon coupon = getSelectedOrFirstEligibleCoupon();
        if (coupon != null)
        {
            return coupon.getId();
        } else
        {
            return getSelectedOrDefaultChargeAccount().getId();
        }
    }

    public int getSelectedTipAmount()
    {
        return selectedTip;
    }

    public Observable observeTipChange()
    {
        return tipChangeSubject.asObservable();
    }

    public boolean requireExpenseNote()
    {
        ChargeAccount chargeaccount = getSelectedOrDefaultChargeAccount();
        if (chargeaccount instanceof CreditLineChargeAccount)
        {
            return ((CreditLineChargeAccount)chargeaccount).isRequestNotes().booleanValue();
        } else
        {
            return false;
        }
    }

    public void reset()
    {
        selectedChargeAccountId = "";
        selectedCouponId = "";
        selectedTip = 0;
        stateStorage.reset();
    }

    public void selectChargeAccount(String s)
    {
        s = Strings.nullToEmpty(s);
        selectedChargeAccountId = s;
        stateStorage.setSelectedChargeAccountId(s);
        selectedCouponId = "";
        stateStorage.setSelectedCouponId(selectedCouponId);
    }

    public boolean selectCoupon(String s)
    {
        if (findValidCouponById(s) != null)
        {
            selectedCouponId = s;
            stateStorage.setSelectedCouponId(s);
            selectedChargeAccountId = "";
            stateStorage.setSelectedChargeAccountId(selectedChargeAccountId);
            return true;
        } else
        {
            return false;
        }
    }

    public void selectTip(int i)
    {
        selectedTip = i;
        tipChangeSubject.onNext(Unit.create());
        stateStorage.setSelectedTip(i);
    }
}

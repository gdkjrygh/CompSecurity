// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.FrameLayout;
import com.google.common.base.Strings;
import com.pinterest.activity.commerce.CheckoutFragment;
import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.activity.commerce.dialog.CommerceConsentDialog;
import com.pinterest.activity.commerce.event.CheckoutClickEvent;
import com.pinterest.activity.commerce.event.PaymentMethodDeletedEvent;
import com.pinterest.activity.commerce.event.PaymentSelectedEvent;
import com.pinterest.activity.commerce.event.QuantitySelectedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressDeletedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressSelectedEvent;
import com.pinterest.activity.commerce.event.ShippingRateSelectedEvent;
import com.pinterest.activity.commerce.model.StatementCreditExtraData;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.commerce.view.CheckoutView;
import com.pinterest.activity.commerce.view.ProductView;
import com.pinterest.activity.commerce.viewmodel.CheckoutViewModel;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.SimpleToast;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.Domain;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.data.CommerceApiManager;
import com.pinterest.education.EducationHelper;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.api.ApiResponse;
import com.pinterest.model.api.RequestVariantParameter;
import com.pinterest.model.commerce.Cart;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.Incentive;
import com.pinterest.model.commerce.UserCard;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.schemas.experiences.Placement;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            VariantSelectionController

public class CheckoutController
{

    private static final String LINE_SEPARATOR = "\n";
    private Toolbar _actionBar;
    private Activity _activity;
    private List _allPaymentMethods;
    private List _allShippingDetails;
    private Cart _cart;
    private CheckoutView _checkoutContainer;
    private CheckoutFragment _checkoutFragment;
    private CheckoutViewModel _checkoutViewModel;
    private CommerceApiManager _commerceApiManager;
    private boolean _consentedToIncentive;
    private FrameLayout _contentContainer;
    private Context _context;
    private Runnable _eduRunnable;
    private boolean _eligibilityForIncentive;
    private float _incentiveAmount;
    private boolean _incentiveConsentCheckedForCurrentCard;
    private String _incentiveDisplayAmount;
    private ExperienceValue _incentiveExperienceValue;
    private String _incentiveIdForCart;
    private String _incentiveName;
    private Navigation _navigation;
    private Pin _pin;
    private ProductView _productView;
    private FrameLayout _variantSelectionContainer;
    private VariantSelectionController _variantSelectionController;
    private com.pinterest.base.Events.EventsSubscriber eventsStickySubscriber;
    private com.pinterest.base.Events.EventsSubscriber eventsSubscriber;
    private com.pinterest.api.model.BuyableProduct.Variant selectedVariant;
    private List sortedAttributes;

    public CheckoutController(Context context, CommerceApiManager commerceapimanager, Activity activity, CheckoutFragment checkoutfragment)
    {
        _incentiveIdForCart = null;
        eventsStickySubscriber = new _cls10();
        eventsSubscriber = new _cls11();
        _context = context;
        _commerceApiManager = commerceapimanager;
        _activity = activity;
        _checkoutFragment = checkoutfragment;
        _variantSelectionController = new VariantSelectionController();
        _checkoutViewModel = new CheckoutViewModel();
    }

    private void calculateTotals(Cart cart)
    {
        _checkoutViewModel.setShowProgress();
        _checkoutContainer.update(_checkoutViewModel);
        _commerceApiManager.a(cart.getId(), _pin.getUid(), getCartCallback(true));
    }

    private void checkEligibilityForIncentive()
    {
        if (_incentiveIdForCart == null)
        {
            return;
        } else
        {
            _commerceApiManager.h(_incentiveIdForCart, new _cls8());
            return;
        }
    }

    private void checkIfIncentiveNeedsConsent()
    {
        if (_eligibilityForIncentive && !_incentiveConsentCheckedForCurrentCard && _cart != null)
        {
            UserCard usercard = _cart.getUserCard();
            if (usercard != null)
            {
                _incentiveConsentCheckedForCurrentCard = true;
                Map map = usercard.getEnrolledIncentiveProgramsMap();
                if (map != null && map.containsKey(_incentiveIdForCart))
                {
                    if (!((Boolean)map.get(_incentiveIdForCart)).booleanValue())
                    {
                        Events.post(new DialogEvent(CommerceConsentDialog.newInstance(getMaxPriceString(), _incentiveName)));
                        return;
                    } else
                    {
                        _consentedToIncentive = true;
                        updateIncentiveMessage();
                        _checkoutContainer.update(_checkoutViewModel);
                        return;
                    }
                }
                if ("MasterCard".equals(usercard.getBrandName()))
                {
                    Events.post(new DialogEvent(CommerceConsentDialog.newInstance(getMaxPriceString(), _incentiveName)));
                    return;
                }
            }
        }
    }

    private void createCart()
    {
        if (selectedVariant == null)
        {
            throw new IllegalStateException("Checkout cannot happen without selectedVariant!");
        } else
        {
            _checkoutContainer.update(_checkoutViewModel);
            _commerceApiManager.a(_pin.getUid(), new RequestVariantParameter(selectedVariant.getItemId(), Integer.valueOf(1)), getCartCallback());
            return;
        }
    }

    private void displayErrorToast(int i)
    {
        SimpleToast simpletoast = new SimpleToast(Resources.string(i));
        simpletoast.setLayoutGravity(81);
        Events.post(new ToastEvent(simpletoast));
    }

    private void enrollCurrentUserCardInIncentive()
    {
        UserCard usercard = _checkoutViewModel.getPaymentMethod();
        _commerceApiManager.e(usercard.getId(), _incentiveIdForCart, new _cls9());
    }

    private void fetchPaymentMethods()
    {
        _commerceApiManager.b(new _cls4());
    }

    private void fetchShippingAddresses()
    {
        _commerceApiManager.a(new _cls3());
    }

    private List getCachedSortedAttributes()
    {
        if (sortedAttributes == null)
        {
            sortedAttributes = BuyableProductHelper.sortAttributeNames(_pin.getBuyableProduct().getVariations());
        }
        return sortedAttributes;
    }

    private PinterestCallbackWithDefaultFailure getCartCallback()
    {
        return getCartCallback(false);
    }

    private PinterestCallbackWithDefaultFailure getCartCallback(final boolean isTotalsCalculation)
    {
        return new _cls7();
    }

    private String getFormattedSelectedOptions(Map map)
    {
        if (map == null || map.isEmpty())
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(100);
        List list = getCachedSortedAttributes();
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            String s = (String)list.get(i);
            if (!map.containsKey(s))
            {
                continue;
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("\n");
            }
            stringbuilder.append((String)map.get(s));
        }

        return stringbuilder.toString();
    }

    private String getMaxPriceString()
    {
        if (_cart == null)
        {
            return _incentiveDisplayAmount;
        }
        if (_cart.getShippingDetailId() == null)
        {
            float f;
            if (Strings.isNullOrEmpty(_cart.getBasePrice()))
            {
                f = 0.0F;
            } else
            {
                f = Float.parseFloat(_cart.getBasePrice());
            }
            if (f > 0.0F && f < _incentiveAmount)
            {
                return _cart.getDisplayBasePrice();
            }
        } else
        {
            float f1;
            if (Strings.isNullOrEmpty(_cart.getTotalPrice()))
            {
                f1 = 0.0F;
            } else
            {
                f1 = Float.parseFloat(_cart.getTotalPrice());
            }
            if (f1 > 0.0F && f1 < _incentiveAmount)
            {
                return _cart.getDisplayTotalPrice();
            }
        }
        return _incentiveDisplayAmount;
    }

    private void handleCartCheckout(Cart cart)
    {
        CommerceApiManager commerceapimanager = _commerceApiManager;
        String s = cart.getId();
        long l = cart.getUpdatedAt();
        if (_consentedToIncentive)
        {
            cart = _incentiveIdForCart;
        } else
        {
            cart = null;
        }
        commerceapimanager.a(s, l, cart, _pin.getUid(), new _cls5());
    }

    private void handleCartRefresh()
    {
        _checkoutViewModel.setShowProgress();
        _checkoutContainer.update(_checkoutViewModel);
        _commerceApiManager.b(_cart.getId(), getCartCallback());
    }

    private void handleCartUpdateSuccess(ApiResponse apiresponse)
    {
        if (_checkoutContainer == null)
        {
            return;
        }
        apiresponse = (Cart)apiresponse.getData();
        _checkoutViewModel.updateWithCart(apiresponse);
        if (apiresponse.getShippingDetailId() != null)
        {
            calculateTotals(apiresponse);
        }
        _checkoutContainer.update(_checkoutViewModel);
    }

    private void handleCheckoutClicked()
    {
        if (_checkoutViewModel.getShippingAddress() == null)
        {
            displayErrorToast(0x7f07011a);
            return;
        }
        if (_checkoutViewModel.getShippingMethod() == null)
        {
            displayErrorToast(0x7f07011b);
            return;
        }
        if (_checkoutViewModel.getPaymentMethod() == null)
        {
            displayErrorToast(0x7f070119);
            return;
        } else
        {
            Events.post(new DialogEvent(new LoadingDialog(0x7f070113)));
            handleCartCheckout(_cart);
            return;
        }
    }

    private void handleCheckoutSuccess(Cart cart)
    {
        _cart = cart;
        Events.post(new DialogEvent(null));
        Navigation navigation = new Navigation(Location.COMMERCE_CONFIRMATION_CHECKOUT);
        Domain domain = _pin.getDomainObj();
        if (domain != null && domain.getOfficialUser() != null)
        {
            navigation.putExtra("com.pinterest.EXTRA_URI", domain.getOfficialUser().getImageMediumUrl());
        }
        navigation.putExtra("com.pinterest.EXTRA_MERCHANT_NAME", _pin.getBuyableProduct().getMerchantName());
        if (cart == null)
        {
            cart = "test@pinterest.com";
        } else
        {
            cart = cart.getDetailedShipping().getEmail();
        }
        navigation.putExtra("com.pinterest.EXTRA_EMAIL", cart);
        if (_consentedToIncentive && _cart.getIncentive() != null)
        {
            cart = _cart.getIncentive();
            if (cart.getStatus() == com.pinterest.model.commerce.Incentive.IncentiveStatus.SUBMITTED.getValue() || cart.getStatus() == com.pinterest.model.commerce.Incentive.IncentiveStatus.DELIVERED.getValue() || cart.getStatus() == com.pinterest.model.commerce.Incentive.IncentiveStatus.VERIFIED.getValue())
            {
                navigation.putExtra("com.pinterest.EXTRA_COMMERCE_INCENTIVE_MESSSAGE", Resources.string(0x7f070155, new Object[] {
                    cart.getDisplayAmount(), _incentiveName
                }));
            }
        }
        Events.post(new com.pinterest.activity.task.model.Navigation.Remove(_navigation));
        Events.post(navigation);
    }

    private void maybeAddCancelMenu()
    {
        if (_actionBar.findViewById(0x7f0f0502) != null)
        {
            return;
        } else
        {
            _actionBar.inflateMenu(0x7f100000);
            return;
        }
    }

    private void updateIncentiveMessage()
    {
        if (_consentedToIncentive)
        {
            String s = Resources.string(0x7f070154, new Object[] {
                getMaxPriceString()
            });
            _checkoutViewModel.updatePaymentIncentive(s);
            return;
        } else
        {
            _checkoutViewModel.clearPaymentIncentive();
            return;
        }
    }

    private void updateProductDetails(Map map)
    {
        com.pinterest.api.model.BuyableProduct.Variant variant = BuyableProductHelper.getVariantForOptions(_pin.getBuyableProduct().getVariants(), map, true);
        _productView.updateProductDetailsAndImage(getFormattedSelectedOptions(map), BuyableProductHelper.getDefaultImageForVariant(variant));
        if (!map.isEmpty() && _variantSelectionController.hasSelectionHistory())
        {
            maybeAddCancelMenu();
        } else
        if (_actionBar.findViewById(0x7f0f0502) != null)
        {
            _actionBar.getMenu().removeItem(0x7f0f0502);
            return;
        }
    }

    private void updateUIForState(DisplayState displaystate)
    {
        _contentContainer.removeAllViews();
        if (displaystate == DisplayState.VariantSelection)
        {
            _checkoutContainer = null;
            _variantSelectionContainer = _variantSelectionController.getVariantContainer(_context);
            _contentContainer.addView(_variantSelectionContainer);
        } else
        {
            if (_variantSelectionController.hasSelectionHistory())
            {
                maybeAddCancelMenu();
            }
            _variantSelectionContainer = null;
            _checkoutContainer = new CheckoutView(_context);
            _contentContainer.addView(_checkoutContainer);
            _productView.updateProductDetailsAndImage(getFormattedSelectedOptions(selectedVariant.getVariant()), BuyableProductHelper.getDefaultImageForVariant(selectedVariant));
            displaystate = Experiences.b(String.valueOf(Placement.ANDROID_COMMERCE_CHECKOUT_PAYMENT.getValue()));
            if (displaystate != null && ((ExperienceValue) (displaystate)).b == Experience.ANDROID_STATEMENT_CREDIT_CHECKOUT.getValue() && ((ExperienceValue) (displaystate)).g != null)
            {
                StatementCreditExtraData statementcreditextradata = new StatementCreditExtraData(((ExperienceValue) (displaystate)).g);
                _incentiveIdForCart = statementcreditextradata.getIncentiveId();
                _incentiveAmount = statementcreditextradata.getAmount();
                _incentiveDisplayAmount = statementcreditextradata.getDisplayAmount();
                _incentiveName = statementcreditextradata.getIncentiveName();
                _incentiveExperienceValue = displaystate;
                _incentiveConsentCheckedForCurrentCard = true;
                checkEligibilityForIncentive();
            }
            createCart();
            fetchShippingAddresses();
            fetchPaymentMethods();
            if (EducationHelper.m())
            {
                _eduRunnable = EducationHelper.a(Placement.ANDROID_COMMERCE_CHECKOUT_TAKEOVER, _checkoutFragment);
                return;
            }
        }
    }

    public void onActivate()
    {
        _variantSelectionController.onActivate();
        Events.register(eventsSubscriber, com/pinterest/activity/commerce/event/QuantitySelectedEvent, new Class[] {
            com/pinterest/activity/commerce/event/ShippingRateSelectedEvent, com/pinterest/activity/commerce/event/CheckoutClickEvent, com/pinterest/activity/commerce/event/PaymentMethodDeletedEvent, com/pinterest/activity/commerce/event/ShippingAddressDeletedEvent
        });
        Events.registerSticky(eventsStickySubscriber, com/pinterest/activity/commerce/event/ShippingAddressSelectedEvent, new Class[] {
            com/pinterest/activity/commerce/event/PaymentSelectedEvent
        });
    }

    public boolean onBackPressed()
    {
        if (_checkoutContainer != null && _variantSelectionController.hasSelectionHistory())
        {
            updateUIForState(DisplayState.VariantSelection);
            _variantSelectionController.resetSelectedOptionForCurrentAttribute();
            _checkoutViewModel.clear();
            return true;
        } else
        {
            return _variantSelectionController.onBackPressed();
        }
    }

    public void onDeactivate()
    {
        _variantSelectionController.onDeactivate();
        Events.unregister(eventsSubscriber);
        Events.unregister(eventsStickySubscriber);
    }

    public void onDestroy()
    {
        _variantSelectionController.onDestroy();
    }

    public void onDestroyView()
    {
        _checkoutViewModel.clear();
        _variantSelectionController.onDestroyView();
        _context = null;
        _productView = null;
        _contentContainer = null;
        _variantSelectionContainer = null;
        _checkoutContainer = null;
        _actionBar = null;
        _checkoutFragment = null;
        _activity = null;
    }

    public void onViewCreated(Pin pin, ProductView productview, FrameLayout framelayout, String s, Navigation navigation, Toolbar toolbar)
    {
        _pin = pin;
        _productView = productview;
        _contentContainer = framelayout;
        _navigation = navigation;
        _actionBar = toolbar;
        _productView.bind(_pin.getBuyableProduct());
        _variantSelectionController.setOnSelectedOptionsUpdatedListener(new _cls1());
        _variantSelectionController.setOnVariantSelectedListener(new _cls2());
        _variantSelectionController.onViewCreated(_context, _pin.getBuyableProduct());
        if (_variantSelectionController.init(s))
        {
            updateUIForState(DisplayState.VariantSelection);
            return;
        } else
        {
            selectedVariant = _variantSelectionController.getSelectedVariant();
            updateUIForState(DisplayState.Checkout);
            return;
        }
    }





/*
    static com.pinterest.api.model.BuyableProduct.Variant access$102(CheckoutController checkoutcontroller, com.pinterest.api.model.BuyableProduct.Variant variant)
    {
        checkoutcontroller.selectedVariant = variant;
        return variant;
    }

*/



/*
    static Cart access$1102(CheckoutController checkoutcontroller, Cart cart)
    {
        checkoutcontroller._cart = cart;
        return cart;
    }

*/







/*
    static boolean access$1602(CheckoutController checkoutcontroller, boolean flag)
    {
        checkoutcontroller._eligibilityForIncentive = flag;
        return flag;
    }

*/








/*
    static boolean access$2202(CheckoutController checkoutcontroller, boolean flag)
    {
        checkoutcontroller._incentiveConsentCheckedForCurrentCard = flag;
        return flag;
    }

*/










/*
    static List access$302(CheckoutController checkoutcontroller, List list)
    {
        checkoutcontroller._allShippingDetails = list;
        return list;
    }

*/



/*
    static List access$402(CheckoutController checkoutcontroller, List list)
    {
        checkoutcontroller._allPaymentMethods = list;
        return list;
    }

*/






/*
    static boolean access$802(CheckoutController checkoutcontroller, boolean flag)
    {
        checkoutcontroller._consentedToIncentive = flag;
        return flag;
    }

*/


    private class _cls10
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final CheckoutController this$0;

        public void onEventMainThread(PaymentSelectedEvent paymentselectedevent)
        {
            Events.removeStickyEvent(paymentselectedevent);
            if (!paymentselectedevent.getUserCard().equals(_checkoutViewModel.getPaymentMethod()))
            {
                _checkoutViewModel.clearPaymentIncentive();
                _incentiveConsentCheckedForCurrentCard = false;
                _consentedToIncentive = false;
                _checkoutViewModel.updatePayment(paymentselectedevent.getUserCard());
                _checkoutViewModel.setShowProgress();
                _checkoutContainer.update(_checkoutViewModel);
                _commerceApiManager.d(_cart.getId(), paymentselectedevent.getUserCard().getId(), getCartCallback());
                fetchPaymentMethods();
                if (paymentselectedevent.isExistingSelected())
                {
                    Pinalytics.b(EventType.TAP, ElementType.BUYABLE_PAYMENT_CELL, null, null);
                    return;
                }
            }
        }

        public void onEventMainThread(ShippingAddressSelectedEvent shippingaddressselectedevent)
        {
            Events.removeStickyEvent(shippingaddressselectedevent);
            if (shippingaddressselectedevent.getDetailedShipping().equals(_checkoutViewModel.getShippingAddress()))
            {
                return;
            }
            _checkoutViewModel.updateShippingAddress(shippingaddressselectedevent.getDetailedShipping());
            _checkoutViewModel.setShowProgress();
            _checkoutContainer.update(_checkoutViewModel);
            _commerceApiManager.b(_cart.getId(), shippingaddressselectedevent.getDetailedShipping().getId(), getCartCallback());
            if (shippingaddressselectedevent.isNewlyCreated())
            {
                fetchShippingAddresses();
                return;
            } else
            {
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_SHIPPING_ADDRESS_CELL, null, null);
                return;
            }
        }

        _cls10()
        {
            this$0 = CheckoutController.this;
            super();
        }
    }


    private class _cls11
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final CheckoutController this$0;

        private void postCommerceFormAddressDialogEvent()
        {
            Intent intent = new Intent(_context, com/pinterest/activity/commerce/SecureDialogActivity);
            intent.putExtra("dialog_type", "address");
            intent.putExtra("merchant", _pin.getBuyableProduct().getMerchantName());
            _activity.startActivity(intent);
        }

        private void postCommerceFormPaymentDialogEvent()
        {
            Intent intent = new Intent(_context, com/pinterest/activity/commerce/SecureDialogActivity);
            intent.putExtra("dialog_type", "payment");
            intent.putExtra("merchant", _pin.getBuyableProduct().getMerchantName());
            if (_cart.getDetailedShipping() != null)
            {
                intent.putExtra("ship_address", _cart.getDetailedShipping());
            }
            if (_eligibilityForIncentive)
            {
                intent.putExtra("card_incentive", Resources.string(0x7f07015d, new Object[] {
                    getMaxPriceString(), _incentiveName
                }));
            }
            _activity.startActivity(intent);
        }

        public void onEventMainThread(CheckoutClickEvent checkoutclickevent)
        {
            checkoutclickevent = checkoutclickevent.getClick();
            switch (_cls12..SwitchMap.com.pinterest.activity.commerce.event.CheckoutClickEvent.Click[checkoutclickevent.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_SUMMARY_SHIP_ADDRESS_CELL, null, null);
                if (_allShippingDetails == null || _allShippingDetails.isEmpty())
                {
                    postCommerceFormAddressDialogEvent();
                    return;
                } else
                {
                    Events.post(new DialogEvent(CommerceListDialog.newInstanceForShippingAddresses(_cart.getDetailedShipping(), new ArrayList(_allShippingDetails))));
                    return;
                }

            case 2: // '\002'
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_SHIPPING_ADDRESS_ADD_NEW_CELL, null, null);
                postCommerceFormAddressDialogEvent();
                return;

            case 3: // '\003'
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_QUANTITY_FIELD, null, null);
                Events.post(new DialogEvent(CommerceListDialog.newInstanceForQuantity(selectedVariant.getMaxQuantity().intValue())));
                return;

            case 4: // '\004'
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_SUMMARY_PAYMENT_CELL, null, null);
                if (_allPaymentMethods == null || _allPaymentMethods.isEmpty())
                {
                    postCommerceFormPaymentDialogEvent();
                    return;
                } else
                {
                    Events.post(new DialogEvent(CommerceListDialog.newInstanceForPaymentMethods(_cart.getUserCard(), new ArrayList(_allPaymentMethods))));
                    return;
                }

            case 5: // '\005'
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_PAYMENT_ADD_NEW_CELL, null, null);
                postCommerceFormPaymentDialogEvent();
                return;

            case 6: // '\006'
                if (_checkoutViewModel.hasError())
                {
                    handleCartRefresh();
                    return;
                } else
                {
                    Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_SUMMARY_PAY_BUTTON, null, null);
                    handleCheckoutClicked();
                    return;
                }

            case 7: // '\007'
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_SUMMARY_SHIP_METHOD_CELL, null, null);
                Events.post(new DialogEvent(CommerceListDialog.newInstanceForShippingMethods(_cart.getSelectedShippingRate(), new ArrayList(_cart.getShippingRates()))));
                return;

            case 8: // '\b'
                enrollCurrentUserCardInIncentive();
                return;
            }
        }

        public void onEventMainThread(PaymentMethodDeletedEvent paymentmethoddeletedevent)
        {
            if (_checkoutViewModel.getPaymentMethod().equals(paymentmethoddeletedevent.getUserCard()))
            {
                _checkoutViewModel.updatePayment(null);
                _checkoutContainer.update(_checkoutViewModel);
                handleCartRefresh();
            }
            fetchPaymentMethods();
        }

        public void onEventMainThread(QuantitySelectedEvent quantityselectedevent)
        {
            String s = (String)_cart.getItemMap().keySet().toArray()[0];
            _checkoutViewModel.updateQuantity(quantityselectedevent.getQuantity());
            _checkoutViewModel.setShowProgress();
            _checkoutContainer.update(_checkoutViewModel);
            _commerceApiManager.a(_cart.getId(), s, new RequestVariantParameter(s, Integer.valueOf(quantityselectedevent.getQuantity())), _pin.getUid(), getCartCallback());
        }

        public void onEventMainThread(ShippingAddressDeletedEvent shippingaddressdeletedevent)
        {
            if (_checkoutViewModel.getShippingAddress() != null && _checkoutViewModel.getShippingAddress().equals(shippingaddressdeletedevent.getDetailedShipping()))
            {
                _checkoutViewModel.updateShippingMethod(null);
                _checkoutViewModel.updateShippingAddress(null);
                _checkoutContainer.update(_checkoutViewModel);
                handleCartRefresh();
            }
            fetchShippingAddresses();
        }

        public void onEventMainThread(ShippingRateSelectedEvent shippingrateselectedevent)
        {
            if (shippingrateselectedevent.getShippingRate().equals(_checkoutViewModel.getShippingMethod()))
            {
                return;
            } else
            {
                _checkoutViewModel.updateShippingMethod(shippingrateselectedevent.getShippingRate());
                _checkoutViewModel.setShowProgress();
                _checkoutContainer.update(_checkoutViewModel);
                _commerceApiManager.c(_cart.getId(), shippingrateselectedevent.getShippingRate().getId(), getCartCallback());
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_SHIPPING_METHOD_CELL, null, null);
                return;
            }
        }

        _cls11()
        {
            this$0 = CheckoutController.this;
            super();
        }

        private class _cls12
        {

            static final int $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click[];

            static 
            {
                $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click = new int[com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.values().length];
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click[com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.Address.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click[com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.AddAddress.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click[com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.Quantity.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click[com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.Payment.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click[com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.AddPayment.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click[com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.PayCalculateButton.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click[com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.ShipMethod.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$event$CheckoutClickEvent$Click[com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.EnrollInIncentive.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls8 extends PinterestCallbackWithDefaultFailure
    {

        final CheckoutController this$0;

        public void failure(PinterestError pinteresterror)
        {
            super.failure(pinteresterror);
            CrashReporting.a(pinteresterror.b());
            _eligibilityForIncentive = false;
        }

        public void success(ApiResponse apiresponse, Response response)
        {
            _eligibilityForIncentive = ((Boolean)apiresponse.getData()).booleanValue();
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls8()
        {
            this$0 = CheckoutController.this;
            super();
        }
    }


    private class _cls9 extends PinterestCallbackWithDefaultFailure
    {

        final CheckoutController this$0;

        public void failure(PinterestError pinteresterror)
        {
            super.failure(pinteresterror);
            _consentedToIncentive = false;
            Events.post(new ToastEvent(new SimpleToast(Resources.string(0x7f0706f1))));
        }

        public void success(ApiResponse apiresponse, Response response)
        {
            _consentedToIncentive = true;
            updateIncentiveMessage();
            _checkoutContainer.update(_checkoutViewModel);
            handleCartRefresh();
            fetchPaymentMethods();
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls9()
        {
            this$0 = CheckoutController.this;
            super();
        }
    }


    private class _cls4 extends PinterestCallbackWithDefaultFailure
    {

        final CheckoutController this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            _allPaymentMethods = (List)apiresponse.getData();
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls4()
        {
            this$0 = CheckoutController.this;
            super();
        }
    }


    private class _cls3 extends PinterestCallbackWithDefaultFailure
    {

        final CheckoutController this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            _allShippingDetails = (List)apiresponse.getData();
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls3()
        {
            this$0 = CheckoutController.this;
            super();
        }
    }


    private class _cls7 extends PinterestCallbackWithDefaultFailure
    {

        final CheckoutController this$0;
        final boolean val$isTotalsCalculation;

        public void failure(PinterestError pinteresterror)
        {
            EducationHelper.a(_eduRunnable);
            if (_checkoutContainer == null)
            {
                return;
            } else
            {
                _checkoutViewModel.flagFailure();
                _checkoutContainer.update(_checkoutViewModel);
                super.failure(pinteresterror);
                return;
            }
        }

        public void success(ApiResponse apiresponse, Response response)
        {
            if (_checkoutContainer == null)
            {
                return;
            }
            _cart = (Cart)apiresponse.getData();
            updateIncentiveMessage();
            if (isTotalsCalculation)
            {
                _checkoutViewModel.updateCartWithTotals(_cart);
                _checkoutContainer.update(_checkoutViewModel);
            } else
            {
                handleCartUpdateSuccess(apiresponse);
            }
            checkIfIncentiveNeedsConsent();
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls7()
        {
            this$0 = CheckoutController.this;
            isTotalsCalculation = flag;
            super();
        }
    }


    private class _cls5 extends PinterestCallbackWithDefaultFailure
    {

        final CheckoutController this$0;

        public void failure(PinterestError pinteresterror)
        {
            super.failure(pinteresterror);
            Events.post(new DialogEvent(null));
            _checkoutViewModel.flagFailure();
            _checkoutContainer.update(_checkoutViewModel);
            pinteresterror = pinteresterror.a();
            if (pinteresterror != null && pinteresterror.getData() != null && ((ErrorBody)pinteresterror.getData()).getCartStatus() == com.pinterest.model.commerce.Cart.PaymentStatus.FAILED.ordinal())
            {
                _checkoutViewModel.setShowProgress();
                _checkoutContainer.update(_checkoutViewModel);
                createCart();
            }
        }

        public void success(ApiResponse apiresponse, Response response)
        {
            if (_consentedToIncentive && _incentiveExperienceValue != null)
            {
                _incentiveExperienceValue.b();
            }
            handleCheckoutSuccess((Cart)apiresponse.getData());
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls5()
        {
            this$0 = CheckoutController.this;
            super();
        }
    }


    private class DisplayState extends Enum
    {

        private static final DisplayState $VALUES[];
        public static final DisplayState Checkout;
        public static final DisplayState VariantSelection;

        public static DisplayState valueOf(String s)
        {
            return (DisplayState)Enum.valueOf(com/pinterest/activity/commerce/logic/CheckoutController$DisplayState, s);
        }

        public static DisplayState[] values()
        {
            return (DisplayState[])$VALUES.clone();
        }

        static 
        {
            VariantSelection = new DisplayState("VariantSelection", 0);
            Checkout = new DisplayState("Checkout", 1);
            $VALUES = (new DisplayState[] {
                VariantSelection, Checkout
            });
        }

        private DisplayState(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
        implements VariantSelectionController.OnSelectedOptionsUpdatedListener
    {

        final CheckoutController this$0;

        public void onSelectedOptionsUpdated(Map map)
        {
            updateProductDetails(map);
        }

        _cls1()
        {
            this$0 = CheckoutController.this;
            super();
        }
    }


    private class _cls2
        implements VariantSelectionController.OnVariantSelectedListener
    {

        final CheckoutController this$0;

        public void onVariantSelectedListener(com.pinterest.api.model.BuyableProduct.Variant variant)
        {
            selectedVariant = variant;
            updateUIForState(DisplayState.Checkout);
        }

        _cls2()
        {
            this$0 = CheckoutController.this;
            super();
        }
    }

}

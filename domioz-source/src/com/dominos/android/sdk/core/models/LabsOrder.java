// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.constant.PaymentTag;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.loyalty.PricePlaceLoyalty;
import com.dominos.android.sdk.extension.model.Partners;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.a.a.a.a.f;
import org.a.a.a.a.g;
import org.c.d.d;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            LabsAddress, LabsPromotion, LabsProductLine, LabsPayment, 
//            LabsUpsellData, FoodMenu, LabsProduct

public class LabsOrder
{

    public static final String CARRYOUT = "Carryout";
    public static final String DELIVERY = "Delivery";
    private static final String ORDER_KEY = "savedorder";
    public static final double PRICE_CLEARED = -1D;
    private static final String TAG = com/dominos/android/sdk/core/models/LabsOrder.getName();
    public static final String UNKNOWN = "";
    public static final String WALLET = "Wallet";
    private LabsAddress address;
    private String businessDate;
    private String channel;
    private List couponLineList;
    private String customerId;
    private double deliveryAmount;
    private double depositAmount;
    private String easyOrderNickName;
    private String email;
    private String estimatedWaitMinutes;
    private String feature;
    private String firstName;
    private String id;
    private boolean isCouponRemoved;
    private boolean isEasyOrder;
    private boolean isEmailOptIn;
    private boolean isGenericCreditCardError;
    private String lastName;
    private double netAmount;
    private String originalOrderId;
    private Partners partner;
    private List paymentList;
    private PaymentTag paymentTag;
    private String phone;
    private String phoneExtension;
    private String placeOrderTime;
    private double price;
    private PricePlaceLoyalty pricePlaceLoyalty;
    private List productLineList;
    private LabsPromotion promotion;
    private List removedProductLineList;
    private boolean removedProducts;
    private String savings;
    private String serviceMethod;
    private String sourceOrganizationURI;
    private int status;
    private List statusItemList;
    private LabsAddress storeAddress;
    private String storeId;
    private String storeOrderId;
    private double taxAmount;
    private String upsellProductId;
    private boolean voiceOrder;
    private String voiceSessionID;

    public LabsOrder()
    {
        id = "";
        storeId = "";
        storeOrderId = "";
        placeOrderTime = "";
        email = "";
        estimatedWaitMinutes = "";
        phone = "";
        phoneExtension = "";
        firstName = "";
        lastName = "";
        serviceMethod = "";
        sourceOrganizationURI = "";
        upsellProductId = "";
        isGenericCreditCardError = false;
        customerId = "";
        isEasyOrder = false;
        easyOrderNickName = "";
        originalOrderId = "";
        businessDate = "";
        isCouponRemoved = false;
        isEmailOptIn = false;
        voiceOrder = false;
        voiceSessionID = "";
        savings = "";
        removedProducts = false;
        address = new LabsAddress();
        storeAddress = new LabsAddress();
        productLineList = new ArrayList();
        couponLineList = new ArrayList();
        promotion = new LabsPromotion();
        paymentList = new ArrayList();
        statusItemList = new ArrayList();
        removedProductLineList = new ArrayList();
    }

    public LabsOrder(LabsOrder labsorder)
    {
        id = "";
        storeId = "";
        storeOrderId = "";
        placeOrderTime = "";
        email = "";
        estimatedWaitMinutes = "";
        phone = "";
        phoneExtension = "";
        firstName = "";
        lastName = "";
        serviceMethod = "";
        sourceOrganizationURI = "";
        upsellProductId = "";
        isGenericCreditCardError = false;
        customerId = "";
        isEasyOrder = false;
        easyOrderNickName = "";
        originalOrderId = "";
        businessDate = "";
        isCouponRemoved = false;
        isEmailOptIn = false;
        voiceOrder = false;
        voiceSessionID = "";
        savings = "";
        removedProducts = false;
        id = labsorder.id;
        storeId = labsorder.storeId;
        storeOrderId = labsorder.storeOrderId;
        if (labsorder.address != null)
        {
            address = new LabsAddress(labsorder.address);
        }
        if (labsorder.storeAddress != null)
        {
            storeAddress = new LabsAddress(labsorder.storeAddress);
        }
        if (labsorder.productLineList != null)
        {
            productLineList = new ArrayList();
        }
        LabsProductLine labsproductline;
        for (Iterator iterator = labsorder.productLineList.iterator(); iterator.hasNext(); productLineList.add(new LabsProductLine(labsproductline)))
        {
            labsproductline = (LabsProductLine)iterator.next();
        }

        if (labsorder.couponLineList != null)
        {
            couponLineList = new ArrayList(labsorder.couponLineList);
        }
        if (labsorder.paymentList != null)
        {
            paymentList = new ArrayList(labsorder.paymentList);
        }
        if (labsorder.statusItemList != null)
        {
            statusItemList = new ArrayList(labsorder.statusItemList);
        }
        if (labsorder.removedProductLineList != null)
        {
            removedProductLineList = new ArrayList(labsorder.removedProductLineList);
        }
        paymentTag = labsorder.paymentTag;
        email = labsorder.email;
        estimatedWaitMinutes = labsorder.estimatedWaitMinutes;
        phone = labsorder.phone;
        phoneExtension = labsorder.phoneExtension;
        firstName = labsorder.firstName;
        lastName = labsorder.lastName;
        netAmount = labsorder.netAmount;
        taxAmount = labsorder.taxAmount;
        depositAmount = labsorder.depositAmount;
        deliveryAmount = labsorder.deliveryAmount;
        price = labsorder.price;
        serviceMethod = labsorder.serviceMethod;
        status = labsorder.status;
        sourceOrganizationURI = labsorder.sourceOrganizationURI;
        channel = labsorder.channel;
        upsellProductId = labsorder.upsellProductId;
        isGenericCreditCardError = labsorder.isGenericCreditCardError;
        customerId = labsorder.customerId;
        isEasyOrder = labsorder.isEasyOrder;
        easyOrderNickName = labsorder.easyOrderNickName;
        originalOrderId = labsorder.originalOrderId;
        businessDate = labsorder.businessDate;
        isCouponRemoved = labsorder.isCouponRemoved;
        isEmailOptIn = labsorder.isEmailOptIn;
        partner = labsorder.partner;
        feature = labsorder.feature;
        removedProducts = labsorder.removedProducts;
        pricePlaceLoyalty = labsorder.pricePlaceLoyalty;
    }

    private boolean canThisProductBeUpsold(LabsUpsellData.UpsellEntry upsellentry, boolean flag)
    {
        for (upsellentry = upsellentry.excludedByList.iterator(); upsellentry.hasNext();)
        {
            if (doesOrderHaveThisProduct((String)upsellentry.next(), flag))
            {
                return false;
            }
        }

        return true;
    }

    public static PaymentTag getPaymentTypeFordSync(LabsOrder labsorder)
    {
label0:
        {
            labsorder = labsorder.getPaymentList();
            if (d.isEmpty(labsorder))
            {
                break label0;
            }
            labsorder = labsorder.iterator();
            do
            {
                if (!labsorder.hasNext())
                {
                    break label0;
                }
            } while (!StringHelper.startsWithIgnoreCase(((LabsPayment)labsorder.next()).getPaymentType(), "CreditCard"));
            return PaymentTag.CREDIT;
        }
        return PaymentTag.CASH;
    }

    public void addCouponLine(LabsCouponLine labscouponline)
    {
        if (LoyaltyUtil.isLoyaltyCouponLine(labscouponline))
        {
            couponLineList.add(0, labscouponline);
            return;
        } else
        {
            couponLineList.add(labscouponline);
            return;
        }
    }

    public void addProductLine(LabsProductLine labsproductline)
    {
        productLineList.add(0, labsproductline);
    }

    public void autoRemove()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < productLineList.size(); i++)
        {
            if (!((LabsProductLine)productLineList.get(i)).isAutoRemove())
            {
                arraylist.add(productLineList.get(i));
            }
        }

        productLineList.clear();
        productLineList.addAll(arraylist);
    }

    public LabsOrder clearCart()
    {
        clearPayments();
        clearPrices();
        productLineList.clear();
        couponLineList.clear();
        removedProductLineList.clear();
        id = "";
        return this;
    }

    public LabsOrder clearPayments()
    {
        paymentList.clear();
        return this;
    }

    public LabsOrder clearPersonalInfo()
    {
        setCustomerId("");
        setEmail("");
        setFirstName("");
        setLastName("");
        setPhone("");
        setPhoneExtension("");
        setEasyOrder(false);
        setEasyOrderNickName("");
        setOriginalOrderId("");
        clearPayments();
        return this;
    }

    public LabsOrder clearPrices()
    {
        setNetAmount(-1D);
        setDeliveryAmount(-1D);
        setTaxAmount(-1D);
        setDepositAmount(-1D);
        setPrice(-1D);
        for (Iterator iterator = productLineList.iterator(); iterator.hasNext(); ((LabsProductLine)iterator.next()).setPrice(-1D)) { }
        return this;
    }

    public String determineUpsellProduct(LabsUpsellData labsupselldata, FoodMenu foodmenu, boolean flag)
    {
        if (labsupselldata == null)
        {
            return null;
        }
        for (labsupselldata = labsupselldata.getUpsellList().iterator(); labsupselldata.hasNext();)
        {
            LabsUpsellData.UpsellEntry upsellentry = (LabsUpsellData.UpsellEntry)labsupselldata.next();
            if (canThisProductBeUpsold(upsellentry, flag) && foodmenu.hasVariant(upsellentry.upsellCode))
            {
                return upsellentry.upsellCode;
            }
        }

        return null;
    }

    public boolean doesOrderHaveThisProduct(String s, boolean flag)
    {
        for (Iterator iterator = productLineList.iterator(); iterator.hasNext();)
        {
            if (((LabsProductLine)iterator.next()).getCode().equalsIgnoreCase(s))
            {
                return true;
            }
        }

        return flag && StringHelper.equalsIgnoreCase(s, "FORDSYNC");
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LabsOrder)obj;
            if (address == null ? ((LabsOrder) (obj)).address != null : !address.equals(((LabsOrder) (obj)).address))
            {
                return false;
            }
            if (businessDate == null ? ((LabsOrder) (obj)).businessDate != null : !businessDate.equals(((LabsOrder) (obj)).businessDate))
            {
                return false;
            }
            if (couponLineList == null ? ((LabsOrder) (obj)).couponLineList != null : !couponLineList.equals(((LabsOrder) (obj)).couponLineList))
            {
                return false;
            }
            if (customerId == null ? ((LabsOrder) (obj)).customerId != null : !customerId.equals(((LabsOrder) (obj)).customerId))
            {
                return false;
            }
            if (email == null ? ((LabsOrder) (obj)).email != null : !email.equals(((LabsOrder) (obj)).email))
            {
                return false;
            }
            if (firstName == null ? ((LabsOrder) (obj)).firstName != null : !firstName.equals(((LabsOrder) (obj)).firstName))
            {
                return false;
            }
            if (id == null ? ((LabsOrder) (obj)).id != null : !id.equals(((LabsOrder) (obj)).id))
            {
                return false;
            }
            if (lastName == null ? ((LabsOrder) (obj)).lastName != null : !lastName.equals(((LabsOrder) (obj)).lastName))
            {
                return false;
            }
            if (originalOrderId == null ? ((LabsOrder) (obj)).originalOrderId != null : !originalOrderId.equals(((LabsOrder) (obj)).originalOrderId))
            {
                return false;
            }
            if (paymentList == null ? ((LabsOrder) (obj)).paymentList != null : !paymentList.equals(((LabsOrder) (obj)).paymentList))
            {
                return false;
            }
            if (phone == null ? ((LabsOrder) (obj)).phone != null : !phone.equals(((LabsOrder) (obj)).phone))
            {
                return false;
            }
            if (phoneExtension == null ? ((LabsOrder) (obj)).phoneExtension != null : !phoneExtension.equals(((LabsOrder) (obj)).phoneExtension))
            {
                return false;
            }
            if (productLineList == null ? ((LabsOrder) (obj)).productLineList != null : !productLineList.equals(((LabsOrder) (obj)).productLineList))
            {
                return false;
            }
            if (serviceMethod == null ? ((LabsOrder) (obj)).serviceMethod != null : !serviceMethod.equals(((LabsOrder) (obj)).serviceMethod))
            {
                return false;
            }
            if (sourceOrganizationURI == null ? ((LabsOrder) (obj)).sourceOrganizationURI != null : !sourceOrganizationURI.equals(((LabsOrder) (obj)).sourceOrganizationURI))
            {
                return false;
            }
            if (storeAddress == null ? ((LabsOrder) (obj)).storeAddress != null : !storeAddress.equals(((LabsOrder) (obj)).storeAddress))
            {
                return false;
            }
            if (storeId == null ? ((LabsOrder) (obj)).storeId != null : !storeId.equals(((LabsOrder) (obj)).storeId))
            {
                return false;
            }
            if (storeOrderId == null ? ((LabsOrder) (obj)).storeOrderId != null : !storeOrderId.equals(((LabsOrder) (obj)).storeOrderId))
            {
                return false;
            }
            if (promotion == null ? ((LabsOrder) (obj)).promotion != null : !promotion.equals(((LabsOrder) (obj)).promotion))
            {
                return false;
            }
            if (paymentTag == null ? ((LabsOrder) (obj)).paymentTag != null : !paymentTag.equals(((LabsOrder) (obj)).paymentTag))
            {
                return false;
            }
            if (feature == null ? ((LabsOrder) (obj)).feature != null : !feature.equals(((LabsOrder) (obj)).feature))
            {
                return false;
            }
            if (pricePlaceLoyalty == null ? ((LabsOrder) (obj)).pricePlaceLoyalty != null : !pricePlaceLoyalty.equals(((LabsOrder) (obj)).pricePlaceLoyalty))
            {
                return false;
            }
            if (removedProductLineList == null ? ((LabsOrder) (obj)).removedProductLineList != null : !removedProductLineList.equals(((LabsOrder) (obj)).removedProductLineList))
            {
                return false;
            }
        }
        return true;
    }

    public LabsAddress getAddress()
    {
        return address;
    }

    public String getBusinessDate()
    {
        return businessDate;
    }

    public String getChannel()
    {
        return channel;
    }

    public List getCouponLineList()
    {
        return couponLineList;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public double getDeliveryAmount()
    {
        return deliveryAmount;
    }

    public double getDepositAmount()
    {
        return depositAmount;
    }

    public String getEasyOrderNickName()
    {
        return easyOrderNickName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getEstimatedWaitMinutes()
    {
        return estimatedWaitMinutes;
    }

    public String getFeature()
    {
        return feature;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getId()
    {
        return id;
    }

    public String getImageCode()
    {
        return "Order";
    }

    public String getLastName()
    {
        return lastName;
    }

    public Object getLineById(int i)
    {
        if (i >= couponLineList.size() + productLineList.size())
        {
            return null;
        }
        if (i < couponLineList.size())
        {
            return couponLineList.get(i);
        } else
        {
            return productLineList.get(i - couponLineList.size());
        }
    }

    public int getLineCount()
    {
        return couponLineList.size() + productLineList.size();
    }

    public double getNetAmount()
    {
        return netAmount;
    }

    public String getOriginalOrderId()
    {
        return originalOrderId;
    }

    public Partners getPartners()
    {
        return partner;
    }

    public List getPaymentList()
    {
        return paymentList;
    }

    public PaymentTag getPaymentTag()
    {
        return paymentTag;
    }

    public String getPaymentType()
    {
        if (paymentList != null && paymentList.size() > 0)
        {
            return ((LabsPayment)paymentList.get(0)).getPaymentType();
        } else
        {
            return null;
        }
    }

    public String getPhone()
    {
        return phone;
    }

    public String getPhoneExtension()
    {
        return phoneExtension;
    }

    public String getPlaceOrderTime()
    {
        return placeOrderTime;
    }

    public double getPrice()
    {
        return price;
    }

    public PricePlaceLoyalty getPricePlaceLoyalty()
    {
        return pricePlaceLoyalty;
    }

    public List getProductLineList()
    {
        return productLineList;
    }

    public LabsPromotion getPromotion()
    {
        return promotion;
    }

    public Double getPromotionalDiscountAmount(String s)
    {
        return null;
    }

    public List getRemovedProductLineList()
    {
        return removedProductLineList;
    }

    public String getSavings()
    {
        return savings;
    }

    public String getServiceMethod()
    {
        return serviceMethod;
    }

    public String getSourceOrganizationURI()
    {
        return sourceOrganizationURI;
    }

    public int getStatus()
    {
        return status;
    }

    public List getStatusItemList()
    {
        return statusItemList;
    }

    public LabsAddress getStoreAddress()
    {
        return storeAddress;
    }

    public String getStoreId()
    {
        return storeId;
    }

    public String getStoreOrderId()
    {
        return storeOrderId;
    }

    public double getTaxAmount()
    {
        return taxAmount;
    }

    public String getTitle()
    {
        return "Order";
    }

    public String getUpsellProductId()
    {
        return upsellProductId;
    }

    public String getVoiceSessionID()
    {
        return voiceSessionID;
    }

    public boolean hasPersonalInfo()
    {
        return !firstName.trim().equals("") && !lastName.trim().equals("") && !phone.trim().equals("") && !email.trim().equals("");
    }

    public boolean hasWings()
    {
        for (Iterator iterator = productLineList.iterator(); iterator.hasNext();)
        {
            if (((LabsProductLine)iterator.next()).getProduct().getProductType().equalsIgnoreCase("Wings"))
            {
                return true;
            }
        }

        return false;
    }

    public int hashCode()
    {
        int l5 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        if (id != null)
        {
            i = id.hashCode();
        } else
        {
            i = 0;
        }
        if (storeId != null)
        {
            j = storeId.hashCode();
        } else
        {
            j = 0;
        }
        if (storeOrderId != null)
        {
            k = storeOrderId.hashCode();
        } else
        {
            k = 0;
        }
        if (address != null)
        {
            l = address.hashCode();
        } else
        {
            l = 0;
        }
        if (storeAddress != null)
        {
            i1 = storeAddress.hashCode();
        } else
        {
            i1 = 0;
        }
        if (productLineList != null)
        {
            j1 = productLineList.hashCode();
        } else
        {
            j1 = 0;
        }
        if (couponLineList != null)
        {
            k1 = couponLineList.hashCode();
        } else
        {
            k1 = 0;
        }
        if (paymentList != null)
        {
            l1 = paymentList.hashCode();
        } else
        {
            l1 = 0;
        }
        if (email != null)
        {
            i2 = email.hashCode();
        } else
        {
            i2 = 0;
        }
        if (phone != null)
        {
            j2 = phone.hashCode();
        } else
        {
            j2 = 0;
        }
        if (phoneExtension != null)
        {
            k2 = phoneExtension.hashCode();
        } else
        {
            k2 = 0;
        }
        if (firstName != null)
        {
            l2 = firstName.hashCode();
        } else
        {
            l2 = 0;
        }
        if (lastName != null)
        {
            i3 = lastName.hashCode();
        } else
        {
            i3 = 0;
        }
        if (serviceMethod != null)
        {
            j3 = serviceMethod.hashCode();
        } else
        {
            j3 = 0;
        }
        if (sourceOrganizationURI != null)
        {
            k3 = sourceOrganizationURI.hashCode();
        } else
        {
            k3 = 0;
        }
        if (customerId != null)
        {
            l3 = customerId.hashCode();
        } else
        {
            l3 = 0;
        }
        if (originalOrderId != null)
        {
            i4 = originalOrderId.hashCode();
        } else
        {
            i4 = 0;
        }
        if (businessDate != null)
        {
            j4 = businessDate.hashCode();
        } else
        {
            j4 = 0;
        }
        if (promotion != null)
        {
            k4 = promotion.hashCode();
        } else
        {
            k4 = 0;
        }
        if (paymentTag != null)
        {
            l4 = paymentTag.hashCode();
        } else
        {
            l4 = 0;
        }
        if (partner != null)
        {
            i5 = partner.hashCode();
        } else
        {
            i5 = 0;
        }
        if (feature != null)
        {
            j5 = feature.hashCode();
        } else
        {
            j5 = 0;
        }
        if (pricePlaceLoyalty != null)
        {
            k5 = pricePlaceLoyalty.hashCode();
        } else
        {
            k5 = 0;
        }
        if (removedProductLineList != null)
        {
            l5 = removedProductLineList.hashCode();
        }
        return (k5 + (j5 + (i5 + (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l5;
    }

    public boolean isCarryout()
    {
        return serviceMethod.equalsIgnoreCase("Carryout");
    }

    public boolean isCouponRemoved()
    {
        return isCouponRemoved;
    }

    public boolean isDelivery()
    {
        return serviceMethod.equalsIgnoreCase("Delivery");
    }

    public boolean isDuplicateOrder()
    {
        for (Iterator iterator = statusItemList.iterator(); iterator.hasNext();)
        {
            String s = (String)((Map)iterator.next()).get("PulseText");
            if (s != null && s.equalsIgnoreCase("Duplicate OrderID"))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isEasyOrder()
    {
        return isEasyOrder;
    }

    public boolean isEligibleForPromotion(String s)
    {
        return false;
    }

    public boolean isEmailOptIn()
    {
        return isEmailOptIn;
    }

    public boolean isGenericCreditCardError()
    {
        return isGenericCreditCardError;
    }

    public boolean isPaymentTypeAnonymousCreditCard()
    {
label0:
        {
            if (paymentList == null)
            {
                break label0;
            }
            Iterator iterator = paymentList.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((LabsPayment)iterator.next()).getPaymentType().equalsIgnoreCase("CreditCard"));
            return true;
        }
        return false;
    }

    public boolean isPaymentTypeSavedCreditCard()
    {
label0:
        {
            if (paymentList == null)
            {
                break label0;
            }
            Iterator iterator = paymentList.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((LabsPayment)iterator.next()).getPaymentType().equalsIgnoreCase("CreditCardToken"));
            return true;
        }
        return false;
    }

    public boolean isPricingNeeded()
    {
        return price == -1D || status < 0 || isStatusFailure();
    }

    public boolean isProductRemoved()
    {
        return removedProducts;
    }

    public boolean isPulseError()
    {
        for (Iterator iterator = statusItemList.iterator(); iterator.hasNext();)
        {
            if (((Map)iterator.next()).get("PulseText") != null)
            {
                return true;
            }
        }

        return false;
    }

    public boolean isRecentOrder()
    {
        return originalOrderId != null && !originalOrderId.equals("");
    }

    public boolean isStatusFailure()
    {
        for (Iterator iterator = statusItemList.iterator(); iterator.hasNext();)
        {
            Map map = (Map)iterator.next();
            if (map.get("Code") != null && ((String)map.get("Code")).equalsIgnoreCase("Failure"))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isValidPromotionalOrderForThisPromo(String s)
    {
        return false;
    }

    public boolean isVoiceOrder()
    {
        return voiceOrder;
    }

    public boolean needsCustomization()
    {
        for (Iterator iterator = productLineList.iterator(); iterator.hasNext();)
        {
            if (((LabsProductLine)iterator.next()).isNeedsCustomization())
            {
                return true;
            }
        }

        return false;
    }

    public void passOrderHistoryOptions(LabsOrder labsorder)
    {
        setBusinessDate(labsorder.getBusinessDate());
        setServiceMethod(labsorder.getServiceMethod());
        setAddress(labsorder.getAddress());
        setStoreId(labsorder.getStoreId());
        setStoreAddress(labsorder.getStoreAddress());
        setCustomerId(labsorder.getCustomerId());
        setEasyOrder(labsorder.isEasyOrder());
        setEasyOrderNickName(labsorder.getEasyOrderNickName());
        setOriginalOrderId(labsorder.getOriginalOrderId());
        setCouponRemoved(labsorder.isCouponRemoved);
        setPaymentList(labsorder.getPaymentList());
        setProductRemoved(labsorder.isProductRemoved());
    }

    public LabsOrder rePopuluateGiftCardPayments(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            GiftCard giftcard;
            for (arraylist = arraylist.iterator(); arraylist.hasNext(); paymentList.add(0, new LabsPayment(giftcard)))
            {
                giftcard = (GiftCard)arraylist.next();
            }

        }
        return this;
    }

    public void removeCouponLine(LabsCouponLine labscouponline)
    {
        Iterator iterator = couponLineList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsCouponLine labscouponline1 = (LabsCouponLine)iterator.next();
            if (!StringHelper.equalsIgnoreCase(labscouponline1.getCoupon().getCode(), labscouponline.getCoupon().getCode()))
            {
                continue;
            }
            labscouponline1.getCoupon().setDoneEditing(false);
            couponLineList.remove(labscouponline1);
            break;
        } while (true);
    }

    public void removeIfNeedsCustomization()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < productLineList.size(); i++)
        {
            if (!((LabsProductLine)productLineList.get(i)).isNeedsCustomization())
            {
                arraylist.add(productLineList.get(i));
            }
        }

        productLineList.clear();
        productLineList.addAll(arraylist);
    }

    public void removeProductLine(LabsProductLine labsproductline)
    {
        productLineList.remove(labsproductline);
    }

    public void replaceLineById(LabsProductLine labsproductline)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < productLineList.size())
                {
                    if (((LabsProductLine)productLineList.get(i)).getId() != labsproductline.getId())
                    {
                        break label0;
                    }
                    productLineList.set(i, labsproductline);
                }
                return;
            }
            i++;
        } while (true);
    }

    public void setAddress(LabsAddress labsaddress)
    {
        address = labsaddress;
    }

    public void setBusinessDate(String s)
    {
        businessDate = s;
    }

    public void setChannel(String s)
    {
        channel = s;
    }

    public void setCouponLineList(List list)
    {
        couponLineList = list;
    }

    public void setCouponRemoved(boolean flag)
    {
        isCouponRemoved = flag;
    }

    public void setCustomerId(String s)
    {
        customerId = s;
    }

    public void setDeliveryAmount(double d1)
    {
        deliveryAmount = d1;
    }

    public void setDepositAmount(double d1)
    {
        depositAmount = d1;
    }

    public void setEasyOrder(boolean flag)
    {
        isEasyOrder = flag;
    }

    public void setEasyOrderNickName(String s)
    {
        easyOrderNickName = s;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setEmailOptIn(boolean flag)
    {
        isEmailOptIn = flag;
    }

    public void setEstimatedWaitMinutes(String s)
    {
        estimatedWaitMinutes = s;
    }

    public void setFeature(String s)
    {
        feature = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setGenericCreditCardError(boolean flag)
    {
        isGenericCreditCardError = flag;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setNetAmount(double d1)
    {
        netAmount = d1;
    }

    public void setOriginalOrderId(String s)
    {
        originalOrderId = s;
    }

    public void setPartner(Partners partners)
    {
        partner = partners;
    }

    public void setPaymentList(List list)
    {
        paymentList = list;
    }

    public void setPaymentTag(PaymentTag paymenttag)
    {
        paymentTag = paymenttag;
    }

    public void setPhone(String s)
    {
        phone = s;
    }

    public void setPhoneExtension(String s)
    {
        phoneExtension = s;
    }

    public void setPlaceOrderTime(String s)
    {
        placeOrderTime = s;
    }

    public void setPrice(double d1)
    {
        price = d1;
    }

    public void setPricePlaceLoyalty(PricePlaceLoyalty priceplaceloyalty)
    {
        pricePlaceLoyalty = priceplaceloyalty;
    }

    public void setProductLineList(List list)
    {
        productLineList = list;
    }

    public void setProductRemoved(boolean flag)
    {
        removedProducts = flag;
    }

    public void setPromotion(LabsPromotion labspromotion)
    {
        promotion = labspromotion;
    }

    public void setRemovedProductLineList(List list)
    {
        removedProductLineList = list;
    }

    public void setSavings(String s)
    {
        savings = s;
    }

    public void setServiceMethod(String s)
    {
        serviceMethod = s;
    }

    public void setSourceOrganizationURI(String s)
    {
        sourceOrganizationURI = s;
    }

    public void setStatus(int i)
    {
        status = i;
    }

    public void setStatusItemList(List list)
    {
        statusItemList = list;
    }

    public void setStoreAddress(LabsAddress labsaddress)
    {
        storeAddress = labsaddress;
    }

    public void setStoreId(String s)
    {
        storeId = s;
    }

    public void setStoreOrderId(String s)
    {
        storeOrderId = s;
    }

    public void setTaxAmount(double d1)
    {
        taxAmount = d1;
    }

    public void setUpsellProductId(String s)
    {
        upsellProductId = s;
    }

    public void setVoiceOrder(boolean flag)
    {
        voiceOrder = flag;
    }

    public void setVoiceSessionID(String s)
    {
        voiceSessionID = s;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }

}

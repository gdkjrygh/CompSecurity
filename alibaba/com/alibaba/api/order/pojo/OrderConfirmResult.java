// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import com.alibaba.api.base.pojo.Amount;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.alibaba.api.order.pojo:
//            OrderSellerView, OrderConfirmView, OrderItemView, MailingAddressView

public class OrderConfirmResult
    implements Serializable
{
    public static class MobileOrderCouponDTO
        implements Serializable
    {

        public String couponCode;
        public long couponId;
        public Amount discountAmount;
        public Date endDate;
        public String isMobileSpecial;
        public boolean isSelected;
        public String isSellerCoupon;
        public Amount orderLimitAmount;
        public Long sellerAdminSeq;
        public Date startDate;

        public MobileOrderCouponDTO()
        {
        }
    }

    public static class MobileOrderPromotionDTO
        implements Serializable
    {

        public Amount discountAmount;
        public String isMobileSpecial;
        public Amount orderLimitAmount;
        public long promotionId;
        public String promotionName;

        public MobileOrderPromotionDTO()
        {
        }
    }

    public static class OrderConfirmPromotionCheckResult
        implements Serializable
    {

        private static String NO_USE_COUPON = "nouse";
        private static String USE_CODE = "code";
        private static String USE_COUPON = "coupon";
        public List aeCouponList;
        private String couponType;
        public Amount currentOrderAmount;
        public Amount previewCurrentOrderAmount;
        public MobileOrderCouponDTO selectedAeCouponInfo;
        public MobileOrderPromotionDTO selectedPromotionInfo;
        public Map selectedSellerCouponMap;
        public Map sellerCouponMap;

        public boolean isNoUseCoupon()
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

        public boolean isUseCode()
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

        public boolean isUseCoupon()
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

        public void setNoUseCoupon()
        {
            couponType = NO_USE_COUPON;
        }

        public void setUseCode()
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

        public void setUseCoupon()
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }


        public OrderConfirmPromotionCheckResult()
        {
        }
    }

    public static class SellerCoupon
    {

        public String sellerCoupon;
        public String sellerSeq;

        public SellerCoupon()
        {
        }
    }


    private static final long serialVersionUID = 1L;
    public int availableTotalProductItems;
    private float discount;
    public List errorProductList;
    public boolean isSuccess;
    private boolean mobilePromotion;
    public List orderSellerViewList;
    public Amount previewTotalOrderAmount;
    public OrderConfirmPromotionCheckResult promotionCheckResult;
    public MailingAddressView selectedAddress;
    public String sellerCountryCode;
    public Amount totalOrderAmount;

    public OrderConfirmResult()
    {
    }

    public List getProductOrderView(OrderConfirmResult orderconfirmresult, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (orderconfirmresult != null && orderconfirmresult.orderSellerViewList != null)
        {
            orderconfirmresult = orderconfirmresult.orderSellerViewList;
label0:
            for (int i = 0; i < orderconfirmresult.size(); i++)
            {
                OrderSellerView ordersellerview = (OrderSellerView)orderconfirmresult.get(i);
                OrderConfirmView orderconfirmview = new OrderConfirmView();
                orderconfirmview.sellerAdminSeq = ordersellerview.sellerAdminSeq;
                orderconfirmview.companyName = ordersellerview.companyName;
                orderconfirmview.companyId = ordersellerview.companyId;
                orderconfirmview.orderUniqueId = ordersellerview.orderUniqueId;
                orderconfirmview.viewType = 0;
                arraylist.add(orderconfirmview);
                if (flag)
                {
                    if (ordersellerview == null || ordersellerview.orderItems == null)
                    {
                        continue;
                    }
                    List list = ordersellerview.orderItems;
                    int j = 0;
                    do
                    {
                        if (j >= list.size())
                        {
                            continue label0;
                        }
                        OrderItemView orderitemview1 = (OrderItemView)list.get(j);
                        OrderConfirmView orderconfirmview1 = new OrderConfirmView();
                        orderconfirmview1.sellerAdminSeq = ordersellerview.sellerAdminSeq;
                        orderconfirmview1.hasError = orderitemview1.hasError;
                        orderconfirmview1.hasWarning = orderitemview1.hasWarning;
                        orderconfirmview1.itemMsg = orderitemview1.itemMsg;
                        orderconfirmview1.baseProductView = orderitemview1.baseProductView;
                        orderconfirmview.baseProductView = orderitemview1.baseProductView;
                        orderconfirmview1.promotionView = orderitemview1.promotionView;
                        orderconfirmview1.freightView = orderitemview1.freightView;
                        orderconfirmview.freightView = orderitemview1.freightView;
                        orderconfirmview1.availableProductTotalAmount = ordersellerview.availableProductTotalAmount;
                        orderconfirmview1.mbExclusiveFlag = orderitemview1.mbExclusiveFlag;
                        orderconfirmview1.viewType = 3;
                        if (j == list.size() - 1)
                        {
                            OrderConfirmView orderconfirmview2 = new OrderConfirmView();
                            orderconfirmview2.sellerAdminSeq = ordersellerview.sellerAdminSeq;
                            orderconfirmview2.totalFreightAmount = ordersellerview.totalFreightAmount;
                            orderconfirmview2.savedFreightAmount = ordersellerview.savedFreightAmount;
                            orderconfirmview2.fixedDiscountSaveAmount = ordersellerview.fixedDiscountSaveAmount;
                            orderconfirmview2.fixedDiscountPromotion = ordersellerview.fixedDiscountPromotion;
                            orderconfirmview2.availableProductAmount = ordersellerview.availableProductAmount;
                            orderconfirmview2.availableProductTotalAmount = ordersellerview.availableProductTotalAmount;
                            orderconfirmview2.viewType = 2;
                            orderconfirmview1.subTotalProductView = orderconfirmview2;
                        }
                        arraylist.add(orderconfirmview1);
                        j++;
                    } while (true);
                }
                if (ordersellerview != null && ordersellerview.orderItems != null)
                {
                    List list1 = ordersellerview.orderItems;
                    for (int k = 0; k < list1.size(); k++)
                    {
                        OrderItemView orderitemview = (OrderItemView)list1.get(k);
                        OrderConfirmView orderconfirmview3 = new OrderConfirmView();
                        orderconfirmview3.sellerAdminSeq = ordersellerview.sellerAdminSeq;
                        orderconfirmview3.hasError = orderitemview.hasError;
                        orderconfirmview3.hasWarning = orderitemview.hasWarning;
                        orderconfirmview3.itemMsg = orderitemview.itemMsg;
                        orderconfirmview3.baseProductView = orderitemview.baseProductView;
                        orderconfirmview.baseProductView = orderitemview.baseProductView;
                        orderconfirmview3.promotionView = orderitemview.promotionView;
                        orderconfirmview3.freightView = orderitemview.freightView;
                        orderconfirmview.freightView = orderitemview.freightView;
                        orderconfirmview3.availableProductTotalAmount = ordersellerview.availableProductTotalAmount;
                        orderconfirmview3.mbExclusiveFlag = orderitemview.mbExclusiveFlag;
                        orderconfirmview3.viewType = 1;
                        arraylist.add(orderconfirmview3);
                    }

                }
                orderconfirmview = new OrderConfirmView();
                orderconfirmview.sellerAdminSeq = ordersellerview.sellerAdminSeq;
                orderconfirmview.totalFreightAmount = ordersellerview.totalFreightAmount;
                orderconfirmview.savedFreightAmount = ordersellerview.savedFreightAmount;
                orderconfirmview.fixedDiscountSaveAmount = ordersellerview.fixedDiscountSaveAmount;
                orderconfirmview.fixedDiscountPromotion = ordersellerview.fixedDiscountPromotion;
                orderconfirmview.availableProductAmount = ordersellerview.availableProductAmount;
                orderconfirmview.availableProductTotalAmount = ordersellerview.availableProductTotalAmount;
                orderconfirmview.viewType = 2;
                arraylist.add(orderconfirmview);
            }

        }
        return arraylist;
    }
}

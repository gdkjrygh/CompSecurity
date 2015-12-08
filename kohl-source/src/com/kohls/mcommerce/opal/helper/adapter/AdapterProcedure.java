// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.adapter;

import com.kohls.mcommerce.opal.framework.vo.AuthorsByIdsVO;
import com.kohls.mcommerce.opal.framework.vo.CMSResponseVO;
import com.kohls.mcommerce.opal.framework.vo.CalculateOrderVO;
import com.kohls.mcommerce.opal.framework.vo.CategoryVO;
import com.kohls.mcommerce.opal.framework.vo.ConfigurationVO;
import com.kohls.mcommerce.opal.framework.vo.CreateProfileVO;
import com.kohls.mcommerce.opal.framework.vo.FlushdataVO;
import com.kohls.mcommerce.opal.framework.vo.ForgotPasswordVO;
import com.kohls.mcommerce.opal.framework.vo.GetCustomerProfileVO;
import com.kohls.mcommerce.opal.framework.vo.HelpContactUsVO;
import com.kohls.mcommerce.opal.framework.vo.LoyaltyHelpVO;
import com.kohls.mcommerce.opal.framework.vo.OffersVO;
import com.kohls.mcommerce.opal.framework.vo.PersistentGetCartVO;
import com.kohls.mcommerce.opal.framework.vo.PricingVO;
import com.kohls.mcommerce.opal.framework.vo.ProductDetailVO;
import com.kohls.mcommerce.opal.framework.vo.ProductMatrixVO;
import com.kohls.mcommerce.opal.framework.vo.RecommendationsVO;
import com.kohls.mcommerce.opal.framework.vo.RegistryResponseVO;
import com.kohls.mcommerce.opal.framework.vo.SignInAndProfileVO;
import com.kohls.mcommerce.opal.framework.vo.StoreInventoryVO;
import com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO;
import com.kohls.mcommerce.opal.framework.vo.SubCategoryVO;
import com.kohls.mcommerce.opal.framework.vo.TokenRegisrationVO;
import com.kohls.mcommerce.opal.framework.vo.UpdateAccountVO;
import com.kohls.mcommerce.opal.framework.vo.UpdateCartVO;
import com.kohls.mcommerce.opal.framework.vo.WriteReviewVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.DeleteShippingAddressVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.UpdateShippingAddressVO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.ValidateOrderVO;

public final class AdapterProcedure extends Enum
{

    private static final AdapterProcedure $VALUES[];
    private static final String ADAPTER_NAME = "RESTAdapter";
    public static final AdapterProcedure CACHE_FLUSH_API;
    public static final AdapterProcedure CALCULATE_ORDER;
    public static final AdapterProcedure CLIENT_LOGGER;
    public static final AdapterProcedure CMS_FEATURE_BRANDS;
    public static final AdapterProcedure CMS_HELP_AND_CONTACT_US;
    public static final AdapterProcedure CMS_HOME;
    public static final AdapterProcedure CMS_LOYALTY_HELP;
    public static final AdapterProcedure CONFIGURATION_DATA;
    public static final AdapterProcedure CREATE_PROFILE;
    public static final AdapterProcedure DELETE_SHIPPING_ADDRESS;
    public static final AdapterProcedure FORGOT_PASSWORD;
    public static final AdapterProcedure GET_CART;
    public static final AdapterProcedure GET_CUSTOMER_PROFILE;
    public static final AdapterProcedure INVENTORY_BY_STORESEARCH;
    public static final AdapterProcedure PRICE_DETAILS;
    public static final AdapterProcedure PRODUCT_DETAIL;
    public static final AdapterProcedure PRODUCT_FOR_CATEGORYID;
    public static final AdapterProcedure PRODUCT_FOR_DEPARTMENTID;
    public static final AdapterProcedure PRODUCT_FOR_DIMENSIONS;
    public static final AdapterProcedure PRODUCT_OFFERS;
    public static final AdapterProcedure RATING_REVIEWS;
    public static final AdapterProcedure RECOMMENDATION;
    public static final AdapterProcedure REGISTRY_LANDING_CMS;
    public static final AdapterProcedure SIGNIN_AND_PROFILE;
    public static final AdapterProcedure STORE_BY_OPENSEARCH;
    public static final AdapterProcedure TOKEN_REGISRATION;
    public static final AdapterProcedure UPDATE_ACCOUNT;
    public static final AdapterProcedure UPDATE_CART;
    public static final AdapterProcedure UPDATE_SHIPPING_ADDRESS;
    public static final AdapterProcedure VALIDATE_ORDER;
    public static final AdapterProcedure WRITE_REVIEWS;
    public static final AdapterProcedure WRITE_REVIEWS_GET_AUTHER;
    private String mMethod;
    private String mURI;
    private Class mValueObjectClass;

    private AdapterProcedure(String s, int i, String s1, String s2)
    {
        super(s, i);
        mMethod = null;
        mURI = null;
        mMethod = s1;
        mURI = s2;
    }

    private AdapterProcedure(String s, int i, String s1, String s2, Class class1)
    {
        super(s, i);
        mMethod = null;
        mURI = null;
        mMethod = s1;
        mURI = s2;
        mValueObjectClass = class1;
    }

    public static AdapterProcedure valueOf(String s)
    {
        return (AdapterProcedure)Enum.valueOf(com/kohls/mcommerce/opal/helper/adapter/AdapterProcedure, s);
    }

    public static AdapterProcedure[] values()
    {
        return (AdapterProcedure[])$VALUES.clone();
    }

    public String getAdapterName()
    {
        return "RESTAdapter";
    }

    public String getMethod()
    {
        return mMethod;
    }

    public String getProcedureName()
    {
        return mURI;
    }

    public String getURI()
    {
        return mURI;
    }

    public Class getValueObjectClass()
    {
        return mValueObjectClass;
    }

    public void setValueObjectClass(Class class1)
    {
        mValueObjectClass = class1;
    }

    static 
    {
        PRODUCT_DETAIL = new AdapterProcedure("PRODUCT_DETAIL", 0, "GET", "/adapters/rest/v1/products/", com/kohls/mcommerce/opal/framework/vo/ProductDetailVO);
        PRICE_DETAILS = new AdapterProcedure("PRICE_DETAILS", 1, "GET", "/adapters/rest/v1/price/", com/kohls/mcommerce/opal/framework/vo/PricingVO);
        CMS_HOME = new AdapterProcedure("CMS_HOME", 2, "GET", "/adapters/rest/v1/cms", com/kohls/mcommerce/opal/framework/vo/CMSResponseVO);
        PRODUCT_FOR_DIMENSIONS = new AdapterProcedure("PRODUCT_FOR_DIMENSIONS", 3, "GET", "/adapters/rest/v1/catalog/", com/kohls/mcommerce/opal/framework/vo/ProductMatrixVO);
        SIGNIN_AND_PROFILE = new AdapterProcedure("SIGNIN_AND_PROFILE", 4, "POST", "/adapters/rest/v1/auth/signInProfile", com/kohls/mcommerce/opal/framework/vo/SignInAndProfileVO);
        CREATE_PROFILE = new AdapterProcedure("CREATE_PROFILE", 5, "POST", "/adapters/rest/v1/profile", com/kohls/mcommerce/opal/framework/vo/CreateProfileVO);
        PRODUCT_FOR_CATEGORYID = new AdapterProcedure("PRODUCT_FOR_CATEGORYID", 6, "GET", "/adapters/rest/v1/catalog/category/", com/kohls/mcommerce/opal/framework/vo/CategoryVO);
        PRODUCT_FOR_DEPARTMENTID = new AdapterProcedure("PRODUCT_FOR_DEPARTMENTID", 7, "GET", "/adapters/rest/v1/catalog/category/", com/kohls/mcommerce/opal/framework/vo/SubCategoryVO);
        RECOMMENDATION = new AdapterProcedure("RECOMMENDATION", 8, "GET", "/adapters/rest/v1/recommendation", com/kohls/mcommerce/opal/framework/vo/RecommendationsVO);
        CALCULATE_ORDER = new AdapterProcedure("CALCULATE_ORDER", 9, "POST", "/adapters/rest/v1/order/calculation", com/kohls/mcommerce/opal/framework/vo/CalculateOrderVO);
        CMS_HELP_AND_CONTACT_US = new AdapterProcedure("CMS_HELP_AND_CONTACT_US", 10, "GET", "/adapters/rest/v1/cms", com/kohls/mcommerce/opal/framework/vo/HelpContactUsVO);
        CMS_LOYALTY_HELP = new AdapterProcedure("CMS_LOYALTY_HELP", 11, "GET", "/adapters/rest/v1/cms", com/kohls/mcommerce/opal/framework/vo/LoyaltyHelpVO);
        CMS_FEATURE_BRANDS = new AdapterProcedure("CMS_FEATURE_BRANDS", 12, "GET", "/adapters/rest/v1/cms");
        STORE_BY_OPENSEARCH = new AdapterProcedure("STORE_BY_OPENSEARCH", 13, "GET", "/adapters/rest/v1/stores", com/kohls/mcommerce/opal/framework/vo/StoreLocatorVO);
        FORGOT_PASSWORD = new AdapterProcedure("FORGOT_PASSWORD", 14, "GET", "/adapters/rest/v1/profile/forgotPassword", com/kohls/mcommerce/opal/framework/vo/ForgotPasswordVO);
        WRITE_REVIEWS_GET_AUTHER = new AdapterProcedure("WRITE_REVIEWS_GET_AUTHER", 15, "GET", "/adapters/rest/v1/bzv/reviews", com/kohls/mcommerce/opal/framework/vo/AuthorsByIdsVO);
        RATING_REVIEWS = new AdapterProcedure("RATING_REVIEWS", 16, "GET", "/adapters/rest/v1/bzv/reviews");
        WRITE_REVIEWS = new AdapterProcedure("WRITE_REVIEWS", 17, "POST", "/adapters/rest/v1/bzv/reviews", com/kohls/mcommerce/opal/framework/vo/WriteReviewVO);
        PRODUCT_OFFERS = new AdapterProcedure("PRODUCT_OFFERS", 18, "GET", "/adapters/rest/v1/offers/product", com/kohls/mcommerce/opal/framework/vo/OffersVO);
        GET_CUSTOMER_PROFILE = new AdapterProcedure("GET_CUSTOMER_PROFILE", 19, "GET", "/adapters/rest/v1/profile", com/kohls/mcommerce/opal/framework/vo/GetCustomerProfileVO);
        CONFIGURATION_DATA = new AdapterProcedure("CONFIGURATION_DATA", 20, "GET", "/adapters/rest/v1/configures/client", com/kohls/mcommerce/opal/framework/vo/ConfigurationVO);
        GET_CART = new AdapterProcedure("GET_CART", 21, "GET", "/adapters/rest/v1/cart", com/kohls/mcommerce/opal/framework/vo/PersistentGetCartVO);
        UPDATE_CART = new AdapterProcedure("UPDATE_CART", 22, "POST", "/adapters/rest/v1/cart", com/kohls/mcommerce/opal/framework/vo/UpdateCartVO);
        INVENTORY_BY_STORESEARCH = new AdapterProcedure("INVENTORY_BY_STORESEARCH", 23, "GET", "/adapters/rest/v1/inventory/", com/kohls/mcommerce/opal/framework/vo/StoreInventoryVO);
        TOKEN_REGISRATION = new AdapterProcedure("TOKEN_REGISRATION", 24, "POST", "/adapters/rest/v1/auth/token", com/kohls/mcommerce/opal/framework/vo/TokenRegisrationVO);
        UPDATE_ACCOUNT = new AdapterProcedure("UPDATE_ACCOUNT", 25, "PUT", "/adapters/rest/v1/profile", com/kohls/mcommerce/opal/framework/vo/UpdateAccountVO);
        CACHE_FLUSH_API = new AdapterProcedure("CACHE_FLUSH_API", 26, "GET", "/adapters/rest/v1/caching/stats", com/kohls/mcommerce/opal/framework/vo/FlushdataVO);
        CLIENT_LOGGER = new AdapterProcedure("CLIENT_LOGGER", 27, "POST", "/adapters/rest/v1/clientLogger");
        DELETE_SHIPPING_ADDRESS = new AdapterProcedure("DELETE_SHIPPING_ADDRESS", 28, "POST", "/adapters/rest/v1/profile/shipAddress/", com/kohls/mcommerce/opal/modules/lnr/framework/vo/DeleteShippingAddressVO);
        VALIDATE_ORDER = new AdapterProcedure("VALIDATE_ORDER", 29, "POST", "/adapters/rest/v1/validation", com/kohls/mcommerce/opal/modules/lnr/framework/vo/ValidateOrderVO);
        UPDATE_SHIPPING_ADDRESS = new AdapterProcedure("UPDATE_SHIPPING_ADDRESS", 30, "POST", "/adapters/rest/v1/profile/shipAddress", com/kohls/mcommerce/opal/modules/lnr/framework/vo/UpdateShippingAddressVO);
        REGISTRY_LANDING_CMS = new AdapterProcedure("REGISTRY_LANDING_CMS", 31, "GET", "/adapters/rest/v1/cms", com/kohls/mcommerce/opal/framework/vo/RegistryResponseVO);
        $VALUES = (new AdapterProcedure[] {
            PRODUCT_DETAIL, PRICE_DETAILS, CMS_HOME, PRODUCT_FOR_DIMENSIONS, SIGNIN_AND_PROFILE, CREATE_PROFILE, PRODUCT_FOR_CATEGORYID, PRODUCT_FOR_DEPARTMENTID, RECOMMENDATION, CALCULATE_ORDER, 
            CMS_HELP_AND_CONTACT_US, CMS_LOYALTY_HELP, CMS_FEATURE_BRANDS, STORE_BY_OPENSEARCH, FORGOT_PASSWORD, WRITE_REVIEWS_GET_AUTHER, RATING_REVIEWS, WRITE_REVIEWS, PRODUCT_OFFERS, GET_CUSTOMER_PROFILE, 
            CONFIGURATION_DATA, GET_CART, UPDATE_CART, INVENTORY_BY_STORESEARCH, TOKEN_REGISRATION, UPDATE_ACCOUNT, CACHE_FLUSH_API, CLIENT_LOGGER, DELETE_SHIPPING_ADDRESS, VALIDATE_ORDER, 
            UPDATE_SHIPPING_ADDRESS, REGISTRY_LANDING_CMS
        });
    }
}

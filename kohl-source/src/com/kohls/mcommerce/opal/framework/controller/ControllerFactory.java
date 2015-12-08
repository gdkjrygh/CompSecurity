// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.controller;

import android.content.Context;
import com.kohls.mcommerce.opal.framework.controller.iface.IBigDataController;
import com.kohls.mcommerce.opal.framework.controller.iface.ICategoryController;
import com.kohls.mcommerce.opal.framework.controller.iface.IHomeController;
import com.kohls.mcommerce.opal.framework.controller.iface.IListRegistryController;
import com.kohls.mcommerce.opal.framework.controller.iface.IPDPController;
import com.kohls.mcommerce.opal.framework.controller.iface.IPMPAndSearchController;
import com.kohls.mcommerce.opal.framework.controller.iface.IPersistentCartController;
import com.kohls.mcommerce.opal.framework.controller.iface.IProductDetailController;
import com.kohls.mcommerce.opal.framework.controller.iface.IProductDetailForRatingAndReviewController;
import com.kohls.mcommerce.opal.framework.controller.iface.IRatingReviewController;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenController;
import com.kohls.mcommerce.opal.framework.controller.iface.IRegistryLandingController;
import com.kohls.mcommerce.opal.framework.controller.iface.IStoreLocatorController;
import com.kohls.mcommerce.opal.framework.controller.iface.IViewControllerListener;
import com.kohls.mcommerce.opal.framework.controller.iface.IWriteReviewController;
import com.kohls.mcommerce.opal.framework.controller.impl.BigDataController;
import com.kohls.mcommerce.opal.framework.controller.impl.CategoryControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.GWPConfigurationControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.HomeController;
import com.kohls.mcommerce.opal.framework.controller.impl.ListRegistryControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.PDPActivityControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.PDPControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.PMPAndSearchControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.PersistentCartControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.ProductDetailForRatingAndReviewControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.RatingReviewControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.RefreshTokenControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.RegistryLandingController;
import com.kohls.mcommerce.opal.framework.controller.impl.StoreLocatorControllerImpl;
import com.kohls.mcommerce.opal.framework.controller.impl.WriteReviewControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IAddItemToListRegistryController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.ICreateListController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.ICreateOrUpdateRegistryController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IDeleteListItemController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IGetRegistryCategoriesController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IGetRegistryFulfillmentActivityController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IGetShortenedURLController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IListDetailController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IListEditController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IListReminderController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IListReminderNotificationController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IListSearchResultController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IListSettingsUpdateController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.ILnRMyListsController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.ILnRMyRegistryController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IRegistrySearchResultController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.iface.IUpdateListItemQtyController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.AddItemToListRegistryControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.CreateListControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.CreateOrUpdateRegistryControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.DeleteListItemControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.GetRegistryCategoriesControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.GetRegistryFulfillmentActivityControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.GetShortenedURLControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.ListDetailControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.ListEditControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.ListReminderController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.ListReminderNotificationController;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.ListSearchResultControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.ListSettingsUpdateControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.LnRMyListsControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.LnRMyRegistryControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.RegistrySearchResultControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.UpdateListItemQtyControllerImpl;
import java.lang.ref.WeakReference;

public class ControllerFactory
{

    public ControllerFactory()
    {
    }

    public static IAddItemToListRegistryController getAddItemToListRegistryController(WeakReference weakreference)
    {
        return new AddItemToListRegistryControllerImpl(weakreference);
    }

    public static IBigDataController getBigDataController(WeakReference weakreference)
    {
        return new BigDataController(weakreference);
    }

    public static ICategoryController getCategoryController(Context context, WeakReference weakreference)
    {
        return new CategoryControllerImpl(context, weakreference);
    }

    public static ICreateListController getCreateListController(WeakReference weakreference)
    {
        return new CreateListControllerImpl(weakreference);
    }

    public static ICreateOrUpdateRegistryController getCreateRegistryController(WeakReference weakreference)
    {
        return new CreateOrUpdateRegistryControllerImpl(weakreference);
    }

    public static ICreateOrUpdateRegistryController getCreateRegistryController(WeakReference weakreference, WeakReference weakreference1)
    {
        return new CreateOrUpdateRegistryControllerImpl(weakreference, weakreference1);
    }

    public static IDeleteListItemController getDeleteListItemController(WeakReference weakreference)
    {
        return new DeleteListItemControllerImpl(weakreference);
    }

    public static IGetRegistryFulfillmentActivityController getFulfillmentActivityController(WeakReference weakreference)
    {
        return new GetRegistryFulfillmentActivityControllerImpl(weakreference);
    }

    public static GWPConfigurationControllerImpl getGWPConfigurationController(WeakReference weakreference)
    {
        return new GWPConfigurationControllerImpl(weakreference);
    }

    public static IHomeController getHomeController(WeakReference weakreference)
    {
        return new HomeController(weakreference);
    }

    public static IListSettingsUpdateController getListBudgetController(WeakReference weakreference)
    {
        return new ListSettingsUpdateControllerImpl(weakreference);
    }

    public static IListDetailController getListDetailController(WeakReference weakreference)
    {
        return new ListDetailControllerImpl(weakreference);
    }

    public static IListEditController getListEditController(WeakReference weakreference)
    {
        return new ListEditControllerImpl(weakreference);
    }

    public static IListReminderController getListReminderController(WeakReference weakreference)
    {
        return new ListReminderController(weakreference);
    }

    public static IListReminderNotificationController getListReminderNotificationController(WeakReference weakreference)
    {
        return new ListReminderNotificationController(weakreference);
    }

    public static IListSearchResultController getListSearchResultController(WeakReference weakreference)
    {
        return new ListSearchResultControllerImpl(weakreference);
    }

    public static IListRegistryController getListandRegistryController(WeakReference weakreference)
    {
        return new ListRegistryControllerImpl(weakreference);
    }

    public static ILnRMyListsController getMyListsController(WeakReference weakreference)
    {
        return new LnRMyListsControllerImpl(weakreference);
    }

    public static ILnRMyRegistryController getMyRegistryController(WeakReference weakreference)
    {
        return new LnRMyRegistryControllerImpl(weakreference);
    }

    public static IPMPAndSearchController getPMPAndSearchController(WeakReference weakreference)
    {
        return new PMPAndSearchControllerImpl(weakreference);
    }

    public static IPersistentCartController getPersistentCartController()
    {
        return new PersistentCartControllerImpl();
    }

    public static IPDPController getProductDecoratorController(WeakReference weakreference, IViewControllerListener iviewcontrollerlistener)
    {
        return new PDPControllerImpl(weakreference, iviewcontrollerlistener);
    }

    public static IProductDetailController getProductDetailController(WeakReference weakreference)
    {
        return new PDPActivityControllerImpl(weakreference);
    }

    public static IProductDetailForRatingAndReviewController getProductDetailForRatingAndReviewController(WeakReference weakreference)
    {
        return new ProductDetailForRatingAndReviewControllerImpl(weakreference);
    }

    public static IRatingReviewController getRatingReviewController(WeakReference weakreference)
    {
        return new RatingReviewControllerImpl(weakreference);
    }

    public static IRefreshTokenController getRefreshTokenController()
    {
        return new RefreshTokenControllerImpl();
    }

    public static IGetRegistryCategoriesController getRegistryCategoriesController(WeakReference weakreference)
    {
        return new GetRegistryCategoriesControllerImpl(weakreference);
    }

    public static IRegistryLandingController getRegistryLandingController(WeakReference weakreference)
    {
        return new RegistryLandingController(weakreference);
    }

    public static IRegistrySearchResultController getRegistrySearchResultController(WeakReference weakreference)
    {
        return new RegistrySearchResultControllerImpl(weakreference);
    }

    public static IGetShortenedURLController getShortenedUrlController(WeakReference weakreference, Context context)
    {
        return new GetShortenedURLControllerImpl(weakreference, context);
    }

    public static IStoreLocatorController getStoreLocatorController(WeakReference weakreference, WeakReference weakreference1)
    {
        return new StoreLocatorControllerImpl(weakreference, weakreference1);
    }

    public static IUpdateListItemQtyController getUpdateListItemQtyController(WeakReference weakreference)
    {
        return new UpdateListItemQtyControllerImpl(weakreference);
    }

    public static IWriteReviewController getWriteReviewController(WeakReference weakreference)
    {
        return new WriteReviewControllerImpl(weakreference);
    }
}

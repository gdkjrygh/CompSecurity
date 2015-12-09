// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.jcp.views.CarouselPageIndicator;
import com.jcp.views.HorizontalListOfRecommendedProducts;
import com.jcp.views.HtmlTypefaceTextView;
import com.jcp.views.ScrollViewWithStopMonitor;
import com.jcp.widget.BackToTopButton;
import com.jcp.widget.ProductRating;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, ProductDetailFragment productdetailfragment, Object obj)
    {
        productdetailfragment.mPager = (ViewPager)ector.ector((View)ector.ector(obj, 0x7f0e0288, "field 'mPager'"), 0x7f0e0288, "field 'mPager'");
        productdetailfragment.mCarouselIndicator = (CarouselPageIndicator)ector.lIndicator((View)ector.lIndicator(obj, 0x7f0e028c, "field 'mCarouselIndicator'"), 0x7f0e028c, "field 'mCarouselIndicator'");
        productdetailfragment.mNewImage = (TextView)ector.e((View)ector.e(obj, 0x7f0e028b, "field 'mNewImage'"), 0x7f0e028b, "field 'mNewImage'");
        productdetailfragment.mShare = (ImageView)ector.e((View)ector.e(obj, 0x7f0e0208, "field 'mShare'"), 0x7f0e0208, "field 'mShare'");
        productdetailfragment.mColorLayout = (ViewGroup)ector.yout((View)ector.yout(obj, 0x7f0e028e, "field 'mColorLayout'"), 0x7f0e028e, "field 'mColorLayout'");
        productdetailfragment.mProductNameText = (TextView)ector.NameText((View)ector.NameText(obj, 0x7f0e0290, "field 'mProductNameText'"), 0x7f0e0290, "field 'mProductNameText'");
        productdetailfragment.mSalePriceLayout = (ViewGroup)ector.ceLayout((View)ector.ceLayout(obj, 0x7f0e0291, "field 'mSalePriceLayout'"), 0x7f0e0291, "field 'mSalePriceLayout'");
        productdetailfragment.mOriginalPriceLayout = (ViewGroup)ector.lPriceLayout((View)ector.lPriceLayout(obj, 0x7f0e0294, "field 'mOriginalPriceLayout'"), 0x7f0e0294, "field 'mOriginalPriceLayout'");
        productdetailfragment.mSale = (TextView)ector.lPriceLayout((View)ector.lPriceLayout(obj, 0x7f0e0292, "field 'mSale'"), 0x7f0e0292, "field 'mSale'");
        productdetailfragment.mBOGOMarketingLabel = (TextView)ector.ketingLabel((View)ector.ketingLabel(obj, 0x7f0e00e8, "field 'mBOGOMarketingLabel'"), 0x7f0e00e8, "field 'mBOGOMarketingLabel'");
        productdetailfragment.mSalePercentage = (TextView)ector.centage((View)ector.centage(obj, 0x7f0e0293, "field 'mSalePercentage'"), 0x7f0e0293, "field 'mSalePercentage'");
        productdetailfragment.mOriginalPrice = (TextView)ector.lPrice((View)ector.lPrice(obj, 0x7f0e0295, "field 'mOriginalPrice'"), 0x7f0e0295, "field 'mOriginalPrice'");
        productdetailfragment.mOriginalPricePercentage = (TextView)ector.lPricePercentage((View)ector.lPricePercentage(obj, 0x7f0e0296, "field 'mOriginalPricePercentage'"), 0x7f0e0296, "field 'mOriginalPricePercentage'");
        productdetailfragment.mProductRating = (ProductRating)ector.Rating((View)ector.Rating(obj, 0x7f0e0298, "field 'mProductRating'"), 0x7f0e0298, "field 'mProductRating'");
        productdetailfragment.mBestMatchesButton = (Button)ector.chesButton((View)ector.chesButton(obj, 0x7f0e02a8, "field 'mBestMatchesButton'"), 0x7f0e02a8, "field 'mBestMatchesButton'");
        productdetailfragment.mSelectOptionsButton = (Button)ector.ptionsButton((View)ector.ptionsButton(obj, 0x7f0e02a9, "field 'mSelectOptionsButton'"), 0x7f0e02a9, "field 'mSelectOptionsButton'");
        productdetailfragment.mSelectOptionsContainer = (ViewGroup)ector.ptionsContainer((View)ector.ptionsContainer(obj, 0x7f0e0287, "field 'mSelectOptionsContainer'"), 0x7f0e0287, "field 'mSelectOptionsContainer'");
        productdetailfragment.mSelectOptionsButtons = (ViewGroup)ector.ptionsButtons((View)ector.ptionsButtons(obj, 0x7f0e02a7, "field 'mSelectOptionsButtons'"), 0x7f0e02a7, "field 'mSelectOptionsButtons'");
        productdetailfragment.mProductDetailsScrollView = (ScrollViewWithStopMonitor)ector.DetailsScrollView((View)ector.DetailsScrollView(obj, 0x7f0e0286, "field 'mProductDetailsScrollView'"), 0x7f0e0286, "field 'mProductDetailsScrollView'");
        productdetailfragment.mColorHorizontalSection = (HorizontalScrollView)ector.rizontalSection((View)ector.rizontalSection(obj, 0x7f0e028f, "field 'mColorHorizontalSection'"), 0x7f0e028f, "field 'mColorHorizontalSection'");
        productdetailfragment.mSaveIcon = (CheckBox)ector.n((View)ector.n(obj, 0x7f0e0289, "field 'mSaveIcon'"), 0x7f0e0289, "field 'mSaveIcon'");
        productdetailfragment.mCloseVideo = (ImageView)ector.deo((View)ector.deo(obj, 0x7f0e028a, "field 'mCloseVideo'"), 0x7f0e028a, "field 'mCloseVideo'");
        productdetailfragment.mBackToTopButton = (BackToTopButton)ector.opButton((View)ector.opButton(obj, 0x7f0e02a6, "field 'mBackToTopButton'"), 0x7f0e02a6, "field 'mBackToTopButton'");
        productdetailfragment.mSelectionOptionsLayout = (ViewGroup)ector.onOptionsLayout((View)ector.onOptionsLayout(obj, 0x7f0e0479, "field 'mSelectionOptionsLayout'"), 0x7f0e0479, "field 'mSelectionOptionsLayout'");
        productdetailfragment.mSelectOptionsScroll = (ScrollView)ector.ptionsScroll((View)ector.ptionsScroll(obj, 0x7f0e047f, "field 'mSelectOptionsScroll'"), 0x7f0e047f, "field 'mSelectOptionsScroll'");
        productdetailfragment.mSelectionLoader = (ProgressBar)ector.onLoader((View)ector.onLoader(obj, 0x7f0e047c, "field 'mSelectionLoader'"), 0x7f0e047c, "field 'mSelectionLoader'");
        productdetailfragment.mLayoutSections = (ViewGroup)ector.ections((View)ector.ections(obj, 0x7f0e0485, "field 'mLayoutSections'"), 0x7f0e0485, "field 'mLayoutSections'");
        productdetailfragment.mSaveForLaterIcon = (CheckBox)ector.LaterIcon((View)ector.LaterIcon(obj, 0x7f0e04b1, "field 'mSaveForLaterIcon'"), 0x7f0e04b1, "field 'mSaveForLaterIcon'");
        productdetailfragment.mColorSectionLayout = (ViewGroup)ector.ctionLayout((View)ector.ctionLayout(obj, 0x7f0e0481, "field 'mColorSectionLayout'"), 0x7f0e0481, "field 'mColorSectionLayout'");
        productdetailfragment.mSelectColorSection = (HorizontalScrollView)ector.olorSection((View)ector.olorSection(obj, 0x7f0e0483, "field 'mSelectColorSection'"), 0x7f0e0483, "field 'mSelectColorSection'");
        productdetailfragment.mTruckDeliverySection = (ViewGroup)ector.liverySection((View)ector.liverySection(obj, 0x7f0e0498, "field 'mTruckDeliverySection'"), 0x7f0e0498, "field 'mTruckDeliverySection'");
        productdetailfragment.mEstimatedTimeSection = (ViewGroup)ector.edTimeSection((View)ector.edTimeSection(obj, 0x7f0e0492, "field 'mEstimatedTimeSection'"), 0x7f0e0492, "field 'mEstimatedTimeSection'");
        productdetailfragment.mManufacturerShippedSection = (ViewGroup)ector.turerShippedSection((View)ector.turerShippedSection(obj, 0x7f0e04a2, "field 'mManufacturerShippedSection'"), 0x7f0e04a2, "field 'mManufacturerShippedSection'");
        productdetailfragment.mShippingStatus = (ViewGroup)ector.gStatus((View)ector.gStatus(obj, 0x7f0e049b, "field 'mShippingStatus'"), 0x7f0e049b, "field 'mShippingStatus'");
        productdetailfragment.mFindInStoreLayout = (ViewGroup)ector.toreLayout((View)ector.toreLayout(obj, 0x7f0e0489, "field 'mFindInStoreLayout'"), 0x7f0e0489, "field 'mFindInStoreLayout'");
        productdetailfragment.mServiceLayout = (ViewGroup)ector.Layout((View)ector.Layout(obj, 0x7f0e04ab, "field 'mServiceLayout'"), 0x7f0e04ab, "field 'mServiceLayout'");
        productdetailfragment.mWarrantyLayout = (ViewGroup)ector.yLayout((View)ector.yLayout(obj, 0x7f0e04a8, "field 'mWarrantyLayout'"), 0x7f0e04a8, "field 'mWarrantyLayout'");
        productdetailfragment.mAvailableOnlineLayout = (ViewGroup)ector.leOnlineLayout((View)ector.leOnlineLayout(obj, 0x7f0e0495, "field 'mAvailableOnlineLayout'"), 0x7f0e0495, "field 'mAvailableOnlineLayout'");
        productdetailfragment.mMonogromingSection = (ViewGroup)ector.mingSection((View)ector.mingSection(obj, 0x7f0e049f, "field 'mMonogromingSection'"), 0x7f0e049f, "field 'mMonogromingSection'");
        productdetailfragment.mProductOffersLayout = (ViewGroup)ector.OffersLayout((View)ector.OffersLayout(obj, 0x7f0e04b2, "field 'mProductOffersLayout'"), 0x7f0e04b2, "field 'mProductOffersLayout'");
        productdetailfragment.mSelectSectionTitle = (TextView)ector.ectionTitle((View)ector.ectionTitle(obj, 0x7f0e047d, "field 'mSelectSectionTitle'"), 0x7f0e047d, "field 'mSelectSectionTitle'");
        productdetailfragment.mSelectSalePriceLayout = (ViewGroup)ector.alePriceLayout((View)ector.alePriceLayout(obj, 0x7f0e04b5, "field 'mSelectSalePriceLayout'"), 0x7f0e04b5, "field 'mSelectSalePriceLayout'");
        productdetailfragment.mSelectSectionSale = (TextView)ector.ectionSale((View)ector.ectionSale(obj, 0x7f0e04b6, "field 'mSelectSectionSale'"), 0x7f0e04b6, "field 'mSelectSectionSale'");
        productdetailfragment.mSelectSectionPromotionType = (TextView)ector.ectionPromotionType((View)ector.ectionPromotionType(obj, 0x7f0e04b8, "field 'mSelectSectionPromotionType'"), 0x7f0e04b8, "field 'mSelectSectionPromotionType'");
        productdetailfragment.mSelectSectionMarketingLabel = (TextView)ector.ectionMarketingLabel((View)ector.ectionMarketingLabel(obj, 0x7f0e04b4, "field 'mSelectSectionMarketingLabel'"), 0x7f0e04b4, "field 'mSelectSectionMarketingLabel'");
        productdetailfragment.mSelectSalePercentage = (TextView)ector.alePercentage((View)ector.alePercentage(obj, 0x7f0e04b7, "field 'mSelectSalePercentage'"), 0x7f0e04b7, "field 'mSelectSalePercentage'");
        productdetailfragment.mSelectOriginalPriceLayout = (ViewGroup)ector.riginalPriceLayout((View)ector.riginalPriceLayout(obj, 0x7f0e04b9, "field 'mSelectOriginalPriceLayout'"), 0x7f0e04b9, "field 'mSelectOriginalPriceLayout'");
        productdetailfragment.mSelectSectionOriginalPrice = (TextView)ector.ectionOriginalPrice((View)ector.ectionOriginalPrice(obj, 0x7f0e04ba, "field 'mSelectSectionOriginalPrice'"), 0x7f0e04ba, "field 'mSelectSectionOriginalPrice'");
        productdetailfragment.mSelectOriginalPricePer = (TextView)ector.riginalPricePer((View)ector.riginalPricePer(obj, 0x7f0e04bb, "field 'mSelectOriginalPricePer'"), 0x7f0e04bb, "field 'mSelectOriginalPricePer'");
        productdetailfragment.mSelectionAddToBag = (Button)ector.onAddToBag((View)ector.onAddToBag(obj, 0x7f0e04bd, "field 'mSelectionAddToBag'"), 0x7f0e04bd, "field 'mSelectionAddToBag'");
        productdetailfragment.mSelectionMatchingItems = (Button)ector.onMatchingItems((View)ector.onMatchingItems(obj, 0x7f0e04bc, "field 'mSelectionMatchingItems'"), 0x7f0e04bc, "field 'mSelectionMatchingItems'");
        productdetailfragment.mSelectedColor = (TextView)ector.dColor((View)ector.dColor(obj, 0x7f0e0482, "field 'mSelectedColor'"), 0x7f0e0482, "field 'mSelectedColor'");
        productdetailfragment.mSelectSectionCloseBtn = (ImageButton)ector.ectionCloseBtn((View)ector.ectionCloseBtn(obj, 0x7f0e047b, "field 'mSelectSectionCloseBtn'"), 0x7f0e047b, "field 'mSelectSectionCloseBtn'");
        productdetailfragment.mMapIcon = (ImageView)ector.((View)ector.(obj, 0x7f0e048a, "field 'mMapIcon'"), 0x7f0e048a, "field 'mMapIcon'");
        productdetailfragment.mFindInStoreText = (TextView)ector.toreText((View)ector.toreText(obj, 0x7f0e048e, "field 'mFindInStoreText'"), 0x7f0e048e, "field 'mFindInStoreText'");
        productdetailfragment.mQuantityItem = (TextView)ector.yItem((View)ector.yItem(obj, 0x7f0e0402, "field 'mQuantityItem'"), 0x7f0e0402, "field 'mQuantityItem'");
        productdetailfragment.mBopusStoreName = (TextView)ector.oreName((View)ector.oreName(obj, 0x7f0e01ac, "field 'mBopusStoreName'"), 0x7f0e01ac, "field 'mBopusStoreName'");
        productdetailfragment.mBopusStorePhone = (TextView)ector.orePhone((View)ector.orePhone(obj, 0x7f0e04e3, "field 'mBopusStorePhone'"), 0x7f0e04e3, "field 'mBopusStorePhone'");
        productdetailfragment.mBopusStoreStatus = (HtmlTypefaceTextView)ector.oreStatus((View)ector.oreStatus(obj, 0x7f0e0491, "field 'mBopusStoreStatus'"), 0x7f0e0491, "field 'mBopusStoreStatus'");
        productdetailfragment.mBopusViewMoreStores = (TextView)ector.ewMoreStores((View)ector.ewMoreStores(obj, 0x7f0e048c, "field 'mBopusViewMoreStores'"), 0x7f0e048c, "field 'mBopusViewMoreStores'");
        productdetailfragment.mBopusStatus = (LinearLayout)ector.atus((View)ector.atus(obj, 0x7f0e0490, "field 'mBopusStatus'"), 0x7f0e0490, "field 'mBopusStatus'");
        productdetailfragment.mBopusStoreStreet = (TextView)ector.oreStreet((View)ector.oreStreet(obj, 0x7f0e01ad, "field 'mBopusStoreStreet'"), 0x7f0e01ad, "field 'mBopusStoreStreet'");
        productdetailfragment.mBopusStoreAddress = (TextView)ector.oreAddress((View)ector.oreAddress(obj, 0x7f0e01af, "field 'mBopusStoreAddress'"), 0x7f0e01af, "field 'mBopusStoreAddress'");
        productdetailfragment.mBopusStoreDistance = (TextView)ector.oreDistance((View)ector.oreDistance(obj, 0x7f0e01ae, "field 'mBopusStoreDistance'"), 0x7f0e01ae, "field 'mBopusStoreDistance'");
        productdetailfragment.findInStoreErrorText = (TextView)ector.oreErrorText((View)ector.oreErrorText(obj, 0x7f0e048f, "field 'findInStoreErrorText'"), 0x7f0e048f, "field 'findInStoreErrorText'");
        productdetailfragment.productWebId = (TextView)ector.ebId((View)ector.ebId(obj, 0x7f0e0299, "field 'productWebId'"), 0x7f0e0299, "field 'productWebId'");
        productdetailfragment.descriptionText = (TextView)ector.ionText((View)ector.ionText(obj, 0x7f0e029a, "field 'descriptionText'"), 0x7f0e029a, "field 'descriptionText'");
        productdetailfragment.productTag = (TextView)ector.ag((View)ector.ag(obj, 0x7f0e029c, "field 'productTag'"), 0x7f0e029c, "field 'productTag'");
        productdetailfragment.descriptionArrow = (ImageView)ector.ionArrow((View)ector.ionArrow(obj, 0x7f0e029b, "field 'descriptionArrow'"), 0x7f0e029b, "field 'descriptionArrow'");
        productdetailfragment.knowledgeAssistantsLayout = (ViewGroup)ector.eAssistantsLayout((View)ector.eAssistantsLayout(obj, 0x7f0e029d, "field 'knowledgeAssistantsLayout'"), 0x7f0e029d, "field 'knowledgeAssistantsLayout'");
        productdetailfragment.knowledgeAssistantTitleTextView = (TextView)ector.eAssistantTitleTextView((View)ector.eAssistantTitleTextView(obj, 0x7f0e029f, "field 'knowledgeAssistantTitleTextView'"), 0x7f0e029f, "field 'knowledgeAssistantTitleTextView'");
        productdetailfragment.whiteGlovedLayout = (ViewGroup)ector.vedLayout((View)ector.vedLayout(obj, 0x7f0e02a1, "field 'whiteGlovedLayout'"), 0x7f0e02a1, "field 'whiteGlovedLayout'");
        productdetailfragment.horizontalListOfRecommendedProducts = (HorizontalListOfRecommendedProducts)ector.s((View)ector.s(obj, 0x7f0e02a4, "field 'horizontalListOfRecommendedProducts'"), 0x7f0e02a4, "field 'horizontalListOfRecommendedProducts'");
        productdetailfragment.mReviewsList = (ListView)ector.List((View)ector.List(obj, 0x7f0e02a5, "field 'mReviewsList'"), 0x7f0e02a5, "field 'mReviewsList'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (ProductDetailFragment)obj, obj1);
    }

    public void reset(ProductDetailFragment productdetailfragment)
    {
        productdetailfragment.mPager = null;
        productdetailfragment.mCarouselIndicator = null;
        productdetailfragment.mNewImage = null;
        productdetailfragment.mShare = null;
        productdetailfragment.mColorLayout = null;
        productdetailfragment.mProductNameText = null;
        productdetailfragment.mSalePriceLayout = null;
        productdetailfragment.mOriginalPriceLayout = null;
        productdetailfragment.mSale = null;
        productdetailfragment.mBOGOMarketingLabel = null;
        productdetailfragment.mSalePercentage = null;
        productdetailfragment.mOriginalPrice = null;
        productdetailfragment.mOriginalPricePercentage = null;
        productdetailfragment.mProductRating = null;
        productdetailfragment.mBestMatchesButton = null;
        productdetailfragment.mSelectOptionsButton = null;
        productdetailfragment.mSelectOptionsContainer = null;
        productdetailfragment.mSelectOptionsButtons = null;
        productdetailfragment.mProductDetailsScrollView = null;
        productdetailfragment.mColorHorizontalSection = null;
        productdetailfragment.mSaveIcon = null;
        productdetailfragment.mCloseVideo = null;
        productdetailfragment.mBackToTopButton = null;
        productdetailfragment.mSelectionOptionsLayout = null;
        productdetailfragment.mSelectOptionsScroll = null;
        productdetailfragment.mSelectionLoader = null;
        productdetailfragment.mLayoutSections = null;
        productdetailfragment.mSaveForLaterIcon = null;
        productdetailfragment.mColorSectionLayout = null;
        productdetailfragment.mSelectColorSection = null;
        productdetailfragment.mTruckDeliverySection = null;
        productdetailfragment.mEstimatedTimeSection = null;
        productdetailfragment.mManufacturerShippedSection = null;
        productdetailfragment.mShippingStatus = null;
        productdetailfragment.mFindInStoreLayout = null;
        productdetailfragment.mServiceLayout = null;
        productdetailfragment.mWarrantyLayout = null;
        productdetailfragment.mAvailableOnlineLayout = null;
        productdetailfragment.mMonogromingSection = null;
        productdetailfragment.mProductOffersLayout = null;
        productdetailfragment.mSelectSectionTitle = null;
        productdetailfragment.mSelectSalePriceLayout = null;
        productdetailfragment.mSelectSectionSale = null;
        productdetailfragment.mSelectSectionPromotionType = null;
        productdetailfragment.mSelectSectionMarketingLabel = null;
        productdetailfragment.mSelectSalePercentage = null;
        productdetailfragment.mSelectOriginalPriceLayout = null;
        productdetailfragment.mSelectSectionOriginalPrice = null;
        productdetailfragment.mSelectOriginalPricePer = null;
        productdetailfragment.mSelectionAddToBag = null;
        productdetailfragment.mSelectionMatchingItems = null;
        productdetailfragment.mSelectedColor = null;
        productdetailfragment.mSelectSectionCloseBtn = null;
        productdetailfragment.mMapIcon = null;
        productdetailfragment.mFindInStoreText = null;
        productdetailfragment.mQuantityItem = null;
        productdetailfragment.mBopusStoreName = null;
        productdetailfragment.mBopusStorePhone = null;
        productdetailfragment.mBopusStoreStatus = null;
        productdetailfragment.mBopusViewMoreStores = null;
        productdetailfragment.mBopusStatus = null;
        productdetailfragment.mBopusStoreStreet = null;
        productdetailfragment.mBopusStoreAddress = null;
        productdetailfragment.mBopusStoreDistance = null;
        productdetailfragment.findInStoreErrorText = null;
        productdetailfragment.productWebId = null;
        productdetailfragment.descriptionText = null;
        productdetailfragment.productTag = null;
        productdetailfragment.descriptionArrow = null;
        productdetailfragment.knowledgeAssistantsLayout = null;
        productdetailfragment.knowledgeAssistantTitleTextView = null;
        productdetailfragment.whiteGlovedLayout = null;
        productdetailfragment.horizontalListOfRecommendedProducts = null;
        productdetailfragment.mReviewsList = null;
    }

    public volatile void reset(Object obj)
    {
        reset((ProductDetailFragment)obj);
    }

    public ()
    {
    }
}

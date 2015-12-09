// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.selection;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ly.kite.address.Country;
import ly.kite.analytics.Analytics;
import ly.kite.catalogue.MultipleCurrencyAmount;
import ly.kite.catalogue.MultipleDestinationShippingCosts;
import ly.kite.catalogue.Product;
import ly.kite.catalogue.SingleCurrencyAmount;
import ly.kite.catalogue.SingleDestinationShippingCost;
import ly.kite.catalogue.SingleUnitSize;
import ly.kite.catalogue.UnitOfLength;
import ly.kite.journey.AKiteActivity;
import ly.kite.journey.AKiteFragment;
import ly.kite.widget.BellInterpolator;
import ly.kite.widget.PagingDots;
import ly.kite.widget.SlidingOverlayFrame;

// Referenced classes of package ly.kite.journey.selection:
//            ProductImagePagerAdaptor

public class ProductOverviewFragment extends AKiteFragment
    implements android.view.View.OnClickListener
{
    public static interface ICallback
    {

        public abstract void poOnCreateProduct(Product product);
    }


    public static final String BUNDLE_KEY_PRODUCT = "product";
    private static final String BUNDLE_KEY_SLIDING_DRAWER_IS_EXPANDED = "slidingDrawerIsExpanded";
    private static final long OPEN_CLOSE_ICON_ANIMATION_DELAY_MILLIS = 250L;
    private static final long OPEN_CLOSE_ICON_ANIMATION_DURATION_MILLIS = 250L;
    private static final float OPEN_CLOSE_ICON_ROTATION_DOWN = 0F;
    private static final float OPEN_CLOSE_ICON_ROTATION_UP = -180F;
    private static final long PAGING_DOT_ANIMATION_DURATION_MILLIS = 300L;
    private static final float PAGING_DOT_ANIMATION_NORMAL_SCALE = 1F;
    private static final float PAGING_DOT_ANIMATION_OPAQUE = 1F;
    private static final float PAGING_DOT_ANIMATION_TRANSLUCENT = 0.5F;
    private static final long SLIDE_ANIMATION_DURATION_MILLIS = 500L;
    public static final String TAG = "ProductOverviewFragment";
    private View mDrawerControlLayout;
    private ImageView mOpenCloseDrawerIconImageView;
    private View mOverlaidComponents;
    private Button mOverlaidStartButton;
    private PagingDots mPagingDots;
    private Button mProceedOverlayButton;
    private Product mProduct;
    private PagerAdapter mProductImageAdaptor;
    private ViewPager mProductImageViewPager;
    private SlidingOverlayFrame mSlidingOverlayFrame;

    public ProductOverviewFragment()
    {
    }

    private boolean isVisible(View view)
    {
        return view != null && view.getVisibility() == 0;
    }

    public static ProductOverviewFragment newInstance(Product product)
    {
        ProductOverviewFragment productoverviewfragment = new ProductOverviewFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("product", product);
        productoverviewfragment.setArguments(bundle);
        return productoverviewfragment;
    }

    private void toggleSliderState()
    {
        float f = -180F;
        float f1;
        float f2;
        float f3;
        AlphaAnimation alphaanimation;
        RotateAnimation rotateanimation;
        boolean flag;
        if (!mSlidingOverlayFrame.sliderIsExpanded())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f1 = -180F;
            f2 = 0.0F;
            f3 = 1.0F;
            f = 0.0F;
        } else
        {
            f1 = 0.0F;
            f2 = 1.0F;
            f3 = 0.0F;
        }
        alphaanimation = new AlphaAnimation(f3, f2);
        alphaanimation.setDuration(500L);
        alphaanimation.setFillAfter(true);
        rotateanimation = new RotateAnimation(f1, f, (float)mOpenCloseDrawerIconImageView.getWidth() * 0.5F, (float)mOpenCloseDrawerIconImageView.getHeight() * 0.5F);
        rotateanimation.setStartOffset(250L);
        rotateanimation.setDuration(250L);
        rotateanimation.setFillAfter(true);
        if (mOverlaidComponents != null)
        {
            mOverlaidComponents.setAlpha(1.0F);
            mOverlaidComponents.startAnimation(alphaanimation);
        }
        if (mOpenCloseDrawerIconImageView != null)
        {
            mOpenCloseDrawerIconImageView.setRotation(0.0F);
            mOpenCloseDrawerIconImageView.startAnimation(rotateanimation);
        }
        mSlidingOverlayFrame.animateToExpandedState(flag);
    }

    public boolean onBackPressIntercepted()
    {
        if (mSlidingOverlayFrame != null && mSlidingOverlayFrame.sliderIsExpanded())
        {
            toggleSliderState();
            return true;
        } else
        {
            return false;
        }
    }

    public void onClick(View view)
    {
        if (view == mDrawerControlLayout)
        {
            toggleSliderState();
            return;
        } else
        {
            onCreateProduct();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle == null)
        {
            Log.e("ProductOverviewFragment", "No arguments found");
            bundle = mKiteActivity;
            int i = ly.kite.R.string.alert_dialog_title_no_arguments;
            int k = ly.kite.R.string.alert_dialog_message_no_arguments;
            int i1 = ly.kite.R.string.Cancel;
            AKiteActivity akiteactivity = mKiteActivity;
            akiteactivity.getClass();
            bundle.displayModalDialog(i, k, 0, null, i1, new ly.kite.journey.AKiteActivity.FinishRunnable(akiteactivity));
        } else
        {
            mProduct = (Product)bundle.getParcelable("product");
            if (mProduct == null)
            {
                Log.e("ProductOverviewFragment", "No product found");
                bundle = mKiteActivity;
                int j = ly.kite.R.string.alert_dialog_title_product_not_found;
                int l = ly.kite.R.string.alert_dialog_message_product_not_found;
                int j1 = ly.kite.R.string.Cancel;
                AKiteActivity akiteactivity1 = mKiteActivity;
                akiteactivity1.getClass();
                bundle.displayModalDialog(j, l, 0, null, j1, new ly.kite.journey.AKiteActivity.FinishRunnable(akiteactivity1));
                return;
            }
        }
    }

    public void onCreateProduct()
    {
        if (mKiteActivity instanceof ICallback)
        {
            ((ICallback)mKiteActivity).poOnCreateProduct(mProduct);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Object obj;
        Object obj1;
        Object obj3;
        Object obj4;
        int i;
        float f;
        Object obj2;
        TextView textview;
        View view;
        TextView textview1;
        View view1;
        TextView textview2;
        TextView textview3;
        AnimationSet animationset;
        boolean flag;
        if (bundle != null)
        {
            flag = bundle.getBoolean("slidingDrawerIsExpanded", false);
        } else
        {
            Analytics.getInstance(mKiteActivity).trackProductOverviewScreenViewed(mProduct);
            flag = false;
        }
        viewgroup = layoutinflater.inflate(ly.kite.R.layout.screen_product_overview, viewgroup, false);
        mProductImageViewPager = (ViewPager)viewgroup.findViewById(ly.kite.R.id.view_pager);
        mOverlaidComponents = viewgroup.findViewById(ly.kite.R.id.overlaid_components);
        mPagingDots = (PagingDots)viewgroup.findViewById(ly.kite.R.id.paging_dots);
        mOverlaidStartButton = (Button)viewgroup.findViewById(ly.kite.R.id.overlaid_start_button);
        mSlidingOverlayFrame = (SlidingOverlayFrame)viewgroup.findViewById(ly.kite.R.id.sliding_overlay_frame);
        mDrawerControlLayout = viewgroup.findViewById(ly.kite.R.id.drawer_control_layout);
        mOpenCloseDrawerIconImageView = (ImageView)viewgroup.findViewById(ly.kite.R.id.open_close_drawer_icon_image_view);
        mProceedOverlayButton = (Button)viewgroup.findViewById(ly.kite.R.id.proceed_overlay_button);
        layoutinflater = (TextView)viewgroup.findViewById(ly.kite.R.id.price_text_view);
        textview3 = (TextView)viewgroup.findViewById(ly.kite.R.id.summary_description_text_view);
        obj1 = (TextView)viewgroup.findViewById(ly.kite.R.id.summary_shipping_text_view);
        obj2 = viewgroup.findViewById(ly.kite.R.id.description_layout);
        textview = (TextView)viewgroup.findViewById(ly.kite.R.id.description_text_view);
        view = viewgroup.findViewById(ly.kite.R.id.size_layout);
        textview1 = (TextView)viewgroup.findViewById(ly.kite.R.id.size_text_view);
        view1 = viewgroup.findViewById(ly.kite.R.id.quantity_layout);
        textview2 = (TextView)viewgroup.findViewById(ly.kite.R.id.quantity_text_view);
        bundle = (TextView)viewgroup.findViewById(ly.kite.R.id.shipping_text_view);
        obj = new AlphaAnimation(1.0F, 0.5F);
        ((Animation) (obj)).setFillAfter(true);
        ((Animation) (obj)).setDuration(300L);
        obj3 = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
        ((Animation) (obj3)).setFillAfter(true);
        ((Animation) (obj3)).setDuration(300L);
        ((Animation) (obj3)).setInterpolator(new BellInterpolator(1.0F, 0.8F, true));
        obj4 = new AnimationSet(false);
        ((AnimationSet) (obj4)).addAnimation(((Animation) (obj)));
        ((AnimationSet) (obj4)).addAnimation(((Animation) (obj3)));
        ((AnimationSet) (obj4)).setFillAfter(true);
        obj3 = new AlphaAnimation(0.5F, 1.0F);
        ((Animation) (obj3)).setFillAfter(true);
        ((Animation) (obj3)).setDuration(300L);
        obj4 = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
        ((Animation) (obj4)).setFillAfter(true);
        ((Animation) (obj4)).setDuration(300L);
        ((Animation) (obj4)).setInterpolator(new BellInterpolator(1.0F, 1.2F));
        animationset = new AnimationSet(false);
        animationset.addAnimation(((Animation) (obj3)));
        animationset.addAnimation(((Animation) (obj4)));
        animationset.setFillAfter(true);
        mPagingDots.setProperties(mProduct.getImageURLList().size(), ly.kite.R.drawable.paging_dot_unselected, ly.kite.R.drawable.paging_dot_selected);
        mPagingDots.setOutAnimation(((Animation) (obj)));
        mPagingDots.setInAnimation(animationset);
        mProductImageViewPager.setOnPageChangeListener(mPagingDots);
        obj = mOverlaidComponents;
        if (flag)
        {
            f = 0.0F;
        } else
        {
            f = 1.0F;
        }
        ((View) (obj)).setAlpha(f);
        if (mSlidingOverlayFrame != null)
        {
            mSlidingOverlayFrame.snapToExpandedState(flag);
            mSlidingOverlayFrame.setSlideAnimationDuration(500L);
            obj = mOpenCloseDrawerIconImageView;
            SingleUnitSize singleunitsize;
            String s1;
            Object obj5;
            String s2;
            int j;
            if (flag)
            {
                f = 0.0F;
            } else
            {
                f = -180F;
            }
            ((ImageView) (obj)).setRotation(f);
        }
        singleunitsize = mProduct.getSizeWithFallback(UnitOfLength.CENTIMETERS);
        if (singleunitsize.getWidth() == (float)(int)singleunitsize.getWidth() && singleunitsize.getHeight() == (float)(int)singleunitsize.getHeight())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = ly.kite.R.string.product_size_format_string_int;
        } else
        {
            i = ly.kite.R.string.product_size_format_string_float;
        }
        s1 = getString(i);
        s2 = String.format(s1, new Object[] {
            Float.valueOf(singleunitsize.getWidth()), Float.valueOf(singleunitsize.getHeight()), singleunitsize.getUnit().shortString(mKiteActivity)
        });
        j = mProduct.getQuantityPerSheet();
        obj3 = mProduct.getShippingCosts();
        obj = Locale.getDefault();
        obj4 = Country.getInstance(((Locale) (obj)));
        if (isVisible(layoutinflater))
        {
            obj5 = mProduct.getCostWithFallback(((Locale) (obj)));
            if (obj5 != null)
            {
                layoutinflater.setText(((SingleCurrencyAmount) (obj5)).getDisplayAmountForLocale(((Locale) (obj))));
            }
        }
        if (isVisible(textview3))
        {
            obj5 = (new StringBuilder()).append(String.valueOf(j)).append(" ").append(mProduct.getName());
            if (Product.isSensibleSize(singleunitsize))
            {
                layoutinflater = (new StringBuilder()).append(" (").append(s2).append(")").toString();
            } else
            {
                layoutinflater = "";
            }
            textview3.setText(((StringBuilder) (obj5)).append(layoutinflater).toString());
        }
        layoutinflater = mProduct.getDescription();
        if (layoutinflater != null && !layoutinflater.trim().equals(""))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && obj2 != null && textview != null)
        {
            ((View) (obj2)).setVisibility(0);
            textview.setVisibility(0);
            textview.setText(layoutinflater);
        } else
        {
            if (obj2 != null)
            {
                ((View) (obj2)).setVisibility(8);
            }
            if (textview != null)
            {
                textview.setVisibility(8);
            }
        }
        if (isVisible(textview1))
        {
            if (Product.isSensibleSize(singleunitsize))
            {
                textview1.setText(String.format(s1, new Object[] {
                    Float.valueOf(singleunitsize.getWidth()), Float.valueOf(singleunitsize.getHeight()), singleunitsize.getUnit().shortString(mKiteActivity)
                }));
            } else
            {
                view.setVisibility(8);
            }
        }
        if (isVisible(textview2))
        {
            if (j > 1)
            {
                view1.setVisibility(0);
                textview2.setText(getString(ly.kite.R.string.product_quantity_format_string, new Object[] {
                    Integer.valueOf(j)
                }));
            } else
            {
                view1.setVisibility(8);
            }
        }
        if (!isVisible(((View) (obj1))))
        {
            break MISSING_BLOCK_LABEL_1227;
        }
        layoutinflater = ((MultipleDestinationShippingCosts) (obj3)).asList().iterator();
        i = 1;
label0:
        {
            if (!layoutinflater.hasNext())
            {
                break label0;
            }
            obj2 = ((SingleDestinationShippingCost)layoutinflater.next()).getCost().asCollection().iterator();
            j = i;
            do
            {
                i = j;
                if (!((Iterator) (obj2)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_1036;
                }
                if (((SingleCurrencyAmount)((Iterator) (obj2)).next()).isNonZero())
                {
                    j = 0;
                }
            } while (true);
        }
        Iterator iterator;
        SingleDestinationShippingCost singledestinationshippingcost;
        String s;
        if (i != 0)
        {
            ((TextView) (obj1)).setText(ly.kite.R.string.product_free_worldwide_shipping);
        } else
        {
            ((TextView) (obj1)).setText(getString(ly.kite.R.string.product_shipping_summary_format_string, new Object[] {
                ((MultipleDestinationShippingCosts) (obj3)).getDisplayCost(((Locale) (obj)))
            }));
        }
        if (isVisible(bundle))
        {
            layoutinflater = mProduct.getSortedShippingCosts(((Country) (obj4)));
            obj1 = new StringBuilder();
            iterator = layoutinflater.iterator();
            layoutinflater = "";
            while (iterator.hasNext()) 
            {
                singledestinationshippingcost = (SingleDestinationShippingCost)iterator.next();
                ((StringBuilder) (obj1)).append(layoutinflater);
                layoutinflater = singledestinationshippingcost.getCost().getDefaultAmountWithFallback();
                if (layoutinflater != null)
                {
                    s = getString(ly.kite.R.string.product_shipping_format_string);
                    if (layoutinflater.isNonZero())
                    {
                        layoutinflater = layoutinflater.getDisplayAmountForLocale(((Locale) (obj)));
                    } else
                    {
                        layoutinflater = getString(ly.kite.R.string.product_free_shipping);
                    }
                    ((StringBuilder) (obj1)).append(String.format(s, new Object[] {
                        singledestinationshippingcost.getDestinationDescription(mKiteActivity), layoutinflater
                    }));
                }
                bundle.setText(((StringBuilder) (obj1)).toString());
                layoutinflater = "\n";
            }
        }
        if (mProceedOverlayButton != null)
        {
            mProceedOverlayButton.setText(ly.kite.R.string.product_overview_start_button_text);
            mProceedOverlayButton.setOnClickListener(this);
        }
        mProductImageViewPager.setOnClickListener(this);
        if (mDrawerControlLayout != null)
        {
            mDrawerControlLayout.setOnClickListener(this);
        }
        mOverlaidStartButton.setOnClickListener(this);
        return viewgroup;
    }

    public void onNotTop()
    {
        super.onNotTop();
        if (mProductImageViewPager != null)
        {
            mProductImageViewPager.setAdapter(null);
        }
        mProductImageAdaptor = null;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (mSlidingOverlayFrame != null)
        {
            bundle.putBoolean("slidingDrawerIsExpanded", mSlidingOverlayFrame.sliderIsExpanded());
        }
    }

    public void onTop()
    {
        super.onTop();
        if (mProduct != null)
        {
            mKiteActivity.setTitle(mProduct.getName());
        }
        mProductImageAdaptor = new ProductImagePagerAdaptor(mKiteActivity, mProduct.getImageURLList(), this);
        mProductImageViewPager.setAdapter(mProductImageAdaptor);
    }
}

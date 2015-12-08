// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.pin.view.PinCloseupImageView;
import com.pinterest.activity.pin.view.PinFlashlightCropView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.flashlight:
//            FlashlightResultsFragment, BottomSheetLayout

public class FlashlightAnimationUtils
{

    private static final float MAX_IMAGE_TO_SCREEN_HEIGHT_RATIO = 0.65F;

    public FlashlightAnimationUtils()
    {
    }

    public static BottomSheetLayout animateFlashlightEntrance(Context context, PinCloseupImageView pincloseupimageview, Pin pin, FragmentManager fragmentmanager)
    {
        if (pincloseupimageview == null || pin == null)
        {
            return null;
        }
        int ai[] = new int[2];
        pincloseupimageview.getLocationOnScreen(ai);
        int i = ai[1];
        int j = (int)getScrollViewDesiredHeight(pincloseupimageview);
        PinFlashlightCropView pinflashlightcropview = getFlashlightCropView(context, pincloseupimageview);
        Object obj = getFlashlightImageContainer(context, pinflashlightcropview);
        animateFlashlightImageContainer(i, pincloseupimageview, j, ((LinearLayout) (obj)));
        context = initializeBottomSheetLayout(context, ((LinearLayout) (obj)), j);
        obj = fragmentmanager.beginTransaction();
        if (fragmentmanager.findFragmentByTag("flashlight_results_fragment") != null)
        {
            ((FragmentTransaction) (obj)).remove(fragmentmanager.findFragmentByTag("flashlight_results_fragment"));
        }
        fragmentmanager = new FlashlightResultsFragment();
        fragmentmanager.setPinGalleryItem(pincloseupimageview.getGalleryItem());
        fragmentmanager.setPin(pin);
        fragmentmanager.setFlashlightCropView(pinflashlightcropview);
        fragmentmanager.setNavigation(new Navigation(Location.FLASHLIGHT, pin));
        pinflashlightcropview.setParentScrollViewHeight(j);
        ((FragmentTransaction) (obj)).replace(0x7f0f01cd, fragmentmanager, "flashlight_results_fragment");
        ((FragmentTransaction) (obj)).commit();
        return context;
    }

    private static void animateFlashlightImageContainer(int i, final PinCloseupImageView closeupImageView, final int scrollViewDesiredHeight, final LinearLayout flashlightImageContainer)
    {
        int j = (int)Resources.dimension(0x7f0a018a);
        flashlightImageContainer.setY(i - Device.getStatusBarHeight() - j);
        flashlightImageContainer.post(new _cls1());
    }

    public static int getCloseupImagePadding()
    {
        int i = 0;
        if (Device.isLandscape() || Device.isTablet())
        {
            i = (int)((Device.getScreenWidth() - (float)FragmentHelper.getCloseupWidth()) / 2.0F);
        }
        return i + (int)Resources.dimension(0x7f0a018a);
    }

    private static PinFlashlightCropView getFlashlightCropView(Context context, PinCloseupImageView pincloseupimageview)
    {
        context = new PinFlashlightCropView(context);
        context.setShouldAnimateFlashlightButton(false);
        context.setImageMargin((int)Resources.dimension(0x7f0a018a));
        context.setGalleryItem(pincloseupimageview.getGalleryItem());
        return context;
    }

    private static LinearLayout getFlashlightImageContainer(Context context, PinFlashlightCropView pinflashlightcropview)
    {
        context = (LinearLayout)LayoutInflater.from(context).inflate(0x7f0300a3, null, false);
        ScrollView scrollview = (ScrollView)context.findViewById(0x7f0f01d8);
        int i = getCloseupImagePadding();
        scrollview.setPadding(i, scrollview.getPaddingTop(), i, 0);
        scrollview.setVerticalScrollBarEnabled(false);
        scrollview.addView(pinflashlightcropview, new android.widget.FrameLayout.LayoutParams(-1, -2));
        return context;
    }

    public static float getScrollViewDesiredHeight(View view)
    {
        int i = view.getHeight();
        int j = (int)Device.getScreenHeight() - Device.getStatusBarHeight();
        if ((float)i < (float)j * 0.65F)
        {
            return (float)i;
        } else
        {
            return (float)j * 0.65F;
        }
    }

    private static BottomSheetLayout initializeBottomSheetLayout(Context context, LinearLayout linearlayout, int i)
    {
        BottomSheetLayout bottomsheetlayout = new BottomSheetLayout(context);
        bottomsheetlayout.setContentView(linearlayout);
        bottomsheetlayout.setShouldDimContentView(false);
        bottomsheetlayout.setInterceptContentTouch(false);
        bottomsheetlayout.setPeekSheetTranslation(Device.getScreenHeight() - (float)i - (float)Constants.MARGIN * 1.25F);
        bottomsheetlayout.showWithSheetView(LayoutInflater.from(context).inflate(0x7f03009d, bottomsheetlayout, false));
        return bottomsheetlayout;
    }

    private class _cls1
        implements Runnable
    {

        final PinCloseupImageView val$closeupImageView;
        final LinearLayout val$flashlightImageContainer;
        final int val$scrollViewDesiredHeight;

        public final void run()
        {
            int i = (int)Resources.dimension(0x7f0a018a);
            int j = closeupImageView.getMeasuredHeight();
            flashlightImageContainer.getLayoutParams().height = i * 2 + j;
            flashlightImageContainer.requestLayout();
            class _cls1
                implements Runnable
            {

                final _cls1 this$0;

                public void run()
                {
                    closeupImageView.setVisibility(4);
                    final ViewPropertyAnimator viewPropertyAnimator = flashlightImageContainer.animate().setDuration(Constants.ANIM_SPEED_NORMAL).y(0.0F);
                    class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
                    {

                        final _cls1 this$1;
                        final ViewPropertyAnimator val$viewPropertyAnimator;

                        public void onAnimationEnd(Animator animator)
                        {
                            super.onAnimationEnd(animator);
                            flashlightImageContainer.setBackgroundColor(-1);
                            closeupImageView.setVisibility(0);
                            animator = (ScrollView)flashlightImageContainer.findViewById(0x7f0f01d8);
                            animator.getLayoutParams().height = scrollViewDesiredHeight;
                            ((PinFlashlightCropView)animator.getChildAt(0)).setShowCropWindow(true);
                            viewPropertyAnimator.setListener(null);
                        }

                            _cls1()
                            {
                                this$1 = _cls1.this;
                                viewPropertyAnimator = viewpropertyanimator;
                                super();
                            }
                    }

                    viewPropertyAnimator.setListener(new _cls1());
                }

                _cls1()
                {
                    this$0 = _cls1.this;
                    super();
                }
            }

            flashlightImageContainer.post(new _cls1());
        }

        _cls1()
        {
            closeupImageView = pincloseupimageview;
            flashlightImageContainer = linearlayout;
            scrollViewDesiredHeight = i;
            super();
        }
    }

}

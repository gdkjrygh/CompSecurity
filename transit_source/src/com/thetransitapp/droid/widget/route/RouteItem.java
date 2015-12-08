// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.koushikdutta.urlimageviewhelper.UrlImageViewCallback;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.RouteImage;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.ui.ShadowImageView;
import com.thetransitapp.droid.util.BackgroundUtility;
import com.thetransitapp.droid.util.BitmapUtility;
import com.thetransitapp.droid.util.FontUtility;
import java.text.MessageFormat;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteItemListener, RouteUiHandlers

public class RouteItem
{

    private static AlertDialog dialog;
    private final RouteItemListener routeItemListener;
    private View view;
    private final NearbyRouteViewModel viewModel;

    public RouteItem(NearbyRouteViewModel nearbyrouteviewmodel, RouteUiHandlers routeuihandlers, SharedPreferences sharedpreferences)
    {
        routeItemListener = new RouteItemListener(routeuihandlers, this, sharedpreferences);
        viewModel = nearbyrouteviewmodel;
    }

    private void setTextView(View view1, int i, String s, int j, int k)
    {
        view1 = (TextView)view1.findViewById(i);
        setTextView(((TextView) (view1)), s, j, k);
        switch (i)
        {
        default:
            return;

        case 2131034195: 
        case 2131034210: 
        case 2131034216: 
        case 2131034217: 
            view1.setTypeface(FontUtility.getInterstateBold(view1.getContext()));
            break;
        }
    }

    private void setTextView(TextView textview, String s, int i, int j)
    {
        int ai[] = {
            0x10100a7
        };
        textview.setTextColor(new ColorStateList(new int[][] {
            new int[] {
                0xfefeff59
            }, ai
        }, new int[] {
            i, j
        }));
        textview.setText(s);
        textview.setShadowLayer(0.1F, 0.0F, viewModel.getTextShadowOffset(), viewModel.getShadowColor());
    }

    private void setupBranchCode(View view1, int i, int j)
    {
        String s = viewModel.getCurrentItinerary().getBranch();
        View view2 = view1.findViewById(0x7f050062);
        int k;
        if (s != null)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        view2.setVisibility(k);
        if (s != null)
        {
            setTextView(view1, 0x7f050062, s, i, j);
        }
    }

    private void setupDirections(View view1)
    {
        Object obj1 = BitmapUtility.getArrow(viewModel, view1.getContext().getResources().getDimension(0x7f080015) * 0.7F);
        Object obj = BitmapUtility.getArrow(viewModel, view1.getContext().getResources().getDimension(0x7f080015) * 0.7F, true);
        StateListDrawable statelistdrawable = new StateListDrawable();
        obj1 = new BitmapDrawable(view1.getResources(), ((Bitmap) (obj1)));
        statelistdrawable.addState(new int[] {
            0xfefeff59
        }, ((android.graphics.drawable.Drawable) (obj1)));
        obj = new BitmapDrawable(view1.getResources(), ((Bitmap) (obj)));
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, ((android.graphics.drawable.Drawable) (obj)));
        ((ImageView)view1.findViewById(0x7f050055)).setImageDrawable(statelistdrawable);
    }

    private void setupFavorite(View view1)
    {
        if (viewModel.getRoute().isFavorite())
        {
            view1 = (ShadowImageView)view1.findViewById(0x7f050064);
            view1.setVisibility(0);
            view1.setColorFilter(new PorterDuffColorFilter(viewModel.getStarColor(), android.graphics.PorterDuff.Mode.SRC_IN));
            view1.setShadowLayer(2.0F, 0.0F, 2.0F, viewModel.getGlossColor());
            return;
        } else
        {
            view1.findViewById(0x7f050064).setVisibility(4);
            return;
        }
    }

    private void setupOutOfServiceIcon(View view1, int i, int j)
    {
        TextView textview = (TextView)view1.findViewById(0x7f050069);
        ShadowImageView shadowimageview = (ShadowImageView)view1.findViewById(0x7f05006a);
        view1 = (TextView)view1.findViewById(0x7f05006c);
        if (j == -1 || j > 90)
        {
            if (shadowimageview.getVisibility() == 8)
            {
                shadowimageview.setVisibility(0);
                textview.setVisibility(8);
                view1.setVisibility(8);
            }
            shadowimageview.setColorFilter(new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
            shadowimageview.setShadowLayer(0.0F, 0.0F, viewModel.getTextShadowOffset(), viewModel.getShadowColor());
        } else
        if (shadowimageview.getVisibility() == 0)
        {
            shadowimageview.setVisibility(8);
            textview.setVisibility(0);
            view1.setVisibility(0);
            return;
        }
    }

    private void setupRealTimeIndicator(View view1, int i)
    {
        LinearLayout linearlayout = (LinearLayout)view1.findViewById(0x7f05006b);
        ShadowImageView shadowimageview = (ShadowImageView)linearlayout.getChildAt(0);
        ShadowImageView shadowimageview1 = (ShadowImageView)linearlayout.getChildAt(1);
        shadowimageview.setShadowLayer(2.0F, 0.0F, -2F, viewModel.getShadowColor());
        shadowimageview1.setShadowLayer(2.0F, 0.0F, -2F, viewModel.getShadowColor());
        PorterDuffColorFilter porterduffcolorfilter = new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        shadowimageview.setColorFilter(porterduffcolorfilter);
        shadowimageview1.setColorFilter(porterduffcolorfilter);
        if ((linearlayout.getVisibility() != 0 || shadowimageview.getAnimation() == null || !shadowimageview.getAnimation().hasStarted()) && android.os.Build.VERSION.SDK_INT >= 11)
        {
            Animation animation = AnimationUtils.loadAnimation(shadowimageview.getContext(), 0x7f040000);
            animation.setStartOffset(animation.getStartOffset() + 200L);
            Animation animation1 = AnimationUtils.loadAnimation(shadowimageview.getContext(), 0x7f040000);
            animation1.setDuration(animation1.getDuration() + 200L);
            shadowimageview.startAnimation(animation);
            shadowimageview1.startAnimation(animation1);
        }
        linearlayout.setVisibility(0);
        view1.findViewById(0x7f050067).setVisibility(0);
    }

    private void setupRouteImage(final View spacer)
    {
        final RouteImage routeImage = viewModel.getRouteImage();
        ShadowImageView shadowimageview = (ShadowImageView)spacer.findViewById(0x7f050054);
        if (routeImage != null)
        {
            android.util.DisplayMetrics displaymetrics = shadowimageview.getContext().getResources().getDisplayMetrics();
            final View routeNumber = spacer.findViewById(0x7f050053);
            spacer = spacer.findViewById(0x7f050061);
            shadowimageview.setImageDrawable(null);
            shadowimageview.setVisibility(0);
            UrlImageViewHelper.setUrlDrawable(shadowimageview, routeImage.getUrlWithScreenMetrics(displaymetrics, false), new UrlImageViewCallback() {

                final RouteItem this$0;
                private final RouteImage val$routeImage;
                private final View val$routeNumber;
                private final View val$spacer;

                public void onLoaded(ImageView imageview, Bitmap bitmap, String s, boolean flag)
                {
label0:
                    {
                        if (imageview.getVisibility() == 0)
                        {
                            if (bitmap == null || !routeImage.isReplaceName())
                            {
                                break label0;
                            }
                            ((TextView)routeNumber).setText("");
                            spacer.setVisibility(8);
                        }
                        return;
                    }
                    spacer.setVisibility(0);
                }

            
            {
                this$0 = RouteItem.this;
                routeImage = routeimage;
                routeNumber = view1;
                spacer = view2;
                super();
            }
            });
            shadowimageview.setColorFilter(new PorterDuffColorFilter(viewModel.getTextColor(), android.graphics.PorterDuff.Mode.SRC_IN));
            shadowimageview.setPressedColorFilter(new PorterDuffColorFilter(viewModel.getTextSelectedColor(), android.graphics.PorterDuff.Mode.SRC_IN));
            shadowimageview.setShadowLayer(0.1F, 0.0F, viewModel.getTextShadowOffset(), viewModel.getShadowColor());
            return;
        } else
        {
            spacer.findViewById(0x7f050061).setVisibility(0);
            shadowimageview.setVisibility(8);
            return;
        }
    }

    private void setupRouteName(View view1, String s, int i, int j, boolean flag)
    {
        view1 = (ViewFlipper)view1.findViewById(0x7f050056);
        int k;
        if (view1.getDisplayedChild() == 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        setTextView((TextView)view1.getChildAt(k), s, i, j);
        showNext(view1, flag, true);
    }

    private void setupTimeAndFrequency(View view1, int i, int j, MergedItinerary mergeditinerary, boolean flag)
    {
        ViewFlipper viewflipper = (ViewFlipper)view1.findViewById(0x7f050063);
        View view2;
        int k;
        boolean flag1;
        if (viewflipper.getDisplayedChild() == 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!flag)
        {
            k = viewflipper.getDisplayedChild();
        }
        view2 = viewflipper.getChildAt(k);
        setTextView(view2, 0x7f050068, "", i, j);
        k = -1;
        if (mergeditinerary.getCurrentScheduleItem() != null)
        {
            ScheduleItem scheduleitem = mergeditinerary.getCurrentScheduleItem();
            int l = scheduleitem.getMinutesRemaining();
            if (l >= 0)
            {
                if (mergeditinerary.getCurrentScheduleItem().isFrequency())
                {
                    setTextView(view2, 0x7f050068, "< ", i, j);
                }
                k = l;
            }
            if (scheduleitem.getRealStopTime() != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (k > -1 && k <= 90)
            {
                setTextView(view2, 0x7f050069, (new StringBuilder(String.valueOf(k))).toString(), i, j);
            } else
            {
                setTextView(view2, 0x7f050069, "", i, j);
            }
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            setupRealTimeIndicator(view2, i);
        } else
        {
            view2.findViewById(0x7f05006b).setVisibility(8);
            view2.findViewById(0x7f050067).setVisibility(8);
        }
        setTextView(view2, 0x7f05006c, MessageFormat.format(view1.getContext().getString(0x7f0a0095), new Object[] {
            Integer.valueOf(k)
        }), i, j);
        setupOutOfServiceIcon(view2, i, k);
        if (flag)
        {
            showNext(viewflipper, flag, false);
        }
    }

    private void showNext(ViewFlipper viewflipper, boolean flag, boolean flag1)
    {
        if (flag)
        {
            Context context = view.getContext();
            int i;
            if (flag1)
            {
                i = 0x7f040003;
            } else
            {
                i = 0x7f040002;
            }
            viewflipper.setInAnimation(context, i);
            context = view.getContext();
            if (flag1)
            {
                i = 0x7f040005;
            } else
            {
                i = 0x7f040004;
            }
            viewflipper.setOutAnimation(context, i);
        } else
        {
            viewflipper.setInAnimation(null);
            viewflipper.setOutAnimation(null);
        }
        viewflipper.showNext();
    }

    public void animateMenu()
    {
        if (routeItemListener != null && view != null)
        {
            final View backgroundView = view.findViewById(0x7f05005f);
            backgroundView.setBackgroundResource(0x7f0200a7);
            backgroundView.setPressed(true);
            (new Handler()).postDelayed(new Runnable() {

                final RouteItem this$0;
                private final View val$backgroundView;

                public void run()
                {
                    if (routeItemListener != null)
                    {
                        routeItemListener.showMenu(true);
                    }
                    backgroundView.setPressed(false);
                    backgroundView.setBackgroundResource(0);
                }

            
            {
                this$0 = RouteItem.this;
                backgroundView = view1;
                super();
            }
            }, 500L);
        }
    }

    public View getView()
    {
        return view;
    }

    public NearbyRouteViewModel getViewModel()
    {
        return viewModel;
    }

    public void hideMenu()
    {
        if (view != null)
        {
            routeItemListener.showMenu(false);
        }
    }

    public boolean onChangeDirection()
    {
        NearbyRouteViewModel nearbyrouteviewmodel = viewModel;
        boolean flag;
        if (viewModel.isActive())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!nearbyrouteviewmodel.getNextItinerary(flag, true))
        {
            if (dialog == null)
            {
                dialog = (new android.app.AlertDialog.Builder(view.getContext())).create();
                dialog.setTitle(0x7f0a005a);
                dialog.setMessage(view.getContext().getText(0x7f0a0082));
                dialog.setButton(-1, view.getContext().getText(0x7f0a002f), null);
                dialog.show();
            }
            return false;
        } else
        {
            refreshView(true);
            viewModel.getCurrentItinerary().updateRealTimeDataOnList((ListView)view.getParent(), this);
            return true;
        }
    }

    public void refreshView()
    {
        refreshView(false);
    }

    public void refreshView(boolean flag)
    {
        if (view != null && view.getTag().equals(viewModel.getRoute().getId()))
        {
            setView(view, flag);
        }
    }

    public void setView(View view1, boolean flag)
    {
        view = view1;
        routeItemListener.setView(view1);
        view.setTag(viewModel.getRoute().getId());
        int i = viewModel.getTextColor();
        int j = viewModel.getTextSelectedColor();
        MergedItinerary mergeditinerary = viewModel.getCurrentItinerary();
        if (mergeditinerary.getOngoingScheduleItems() == null || mergeditinerary.getOngoingScheduleItems().size() == 0 || ((ScheduleItem)mergeditinerary.getOngoingScheduleItems().get(mergeditinerary.getOngoingScheduleItems().size() - 1)).isPastItem())
        {
            mergeditinerary.loadOngoingScheduleItems();
        }
        setupTimeAndFrequency(view1, i, j, mergeditinerary, flag);
        setTextView(view1, 0x7f050053, viewModel.getShortName(), i, j);
        setTextView(view1, 0x7f050057, mergeditinerary.getClosestStop().getName(), i, j);
        setupBranchCode(view1, i, j);
        setupRouteImage(view1);
        setupFavorite(view1);
        setupRouteName(view1, mergeditinerary.getCurrentHeadsign(), i, j, flag);
        setupDirections(view1);
        BackgroundUtility.setGlossyBackground(view1.findViewById(0x7f050051), viewModel);
    }

    public void shakeTime()
    {
        Animation animation = AnimationUtils.loadAnimation(view.getContext(), 0x7f040001);
        view.findViewById(0x7f050063).startAnimation(animation);
    }

}

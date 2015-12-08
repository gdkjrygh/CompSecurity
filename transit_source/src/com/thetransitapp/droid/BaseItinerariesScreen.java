// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;
import com.thetransitapp.droid.model.RouteImage;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.ui.ShadowImageView;
import com.thetransitapp.droid.util.BackgroundUtility;
import com.thetransitapp.droid.util.BitmapUtility;
import com.thetransitapp.droid.util.FontUtility;

// Referenced classes of package com.thetransitapp.droid:
//            BaseMapScreen

public abstract class BaseItinerariesScreen extends BaseMapScreen
{

    private ImageView directionImage;
    private ViewFlipper flipper;
    private LinearLayout routeContainer;
    private LinearLayout routeContent;
    private ShadowImageView routeImage;
    private TextView routeNumber;
    private TextView stopName;

    public BaseItinerariesScreen(TransitActivity.TransitScreen transitscreen)
    {
        super(transitscreen);
    }

    private void setDirections(NearbyRouteViewModel nearbyrouteviewmodel)
    {
        Object obj = BitmapUtility.getArrow(nearbyrouteviewmodel, super.getResources().getDimension(0x7f080015) * 0.7F);
        android.graphics.Bitmap bitmap = BitmapUtility.getArrow(nearbyrouteviewmodel, directionImage.getContext().getResources().getDimension(0x7f080015) * 0.7F, true);
        nearbyrouteviewmodel = new StateListDrawable();
        obj = new BitmapDrawable(super.getResources(), ((android.graphics.Bitmap) (obj)));
        nearbyrouteviewmodel.addState(new int[] {
            0xfefeff59
        }, ((android.graphics.drawable.Drawable) (obj)));
        obj = new BitmapDrawable(super.getResources(), bitmap);
        nearbyrouteviewmodel.addState(new int[] {
            0x10100a7
        }, ((android.graphics.drawable.Drawable) (obj)));
        directionImage.setImageDrawable(nearbyrouteviewmodel);
    }

    private void setTextView(TextView textview, String s, NearbyRouteViewModel nearbyrouteviewmodel)
    {
        int ai[] = {
            0xfefeff59
        };
        int ai1[] = {
            0x10100a7
        };
        int i = nearbyrouteviewmodel.getTextColor();
        int j = nearbyrouteviewmodel.getTextSelectedColor();
        textview.setTextColor(new ColorStateList(new int[][] {
            ai, ai1
        }, new int[] {
            i, j
        }));
        textview.setText(s);
        if (textview == routeNumber)
        {
            textview.setTypeface(FontUtility.getInterstateBold(getActivity()));
        }
        textview.setShadowLayer(0.1F, 0.0F, nearbyrouteviewmodel.getTextShadowOffset(), nearbyrouteviewmodel.getShadowColor());
    }

    private void setupRouteName(String s, boolean flag, NearbyRouteViewModel nearbyrouteviewmodel)
    {
        int i;
        if (flipper.getDisplayedChild() == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        setTextView((TextView)flipper.getChildAt(i), s, nearbyrouteviewmodel);
        if (flag)
        {
            flipper.setInAnimation(flipper.getContext(), 0x7f040003);
            flipper.setOutAnimation(flipper.getContext(), 0x7f040005);
        } else
        {
            flipper.setInAnimation(null);
            flipper.setOutAnimation(null);
        }
        flipper.showNext();
    }

    public void shakeRoute()
    {
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(super.getActivity(), 0x7f040001);
        routeContainer.startAnimation(animation);
    }

    public void updateContent(NearbyRouteViewModel nearbyrouteviewmodel, boolean flag)
    {
        setTextView(routeNumber, nearbyrouteviewmodel.getShortName(), nearbyrouteviewmodel);
        Object obj = nearbyrouteviewmodel.getRouteImage();
        String s;
        String s1;
        if (obj != null && ((RouteImage) (obj)).isReplaceName())
        {
            android.util.DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
            UrlImageViewHelper.setUrlDrawable(routeImage, ((RouteImage) (obj)).getUrlWithScreenMetrics(displaymetrics, false));
            routeImage.setVisibility(0);
            routeImage.setColorFilter(new PorterDuffColorFilter(nearbyrouteviewmodel.getTextColor(), android.graphics.PorterDuff.Mode.SRC_IN));
            routeImage.setPressedColorFilter(new PorterDuffColorFilter(nearbyrouteviewmodel.getTextColor() & 0xbbffffff, android.graphics.PorterDuff.Mode.SRC_IN));
            routeImage.setShadowLayer(0.1F, 0.0F, nearbyrouteviewmodel.getTextShadowOffset(), nearbyrouteviewmodel.getShadowColor());
            routeNumber.setVisibility(8);
        } else
        {
            routeNumber.setVisibility(0);
            routeImage.setVisibility(8);
        }
        s = nearbyrouteviewmodel.getCurrentItinerary().getCurrentHeadsign();
        s1 = nearbyrouteviewmodel.getCurrentItinerary().getBranch();
        obj = s;
        if (s1 != null)
        {
            obj = (new StringBuilder(String.valueOf(s1))).append(" - ").append(s).toString();
        }
        setupRouteName(((String) (obj)), flag, nearbyrouteviewmodel);
        setTextView(stopName, nearbyrouteviewmodel.getCurrentItinerary().getClosestStop().getName(), nearbyrouteviewmodel);
        BackgroundUtility.setGlossyBackground(routeContent, nearbyrouteviewmodel, false);
        setDirections(nearbyrouteviewmodel);
    }
}

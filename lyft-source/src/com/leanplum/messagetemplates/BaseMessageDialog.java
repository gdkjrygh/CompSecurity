// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.leanplum.utils.BitmapUtil;
import com.leanplum.utils.SizeUtil;
import com.leanplum.views.BackgroundImageView;
import com.leanplum.views.CloseButton;

// Referenced classes of package com.leanplum.messagetemplates:
//            BaseMessageOptions, i, WebInterstitialOptions, g, 
//            CenterPopupOptions, h, e

public class BaseMessageDialog extends Dialog
{

    private RelativeLayout a;
    private boolean b;
    private boolean c;
    protected BaseMessageOptions options;
    protected WebInterstitialOptions webOptions;

    protected BaseMessageDialog(Activity activity, boolean flag, BaseMessageOptions basemessageoptions, WebInterstitialOptions webinterstitialoptions)
    {
        RelativeLayout relativelayout;
        int j;
        if ((activity.getWindow().getAttributes().flags & 0x400) == 1024)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            j = 0x1030011;
        } else
        {
            j = 0x1030010;
        }
        super(activity, j);
        b = false;
        c = false;
        SizeUtil.init(activity);
        options = basemessageoptions;
        webOptions = webinterstitialoptions;
        if (webinterstitialoptions != null)
        {
            b = true;
        }
        a = new RelativeLayout(activity);
        basemessageoptions = new android.view.ViewGroup.LayoutParams(-1, -1);
        a.setBackgroundColor(0);
        a.setLayoutParams(basemessageoptions);
        relativelayout = new RelativeLayout(activity);
        if (flag)
        {
            basemessageoptions = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        } else
        {
            j = SizeUtil.dpToPx(activity, ((CenterPopupOptions)options).getWidth());
            int k = SizeUtil.dpToPx(activity, ((CenterPopupOptions)options).getHeight());
            obj = activity.getWindowManager().getDefaultDisplay();
            basemessageoptions = new Point();
            double d;
            int l;
            int i1;
            if (android.os.Build.VERSION.SDK_INT >= 13)
            {
                ((Display) (obj)).getSize(basemessageoptions);
            } else
            {
                basemessageoptions = new Point(((Display) (obj)).getHeight(), ((Display) (obj)).getHeight());
            }
            i1 = ((Point) (basemessageoptions)).x - SizeUtil.dp20;
            l = ((Point) (basemessageoptions)).y - SizeUtil.dp20;
            d = (double)j / (double)k;
            if (j > i1 && (int)((double)j / d) < l)
            {
                k = (int)((double)i1 / d);
                j = i1;
            }
            if (k > l && (int)((double)k * d) < i1)
            {
                j = (int)((double)l * d);
                k = l;
            }
            basemessageoptions = new android.widget.RelativeLayout.LayoutParams(j, k);
        }
        basemessageoptions.addRule(13, -1);
        relativelayout.setLayoutParams(basemessageoptions);
        basemessageoptions = new ShapeDrawable();
        if (flag)
        {
            j = 0;
        } else
        {
            j = SizeUtil.dp20;
        }
        basemessageoptions.setShape(a(j));
        basemessageoptions.getPaint().setColor(0);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            relativelayout.setBackground(basemessageoptions);
        } else
        {
            relativelayout.setBackgroundDrawable(basemessageoptions);
        }
        if (!b)
        {
            basemessageoptions = new BackgroundImageView(activity, flag);
            basemessageoptions.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            Object obj;
            Object obj1;
            if (!flag)
            {
                j = SizeUtil.dp20;
            } else
            {
                j = 0;
            }
            basemessageoptions.setImageBitmap(options.getBackgroundImage());
            obj = new ShapeDrawable();
            ((ShapeDrawable) (obj)).setShape(a(j));
            ((ShapeDrawable) (obj)).getPaint().setColor(options.getBackgroundColor());
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                basemessageoptions.setBackground(((android.graphics.drawable.Drawable) (obj)));
            } else
            {
                basemessageoptions.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
            }
            basemessageoptions.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            relativelayout.addView(basemessageoptions, basemessageoptions.getLayoutParams());
            basemessageoptions = new RelativeLayout(activity);
            basemessageoptions.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            obj = new TextView(activity);
            ((TextView) (obj)).setPadding(0, SizeUtil.dp5, 0, SizeUtil.dp5);
            ((TextView) (obj)).setGravity(17);
            ((TextView) (obj)).setText(options.getTitle());
            ((TextView) (obj)).setTextColor(options.getTitleColor());
            ((TextView) (obj)).setTextSize(2, 20F);
            ((TextView) (obj)).setTypeface(null, 1);
            obj1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(15, -1);
            ((TextView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            basemessageoptions.addView(((View) (obj)), ((TextView) (obj)).getLayoutParams());
            basemessageoptions.setId(104);
            relativelayout.addView(basemessageoptions, basemessageoptions.getLayoutParams());
            obj = new TextView(activity);
            obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).setMargins(0, 0, 0, SizeUtil.dp5);
            ((TextView) (obj)).setPadding(SizeUtil.dp20, SizeUtil.dp5, SizeUtil.dp20, SizeUtil.dp5);
            ((TextView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            ((TextView) (obj)).setText(options.getAcceptButtonText());
            ((TextView) (obj)).setTextColor(options.getAcceptButtonTextColor());
            ((TextView) (obj)).setTypeface(null, 1);
            BitmapUtil.stateBackgroundDarkerByPercentage(((View) (obj)), options.getAcceptButtonBackgroundColor(), 30);
            ((TextView) (obj)).setTextSize(2, 18F);
            ((TextView) (obj)).setOnClickListener(new i(this));
            ((View) (obj)).setId(105);
            relativelayout.addView(((View) (obj)), ((View) (obj)).getLayoutParams());
            obj1 = new TextView(activity);
            ((TextView) (obj1)).setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            ((TextView) (obj1)).setGravity(17);
            ((TextView) (obj1)).setText(options.getMessageText());
            ((TextView) (obj1)).setTextColor(options.getMessageColor());
            ((TextView) (obj1)).setTextSize(2, 18F);
            ((android.widget.RelativeLayout.LayoutParams)((View) (obj1)).getLayoutParams()).addRule(3, basemessageoptions.getId());
            ((android.widget.RelativeLayout.LayoutParams)((View) (obj1)).getLayoutParams()).addRule(2, ((View) (obj)).getId());
            relativelayout.addView(((View) (obj1)), ((View) (obj1)).getLayoutParams());
        } else
        {
            basemessageoptions = new WebView(activity);
            basemessageoptions.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            basemessageoptions.setWebViewClient(new h(this));
            basemessageoptions.loadUrl(webOptions.getUrl());
            relativelayout.addView(basemessageoptions, basemessageoptions.getLayoutParams());
        }
        relativelayout.setId(108);
        a.addView(relativelayout, relativelayout.getLayoutParams());
        if (!b || webinterstitialoptions.hasDismissButton())
        {
            activity = new CloseButton(activity);
            activity.setId(103);
            basemessageoptions = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            if (flag)
            {
                basemessageoptions.addRule(10, a.getId());
                basemessageoptions.addRule(11, a.getId());
                basemessageoptions.setMargins(0, SizeUtil.dp5, SizeUtil.dp5, 0);
            } else
            {
                basemessageoptions.addRule(6, relativelayout.getId());
                basemessageoptions.addRule(7, relativelayout.getId());
                basemessageoptions.setMargins(0, -SizeUtil.dp7, -SizeUtil.dp7, 0);
            }
            activity.setLayoutParams(basemessageoptions);
            activity.setOnClickListener(new g(this));
            a.addView(activity, activity.getLayoutParams());
        }
        setContentView(a, a.getLayoutParams());
        activity = a;
        basemessageoptions = new AlphaAnimation(0.0F, 1.0F);
        basemessageoptions.setInterpolator(new DecelerateInterpolator());
        basemessageoptions.setDuration(350L);
        activity.setAnimation(basemessageoptions);
        if (!flag)
        {
            getWindow().addFlags(2);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                getWindow().setDimAmount(0.7F);
            }
        }
    }

    private static Shape a(int j)
    {
        return new RoundRectShape(new float[] {
            (float)j, (float)j, (float)j, (float)j, (float)j, (float)j, (float)j, (float)j
        }, null, null);
    }

    static void a(BaseMessageDialog basemessagedialog)
    {
        basemessagedialog.Dialog.cancel();
    }

    static boolean b(BaseMessageDialog basemessagedialog)
    {
        return basemessagedialog.c;
    }

    public void cancel()
    {
        if (c)
        {
            return;
        } else
        {
            c = true;
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setInterpolator(new AccelerateInterpolator());
            alphaanimation.setDuration(350L);
            alphaanimation.setAnimationListener(new e(this));
            a.startAnimation(alphaanimation);
            return;
        }
    }
}

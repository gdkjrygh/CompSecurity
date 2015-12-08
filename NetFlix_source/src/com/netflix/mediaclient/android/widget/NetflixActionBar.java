// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.ViewUtils;
import java.security.InvalidParameterException;

public class NetflixActionBar
{
    public static final class LogoType extends Enum
    {

        private static final LogoType $VALUES[];
        public static final LogoType FULL_SIZE;
        public static final LogoType GONE;

        public static LogoType valueOf(String s)
        {
            return (LogoType)Enum.valueOf(com/netflix/mediaclient/android/widget/NetflixActionBar$LogoType, s);
        }

        public static LogoType[] values()
        {
            return (LogoType[])$VALUES.clone();
        }

        static 
        {
            FULL_SIZE = new LogoType("FULL_SIZE", 0);
            GONE = new LogoType("GONE", 1);
            $VALUES = (new LogoType[] {
                FULL_SIZE, GONE
            });
        }

        private LogoType(String s, int i)
        {
            super(s, i);
        }
    }

    protected static class PerformUpActionOnClickListener
        implements android.view.View.OnClickListener
    {

        private final NetflixActivity activity;

        public void onClick(View view)
        {
            activity.performUpAction();
        }

        public PerformUpActionOnClickListener(NetflixActivity netflixactivity)
        {
            activity = netflixactivity;
        }
    }


    private static final float CARET_TOUCH_SLOP_SCALE_FACTOR = 2.5F;
    private static final String TAG = "NetflixActionBar";
    protected final NetflixActivity activity;
    protected final View content;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

        final NetflixActionBar this$0;

        private void applyUpButtonTouchDelegate()
        {
            Object obj = getHomeView((View)content.getParent());
            if (obj == null)
            {
                Log.d("NetflixActionBar", "Could not find home view");
                return;
            }
            View view = ((View) (obj));
            if (!((View) (obj)).isClickable())
            {
                view = (View)((View) (obj)).getParent();
            }
            view.setFocusable(false);
            int i = view.getWidth();
            Log.v("NetflixActionBar", (new StringBuilder()).append("caret width: ").append(i).toString());
            obj = new Rect();
            view.getHitRect(((Rect) (obj)));
            obj.right = (int)((float)((Rect) (obj)).right * 2.5F);
            Log.v("NetflixActionBar", (new StringBuilder()).append("touch delegate rect: ").append(((Rect) (obj)).toString()).toString());
            content.setTouchDelegate(new TouchDelegate(((Rect) (obj)), view));
        }

        private View findHomeView(View view)
        {
            Log.v("NetflixActionBar", (new StringBuilder()).append("Examining view: ").append(view.getClass().getSimpleName()).toString());
            if ("HomeView".equals(view.getClass().getSimpleName()))
            {
                return view;
            }
            if (view instanceof ViewGroup)
            {
                view = (ViewGroup)view;
                for (int i = 0; i < view.getChildCount(); i++)
                {
                    View view1 = findHomeView(view.getChildAt(i));
                    if (view1 != null)
                    {
                        return view1;
                    }
                }

            } else
            {
                return null;
            }
            return null;
        }

        private View getHomeView(View view)
        {
            if (homeView == null)
            {
                homeView = findHomeView(view);
            }
            return homeView;
        }

        public void onGlobalLayout()
        {
            ViewUtils.removeGlobalLayoutListener(content, this);
            applyUpButtonTouchDelegate();
        }

            
            {
                this$0 = NetflixActionBar.this;
                super();
            }
    };
    protected final boolean hasUpAction;
    private View homeView;
    protected final ImageView logo;
    protected final ActionBar systemActionBar;
    protected final TextView title;

    public NetflixActionBar(NetflixActivity netflixactivity, boolean flag)
    {
        activity = netflixactivity;
        systemActionBar = netflixactivity.getActionBar();
        hasUpAction = flag;
        if (systemActionBar == null)
        {
            throw new InvalidParameterException("ActionBar is null");
        }
        systemActionBar.setCustomView(getLayoutId());
        systemActionBar.setDisplayHomeAsUpEnabled(flag);
        systemActionBar.setDisplayShowCustomEnabled(true);
        systemActionBar.setDisplayShowHomeEnabled(true);
        systemActionBar.setDisplayShowTitleEnabled(true);
        systemActionBar.setDisplayUseLogoEnabled(true);
        systemActionBar.setHomeButtonEnabled(true);
        systemActionBar.setBackgroundDrawable(netflixactivity.getResources().getDrawable(0x7f02005c));
        systemActionBar.setLogo(0x7f090030);
        systemActionBar.setTitle("");
        content = systemActionBar.getCustomView();
        logo = (ImageView)content.findViewById(0x7f070061);
        title = (TextView)content.findViewById(0x7f070062);
        fixBackgroundRepeat(content);
        setupFocusability();
        setLogoType(LogoType.FULL_SIZE);
        if (flag)
        {
            content.getViewTreeObserver().addOnGlobalLayoutListener(globalLayoutListener);
        }
    }

    private void fixBackgroundRepeat(View view)
    {
        view = view.getBackground();
        if (view != null && (view instanceof BitmapDrawable))
        {
            ((BitmapDrawable)view).setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
        }
    }

    private boolean performUpAction()
    {
        if (activity != null)
        {
            Log.v("NetflixActionBar", "performing up action");
            activity.performUpAction();
            return true;
        } else
        {
            return false;
        }
    }

    private void setupFocusability()
    {
        Object obj = activity.findViewById(0x102002c);
        if (obj != null)
        {
            obj = (ViewGroup)((View) (obj)).getParent();
            ((ViewGroup) (obj)).setFocusable(false);
            obj = (View)((ViewGroup) (obj)).getParent();
            if (obj != null)
            {
                ((View) (obj)).setFocusable(false);
                return;
            }
        }
    }

    protected void configureBackButtonIfNecessary(boolean flag)
    {
        if (KidsUtils.shouldShowBackNavigationAffordance(activity) && !(activity instanceof HomeActivity))
        {
            ActionBar actionbar = activity.getActionBar();
            actionbar.setDisplayHomeAsUpEnabled(false);
            actionbar.setDisplayShowHomeEnabled(false);
            if (!flag || DeviceUtils.getScreenResolutionDpi(activity) >= 320)
            {
                Log.v("NetflixActionBar", "Configuring action bar 'up' affordance for back behavior");
                View view = content.findViewById(0x7f070060);
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                int i = activity.getActionBarHeight();
                layoutparams.width = i;
                if (flag)
                {
                    layoutparams.width = (int)((float)layoutparams.width * 0.75F);
                    view.setPadding(view.getPaddingLeft() / 2, view.getPaddingTop(), view.getPaddingRight() / 2, view.getPaddingBottom());
                }
                layoutparams.height = i;
                view.setVisibility(0);
                view.setOnClickListener(new PerformUpActionOnClickListener(activity));
                return;
            }
        }
    }

    protected Activity getActivity()
    {
        return activity;
    }

    protected View getContentView()
    {
        return content;
    }

    protected int getFullSizeLogoId()
    {
        return 0x7f020000;
    }

    public View getHomeView()
    {
        return homeView;
    }

    protected int getLayoutId()
    {
        return 0x7f030017;
    }

    public boolean handleHomeButtonSelected(MenuItem menuitem)
    {
        Log.v("NetflixActionBar", (new StringBuilder()).append("handleHomeButtonSelected, id: ").append(menuitem.getItemId()).toString());
        if (menuitem.getItemId() == 0x102002c)
        {
            return performUpAction();
        } else
        {
            return false;
        }
    }

    public void hide()
    {
        content.setVisibility(8);
    }

    public void onManagerReady()
    {
    }

    public void setBackgroundResource(int i)
    {
        systemActionBar.setBackgroundDrawable(activity.getResources().getDrawable(i));
    }

    public void setLogoType(LogoType logotype)
    {
        if (logo == null)
        {
            return;
        }
        if (logotype == LogoType.GONE)
        {
            logo.setVisibility(8);
            title.setVisibility(0);
            return;
        }
        title.setVisibility(8);
        int i = -1;
        if (logotype == LogoType.FULL_SIZE)
        {
            i = getFullSizeLogoId();
        }
        Log.v("NetflixActionBar", (new StringBuilder()).append("set logo: ").append(i).toString());
        logo.setImageResource(i);
        logo.setVisibility(0);
    }

    public void setTitle(String s)
    {
        Log.v("NetflixActionBar", (new StringBuilder()).append("set title: ").append(s).toString());
        title.setText(s);
    }

    public void show()
    {
        content.setVisibility(0);
    }



/*
    static View access$002(NetflixActionBar netflixactionbar, View view)
    {
        netflixactionbar.homeView = view;
        return view;
    }

*/
}

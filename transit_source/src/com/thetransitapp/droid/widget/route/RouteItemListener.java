// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.thetransitapp.droid.util.ExpandCollapseAnimation;

// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteActionClickListener, RouteUiHandlers, RouteItem

public class RouteItemListener
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.view.View.OnTouchListener, android.view.animation.Animation.AnimationListener
{

    private static int $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType[];
    private static final float SWIPE_THRESHOLD = 100F;
    private RouteUiHandlers.ClickType clickType;
    private View content;
    private View contentBackground;
    private boolean eventCanceled;
    private boolean longClicked;
    private View menu;
    private boolean menuOpen;
    private final SharedPreferences preferences;
    private final RouteItem routeItem;
    private float slideThreshold;
    private float startX;
    private float top;
    private final RouteUiHandlers uiHandlers;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[RouteUiHandlers.ClickType.values().length];
        try
        {
            ai[RouteUiHandlers.ClickType.DEFAULT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[RouteUiHandlers.ClickType.FAVORITE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[RouteUiHandlers.ClickType.MAP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[RouteUiHandlers.ClickType.MENU_OPEN.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[RouteUiHandlers.ClickType.NONE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[RouteUiHandlers.ClickType.SWITCH_DIRECTION.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[RouteUiHandlers.ClickType.TIMETABLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType = ai;
        return ai;
    }

    public RouteItemListener(RouteUiHandlers routeuihandlers, RouteItem routeitem, SharedPreferences sharedpreferences)
    {
        clickType = RouteUiHandlers.ClickType.DEFAULT;
        uiHandlers = routeuihandlers;
        routeItem = routeitem;
        preferences = sharedpreferences;
    }

    private float calculateLeft(float f)
    {
        float f1;
        if (f > 100F || f < -100F)
        {
            f1 = content.getWidth();
            float f2 = Math.abs(f) - 100F;
            f2 = (float)(Math.min(f2, (1.0D - 1.0D / (((double)f2 * 0.34999999999999998D) / (double)f1 + 1.0D)) * (double)f1) + 100D);
            f1 = f2;
            if (f < 0.0F)
            {
                f1 = f2 * -1F;
            }
        } else
        {
            f1 = f;
            if (f < 3F)
            {
                f1 = f;
                if (f > -3F)
                {
                    return 0.0F;
                }
            }
        }
        return f1;
    }

    private void setClickListeners(View view)
    {
        content.setOnClickListener(this);
        content.setOnTouchListener(this);
        view.findViewById(0x7f05005c).setOnClickListener(new RouteActionClickListener(uiHandlers, RouteUiHandlers.ClickType.MAP, routeItem));
        view.findViewById(0x7f05005b).setOnClickListener(new RouteActionClickListener(uiHandlers, RouteUiHandlers.ClickType.SWITCH_DIRECTION, routeItem));
        view.findViewById(0x7f05005d).setOnClickListener(new RouteActionClickListener(uiHandlers, RouteUiHandlers.ClickType.FAVORITE, routeItem));
        view.findViewById(0x7f05005e).setOnClickListener(new RouteActionClickListener(uiHandlers, RouteUiHandlers.ClickType.TIMETABLE, routeItem));
        content.setLongClickable(true);
        content.setOnLongClickListener(this);
    }

    private void setClickType(float f)
    {
        if (f > 100F)
        {
            clickType = RouteUiHandlers.ClickType.MAP;
        } else
        if (f < -100F)
        {
            clickType = RouteUiHandlers.ClickType.SWITCH_DIRECTION;
            return;
        }
    }

    private void slideBack(View view, float f)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(f, 0.0F, 0.0F, 0.0F);
        translateanimation.setInterpolator(new AccelerateInterpolator());
        translateanimation.setDuration(150L);
        view.setTranslationX(0.0F);
        view.startAnimation(translateanimation);
        if (clickType == RouteUiHandlers.ClickType.MAP || clickType == RouteUiHandlers.ClickType.SWITCH_DIRECTION)
        {
            translateanimation.setAnimationListener(this);
        }
    }

    private boolean swipeItem(View view, MotionEvent motionevent)
    {
        float f;
        boolean flag;
        flag = true;
        f = view.getTranslationX();
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 50
    //                   1 301
    //                   2 115
    //                   3 347;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        flag = false;
_L9:
        return flag;
_L2:
        clickType = RouteUiHandlers.ClickType.DEFAULT;
        view = contentBackground;
        int i;
        if (menuOpen)
        {
            i = 0x7f0200a6;
        } else
        {
            i = 0x7f0200a7;
        }
        view.setBackgroundResource(i);
        startX = motionevent.getX();
        top = motionevent.getY();
        eventCanceled = false;
        longClicked = false;
        break; /* Loop/switch isn't completed */
_L4:
        float f1;
        float f2;
        if (longClicked)
        {
            slideBack(view, f);
            break; /* Loop/switch isn't completed */
        }
        f1 = motionevent.getX();
        f2 = startX;
        top = top + motionevent.getY();
        if (clickType != RouteUiHandlers.ClickType.NONE && clickType != RouteUiHandlers.ClickType.DEFAULT) goto _L7; else goto _L6
_L6:
label0:
        {
            f1 = calculateLeft((f1 + f) - f2);
            if (f1 <= 20F)
            {
                f = f1;
                if (f1 >= -20F)
                {
                    break label0;
                }
            }
            clickType = RouteUiHandlers.ClickType.NONE;
            contentBackground.setBackgroundResource(0);
            view.setPressed(false);
            f = f1;
        }
_L8:
        if (f > slideThreshold || f < -slideThreshold || top > slideThreshold || top < -slideThreshold)
        {
            uiHandlers.viewMovedSieway();
        }
        view.setTranslationX(f);
        view.invalidate();
        break; /* Loop/switch isn't completed */
_L7:
        f = 0.0F;
        if (true) goto _L8; else goto _L3
_L3:
        setClickType(f);
        slideBack(view, f);
        switch ($SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType()[clickType.ordinal()])
        {
        default:
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        if (true) goto _L9; else goto _L5
_L5:
        view.setPressed(false);
        uiHandlers.viewMovedSieway();
        eventCanceled = true;
        if (true) goto _L1; else goto _L10
_L10:
    }

    public void onAnimationEnd(Animation animation)
    {
        onClick(content);
        showMenu(false);
        content.setPressed(false);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    public void onClick(View view)
    {
        if (clickType == RouteUiHandlers.ClickType.DEFAULT)
        {
            boolean flag;
            if (menu.getVisibility() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            showMenu(flag);
            preferences.edit().putBoolean("menuPressed", true).commit();
        }
        if (clickType != RouteUiHandlers.ClickType.NONE)
        {
            uiHandlers.onClick(clickType, routeItem);
            view.setPressed(false);
        }
    }

    public boolean onLongClick(View view)
    {
        if (!eventCanceled)
        {
            if (startX > (float)view.findViewById(0x7f050063).getLeft())
            {
                uiHandlers.onLongClick(RouteUiHandlers.LongClickType.TIME, routeItem, view.findViewById(0x7f050066));
            } else
            {
                uiHandlers.onLongClick(RouteUiHandlers.LongClickType.DIRECTION, routeItem, view.findViewById(0x7f050060));
            }
            longClicked = true;
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            startX = motionevent.getX();
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return swipeItem(view, motionevent);
        } else
        {
            return false;
        }
    }

    public void setView(View view)
    {
        slideThreshold = view.getContext().getResources().getDimension(0x7f080028) * 10F;
        contentBackground = view.findViewById(0x7f05005f);
        content = view.findViewById(0x7f050051);
        menu = view.findViewById(0x7f05005a);
        View view1 = menu;
        int i;
        if (menuOpen)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view1.setVisibility(i);
        setClickListeners(view);
    }

    public void showMenu(boolean flag)
    {
        menuOpen = flag;
        if (flag && menu.getVisibility() != 0)
        {
            ExpandCollapseAnimation.expand(menu, new android.view.animation.Animation.AnimationListener() {

                final RouteItemListener this$0;

                public void onAnimationEnd(Animation animation)
                {
                    uiHandlers.onClick(RouteUiHandlers.ClickType.MENU_OPEN, routeItem);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = RouteItemListener.this;
                super();
            }
            });
        } else
        if (menu.getVisibility() == 0)
        {
            ExpandCollapseAnimation.collapse(menu);
            return;
        }
    }


}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.ui.menu:
//            ContextMenuItemView

public class ContextMenuView extends FrameLayout
{

    private static final int ANGLE_DEGREE = 50;
    private static final int BACKGROUND_FADE_DURATION = 100;
    private static final float INITIAL_SCALE = 0.79F;
    private static final float MAX_ADDITIONAL_TRANSLATION = 14F * Device.getDensity();
    private static final float MENU_HIDE_ANIM_FRICTION = 0.7F;
    private static final float MENU_HIDE_ANIM_TENSION = 0.03F;
    private static final float MENU_SHOW_ANIM_FRICTION = 0.7F;
    private static final float MENU_SHOW_ANIM_TENSION = 0.2F;
    private static final int RADIUS = (int)(Device.getDensity() * 80F);
    private static final String TAG = "ContextMenuView";
    private double SELECTION_TRIGGER_DISTANCE_SQUARED;
    private ImageView _contextualBackground;
    private float _lastTouchDownX;
    private float _lastTouchDownY;
    private int assetHeight;
    private int assetWidth;
    private boolean isMenuShown;
    private List menuItems;
    private android.view.View.OnTouchListener onTouchListener;
    private float pointCoordinates[];
    private boolean popoutCompleted;
    private final List rectangles;
    private Rect screenRect;

    public ContextMenuView(Context context)
    {
        this(context, null, 0);
    }

    public ContextMenuView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContextMenuView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        SELECTION_TRIGGER_DISTANCE_SQUARED = 8000F * Device.getDensity();
        menuItems = new ArrayList();
        rectangles = new ArrayList();
        screenRect = new Rect();
        onTouchListener = new _cls4();
        setOnTouchListener(onTouchListener);
    }

    private void createRectangles(float af[])
    {
        rectangles.clear();
        for (int i = 2; i < af.length; i += 2)
        {
            Rect rect = new Rect((int)(af[i] - (float)(assetWidth / 2)), (int)(af[i + 1] - (float)(assetHeight / 2)), (int)(af[i] + (float)(assetWidth / 2)), (int)(af[i + 1] + (float)(assetHeight / 2)));
            rectangles.add(rect);
        }

    }

    private float getCenterCoordinateX(int i)
    {
        return pointCoordinates[i * 2];
    }

    private float getCenterCoordinateY(int i)
    {
        return pointCoordinates[i * 2 + 1];
    }

    private float[] getChoiceCoords(float f, float f1, int i)
    {
        float af1[] = new float[(i + 1) * 2];
        af1[0] = f;
        af1[1] = f1;
        if (i > 0)
        {
            float af[];
            int j;
            if (i % 2 != 0)
            {
                af1[2] = af1[0];
                af1[3] = af1[1] - (float)RADIUS;
                i = (i - 1) / 2;
                float f2 = af1[2];
                float f4 = af1[3];
                af = new float[i * 2];
                af = getRightPoints(new float[] {
                    f2, f4
                }, af, 50F, i, 0, f, f1);
                i = 4;
            } else
            {
                float f3 = RADIUS;
                af = new float[2];
                af = getRightPoints(new float[] {
                    f, f1 - f3
                }, af, 25F, 1, 0, f, f1);
                float af2[] = new float[af.length];
                for (j = 0; j < af.length; j++)
                {
                    af2[j] = af[j];
                }

                af1[2] = af[0];
                af1[3] = af[1];
                af1[4] = 2.0F * f - af[0];
                af1[5] = af[1];
                i = (i - 1) / 2;
                af = getRightPoints(af, new float[i * 2], 50F, i, 0, f, f1);
                i = 6;
            }
            for (j = i; j < af.length + i; j++)
            {
                af1[j] = af[j - i];
            }

            j = af.length + i;
            i = 0;
            while (i < af.length) 
            {
                if (i % 2 == 0)
                {
                    af1[j] = 2.0F * f - af[i];
                } else
                {
                    af1[j] = af[i];
                }
                j++;
                i++;
            }
            PLog.log("ContextMenuView", (new StringBuilder("Pre-rotation coordinates: ")).append(Arrays.toString(af1)).toString(), new Object[0]);
            return rotateContextualMenu(af1, 50F, f, f1);
        } else
        {
            return af1;
        }
    }

    private float[] getRightPoints(float af[], float af1[], float f, int i, int j, float f1, float f2)
    {
        do
        {
            if (i == 0)
            {
                return af1;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate(f, f1, f2);
            matrix.mapPoints(af);
            af1[j] = af[0];
            af1[j + 1] = af[1];
            i--;
            j += 2;
        } while (true);
    }

    private Pair getRotationAngle(float f, float f1)
    {
        int i = screenRect.width();
        float f2 = i / 2;
        String s;
        if (f1 < f2)
        {
            f *= 1.0F - f1 / f2;
            s = "left";
        } else
        {
            f = 360F - (1.0F - ((float)i - f1) / ((float)i - f2)) * f;
            s = "right";
        }
        return Pair.create(s, Float.valueOf(f));
    }

    private void hide()
    {
        isMenuShown = false;
        popoutCompleted = false;
        hideMenuItems();
        hideBackground();
        Pinalytics.a(EventType.CONTEXTUAL_MENU_CLOSE, ElementType.PIN_SOURCE_IMAGE, null, null);
        Events.post(new com.pinterest.activity.task.view.MainViewPager.ControlEvent(1));
    }

    private void hideBackground()
    {
        if (_contextualBackground != null)
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_contextualBackground, "alpha", new float[] {
                1.0F, 0.0F
            });
            objectanimator.setDuration(100L);
            objectanimator.addListener(new _cls3());
            objectanimator.start();
        }
    }

    private void hideMenuItems()
    {
        if (!menuItems.isEmpty())
        {
            float f = getCenterCoordinateX(0);
            float f1 = getCenterCoordinateY(0);
            ContextMenuItemView contextmenuitemview = (ContextMenuItemView)menuItems.get(0);
            int i = 0;
            boolean flag;
            for (flag = false; i < menuItems.size(); flag = true)
            {
                final ContextMenuItemView view = (ContextMenuItemView)menuItems.get(i);
                view.setToolTipAlwaysVisible(false);
                view.setStateSelected(false);
                view.setOnClickListener(null);
                float f2 = getCenterCoordinateX(i);
                float f3 = getCenterCoordinateY(i);
                _cls2 _lcls2 = new _cls2();
                view.setProperty(1, 0, 0.0F, f - f2, 0.7F, 0.03F, null);
                view.setProperty(1, 1, 0.0F, f1 - f3, 0.7F, 0.03F, null);
                view.setProperty(1, 2, 0.79F, 0.0F, 0.7F, 0.03F, null);
                view.setProperty(1, 3, 1.0F, 0.0F, 0.9F, 0.25F, _lcls2);
                i++;
            }

            menuItems.clear();
            if (!flag)
            {
                removeView(contextmenuitemview);
            }
        }
    }

    private void init()
    {
        screenRect.set(0, 0, (int)Device.getScreenWidth(), (int)Device.getScreenHeight());
        if (_contextualBackground == null)
        {
            _contextualBackground = new ImageView(getContext());
            _contextualBackground.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
            _contextualBackground.setImageResource(0x7f02011f);
            _contextualBackground.setVisibility(4);
            addView(_contextualBackground);
        }
    }

    private boolean needsApproximation(float af[])
    {
        int i;
        boolean flag;
        flag = false;
        createRectangles(af);
        af = rectangles.iterator();
        i = 0;
        break MISSING_BLOCK_LABEL_21;
        if (1.0F - (float)rect.height() / f <= 1.0F - (float)rect.width() / f1) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        float f;
        float f1;
        Rect rect;
        while (af.hasNext()) 
        {
            rect = (Rect)af.next();
            f = rect.height();
            f1 = rect.width();
            if (!screenRect.contains(rect))
            {
                if (rect.intersect(screenRect))
                {
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            }
        }
        if (i == 3)
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ContextMenuItemView onTouchMove(int i, int j)
    {
        ContextMenuItemView contextmenuitemview = null;
        double d = 1.7976931348623157E+308D;
        int l = -1;
        float f = 0.0F;
        int k = 1;
        while (k < menuItems.size()) 
        {
            ContextMenuItemView contextmenuitemview1 = (ContextMenuItemView)menuItems.get(k);
            float f1 = getCenterCoordinateX(k);
            float f3 = getCenterCoordinateY(k);
            contextmenuitemview1.setStateSelected(false);
            double d2 = Math.pow(_lastTouchDownX - f1, 2D);
            double d3 = Math.pow(_lastTouchDownY - f3, 2D);
            double d1 = Math.pow((float)i - f1, 2D) + Math.pow((float)j - f3, 2D);
            if (d1 < d && d1 <= d3 + d2)
            {
                if (contextmenuitemview != null)
                {
                    contextmenuitemview.translateAndScaleImage(getCenterCoordinateX(l), getCenterCoordinateY(l), 0.79F);
                }
                f = (float)(d1 / (Math.pow(_lastTouchDownX - f1, 2D) + Math.pow(_lastTouchDownY - f3, 2D)));
                contextmenuitemview = contextmenuitemview1;
                l = k;
                d = d1;
            } else
            {
                contextmenuitemview1.translateAndScaleImage(f1, f3, 0.79F);
            }
            k++;
        }
        if (contextmenuitemview != null)
        {
            f = 1.0F - f;
            float f2 = getCenterCoordinateX(0);
            float f4 = getCenterCoordinateY(0);
            float f5 = getCenterCoordinateX(l);
            float f6 = getCenterCoordinateY(l);
            float f7 = (float)Math.sqrt(Math.pow(_lastTouchDownX - f5, 2D) + Math.pow(_lastTouchDownY - f6, 2D));
            contextmenuitemview.translateAndScaleImage((f5 - f2) * (MAX_ADDITIONAL_TRANSLATION / f7) * f + f5, (f6 - f4) * (MAX_ADDITIONAL_TRANSLATION / f7) * f + f6, Math.max(0.79F, f * 0.21F + 0.79F));
            if (d < SELECTION_TRIGGER_DISTANCE_SQUARED)
            {
                contextmenuitemview.setStateSelected(true);
                return contextmenuitemview;
            }
        }
        return null;
    }

    private float[] rotateContextualMenu(float af[], float f, float f1, float f2)
    {
        Object obj = new Matrix();
        Object obj1 = getRotationAngle(f, f1);
        float f3 = ((Float)((Pair) (obj1)).second).floatValue();
        String s = (String)((Pair) (obj1)).first;
        ((Matrix) (obj)).setRotate(f3, f1, f2);
        PLog.log("ContextMenuView", (new StringBuilder("getRotationAngle returned side: ")).append(s).append(" Angle: ").append(f3).toString(), new Object[0]);
        obj1 = Boolean.valueOf(needsApproximation(af));
        PLog.log("ContextMenuView", (new StringBuilder("Rotation needs approximation: ")).append(obj1).toString(), new Object[0]);
        if (!((Boolean) (obj1)).booleanValue())
        {
            ((Matrix) (obj)).mapPoints(af);
            createRectangles(af);
            return (float[])((float[])updateAngleRotation(f, s, af, false, f1, f2).first).clone();
        }
        createRectangles(af);
        obj1 = updateAngleRotation(20F, s, af, true, f1, f2);
        obj = (Float)((Pair) (obj1)).second;
        af = (float[])((Pair) (obj1)).first;
        for (int i = 0; i < 9;)
        {
            obj1 = updateAngleRotation(20F, s, (float[])((Pair) (obj1)).first, true, f1, f2);
            if (((Float)((Pair) (obj1)).second).floatValue() > ((Float) (obj)).floatValue())
            {
                af = (float[])((float[])((Pair) (obj1)).first).clone();
                obj = (Float)((Pair) (obj1)).second;
            }
            if (((Float)((Pair) (obj1)).second).floatValue() >= ((Float) (obj)).floatValue())
            {
                i++;
            } else
            {
                return af;
            }
        }

        return af;
    }

    private void showBackground()
    {
        if (_contextualBackground != null)
        {
            _contextualBackground.getDrawable();
            _contextualBackground.setVisibility(0);
            ObjectAnimator.ofFloat(_contextualBackground, "alpha", new float[] {
                0.0F, 1.0F
            }).setDuration(100L).start();
        }
    }

    private void showMenuItems()
    {
        float f = getCenterCoordinateX(0);
        float f1 = getCenterCoordinateY(0);
        for (int i = 0; i < menuItems.size(); i++)
        {
            final ContextMenuItemView view = (ContextMenuItemView)menuItems.get(i);
            view.setVisibility(4);
            view.post(new _cls1());
        }

    }

    private Pair updateAngleRotation(float f, String s, float af[], boolean flag, float f1, float f2)
    {
        float f3;
        float f4;
        Object obj;
        f4 = 0.0F;
        PLog.log("ContextMenuView", "#updateAngleRotation angle %f side: %s rotateDif: %s", new Object[] {
            Float.valueOf(f), s, Boolean.valueOf(flag)
        });
        obj = rectangles.iterator();
        f3 = 0.0F;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Rect rect = (Rect)((Iterator) (obj)).next();
            float f5 = rect.width();
            if (!flag)
            {
                if (!screenRect.contains(rect))
                {
                    if (!rect.intersect(screenRect))
                    {
                        f3++;
                    } else
                    {
                        f3 = (1.0F - (float)rect.width() / f5) + f3;
                    }
                }
            } else
            {
                f3 = 1.0F;
            }
        } while (true);
        PLog.log("ContextMenuView", (new StringBuilder("Number of items out of screen: ")).append(f3).toString(), new Object[0]);
        obj = new Matrix();
        if (!s.equals("left")) goto _L2; else goto _L1
_L1:
        ((Matrix) (obj)).setRotate(f3 * f, f1, f2);
_L6:
        ((Matrix) (obj)).mapPoints(af);
        rectangles.clear();
        createRectangles(af);
        s = rectangles.iterator();
        f = f4;
_L4:
        if (!s.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Rect)s.next();
        if (screenRect.contains(((Rect) (obj))))
        {
            int i = ((Rect) (obj)).width();
            f += ((Rect) (obj)).height() * i;
        } else
        if (((Rect) (obj)).intersect(screenRect))
        {
            int j = ((Rect) (obj)).width();
            f += ((Rect) (obj)).height() * j;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("right"))
        {
            ((Matrix) (obj)).setRotate(360F - f3 * f, f1, f2);
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        PLog.log("ContextMenuView", (new StringBuilder("updateAngleRotation rotatePoints: ")).append(Arrays.toString(af)).append(" area: ").append(f).toString(), new Object[0]);
        return Pair.create(af, Float.valueOf(f));
        if (true) goto _L6; else goto _L5
_L5:
    }

    void addMenuOptions(List list)
    {
        hideMenuItems();
        rectangles.clear();
        ContextMenuItemView contextmenuitemview = (ContextMenuItemView)LayoutInflater.from(getContext()).inflate(0x7f030058, null);
        contextmenuitemview.setImage(0x7f020121);
        menuItems.add(contextmenuitemview);
        addView(contextmenuitemview);
        for (int i = 0; i < list.size(); i++)
        {
            ContextMenuItemView contextmenuitemview1 = (ContextMenuItemView)list.get(i);
            contextmenuitemview1.setId(i);
            contextmenuitemview1.setToolTipAlwaysVisible(false);
            addView(contextmenuitemview1);
            menuItems.add(contextmenuitemview1);
        }

        if (!menuItems.isEmpty())
        {
            list = (View)menuItems.get(menuItems.size() - 1);
            int j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            list.measure(j, j);
            assetWidth = (int)((float)list.getMeasuredWidth() * 0.79F);
            assetHeight = (int)((float)list.getMeasuredHeight() * 0.79F);
            pointCoordinates = getChoiceCoords(_lastTouchDownX, _lastTouchDownY, menuItems.size() - 1);
            PLog.log("ContextMenuView", (new StringBuilder("Post-rotation Coordinates: ")).append(Arrays.toString(pointCoordinates)).toString(), new Object[0]);
        }
    }

    public boolean isShown()
    {
        return super.isShown() && isMenuShown;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        hide();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        hide();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            _lastTouchDownX = motionevent.getX();
            _lastTouchDownY = motionevent.getY();
        }
        if (isMenuShown)
        {
            onTouchListener.onTouch(null, motionevent);
            return true;
        } else
        {
            return false;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        init();
    }

    public void show()
    {
        isMenuShown = true;
        showMenuItems();
        showBackground();
        Events.post(new com.pinterest.activity.task.view.MainViewPager.ControlEvent(0));
    }




/*
    static boolean access$002(ContextMenuView contextmenuview, boolean flag)
    {
        contextmenuview.popoutCompleted = flag;
        return flag;
    }

*/



/*
    static float access$102(ContextMenuView contextmenuview, float f)
    {
        contextmenuview._lastTouchDownX = f;
        return f;
    }

*/



/*
    static float access$202(ContextMenuView contextmenuview, float f)
    {
        contextmenuview._lastTouchDownY = f;
        return f;
    }

*/





    private class _cls4
        implements android.view.View.OnTouchListener
    {

        final ContextMenuView this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            MotionEventCompat.getActionMasked(motionevent);
            JVM INSTR tableswitch 0 2: default 32
        //                       0 34
        //                       1 78
        //                       2 124;
               goto _L1 _L2 _L3 _L4
_L1:
            return false;
_L2:
            _lastTouchDownX = motionevent.getX();
            _lastTouchDownY = motionevent.getY();
            if (isMenuShown)
            {
                hide();
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (isMenuShown)
            {
                view = onTouchMove((int)motionevent.getX(), (int)motionevent.getY());
                if (view != null)
                {
                    view.performClick();
                }
                hide();
                return true;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (popoutCompleted)
            {
                onTouchMove((int)motionevent.getX(), (int)motionevent.getY());
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        _cls4()
        {
            this$0 = ContextMenuView.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final ContextMenuView this$0;

        public void onAnimationEnd(Animator animator)
        {
            _contextualBackground.setVisibility(8);
        }

        _cls3()
        {
            this$0 = ContextMenuView.this;
            super();
        }
    }


    private class _cls2
        implements SpringLinearLayout.AnimListener
    {

        final ContextMenuView this$0;
        final ContextMenuItemView val$view;

        public void onAnimationCancel()
        {
        }

        public void onAnimationComplete()
        {
            removeView(view);
        }

        _cls2()
        {
            this$0 = ContextMenuView.this;
            view = contextmenuitemview;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final ContextMenuView this$0;
        final float val$initialCenterX;
        final float val$initialCenterY;
        final float val$originCenterX;
        final float val$originCenterY;
        final ContextMenuItemView val$view;

        public void run()
        {
            view.centerAround(initialCenterX, initialCenterY);
            class _cls1
                implements SpringLinearLayout.AnimListener
            {

                final _cls1 this$1;

                public void onAnimationCancel()
                {
                }

                public void onAnimationComplete()
                {
                    popoutCompleted = true;
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            _cls1 _lcls1 = new _cls1();
            view.setProperty(1, 0, originCenterX - initialCenterX, 0.0F, 0.7F, 0.2F, _lcls1);
            view.setProperty(1, 1, originCenterY - initialCenterY, 0.0F, 0.7F, 0.2F, _lcls1);
            view.setProperty(1, 2, 0.0F, 0.79F, 0.7F, 0.2F, null);
            view.setPivotX(_lastTouchDownX - view.getX());
            view.setPivotY(_lastTouchDownY - view.getY());
        }

        _cls1()
        {
            this$0 = ContextMenuView.this;
            view = contextmenuitemview;
            initialCenterX = f;
            initialCenterY = f1;
            originCenterX = f2;
            originCenterY = f3;
            super();
        }
    }

}

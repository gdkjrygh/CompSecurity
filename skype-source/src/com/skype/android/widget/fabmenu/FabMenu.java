// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fabmenu;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.TypeFaceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.widget.fabmenu:
//            FabMenuItem

public class FabMenu extends RelativeLayout
    implements android.view.View.OnClickListener
{
    public static interface FabMenuCallback
    {

        public abstract void onFabMenuItemSelected(int i1);

        public abstract void onFabMenuStateChange(boolean flag);

        public abstract void onMainFabClick();

        public abstract void onPrepareFabMenu(List list);
    }


    private FabMenuItem a;
    private ArrayList b;
    private SparseArray c;
    private ArrayList d;
    private FabMenuCallback e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public FabMenu(Context context)
    {
        this(context, null);
    }

    public FabMenu(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FabMenu(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = new ArrayList();
        d = new ArrayList();
        c = new SparseArray();
        if (attributeset != null)
        {
            context = getContext().obtainStyledAttributes(attributeset, com.skype.android.widget.R.styleable.FabMenu);
            g = context.getColor(0, -1);
            h = context.getDimensionPixelSize(1, 0);
            i1 = context.getDimensionPixelOffset(2, getResources().getDimensionPixelSize(com.skype.android.widget.R.dimen.items_vertical_margin_modifier));
            h = h + i1;
            i = context.getDimensionPixelSize(3, 0);
            l = context.getDimensionPixelSize(5, 0);
            j = context.getResourceId(4, 0);
            k = context.getResourceId(6, 0);
            context.recycle();
        }
        setOnClickListener(this);
        setClickable(false);
    }

    protected void a(int i1, int j1, int k1, int l1)
    {
        d.clear();
        i1 = a.getTop();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            FabMenuItem fabmenuitem = (FabMenuItem)iterator.next();
            if (fabmenuitem.isEnabled() && fabmenuitem.getVisibility() == 0)
            {
                j1 = (a.getWidth() - fabmenuitem.getWidth()) / 2;
                fabmenuitem.layout(a.getLeft() + j1, i1 - fabmenuitem.getHeight() - h, a.getRight() - j1, i1 - h);
                Object obj = (TextView)c.get(fabmenuitem.getId());
                i1 = (fabmenuitem.getHeight() - ((TextView) (obj)).getHeight()) / 2;
                ((TextView) (obj)).layout(a.getLeft() - i - ((TextView) (obj)).getWidth(), fabmenuitem.getTop() + i1, a.getLeft() - i, fabmenuitem.getBottom() - i1);
                obj = new Rect(((TextView) (obj)).getLeft(), fabmenuitem.getTop() - h, k1, fabmenuitem.getBottom() + h);
                d.add(new TouchDelegate(((Rect) (obj)), fabmenuitem));
                i1 = fabmenuitem.getTop();
            }
        } while (true);
    }

    protected void a(int i1, TextView textview)
    {
        textview.setVisibility(0);
        textview.setAlpha(0.0F);
        textview.setTranslationY(textview.getHeight() / 2);
        textview.animate().alpha(1.0F).translationY(0.0F).setDuration(150L).setInterpolator(new DecelerateInterpolator()).setStartDelay(i1 * 25).start();
    }

    protected void a(int i1, FabMenuItem fabmenuitem)
    {
        fabmenuitem.setVisibility(0);
        fabmenuitem.setAlpha(0.0F);
        fabmenuitem.setScaleX(0.0F);
        fabmenuitem.setScaleY(0.0F);
        if (fabmenuitem.getWidth() != 0)
        {
            fabmenuitem.setPivotX(fabmenuitem.getWidth() / 2);
            fabmenuitem.setPivotY(fabmenuitem.getHeight());
        }
        fabmenuitem.animate().alpha(1.0F).scaleX(1.0F).scaleY(1.0F).setInterpolator(new DecelerateInterpolator()).setDuration(150L).setStartDelay(i1 * 25).start();
    }

    public final boolean a()
    {
        boolean flag = false;
        if (f)
        {
            setExpanded(false);
            flag = true;
        }
        return flag;
    }

    public final void b()
    {
        boolean flag;
        if (!f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setExpanded(flag);
    }

    public final FabMenuItem c()
    {
        return a;
    }

    public final int d()
    {
        return g;
    }

    public final List e()
    {
        return b;
    }

    public void onClick(View view)
    {
        if (view != this) goto _L2; else goto _L1
_L1:
        setExpanded(false);
_L4:
        return;
_L2:
        if (view != a)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (e == null) goto _L4; else goto _L3
_L3:
        e.onMainFabClick();
        return;
        if (!(view instanceof FabMenuItem) || e == null) goto _L4; else goto _L5
_L5:
        e.onFabMenuItemSelected(view.getId());
        return;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        int i1 = 0;
        while (i1 < getChildCount()) 
        {
            Object obj = getChildAt(i1);
            if (!(obj instanceof FabMenuItem))
            {
                throw new RuntimeException((new StringBuilder("Only ")).append(com/skype/android/widget/fabmenu/FabMenuItem.getName()).append(" allowed as children of ").append(getClass().getName()).toString());
            }
            obj = (FabMenuItem)obj;
            if (((FabMenuItem) (obj)).d())
            {
                if (a != null)
                {
                    throw new RuntimeException((new StringBuilder("Only one large ")).append(com/skype/android/widget/fabmenu/FabMenuItem.getName()).append(" allowed as child of ").append(getClass().getName()).toString());
                }
                a = ((FabMenuItem) (obj));
                a.setOnClickListener(this);
            } else
            {
                ((FabMenuItem) (obj)).setVisibility(8);
                ((FabMenuItem) (obj)).setOnClickListener(this);
                b.add(obj);
            }
            i1++;
        }
        SegoeTypeFaceFactory segoetypefacefactory = SegoeTypeFaceFactory.getInstance((Application)getContext().getApplicationContext());
        Iterator iterator = b.iterator();
        while (iterator.hasNext()) 
        {
            FabMenuItem fabmenuitem = (FabMenuItem)iterator.next();
            TextView textview = new TextView(getContext());
            if (j != 0)
            {
                textview.setTextAppearance(getContext(), j);
            }
            if (k != 0)
            {
                textview.setBackgroundResource(k);
            }
            textview.setPadding(l, l, l, l);
            textview.setText(fabmenuitem.e());
            Typeface typeface = textview.getTypeface();
            float f1 = textview.getTextSize();
            if (typeface != null && typeface.isBold())
            {
                typeface = segoetypefacefactory.getBold(f1);
            } else
            {
                typeface = segoetypefacefactory.getDefault(f1);
            }
            textview.setTypeface(typeface);
            textview.setVisibility(8);
            addView(textview);
            c.put(fabmenuitem.getId(), textview);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        int i2 = getHeight() - getPaddingBottom();
        int j2 = getWidth() - getPaddingRight();
        a.layout(j2 - a.getWidth(), i2 - a.getHeight(), j2, i2);
        a(i1, j1, k1, l1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
label0:
        {
            if (!f)
            {
                break label0;
            }
            Iterator iterator = d.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((TouchDelegate)iterator.next()).onTouchEvent(motionevent));
            return true;
        }
        return super.onTouchEvent(motionevent);
    }

    public void setCallback(FabMenuCallback fabmenucallback)
    {
        e = fabmenucallback;
    }

    public void setExpanded(boolean flag)
    {
        if (flag != f) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (flag)
        {
            if (e != null)
            {
                e.onPrepareFabMenu(b);
            }
            Iterator iterator = b.iterator();
            boolean flag1 = true;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((FabMenuItem)iterator.next()).isEnabled())
                {
                    flag1 = false;
                }
            } while (true);
            if (flag1)
            {
                continue; /* Loop/switch isn't completed */
            }
            setBackgroundColor(g);
            setClickable(true);
            int i1 = 0;
            iterator = b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                FabMenuItem fabmenuitem = (FabMenuItem)iterator.next();
                if (fabmenuitem.isEnabled())
                {
                    a(i1, fabmenuitem);
                    a(i1, (TextView)c.get(fabmenuitem.getId()));
                    i1++;
                }
            } while (true);
        } else
        {
            setBackgroundColor(0);
            setClickable(false);
            Iterator iterator1 = b.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                FabMenuItem fabmenuitem1 = (FabMenuItem)iterator1.next();
                if (fabmenuitem1.isEnabled())
                {
                    fabmenuitem1.setVisibility(8);
                    ((TextView)c.get(fabmenuitem1.getId())).setVisibility(8);
                }
            } while (true);
        }
        f = flag;
        if (e != null)
        {
            e.onFabMenuStateChange(flag);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.animator.Animator;
import com.skype.android.widget.animator.MotionTween;
import com.skype.android.widget.animator.Track;
import java.util.ArrayList;
import java.util.List;

public class TabsPagerView extends HorizontalScrollView
{
    public static interface OnItemClickListener
    {

        public abstract void onClick(TabsPagerView tabspagerview, int i1);
    }


    private TypeFaceFactory a;
    private OnItemClickListener b;
    private Handler c;
    private Paint d;
    private int e;
    private float f;
    private float g;
    private Animator h;
    private List i;
    private boolean j;
    private boolean k;
    private LinearLayout l;
    private int m;
    private int n;

    public TabsPagerView(Context context)
    {
        super(context);
        d = new Paint();
        f = 0.0F;
        h = new Animator();
        i = new ArrayList();
        j = true;
        k = false;
        a(context);
    }

    public TabsPagerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new Paint();
        f = 0.0F;
        h = new Animator();
        i = new ArrayList();
        j = true;
        k = false;
        a(context);
    }

    private View a(int i1)
    {
        return (View)i.get(i1);
    }

    static TextView a(TabsPagerView tabspagerview, int i1)
    {
        return tabspagerview.b(i1);
    }

    static List a(TabsPagerView tabspagerview)
    {
        return tabspagerview.i;
    }

    private void a(Context context)
    {
        a = SegoeTypeFaceFactory.getInstance((Application)context.getApplicationContext());
        e = context.getResources().getColor(0x7f0f00d3);
        g = context.getResources().getDimensionPixelSize(0x7f0c025f);
        n = context.getResources().getDisplayMetrics().widthPixels / 3;
        h.a();
        d.setAntiAlias(true);
        d.setColor(e);
        l = new LinearLayout(context);
        l.setOrientation(0);
        addView(l);
        setBackgroundResource(0x7f020042);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        c = new Handler();
    }

    static int b(TabsPagerView tabspagerview)
    {
        return tabspagerview.m;
    }

    private TextView b(int i1)
    {
        return (TextView)((View)i.get(i1)).findViewById(0x7f100544);
    }

    private TextView c(int i1)
    {
        return (TextView)((View)i.get(i1)).findViewById(0x7f100545);
    }

    static TypeFaceFactory c(TabsPagerView tabspagerview)
    {
        return tabspagerview.a;
    }

    static Handler d(TabsPagerView tabspagerview)
    {
        return tabspagerview.c;
    }

    private void d(int i1)
    {
        Object obj1 = getResources().getString(0x7f0800a5, new Object[] {
            b(i1).getText().toString(), Integer.valueOf(i1 + 1), Integer.valueOf(i.size())
        });
        Object obj = obj1;
        int k1;
        if (i1 == 0)
        {
            try
            {
                int j1 = Integer.parseInt(c(i1).getText().toString());
                obj = (new StringBuilder()).append(((String) (obj1))).append(", ").append(getResources().getQuantityString(0x7f0b0003, j1, new Object[] {
                    Integer.valueOf(j1)
                })).toString();
            }
            catch (NumberFormatException numberformatexception)
            {
                numberformatexception = ((NumberFormatException) (obj1));
            }
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(", ");
        obj1 = getResources();
        if (i1 == m)
        {
            k1 = 0x7f080085;
        } else
        {
            k1 = 0x7f080086;
        }
        obj = ((StringBuilder) (obj)).append(((Resources) (obj1)).getString(k1)).toString();
        ((View)i.get(i1)).setContentDescription(((CharSequence) (obj)));
    }

    public boolean isEnabled()
    {
        return j;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f1;
        float f2;
        float f3;
        float f4;
        if (h.b())
        {
            Float float1 = h.a(System.currentTimeMillis(), "rect_position");
            if (float1 != null)
            {
                f = float1.floatValue();
            }
        } else
        {
            f = a(m).getLeft();
        }
        f1 = f;
        f2 = getHeight();
        f3 = g;
        f4 = f;
        canvas.drawRect(f1, f2 - f3, (float)a(m).getWidth() + f4, getHeight(), d);
        if (h.b())
        {
            postInvalidate();
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (!k && a(0).getWidth() != 0)
        {
            i1 = 0;
            while (i1 < i.size()) 
            {
                View view = a(i1);
                if (view.getWidth() != n)
                {
                    k1 = view.getWidth();
                    if (i1 == 0)
                    {
                        j1 = getContext().getResources().getDimensionPixelSize(0x7f0c00c9);
                    } else
                    {
                        j1 = 0;
                    }
                    view.setMinimumWidth(j1 + k1);
                }
                i1++;
            }
            k = true;
        }
    }

    public void setCurrentItem(int i1)
    {
        boolean flag = false;
        m = i1;
        int j1 = i1;
        if (i1 < 0)
        {
            j1 = 0;
        }
        i1 = j1;
        if (j1 >= i.size())
        {
            i1 = i.size() - 1;
        }
        View view = a(i1);
        h.c();
        Track track = new Track();
        track.a(new MotionTween(f, view.getLeft(), com.skype.android.widget.animator.MotionTween.Approximation.e));
        h.a("rect_position", track);
        h.a(new com.skype.android.widget.animator.Animator.OnCompletionListener() {

            final TabsPagerView a;

            public final void a()
            {
                TabsPagerView.d(a).post(new Runnable(this) {

                    final _cls1 a;

                    public final void run()
                    {
                        int i1 = 0;
                        while (i1 < TabsPagerView.a(a.a).size()) 
                        {
                            TextView textview = TabsPagerView.a(a.a, i1);
                            android.graphics.Typeface typeface;
                            if (i1 == TabsPagerView.b(a.a))
                            {
                                typeface = TabsPagerView.c(a.a).getBold(textview.getTextSize());
                            } else
                            {
                                typeface = TabsPagerView.c(a.a).getDefault(textview.getTextSize());
                            }
                            textview.setTypeface(typeface);
                            i1++;
                        }
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = TabsPagerView.this;
                super();
            }
        });
        h.a(System.currentTimeMillis());
        if (m > 0)
        {
            i1 = (a(m).getLeft() + a(m).getWidth() / 2) - getWidth() / 2;
        } else
        {
            i1 = 0;
        }
        smoothScrollTo(i1, 0);
        postInvalidate();
        for (i1 = ((flag) ? 1 : 0); i1 < i.size(); i1++)
        {
            d(i1);
        }

    }

    public void setEnabled(boolean flag)
    {
        j = flag;
    }

    public void setNotificationCount(int i1, int j1)
    {
        TextView textview = c(i1);
        byte byte0;
        if (j1 == 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        textview.setText(ViewUtil.a(j1));
        d(i1);
    }

    public void setOnItemClickListener(OnItemClickListener onitemclicklistener)
    {
        b = onitemclicklistener;
    }
}

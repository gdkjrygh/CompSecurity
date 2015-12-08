// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.play.widget.PulsatingDotDrawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class InterstitialOverlay extends FrameLayout
{

    public static final int DEFAULT_ACCENT_COLORS_RES_IDS[] = {
        0x7f0b027c, 0x7f0b027d, 0x7f0b027e, 0x7f0b027f
    };
    private static final int LAYOUT = 0x7f040120;
    private int mColors[];
    private List mDots;
    private final Random mRandom;

    public InterstitialOverlay(Context context)
    {
        this(context, null);
    }

    public InterstitialOverlay(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public InterstitialOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mRandom = new Random();
    }

    private void startAnimation()
    {
        for (Iterator iterator = mDots.iterator(); iterator.hasNext(); ((PulsatingDotDrawable)iterator.next()).start()) { }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mDots == null)
        {
            Object obj1 = new OnboardUtils.Predicate() {

                final InterstitialOverlay this$0;
                final String val$cellTag;

                public final volatile boolean apply(Object obj4)
                {
                    obj4 = (View)obj4;
                    return cellTag.equals(((View) (obj4)).getTag());
                }

            
            {
                this$0 = InterstitialOverlay.this;
                cellTag = s;
                super();
            }
            };
            Object obj = new ArrayList();
            ArrayList arraylist = new ArrayList();
            arraylist.add(this);
            do
            {
                if (arraylist.isEmpty())
                {
                    break;
                }
                Object obj2 = (View)arraylist.remove(0);
                if (((OnboardUtils.Predicate) (obj1)).apply(obj2))
                {
                    ((List) (obj)).add(obj2);
                }
                if (obj2 instanceof ViewGroup)
                {
                    obj2 = (ViewGroup)obj2;
                    int k = ((ViewGroup) (obj2)).getChildCount();
                    int i = 0;
                    while (i < k) 
                    {
                        arraylist.add(((ViewGroup) (obj2)).getChildAt(i));
                        i++;
                    }
                }
            } while (true);
            if (mColors == null || mColors.length == 0)
            {
                Object obj3 = getContext();
                int ai[] = DEFAULT_ACCENT_COLORS_RES_IDS;
                int ai1[] = new int[4];
                obj3 = ((Context) (obj3)).getResources();
                for (int j = 0; j < 4; j++)
                {
                    ai1[j] = ((Resources) (obj3)).getColor(ai[j]);
                }

                mColors = ai1;
            }
            ai = new ArrayList(((Collection) (obj)).size());
            obj = ((Collection) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                View view = (View)((Iterator) (obj)).next();
                PulsatingDotDrawable pulsatingdotdrawable = new PulsatingDotDrawable(mColors[mRandom.nextInt(mColors.length)], mRandom.nextInt(800));
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    view.setBackgroundDrawable(pulsatingdotdrawable);
                } else
                {
                    view.setBackground(pulsatingdotdrawable);
                }
                ai.add(pulsatingdotdrawable);
            }
            mDots = ai;
        }
        startAnimation();
    }

    protected void onDetachedFromWindow()
    {
        for (Iterator iterator = mDots.iterator(); iterator.hasNext(); ((PulsatingDotDrawable)iterator.next()).stop()) { }
        super.onDetachedFromWindow();
    }

}

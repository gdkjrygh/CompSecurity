// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.emojipicker;

import Gj;
import Gk;
import Go;
import Jo;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.snapchat.android.analytics.ui.EmojiPickerAnalytics;
import java.util.List;

public class EmojiPickerView extends LinearLayout
{

    public LinearLayout a;
    public ViewPager b;
    public Gk c;
    public List d;
    public Gj e;
    public EmojiPickerAnalytics f;
    private int g;
    private Context h;

    public EmojiPickerView(Context context)
    {
        this(context, null);
    }

    public EmojiPickerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EmojiPickerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        g = 0;
        inflate(context, 0x7f040070, this);
        h = context;
    }

    static int a(EmojiPickerView emojipickerview)
    {
        return emojipickerview.g;
    }

    static void a(EmojiPickerView emojipickerview, int i)
    {
        emojipickerview.a.getChildAt(i).setAlpha(0.2F);
    }

    static ViewPager b(EmojiPickerView emojipickerview)
    {
        return emojipickerview.b;
    }

    static void b(EmojiPickerView emojipickerview, int i)
    {
        emojipickerview.a.getChildAt(i).setAlpha(1.0F);
    }

    static int c(EmojiPickerView emojipickerview, int i)
    {
        emojipickerview.g = i;
        return i;
    }

    public final void a()
    {
        for (int i = 0; i < d.size(); i++)
        {
            ImageView imageview = new ImageView(getContext());
            imageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
            int j = (int)Jo.a(7F, h);
            imageview.setPadding(j, j, j, j);
            imageview.setId(((Go)d.get(i)).a);
            imageview.setImageResource(((Go)d.get(i)).b);
            imageview.setTag(Integer.valueOf(i));
            imageview.setAlpha(0.2F);
            imageview.setOnClickListener(new android.view.View.OnClickListener() {

                private EmojiPickerView a;

                public final void onClick(View view)
                {
                    int k = ((Integer)view.getTag()).intValue();
                    if (k != EmojiPickerView.a(a))
                    {
                        EmojiPickerView.b(a, k);
                        EmojiPickerView.a(a, EmojiPickerView.a(a));
                        EmojiPickerView.b(a).setCurrentItem(k);
                        return;
                    } else
                    {
                        ((RecyclerView)EmojiPickerView.b(a).findViewWithTag(Integer.valueOf(k))).b(0);
                        return;
                    }
                }

            
            {
                a = EmojiPickerView.this;
                super();
            }
            });
            a.addView(imageview);
        }

        b.setCurrentItem(1);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        e.a(b, g);
        b.setAdapter(e);
        b.setCurrentItem(g);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        View view = findViewById(0x7f0d02b5);
        return motionevent.getY() > (float)view.getHeight();
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
    }

    // Unreferenced inner class com/snapchat/android/ui/emojipicker/EmojiPickerView$1

/* anonymous class */
    public final class _cls1 extends android.support.v4.view.ViewPager.h
    {

        private EmojiPickerView a;

        public final void a(int i)
        {
            if (i != EmojiPickerView.a(a))
            {
                EmojiPickerView.a(a, EmojiPickerView.a(a));
                EmojiPickerView.b(a, i);
                EmojiPickerView.c(a, i);
            }
        }

            public 
            {
                a = EmojiPickerView.this;
                super();
            }
    }

}

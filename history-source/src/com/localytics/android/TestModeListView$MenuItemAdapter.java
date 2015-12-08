// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.localytics.android:
//            TestModeListView

class mContext extends BaseAdapter
{

    private final String MENU_ITEMS[] = {
        "Disable Test Mode", "Refresh", "Copy Push Token", "Copy Install ID"
    };
    private Context mContext;
    final TestModeListView this$0;

    private Drawable getShape(int i)
    {
        float f = getResources().getDisplayMetrics().density * 8F;
        GradientDrawable gradientdrawable = new GradientDrawable(android.graphics.drawable.R, new int[] {
            -1, -1, -1
        });
        gradientdrawable.setGradientType(0);
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            return gradientdrawable;

        case 0: // '\0'
            gradientdrawable.setCornerRadii(new float[] {
                f, f, f, f, 0.0F, 0.0F, 0.0F, 0.0F
            });
            return gradientdrawable;

        case 3: // '\003'
            gradientdrawable.setCornerRadii(new float[] {
                0.0F, 0.0F, 0.0F, 0.0F, f, f, f, f
            });
            break;
        }
        return gradientdrawable;
    }

    public int getCount()
    {
        return MENU_ITEMS.length;
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public String getItem(int i)
    {
        return MENU_ITEMS[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new LinearLayout(mContext);
            view.setLayoutParams(new android.widget.Adapter.mContext(-1, -2));
            view.setOrientation(1);
            int j = (int)(mContext.getResources().getDisplayMetrics().density * 6F + 0.5F);
            view.setPadding(0, j, 0, j);
            viewgroup = new TextView(mContext);
            viewgroup.setId(1);
            viewgroup.setTextSize(26F);
            viewgroup.setTextColor(Color.argb(255, 0, 91, 255));
            viewgroup.setGravity(17);
            view.addView(viewgroup);
            view.setBackground(getShape(i));
        }
        viewgroup = (TextView)view.findViewById(1);
        viewgroup.setText(MENU_ITEMS[i]);
        switch (i)
        {
        default:
            return view;

        case 0: // '\0'
            viewgroup.setTextColor(0xffff0000);
            break;
        }
        return view;
    }

    public (Context context)
    {
        this$0 = TestModeListView.this;
        super();
        mContext = context;
    }
}

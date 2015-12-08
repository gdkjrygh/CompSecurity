// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.support.v4.b.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.model.Interest;
import com.tinder.model.User;
import com.tinder.utils.ad;
import java.util.Iterator;
import java.util.List;

public class InterestsView extends LinearLayout
{

    private int mCellMargin;
    private android.widget.LinearLayout.LayoutParams mCellParams;
    private android.widget.LinearLayout.LayoutParams mRowParams;
    private Paint mTextPaint;
    private User mUser;

    public InterestsView(Context context)
    {
        super(context);
        init();
    }

    public InterestsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void addInterestCells(List list, boolean flag)
    {
        Context context = getContext();
        int l = ad.a(context) - context.getResources().getDimensionPixelSize(0x7f090110) * 2;
        int i = getChildCount();
        Object obj;
        Object obj1;
        Iterator iterator;
        if (i > 0)
        {
            obj = (LinearLayout)getChildAt(getChildCount() - 1);
        } else
        {
            obj = createRow();
        }
        if (i > 0)
        {
            obj1 = obj;
        } else
        {
            obj1 = null;
        }
        iterator = list.iterator();
        list = ((List) (obj));
        obj = obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Interest interest = (Interest)iterator.next();
            obj1 = (TextView)LayoutInflater.from(context).inflate(0x7f030025, list, false);
            ((TextView) (obj1)).setMaxWidth(l);
            ((TextView) (obj1)).setText(interest.name);
            if (!flag)
            {
                ((TextView) (obj1)).setTextColor(a.b(context, 0x7f0d0115));
                ((TextView) (obj1)).setBackgroundResource(0x7f020072);
            }
            int j = 0;
            int k = 0;
            for (; j < list.getChildCount(); j++)
            {
                k += getInterestCellWidth((TextView)list.getChildAt(j));
            }

            if (getInterestCellWidth(((TextView) (obj1))) + k > l && list.getChildCount() > 0)
            {
                list = createRow();
            }
            if (list.getChildCount() == 0)
            {
                list.addView(((android.view.View) (obj1)));
            } else
            {
                list.addView(((android.view.View) (obj1)), mCellParams);
            }
            if (list != obj)
            {
                addView(list, mRowParams);
                obj = list;
            }
        } while (true);
    }

    private LinearLayout createRow()
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        linearlayout.setOrientation(0);
        return linearlayout;
    }

    private int getInterestCellWidth(TextView textview)
    {
        mTextPaint.setTextSize(textview.getTextSize());
        mTextPaint.setTypeface(textview.getTypeface());
        return (int)((float)(int)((float)(textview.getPaddingLeft() + textview.getPaddingRight()) + mTextPaint.measureText(textview.getText().toString())) + ad.a(2.5F, getContext()));
    }

    private void init()
    {
        mTextPaint = new Paint();
        mCellMargin = (int)ad.a(5F, getContext());
        mCellParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        mCellParams.leftMargin = mCellMargin;
        mRowParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        mRowParams.bottomMargin = mCellMargin;
    }

    public void setUser(User user)
    {
        mUser = user;
        removeAllViews();
        addInterestCells(mUser.getCommonInterests(), true);
        addInterestCells(mUser.getUncommonInterests(), false);
    }
}

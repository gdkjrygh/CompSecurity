// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tinder.utils.v;

public class CustomDrawerLayout extends DrawerLayout
{

    private int mGravity;

    public CustomDrawerLayout(Context context)
    {
        super(context);
    }

    public CustomDrawerLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CustomDrawerLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void closeDrawer()
    {
        if (isDrawerOpen())
        {
            closeDrawer(mGravity);
        }
    }

    public int getGravity()
    {
        return mGravity;
    }

    public boolean isDrawerOpen()
    {
        return isDrawerOpen(mGravity);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.onInterceptTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            v.b(String.valueOf(motionevent));
            return false;
        }
        return flag;
    }

    public void openDrawer()
    {
        if (!isDrawerOpen())
        {
            openDrawer(mGravity);
        }
    }

    public void setDrawerShadow(int i)
    {
        setDrawerShadow(i, mGravity);
    }

    public void setGravity(int i)
    {
        mGravity = i;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.ui.CheckableLinearLayout;

public class EnterpriseInviteItemView extends CheckableLinearLayout
{

    final List checkableList;

    public EnterpriseInviteItemView(Context context)
    {
        super(context);
        checkableList = new ArrayList();
    }

    public EnterpriseInviteItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        checkableList = new ArrayList();
    }

    public EnterpriseInviteItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        checkableList = new ArrayList();
    }

    void findCheckableViews(View view)
    {
        if (view instanceof Checkable)
        {
            checkableList.add((Checkable)view);
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i = 0; i < view.getChildCount(); i++)
            {
                findCheckableViews(view.getChildAt(i));
            }

        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        checkableList.clear();
        for (int i = 0; i < getChildCount(); i++)
        {
            findCheckableViews(getChildAt(i));
        }

    }

    public void setChecked(boolean flag)
    {
        super.setChecked(flag);
        for (Iterator iterator = checkableList.iterator(); iterator.hasNext(); ((Checkable)iterator.next()).setChecked(flag)) { }
    }
}

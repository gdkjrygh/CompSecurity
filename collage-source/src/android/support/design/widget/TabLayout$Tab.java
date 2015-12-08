// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintManager;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            TabLayout

public static final class mParent
{

    public static final int INVALID_POSITION = -1;
    private CharSequence mContentDesc;
    private View mCustomView;
    private Drawable mIcon;
    private final TabLayout mParent;
    private int mPosition;
    private Object mTag;
    private CharSequence mText;

    public CharSequence getContentDescription()
    {
        return mContentDesc;
    }

    public View getCustomView()
    {
        return mCustomView;
    }

    public Drawable getIcon()
    {
        return mIcon;
    }

    public int getPosition()
    {
        return mPosition;
    }

    public Object getTag()
    {
        return mTag;
    }

    public CharSequence getText()
    {
        return mText;
    }

    public boolean isSelected()
    {
        return mParent.getSelectedTabPosition() == mPosition;
    }

    public void select()
    {
        mParent.selectTab(this);
    }

    public ctTab setContentDescription(int i)
    {
        return setContentDescription(mParent.getResources().getText(i));
    }

    public esources setContentDescription(CharSequence charsequence)
    {
        mContentDesc = charsequence;
        if (mPosition >= 0)
        {
            TabLayout.access$100(mParent, mPosition);
        }
        return this;
    }

    public mPosition setCustomView(int i)
    {
        iew iew = TabLayout.access$200(mParent, mPosition);
        return setCustomView(LayoutInflater.from(iew.getContext()).inflate(i, iew, false));
    }

    public iew.getContext setCustomView(View view)
    {
        mCustomView = view;
        if (mPosition >= 0)
        {
            TabLayout.access$100(mParent, mPosition);
        }
        return this;
    }

    public mPosition setIcon(int i)
    {
        return setIcon(TintManager.getDrawable(mParent.getContext(), i));
    }

    public ontext setIcon(Drawable drawable)
    {
        mIcon = drawable;
        if (mPosition >= 0)
        {
            TabLayout.access$100(mParent, mPosition);
        }
        return this;
    }

    void setPosition(int i)
    {
        mPosition = i;
    }

    public mPosition setTag(Object obj)
    {
        mTag = obj;
        return this;
    }

    public mTag setText(int i)
    {
        return setText(mParent.getResources().getText(i));
    }

    public esources setText(CharSequence charsequence)
    {
        mText = charsequence;
        if (mPosition >= 0)
        {
            TabLayout.access$100(mParent, mPosition);
        }
        return this;
    }


    iew(TabLayout tablayout)
    {
        mPosition = -1;
        mParent = tablayout;
    }
}

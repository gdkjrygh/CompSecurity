// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.TintManager;
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

    public final CharSequence getContentDescription()
    {
        return mContentDesc;
    }

    final View getCustomView()
    {
        return mCustomView;
    }

    public final Drawable getIcon()
    {
        return mIcon;
    }

    public final int getPosition()
    {
        return mPosition;
    }

    public final Object getTag()
    {
        return mTag;
    }

    public final CharSequence getText()
    {
        return mText;
    }

    public final boolean isSelected()
    {
        return mParent.getSelectedTabPosition() == mPosition;
    }

    public final void select()
    {
        mParent.selectTab(this);
    }

    public final ctTab setContentDescription(int i)
    {
        return setContentDescription(mParent.getResources().getText(i));
    }

    public final esources setContentDescription(CharSequence charsequence)
    {
        mContentDesc = charsequence;
        if (mPosition >= 0)
        {
            TabLayout.access$100(mParent, mPosition);
        }
        return this;
    }

    public final mPosition setCustomView(int i)
    {
        return setCustomView(LayoutInflater.from(mParent.getContext()).inflate(i, null));
    }

    public final ontext setCustomView(View view)
    {
        mCustomView = view;
        if (mPosition >= 0)
        {
            TabLayout.access$100(mParent, mPosition);
        }
        return this;
    }

    public final mPosition setIcon(int i)
    {
        return setIcon(TintManager.getDrawable(mParent.getContext(), i));
    }

    public final ontext setIcon(Drawable drawable)
    {
        mIcon = drawable;
        if (mPosition >= 0)
        {
            TabLayout.access$100(mParent, mPosition);
        }
        return this;
    }

    final void setPosition(int i)
    {
        mPosition = i;
    }

    public final mPosition setTag(Object obj)
    {
        mTag = obj;
        return this;
    }

    public final mTag setText(int i)
    {
        return setText(mParent.getResources().getText(i));
    }

    public final esources setText(CharSequence charsequence)
    {
        mText = charsequence;
        if (mPosition >= 0)
        {
            TabLayout.access$100(mParent, mPosition);
        }
        return this;
    }


    er(TabLayout tablayout)
    {
        mPosition = -1;
        mParent = tablayout;
    }
}

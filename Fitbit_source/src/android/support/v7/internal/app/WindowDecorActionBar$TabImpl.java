// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.support.v7.internal.widget.TintManager;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.v7.internal.app:
//            WindowDecorActionBar

public class mPosition extends android.support.v7.app..TabImpl
{

    private android.support.v7.app..TabImpl.mPosition mCallback;
    private CharSequence mContentDesc;
    private View mCustomView;
    private Drawable mIcon;
    private int mPosition;
    private Object mTag;
    private CharSequence mText;
    final WindowDecorActionBar this$0;

    public android.support.v7.app..TabImpl getCallback()
    {
        return mCallback;
    }

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

    public void select()
    {
        selectTab(this);
    }

    public android.support.v7.app..TabImpl setContentDescription(int i)
    {
        return setContentDescription(WindowDecorActionBar.access$1200(WindowDecorActionBar.this).getResources().getText(i));
    }

    public android.support.v7.app..TabImpl setContentDescription(CharSequence charsequence)
    {
        mContentDesc = charsequence;
        if (mPosition >= 0)
        {
            WindowDecorActionBar.access$1300(WindowDecorActionBar.this).updateTab(mPosition);
        }
        return this;
    }

    public android.support.v7.app..TabImpl setCustomView(int i)
    {
        return setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, null));
    }

    public android.support.v7.app..TabImpl setCustomView(View view)
    {
        mCustomView = view;
        if (mPosition >= 0)
        {
            WindowDecorActionBar.access$1300(WindowDecorActionBar.this).updateTab(mPosition);
        }
        return this;
    }

    public android.support.v7.app..TabImpl setIcon(int i)
    {
        return setIcon(getTintManager().getDrawable(i));
    }

    public android.support.v7.app..TabImpl setIcon(Drawable drawable)
    {
        mIcon = drawable;
        if (mPosition >= 0)
        {
            WindowDecorActionBar.access$1300(WindowDecorActionBar.this).updateTab(mPosition);
        }
        return this;
    }

    public void setPosition(int i)
    {
        mPosition = i;
    }

    public android.support.v7.app..TabImpl setTabListener(android.support.v7.app..TabImpl tabimpl)
    {
        mCallback = tabimpl;
        return this;
    }

    public android.support.v7.app..TabImpl setTag(Object obj)
    {
        mTag = obj;
        return this;
    }

    public android.support.v7.app..TabImpl setText(int i)
    {
        return setText(WindowDecorActionBar.access$1200(WindowDecorActionBar.this).getResources().getText(i));
    }

    public android.support.v7.app..TabImpl setText(CharSequence charsequence)
    {
        mText = charsequence;
        if (mPosition >= 0)
        {
            WindowDecorActionBar.access$1300(WindowDecorActionBar.this).updateTab(mPosition);
        }
        return this;
    }

    public ()
    {
        this$0 = WindowDecorActionBar.this;
        super();
        mPosition = -1;
    }
}

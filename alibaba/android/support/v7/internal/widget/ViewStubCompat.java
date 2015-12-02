// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View
{
    public static interface OnInflateListener
    {

        public abstract void onInflate(ViewStubCompat viewstubcompat, View view);
    }


    private OnInflateListener mInflateListener;
    private int mInflatedId;
    private WeakReference mInflatedViewRef;
    private LayoutInflater mInflater;
    private int mLayoutResource;

    public ViewStubCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mLayoutResource = 0;
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ViewStubCompat, i, 0);
        mInflatedId = context.getResourceId(android.support.v7.appcompat.R.styleable.ViewStubCompat_android_inflatedId, -1);
        mLayoutResource = context.getResourceId(android.support.v7.appcompat.R.styleable.ViewStubCompat_android_layout, 0);
        setId(context.getResourceId(android.support.v7.appcompat.R.styleable.ViewStubCompat_android_id, -1));
        context.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    protected void dispatchDraw(Canvas canvas)
    {
    }

    public void draw(Canvas canvas)
    {
    }

    public int getInflatedId()
    {
        return mInflatedId;
    }

    public LayoutInflater getLayoutInflater()
    {
        return mInflater;
    }

    public int getLayoutResource()
    {
        return mLayoutResource;
    }

    public View inflate()
    {
        Object obj = getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            if (mLayoutResource != 0)
            {
                ViewGroup viewgroup = (ViewGroup)obj;
                android.view.ViewGroup.LayoutParams layoutparams;
                int i;
                if (mInflater != null)
                {
                    obj = mInflater;
                } else
                {
                    obj = LayoutInflater.from(getContext());
                }
                obj = ((LayoutInflater) (obj)).inflate(mLayoutResource, viewgroup, false);
                if (mInflatedId != -1)
                {
                    ((View) (obj)).setId(mInflatedId);
                }
                i = viewgroup.indexOfChild(this);
                viewgroup.removeViewInLayout(this);
                layoutparams = getLayoutParams();
                if (layoutparams != null)
                {
                    viewgroup.addView(((View) (obj)), i, layoutparams);
                } else
                {
                    viewgroup.addView(((View) (obj)), i);
                }
                mInflatedViewRef = new WeakReference(obj);
                if (mInflateListener != null)
                {
                    mInflateListener.onInflate(this, ((View) (obj)));
                }
                return ((View) (obj));
            } else
            {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
        } else
        {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i)
    {
        mInflatedId = i;
    }

    public void setLayoutInflater(LayoutInflater layoutinflater)
    {
        mInflater = layoutinflater;
    }

    public void setLayoutResource(int i)
    {
        mLayoutResource = i;
    }

    public void setOnInflateListener(OnInflateListener oninflatelistener)
    {
        mInflateListener = oninflatelistener;
    }

    public void setVisibility(int i)
    {
        if (mInflatedViewRef == null) goto _L2; else goto _L1
_L1:
        View view = (View)mInflatedViewRef.get();
        if (view == null) goto _L4; else goto _L3
_L3:
        view.setVisibility(i);
_L6:
        return;
_L4:
        throw new IllegalStateException("setVisibility called on un-referenced view");
_L2:
        super.setVisibility(i);
        if (i == 0 || i == 4)
        {
            inflate();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}

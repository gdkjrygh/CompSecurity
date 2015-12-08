// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.x;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, m, f, h, 
//            p

public abstract class b
    implements l
{

    private l.a mCallback;
    public Context mContext;
    private int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    public f mMenu;
    private int mMenuLayoutRes;
    public m mMenuView;
    public Context mSystemContext;
    protected LayoutInflater mSystemInflater;

    public b(Context context, int i, int j)
    {
        mSystemContext = context;
        mSystemInflater = LayoutInflater.from(context);
        mMenuLayoutRes = i;
        mItemLayoutRes = j;
    }

    protected void addItemView(View view, int i)
    {
        ViewGroup viewgroup = (ViewGroup)view.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(view);
        }
        ((ViewGroup)mMenuView).addView(view, i);
    }

    public abstract void bindItemView(h h1, m.a a);

    public boolean collapseItemActionView(f f1, h h1)
    {
        return false;
    }

    public m.a createItemView(ViewGroup viewgroup)
    {
        return (m.a)mSystemInflater.inflate(mItemLayoutRes, viewgroup, false);
    }

    public boolean expandItemActionView(f f1, h h1)
    {
        return false;
    }

    public boolean filterLeftoverView(ViewGroup viewgroup, int i)
    {
        viewgroup.removeViewAt(i);
        return true;
    }

    public boolean flagActionItems()
    {
        return false;
    }

    public l.a getCallback()
    {
        return mCallback;
    }

    public int getId()
    {
        return mId;
    }

    public View getItemView(h h1, View view, ViewGroup viewgroup)
    {
        if (view instanceof m.a)
        {
            view = (m.a)view;
        } else
        {
            view = createItemView(viewgroup);
        }
        bindItemView(h1, view);
        return (View)view;
    }

    public m getMenuView(ViewGroup viewgroup)
    {
        if (mMenuView == null)
        {
            mMenuView = (m)mSystemInflater.inflate(mMenuLayoutRes, viewgroup, false);
            mMenuView.initialize(mMenu);
            updateMenuView(true);
        }
        return mMenuView;
    }

    public void initForMenu(Context context, f f1)
    {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mMenu = f1;
    }

    public void onCloseMenu(f f1, boolean flag)
    {
        if (mCallback != null)
        {
            mCallback.onCloseMenu(f1, flag);
        }
    }

    public boolean onSubMenuSelected(p p)
    {
        if (mCallback != null)
        {
            return mCallback.onOpenSubMenu(p);
        } else
        {
            return false;
        }
    }

    public void setCallback(l.a a)
    {
        mCallback = a;
    }

    public void setId(int i)
    {
        mId = i;
    }

    public boolean shouldIncludeItem(int i, h h1)
    {
        return true;
    }

    public void updateMenuView(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)mMenuView;
        if (viewgroup != null)
        {
            int j;
            if (mMenu != null)
            {
                mMenu.i();
                ArrayList arraylist = mMenu.h();
                int i1 = arraylist.size();
                int k = 0;
                int i = 0;
                do
                {
                    j = i;
                    if (k >= i1)
                    {
                        break;
                    }
                    h h2 = (h)arraylist.get(k);
                    if (shouldIncludeItem(i, h2))
                    {
                        View view = viewgroup.getChildAt(i);
                        h h1;
                        View view1;
                        if (view instanceof m.a)
                        {
                            h1 = ((m.a)view).getItemData();
                        } else
                        {
                            h1 = null;
                        }
                        view1 = getItemView(h2, view, viewgroup);
                        if (h2 != h1)
                        {
                            view1.setPressed(false);
                            x.y(view1);
                        }
                        if (view1 != view)
                        {
                            addItemView(view1, i);
                        }
                        i++;
                    }
                    k++;
                } while (true);
            } else
            {
                j = 0;
            }
            while (j < viewgroup.getChildCount()) 
            {
                if (!filterLeftoverView(viewgroup, j))
                {
                    j++;
                }
            }
        }
    }
}

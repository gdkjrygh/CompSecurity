// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.widget.ListPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, f, p, h, 
//            m, ListMenuItemView

public class k
    implements l, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{
    private final class a extends BaseAdapter
    {

        final k a;
        private f b;
        private int c;

        static f a(a a1)
        {
            return a1.b;
        }

        private void a()
        {
            h h1 = a.mMenu.j;
            if (h1 != null)
            {
                ArrayList arraylist = a.mMenu.j();
                int j = arraylist.size();
                for (int i = 0; i < j; i++)
                {
                    if ((h)arraylist.get(i) == h1)
                    {
                        c = i;
                        return;
                    }
                }

            }
            c = -1;
        }

        public final h a(int i)
        {
            ArrayList arraylist;
            int j;
            if (a.mOverflowOnly)
            {
                arraylist = b.j();
            } else
            {
                arraylist = b.h();
            }
            j = i;
            if (c >= 0)
            {
                j = i;
                if (i >= c)
                {
                    j = i + 1;
                }
            }
            return (h)arraylist.get(j);
        }

        public final int getCount()
        {
            ArrayList arraylist;
            if (a.mOverflowOnly)
            {
                arraylist = b.j();
            } else
            {
                arraylist = b.h();
            }
            if (c < 0)
            {
                return arraylist.size();
            } else
            {
                return arraylist.size() - 1;
            }
        }

        public final Object getItem(int i)
        {
            return a(i);
        }

        public final long getItemId(int i)
        {
            return (long)i;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = a.mInflater.inflate(k.ITEM_LAYOUT, viewgroup, false);
            }
            viewgroup = (m.a)view;
            if (a.mForceShowIcon)
            {
                ((ListMenuItemView)view).setForceShowIcon(true);
            }
            viewgroup.a(a(i));
            return view;
        }

        public final void notifyDataSetChanged()
        {
            a();
            super.notifyDataSetChanged();
        }

        public a(f f1)
        {
            a = k.this;
            super();
            c = -1;
            b = f1;
            a();
        }
    }


    static final int ITEM_LAYOUT;
    private static final String TAG = "MenuPopupHelper";
    private final a mAdapter;
    private View mAnchorView;
    private int mContentWidth;
    private final Context mContext;
    private int mDropDownGravity;
    boolean mForceShowIcon;
    private boolean mHasContentWidth;
    private final LayoutInflater mInflater;
    private ViewGroup mMeasureParent;
    private final f mMenu;
    private final boolean mOverflowOnly;
    private ListPopupWindow mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private l.a mPresenterCallback;
    private ViewTreeObserver mTreeObserver;

    public k(Context context, f f1)
    {
        this(context, f1, null, false, android.support.v7.appcompat.R.attr.popupMenuStyle);
    }

    public k(Context context, f f1, View view)
    {
        this(context, f1, view, false, android.support.v7.appcompat.R.attr.popupMenuStyle);
    }

    public k(Context context, f f1, View view, boolean flag, int i)
    {
        this(context, f1, view, flag, i, 0);
    }

    public k(Context context, f f1, View view, boolean flag, int i, int j)
    {
        mDropDownGravity = 0;
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mMenu = f1;
        mAdapter = new a(mMenu);
        mOverflowOnly = flag;
        mPopupStyleAttr = i;
        mPopupStyleRes = j;
        Resources resources = context.getResources();
        mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
        mAnchorView = view;
        f1.a(this, context);
    }

    private int measureContentWidth()
    {
        a a1 = mAdapter;
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = a1.getCount();
        int j = 0;
        int i1 = 0;
        View view = null;
        int i = 0;
        do
        {
            int j1;
label0:
            {
                j1 = i;
                if (j < i2)
                {
                    j1 = a1.getItemViewType(j);
                    if (j1 != i1)
                    {
                        i1 = j1;
                        view = null;
                    }
                    if (mMeasureParent == null)
                    {
                        mMeasureParent = new FrameLayout(mContext);
                    }
                    view = a1.getView(j, view, mMeasureParent);
                    view.measure(k1, l1);
                    j1 = view.getMeasuredWidth();
                    if (j1 < mPopupMaxWidth)
                    {
                        break label0;
                    }
                    j1 = mPopupMaxWidth;
                }
                return j1;
            }
            if (j1 > i)
            {
                i = j1;
            }
            j++;
        } while (true);
    }

    public boolean collapseItemActionView(f f1, h h)
    {
        return false;
    }

    public void dismiss()
    {
        if (isShowing())
        {
            mPopup.dismiss();
        }
    }

    public boolean expandItemActionView(f f1, h h)
    {
        return false;
    }

    public boolean flagActionItems()
    {
        return false;
    }

    public int getGravity()
    {
        return mDropDownGravity;
    }

    public int getId()
    {
        return 0;
    }

    public m getMenuView(ViewGroup viewgroup)
    {
        throw new UnsupportedOperationException("MenuPopupHelpers manage their own views");
    }

    public ListPopupWindow getPopup()
    {
        return mPopup;
    }

    public void initForMenu(Context context, f f1)
    {
    }

    public boolean isShowing()
    {
        return mPopup != null && mPopup.isShowing();
    }

    public void onCloseMenu(f f1, boolean flag)
    {
        if (f1 == mMenu)
        {
            dismiss();
            if (mPresenterCallback != null)
            {
                mPresenterCallback.onCloseMenu(f1, flag);
                return;
            }
        }
    }

    public void onDismiss()
    {
        mPopup = null;
        mMenu.close();
        if (mTreeObserver != null)
        {
            if (!mTreeObserver.isAlive())
            {
                mTreeObserver = mAnchorView.getViewTreeObserver();
            }
            mTreeObserver.removeGlobalOnLayoutListener(this);
            mTreeObserver = null;
        }
    }

    public void onGlobalLayout()
    {
        if (isShowing())
        {
            View view = mAnchorView;
            if (view == null || !view.isShown())
            {
                dismiss();
            } else
            if (isShowing())
            {
                mPopup.show();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        adapterview = mAdapter;
        a.a(adapterview).a(adapterview.a(i), null, 0);
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i == 82)
        {
            dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    }

    public Parcelable onSaveInstanceState()
    {
        return null;
    }

    public boolean onSubMenuSelected(p p1)
    {
        if (!p1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        k k1;
        int i;
        int j;
        k1 = new k(mContext, p1, mAnchorView);
        k1.setCallback(mPresenterCallback);
        j = p1.size();
        i = 0;
_L5:
        MenuItem menuitem;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        menuitem = p1.getItem(i);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        k1.setForceShowIcon(flag);
        if (k1.tryShow())
        {
            if (mPresenterCallback != null)
            {
                mPresenterCallback.onOpenSubMenu(p1);
            }
            return true;
        }
          goto _L2
_L4:
        i++;
          goto _L5
_L2:
        return false;
        flag = false;
          goto _L6
    }

    public void setAnchorView(View view)
    {
        mAnchorView = view;
    }

    public void setCallback(l.a a1)
    {
        mPresenterCallback = a1;
    }

    public void setForceShowIcon(boolean flag)
    {
        mForceShowIcon = flag;
    }

    public void setGravity(int i)
    {
        mDropDownGravity = i;
    }

    public void show()
    {
        if (!tryShow())
        {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        } else
        {
            return;
        }
    }

    public boolean tryShow()
    {
        boolean flag = false;
        mPopup = new ListPopupWindow(mContext, null, mPopupStyleAttr, mPopupStyleRes);
        mPopup.setOnDismissListener(this);
        mPopup.setOnItemClickListener(this);
        mPopup.setAdapter(mAdapter);
        mPopup.setModal(true);
        View view = mAnchorView;
        if (view != null)
        {
            if (mTreeObserver == null)
            {
                flag = true;
            }
            mTreeObserver = view.getViewTreeObserver();
            if (flag)
            {
                mTreeObserver.addOnGlobalLayoutListener(this);
            }
            mPopup.setAnchorView(view);
            mPopup.setDropDownGravity(mDropDownGravity);
            if (!mHasContentWidth)
            {
                mContentWidth = measureContentWidth();
                mHasContentWidth = true;
            }
            mPopup.setContentWidth(mContentWidth);
            mPopup.setInputMethodMode(2);
            mPopup.show();
            mPopup.getListView().setOnKeyListener(this);
            return true;
        } else
        {
            return false;
        }
    }

    public void updateMenuView(boolean flag)
    {
        mHasContentWidth = false;
        if (mAdapter != null)
        {
            mAdapter.notifyDataSetChanged();
        }
    }

    static 
    {
        ITEM_LAYOUT = android.support.v7.appcompat.R.layout.abc_popup_menu_item_layout;
    }



}

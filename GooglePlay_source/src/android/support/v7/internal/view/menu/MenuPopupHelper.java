// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.PopupWindow;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuPresenter, MenuBuilder, SubMenuBuilder, MenuItemImpl, 
//            ListMenuItemView

public class MenuPopupHelper
    implements MenuPresenter, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{
    private final class MenuAdapter extends BaseAdapter
    {

        private MenuBuilder mAdapterMenu;
        private int mExpandedIndex;
        final MenuPopupHelper this$0;

        private void findExpandedIndex()
        {
            MenuItemImpl menuitemimpl = mMenu.mExpandedItem;
            if (menuitemimpl != null)
            {
                ArrayList arraylist = mMenu.getNonActionItems();
                int j = arraylist.size();
                for (int i = 0; i < j; i++)
                {
                    if ((MenuItemImpl)arraylist.get(i) == menuitemimpl)
                    {
                        mExpandedIndex = i;
                        return;
                    }
                }

            }
            mExpandedIndex = -1;
        }

        public final int getCount()
        {
            ArrayList arraylist;
            if (mOverflowOnly)
            {
                arraylist = mAdapterMenu.getNonActionItems();
            } else
            {
                arraylist = mAdapterMenu.getVisibleItems();
            }
            if (mExpandedIndex < 0)
            {
                return arraylist.size();
            } else
            {
                return arraylist.size() - 1;
            }
        }

        public final MenuItemImpl getItem(int i)
        {
            ArrayList arraylist;
            int j;
            if (mOverflowOnly)
            {
                arraylist = mAdapterMenu.getNonActionItems();
            } else
            {
                arraylist = mAdapterMenu.getVisibleItems();
            }
            j = i;
            if (mExpandedIndex >= 0)
            {
                j = i;
                if (i >= mExpandedIndex)
                {
                    j = i + 1;
                }
            }
            return (MenuItemImpl)arraylist.get(j);
        }

        public final volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public final long getItemId(int i)
        {
            return (long)i;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = mInflater.inflate(0x7f040010, viewgroup, false);
            }
            view = (MenuView.ItemView)view1;
            if (mForceShowIcon)
            {
                viewgroup = (ListMenuItemView)view1;
                viewgroup.mForceShowIcon = true;
                viewgroup.mPreserveIconSpacing = true;
            }
            view.initialize$6b732f7b(getItem(i));
            return view1;
        }

        public final void notifyDataSetChanged()
        {
            findExpandedIndex();
            super.notifyDataSetChanged();
        }


        public MenuAdapter(MenuBuilder menubuilder)
        {
            this$0 = MenuPopupHelper.this;
            super();
            mExpandedIndex = -1;
            mAdapterMenu = menubuilder;
            findExpandedIndex();
        }
    }


    static final int ITEM_LAYOUT = 0x7f040010;
    private final MenuAdapter mAdapter;
    public View mAnchorView;
    private int mContentWidth;
    private final Context mContext;
    public int mDropDownGravity;
    public boolean mForceShowIcon;
    private boolean mHasContentWidth;
    private final LayoutInflater mInflater;
    private ViewGroup mMeasureParent;
    private final MenuBuilder mMenu;
    private final boolean mOverflowOnly;
    public ListPopupWindow mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    public MenuPresenter.Callback mPresenterCallback;
    private ViewTreeObserver mTreeObserver;

    public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view)
    {
        this(context, menubuilder, view, false, 0x7f010127);
    }

    public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view, boolean flag, int i)
    {
        this(context, menubuilder, view, flag, i, 0);
    }

    public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view, boolean flag, int i, int j)
    {
        mDropDownGravity = 0;
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mMenu = menubuilder;
        mAdapter = new MenuAdapter(mMenu);
        mOverflowOnly = flag;
        mPopupStyleAttr = i;
        mPopupStyleRes = 0;
        Resources resources = context.getResources();
        mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(0x7f0c0014));
        mAnchorView = view;
        menubuilder.addMenuPresenter(this, context);
    }

    public final boolean collapseItemActionView$29f2911(MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public final void dismiss()
    {
        if (isShowing())
        {
            mPopup.dismiss();
        }
    }

    public final boolean expandItemActionView$29f2911(MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public final boolean flagActionItems()
    {
        return false;
    }

    public final void initForMenu(Context context, MenuBuilder menubuilder)
    {
    }

    public final boolean isShowing()
    {
        return mPopup != null && mPopup.mPopup.isShowing();
    }

    public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (menubuilder == mMenu)
        {
            dismiss();
            if (mPresenterCallback != null)
            {
                mPresenterCallback.onCloseMenu(menubuilder, flag);
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

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = mAdapter;
        ((MenuAdapter) (adapterview)).mAdapterMenu.performItemAction(adapterview.getItem(i), null, 0);
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

    public final boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        if (submenubuilder.hasVisibleItems())
        {
            MenuPopupHelper menupopuphelper = new MenuPopupHelper(mContext, submenubuilder, mAnchorView);
            menupopuphelper.mPresenterCallback = mPresenterCallback;
            boolean flag1 = false;
            int j = submenubuilder.size();
            int i = 0;
label0:
            do
            {
label1:
                {
                    boolean flag = flag1;
                    if (i < j)
                    {
                        MenuItem menuitem = submenubuilder.getItem(i);
                        if (!menuitem.isVisible() || menuitem.getIcon() == null)
                        {
                            break label1;
                        }
                        flag = true;
                    }
                    menupopuphelper.mForceShowIcon = flag;
                    if (menupopuphelper.tryShow())
                    {
                        if (mPresenterCallback != null)
                        {
                            mPresenterCallback.onOpenSubMenu(submenubuilder);
                        }
                        return true;
                    }
                    break label0;
                }
                i++;
            } while (true);
        }
        return false;
    }

    public final void show()
    {
        if (!tryShow())
        {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        } else
        {
            return;
        }
    }

    public final boolean tryShow()
    {
        View view;
        mPopup = new ListPopupWindow(mContext, null, mPopupStyleAttr, mPopupStyleRes);
        mPopup.setOnDismissListener(this);
        mPopup.mItemClickListener = this;
        mPopup.setAdapter(mAdapter);
        mPopup.setModal$1385ff();
        view = mAnchorView;
        if (view == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int l;
        Object obj;
        int k;
        int i1;
        int j1;
        int k1;
        if (mTreeObserver == null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        mTreeObserver = view.getViewTreeObserver();
        if (i != 0)
        {
            mTreeObserver.addOnGlobalLayoutListener(this);
        }
        mPopup.mDropDownAnchorView = view;
        mPopup.mDropDownGravity = mDropDownGravity;
        if (mHasContentWidth) goto _L4; else goto _L3
_L3:
        obj = mAdapter;
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        k1 = ((ListAdapter) (obj)).getCount();
        j = 0;
        k = 0;
        view = null;
        i = 0;
_L10:
        l = i;
        if (j >= k1) goto _L6; else goto _L5
_L5:
        l = ((ListAdapter) (obj)).getItemViewType(j);
        if (l != k)
        {
            k = l;
            view = null;
        }
        if (mMeasureParent == null)
        {
            mMeasureParent = new FrameLayout(mContext);
        }
        view = ((ListAdapter) (obj)).getView(j, view, mMeasureParent);
        view.measure(i1, j1);
        l = view.getMeasuredWidth();
        if (l < mPopupMaxWidth) goto _L8; else goto _L7
_L7:
        l = mPopupMaxWidth;
_L6:
        mContentWidth = l;
        mHasContentWidth = true;
_L4:
        ListPopupWindow listpopupwindow = mPopup;
        i = mContentWidth;
        obj = listpopupwindow.mPopup.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(listpopupwindow.mTempRect);
            listpopupwindow.mDropDownWidth = i + (listpopupwindow.mTempRect.left + listpopupwindow.mTempRect.right);
        } else
        {
            listpopupwindow.mDropDownWidth = i;
        }
        mPopup.mPopup.setInputMethodMode(2);
        mPopup.show();
        mPopup.mDropDownList.setOnKeyListener(this);
        return true;
_L2:
        return false;
_L8:
        if (l > i)
        {
            i = l;
        }
        j++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void updateMenuView(boolean flag)
    {
        mHasContentWidth = false;
        mAdapter.notifyDataSetChanged();
    }




}

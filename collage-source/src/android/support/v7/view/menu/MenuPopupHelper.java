// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view.menu;

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

// Referenced classes of package android.support.v7.view.menu:
//            MenuPresenter, MenuBuilder, SubMenuBuilder, MenuItemImpl, 
//            MenuView, ListMenuItemView

public class MenuPopupHelper
    implements MenuPresenter, android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{
    private class MenuAdapter extends BaseAdapter
    {

        private MenuBuilder mAdapterMenu;
        private int mExpandedIndex;
        final MenuPopupHelper this$0;

        void findExpandedIndex()
        {
            MenuItemImpl menuitemimpl = mMenu.getExpandedItem();
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

        public int getCount()
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

        public MenuItemImpl getItem(int i)
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

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = mInflater.inflate(MenuPopupHelper.ITEM_LAYOUT, viewgroup, false);
            }
            viewgroup = (MenuView.ItemView)view;
            if (mForceShowIcon)
            {
                ((ListMenuItemView)view).setForceShowIcon(true);
            }
            viewgroup.initialize(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged()
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


    static final int ITEM_LAYOUT;
    private static final String TAG = "MenuPopupHelper";
    private final MenuAdapter mAdapter;
    private View mAnchorView;
    private int mContentWidth;
    private final Context mContext;
    private int mDropDownGravity;
    boolean mForceShowIcon;
    private boolean mHasContentWidth;
    private final LayoutInflater mInflater;
    private ViewGroup mMeasureParent;
    private final MenuBuilder mMenu;
    private final boolean mOverflowOnly;
    private ListPopupWindow mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private MenuPresenter.Callback mPresenterCallback;
    private ViewTreeObserver mTreeObserver;

    public MenuPopupHelper(Context context, MenuBuilder menubuilder)
    {
        this(context, menubuilder, null, false, android.support.v7.appcompat.R.attr.popupMenuStyle);
    }

    public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view)
    {
        this(context, menubuilder, view, false, android.support.v7.appcompat.R.attr.popupMenuStyle);
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
        mPopupStyleRes = j;
        Resources resources = context.getResources();
        mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
        mAnchorView = view;
        menubuilder.addMenuPresenter(this, context);
    }

    private int measureContentWidth()
    {
        MenuAdapter menuadapter = mAdapter;
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int k1 = menuadapter.getCount();
        int j = 0;
        int k = 0;
        View view = null;
        int i = 0;
        do
        {
            int l;
label0:
            {
                l = i;
                if (j < k1)
                {
                    l = menuadapter.getItemViewType(j);
                    if (l != k)
                    {
                        k = l;
                        view = null;
                    }
                    if (mMeasureParent == null)
                    {
                        mMeasureParent = new FrameLayout(mContext);
                    }
                    view = menuadapter.getView(j, view, mMeasureParent);
                    view.measure(i1, j1);
                    l = view.getMeasuredWidth();
                    if (l < mPopupMaxWidth)
                    {
                        break label0;
                    }
                    l = mPopupMaxWidth;
                }
                return l;
            }
            if (l > i)
            {
                i = l;
            }
            j++;
        } while (true);
    }

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
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

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
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

    public MenuView getMenuView(ViewGroup viewgroup)
    {
        throw new UnsupportedOperationException("MenuPopupHelpers manage their own views");
    }

    public ListPopupWindow getPopup()
    {
        return mPopup;
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
    }

    public boolean isShowing()
    {
        return mPopup != null && mPopup.isShowing();
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
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
        ((MenuAdapter) (adapterview)).mAdapterMenu.performItemAction(adapterview.getItem(i), 0);
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

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        if (!submenubuilder.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        MenuPopupHelper menupopuphelper;
        int i;
        int j;
        menupopuphelper = new MenuPopupHelper(mContext, submenubuilder, mAnchorView);
        menupopuphelper.setCallback(mPresenterCallback);
        j = submenubuilder.size();
        i = 0;
_L5:
        MenuItem menuitem;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        menuitem = submenubuilder.getItem(i);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        menupopuphelper.setForceShowIcon(flag);
        if (menupopuphelper.tryShow())
        {
            if (mPresenterCallback != null)
            {
                mPresenterCallback.onOpenSubMenu(submenubuilder);
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

    public void setCallback(MenuPresenter.Callback callback)
    {
        mPresenterCallback = callback;
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

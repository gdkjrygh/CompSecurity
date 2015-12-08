// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.destination.main.MainActivity;
import com.google.android.gms.games.ui.destination.util.NavigationDrawerUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationFragmentActivity

public final class SideDrawerAdapter extends ArrayAdapter
{
    public static final class ActionItem extends DrawerItem
        implements android.view.View.OnFocusChangeListener
    {

        public final Context mContext;
        public final int mImageResId;
        public android.view.View.OnClickListener mListener;
        public final boolean mPrimary;
        public final int mSelectedImageResId;
        public final boolean mShowInboxCount;
        public final String mTitle;

        public final void onFocusChange(View view, boolean flag)
        {
            Resources resources = mContext.getResources();
            int i;
            if (flag)
            {
                i = 0x7f0b00a0;
            } else
            {
                i = 0x7f0b009f;
            }
            view.setBackgroundColor(resources.getColor(i));
        }

        public ActionItem(Context context, String s, int i, int j, boolean flag, boolean flag1)
        {
            mContext = context;
            mTitle = s;
            mImageResId = i;
            mSelectedImageResId = j;
            mPrimary = flag;
            mShowInboxCount = flag1;
        }
    }

    public static class DividerItem extends DrawerItem
    {

        public static View getView(View view, LayoutInflater layoutinflater)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = layoutinflater.inflate(0x7f04007b, null);
            }
            return view1;
        }

        public DividerItem()
        {
        }
    }

    public static abstract class DrawerItem
    {

        public DrawerItem()
        {
        }
    }

    public static class TopSpacerItem extends DrawerItem
    {

        public static View getView(View view, LayoutInflater layoutinflater)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = layoutinflater.inflate(0x7f04007a, null);
            }
            return view1;
        }

        public TopSpacerItem()
        {
        }
    }

    public static final class UpsellItem extends DrawerItem
    {

        final int mImageResId = 0x7f020103;
        public android.view.View.OnClickListener mListener;
        final String mTitle;

        public UpsellItem(String s)
        {
            mTitle = s;
        }
    }

    private static final class ViewHolderDrawerItem
    {

        TextView mInboxCount;
        TextView mTextView;

        private ViewHolderDrawerItem()
        {
        }

        ViewHolderDrawerItem(byte byte0)
        {
            this();
        }
    }


    private final DestinationFragmentActivity mActivity;
    int mInboxCount;
    boolean mInboxHasNewActivity;
    ArrayList mSideDrawerItems;

    public SideDrawerAdapter(Context context, ArrayList arraylist)
    {
        super(context, 0, arraylist);
        mActivity = (DestinationFragmentActivity)context;
        mSideDrawerItems = arraylist;
    }

    public final long getItemId(int i)
    {
        if (mSideDrawerItems == null)
        {
            return -1L;
        }
        DrawerItem draweritem = (DrawerItem)mSideDrawerItems.get(i);
        if (draweritem instanceof TopSpacerItem)
        {
            return (long)com/google/android/gms/games/ui/destination/SideDrawerAdapter$TopSpacerItem.hashCode();
        }
        if (draweritem instanceof DividerItem)
        {
            return (long)com/google/android/gms/games/ui/destination/SideDrawerAdapter$DividerItem.hashCode();
        } else
        {
            Asserts.checkState(draweritem instanceof ActionItem);
            return (long)((ActionItem)draweritem).mTitle.hashCode();
        }
    }

    public final int getItemViewType(int i)
    {
        if (mSideDrawerItems != null) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        DrawerItem draweritem;
        draweritem = (DrawerItem)mSideDrawerItems.get(i);
        if (draweritem instanceof TopSpacerItem)
        {
            return 2;
        }
        if (draweritem instanceof DividerItem)
        {
            return 3;
        }
        if (!(draweritem instanceof ActionItem))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == NavigationDrawerUtils.getCurrentIndex() && (mActivity instanceof MainActivity))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L1; else goto _L3
_L3:
        return 1;
        if (!(draweritem instanceof UpsellItem)) goto _L1; else goto _L4
_L4:
        return 4;
    }

    public final View getView(final int position, View view, final ViewGroup parent)
    {
        LayoutInflater layoutinflater = LayoutInflater.from(mActivity);
        Object obj = view;
        if (mSideDrawerItems != null)
        {
            Object obj1 = (DrawerItem)mSideDrawerItems.get(position);
            if (obj1 instanceof TopSpacerItem)
            {
                obj = TopSpacerItem.getView(view, layoutinflater);
            } else
            {
                if (obj1 instanceof DividerItem)
                {
                    return DividerItem.getView(view, layoutinflater);
                }
                if (obj1 instanceof ActionItem)
                {
                    obj1 = (ActionItem)obj1;
                    obj1.mListener = new android.view.View.OnClickListener() {

                        final SideDrawerAdapter this$0;
                        final ViewGroup val$parent;
                        final int val$position;

                        public final void onClick(View view1)
                        {
                            NavigationDrawerUtils.onDrawerItemClicked(mActivity, position, parent);
                            mActivity.closeDrawer();
                            notifyDataSetChanged();
                        }

            
            {
                this$0 = SideDrawerAdapter.this;
                position = i;
                parent = viewgroup;
                super();
            }
                    };
                    Resources resources;
                    int j;
                    boolean flag;
                    if (position == NavigationDrawerUtils.getCurrentIndex() && (mActivity instanceof MainActivity))
                    {
                        position = 1;
                    } else
                    {
                        position = 0;
                    }
                    j = mInboxCount;
                    flag = mInboxHasNewActivity;
                    resources = ((ActionItem) (obj1)).mContext.getResources();
                    if (view == null)
                    {
                        parent = new ViewHolderDrawerItem((byte)0);
                        int i;
                        if (position != 0)
                        {
                            i = 0x7f040078;
                        } else
                        {
                            i = 0x7f040077;
                        }
                        view = layoutinflater.inflate(i, null);
                        parent.mTextView = (TextView)view.findViewById(0x7f0d01a3);
                        if (position != 0)
                        {
                            ((ViewHolderDrawerItem) (parent)).mTextView.setTextColor(resources.getColor(0x7f0b0257));
                        }
                        parent.mInboxCount = (TextView)view.findViewById(0x7f0d01a4);
                        view.setTag(parent);
                    } else
                    {
                        parent = (ViewHolderDrawerItem)view.getTag();
                    }
                    ((ViewHolderDrawerItem) (parent)).mTextView.setText(((ActionItem) (obj1)).mTitle);
                    obj = null;
                    if (position != 0)
                    {
                        position = ((ActionItem) (obj1)).mSelectedImageResId;
                    } else
                    {
                        position = ((ActionItem) (obj1)).mImageResId;
                    }
                    if (position > 0)
                    {
                        obj = resources.getDrawable(position);
                    }
                    ((ViewHolderDrawerItem) (parent)).mTextView.setCompoundDrawablesWithIntrinsicBounds(((android.graphics.drawable.Drawable) (obj)), null, null, null);
                    ((ViewHolderDrawerItem) (parent)).mTextView.setOnClickListener(((ActionItem) (obj1)).mListener);
                    ((ViewHolderDrawerItem) (parent)).mTextView.setOnFocusChangeListener(((android.view.View.OnFocusChangeListener) (obj1)));
                    if (((ActionItem) (obj1)).mShowInboxCount && j > 0)
                    {
                        obj = new GradientDrawable();
                        if (j >= 10)
                        {
                            ((GradientDrawable) (obj)).setShape(0);
                            ((GradientDrawable) (obj)).setCornerRadius(resources.getDimensionPixelSize(0x7f0c00e2));
                        } else
                        {
                            ((GradientDrawable) (obj)).setShape(1);
                        }
                        if (flag)
                        {
                            position = 0x7f0b0257;
                        } else
                        {
                            position = 0x7f0b0067;
                        }
                        ((GradientDrawable) (obj)).setColor(resources.getColor(position));
                        if (PlatformVersion.checkVersion(16))
                        {
                            ((ViewHolderDrawerItem) (parent)).mInboxCount.setBackground(((android.graphics.drawable.Drawable) (obj)));
                        } else
                        {
                            ((ViewHolderDrawerItem) (parent)).mInboxCount.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
                        }
                        if (j > 99)
                        {
                            ((ViewHolderDrawerItem) (parent)).mInboxCount.setText(0x7f100183);
                        } else
                        {
                            ((ViewHolderDrawerItem) (parent)).mInboxCount.setText(String.valueOf(j));
                        }
                        ((ViewHolderDrawerItem) (parent)).mInboxCount.setVisibility(0);
                        ViewCompat.setImportantForAccessibility(((ViewHolderDrawerItem) (parent)).mInboxCount, 2);
                        if (flag)
                        {
                            obj = resources.getString(0x7f100106, new Object[] {
                                Integer.valueOf(j)
                            });
                        } else
                        {
                            obj = resources.getString(0x7f100107, new Object[] {
                                Integer.valueOf(j)
                            });
                        }
                        ((ViewHolderDrawerItem) (parent)).mTextView.setContentDescription(((CharSequence) (obj)));
                        return view;
                    } else
                    {
                        ((ViewHolderDrawerItem) (parent)).mInboxCount.setVisibility(8);
                        return view;
                    }
                }
                obj = view;
                if (obj1 instanceof UpsellItem)
                {
                    UpsellItem upsellitem = (UpsellItem)obj1;
                    upsellitem.mListener = new android.view.View.OnClickListener() {

                        final SideDrawerAdapter this$0;
                        final ViewGroup val$parent;
                        final int val$position;

                        public final void onClick(View view1)
                        {
                            NavigationDrawerUtils.onDrawerItemClicked(mActivity, position, parent);
                            mActivity.closeDrawer();
                            notifyDataSetChanged();
                        }

            
            {
                this$0 = SideDrawerAdapter.this;
                position = i;
                parent = viewgroup;
                super();
            }
                    };
                    parent = view;
                    if (view == null)
                    {
                        parent = layoutinflater.inflate(0x7f04007c, null);
                    }
                    view = (TextView)parent.findViewById(0x7f0d0075);
                    view.setText(upsellitem.mTitle);
                    if (((Boolean)G.useIconInNavDrawerUpsell.get()).booleanValue())
                    {
                        position = 0x7f020103;
                    } else
                    {
                        position = 0;
                    }
                    view.setCompoundDrawablesWithIntrinsicBounds(position, 0, 0, 0);
                    parent.setOnClickListener(upsellitem.mListener);
                    return parent;
                }
            }
        }
        return ((View) (obj));
    }

    public final int getViewTypeCount()
    {
        return 5;
    }

    public final boolean isEnabled(int i)
    {
        return !(mSideDrawerItems.get(i) instanceof DividerItem) && !(mSideDrawerItems.get(i) instanceof TopSpacerItem);
    }

}

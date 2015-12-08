// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.Utilities;
import com.actionbarsherlock.internal.widget.IcsSpinner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android.adapters:
//            HeaderGroupItem

public class TitleSpinnerAdapterWithHeader extends ArrayAdapter
    implements Serializable
{
    public static interface ITitleSpinnerListener
    {

        public abstract void onSpinnerHeaderGroupItemSelected(String s, int i);

        public abstract void onSpinnerItemSelected(int i);
    }


    private static final int INVALID_HEADER_POSITION = -1;
    private static final float MAX_WIDTH = 192F;
    private static final long serialVersionUID = 1L;
    private int mColors[];
    private Context mContext;
    private List mHeaderGroupItems;
    private LayoutInflater mInflater;
    private List mItems;
    private ITitleSpinnerListener mListener;
    private ViewGroup mParent;
    private int mResId;
    private boolean mShouldAddAdditionalPadding;
    private boolean mShouldApplyHeaderBackgrounds;
    private boolean mShouldOverrideDefaultsActions;
    private int mTextColor;
    private String mTitle;
    private Typeface mTypeface;

    public TitleSpinnerAdapterWithHeader(Context context, int i, List list)
    {
        super(context, i, 0x1020014, list);
        mItems = new ArrayList();
        mHeaderGroupItems = new ArrayList();
        mTextColor = -1;
        mShouldAddAdditionalPadding = false;
        mShouldApplyHeaderBackgrounds = false;
        mResId = i;
        mItems = list;
        mContext = context;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public TitleSpinnerAdapterWithHeader(Context context, int i, List list, String s)
    {
        this(context, i, list);
        mTitle = s;
    }

    public TitleSpinnerAdapterWithHeader(Context context, int i, List list, int ai[])
    {
        this(context, i, list);
        mColors = ai;
    }

    private static String buildColoredLabel(String s, int ai[])
    {
        String s1 = "";
        String as[] = s.split(" ");
        int i = 0;
        s = s1;
        while (i < as.length) 
        {
            String s2;
            int j;
            if (ai.length <= i)
            {
                j = ai[ai.length - 1];
            } else
            {
                j = ai[i];
            }
            s2 = s;
            if (i > 0)
            {
                s2 = (new StringBuilder()).append(s).append(" ").toString();
            }
            s = (new StringBuilder()).append(s2).append("<font color=#").append(Integer.toHexString(j)).append(">").append(as[i]).append("</font>").toString();
            i++;
        }
        return s;
    }

    private int getHeaderIndexAtItemPosition(int i)
    {
        int l = -1;
        int k = mItems.size();
        if (i < k)
        {
            return -1;
        }
        for (int j = 0; j < mHeaderGroupItems.size(); j++)
        {
            l++;
            k += ((HeaderGroupItem)mHeaderGroupItems.get(j)).getItems().size() + 1;
            if (i < k)
            {
                return l;
            }
        }

        return l;
    }

    private String getHeaderItemAtIndex(int i)
    {
        List list = getHeaderPositions();
        int l = getHeaderIndexAtItemPosition(i);
        boolean flag = false;
        int j = 0;
        do
        {
label0:
            {
                int k = ((flag) ? 1 : 0);
                if (j < list.size())
                {
                    if (i >= ((Integer)list.get(j)).intValue())
                    {
                        break label0;
                    }
                    k = ((HeaderGroupItem)mHeaderGroupItems.get(l)).getItems().size() - (((Integer)list.get(j)).intValue() - i);
                }
                return (String)((HeaderGroupItem)mHeaderGroupItems.get(l)).getItems().get(k);
            }
            j++;
        } while (true);
    }

    private List getHeaderPositions()
    {
        ArrayList arraylist = new ArrayList();
        int i = mItems.size();
        arraylist.add(Integer.valueOf(i));
        for (Iterator iterator = mHeaderGroupItems.iterator(); iterator.hasNext(); arraylist.add(Integer.valueOf(i)))
        {
            i += ((HeaderGroupItem)iterator.next()).getItems().size() + 1;
        }

        return arraylist;
    }

    private float getWidth(TextView textview, String s)
    {
        return textview.getPaint().measureText(s);
    }

    private int indexOf(int i, List list)
    {
        for (int j = 0; j < list.size(); j++)
        {
            if (((Integer)list.get(j)).intValue() == i)
            {
                return j;
            }
        }

        return -1;
    }

    public void addHeaderGroup(String s)
    {
        mHeaderGroupItems.add(new HeaderGroupItem(s));
    }

    public void addToHeaderGroup(String s, String s1)
    {
        HeaderGroupItem headergroupitem = null;
        Iterator iterator = mHeaderGroupItems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            HeaderGroupItem headergroupitem1 = (HeaderGroupItem)iterator.next();
            if (headergroupitem1.getTitle().equals(s))
            {
                headergroupitem = headergroupitem1;
            }
        } while (true);
        if (headergroupitem != null && !headergroupitem.getItems().contains(s1))
        {
            headergroupitem.getItems().add(s1);
            notifyDataSetChanged();
        }
    }

    public int getAbsolutePositionOfHeaderItem(String s, int i)
    {
        byte byte0 = -1;
        int l = -1;
        for (int j = 0; j < mHeaderGroupItems.size(); j++)
        {
            if (((HeaderGroupItem)mHeaderGroupItems.get(j)).getTitle().equals(s))
            {
                l = j;
            }
        }

        int k = byte0;
        if (l != -1)
        {
            k = ((Integer)getHeaderPositions().get(l)).intValue() + (i + 1);
        }
        return k;
    }

    public int getCount()
    {
        return getItemCount() + getHeaderCount();
    }

    public View getDropDownView(final int position, View view, ViewGroup viewgroup)
    {
        android.view.View.OnClickListener onclicklistener;
        view = getHeaderPositions();
        onclicklistener = new android.view.View.OnClickListener() {

            final TitleSpinnerAdapterWithHeader this$0;
            final int val$position;

            public void onClick(View view2)
            {
                Logger.i(this, (new StringBuilder()).append("onClick position is ").append(position).toString());
                int i = mItems.size();
                if (position < i)
                {
                    Logger.i(this, (new StringBuilder()).append("onItemSelected ").append(position).toString());
                    mListener.onSpinnerItemSelected(position);
                    return;
                } else
                {
                    Logger.i(this, (new StringBuilder()).append("onHeaderGroupItemSelected ").append(position).toString());
                    mListener.onSpinnerHeaderGroupItemSelected(((HeaderGroupItem)mHeaderGroupItems.get(getHeaderIndexAtItemPosition(position))).getTitle(), position - i);
                    return;
                }
            }

            
            {
                this$0 = TitleSpinnerAdapterWithHeader.this;
                position = i;
                super();
            }
        };
        if (indexOf(position, view) != -1) goto _L2; else goto _L1
_L1:
        View view1;
        if (position == ((Integer)view.get(getHeaderIndexAtItemPosition(position) + 1)).intValue() - 1 || position == getCount() - 1)
        {
            view = mInflater.inflate(com.accuweather.android.R.layout.spinner_dropdown_item, viewgroup, false);
        } else
        {
            view = mInflater.inflate(com.accuweather.android.R.layout.spinner_dropdown_item_with_divider, viewgroup, false);
        }
        view1 = view;
        if (mListener == null) goto _L4; else goto _L3
_L3:
        if (!mShouldOverrideDefaultsActions) goto _L6; else goto _L5
_L5:
        Logger.i(this, "OverrideDefaultActions setOnClickListener");
        view.setOnClickListener(onclicklistener);
        view1 = view;
_L4:
        Utilities.setTypeFace(view1, Data.getRobotoCondensed());
        return super.getDropDownView(position, view1, viewgroup);
_L6:
        view1 = view;
        if (position >= ((Integer)getHeaderPositions().get(0)).intValue())
        {
            view.setOnClickListener(onclicklistener);
            view1 = view;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        view1 = mInflater.inflate(com.accuweather.android.R.layout.spinner_dropdown_header, viewgroup, false);
        if (mShouldApplyHeaderBackgrounds)
        {
            view1.setBackgroundColor(mContext.getResources().getColor(com.accuweather.android.R.color.spinner_header_background));
        }
        view1.setOnTouchListener(new android.view.View.OnTouchListener() {

            final TitleSpinnerAdapterWithHeader this$0;

            public boolean onTouch(View view2, MotionEvent motionevent)
            {
                return true;
            }

            
            {
                this$0 = TitleSpinnerAdapterWithHeader.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L7
_L7:
    }

    public int getHeaderCount()
    {
        int i = 0;
        for (Iterator iterator = mHeaderGroupItems.iterator(); iterator.hasNext();)
        {
            i += ((HeaderGroupItem)iterator.next()).getItems().size() + 1;
        }

        return i;
    }

    public HeaderGroupItem getHeaderGroupItemAtIndex(int i)
    {
        return (HeaderGroupItem)mHeaderGroupItems.get(i);
    }

    public HeaderGroupItem getHeaderGroupItemByName(String s)
    {
        for (Iterator iterator = mHeaderGroupItems.iterator(); iterator.hasNext();)
        {
            HeaderGroupItem headergroupitem = (HeaderGroupItem)iterator.next();
            if (headergroupitem.getTitle().equals(s))
            {
                return headergroupitem;
            }
        }

        return null;
    }

    public String getHeaderItem(String s, int i)
    {
        HeaderGroupItem headergroupitem = null;
        Iterator iterator = mHeaderGroupItems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            HeaderGroupItem headergroupitem1 = (HeaderGroupItem)iterator.next();
            if (headergroupitem1.getTitle().equals(s))
            {
                headergroupitem = headergroupitem1;
            }
        } while (true);
        if (headergroupitem != null)
        {
            return (String)headergroupitem.getItems().get(i);
        } else
        {
            return null;
        }
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public String getItem(int i)
    {
        if (indexOf(i, getHeaderPositions()) != -1)
        {
            java.util.Locale locale = mContext.getResources().getConfiguration().locale;
            return ((HeaderGroupItem)mHeaderGroupItems.get(indexOf(i, getHeaderPositions()))).getTitle().toUpperCase(locale);
        }
        if (getHeaderIndexAtItemPosition(i) == -1)
        {
            return (String)mItems.get(i);
        } else
        {
            return getHeaderItemAtIndex(i);
        }
    }

    public int getItemCount()
    {
        return mItems.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public ViewGroup getParent()
    {
        return mParent;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = -1;
        int k = (int)(mContext.getResources().getDisplayMetrics().density * 192F);
        View view1 = view;
        if (view == null)
        {
            view1 = mInflater.inflate(mResId, viewgroup, false);
        }
        view = (TextView)view1.findViewById(0x1020014);
        if (mColors != null)
        {
            view.setText(Html.fromHtml(buildColoredLabel(getItem(i), mColors)));
        } else
        {
            view.setText(getItem(i).split(",")[0]);
        }
        if (view1.findViewById(com.accuweather.android.R.id.title) != null)
        {
            ((TextView)view1.findViewById(com.accuweather.android.R.id.title)).setText(mTitle);
            android.widget.LinearLayout.LayoutParams layoutparams;
            if (mShouldAddAdditionalPadding)
            {
                j = (viewgroup.getPaddingRight() + viewgroup.getPaddingLeft()) * 2;
            } else
            {
                j = viewgroup.getPaddingRight() + viewgroup.getPaddingLeft() * 2;
            }
            j = (int)getWidth((TextView)view1.findViewById(com.accuweather.android.R.id.title), mTitle.split(",")[0]) + j;
        }
        if (viewgroup instanceof IcsSpinner)
        {
            if (((IcsSpinner)viewgroup).getSelectedItemPosition() == i)
            {
                layoutparams = (android.widget.LinearLayout.LayoutParams)viewgroup.getLayoutParams();
                int l;
                if (mShouldAddAdditionalPadding)
                {
                    l = (viewgroup.getPaddingRight() + viewgroup.getPaddingLeft()) * 2;
                } else
                {
                    l = viewgroup.getPaddingRight() + viewgroup.getPaddingLeft() * 2;
                }
                i = (int)getWidth(view, getItem(i).split(",")[0]) + l;
                if (i <= j)
                {
                    i = j;
                }
                j = i;
                if (i > k)
                {
                    j = k;
                }
                layoutparams.width = j;
            }
        } else
        if ((viewgroup instanceof AdapterView) && ((AdapterView)viewgroup).getSelectedItemPosition() == i)
        {
            android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)viewgroup.getLayoutParams();
            int i1;
            if (mShouldAddAdditionalPadding)
            {
                i1 = (viewgroup.getPaddingRight() + viewgroup.getPaddingLeft()) * 2;
            } else
            {
                i1 = viewgroup.getPaddingRight() + viewgroup.getPaddingLeft() * 2;
            }
            i = (int)getWidth(view, getItem(i).split(",")[0]) + i1;
            if (i <= j)
            {
                i = j;
            }
            j = i;
            if (i > k)
            {
                j = k;
            }
            layoutparams1.width = j;
        }
        mParent = viewgroup;
        if (mTypeface == null)
        {
            Utilities.setTypeFace(view1, Data.getRobotoCondensed());
        } else
        {
            Utilities.setTypeFace(view1, mTypeface);
        }
        Utilities.setTextColor(view1, mTextColor);
        return view1;
    }

    public void setAdditionalPadding(boolean flag)
    {
        mShouldAddAdditionalPadding = flag;
    }

    public void setColors(int ai[])
    {
        mColors = ai;
    }

    public void setHeaderGroupItems(List list)
    {
        mHeaderGroupItems = list;
        notifyDataSetChanged();
    }

    public void setOverrideDefaultActions(boolean flag)
    {
        mShouldOverrideDefaultsActions = flag;
    }

    public void setTextColor(int i)
    {
        mTextColor = i;
        notifyDataSetChanged();
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }

    public void setTitleSpinnerListener(ITitleSpinnerListener ititlespinnerlistener)
    {
        mListener = ititlespinnerlistener;
    }

    public void setTypeface(Typeface typeface)
    {
        mTypeface = typeface;
    }

    public void showHeaderBackground(boolean flag)
    {
        mShouldApplyHeaderBackgrounds = flag;
    }

    public void updateItems(List list)
    {
        mItems = list;
        notifyDataSetChanged();
    }




}

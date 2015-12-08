// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersSimpleAdapter

public class StickyGridHeadersSimpleArrayAdapter extends BaseAdapter
    implements StickyGridHeadersSimpleAdapter
{
    protected class HeaderViewHolder
    {

        public TextView textView;
        final StickyGridHeadersSimpleArrayAdapter this$0;

        protected HeaderViewHolder()
        {
            this$0 = StickyGridHeadersSimpleArrayAdapter.this;
            super();
        }
    }

    protected class ViewHolder
    {

        public TextView textView;
        final StickyGridHeadersSimpleArrayAdapter this$0;

        protected ViewHolder()
        {
            this$0 = StickyGridHeadersSimpleArrayAdapter.this;
            super();
        }
    }


    protected static final String TAG = com/tonicartos/widget/stickygridheaders/StickyGridHeadersSimpleArrayAdapter.getSimpleName();
    private int mHeaderResId;
    private LayoutInflater mInflater;
    private int mItemResId;
    private List mItems;

    public StickyGridHeadersSimpleArrayAdapter(Context context, List list, int i, int j)
    {
        init(context, list, i, j);
    }

    public StickyGridHeadersSimpleArrayAdapter(Context context, Object aobj[], int i, int j)
    {
        init(context, Arrays.asList(aobj), i, j);
    }

    private void init(Context context, List list, int i, int j)
    {
        mItems = list;
        mHeaderResId = i;
        mItemResId = j;
        mInflater = LayoutInflater.from(context);
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public int getCount()
    {
        return mItems.size();
    }

    public long getHeaderId(int i)
    {
        Object obj = getItem(i);
        if (obj instanceof CharSequence)
        {
            obj = (CharSequence)obj;
        } else
        {
            obj = obj.toString();
        }
        return (long)((CharSequence) (obj)).subSequence(0, 1).charAt(0);
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            view = mInflater.inflate(mHeaderResId, viewgroup, false);
            viewgroup = new HeaderViewHolder();
            viewgroup.textView = (TextView)view.findViewById(0x1020014);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (HeaderViewHolder)view.getTag();
        }
        obj = getItem(i);
        if (obj instanceof CharSequence)
        {
            obj = (CharSequence)obj;
        } else
        {
            obj = obj.toString();
        }
        ((HeaderViewHolder) (viewgroup)).textView.setText(((CharSequence) (obj)).subSequence(0, 1));
        return view;
    }

    public Object getItem(int i)
    {
        return mItems.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            view = mInflater.inflate(mItemResId, viewgroup, false);
            viewgroup = new ViewHolder();
            viewgroup.textView = (TextView)view.findViewById(0x1020014);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        obj = getItem(i);
        if (obj instanceof CharSequence)
        {
            ((ViewHolder) (viewgroup)).textView.setText((CharSequence)obj);
            return view;
        } else
        {
            ((ViewHolder) (viewgroup)).textView.setText(obj.toString());
            return view;
        }
    }

}

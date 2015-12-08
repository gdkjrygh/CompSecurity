// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.app.contacts.ImageItemViewHolder;
import com.skype.android.app.data.DataAdapter;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.text.BoldTypeFacedSpan;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SkypeAvatarView;
import java.util.List;

public abstract class SearchResultAdapter extends DataAdapter
{
    public static final class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode MODE_COMBINED;
        public static final Mode MODE_SINGLE;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/skype/android/app/search/SearchResultAdapter$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            MODE_COMBINED = new Mode("MODE_COMBINED", 0);
            MODE_SINGLE = new Mode("MODE_SINGLE", 1);
            $VALUES = (new Mode[] {
                MODE_COMBINED, MODE_SINGLE
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }

    public abstract class SearchItemViewHolder extends ImageItemViewHolder
    {

        protected final BoldTypeFacedSpan boldfaced;
        protected Object data;
        protected final TextView firstLineView;
        protected final TextView secondLineView;
        final SearchResultAdapter this$0;

        protected abstract Conversation getConversationFromData(Object obj);

        protected void highlightSearchString(SpannableStringBuilder spannablestringbuilder, int i, int j)
        {
            spannablestringbuilder.setSpan(boldfaced, i, i + j, 18);
        }

        protected void onSetData(Object obj)
        {
            data = obj;
            obj = getConversationFromData(data);
            bindImage(((Conversation) (obj)));
            setFirstLine(((Conversation) (obj)));
            setSecondLine(((Conversation) (obj)));
        }

        protected abstract void setFirstLine(Conversation conversation);

        protected abstract void setSecondLine(Conversation conversation);

        public SearchItemViewHolder(Activity activity, View view, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, 
                SkyLib skylib, TypeFaceFactory typefacefactory)
        {
            this$0 = SearchResultAdapter.this;
            super(activity, view, (SkypeAvatarView)ViewUtil.a(view, 0x7f10030c), imagecache, contactutil, groupavatarutil, defaultavatars, skylib);
            firstLineView = (TextView)ViewUtil.a(view, 0x7f10031a);
            secondLineView = (TextView)ViewUtil.a(view, 0x7f10031b);
            boldfaced = new BoldTypeFacedSpan(typefacefactory);
        }
    }

    public abstract class SearchResultViewAdapter extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final int itemLayoutId;
        final SearchResultAdapter this$0;

        protected View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(itemLayoutId, viewgroup, false);
        }

        public SearchResultViewAdapter(int i)
        {
            this$0 = SearchResultAdapter.this;
            super();
            itemLayoutId = i;
        }
    }

    private final class a extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final SearchResultAdapter this$0;

        protected final int getItemId(Object obj)
        {
            return 0;
        }

        protected final View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300f6, viewgroup, false);
        }

        protected final volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        protected final b onCreateViewHolder(View view)
        {
            return new b(view);
        }

        private a()
        {
            this$0 = SearchResultAdapter.this;
            super();
        }

    }

    private final class b extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        private TextView textView;
        final SearchResultAdapter this$0;

        protected final void onSetData(Object obj)
        {
            textView.setText(String.format(getFooterText(), new Object[] {
                Integer.valueOf(getItemCount())
            }));
        }

        public b(View view)
        {
            this$0 = SearchResultAdapter.this;
            super(view);
            textView = (TextView)view.findViewById(0x7f1004fa);
        }
    }

    private final class c extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final SearchResultAdapter this$0;

        protected final int getItemId(Object obj)
        {
            return 0;
        }

        protected final View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300f7, viewgroup, false);
        }

        protected final volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        protected final d onCreateViewHolder(View view)
        {
            return new d(view);
        }

        private c()
        {
            this$0 = SearchResultAdapter.this;
            super();
        }

    }

    private final class d extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        private TextView textView;
        final SearchResultAdapter this$0;

        protected final void onSetData(Object obj)
        {
            textView.setText(getHeaderText());
        }

        public d(View view)
        {
            this$0 = SearchResultAdapter.this;
            super(view);
            textView = (TextView)view.findViewById(0x7f1004fb);
        }
    }

    private final class e extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final SearchResultAdapter this$0;

        protected final int getItemId(Object obj)
        {
            return 0;
        }

        protected final View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300f9, viewgroup, false);
        }

        protected final volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        protected final f onCreateViewHolder(View view)
        {
            return new f(view);
        }

        private e()
        {
            this$0 = SearchResultAdapter.this;
            super();
        }

    }

    private final class f extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        final SearchResultAdapter this$0;

        protected final void onSetData(Object obj)
        {
        }

        public f(View view)
        {
            this$0 = SearchResultAdapter.this;
            super(view);
        }
    }


    public static final int VIEW_TYPE_DATA = 0;
    public static final int VIEW_TYPE_FOOTER = 1;
    public static final int VIEW_TYPE_HEADER = 3;
    public static final int VIEW_TYPE_SEPARATOR = 2;
    private Mode mode;
    protected CharSequence query;

    public SearchResultAdapter()
    {
        setItemViewAdapter(0, getDataItemViewAdapter());
        setItemViewAdapter(1, new a());
        setItemViewAdapter(3, new c());
        setItemViewAdapter(2, new e());
        mode = Mode.MODE_COMBINED;
    }

    private boolean isVisible()
    {
        return getItemCount() > 0;
    }

    private boolean shouldDisplayFooter()
    {
        return getItemCount() > getMaximumVisibleDataViewsCount();
    }

    protected void bindDataHolder(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i)
    {
        if (i >= 0 && i < getItemCount())
        {
            super.onBindViewHolder(itemviewholder, i);
            return;
        } else
        {
            itemviewholder.setData(null);
            return;
        }
    }

    protected boolean forceShowEmptyAdapter()
    {
        return false;
    }

    protected int getAdditionalViewsCount()
    {
        return 1;
    }

    protected abstract com.skype.android.app.data.DataAdapter.ItemViewAdapter getDataItemViewAdapter();

    protected abstract String getFooterText();

    protected int getFooterViewsCount()
    {
        return 1;
    }

    protected abstract String getHeaderText();

    protected int getHeaderViewsCount()
    {
        return 1;
    }

    public int getItemViewType(int i)
    {
        if (mode == Mode.MODE_COMBINED)
        {
            if (i == 0)
            {
                return 3;
            }
            if (i == getVisibleViewsCount() - 2 && shouldDisplayFooter())
            {
                return 1;
            }
            if (i == getVisibleViewsCount() - 1)
            {
                return 2;
            }
        }
        return 0;
    }

    public abstract int getMaximumVisibleDataViewsCount();

    public Mode getMode()
    {
        return mode;
    }

    protected int getVisibleDataViewsCount()
    {
        if (mode == Mode.MODE_COMBINED)
        {
            return Math.min(getMaximumVisibleDataViewsCount(), getItemCount());
        } else
        {
            return getItemCount();
        }
    }

    public int getVisibleViewsCount()
    {
        int i;
        if (!isVisible() && !forceShowEmptyAdapter())
        {
            i = 0;
        } else
        {
            int j = getHeaderViewsCount() + getVisibleDataViewsCount() + getAdditionalViewsCount();
            i = j;
            if (shouldDisplayFooter())
            {
                return j + getFooterViewsCount();
            }
        }
        return i;
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        onBindViewHolder((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i);
    }

    public void onBindViewHolder(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i)
    {
        if (mode == Mode.MODE_COMBINED)
        {
            bindDataHolder(itemviewholder, i - getHeaderViewsCount());
        } else
        if (mode == Mode.MODE_SINGLE)
        {
            bindDataHolder(itemviewholder, i);
            return;
        }
    }

    public void setData(List list, CharSequence charsequence)
    {
        query = charsequence;
        setData(list);
    }

    public void setMode(Mode mode1)
    {
        mode = mode1;
    }
}

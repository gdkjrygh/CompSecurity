// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package com.soundcloud.android.presentation:
//            RecyclerItemAdapter, PagingAwareAdapter, ProgressCellRenderer, CellRenderer, 
//            CellRendererBinding

public abstract class PagingRecyclerItemAdapter extends RecyclerItemAdapter
    implements PagingAwareAdapter
{
    protected static final class AppendState extends Enum
    {

        private static final AppendState $VALUES[];
        public static final AppendState ERROR;
        public static final AppendState IDLE;
        public static final AppendState LOADING;

        public static AppendState valueOf(String s)
        {
            return (AppendState)Enum.valueOf(com/soundcloud/android/presentation/PagingRecyclerItemAdapter$AppendState, s);
        }

        public static AppendState[] values()
        {
            return (AppendState[])$VALUES.clone();
        }

        static 
        {
            IDLE = new AppendState("IDLE", 0);
            LOADING = new AppendState("LOADING", 1);
            ERROR = new AppendState("ERROR", 2);
            $VALUES = (new AppendState[] {
                IDLE, LOADING, ERROR
            });
        }

        private AppendState(String s, int i)
        {
            super(s, i);
        }
    }


    private AppendState appendState;
    private final ProgressCellRenderer progressCellRenderer;

    public PagingRecyclerItemAdapter(CellRenderer cellrenderer)
    {
        this(cellrenderer, createDefaultProgressCellRenderer());
    }

    public PagingRecyclerItemAdapter(CellRenderer cellrenderer, ProgressCellRenderer progresscellrenderer)
    {
        super(cellrenderer);
        appendState = AppendState.IDLE;
        progressCellRenderer = progresscellrenderer;
    }

    public transient PagingRecyclerItemAdapter(CellRendererBinding acellrendererbinding[])
    {
        super(acellrendererbinding);
        appendState = AppendState.IDLE;
        progressCellRenderer = createDefaultProgressCellRenderer();
    }

    private static ProgressCellRenderer createDefaultProgressCellRenderer()
    {
        return new ProgressCellRenderer(com.soundcloud.androidkit.R.layout.ak_list_loading_item);
    }

    private void setNewAppendState(AppendState appendstate)
    {
        appendState = appendstate;
        notifyDataSetChanged();
    }

    public int getItemCount()
    {
        if (items.isEmpty())
        {
            return 0;
        }
        if (appendState == AppendState.IDLE)
        {
            return items.size();
        } else
        {
            return items.size() + 1;
        }
    }

    public int getItemViewType(int i)
    {
        if (appendState != AppendState.IDLE && i == items.size())
        {
            return 0x80000000;
        } else
        {
            return super.getItemViewType(i);
        }
    }

    public boolean isIdle()
    {
        return appendState == AppendState.IDLE;
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        if (getItemViewType(i) == 0x80000000)
        {
            ProgressCellRenderer progresscellrenderer = progressCellRenderer;
            viewholder = viewholder.itemView;
            boolean flag;
            if (appendState == AppendState.ERROR)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            progresscellrenderer.bindView(viewholder, flag);
            return;
        } else
        {
            super.onBindViewHolder(viewholder, i);
            return;
        }
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        if (i == 0x80000000)
        {
            return createViewHolder(progressCellRenderer.createView(viewgroup.getContext()));
        } else
        {
            return super.onCreateViewHolder(viewgroup, i);
        }
    }

    public void onError(Throwable throwable)
    {
        setNewAppendState(AppendState.ERROR);
        super.onError(throwable);
    }

    public void onNext(Iterable iterable)
    {
        setNewAppendState(AppendState.IDLE);
        super.onNext(iterable);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Iterable)obj);
    }

    public void setLoading()
    {
        setNewAppendState(AppendState.LOADING);
    }

    public void setOnErrorRetryListener(android.view.View.OnClickListener onclicklistener)
    {
        progressCellRenderer.setRetryListener(onclicklistener);
    }
}

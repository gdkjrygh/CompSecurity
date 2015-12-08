// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.adapters.ReactiveAdapter;
import java.util.List;

// Referenced classes of package com.soundcloud.android.presentation:
//            ListItemAdapter, PagingAwareAdapter, CellRenderer, CellRendererBinding

public class PagingListItemAdapter extends ListItemAdapter
    implements PagingAwareAdapter, ReactiveAdapter
{
    protected static final class AppendState extends Enum
    {

        private static final AppendState $VALUES[];
        public static final AppendState ERROR;
        public static final AppendState IDLE;
        public static final AppendState LOADING;

        public static AppendState valueOf(String s)
        {
            return (AppendState)Enum.valueOf(com/soundcloud/android/presentation/PagingListItemAdapter$AppendState, s);
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
    private android.view.View.OnClickListener onErrorRetryListener;
    private final int progressItemLayoutResId;

    public PagingListItemAdapter(int i, CellRenderer cellrenderer)
    {
        super(cellrenderer);
        appendState = AppendState.IDLE;
        progressItemLayoutResId = i;
    }

    public PagingListItemAdapter(CellRenderer cellrenderer)
    {
        this(0x7f030020, cellrenderer);
    }

    public transient PagingListItemAdapter(CellRendererBinding acellrendererbinding[])
    {
        super(acellrendererbinding);
        appendState = AppendState.IDLE;
        progressItemLayoutResId = 0x7f030020;
    }

    private void configureAppendingLayout(View view)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.presentation.PagingListItemAdapter.AppendState[appendState.ordinal()])
        {
        default:
            throw new IllegalStateException("Unexpected idle state with progress row");

        case 1: // '\001'
            view.setBackgroundResource(0x106000d);
            view.findViewById(0x7f0f0010).setVisibility(0);
            view.findViewById(0x7f0f0011).setVisibility(8);
            view.setOnClickListener(null);
            return;

        case 2: // '\002'
            view.setBackgroundResource(0x7f02004a);
            break;
        }
        view.findViewById(0x7f0f0010).setVisibility(8);
        view.findViewById(0x7f0f0011).setVisibility(0);
        view.setOnClickListener(onErrorRetryListener);
    }

    private void setNewAppendState(AppendState appendstate)
    {
        AndroidUtils.assertOnUiThread("Adapter should always be uses on UI Thread. Tracking issue #2377");
        appendState = appendstate;
    }

    public boolean areAllItemsEnabled()
    {
        return false;
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
        if (isIdle() && i == items.size())
        {
            ErrorUtils.handleSilentException(new IllegalStateException((new StringBuilder("This position is invalid in Idle state. Tracking issue #2377; position=")).append(i).append("; items=").append(items.size()).append("; count=").append(getItemCount()).toString()));
        }
        if (appendState != AppendState.IDLE && i == items.size())
        {
            return -1;
        } else
        {
            return super.getItemViewType(i);
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (getItemViewType(i) == -1)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = View.inflate(viewgroup.getContext(), progressItemLayoutResId, null);
            }
            configureAppendingLayout(view1);
            return view1;
        } else
        {
            return super.getView(i, view, viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int i)
    {
        return getItemViewType(i) != -1;
    }

    public boolean isIdle()
    {
        return appendState == AppendState.IDLE;
    }

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        setNewAppendState(AppendState.ERROR);
        notifyDataSetChanged();
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
        notifyDataSetChanged();
    }

    public void setOnErrorRetryListener(android.view.View.OnClickListener onclicklistener)
    {
        onErrorRetryListener = onclicklistener;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$presentation$PagingListItemAdapter$AppendState[];

        static 
        {
            $SwitchMap$com$soundcloud$android$presentation$PagingListItemAdapter$AppendState = new int[AppendState.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$presentation$PagingListItemAdapter$AppendState[AppendState.LOADING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$presentation$PagingListItemAdapter$AppendState[AppendState.ERROR.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

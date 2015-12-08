// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me.lyft.android.common.Preconditions;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryItem;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryItemView

public class PassengerRideHistoryAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

    private final AtomicBoolean hasError = new AtomicBoolean(false);
    private final AtomicBoolean hasMore = new AtomicBoolean(false);
    private final PublishSubject historyItemClickedSubject = PublishSubject.create();
    private final LayoutInflater inflater;
    private final PublishSubject retryItemClickedSubject = PublishSubject.create();
    private final List rides = new ArrayList(0);

    public PassengerRideHistoryAdapter(LayoutInflater layoutinflater)
    {
        Preconditions.checkNotNull(layoutinflater);
        inflater = layoutinflater;
    }

    public void addItems(List list)
    {
        rides.addAll(list);
        notifyDataSetChanged();
    }

    public List getData()
    {
        return rides;
    }

    public int getItemCount()
    {
        int j = rides.size();
        int i = j;
        if (hasMore.get())
        {
            i = j + 1;
        }
        return i;
    }

    public int getItemViewType(int i)
    {
        Type type;
        if (hasMore.get() && i == getItemCount() - 1)
        {
            if (hasError.get())
            {
                type = Type.ERROR;
            } else
            {
                type = Type.LOADING;
            }
        } else
        {
            type = Type.HISTORY;
        }
        return type.ordinal();
    }

    public boolean hasMore()
    {
        return hasMore.get();
    }

    public Observable observeItemClicks()
    {
        return historyItemClickedSubject.asObservable();
    }

    public Observable observeRetryClicks()
    {
        return retryItemClickedSubject.asObservable();
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        if (viewholder instanceof RideHistoryViewHolder)
        {
            viewholder = (RideHistoryViewHolder)viewholder;
            final PassengerRideHistoryItem passengerRideHistoryItem = (PassengerRideHistoryItem)rides.get(i);
            viewholder.bindItem(passengerRideHistoryItem);
            ((RideHistoryViewHolder) (viewholder)).view.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideHistoryAdapter this$0;
                final PassengerRideHistoryItem val$passengerRideHistoryItem;

                public void onClick(View view)
                {
                    historyItemClickedSubject.onNext(passengerRideHistoryItem);
                }

            
            {
                this$0 = PassengerRideHistoryAdapter.this;
                passengerRideHistoryItem = passengerridehistoryitem;
                super();
            }
            });
        } else
        if (viewholder instanceof RetryViewItemHolder)
        {
            ((RetryViewItemHolder)viewholder).itemView.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideHistoryAdapter this$0;

                public void onClick(View view)
                {
                    retryItemClickedSubject.onNext(Unit.create());
                }

            
            {
                this$0 = PassengerRideHistoryAdapter.this;
                super();
            }
            });
            return;
        }
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        Type type = Type.values()[i];
        if (type == Type.HISTORY)
        {
            return new RideHistoryViewHolder((PassengerRideHistoryItemView)inflater.inflate(0x7f0300cc, viewgroup, false));
        }
        if (type == Type.LOADING)
        {
            return new LoadingViewItemHolder(inflater.inflate(0x7f0300cd, viewgroup, false));
        }
        if (type == Type.ERROR)
        {
            return new RetryViewItemHolder(inflater.inflate(0x7f0300d1, viewgroup, false));
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("unsupported type ").append(type).toString());
        }
    }

    public void setHasError(boolean flag)
    {
        if (hasError.getAndSet(flag) != flag)
        {
            notifyDataSetChanged();
        }
    }

    public void setHasMore(boolean flag)
    {
        if (hasMore.getAndSet(flag) != flag)
        {
            notifyDataSetChanged();
        }
    }

    public void setItems(List list)
    {
        rides.clear();
        addItems(list);
    }



    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type ERROR;
        public static final Type HISTORY;
        public static final Type LOADING;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(me/lyft/android/ui/ridehistory/PassengerRideHistoryAdapter$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            LOADING = new Type("LOADING", 0);
            HISTORY = new Type("HISTORY", 1);
            ERROR = new Type("ERROR", 2);
            $VALUES = (new Type[] {
                LOADING, HISTORY, ERROR
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private class RideHistoryViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public PassengerRideHistoryItemView view;

        public void bindItem(PassengerRideHistoryItem passengerridehistoryitem)
        {
            view.setItem(passengerridehistoryitem);
        }

        public RideHistoryViewHolder(PassengerRideHistoryItemView passengerridehistoryitemview)
        {
            super(passengerridehistoryitemview);
            view = passengerridehistoryitemview;
        }
    }


    private class RetryViewItemHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        View itemView;

        public RetryViewItemHolder(View view)
        {
            super(view);
            itemView = view;
        }
    }


    private class LoadingViewItemHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public LoadingViewItemHolder(View view)
        {
            super(view);
        }
    }

}

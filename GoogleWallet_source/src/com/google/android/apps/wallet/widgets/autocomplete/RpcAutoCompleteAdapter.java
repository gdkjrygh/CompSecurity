// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.autocomplete;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.common.collect.ImmutableList;
import java.util.List;

public abstract class RpcAutoCompleteAdapter extends ArrayAdapter
{
    public static final class GetSuggestionsException extends Exception
    {

        public GetSuggestionsException(Throwable throwable)
        {
            super(throwable);
        }
    }

    final class RpcFilter extends Filter
    {

        final RpcAutoCompleteAdapter this$0;

        protected final android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
        {
            Object obj;
            Object obj1;
            try
            {
                threadChecker;
                ThreadChecker.checkOnBackgroundThread();
                obj1 = RpcAutoCompleteAdapter.this;
            }
            catch (GetSuggestionsException getsuggestionsexception)
            {
                String s = RpcAutoCompleteAdapter.TAG;
                charsequence = String.valueOf(charsequence);
                WLog.e(s, (new StringBuilder(String.valueOf(charsequence).length() + 55)).append("Could not get autocomplete suggestions for constraint: ").append(charsequence).toString(), getsuggestionsexception);
                return null;
            }
            if (charsequence != null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            obj = "";
            obj = ImmutableList.copyOf(((RpcAutoCompleteAdapter) (obj1)).getSuggestions(((String) (obj))));
            obj1 = new android.widget.Filter.FilterResults();
            obj1.values = obj;
            obj1.count = ((ImmutableList) (obj)).size();
            return ((android.widget.Filter.FilterResults) (obj1));
            obj = charsequence.toString();
            break MISSING_BLOCK_LABEL_23;
        }

        protected final void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
        {
label0:
            {
                ThreadChecker _tmp = threadChecker;
                ThreadChecker.checkOnUiThread();
                if (filterresults != null)
                {
                    if (filterresults.values == null)
                    {
                        break label0;
                    }
                    charsequence = (List)filterresults.values;
                    reset(charsequence);
                }
                return;
            }
            charsequence = RpcAutoCompleteAdapter.TAG;
            int i = filterresults.count;
            WLog.e(charsequence, (new StringBuilder(56)).append("Received results with null for values, count=").append(i).toString());
        }

        private RpcFilter()
        {
            this$0 = RpcAutoCompleteAdapter.this;
            super();
        }

    }


    private static final String TAG = com/google/android/apps/wallet/widgets/autocomplete/RpcAutoCompleteAdapter.getSimpleName();
    private final RpcFilter rpcFilter = new RpcFilter();
    private final ThreadChecker threadChecker;

    public RpcAutoCompleteAdapter(Context context, ThreadChecker threadchecker)
    {
        super(context, 0x109000a);
        threadChecker = threadchecker;
    }

    private void reset(List list)
    {
        setNotifyOnChange(false);
        clear();
        addAll(list);
        notifyDataSetChanged();
    }

    public Filter getFilter()
    {
        return rpcFilter;
    }

    protected abstract List getSuggestions(String s)
        throws GetSuggestionsException;




}

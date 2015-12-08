// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.android.apps.wallet.wobs.list.WoblListAdapter;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import com.google.commerce.wobs.common.Entrypoint;
import com.google.commerce.wobs.common.uri.WobUris;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.wallet.wobl.exception.WoblException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

public class WobListAdapter extends BaseAdapter
    implements WoblListAdapter
{
    final class WobListItem
    {

        final WobListAdapter this$0;
        final com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;
        final WoblHolder woblHolder;

        WobListItem(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
        {
            this$0 = WobListAdapter.this;
            super();
            wobInstance = wobinstance;
            woblHolder = createWoblHolder(wobinstance);
        }
    }


    private static final Function SORT_KEY_FUNCTION = new Function() {

        private static String apply(WobListItem woblistitem)
        {
            return woblistitem.wobInstance.sortKey;
        }

        public final volatile Object apply(Object obj)
        {
            return apply((WobListItem)obj);
        }

    };
    private static final String TAG = com/google/android/apps/wallet/wobs/WobListAdapter.getSimpleName();
    private final Context context;
    private boolean hasError;
    private final LayoutMatcher layoutMatcher;
    private final List listItems = Lists.newArrayList();
    private final Provider woblHolderProvider;

    public WobListAdapter(FragmentActivity fragmentactivity, Provider provider, LayoutMatcher layoutmatcher)
    {
        hasError = false;
        context = fragmentactivity;
        woblHolderProvider = provider;
        layoutMatcher = layoutmatcher;
    }

    private WoblHolder createWoblHolder(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        Object obj = layoutMatcher.getLayoutForListView(wobinstance.renderOutput);
        if (obj != null)
        {
            WoblHolder woblholder = (WoblHolder)woblHolderProvider.get();
            woblholder.setSource(((com.google.wallet.proto.NanoWalletWobl.Layout) (obj)), WobUris.getWobHolderInstanceEntrypointUri(wobinstance.id, Entrypoint.LIST));
            return woblholder;
        }
        notifyError();
        obj = TAG;
        wobinstance = String.valueOf(wobinstance.id);
        if (wobinstance.length() != 0)
        {
            wobinstance = "No layout for entrypoint g_list in instance ".concat(wobinstance);
        } else
        {
            wobinstance = new String("No layout for entrypoint g_list in instance ");
        }
        WLog.e(((String) (obj)), wobinstance);
        return null;
    }

    private void insertInstance(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        for (int i = 0; i < listItems.size(); i++)
        {
            String s = ((WobListItem)listItems.get(i)).wobInstance.sortKey;
            if (s == null || s.compareTo(wobinstance.sortKey) >= 0)
            {
                listItems.add(i, new WobListItem(wobinstance));
                return;
            }
        }

        listItems.add(new WobListItem(wobinstance));
    }

    private void notifyError()
    {
        if (!hasError)
        {
            Toasts.show(context, com.google.android.apps.walletnfcrel.R.string.wobs_list_error);
        }
        hasError = true;
    }

    public final void addInstances(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            WobListItem woblistitem = new WobListItem((com.google.wallet.proto.NanoWalletObjects.WobInstance)list.next());
            if (woblistitem.woblHolder != null)
            {
                arraylist.add(woblistitem);
            }
        } while (true);
        list = Ordering.natural().nullsLast().onResultOf(SORT_KEY_FUNCTION).sortedCopy(arraylist);
        listItems.addAll(list);
        notifyDataSetChanged();
    }

    public final void clear()
    {
        setInstances(Collections.emptyList());
    }

    public final void deleteWobById(String s)
    {
        Iterator iterator = listItems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!s.equals(((WobListItem)iterator.next()).wobInstance.id))
            {
                continue;
            }
            iterator.remove();
            notifyDataSetChanged();
            break;
        } while (true);
    }

    public int getCount()
    {
        return listItems.size();
    }

    public Object getItem(int i)
    {
        return ((WobListItem)listItems.get(i)).wobInstance;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        try
        {
            view = ((WobListItem)listItems.get(i)).woblHolder.getView();
            view.setOnClickListener(null);
            view.setClickable(false);
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            String s = TAG;
            view = String.valueOf(((WobListItem)listItems.get(i)).wobInstance.id);
            if (view.length() != 0)
            {
                view = "Error rendering ".concat(view);
            } else
            {
                view = new String("Error rendering ");
            }
            WLog.e(s, view, viewgroup);
            notifyError();
            view = new View(context);
            view.setVisibility(8);
            return view;
        }
        return view;
    }

    public final void setInstances(List list)
    {
        listItems.clear();
        addInstances(list);
    }

    public final void upsertInstance(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        for (int i = 0; i < listItems.size(); i++)
        {
            if (wobinstance.id.equals(((WobListItem)listItems.get(i)).wobInstance.id))
            {
                listItems.remove(i);
                listItems.add(i, new WobListItem(wobinstance));
                notifyDataSetChanged();
                return;
            }
        }

        insertInstance(wobinstance);
    }


}

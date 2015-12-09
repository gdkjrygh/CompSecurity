// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.wallet.wobs.wobl.protorenderer.ProtoWoblRenderer;
import com.google.android.apps.wallet.wobs.wobl.view.WoblFetchedImageView;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.wobs.list:
//            WoblListAdapter, LayoutMatcher

public class FastWoblListAdapter extends BaseAdapter
    implements WoblListAdapter
{
    static final class Fingerprint
    {

        final byte bytes[];

        public final boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            } else
            {
                obj = (Fingerprint)obj;
                return Arrays.equals(bytes, ((Fingerprint) (obj)).bytes);
            }
        }

        public final int hashCode()
        {
            return Arrays.hashCode(bytes);
        }

        Fingerprint(byte abyte0[])
        {
            bytes = abyte0;
        }
    }

    public static final class ListItem
    {

        final String entityId;
        final Fingerprint fingerprint;
        final com.google.wallet.proto.NanoCompiledWobl.Layout layout;
        final String sortKey;

        public final String getEntityId()
        {
            return entityId;
        }

        public ListItem(String s, com.google.wallet.proto.NanoCompiledWobl.Layout layout1, byte abyte0[], String s1)
        {
            entityId = s;
            layout = layout1;
            fingerprint = new Fingerprint(abyte0);
            sortKey = s1;
        }
    }


    private static final Ordering ORDERING_BY_SORT_KEY = Ordering.natural().nullsLast().onResultOf(new Function() {

        private static Comparable apply(ListItem listitem)
        {
            return listitem.sortKey;
        }

        public final volatile Object apply(Object obj)
        {
            return apply((ListItem)obj);
        }

    });
    private boolean forceSquareImageViews;
    private final LayoutMatcher layoutMatcher;
    private final List listItems = Lists.newArrayList();
    private final Map viewTypes = Maps.newHashMap();
    private final ProtoWoblRenderer woblRenderer;

    public FastWoblListAdapter(ProtoWoblRenderer protowoblrenderer, LayoutMatcher layoutmatcher)
    {
        woblRenderer = protowoblrenderer;
        layoutMatcher = layoutmatcher;
    }

    private void addItems(List list)
    {
        list = ORDERING_BY_SORT_KEY.sortedCopy(list);
        listItems.addAll(list);
        for (list = list.iterator(); list.hasNext(); addViewTypeIfNecessary(((ListItem)list.next()).fingerprint)) { }
        notifyDataSetChanged();
    }

    private void addViewTypeIfNecessary(Fingerprint fingerprint)
    {
        if (!viewTypes.containsKey(fingerprint))
        {
            int i = viewTypes.size();
            viewTypes.put(fingerprint, Integer.valueOf(i));
        }
    }

    private ListItem convertToListItem(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        com.google.wallet.proto.NanoWalletWobl.Layout layout = layoutMatcher.getLayoutForListView(wobinstance.renderOutput);
        if (layout != null)
        {
            return new ListItem(wobinstance.id, layout.compiledWobl, layout.compiledWoblFingerprint, wobinstance.sortKey);
        } else
        {
            return null;
        }
    }

    private List convertToListItems(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ListItem listitem = convertToListItem((com.google.wallet.proto.NanoWalletObjects.WobInstance)list.next());
            if (listitem != null)
            {
                arraylist.add(listitem);
            }
        } while (true);
        return arraylist;
    }

    private static void forceSquareAspectRatioForImageViews(View view)
    {
        if (!(view instanceof WoblFetchedImageView)) goto _L2; else goto _L1
_L1:
        ((WoblFetchedImageView)view).setForceSquareAspectRatio(true);
_L4:
        return;
_L2:
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int i = 0;
            while (i < view.getChildCount()) 
            {
                forceSquareAspectRatioForImageViews(view.getChildAt(i));
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ListItem getItem(int i)
    {
        return (ListItem)listItems.get(i);
    }

    public final void addInstances(List list)
    {
        addItems(convertToListItems(list));
    }

    public final void clear()
    {
        viewTypes.clear();
        setItems(Collections.emptyList());
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
            if (!s.equals(((ListItem)iterator.next()).entityId))
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

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        ListItem listitem = (ListItem)listItems.get(i);
        return ((Integer)viewTypes.get(listitem.fingerprint)).intValue();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (ListItem)listItems.get(i);
        if (view == null) goto _L2; else goto _L1
_L1:
        woblRenderer.applyWobl(((ListItem) (viewgroup)).layout, view);
_L4:
        view.setOnClickListener(null);
        view.setClickable(false);
        return view;
_L2:
        viewgroup = woblRenderer.render(((ListItem) (viewgroup)).layout);
        view = viewgroup;
        if (forceSquareImageViews)
        {
            forceSquareAspectRatioForImageViews(viewgroup);
            view = viewgroup;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getViewTypeCount()
    {
        return Math.max(1, viewTypes.size());
    }

    public final void setInstances(List list)
    {
        setItems(convertToListItems(list));
    }

    public final void setItems(List list)
    {
        listItems.clear();
        addItems(list);
    }

    public final void upsertInstance(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < listItems.size())
                {
                    if (!wobinstance.id.equals(((ListItem)listItems.get(i)).entityId))
                    {
                        break label0;
                    }
                    listItems.remove(i);
                }
                wobinstance = convertToListItem(wobinstance);
                int j = ORDERING_BY_SORT_KEY.binarySearch(listItems, wobinstance);
                i = j;
                if (j < 0)
                {
                    i = -j - 1;
                }
                listItems.add(i, wobinstance);
                addViewTypeIfNecessary(((ListItem) (wobinstance)).fingerprint);
                notifyDataSetChanged();
                return;
            }
            i++;
        } while (true);
    }

}

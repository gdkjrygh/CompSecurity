// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tile;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.tile:
//            Tile, HeaderTile

public class TileManager
{
    public static final class TileSpec
    {

        public boolean inserted;
        public final Tile tile;

        public TileSpec(Tile tile1)
        {
            tile = (Tile)Preconditions.checkNotNull(tile1);
        }
    }


    public static final String TAG = com/google/android/apps/wallet/tile/TileManager.getSimpleName();
    private boolean active;
    private final Activity activity;
    private final Tile.TileDismissedListener tileDismissedListener = new Tile.TileDismissedListener() {

        final TileManager this$0;

        public final void onTileDismissed(Tile tile)
        {
            View view = tile.getView();
            int i = view.getContext().getResources().getInteger(0x10e0001);
            view.postDelayed(tile. new Runnable() {

                final _cls1 this$1;
                final Tile val$tile;

                public final void run()
                {
                    if (tiles.containsKey(tile))
                    {
                        remove(tile);
                    }
                }

            
            {
                this$1 = final__pcls1;
                tile = Tile.this;
                super();
            }
            }, i);
        }

            
            {
                this$0 = TileManager.this;
                super();
            }
    };
    private final Map tiles = Maps.newLinkedHashMap();

    TileManager(Activity activity1)
    {
        activity = activity1;
    }

    private void add(Tile tile, ViewGroup viewgroup, ViewGroup viewgroup1, boolean flag)
    {
        tile = new TileSpec(tile);
        ((TileSpec) (tile)).tile.addTileDismissedListener(tileDismissedListener);
        boolean flag1;
        if ((TileSpec)tiles.put(((TileSpec) (tile)).tile, tile) == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1, "Must not add a tile multiple times");
        if (active)
        {
            if (!flag)
            {
                viewgroup1 = viewgroup;
            }
            addTileToView(tile, viewgroup1);
            ((TileSpec) (tile)).tile.onActivate();
        }
    }

    private static void addTileToView(TileSpec tilespec, ViewGroup viewgroup)
    {
        View view = tilespec.tile.onCreateView(viewgroup);
        viewgroup.addView(view);
        tilespec.tile.setView(view);
        tilespec.inserted = true;
    }

    private static Predicate placedTiles()
    {
        return new Predicate() {

            private static boolean apply(Tile tile)
            {
                return tile.shouldShow();
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((Tile)obj);
            }

        };
    }

    private void remove(Tile tile)
    {
        Preconditions.checkArgument(tiles.containsKey(tile), "Can't remove unregistered tile.");
        removeTileFromView(tile);
        tiles.remove(tile);
    }

    private void removeTileFromView(Tile tile)
    {
        if (active)
        {
            tile.onDeactivate();
        }
        if (((TileSpec)tiles.get(tile)).inserted)
        {
            tile = tile.getView();
            ViewGroup viewgroup = (ViewGroup)tile.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(tile);
            }
        }
    }

    public final void activateTiles(ViewGroup viewgroup, ViewGroup viewgroup1)
    {
        active = true;
        boolean flag = true;
        Iterator iterator = tiles.values().iterator();
        while (iterator.hasNext()) 
        {
            TileSpec tilespec = (TileSpec)iterator.next();
            if (!tilespec.inserted)
            {
                ViewGroup viewgroup2;
                if (flag && (tilespec.tile instanceof HeaderTile))
                {
                    viewgroup2 = viewgroup1;
                } else
                {
                    viewgroup2 = viewgroup;
                }
                addTileToView(tilespec, viewgroup2);
            }
            tilespec.tile.onActivate();
            flag = false;
        }
    }

    public final void deactivateTiles()
    {
        active = false;
        for (Iterator iterator = tiles.values().iterator(); iterator.hasNext(); ((TileSpec)iterator.next()).tile.onDeactivate()) { }
    }

    public final HeaderTile getHeaderTile()
    {
        if (tiles.isEmpty())
        {
            return null;
        }
        Tile tile = (Tile)tiles.keySet().iterator().next();
        if (tile instanceof HeaderTile)
        {
            return (HeaderTile)tile;
        } else
        {
            return null;
        }
    }

    final int getTileTopPosition(String s)
    {
        byte byte0 = -1;
        Iterator iterator = tiles.keySet().iterator();
        int i;
        do
        {
            i = byte0;
            if (!iterator.hasNext())
            {
                break;
            }
            Tile tile = (Tile)iterator.next();
            if (!s.equals(tile.getAnchor()))
            {
                continue;
            }
            s = (ViewGroup)tile.getView();
            i = byte0;
            if (s.getVisibility() == 0)
            {
                i = s.getTop();
            }
            break;
        } while (true);
        return i;
    }

    public final boolean hasHeader()
    {
        return getHeaderTile() != null;
    }

    public final void placeTiles(Iterable iterable, ViewGroup viewgroup, ViewGroup viewgroup1)
    {
        iterable = Iterables.filter(iterable, placedTiles());
        if (!Iterables.elementsEqual(iterable, tiles.keySet()))
        {
            WLog.v(TAG, "Tile placement changed.");
            removeAll();
            boolean flag = true;
            iterable = iterable.iterator();
            while (iterable.hasNext()) 
            {
                Tile tile = (Tile)iterable.next();
                boolean flag1;
                if (flag && (tile instanceof HeaderTile))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                add(tile, viewgroup, viewgroup1, flag1);
                flag = false;
            }
        }
    }

    public final void removeAll()
    {
        for (Iterator iterator = tiles.keySet().iterator(); iterator.hasNext(); iterator.remove())
        {
            removeTileFromView((Tile)iterator.next());
        }

    }

    public final void scrollToTile(final String anchor, final int containerViewId, int i)
    {
        final ScrollView scrollView = (ScrollView)Views.findViewById(activity, i);
        scrollView.post(new Runnable() {

            final TileManager this$0;
            final String val$anchor;
            final int val$containerViewId;
            final ScrollView val$scrollView;

            public final void run()
            {
                int j = getTileTopPosition(anchor);
                if (j >= 0)
                {
                    int k = Views.findViewById(activity, containerViewId).getTop();
                    scrollView.scrollTo(0, k + j);
                }
            }

            
            {
                this$0 = TileManager.this;
                anchor = s;
                containerViewId = i;
                scrollView = scrollview;
                super();
            }
        });
    }




}

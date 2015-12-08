// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import com.google.protobuf.nano.MessageNano;
import com.google.wallet.wobl.exception.WoblException;
import java.util.Arrays;

public class WoblTileFactory
{
    public static final class WoblTile extends Tile
    {

        private final AnalyticsUtil analyticsUtil;
        private final String anchor;
        private final String equalityId;
        private boolean hasReportedAnalyticsImpression;
        private final com.google.wallet.proto.api.NanoWalletMywallet.WalletTile walletTile;
        private final View woblView;

        public final boolean canDismiss(Object obj)
        {
            return walletTile.isDismissible.booleanValue();
        }

        public final String getAnchor()
        {
            return anchor;
        }

        protected final String getEqualityId()
        {
            return equalityId;
        }

        public final String getServerId()
        {
            return walletTile.walletTileId;
        }

        public final View onCreateView(ViewGroup viewgroup)
        {
            if (walletTile.impressionEvent != null && !hasReportedAnalyticsImpression)
            {
                analyticsUtil.sendNonInteractionEventFromProto(walletTile.impressionEvent);
            }
            hasReportedAnalyticsImpression = true;
            return woblView;
        }

        public final boolean shouldShow()
        {
            return true;
        }

        public WoblTile(Activity activity, View view, com.google.wallet.proto.api.NanoWalletMywallet.WalletTile wallettile, String s, AnalyticsUtil analyticsutil)
        {
            super(activity);
            hasReportedAnalyticsImpression = false;
            woblView = view;
            walletTile = wallettile;
            anchor = s;
            analyticsUtil = analyticsutil;
            int i = Arrays.hashCode(MessageNano.toByteArray(wallettile.woblTileDetails));
            activity = String.valueOf(wallettile.walletTileId);
            equalityId = (new StringBuilder(String.valueOf(activity).length() + 11)).append(activity).append(i).toString();
            view.setOnTouchListener(touchListener);
        }
    }


    private final AnalyticsUtil analyticsUtil;
    private final Activity context;
    private final LayoutMatcher layoutMatcher;
    private final WoblHolder woblHolder;

    public WoblTileFactory(Activity activity, WoblHolder woblholder, LayoutMatcher layoutmatcher, AnalyticsUtil analyticsutil)
    {
        context = activity;
        woblHolder = woblholder;
        layoutMatcher = layoutmatcher;
        analyticsUtil = analyticsutil;
    }

    public final Tile create(final com.google.wallet.proto.api.NanoWalletMywallet.WalletTile walletTile, String s, com.google.android.apps.wallet.tile.Tile.TileDismissedListener tiledismissedlistener)
        throws WoblException
    {
        com.google.wallet.proto.NanoWalletWobl.Layout layout = layoutMatcher.getLayoutForEntrypoint(walletTile.woblTileDetails.woblRenderableItem.renderOutput, new String[] {
            "g_my_wallet_tile", "g_here_and_now", "g_list"
        });
        if (layout == null)
        {
            throw new WoblException("No layout found in RenderOutput!");
        } else
        {
            WoblHolder woblholder = woblHolder;
            woblholder.setSource(layout, null);
            s = new WoblTile(context, woblholder.getView(), walletTile, s, analyticsUtil);
            s.addTileDismissedListener(tiledismissedlistener);
            s.addTileDismissedListener(new com.google.android.apps.wallet.tile.Tile.TileDismissedListener() {

                final WoblTileFactory this$0;
                final com.google.wallet.proto.api.NanoWalletMywallet.WalletTile val$walletTile;

                public final void onTileDismissed(Tile tile)
                {
                    if (walletTile.dismissEvent != null)
                    {
                        analyticsUtil.sendEventFromProto(walletTile.dismissEvent);
                    }
                }

            
            {
                this$0 = WoblTileFactory.this;
                walletTile = wallettile;
                super();
            }
            });
            return s;
        }
    }

}

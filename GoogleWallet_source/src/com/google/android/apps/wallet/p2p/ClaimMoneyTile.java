// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.p2p.api.P2pApi;
import com.google.android.apps.wallet.p2p.people.ContactsUtil;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.roundedimage.RoundedImage;
import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimablePurchaseRecordEvent

public class ClaimMoneyTile extends Tile
{

    private final AnalyticsUtil analyticsUtil;
    private final ContactsUtil contactsUtil;
    private final EventBus eventBus;
    private boolean hasReportedAnalyticsImpression;

    public ClaimMoneyTile(Activity activity, EventBus eventbus, ContactsUtil contactsutil, AnalyticsUtil analyticsutil)
    {
        super(activity);
        hasReportedAnalyticsImpression = false;
        eventBus = eventbus;
        contactsUtil = contactsutil;
        analyticsUtil = analyticsutil;
    }

    private View createViewForPurchaseRecord(PurchaseRecord purchaserecord)
    {
        View view = LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.claim_money_tile_item, null);
        String s1 = purchaserecord.getCounterPartyEmail();
        String s;
        if (purchaserecord.getDisplayableAmount().isPresent())
        {
            s = (String)purchaserecord.getDisplayableAmount().get();
        } else
        {
            s = "";
        }
        s = context.getString(com.google.android.apps.walletnfcrel.R.string.claim_money_sent_you, new Object[] {
            purchaserecord.getSenderDisplayName(context.getString(com.google.android.apps.walletnfcrel.R.string.claim_money_empty_sender_name_sentence_start)), s
        });
        ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.SenderAndAmount)).setText(s);
        ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.Memo)).setText(purchaserecord.getMemo());
        purchaserecord = contactsUtil.getProfilePhotoFor(s1);
        ((RoundedImage)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SenderPhoto)).setImage(purchaserecord);
        return view;
    }

    public static boolean shouldShowOn(ClaimablePurchaseRecordEvent claimablepurchaserecordevent)
    {
        claimablepurchaserecordevent = claimablepurchaserecordevent.getPurchaseRecords();
        return claimablepurchaserecordevent != null && claimablepurchaserecordevent.size() > 0;
    }

    public final boolean canDismiss(Object obj)
    {
        return false;
    }

    public final String getAnchor()
    {
        return "claimmoney";
    }

    protected final void onActivate()
    {
        super.onActivate();
        getView().setVisibility(8);
        eventBus.register(this);
    }

    public void onClaimablePurchaseRecordEvent(ClaimablePurchaseRecordEvent claimablepurchaserecordevent)
    {
        if (shouldShowOn(claimablepurchaserecordevent))
        {
            Object obj = claimablepurchaserecordevent.getPurchaseRecords();
            claimablepurchaserecordevent = (LinearLayout)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.PendingClaimList);
            claimablepurchaserecordevent.removeAllViews();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); claimablepurchaserecordevent.addView(createViewForPurchaseRecord((PurchaseRecord)((Iterator) (obj)).next()))) { }
            getView().setVisibility(0);
            if (!hasReportedAnalyticsImpression)
            {
                analyticsUtil.sendImpression("ClaimMoneyTile", new AnalyticsCustomDimension[0]);
                hasReportedAnalyticsImpression = true;
            }
            return;
        } else
        {
            getView().setVisibility(8);
            return;
        }
    }

    public final View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.claim_money_tile, viewgroup, false);
        ((Button)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.ClaimMoneyLink)).setOnClickListener(new android.view.View.OnClickListener() {

            final ClaimMoneyTile this$0;

            public final void onClick(View view)
            {
                analyticsUtil.sendLinkTap("ClaimMoneyTile", new AnalyticsCustomDimension[0]);
                
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = ClaimMoneyTile.this;
                super();
            }
        });
        return viewgroup;
    }

    protected final void onDeactivate()
    {
        onDeactivate();
        eventBus.unregisterAll(this);
    }

    public final boolean shouldShow()
    {
        return true;
    }



}

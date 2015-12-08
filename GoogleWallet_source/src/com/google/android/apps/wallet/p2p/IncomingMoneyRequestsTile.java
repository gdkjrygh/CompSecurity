// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.purchaserecord.IncomingMoneyRequestsEvent;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SenderRowView, IncomingMoneyRequestView

public class IncomingMoneyRequestsTile extends Tile
{

    private static final String TAG = com/google/android/apps/wallet/p2p/IncomingMoneyRequestsTile.getSimpleName();
    private final AnalyticsUtil analyticsUtil;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private boolean hasReportedAnalyticsImpression;
    private final TransferApi transferApi;

    public IncomingMoneyRequestsTile(Activity activity, EventBus eventbus, FeatureManager featuremanager, TransferApi transferapi, AnalyticsUtil analyticsutil)
    {
        super(activity);
        hasReportedAnalyticsImpression = false;
        eventBus = eventbus;
        featureManager = featuremanager;
        transferApi = transferapi;
        analyticsUtil = analyticsutil;
    }

    private List getRequesterEmails(List list)
    {
        return Lists.transform(list, new Function() {

            final IncomingMoneyRequestsTile this$0;

            private static String apply(PurchaseRecord purchaserecord)
            {
                return purchaserecord.getCounterPartyEmail();
            }

            public final volatile Object apply(Object obj)
            {
                return apply((PurchaseRecord)obj);
            }

            
            {
                this$0 = IncomingMoneyRequestsTile.this;
                super();
            }
        });
    }

    private void renderMultipleRequests(List list)
    {
        View view = getView();
        Object obj = (SenderRowView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.RequesterPhotos);
        List list1 = getRequesterEmails(list);
        ((SenderRowView) (obj)).setSenders(list1);
        obj = new HashSet(list1);
        Activity activity = context;
        int i;
        if (list1.size() == ((Set) (obj)).size())
        {
            i = com.google.android.apps.walletnfcrel.R.string.money_requests_from_multiple;
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.string.money_requests_from_multiple_duplicate;
        }
        list = activity.getString(i, new Object[] {
            Integer.valueOf(list.size())
        });
        ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.MultiRequestHeader)).setText(list);
        getView().findViewById(com.google.android.apps.walletnfcrel.R.id.MultiRequestLayout).setVisibility(0);
        getView().findViewById(com.google.android.apps.walletnfcrel.R.id.MultiRequestLayout).setOnClickListener(new android.view.View.OnClickListener() {

            final IncomingMoneyRequestsTile this$0;

            public final void onClick(View view1)
            {
                analyticsUtil.sendLinkTap("IncomingMoneyRequestsTile", new AnalyticsCustomDimension[0]);
                
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = IncomingMoneyRequestsTile.this;
                super();
            }
        });
        getView().findViewById(com.google.android.apps.walletnfcrel.R.id.SingleRequestLayout).setVisibility(8);
        setTileVisible();
    }

    private void renderSingleRequest(PurchaseRecord purchaserecord)
    {
        IncomingMoneyRequestView incomingmoneyrequestview = (IncomingMoneyRequestView)getView().findViewById(com.google.android.apps.walletnfcrel.R.id.SingleRequestLayout);
        incomingmoneyrequestview.setPurchaseRecord(purchaserecord);
        incomingmoneyrequestview.setVisibility(0);
        getView().findViewById(com.google.android.apps.walletnfcrel.R.id.MultiRequestLayout).setVisibility(8);
        setTileVisible();
    }

    private void setTileVisible()
    {
        getView().setVisibility(0);
        if (hasReportedAnalyticsImpression)
        {
            return;
        } else
        {
            analyticsUtil.sendImpression("IncomingMoneyRequestsTile", new AnalyticsCustomDimension[0]);
            hasReportedAnalyticsImpression = true;
            return;
        }
    }

    protected final void onActivate()
    {
        onActivate();
        getView().setVisibility(8);
        eventBus.register(this);
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.incoming_money_requests_tile, viewgroup, false);
    }

    protected final void onDeactivate()
    {
        onDeactivate();
        eventBus.unregisterAll(this);
    }

    public void onIncomingMoneyRequestsEvent(IncomingMoneyRequestsEvent incomingmoneyrequestsevent)
    {
        if (incomingmoneyrequestsevent.getFailureCause() != null)
        {
            getView().setVisibility(8);
            WLog.e(TAG, "moneyRequests failed", incomingmoneyrequestsevent.getFailureCause());
            return;
        }
        if (incomingmoneyrequestsevent.getIncomingMoneyRequests().size() == 0)
        {
            getView().setVisibility(8);
            return;
        }
        if (incomingmoneyrequestsevent.getIncomingMoneyRequests().size() == 1)
        {
            renderSingleRequest((PurchaseRecord)incomingmoneyrequestsevent.getIncomingMoneyRequests().get(0));
            return;
        } else
        {
            renderMultipleRequests(incomingmoneyrequestsevent.getIncomingMoneyRequests());
            return;
        }
    }

    public final boolean shouldShow()
    {
        return featureManager.isFeatureEnabled(Feature.P2P_REQUEST_PAYMENT);
    }




}

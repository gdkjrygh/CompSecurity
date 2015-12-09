// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.plastic.api.PlasticCard;
import com.google.android.apps.wallet.plastic.api.PlasticCardModel;
import com.google.android.apps.wallet.plastic.api.PlasticCardModelEvent;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Optional;

public class PlasticCardTile extends Tile
    implements com.google.android.apps.wallet.tile.Tile.TileDismissedListener
{

    private final AnalyticsUtil analyticsUtil;
    private TextView body;
    private final DateAndTimeHelper dateAndTimeHelper;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private boolean hasReportedAnalyticsImpression;
    private TextView headline;
    private ImageView image;
    private final NetworkAccessChecker networkAccessChecker;
    private Optional plasticCardModelEvent;
    private final SharedPreferences sharedPreferences;
    private final UriRegistry uriRegistry;
    private View view;

    public PlasticCardTile(Activity activity, EventBus eventbus, FeatureManager featuremanager, NetworkAccessChecker networkaccesschecker, DateAndTimeHelper dateandtimehelper, SharedPreferences sharedpreferences, UriRegistry uriregistry, 
            AnalyticsUtil analyticsutil)
    {
        super(activity);
        plasticCardModelEvent = Optional.absent();
        hasReportedAnalyticsImpression = false;
        eventBus = eventbus;
        featureManager = featuremanager;
        networkAccessChecker = networkaccesschecker;
        dateAndTimeHelper = dateandtimehelper;
        sharedPreferences = sharedpreferences;
        uriRegistry = uriregistry;
        analyticsUtil = analyticsutil;
        addTileDismissedListener(this);
    }

    private com.google.android.apps.wallet.plastic.api.PlasticCard.Status getCardStatus()
    {
        if (!plasticCardModelEvent.isPresent() || ((PlasticCardModelEvent)plasticCardModelEvent.get()).getFailureCause() != null)
        {
            return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.UNKNOWN;
        }
        PlasticCardModel plasticcardmodel = ((PlasticCardModelEvent)plasticCardModelEvent.get()).getModel();
        if (plasticcardmodel == null)
        {
            return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.UNKNOWN;
        }
        if (!plasticcardmodel.hasCard())
        {
            return com.google.android.apps.wallet.plastic.api.PlasticCard.Status.NOT_REQUESTED;
        } else
        {
            return plasticcardmodel.getCard().getStatus();
        }
    }

    private void renderDeactivated()
    {
        com.google.android.apps.wallet.plastic.api.PlasticCard.Status status = getCardStatus();
        if (status != com.google.android.apps.wallet.plastic.api.PlasticCard.Status.SUSPENDED) goto _L2; else goto _L1
_L1:
        headline.setText(com.google.android.apps.walletnfcrel.R.string.suspended_plastic_card_headline);
        body.setText(com.google.android.apps.walletnfcrel.R.string.suspended_plastic_card_body);
        image.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_error_color_40dp);
_L4:
        view.setOnClickListener(new android.view.View.OnClickListener() );
        return;
_L2:
        if (status == com.google.android.apps.wallet.plastic.api.PlasticCard.Status.CANCELED)
        {
            headline.setText(com.google.android.apps.walletnfcrel.R.string.canceled_plastic_card_headline);
            body.setText(com.google.android.apps.walletnfcrel.R.string.canceled_plastic_card_body);
            image.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_error_color_40dp);
        } else
        if (status == com.google.android.apps.wallet.plastic.api.PlasticCard.Status.LOCKED)
        {
            headline.setText(com.google.android.apps.walletnfcrel.R.string.locked_plastic_card_headline);
            Object obj = ((PlasticCardModelEvent)plasticCardModelEvent.get()).getModel().getCard().getLockTimestamp();
            TextView textview = body;
            if (obj == null)
            {
                obj = context.getString(com.google.android.apps.walletnfcrel.R.string.locked_plastic_card_body_no_date);
            } else
            {
                obj = context.getString(com.google.android.apps.walletnfcrel.R.string.locked_plastic_card_body, new Object[] {
                    dateAndTimeHelper.formatDate(((Long) (obj)).longValue(), true)
                });
            }
            textview.setText(((CharSequence) (obj)));
            image.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_wallet_lock_color_40x55dp);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void renderOrder()
    {
        image.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_gwc_color_40dp);
        image.setVisibility(0);
        headline.setText(com.google.android.apps.walletnfcrel.R.string.order_plastic_card_tile_title);
        body.setText(com.google.android.apps.walletnfcrel.R.string.order_plastic_card_tile_message);
        view.setOnClickListener(new android.view.View.OnClickListener() );
    }

    private void renderRequested()
    {
        Object obj = ((PlasticCardModelEvent)plasticCardModelEvent.get()).getModel().getCard();
        image.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_gwc_color_40dp);
        if (((PlasticCard) (obj)).hasShippingTimeMillis() && ((PlasticCard) (obj)).hasEstimatedDeliveryDays())
        {
            headline.setText(context.getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_headline_sent, new Object[] {
                dateAndTimeHelper.formatDate(((PlasticCard) (obj)).getShippingTimeMillis(), false)
            }));
            String s = dateAndTimeHelper.formatIncrementedDate(((PlasticCard) (obj)).getShippingTimeMillis(), ((PlasticCard) (obj)).getMinEstimatedDeliveryDays());
            obj = dateAndTimeHelper.formatIncrementedDate(((PlasticCard) (obj)).getShippingTimeMillis(), ((PlasticCard) (obj)).getMaxEstimatedDeliveryDays());
            body.setText(context.getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_body_with_estimated_dates, new Object[] {
                s, obj
            }));
        } else
        if (((PlasticCard) (obj)).hasEstimatedDeliveryDays())
        {
            headline.setText(context.getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_headline_ordered));
            body.setText(context.getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_body_with_estimated_num_days, new Object[] {
                Integer.valueOf(((PlasticCard) (obj)).getMinEstimatedDeliveryDays()), Integer.valueOf(((PlasticCard) (obj)).getMaxEstimatedDeliveryDays())
            }));
        } else
        {
            headline.setText(context.getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_headline_ordered));
            body.setText(context.getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_body_no_eta));
        }
        view.setOnClickListener(new android.view.View.OnClickListener() );
    }

    private void setTileVisible(String s)
    {
        view.setVisibility(0);
        if (hasReportedAnalyticsImpression)
        {
            return;
        } else
        {
            analyticsUtil.sendImpression(s, new AnalyticsCustomDimension[0]);
            hasReportedAnalyticsImpression = true;
            return;
        }
    }

    public final boolean canDismiss(Object obj)
    {
        obj = getCardStatus();
        return obj == com.google.android.apps.wallet.plastic.api.PlasticCard.Status.NOT_REQUESTED || obj == com.google.android.apps.wallet.plastic.api.PlasticCard.Status.CANCELED;
    }

    public final String getAnchor()
    {
        return "card";
    }

    public final void onActivate()
    {
        onActivate();
        eventBus.register(this);
    }

    public final View onCreateView(ViewGroup viewgroup)
    {
        view = context.getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.tile_card, viewgroup, false);
        image = (ImageView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.Icon);
        headline = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.Headline);
        body = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.Body);
        view.setVisibility(8);
        return view;
    }

    public final void onDeactivate()
    {
        onDeactivate();
        eventBus.unregisterAll(this);
    }

    public void onNewPlasticCardModel(PlasticCardModelEvent plasticcardmodelevent)
    {
        plasticCardModelEvent = Optional.of(plasticcardmodelevent);
        plasticcardmodelevent = getCardStatus();
        static final class _cls4
        {

            static final int $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status = new int[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.NOT_REQUESTED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.CANCELED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.REQUESTED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.SUSPENDED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.LOCKED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.google.android.apps.wallet.plastic.api.PlasticCard.Status[plasticcardmodelevent.ordinal()])
        {
        default:
            view.setVisibility(8);
            return;

        case 1: // '\001'
            if (((Boolean)SharedPreference.ORDER_PLASTIC_CARD_TILE_DISMISSED.get(sharedPreferences)).booleanValue())
            {
                view.setVisibility(8);
                return;
            } else
            {
                setTileVisible("WalletCardPromoTile");
                renderOrder();
                return;
            }

        case 3: // '\003'
            setTileVisible("WalletCardStatusTile");
            renderRequested();
            return;

        case 2: // '\002'
        case 4: // '\004'
            if (((Boolean)SharedPreference.DEACTIVATED_PLASTIC_CARD_TILE_DISMISSED.get(sharedPreferences)).booleanValue())
            {
                view.setVisibility(8);
                return;
            } else
            {
                setTileVisible("WalletCardStatusTile");
                renderDeactivated();
                return;
            }

        case 5: // '\005'
            setTileVisible("WalletCardStatusTile");
            renderDeactivated();
            return;
        }
    }

    public final void onTileDismissed(Tile tile)
    {
        tile = getCardStatus();
        switch (_cls4..SwitchMap.com.google.android.apps.wallet.plastic.api.PlasticCard.Status[tile.ordinal()])
        {
        default:
            tile = String.valueOf(tile);
            throw new IllegalStateException((new StringBuilder(String.valueOf(tile).length() + 35)).append("Invalid state for dismissing tile: ").append(tile).toString());

        case 1: // '\001'
            analyticsUtil.sendDismissal("WalletCardPromoTile", new AnalyticsCustomDimension[0]);
            SharedPreference.ORDER_PLASTIC_CARD_TILE_DISMISSED.put(sharedPreferences, Boolean.valueOf(true));
            return;

        case 2: // '\002'
            SharedPreference.DEACTIVATED_PLASTIC_CARD_TILE_DISMISSED.put(sharedPreferences, Boolean.valueOf(true));
            break;
        }
        analyticsUtil.sendDismissal("WalletCardStatusTile", new AnalyticsCustomDimension[0]);
    }

    public final boolean shouldShow()
    {
        return featureManager.isFeatureEnabled(Feature.WALLET_CARD);
    }






}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.pin.ResetPinDialog;
import com.google.android.apps.wallet.transfer.ui.P2pHeaderFragment;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import com.google.commerce.wobs.common.Entrypoint;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.wallet.wobl.exception.WoblException;
import com.google.wallet.wobl.exception.WoblParserException;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecord, PurchaseRecordEvent, PurchaseRecordAction, PurchaseRecordRow, 
//            PurchaseRecordDetailRowDisplay

public class PurchaseRecordDetailFragment extends WalletFragment
{
    static interface UiActionListener
    {

        public abstract void onCancelMoneyRequest(PurchaseRecord purchaserecord);

        public abstract void onDeclineMoneyRequest(PurchaseRecord purchaserecord);

        public abstract void onReturnMoneyClicked(PurchaseRecord purchaserecord);

        public abstract void onSendMoneyRequestReminder(PurchaseRecord purchaserecord);

        public abstract void onSettleMoneyRequest(PurchaseRecord purchaserecord);
    }


    private static final String TAG = com/google/android/apps/wallet/purchaserecord/PurchaseRecordDetailFragment.getSimpleName();
    private LinearLayout actionButtonContainer;
    public EventBus eventBus;
    FeatureManager featureManager;
    LayoutMatcher layoutMatcher;
    private ViewGroup p2pHeaderContainer;
    P2pHeaderFragment p2pHeaderFragment;
    private PurchaseRecord purchaseRecord;
    private LinearLayout purchaseRecordContainer;
    private boolean purchaseRecordEventRegistered;
    ResetPinDialog resetPinDialog;
    Provider rowDisplayProvider;
    private final List rows = Lists.newArrayList();
    private UiActionListener uiActionListener;
    UserEventLogger userEventLogger;
    Provider woblHolderProvider;

    public PurchaseRecordDetailFragment()
    {
        purchaseRecordEventRegistered = false;
    }

    private void addCustomActions()
    {
        if (purchaseRecord.getType().intValue() == 12 && purchaseRecord.isPending())
        {
            actionButtonContainer.setVisibility(0);
            View view = LayoutInflater.from(getActivity()).inflate(com.google.android.apps.walletnfcrel.R.layout.button_pair, actionButtonContainer, false);
            Button button = (Button)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.PrimaryButton);
            button.setText(getString(com.google.android.apps.walletnfcrel.R.string.request_money_reminder_button));
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final PurchaseRecordDetailFragment this$0;

                public final void onClick(View view2)
                {
                    analyticsUtil.sendButtonTap("RequestMoneyRemind", new AnalyticsCustomDimension[0]);
                    uiActionListener.onSendMoneyRequestReminder(purchaseRecord);
                }

            
            {
                this$0 = PurchaseRecordDetailFragment.this;
                super();
            }
            });
            button = (Button)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SecondaryButton);
            button.setText(getString(com.google.android.apps.walletnfcrel.R.string.button_cancel));
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final PurchaseRecordDetailFragment this$0;

                public final void onClick(View view2)
                {
                    registerForPurchaseRecordUpdates();
                    uiActionListener.onCancelMoneyRequest(purchaseRecord);
                }

            
            {
                this$0 = PurchaseRecordDetailFragment.this;
                super();
            }
            });
            actionButtonContainer.addView(view);
        } else
        {
            if (purchaseRecord.getType().intValue() == 13 && purchaseRecord.isPending())
            {
                actionButtonContainer.setVisibility(0);
                View view1 = LayoutInflater.from(getActivity()).inflate(com.google.android.apps.walletnfcrel.R.layout.button_pair, actionButtonContainer, false);
                Button button1 = (Button)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.PrimaryButton);
                button1.setText(getString(com.google.android.apps.walletnfcrel.R.string.request_money_settle_up_button));
                button1.setOnClickListener(new android.view.View.OnClickListener() {

                    final PurchaseRecordDetailFragment this$0;

                    public final void onClick(View view2)
                    {
                        uiActionListener.onSettleMoneyRequest(purchaseRecord);
                    }

            
            {
                this$0 = PurchaseRecordDetailFragment.this;
                super();
            }
                });
                button1 = (Button)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.SecondaryButton);
                button1.setText(com.google.android.apps.walletnfcrel.R.string.request_money_decline_button);
                button1.setOnClickListener(new android.view.View.OnClickListener() {

                    final PurchaseRecordDetailFragment this$0;

                    public final void onClick(View view2)
                    {
                        registerForPurchaseRecordUpdates();
                        uiActionListener.onDeclineMoneyRequest(purchaseRecord);
                    }

            
            {
                this$0 = PurchaseRecordDetailFragment.this;
                super();
            }
                });
                actionButtonContainer.addView(view1);
                return;
            }
            if (purchaseRecord.getId() != null && (purchaseRecord.getType().intValue() == 1 || purchaseRecord.getType().intValue() == 6))
            {
                registerForPurchaseRecordUpdates();
                return;
            }
        }
    }

    private static boolean isReturnMoneyUri(Uri uri)
    {
        return UriRegistry.parseVariables(4002, uri) != null;
    }

    private void registerForPurchaseRecordUpdates()
    {
        if (!purchaseRecordEventRegistered)
        {
            eventBus.register(this, com/google/android/apps/wallet/purchaserecord/PurchaseRecordEvent, purchaseRecord.getId(), new EventHandler() {

                final PurchaseRecordDetailFragment this$0;

                private void handleEvent(PurchaseRecordEvent purchaserecordevent)
                {
                    static final class _cls9
                    {

                        static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[];

                        static 
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType = new int[PurchaseRecordEvent.PurchaseRecordEventType.values().length];
                            try
                            {
                                $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_PURCHASE_RECORD_FAIL.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_PURCHASE_RECORD_SUCCESS.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    switch (_cls9..SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()])
                    {
                    default:
                        return;

                    case 1: // '\001'
                        Toasts.show(getActivity(), com.google.android.apps.walletnfcrel.R.string.purchase_record_detail_error_loading);
                        return;

                    case 2: // '\002'
                        purchaseRecord = purchaserecordevent.getPurchaseRecord();
                        break;
                    }
                    render();
                }

                public final volatile void handleEvent(Object obj)
                {
                    handleEvent((PurchaseRecordEvent)obj);
                }

            
            {
                this$0 = PurchaseRecordDetailFragment.this;
                super();
            }
            });
            purchaseRecordEventRegistered = true;
        }
    }

    private void render()
    {
        purchaseRecordContainer.removeAllViews();
        actionButtonContainer.setVisibility(8);
        actionButtonContainer.removeAllViews();
        Iterator iterator = purchaseRecord.getActions().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PurchaseRecordAction purchaserecordaction = (PurchaseRecordAction)iterator.next();
            final Intent intent = UriIntents.create(getActivity(), purchaserecordaction.getLinkUri());
            if (!getActivity().getPackageManager().queryIntentActivities(intent, 0x10000).isEmpty())
            {
                actionButtonContainer.setVisibility(0);
                Button button1 = new Button(getActivity());
                button1.setText(purchaserecordaction.getText());
                button1.setOnClickListener(new android.view.View.OnClickListener() {

                    final PurchaseRecordDetailFragment this$0;
                    final Intent val$intent;

                    public final void onClick(View view)
                    {
                        startActivity(intent);
                    }

            
            {
                this$0 = PurchaseRecordDetailFragment.this;
                intent = intent1;
                super();
            }
                });
                actionButtonContainer.addView(button1);
            } else
            if ("comgooglewallet:///pin/reset".equals(purchaserecordaction.getLinkUri()))
            {
                actionButtonContainer.setVisibility(0);
                Button button = new Button(getActivity());
                button.setText(purchaserecordaction.getText());
                button.setOnClickListener(new android.view.View.OnClickListener() {

                    final PurchaseRecordDetailFragment this$0;

                    public final void onClick(View view)
                    {
                        resetPinDialog.showForgotPin(getActivity().getSupportFragmentManager());
                    }

            
            {
                this$0 = PurchaseRecordDetailFragment.this;
                super();
            }
                });
                actionButtonContainer.addView(button);
            }
        } while (true);
        addCustomActions();
        if (featureManager.isFeatureEnabled(Feature.TRANSACTIONS_USE_WOBL))
        {
            renderPurchaseRecordWithWobl();
            return;
        } else
        {
            renderPurchaseRecordWithMrf();
            return;
        }
    }

    private void renderPurchaseRecordWithMrf()
    {
        boolean flag;
        if (purchaseRecord.getType().intValue() == 2 || purchaseRecord.getType().intValue() == 13)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || purchaseRecord.getType().intValue() == 3 || purchaseRecord.getType().intValue() == 12)
        {
            p2pHeaderContainer.setVisibility(0);
            if (p2pHeaderFragment == null)
            {
                p2pHeaderFragment = (P2pHeaderFragment)getChildFragmentManager().findFragmentById(com.google.android.apps.walletnfcrel.R.id.P2pHeaderContainer);
            }
            if (p2pHeaderFragment == null)
            {
                Object obj1 = new Bundle();
                Object obj;
                PurchaseRecordDetailRowDisplay purchaserecorddetailrowdisplay;
                if (flag)
                {
                    obj = com.google.android.apps.wallet.transfer.ui.P2pHeaderFragment.PaymentDirection.FROM_USER_TO_CONTACT;
                } else
                {
                    obj = com.google.android.apps.wallet.transfer.ui.P2pHeaderFragment.PaymentDirection.FROM_CONTACT_TO_USER;
                }
                ((Bundle) (obj1)).putSerializable("paymentDirection", ((java.io.Serializable) (obj)));
                p2pHeaderFragment = new P2pHeaderFragment();
                p2pHeaderFragment.setArguments(((Bundle) (obj1)));
                p2pHeaderFragment.setContactEmailOptional(purchaseRecord.getCounterPartyEmail());
                getChildFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.P2pHeaderContainer, p2pHeaderFragment).commit();
            } else
            {
                p2pHeaderFragment.updateContactPhotoFromEmail(purchaseRecord.getCounterPartyEmail());
            }
        }
        rows.clear();
        for (obj = purchaseRecord.getRows().iterator(); ((Iterator) (obj)).hasNext(); rows.add(purchaserecorddetailrowdisplay))
        {
            obj1 = (PurchaseRecordRow)((Iterator) (obj)).next();
            purchaserecorddetailrowdisplay = (PurchaseRecordDetailRowDisplay)rowDisplayProvider.get();
            purchaserecorddetailrowdisplay.render(((PurchaseRecordRow) (obj1)));
            purchaseRecordContainer.addView(purchaserecorddetailrowdisplay.getView());
        }

        for (Iterator iterator = rows.iterator(); iterator.hasNext(); ((PurchaseRecordDetailRowDisplay)iterator.next()).setLinkSelectedHandler(new OnActionListener() {

        final PurchaseRecordDetailFragment this$0;

        private void onAction(String s)
        {
            Uri uri = Uri.parse(s);
            Intent intent = UriIntents.create(getActivity(), uri);
            if (getActivity().getPackageManager().resolveActivity(intent, 0x10000) != null)
            {
                startActivity(intent);
            } else
            if ("comgooglewallet".equals(uri.getScheme()) && PurchaseRecordDetailFragment.isReturnMoneyUri(uri))
            {
                if (uiActionListener != null)
                {
                    if (purchaseRecord != null && purchaseRecord.getId() != null)
                    {
                        registerForPurchaseRecordUpdates();
                    }
                    uiActionListener.onReturnMoneyClicked(purchaseRecord);
                    return;
                }
            } else
            {
                WLog.efmt(PurchaseRecordDetailFragment.TAG, "No Activity available to handle URI: %s", new Object[] {
                    s
                });
                com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo usereventcontextextrainfo = new com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo();
                com.google.wallet.proto.NanoWalletLogging.PurchaseRecordContextExtraInfo purchaserecordcontextextrainfo = new com.google.wallet.proto.NanoWalletLogging.PurchaseRecordContextExtraInfo();
                purchaserecordcontextextrainfo.invalidUri = s;
                usereventcontextextrainfo.purchaseRecordExtraInfo = purchaserecordcontextextrainfo;
                userEventLogger.log(23, 100, usereventcontextextrainfo);
                return;
            }
        }

        public final volatile void onAction(Object obj2)
        {
            onAction((String)obj2);
        }

            
            {
                this$0 = PurchaseRecordDetailFragment.this;
                super();
            }
    })) { }
    }

    private void renderPurchaseRecordWithWobl()
    {
        Object obj;
        WoblHolder woblholder;
        try
        {
            obj = purchaseRecord.getRenderOutput();
            obj = layoutMatcher.getLayoutForEntrypoint(((com.google.wallet.proto.NanoWalletWobl.RenderOutput) (obj)), new String[] {
                Entrypoint.EXPANDED.toString()
            });
        }
        catch (WoblException woblexception)
        {
            WLog.e(TAG, "Failed to render wobl for transaction details", woblexception);
            if (woblexception instanceof WoblParserException)
            {
                userEventLogger.log(43, 233);
                return;
            } else
            {
                userEventLogger.log(43, 234);
                return;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        woblholder = (WoblHolder)woblHolderProvider.get();
        woblholder.setSource(((com.google.wallet.proto.NanoWalletWobl.Layout) (obj)), URI.create(UriRegistry.getUri(8001, new Object[] {
            purchaseRecord.getId()
        }).toString()));
        obj = woblholder.getView();
        purchaseRecordContainer.addView(((View) (obj)));
    }

    public final String getPurchaseRecordId()
    {
        if (purchaseRecord != null)
        {
            return purchaseRecord.getId();
        } else
        {
            return null;
        }
    }

    public final Integer getPurchaseRecordStatus()
    {
        if (purchaseRecord != null)
        {
            return purchaseRecord.getStatus();
        } else
        {
            return null;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (bundle != null && bundle.containsKey("KEY_PURCHASE_RECORD"))
        {
            purchaseRecord = (PurchaseRecord)bundle.getParcelable("KEY_PURCHASE_RECORD");
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.purchase_record_detail, null);
        purchaseRecordContainer = (LinearLayout)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.PurchaseRecordContainer);
        actionButtonContainer = (LinearLayout)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.PurchaseRecordActionContainer);
        p2pHeaderContainer = (ViewGroup)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.P2pHeaderContainer);
        if (purchaseRecord != null)
        {
            render();
        }
        return layoutinflater;
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("KEY_PURCHASE_RECORD", purchaseRecord);
        super.onSaveInstanceState(bundle);
    }

    public final void onStop()
    {
        eventBus.unregisterAll(this);
        purchaseRecordEventRegistered = false;
        super.onPause();
    }

    public final void setPurchaseRecord(PurchaseRecord purchaserecord)
    {
        Preconditions.checkNotNull(purchaserecord);
        purchaseRecord = purchaserecord;
        if (p2pHeaderContainer == null)
        {
            return;
        } else
        {
            render();
            return;
        }
    }

    public final void setUiActionListener(UiActionListener uiactionlistener)
    {
        uiActionListener = uiactionlistener;
    }




/*
    static PurchaseRecord access$002(PurchaseRecordDetailFragment purchaserecorddetailfragment, PurchaseRecord purchaserecord)
    {
        purchaserecorddetailfragment.purchaseRecord = purchaserecord;
        return purchaserecord;
    }

*/





}

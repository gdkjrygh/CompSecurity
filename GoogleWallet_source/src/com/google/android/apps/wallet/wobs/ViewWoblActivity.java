// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.OrientationController;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.api.WobUiLabels;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.android.apps.wallet.wobs.provider.WobDeletionEvent;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.commerce.wobs.common.Entrypoint;
import com.google.commerce.wobs.common.uri.WobUris;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.wallet.wobl.exception.WoblException;
import com.google.wallet.wobl.exception.WoblParserException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobsApi, PerWobNotificationSettingsActivity, WobNotificationFeedbackDialogFragment

public class ViewWoblActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/wobs/ViewWoblActivity.getSimpleName();
    private static final Map WOB_ANALYTICS_SCREEN = ImmutableMap.builder().put(Long.valueOf(0x5ca6fa4359bfd2eeL), "Gift Card Details").put(Long.valueOf(0xcc9803b6c1192477L), "Loyalty Program Details").put(Long.valueOf(0x6a73ed851981cb68L), "Offer Details").put(Long.valueOf(0xb01efe87478e2482L), "Order Details").build();
    String accountName;
    AnalyticsUtil analyticsUtil;
    private GoogleApiClient apiClient;
    private String entrypointName;
    EventBus eventBus;
    FeatureManager featureManager;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    LayoutMatcher layoutMatcher;
    private String layoutPieceId;
    private boolean loggedViewEvent;
    NetworkAccessChecker networkAccessChecker;
    private com.google.wallet.proto.NanoWalletWobl.RenderOutput renderOutput;
    SharedPreferences sharedPreferences;
    private String typedId;
    UriRegistry uriRegistry;
    UserEventLogger userEventLogger;
    private com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;
    private com.google.wallet.proto.NanoWalletWobl.Layout wobInstanceLayout;
    private ViewGroup wobViewContainer;
    WoblHolder woblHolder;
    WobsManager wobsManager;

    public ViewWoblActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        loggedViewEvent = false;
    }

    public static Intent createExpandedViewIntent(Context context, com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        return createExpandedViewIntent(context, wobinstance.id);
    }

    public static Intent createExpandedViewIntent(Context context, String s)
    {
        return UriIntents.create(context, UriRegistry.getUri(1000, new Object[] {
            s, "g_expanded"
        }));
    }

    private void displayTitle()
    {
        if (wobInstance != null && wobInstance.title != null && !Strings.isNullOrEmpty(wobInstance.title))
        {
            setTitle(wobInstance.title);
            return;
        } else
        {
            setTitle(getResources().getString(com.google.android.apps.walletnfcrel.R.string.wobs_card_details));
            return;
        }
    }

    private void displayWob()
    {
        Object obj = null;
        wobInstanceLayout = null;
        if (layoutPieceId != null)
        {
            Object obj1 = TAG;
            obj = String.valueOf(layoutPieceId);
            if (((String) (obj)).length() != 0)
            {
                obj = "Using piece Id ".concat(((String) (obj)));
            } else
            {
                obj = new String("Using piece Id ");
            }
            WLog.i(((String) (obj1)), ((String) (obj)));
            wobInstanceLayout = layoutMatcher.getLayoutForPiece(renderOutput, layoutPieceId);
            obj = WobUris.getEntrypointUriFromTypedIdentifier(typedId, entrypointName, layoutPieceId);
        }
        if (wobInstanceLayout == null)
        {
            obj1 = TAG;
            obj = String.valueOf(entrypointName);
            if (((String) (obj)).length() != 0)
            {
                obj = "Did not find layout, fallback to entrypoint ".concat(((String) (obj)));
            } else
            {
                obj = new String("Did not find layout, fallback to entrypoint ");
            }
            WLog.i(((String) (obj1)), ((String) (obj)));
            wobInstanceLayout = layoutMatcher.getLayoutForEntrypoint(renderOutput, new String[] {
                entrypointName
            });
            obj = WobUris.getEntrypointUriFromTypedIdentifier(typedId, entrypointName);
        }
        displayTitle();
        if (wobInstanceLayout != null)
        {
            woblHolder.setSource(wobInstanceLayout, ((java.net.URI) (obj)));
            if (!loggedViewEvent)
            {
                obj = new com.google.wallet.proto.NanoWalletLogging.WobViewContextExtraInfo();
                if (wobInstance != null && wobInstance.serverData != null)
                {
                    obj.wobInstanceServerData = wobInstance.serverData;
                }
                if (Arrays.asList(wobInstanceLayout.entrypointNames).contains(Entrypoint.EXPANDED.toString()))
                {
                    obj1 = new com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo();
                    obj1.wobViewExtraInfo = ((com.google.wallet.proto.NanoWalletLogging.WobViewContextExtraInfo) (obj));
                    userEventLogger.log(43, 228, ((com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo) (obj1)));
                    loggedViewEvent = true;
                }
            }
            wobViewContainer.removeAllViews();
            String s2;
            String s3;
            try
            {
                wobViewContainer.addView(woblHolder.getView());
                return;
            }
            catch (WoblException woblexception)
            {
                String s4 = TAG;
                String s = String.valueOf(typedId);
                if (s.length() != 0)
                {
                    s = "Error rendering ".concat(s);
                } else
                {
                    s = new String("Error rendering ");
                }
                WLog.e(s4, s, woblexception);
                if (woblexception instanceof WoblParserException)
                {
                    userEventLogger.log(43, 233);
                } else
                {
                    userEventLogger.log(43, 234);
                }
                showErrorDialog();
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                String s5 = TAG;
                String s1 = String.valueOf(typedId);
                if (s1.length() != 0)
                {
                    s1 = "Error rendering ".concat(s1);
                } else
                {
                    s1 = new String("Error rendering ");
                }
                WLog.e(s5, s1, runtimeexception);
                userEventLogger.log(43, 234);
                showErrorDialog();
                throw runtimeexception;
            }
        } else
        {
            obj = TAG;
            s2 = entrypointName;
            s3 = typedId;
            WLog.e(((String) (obj)), (new StringBuilder(String.valueOf(s2).length() + 38 + String.valueOf(s3).length())).append("No layout for entrypoint ").append(s2).append(" in instance ").append(s3).toString());
            userEventLogger.log(43, 232);
            showErrorDialog();
            return;
        }
    }

    private void handleDeleteEvent(WobDeletionEvent wobdeletionevent)
    {
        if (wobdeletionevent.isCausedByCategoryChange())
        {
            return;
        }
        if (wobdeletionevent.hasError())
        {
            fullScreenProgressSpinnerManager.hide();
            showDialog(CallErrorDialogs.createBuilder(wobdeletionevent.getError(), com.google.android.apps.walletnfcrel.R.string.wobs_card_delete_failure_title, com.google.android.apps.walletnfcrel.R.string.wobs_card_delete_failure_content).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.wobs_card_delete_failure_try_again_button));
            userEventLogger.log(43, 230);
            return;
        } else
        {
            userEventLogger.log(43, 231);
            Toasts.show(this, getString(com.google.android.apps.walletnfcrel.R.string.wobs_card_delete_success_toast));
            finish();
            return;
        }
    }

    private void parseIntent()
    {
        String s1 = getIntent().getData().toString();
        String s2 = TAG;
        String s = String.valueOf(s1);
        boolean flag;
        if (s.length() != 0)
        {
            s = "Parsing intent URI ".concat(s);
        } else
        {
            s = new String("Parsing intent URI ");
        }
        WLog.i(s2, s);
        if (!Strings.isNullOrEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = String.valueOf(getIntent().getData());
        Preconditions.checkState(flag, (new StringBuilder(String.valueOf(s).length() + 20)).append("Empty intent uri in ").append(s).toString());
        Preconditions.checkState(WobsApi.uriMatchesViewWoblPattern(s1), String.valueOf(getIntent().getDataString()).concat(" is not a valid view wobl URI pattern"));
        typedId = WobsApi.parseTypedIdFromViewWoblUri(s1);
        entrypointName = WobsApi.parseEntrypointNameFromViewWoblUri(s1);
        if (!WobsApi.isWobTypedIdentifier(typedId))
        {
            WLog.efmt(TAG, "Uri %s is neither here and now entrypoint, nor an object instance, can't find wobl to render!", new Object[] {
                s1
            });
            showErrorDialog();
        }
        s1 = WobsApi.parsePieceNameFromViewWoblUri(s1);
        s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = null;
        }
        layoutPieceId = s;
    }

    private void reportAnalyticsScreen()
    {
        Object obj;
        String s;
        if (wobInstanceLayout != null && wobInstanceLayout.screen != null)
        {
            java.util.ArrayList arraylist = Lists.newArrayList();
            com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension agoogleanalyticscustomdimension[] = wobInstanceLayout.screen.customDimensions;
            int k = agoogleanalyticscustomdimension.length;
            for (int i = 0; i < k; i++)
            {
                com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension googleanalyticscustomdimension = agoogleanalyticscustomdimension[i];
                arraylist.add(new AnalyticsCustomDimension(googleanalyticscustomdimension.id.intValue(), googleanalyticscustomdimension.value));
            }

            analyticsUtil.sendScreen(wobInstanceLayout.screen.name, (AnalyticsCustomDimension[])arraylist.toArray(new AnalyticsCustomDimension[0]));
            return;
        }
        s = "View Wobl Details";
        obj = s;
        if (wobInstance == null) goto _L2; else goto _L1
_L1:
        obj = s;
        if (wobInstance.labelOrdinals == null) goto _L2; else goto _L3
_L3:
        long al[];
        int j;
        int l;
        al = wobInstance.labelOrdinals;
        l = al.length;
        j = 0;
_L5:
        obj = s;
        if (j < l)
        {
            obj = Long.valueOf(al[j]);
            AnalyticsCustomDimension analyticscustomdimension;
            if (WOB_ANALYTICS_SCREEN.containsKey(obj))
            {
                obj = (String)WOB_ANALYTICS_SCREEN.get(obj);
            } else
            {
label0:
                {
                    obj = Long.valueOf(WobUiLabels.getParentLabelOrdinal(((Long) (obj)).longValue()));
                    if (!WOB_ANALYTICS_SCREEN.containsKey(obj))
                    {
                        break label0;
                    }
                    obj = (String)WOB_ANALYTICS_SCREEN.get(obj);
                }
            }
        }
_L2:
        if (wobInstance != null && wobInstance.issuerName != null)
        {
            analyticscustomdimension = new AnalyticsCustomDimension(1, wobInstance.issuerName);
            analyticsUtil.sendScreen(((String) (obj)), new AnalyticsCustomDimension[] {
                analyticscustomdimension
            });
            return;
        } else
        {
            analyticsUtil.sendScreen(((String) (obj)), new AnalyticsCustomDimension[0]);
            return;
        }
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void showDialog(com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder builder)
    {
        builder.setCancelable(true).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).build().show(getSupportFragmentManager(), "DELETE_DIALOG_TAG");
    }

    private void showErrorDialog()
    {
        AlertDialogFragment.newBuilder().setCancelable(true).setTitle(com.google.android.apps.walletnfcrel.R.string.wobs_rendering_error_title).setMessage(com.google.android.apps.walletnfcrel.R.string.wobs_rendering_error_details).setFinishActivityOnClick().setFinishActivityOnDismiss().build().show(getSupportFragmentManager());
    }

    protected final void doOnCreate(Bundle bundle)
    {
        parseIntent();
        if (bundle != null)
        {
            loggedViewEvent = bundle.getBoolean("EXTRA_LOGGED_VIEW_EVENT", false);
        }
        OrientationController.disableOrientationChanges(this);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.wobs_view_wob);
        wobViewContainer = (ScrollView)findViewById(com.google.android.apps.walletnfcrel.R.id.ViewWobContainer);
        fullScreenProgressSpinnerManager.show();
    }

    protected final void doOnResume()
    {
        EventHandler eventhandler = new EventHandler() {

            final ViewWoblActivity this$0;

            private void handleEvent(WobUpdateEvent wobupdateevent)
            {
                if (wobupdateevent.hasError())
                {
                    userEventLogger.log(43, 234);
                    showErrorDialog();
                    return;
                } else
                {
                    wobInstance = wobupdateevent.getWobInstance();
                    fullScreenProgressSpinnerManager.hide();
                    supportInvalidateOptionsMenu();
                    WLog.dfmt(ViewWoblActivity.TAG, "Got wob instance with id %s", new Object[] {
                        wobInstance.id
                    });
                    renderOutput = wobInstance.renderOutput;
                    displayWob();
                    reportAnalyticsScreen();
                    return;
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((WobUpdateEvent)obj);
            }

            
            {
                this$0 = ViewWoblActivity.this;
                super();
            }
        };
        EventHandler eventhandler1 = new EventHandler() {

            final ViewWoblActivity this$0;

            private void handleEvent(WobDeletionEvent wobdeletionevent)
            {
                wobInstance = wobdeletionevent.getWobInstance();
                handleDeleteEvent(wobdeletionevent);
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((WobDeletionEvent)obj);
            }

            
            {
                this$0 = ViewWoblActivity.this;
                super();
            }
        };
        eventBus.register(this, com/google/android/apps/wallet/wobs/provider/WobUpdateEvent, WobsApi.parseIdFromTypedIdentifier(typedId), eventhandler);
        eventBus.register(this, com/google/android/apps/wallet/wobs/provider/WobDeletionEvent, WobsApi.parseIdFromTypedIdentifier(typedId), eventhandler1);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if ("DELETE_DIALOG_TAG".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final ViewWoblActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    i;
                    JVM INSTR tableswitch -1 -1: default 20
                //                               -1 21;
                       goto _L1 _L2
_L1:
                    return;
_L2:
                    fullScreenProgressSpinnerManager.show();
                    if (wobInstance != null)
                    {
                        if (!networkAccessChecker.check())
                        {
                            fullScreenProgressSpinnerManager.hide();
                            return;
                        } else
                        {
                            wobsManager.deleteWob(wobInstance);
                            return;
                        }
                    }
                    if (true) goto _L1; else goto _L3
_L3:
                }

            
            {
                this$0 = ViewWoblActivity.this;
                super();
            }
            });
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        boolean flag = WobsApi.isWobTypedIdentifier(typedId);
        if (wobInstance != null && wobInstance.menuItems != null)
        {
            for (int i = 0; i < wobInstance.menuItems.length; i++)
            {
                menu.add(0, i + 12000, 0x30000, wobInstance.menuItems[i].text);
            }

        }
        if (flag && wobInstance != null)
        {
            menu.add(0, 43, 0x30000, com.google.android.apps.walletnfcrel.R.string.notification_settings_title);
        }
        if (flag)
        {
            menu.add(0, 33, 0x30000, com.google.android.apps.walletnfcrel.R.string.options_menu_item_remove_wob);
        }
        if (featureManager.isFeatureEnabled(Feature.WOB_NOTIFICATION_FEEDBACK))
        {
            menu.add(0, 56, 0x30000, com.google.android.apps.walletnfcrel.R.string.wobs_notification_feedback_menu_title);
        }
        return true;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (apiClient != null && (apiClient.isConnected() || apiClient.isConnecting()))
        {
            apiClient.disconnect();
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        parseIntent();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   33: 110
    //                   43: 159
    //                   56: 183;
           goto _L1 _L2 _L3 _L4
_L1:
        if (wobInstance == null || wobInstance.menuItems == null || i < 12000 || i >= wobInstance.menuItems.length + 12000) goto _L6; else goto _L5
_L5:
        startActivity(UriIntents.create(this, wobInstance.menuItems[i - 12000].uri));
_L8:
        return true;
_L2:
        if (wobInstance == null && renderOutput == null) goto _L8; else goto _L7
_L7:
        showDialog(AlertDialogFragment.newBuilder().setTitle(getString(com.google.android.apps.walletnfcrel.R.string.wobs_card_delete_confirm_title)).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.wobs_card_delete_confirm_content)).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.wobs_card_delete_confirm_ok_button));
        return true;
_L3:
        startActivity(PerWobNotificationSettingsActivity.createIntent(this, wobInstance));
        overridePendingTransition(0x10a0000, 0x10a0001);
        return true;
_L4:
        menuitem = new WobNotificationFeedbackDialogFragment();
        menuitem.setWobInstanceId(wobInstance.id);
        menuitem.show(getSupportFragmentManager());
        overridePendingTransition(0x10a0000, 0x10a0001);
        return true;
_L6:
        return super.onOptionsItemSelected(menuitem);
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        woblHolder.cancel();
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loggedViewEvent)
        {
            bundle.putBoolean("EXTRA_LOGGED_VIEW_EVENT", true);
        }
    }

    protected final void onUpPressed()
    {
        if (wobInstance == null)
        {
            WLog.d(TAG, "Wob instance is null, going to my wallet.");
            startActivity(uriRegistry.createIntent(2, new Object[0]));
            return;
        }
        long l = WobUiLabels.getParentLabelOrdinal(wobInstance.labelOrdinals[0]);
        if (l == 0L)
        {
            l = wobInstance.labelOrdinals[0];
        }
        if (l == 0xb01efe87478e2482L)
        {
            navigateUpWithIntent(UriIntents.create(this, UriRegistry.getUri(6, new Object[0])));
            return;
        } else
        {
            navigateUpWithIntent(UriIntents.create(this, UriRegistry.getUri(5, new Object[0])));
            return;
        }
    }




/*
    static com.google.wallet.proto.NanoWalletObjects.WobInstance access$002(ViewWoblActivity viewwoblactivity, com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        viewwoblactivity.wobInstance = wobinstance;
        return wobinstance;
    }

*/




/*
    static com.google.wallet.proto.NanoWalletWobl.RenderOutput access$302(ViewWoblActivity viewwoblactivity, com.google.wallet.proto.NanoWalletWobl.RenderOutput renderoutput)
    {
        viewwoblactivity.renderOutput = renderoutput;
        return renderoutput;
    }

*/



}

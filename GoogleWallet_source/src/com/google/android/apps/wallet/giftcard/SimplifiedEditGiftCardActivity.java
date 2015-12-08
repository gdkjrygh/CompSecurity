// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.giftcard.api.GiftCardApi;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import com.google.android.apps.wallet.wobs.add.LinkPromptConverter;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.android.apps.wallet.wobs.add.UserDataPromptDisplay;
import com.google.android.apps.wallet.wobs.add.UserDataWidgetFactory;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            SimplifiedEditGiftCardModel, GiftCardsClient

public class SimplifiedEditGiftCardActivity extends WalletActivity
{

    EventBus eventBus;
    FeatureManager featureManager;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    GiftCardsClient giftCardsClient;
    private LinearLayout inputFieldsContainer;
    private TextView introMessageContent;
    private SimplifiedEditGiftCardModel model;
    NetworkAccessChecker networkAccessChecker;
    private List prompts;
    private ValidationGroup validationGroup;
    WobsManager wobsManager;

    public SimplifiedEditGiftCardActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private Callable createGetEditFormAction()
    {
        return new Callable() {

            final SimplifiedEditGiftCardActivity this$0;

            private com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse call()
                throws Exception
            {
                return giftCardsClient.getEditForm(model.getWobInstanceServerData(), model.getEditWobUri());
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = SimplifiedEditGiftCardActivity.this;
                super();
            }
        };
    }

    private static SimplifiedEditGiftCardModel createModel(Bundle bundle)
    {
        if (bundle != null)
        {
            return (SimplifiedEditGiftCardModel)bundle.getParcelable("model");
        } else
        {
            return new SimplifiedEditGiftCardModel();
        }
    }

    private Callable createUpdateWobInstanceAction(final List userDataPrompts)
    {
        return new Callable() {

            final SimplifiedEditGiftCardActivity this$0;
            final List val$userDataPrompts;

            private Void call()
                throws Exception
            {
                com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = giftCardsClient.updateWobInstance(model.getWobInstanceServerData(), userDataPrompts);
                if (wobinstance != null)
                {
                    wobsManager.upsertWobIfNecessary(wobinstance);
                }
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = SimplifiedEditGiftCardActivity.this;
                userDataPrompts = list;
                super();
            }
        };
    }

    private void handleGetEditFormActionResponse(com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse geteditformresponse)
    {
        if (geteditformresponse.giftCardForm == null || geteditformresponse.giftCardForm.form == null)
        {
            showFatalErrorDialog();
            return;
        } else
        {
            model.setInputForm(geteditformresponse.giftCardForm.form);
            setUpInputForm(model.getInputForm());
            return;
        }
    }

    private boolean parseIntent()
    {
        String s = getIntent().getData().toString();
        if (GiftCardApi.uriMatchesEditGiftCardPattern(s))
        {
            model.setWobInstanceId(GiftCardApi.parseGiftCardIdFromEditGiftCardUri(s));
            model.setEditWobUri(s);
            return true;
        } else
        {
            showFatalErrorDialog();
            return false;
        }
    }

    private void setUpInputForm(com.google.wallet.proto.api.NanoWalletWobForms.InputForm inputform)
    {
        validationGroup = new ValidationGroup();
        if (inputform.introMessage != null)
        {
            setTitle(inputform.introMessage.title);
            introMessageContent.setText(inputform.introMessage.content);
        }
        UserDataWidgetFactory userdatawidgetfactory = new UserDataWidgetFactory(this, getLayoutInflater());
        prompts = LinkPromptConverter.convert(inputform.linkPrompts, this);
        inputFieldsContainer.removeAllViews();
        for (int i = 0; i < prompts.size(); i++)
        {
            inputform = userdatawidgetfactory.createInput((UserDataPrompt)prompts.get(i), inputFieldsContainer);
            validationGroup.addInput(inputform.getView());
            inputFieldsContainer.addView(inputform.getView());
            if (i == 0)
            {
                inputform = inputform.getInputView();
                inputform.requestFocus();
                Views.showSoftKeyboard(this, inputform);
            }
        }

    }

    private void showFatalErrorDialog()
    {
        AlertDialogFragment.newBuilder().setCancelable(true).setTitle(com.google.android.apps.walletnfcrel.R.string.wobs_editing_error_title).setMessage(com.google.android.apps.walletnfcrel.R.string.wobs_editing_error_details).setFinishActivityOnClick().setFinishActivityOnDismiss().build().show(getSupportFragmentManager());
    }

    private void submitEditGiftCardForm()
    {
        if (validationGroup.checkForErrors())
        {
            validationGroup.focusOnFirstError();
        } else
        if (networkAccessChecker.check())
        {
            fullScreenProgressSpinnerManager.showImmediately();
            executeAction("updateWobInstance", createUpdateWobInstanceAction(Lists.newArrayList(prompts)));
            return;
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        if (bundle == null && !parseIntent())
        {
            return;
        }
        setTitle("");
        setContentView(com.google.android.apps.walletnfcrel.R.layout.simplified_edit_gift_card_activity);
        introMessageContent = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.EditGiftCardMessageContent);
        inputFieldsContainer = (LinearLayout)findViewById(com.google.android.apps.walletnfcrel.R.id.EditGiftCardFieldsContainer);
        if (bundle != null && model.getInputForm() != null)
        {
            setUpInputForm(model.getInputForm());
            return;
        } else
        {
            fullScreenProgressSpinnerManager.showImmediately();
            return;
        }
    }

    public final void doOnResume()
    {
        if (model.getWobInstanceServerData() == null && !Strings.isNullOrEmpty(model.getWobInstanceId()))
        {
            eventBus.register(this, com/google/android/apps/wallet/wobs/provider/WobUpdateEvent, model.getWobInstanceId(), new EventHandler() {

                final SimplifiedEditGiftCardActivity this$0;

                private void handleEvent(WobUpdateEvent wobupdateevent)
                {
                    eventBus.unregisterAll(SimplifiedEditGiftCardActivity.this);
                    if (!networkAccessChecker.check(true))
                    {
                        return;
                    }
                    if (wobupdateevent.hasError())
                    {
                        showFatalErrorDialog();
                        return;
                    } else
                    {
                        model.setWobInstanceServerData(wobupdateevent.getWobInstance().serverData);
                        executeAction("getEditForm", createGetEditFormAction());
                        return;
                    }
                }

                public final volatile void handleEvent(Object obj)
                {
                    handleEvent((WobUpdateEvent)obj);
                }

            
            {
                this$0 = SimplifiedEditGiftCardActivity.this;
                super();
            }
            });
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (!super.onActionFailure(s, callable, exception))
        {
            fullScreenProgressSpinnerManager.hide();
            if ("getEditForm".equals(s))
            {
                showFatalErrorDialog();
                return true;
            }
            if ("updateWobInstance".equals(s))
            {
                s = null;
                if (exception instanceof CallErrorException)
                {
                    s = ((CallErrorException)exception).getCallError();
                }
                CallErrorDialogs.createBuilder(s, com.google.android.apps.walletnfcrel.R.string.wobs_editing_error_title, com.google.android.apps.walletnfcrel.R.string.wobs_editing_error_details).build().show(getSupportFragmentManager());
                return true;
            }
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        fullScreenProgressSpinnerManager.hide();
        if ("getEditForm".equals(s))
        {
            handleGetEditFormActionResponse((com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse)obj);
        } else
        if ("updateWobInstance".equals(s))
        {
            finish();
            return;
        }
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        super.onBeforeCreate(bundle);
        model = createModel(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 60, 0x30000, com.google.android.apps.walletnfcrel.R.string.button_done).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 60)
        {
            submitEditGiftCardForm();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("model", model);
    }

    protected final void onUpPressed()
    {
        finish();
    }



}

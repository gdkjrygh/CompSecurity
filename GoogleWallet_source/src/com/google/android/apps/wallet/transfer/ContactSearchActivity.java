// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import android.app.ActivityOptions;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.p2p.people.ContactListAdapter;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.widgets.text.clearable.ClearableEditText;
import com.google.common.base.Preconditions;
import com.google.common.email.EmailValidationUtil;

public class ContactSearchActivity extends WalletActivity
{
    public static final class ContactSearchMode extends Enum
    {

        private static final ContactSearchMode $VALUES[];
        public static final ContactSearchMode REQUEST_MONEY;
        public static final ContactSearchMode SEND_MONEY;
        final String analyticsScreen;
        final int searchTitile;
        final int selectSeflError;

        public static ContactSearchMode valueOf(String s)
        {
            return (ContactSearchMode)Enum.valueOf(com/google/android/apps/wallet/transfer/ContactSearchActivity$ContactSearchMode, s);
        }

        public static ContactSearchMode[] values()
        {
            return (ContactSearchMode[])$VALUES.clone();
        }

        static 
        {
            SEND_MONEY = new ContactSearchMode("SEND_MONEY", 0, com.google.android.apps.walletnfcrel.R.string.send_money_tile_hint, "Send Money Contact Search", com.google.android.apps.walletnfcrel.R.string.send_money_cannot_send_to_self);
            REQUEST_MONEY = new ContactSearchMode("REQUEST_MONEY", 1, com.google.android.apps.walletnfcrel.R.string.request_money_contact_search_title, "Request Money Contact Search", com.google.android.apps.walletnfcrel.R.string.request_money_cannot_request_from_self);
            $VALUES = (new ContactSearchMode[] {
                SEND_MONEY, REQUEST_MONEY
            });
        }

        private ContactSearchMode(String s, int i, int j, String s1, int k)
        {
            super(s, i);
            searchTitile = j;
            analyticsScreen = s1;
            selectSeflError = k;
        }
    }


    private static final String PROJECTION[] = {
        "_id", "display_name", "data1", "photo_id"
    };
    private static final String SELECTION = String.format("%s='%s' and %s='%s' and %s!=''", new Object[] {
        "account_type", "com.google", "mimetype", "vnd.android.cursor.item/email_v2", "data1"
    });
    public static final String TAG = com/google/android/apps/wallet/transfer/ContactSearchActivity.getSimpleName();
    String accountName;
    AnalyticsUtil analyticsUtil;
    private ContactListAdapter contactListAdapter;
    private ListView contactListView;
    public ClearableEditText contactTextInput;
    private int contactTextInputValidTextColor;
    private TextView errorView;
    FeatureManager featureManager;
    private ContactSearchMode mode;
    FullScreenProgressSpinnerManager progressSpinner;
    private TextWatcher textWatcher;
    private TextView unknownContactBar;
    public UserEventLogger userEventLogger;

    public ContactSearchActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public ContactSearchActivity(int i)
    {
        super(i);
    }

    private android.support.v4.app.LoaderManager.LoaderCallbacks createLoaderCallbacks(String s)
    {
        return new android.support.v4.app.LoaderManager.LoaderCallbacks() {

            final ContactSearchActivity this$0;
            final String val$selectionArgs[];
            final String val$selectionSuffix;
            final String val$substr;

            private void onLoadFinished(Loader loader, Cursor cursor)
            {
                unknownContactBar.setVisibility(8);
                if (substr.length() == 0)
                {
                    loader = new MatrixCursor(ContactSearchActivity.PROJECTION);
                    contactListAdapter = new ContactListAdapter(ContactSearchActivity.this, loader);
                    contactListView.setAdapter(contactListAdapter);
                } else
                {
                    int i = cursor.getCount();
                    WLog.i(ContactSearchActivity.TAG, String.format("Found %s contacts for query", new Object[] {
                        Integer.valueOf(i)
                    }));
                    if (i == 0 && substr.toString().indexOf("@") != -1)
                    {
                        loader = new MatrixCursor(ContactSearchActivity.PROJECTION);
                        loader.addRow(new Object[] {
                            Integer.valueOf(0), "", substr.toString(), ""
                        });
                        contactListAdapter = new ContactListAdapter(ContactSearchActivity.this, loader);
                        contactListView.setAdapter(contactListAdapter);
                        if (mode == ContactSearchMode.SEND_MONEY)
                        {
                            unknownContactBar.setVisibility(0);
                            return;
                        }
                    } else
                    {
                        if (i < 6000)
                        {
                            MatrixCursor matrixcursor = new MatrixCursor(ContactSearchActivity.PROJECTION);
                            int k = cursor.getColumnIndex("display_name");
                            int l = cursor.getColumnIndex("data1");
                            int i1 = cursor.getColumnIndex("photo_id");
                            loader = null;
                            int j = 0;
                            while (cursor.moveToNext()) 
                            {
                                String s2 = cursor.getString(k);
                                String s1 = cursor.getString(l);
                                String s3 = cursor.getString(i1);
                                if (s1.equals(loader))
                                {
                                    j++;
                                } else
                                {
                                    matrixcursor.addRow(new Object[] {
                                        Integer.valueOf(0), s2, s1, s3
                                    });
                                    loader = s1;
                                }
                            }
                            WLog.ifmt(ContactSearchActivity.TAG, "Removed duplicates: %s", new Object[] {
                                Integer.valueOf(j)
                            });
                            contactListAdapter = new ContactListAdapter(ContactSearchActivity.this, matrixcursor);
                        } else
                        {
                            contactListAdapter = new ContactListAdapter(ContactSearchActivity.this, cursor);
                        }
                        contactListView.setAdapter(contactListAdapter);
                        return;
                    }
                }
            }

            public final Loader onCreateLoader(int i, Bundle bundle)
            {
                ContactSearchActivity contactsearchactivity = ContactSearchActivity.this;
                Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
                String as[] = ContactSearchActivity.PROJECTION;
                bundle = String.valueOf(ContactSearchActivity.SELECTION);
                String s1 = String.valueOf(selectionSuffix);
                if (s1.length() != 0)
                {
                    bundle = bundle.concat(s1);
                } else
                {
                    bundle = new String(bundle);
                }
                return new CursorLoader(contactsearchactivity, uri, as, bundle, selectionArgs, "display_name");
            }

            public final volatile void onLoadFinished(Loader loader, Object obj)
            {
                onLoadFinished(loader, (Cursor)obj);
            }

            public final void onLoaderReset(Loader loader)
            {
                if (contactListAdapter != null)
                {
                    contactListAdapter.swapCursor(null);
                }
            }

            
            {
                this$0 = ContactSearchActivity.this;
                selectionSuffix = s;
                selectionArgs = as;
                substr = s1;
                super();
            }
        };
    }

    private void endTimingForAnalytics()
    {
        if (mode == ContactSearchMode.REQUEST_MONEY)
        {
            analyticsUtil.endTiming("OpenRequestMoney", "user_open_request_money");
        } else
        if (mode == ContactSearchMode.SEND_MONEY)
        {
            analyticsUtil.endTiming("OpenSendMoney", "user_open_send_money");
            return;
        }
    }

    private ContactSearchMode getMode()
    {
        Uri uri = getIntent().getData();
        if (uri != null)
        {
            if (uri.getLastPathSegment().equals("send"))
            {
                return ContactSearchMode.SEND_MONEY;
            }
            if (uri.getLastPathSegment().equals("request"))
            {
                return ContactSearchMode.REQUEST_MONEY;
            }
        }
        return null;
    }

    private void hideEmailValidationError()
    {
        errorView.setVisibility(8);
        contactTextInput.getEditText().setTextColor(contactTextInputValidTextColor);
    }

    private void initializeSearchbox()
    {
        contactTextInputValidTextColor = contactTextInput.getEditText().getCurrentTextColor();
        textWatcher = new DefaultTextWatcher() {

            final ContactSearchActivity this$0;

            public final void afterTextChanged(Editable editable)
            {
                hideEmailValidationError();
            }

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                if (charsequence != null)
                {
                    getSupportLoaderManager().restartLoader(0, null, createLoaderCallbacks(charsequence.toString()));
                }
            }

            
            {
                this$0 = ContactSearchActivity.this;
                super();
            }
        };
        contactTextInput.getEditText().addTextChangedListener(textWatcher);
        contactTextInput.getEditText().setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final ContactSearchActivity this$0;

            public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 5)
                {
                    analyticsUtil.sendKeyboardReturn("ChooseContact", new AnalyticsCustomDimension[0]);
                    keyevent = textview.getText().toString();
                    onContactSelected(textview, new Contact(keyevent), 201);
                }
                return false;
            }

            
            {
                this$0 = ContactSearchActivity.this;
                super();
            }
        });
    }

    private void onContactSelected(View view, Contact contact, int i)
    {
        if (!EmailValidationUtil.isValidShortEmail(contact.getEmailAddress()))
        {
            showEmailValidationError(com.google.android.apps.walletnfcrel.R.string.contact_invalid_input);
            analyticsUtil.sendUserError("InvalidEmailInput", new AnalyticsCustomDimension[0]);
            return;
        }
        if (contact.getEmailAddress().equals(accountName))
        {
            showEmailValidationError(getMode().selectSeflError);
            analyticsUtil.sendUserError("CannotUseSelfAsContact", new AnalyticsCustomDimension[0]);
            return;
        }
        userEventLogger.log(36, i);
        contact = InternalIntents.forClass(this, targetActivityName()).putExtra("contact", contact);
        view = view.findViewById(com.google.android.apps.walletnfcrel.R.id.contactPhoto);
        if (android.os.Build.VERSION.SDK_INT >= 21 && view != null)
        {
            view.setTransitionName("counterparty");
            startActivity(contact, ActivityOptions.makeSceneTransitionAnimation(this, view, "counterparty").toBundle());
            return;
        } else
        {
            startActivity(contact);
            return;
        }
    }

    private static String requestMoneyActivityName()
    {
        return "com.google.android.apps.wallet.transfer.request.RequestMoneyActivity";
    }

    private String sendMoneyActivityName()
    {
        return TransferApi.sendMoneyActivityName(featureManager);
    }

    private void showEmailValidationError(int i)
    {
        errorView.setText(i);
        errorView.setVisibility(0);
        errorView.sendAccessibilityEvent(32);
        contactTextInput.getEditText().setTextColor(errorView.getCurrentTextColor());
        if (contactListAdapter != null)
        {
            contactListAdapter.swapCursor(null);
        }
        contactListView.getEmptyView().setVisibility(8);
    }

    private void showSoftKeyboardAfterAnimation()
    {
        getWindow().getEnterTransition().addListener(new android.transition.Transition.TransitionListener() {

            final ContactSearchActivity this$0;

            public final void onTransitionCancel(Transition transition)
            {
            }

            public final void onTransitionEnd(Transition transition)
            {
                Views.showSoftKeyboard(ContactSearchActivity.this, contactTextInput.getEditText());
                getWindow().getEnterTransition().removeListener(this);
            }

            public final void onTransitionPause(Transition transition)
            {
            }

            public final void onTransitionResume(Transition transition)
            {
            }

            public final void onTransitionStart(Transition transition)
            {
            }

            
            {
                this$0 = ContactSearchActivity.this;
                super();
            }
        });
    }

    private String targetActivityName()
        throws IllegalStateException
    {
        if (getMode().equals(ContactSearchMode.SEND_MONEY))
        {
            return sendMoneyActivityName();
        }
        if (getMode().equals(ContactSearchMode.REQUEST_MONEY))
        {
            return requestMoneyActivityName();
        } else
        {
            throw new IllegalStateException("Mode must be either SEND_MONEY or REQUEST_MONEY");
        }
    }

    public final void doOnCreate(Bundle bundle)
    {
        mode = getMode();
        View view;
        boolean flag;
        if (mode == ContactSearchMode.SEND_MONEY || mode == ContactSearchMode.REQUEST_MONEY)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle = String.valueOf(getIntent().getData());
        Preconditions.checkArgument(flag, (new StringBuilder(String.valueOf(bundle).length() + 60)).append("Cannot determine contact search destination target from uri ").append(bundle).toString());
        userEventLogger.log(36, 202);
        setTitle(mode.searchTitile);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.contact_search_activity);
        bundle = findViewById(com.google.android.apps.walletnfcrel.R.id.EmptyContactList);
        unknownContactBar = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.UnknownContactBar);
        contactListView = (ListView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ContactList);
        errorView = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ErrorView);
        contactTextInput = (ClearableEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ContactTextInput);
        contactTextInput.getEditText().setHint(com.google.android.apps.walletnfcrel.R.string.send_money_contact_hint);
        contactTextInput.getEditText().requestFocus();
        if (contactListAdapter != null)
        {
            contactListView.setAdapter(contactListAdapter);
        }
        view = new View(this);
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(0, 100));
        contactListView.addFooterView(view);
        contactListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ContactSearchActivity this$0;

            public final void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                analyticsUtil.sendListItemTap("ChooseContact", new AnalyticsCustomDimension[0]);
                adapterview = (Cursor)adapterview.getAdapter().getItem(i);
                adapterview = contactListAdapter.getContact(adapterview);
                onContactSelected(view1, adapterview, 200);
            }

            
            {
                this$0 = ContactSearchActivity.this;
                super();
            }
        });
        contactListView.setEmptyView(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            showSoftKeyboardAfterAnimation();
            return;
        } else
        {
            getWindow().setSoftInputMode(4);
            return;
        }
    }

    public final void doOnResume()
    {
        analyticsUtil.sendScreen(mode.analyticsScreen, new AnalyticsCustomDimension[0]);
        initializeSearchbox();
        if (contactTextInput.getText().length() > 0)
        {
            getSupportLoaderManager().restartLoader(0, null, createLoaderCallbacks(contactTextInput.getText().toString()));
        }
        endTimingForAnalytics();
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        getWindow().requestFeature(12);
        super.onBeforeCreate(bundle);
    }

    public void onDestroy()
    {
        getLoaderManager().destroyLoader(0);
        super.onDestroy();
    }

    public void onPause()
    {
        if (getSupportLoaderManager().getLoader(0) != null)
        {
            getSupportLoaderManager().getLoader(0).stopLoading();
        }
        super.onPause();
    }

    protected final void onUpPressed()
    {
        finish();
    }




/*
    static ContactListAdapter access$002(ContactSearchActivity contactsearchactivity, ContactListAdapter contactlistadapter)
    {
        contactsearchactivity.contactListAdapter = contactlistadapter;
        return contactlistadapter;
    }

*/








}

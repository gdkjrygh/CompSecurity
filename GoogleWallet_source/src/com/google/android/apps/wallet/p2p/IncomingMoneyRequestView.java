// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.p2p.people.ContactsUtil;
import com.google.android.apps.wallet.purchaserecord.DeclineMoneyRequestDialog;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.roundedimage.RoundedImage;
import com.google.common.base.Optional;
import com.google.common.base.Strings;

public class IncomingMoneyRequestView extends LinearLayout
{

    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    ContactsUtil contactsUtil;
    FeatureManager featureManager;
    UriRegistry uriRegistry;

    public IncomingMoneyRequestView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.incoming_money_request_list_view, this, true);
        UserInjector.inject(this, context);
    }

    private void setRequesterPhoto(RoundedImage roundedimage, Contact contact)
    {
        if (!Strings.isNullOrEmpty(contact.getPhoto()))
        {
            try
            {
                contact = ContentUris.withAppendedId(android.provider.ContactsContract.Data.CONTENT_URI, Long.parseLong(contact.getPhoto()));
                roundedimage.setImage(BitmapFactory.decodeStream(getContext().getContentResolver().openInputStream(contact)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Contact contact)
            {
                roundedimage.setImage(null);
            }
            return;
        } else
        {
            roundedimage.setImage(null);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        actionExecutor.cancelAll();
        super.onDetachedFromWindow();
    }

    public void setPurchaseRecord(final PurchaseRecord purchaseRecord)
    {
        final Contact requester = contactsUtil.getContact(purchaseRecord.getCounterPartyEmail());
        String s = getContext().getString(com.google.android.apps.walletnfcrel.R.string.name_requested_money, new Object[] {
            requester.getPreferredHumanIdentifier(), purchaseRecord.getDisplayableAmount().get()
        });
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.SingleRequestHeader)).setText(s);
        Object obj = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.SingleMemo);
        ((TextView) (obj)).setText(purchaseRecord.getMemo());
        byte byte0;
        if (Strings.isNullOrEmpty(purchaseRecord.getMemo()))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj)).setVisibility(byte0);
        setRequesterPhoto((RoundedImage)findViewById(com.google.android.apps.walletnfcrel.R.id.SingleRequesterPhoto), requester);
        obj = s;
        if (!Strings.isNullOrEmpty(purchaseRecord.getMemo()))
        {
            obj = String.valueOf(purchaseRecord.getMemo());
            obj = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj).length())).append(s).append(" ").append(((String) (obj))).toString();
        }
        Views.setLinkOnClickListener(findViewById(com.google.android.apps.walletnfcrel.R.id.SingleRequestSummary), new android.view.View.OnClickListener() {

            final IncomingMoneyRequestView this$0;
            final PurchaseRecord val$purchaseRecord;

            public final void onClick(View view)
            {
                getContext().startActivity(uriRegistry.createIntent(8001, new Object[] {
                    purchaseRecord.getId()
                }));
            }

            
            {
                this$0 = IncomingMoneyRequestView.this;
                purchaseRecord = purchaserecord;
                super();
            }
        }, ((String) (obj)));
        ((Button)findViewById(com.google.android.apps.walletnfcrel.R.id.SettleUpLink)).setOnClickListener(new android.view.View.OnClickListener() {

            final IncomingMoneyRequestView this$0;
            final PurchaseRecord val$purchaseRecord;
            final Contact val$requester;

            public final void onClick(View view)
            {
                analyticsUtil.sendButtonTap("AcceptIncomingMoneyRequest", new AnalyticsCustomDimension[0]);
                getContext().startActivity(TransferApi.createSettleRequestIntent(getContext(), purchaseRecord.getId(), purchaseRecord.getTotalAmountMicros(), purchaseRecord.getTotalAmountCurrencyCode(), purchaseRecord.getMemo(), requester, featureManager));
            }

            
            {
                this$0 = IncomingMoneyRequestView.this;
                purchaseRecord = purchaserecord;
                requester = contact;
                super();
            }
        });
        ((Button)findViewById(com.google.android.apps.walletnfcrel.R.id.DeclineRequestLink)).setOnClickListener(new android.view.View.OnClickListener() {

            final IncomingMoneyRequestView this$0;
            final PurchaseRecord val$purchaseRecord;

            public final void onClick(View view)
            {
                DeclineMoneyRequestDialog.show(purchaseRecord, ((FragmentActivity)getContext()).getSupportFragmentManager());
            }

            
            {
                this$0 = IncomingMoneyRequestView.this;
                purchaseRecord = purchaserecord;
                super();
            }
        });
        setVisibility(0);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Optional;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordRenderable, PurchaseRecordRow

public class PurchaseRecordDetailRowDisplay extends DefaultViewHolder
{

    private final DateAndTimeHelper dateAndTimeHelper;
    private final TextView mContentRightText;
    private final TextView mContentText;
    private final TextView mFooter;
    private final TextView mHeader;
    private final ImageView mImageView;
    private OnActionListener mLinkSelectedHandler;
    private final View mThickDivider;
    private final View mThinDivider;
    private final Picasso picasso;

    PurchaseRecordDetailRowDisplay(Activity activity, LayoutInflater layoutinflater, Picasso picasso1, DateAndTimeHelper dateandtimehelper)
    {
        super(com.google.android.apps.walletnfcrel.R.layout.purchase_record_detail_row);
        createView(layoutinflater);
        picasso = picasso1;
        dateAndTimeHelper = dateandtimehelper;
        mHeader = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordSectionHeader);
        mContentText = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordSectionContentText);
        mContentRightText = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordSectionRightContentText);
        mImageView = (ImageView)findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordSectionContentImg);
        mFooter = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordSectionFooter);
        mThickDivider = findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordSectionThickDivider);
        mThinDivider = findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordSectionThinDivider);
    }

    private void renderContentTextView(TextView textview, final Optional linkUrl, boolean flag)
    {
        if (!linkUrl.isPresent()) goto _L2; else goto _L1
_L1:
        linkUrl = (PurchaseRecordRenderable)linkUrl.get();
        static final class _cls4
        {

            static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Style[];
            static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Type[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Style = new int[PurchaseRecordRenderable.Style.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Style[PurchaseRecordRenderable.Style.BOLD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Style[PurchaseRecordRenderable.Style.NORMAL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Style[PurchaseRecordRenderable.Style.STRIKETHROUGH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Type = new int[PurchaseRecordRenderable.Type.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Type[PurchaseRecordRenderable.Type.DATE_TIME.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Type[PurchaseRecordRenderable.Type.DATE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Type[PurchaseRecordRenderable.Type.TEXT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordRenderable$Type[PurchaseRecordRenderable.Type.EMPTY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4..SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordRenderable.Type[linkUrl.getType().ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 128
    //                   2 168
    //                   3 209;
           goto _L3 _L4 _L5 _L6
_L3:
        if (flag)
        {
            textview.setTextAppearance(getContext(), com.google.android.apps.walletnfcrel.R.style.Text_Headline);
        }
        if (linkUrl.getContentDescription().isPresent())
        {
            textview.setContentDescription((CharSequence)linkUrl.getContentDescription().get());
        }
        linkUrl = linkUrl.getLinkUrl();
        if (linkUrl.isPresent())
        {
            textview.setTextAppearance(getContext(), com.google.android.apps.walletnfcrel.R.style.Font_InlineLink);
            Views.setLinkOnClickListener(textview, new android.view.View.OnClickListener() {

                final PurchaseRecordDetailRowDisplay this$0;
                final Optional val$linkUrl;

                public final void onClick(View view)
                {
                    if (mLinkSelectedHandler != null)
                    {
                        mLinkSelectedHandler.onAction(linkUrl.get());
                    }
                }

            
            {
                this$0 = PurchaseRecordDetailRowDisplay.this;
                linkUrl = optional;
                super();
            }
            });
        }
_L2:
        return;
_L4:
        textview.setText(dateAndTimeHelper.formatAbsoluteDatetime(((Long)linkUrl.getMillisSinceEpoch().get()).longValue()));
        setTextStyle(textview, linkUrl.getStyle());
        textview.setVisibility(0);
        continue; /* Loop/switch isn't completed */
_L5:
        textview.setText(dateAndTimeHelper.formatDate(((Long)linkUrl.getMillisSinceEpoch().get()).longValue(), true));
        setTextStyle(textview, linkUrl.getStyle());
        textview.setVisibility(0);
        continue; /* Loop/switch isn't completed */
_L6:
        String s = (String)linkUrl.getText().get();
        if (!s.isEmpty())
        {
            textview.setText(s);
            setTextStyle(textview, linkUrl.getStyle());
            textview.setVisibility(0);
        }
        if (true) goto _L3; else goto _L7
_L7:
    }

    private void renderDivider(PurchaseRecordRow.RuleWeight ruleweight)
    {
        boolean flag = false;
        View view = mThickDivider;
        int i;
        if (ruleweight == PurchaseRecordRow.RuleWeight.THICK)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        view = mThinDivider;
        if (ruleweight == PurchaseRecordRow.RuleWeight.THIN)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void renderFooter(TextView textview, Optional optional, final Optional footerLinkUrl)
    {
        renderTextView(textview, optional);
        if (footerLinkUrl.isPresent())
        {
            mFooter.setTextAppearance(getContext(), com.google.android.apps.walletnfcrel.R.style.Font_InlineLink);
            Views.setLinkOnClickListener(mFooter, new android.view.View.OnClickListener() {

                final PurchaseRecordDetailRowDisplay this$0;
                final Optional val$footerLinkUrl;

                public final void onClick(View view)
                {
                    if (mLinkSelectedHandler != null)
                    {
                        mLinkSelectedHandler.onAction(footerLinkUrl.get());
                    }
                }

            
            {
                this$0 = PurchaseRecordDetailRowDisplay.this;
                footerLinkUrl = optional;
                super();
            }
            });
        }
    }

    private void renderImageView(ImageView imageview, final Optional linkUrl)
    {
        if (linkUrl.isPresent())
        {
            linkUrl = (PurchaseRecordRenderable)linkUrl.get();
            if (linkUrl.getType() == PurchaseRecordRenderable.Type.IMAGE_URL)
            {
                String s = (String)linkUrl.getImageUrl().get();
                picasso.load(Uri.parse(s)).resizeDimen(com.google.android.apps.walletnfcrel.R.dimen.receipt_detail_token_logo_width, com.google.android.apps.walletnfcrel.R.dimen.receipt_detail_token_logo_height).into(imageview);
                imageview.setVisibility(0);
            }
            if (linkUrl.getType() == PurchaseRecordRenderable.Type.IMAGE_RESOURCE_ID)
            {
                imageview.setImageResource(linkUrl.getImageResourceId());
                imageview.setVisibility(0);
            }
            if (linkUrl.getContentDescription().isPresent())
            {
                imageview.setContentDescription((CharSequence)linkUrl.getContentDescription().get());
            }
            linkUrl = linkUrl.getLinkUrl();
            if (linkUrl.isPresent())
            {
                imageview.setOnClickListener(new android.view.View.OnClickListener() {

                    final PurchaseRecordDetailRowDisplay this$0;
                    final Optional val$linkUrl;

                    public final void onClick(View view)
                    {
                        if (mLinkSelectedHandler != null)
                        {
                            mLinkSelectedHandler.onAction(linkUrl.get());
                        }
                    }

            
            {
                this$0 = PurchaseRecordDetailRowDisplay.this;
                linkUrl = optional;
                super();
            }
                });
            }
        }
    }

    private static void renderTextView(TextView textview, Optional optional)
    {
        int i;
        if (optional.isPresent())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        if (optional.isPresent())
        {
            optional = (CharSequence)optional.get();
        } else
        {
            optional = "";
        }
        textview.setText(optional);
    }

    private static void setTextStyle(TextView textview, PurchaseRecordRenderable.Style style)
    {
        switch (_cls4..SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordRenderable.Style[style.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            textview.setTypeface(textview.getTypeface(), 1);
            return;

        case 2: // '\002'
            textview.setTypeface(textview.getTypeface(), 0);
            return;

        case 3: // '\003'
            textview.setPaintFlags(textview.getPaintFlags() | 0x10);
            break;
        }
    }

    public final void render(PurchaseRecordRow purchaserecordrow)
    {
        renderTextView(mHeader, purchaserecordrow.getHeader());
        renderContentTextView(mContentText, purchaserecordrow.getContent(), purchaserecordrow.isTitleRow());
        renderContentTextView(mContentRightText, purchaserecordrow.getRightContent(), false);
        renderImageView(mImageView, purchaserecordrow.getRightContent());
        renderFooter(mFooter, purchaserecordrow.getFooter(), purchaserecordrow.getFooterLinkUrl());
        renderDivider(purchaserecordrow.getRuleWeight());
    }

    public final void setLinkSelectedHandler(OnActionListener onactionlistener)
    {
        mLinkSelectedHandler = onactionlistener;
    }

}

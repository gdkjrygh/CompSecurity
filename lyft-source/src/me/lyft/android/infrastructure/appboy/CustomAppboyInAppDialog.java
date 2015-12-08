// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.appboy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.models.IInAppMessage;
import com.appboy.models.MessageButton;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.ui.dialogs.DialogContainerView;
import org.json.JSONObject;

public class CustomAppboyInAppDialog extends DialogContainerView
{

    private static final String CAMPAIGN_ID = "campaign_id";
    View background;
    LinearLayout buttonLayout;
    ImageView cancelView;
    DeepLinkManager deepLinkManager;
    DialogFlow dialogFlow;
    ImageLoader imageLoader;
    ImageView imageView;
    private final IInAppMessage inAppMessage;
    TextView messageTextView;
    private final me.lyft.android.ui.AppboyScreens.AppBoyInappDialog params;
    TextView titleTextView;

    public CustomAppboyInAppDialog(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (me.lyft.android.ui.AppboyScreens.AppBoyInappDialog)context.a();
        inAppMessage = params.getAppboyMessage();
    }

    private String getCampaignId()
    {
        JSONObject jsonobject = inAppMessage.forJsonPut();
        if (jsonobject != null)
        {
            return jsonobject.optString("campaign_id");
        } else
        {
            return "no_id";
        }
    }

    private View inflateButton(final MessageButton messageButton, final boolean isPrimary)
    {
        Button button = (Button)inflate(getContext(), 0x7f030007, null);
        button.setTextColor(messageButton.getTextColor());
        if (isPrimary)
        {
            button.setTypeface(null, 1);
        }
        Button button1 = (Button)button.findViewById(0x7f0d0051);
        button1.setText(messageButton.getText());
        button1.setOnClickListener(new android.view.View.OnClickListener() {

            final CustomAppboyInAppDialog this$0;
            final boolean val$isPrimary;
            final MessageButton val$messageButton;

            public void onClick(View view)
            {
label0:
                {
                    if (isPrimary)
                    {
                        view = UiElement.APPBOY_INAPP_PRIMARY;
                    } else
                    {
                        view = UiElement.APPBOY_INAPP_SECONDARY;
                    }
                    UiAnalytics.trackTap(view, Category.APPBOY, getCampaignId());
                    dialogFlow.dismiss();
                    if (messageButton.getClickAction().equals(ClickAction.URI))
                    {
                        view = messageButton.getUri();
                        if (!view.getScheme().equals("lyft"))
                        {
                            break label0;
                        }
                        deepLinkManager.route(view);
                    }
                    return;
                }
                getContext().startActivity(new Intent("android.intent.action.VIEW", view));
            }

            
            {
                this$0 = CustomAppboyInAppDialog.this;
                isPrimary = flag;
                messageButton = messagebutton;
                super();
            }
        });
        return button;
    }

    private void inflateButtonLayout(List list)
    {
        list = list.iterator();
        for (boolean flag = true; list.hasNext(); flag = false)
        {
            MessageButton messagebutton = (MessageButton)list.next();
            buttonLayout.addView(inflateButton(messagebutton, flag), buttonLayout.getChildCount());
        }

    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        UiAnalytics.trackShown(UiElement.APPBOY_INAPP_NOTE, Category.APPBOY, getCampaignId());
        titleTextView.setText(params.getHeader());
        titleTextView.setTextColor(params.getTitleColor());
        String s = inAppMessage.getImageUrl();
        if (!Strings.isNullOrEmpty(s))
        {
            imageLoader.load(s).fit().centerInside().into(imageView);
            imageView.setVisibility(0);
        } else
        {
            imageView.setVisibility(8);
        }
        background.setBackgroundColor(inAppMessage.getBackgroundColor());
        messageTextView.setText(inAppMessage.getMessage());
        messageTextView.setTextColor(inAppMessage.getMessageTextColor());
        inflateButtonLayout(params.getButtons());
        cancelView.setOnClickListener(new android.view.View.OnClickListener() {

            final CustomAppboyInAppDialog this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = CustomAppboyInAppDialog.this;
                super();
            }
        });
    }

    void onCancelClicked()
    {
        UiAnalytics.trackDismiss(UiElement.APPBOY_INAPP_NOTE, Category.APPBOY, getCampaignId());
        dialogFlow.dismiss();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

}

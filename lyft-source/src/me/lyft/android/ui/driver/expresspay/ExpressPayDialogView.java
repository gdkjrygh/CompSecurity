// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.utils.WebBrowser;

public class ExpressPayDialogView extends DialogContainerView
{

    AppFlow appFlow;
    private Binder binder;
    Button buttonTxt;
    ImageView closeButton;
    DialogFlow dialogFlow;
    ImageView dialogIconImageView;
    ImageView dialogTitleImageView;
    TextView dialogTitleTextView;
    View listDivider;
    TextView messageTxt;
    private ExpressPayDialogs.ExpressPayDialog params;
    ISignUrlService signUrlService;
    TextView textUrlView;
    LinearLayout titleContainer;

    public ExpressPayDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (ExpressPayDialogs.ExpressPayDialog)context.a();
    }

    private void openWebPage(final String targetUrl)
    {
        binder.bind(signUrlService.getSignedUrl(targetUrl), new AsyncCall() {

            final ExpressPayDialogView this$0;
            final String val$targetUrl;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                WebBrowser.open(getContext(), targetUrl);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                super.onSuccess(s);
                WebBrowser.open(getContext(), s);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                dialogFlow.dismiss();
            }

            
            {
                this$0 = ExpressPayDialogView.this;
                targetUrl = s;
                super();
            }
        });
    }

    private void updateViews()
    {
        if (params.getIcon() != null)
        {
            dialogIconImageView.setVisibility(0);
            dialogIconImageView.setImageResource(params.getIcon().intValue());
        }
        if (params.getTitleIcon() != null)
        {
            titleContainer.setVisibility(0);
            dialogTitleImageView.setVisibility(0);
            dialogTitleImageView.setImageResource(params.getTitleIcon().intValue());
        }
        if (params.getTitle() != null)
        {
            titleContainer.setVisibility(0);
            dialogTitleTextView.setVisibility(0);
            dialogTitleTextView.setText(params.getTitle());
        }
        messageTxt.setText(Html.fromHtml(params.getMessage()));
        if (!Strings.isNullOrEmpty(params.getTextUrlLabel()) && !Strings.isNullOrEmpty(params.getTextUrl()))
        {
            textUrlView.setVisibility(0);
            textUrlView.setText(params.getTextUrlLabel());
            textUrlView.setPaintFlags(8);
            textUrlView.setOnClickListener(new android.view.View.OnClickListener() {

                final ExpressPayDialogView this$0;

                public void onClick(View view)
                {
                    openWebPage(params.getTextUrl());
                }

            
            {
                this$0 = ExpressPayDialogView.this;
                super();
            }
            });
        }
        if (params.getButtonText() != null)
        {
            final Screen targetScreen = params.getTargetScreen();
            listDivider.setVisibility(0);
            buttonTxt.setVisibility(0);
            buttonTxt.setText(params.getButtonText());
            buttonTxt.setOnClickListener(new android.view.View.OnClickListener() {

                final ExpressPayDialogView this$0;
                final Screen val$targetScreen;

                public void onClick(View view)
                {
                    dialogFlow.dismiss();
                    if (targetScreen != null)
                    {
                        appFlow.goTo(targetScreen);
                    }
                }

            
            {
                this$0 = ExpressPayDialogView.this;
                targetScreen = screen;
                super();
            }
            });
        }
        if (params.showCloseButton())
        {
            closeButton.setOnClickListener(new android.view.View.OnClickListener() {

                final ExpressPayDialogView this$0;

                public void onClick(View view)
                {
                    dialogFlow.dismiss();
                }

            
            {
                this$0 = ExpressPayDialogView.this;
                super();
            }
            });
            return;
        } else
        {
            closeButton.setVisibility(8);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            updateViews();
            return;
        }
    }


}

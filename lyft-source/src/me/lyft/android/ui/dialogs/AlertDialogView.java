// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import me.lyft.android.adapters.DialogItemAdapter;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.utils.MetricsUtils;
import me.lyft.android.utils.SoundManager;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DialogContainerView, DialogResult

public class AlertDialogView extends DialogContainerView
{

    public static final int DIALOG_IMAGE_WIDTH_DP = 88;
    MessageBus bus;
    View buttonsDivider;
    LinearLayout buttonsPlaceholder;
    DialogFlow dialogFlow;
    ImageView dialogIconImageView;
    LinearLayout dialogTitlePlaceholder;
    TextView dialogTitleTxt;
    ImageLoader imageLoader;
    View listDivider;
    ListView listView;
    TextView messageTxt;
    private final MetricsUtils metricsUtils = MetricsUtils.fromView(this);
    me.lyft.android.ui.Dialogs.AlertDialog params;
    SoundManager soundManager;

    public AlertDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (me.lyft.android.ui.Dialogs.AlertDialog)context.a();
    }

    protected void onCancel()
    {
        super.onCancel();
        onResult(-1, -1, true);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        LayoutInflater layoutinflater = LayoutInflater.from(getContext());
        if (params.getIcon() != null)
        {
            dialogIconImageView.setVisibility(0);
            dialogIconImageView.setImageResource(params.getIcon().intValue());
        } else
        if (!Strings.isNullOrEmpty(params.getImageUrl()))
        {
            dialogIconImageView.setVisibility(0);
            int j = metricsUtils.dpToPixels(88F);
            imageLoader.load(params.getImageUrl()).placeholder(0x7f0201fc).centerCrop().resize(j, j).into(dialogIconImageView);
        } else
        {
            dialogIconImageView.setVisibility(8);
        }
        if (params.getTitleLayout() == null)
        {
            Object obj;
            Object obj1;
            int i;
            int k;
            if (!Strings.isNullOrEmpty(params.getTitle()))
            {
                dialogTitleTxt.setText(params.getTitle());
            } else
            {
                dialogTitleTxt.setVisibility(8);
            }
            if (params.getTitleColorResource() != null)
            {
                dialogTitleTxt.setTextColor(getResources().getColor(params.getTitleColorResource().intValue()));
            }
        } else
        {
            dialogTitlePlaceholder.removeAllViews();
            layoutinflater.inflate(params.getTitleLayout().intValue(), dialogTitlePlaceholder);
        }
        if (params.getItems() != null)
        {
            listView.setVisibility(0);
            listView.setAdapter(new DialogItemAdapter(getContext(), params.getItems()));
            listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final AlertDialogView this$0;

                public void onItemClick(AdapterView adapterview, View view1, int l, long l1)
                {
                    dialogFlow.dismiss();
                    onResult(-1, l, false);
                }

            
            {
                this$0 = AlertDialogView.this;
                super();
            }
            });
            listDivider.setVisibility(0);
        }
        if (!Strings.isNullOrEmpty(params.getMessage()))
        {
            messageTxt.setVisibility(0);
            messageTxt.setText(Html.fromHtml(params.getMessage()));
            obj1 = params.getMessageFontSize();
            obj = obj1;
            if (obj1 == null)
            {
                obj = Float.valueOf(getResources().getDimension(0x7f080017));
            }
            messageTxt.setTextSize(0, ((Float) (obj)).floatValue());
        }
        obj = params.getButtons();
        buttonsPlaceholder.setOrientation(params.getButtonsOrientation());
        k = ((ArrayList) (obj)).size();
        if (k > 0)
        {
            buttonsDivider.setVisibility(0);
        } else
        {
            buttonsDivider.setVisibility(8);
        }
        i = 0;
        while (i < k) 
        {
            obj1 = (me.lyft.android.ui.Dialogs.AlertDialog.DialogButtonMeta)((ArrayList) (obj)).get(i);
            final Button button = (Button)layoutinflater.inflate(((me.lyft.android.ui.Dialogs.AlertDialog.DialogButtonMeta) (obj1)).getLayoutId(), null);
            button.setId(((me.lyft.android.ui.Dialogs.AlertDialog.DialogButtonMeta) (obj1)).getId());
            button.setText(((me.lyft.android.ui.Dialogs.AlertDialog.DialogButtonMeta) (obj1)).getText());
            if (params.getButtonsOrientation() == 0)
            {
                button.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, metricsUtils.dpToPixels(56F), 1.0F));
            } else
            {
                button.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, metricsUtils.dpToPixels(56F)));
            }
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final AlertDialogView this$0;
                final Button val$button;

                public void onClick(View view1)
                {
                    dialogFlow.dismiss();
                    onResult(button.getId(), -1, false);
                }

            
            {
                this$0 = AlertDialogView.this;
                button = button1;
                super();
            }
            });
            buttonsPlaceholder.addView(button);
            if (i != k - 1)
            {
                View view = new View(getContext());
                view.setBackgroundColor(getResources().getColor(0x7f0c006d));
                if (params.getButtonsOrientation() == 0)
                {
                    view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(metricsUtils.dpToPixels(1.0F), metricsUtils.dpToPixels(56F)));
                } else
                {
                    view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, metricsUtils.dpToPixels(1.0F)));
                }
                buttonsPlaceholder.addView(view);
            }
            i++;
        }
        if (params.getSound() != null)
        {
            soundManager.play(params.getSound().intValue());
        }
    }

    public void onResult(int i, int j, boolean flag)
    {
        Class class1 = params.getDialogEventClass();
        if (class1 != null)
        {
            DialogResult dialogresult = new DialogResult();
            dialogresult.setButtonId(i);
            dialogresult.setSelectedIndex(j);
            dialogresult.setCancelled(flag);
            bus.post(class1, dialogresult);
        }
    }
}

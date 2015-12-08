// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.ui.inappmessage.IInAppMessageImmersiveView;
import com.appboy.ui.support.StringUtils;
import com.appboy.ui.support.ViewUtils;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            AppboyInAppMessageBaseView, InAppMessageViewUtils

public abstract class AppboyInAppMessageImmersiveBaseView extends AppboyInAppMessageBaseView
    implements IInAppMessageImmersiveView
{

    public AppboyInAppMessageImmersiveBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public abstract List getMessageButtonViews();

    public abstract View getMessageButtonsView();

    public abstract TextView getMessageHeaderTextView();

    public abstract TextView getMessageTextView();

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public void resetMessageMargins()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getMessageImageView() != null)
        {
            flag = flag1;
            if (getMessageImageView().getDrawable() != null)
            {
                flag = true;
            }
        }
        resetMessageMargins(flag);
    }

    public void resetMessageMargins(boolean flag)
    {
        super.resetMessageMargins(flag);
        if (StringUtils.isNullOrBlank(getMessageTextView().getText().toString()))
        {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        if (StringUtils.isNullOrBlank(getMessageHeaderTextView().getText().toString()))
        {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setMessageButtons(List list)
    {
        View view = getMessageButtonsView();
        int i = getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_button_bg_light);
        InAppMessageViewUtils.setButtons(getMessageButtonViews(), view, i, list);
        InAppMessageViewUtils.resetButtonSizesIfNecessary(getMessageButtonViews(), list);
    }

    public void setMessageCloseButtonColor(int i)
    {
        InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageCloseButtonView(), i, getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_button_close_light));
    }

    public void setMessageHeaderText(String s)
    {
        getMessageHeaderTextView().setText(s);
    }

    public void setMessageHeaderTextColor(int i)
    {
        InAppMessageViewUtils.setTextViewColor(getMessageHeaderTextView(), i);
    }
}

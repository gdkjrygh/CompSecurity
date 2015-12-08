// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.ui.inappmessage.IInAppMessageView;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.StringUtils;
import com.appboy.ui.support.ViewUtils;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            InAppMessageViewUtils

public abstract class AppboyInAppMessageBaseView extends RelativeLayout
    implements IInAppMessageView
{

    final boolean mCanUseFresco;

    public AppboyInAppMessageBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mCanUseFresco = FrescoLibraryUtils.canUseFresco(context);
    }

    public abstract Object getMessageBackgroundObject();

    public View getMessageClickableView()
    {
        return this;
    }

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract View getMessageSimpleDraweeView();

    public abstract TextView getMessageTextView();

    View getProperViewFromInflatedStub(int i)
    {
        ((ViewStub)findViewById(i)).inflate();
        if (mCanUseFresco)
        {
            return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_drawee_view);
        } else
        {
            return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_image_view);
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
        RelativeLayout relativelayout;
        Object obj;
        if (mCanUseFresco)
        {
            obj = getMessageSimpleDraweeView();
            relativelayout = (RelativeLayout)findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_drawee_view_parent);
        } else
        {
            obj = getMessageImageView();
            relativelayout = (RelativeLayout)findViewById(com.appboy.ui.R.id.com_appboy_stubbed_inappmessage_image_view_parent);
        }
        if (obj != null)
        {
            if (!flag)
            {
                ViewUtils.removeViewFromParent(((View) (obj)));
                if (relativelayout != null)
                {
                    ViewUtils.removeViewFromParent(relativelayout);
                }
            } else
            {
                ViewUtils.removeViewFromParent(getMessageIconView());
            }
        }
        if (getMessageIconView() != null && StringUtils.isNullOrBlank((String)getMessageIconView().getText()))
        {
            ViewUtils.removeViewFromParent(getMessageIconView());
        }
    }

    public void setMessage(String s)
    {
        getMessageTextView().setText(s);
    }

    public void setMessageBackgroundColor(int i)
    {
        InAppMessageViewUtils.setViewBackgroundColor((View)getMessageBackgroundObject(), i);
    }

    public void setMessageIcon(String s, int i, int j)
    {
        InAppMessageViewUtils.setIcon(getContext(), s, i, j, getMessageIconView());
    }

    public void setMessageImageView(Bitmap bitmap)
    {
        InAppMessageViewUtils.setImage(bitmap, getMessageImageView());
    }

    public void setMessageSimpleDrawee(String s)
    {
        FrescoLibraryUtils.setDraweeControllerHelper((SimpleDraweeView)getMessageSimpleDraweeView(), s, 0.0F, false);
    }

    public void setMessageTextColor(int i)
    {
        InAppMessageViewUtils.setTextViewColor(getMessageTextView(), i);
    }
}

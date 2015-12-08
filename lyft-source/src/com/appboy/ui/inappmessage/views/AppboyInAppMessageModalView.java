// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            AppboyInAppMessageImmersiveBaseView, InAppMessageViewUtils

public class AppboyInAppMessageModalView extends AppboyInAppMessageImmersiveBaseView
{

    private ImageView mImageView;
    private View mSimpleDraweeView;

    public AppboyInAppMessageModalView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public Drawable getMessageBackgroundObject()
    {
        return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal).getBackground();
    }

    public volatile Object getMessageBackgroundObject()
    {
        return getMessageBackgroundObject();
    }

    public List getMessageButtonViews()
    {
        ArrayList arraylist = new ArrayList();
        if (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_one) != null)
        {
            arraylist.add(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_one));
        }
        if (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_two) != null)
        {
            arraylist.add(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_two));
        }
        return arraylist;
    }

    public View getMessageButtonsView()
    {
        return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_button_layout);
    }

    public View getMessageClickableView()
    {
        return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal);
    }

    public View getMessageCloseButtonView()
    {
        return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_close_button);
    }

    public TextView getMessageHeaderTextView()
    {
        return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_header_text);
    }

    public TextView getMessageIconView()
    {
        return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_icon);
    }

    public ImageView getMessageImageView()
    {
        return mImageView;
    }

    public View getMessageSimpleDraweeView()
    {
        return mSimpleDraweeView;
    }

    public TextView getMessageTextView()
    {
        return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal_message);
    }

    public void inflateStubViews()
    {
        if (mCanUseFresco)
        {
            mSimpleDraweeView = getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_modal_drawee_stub);
            ((GenericDraweeHierarchy)((SimpleDraweeView)mSimpleDraweeView).getHierarchy()).setActualImageScaleType(com.facebook.drawee.drawable.ScalingUtils.ScaleType.CENTER_INSIDE);
            return;
        } else
        {
            mImageView = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_modal_imageview_stub);
            return;
        }
    }

    public void setMessageBackgroundColor(int i)
    {
        InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_modal), i, getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_background_light));
    }
}

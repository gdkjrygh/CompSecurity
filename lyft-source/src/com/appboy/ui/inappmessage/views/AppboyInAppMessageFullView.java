// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            AppboyInAppMessageImmersiveBaseView

public class AppboyInAppMessageFullView extends AppboyInAppMessageImmersiveBaseView
{

    private ImageView mImageView;
    private View mSimpleDraweeView;

    public AppboyInAppMessageFullView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public Object getMessageBackgroundObject()
    {
        return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full);
    }

    public List getMessageButtonViews()
    {
        ArrayList arraylist = new ArrayList();
        if (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_one) != null)
        {
            arraylist.add(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_one));
        }
        if (findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_two) != null)
        {
            arraylist.add(findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_two));
        }
        return arraylist;
    }

    public View getMessageButtonsView()
    {
        return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_button_layout);
    }

    public View getMessageCloseButtonView()
    {
        return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_close_button);
    }

    public TextView getMessageHeaderTextView()
    {
        return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_header_text);
    }

    public TextView getMessageIconView()
    {
        return null;
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
        return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_full_message);
    }

    public void inflateStubViews()
    {
        if (mCanUseFresco)
        {
            mSimpleDraweeView = getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_full_drawee_stub);
            ((GenericDraweeHierarchy)((SimpleDraweeView)mSimpleDraweeView).getHierarchy()).setActualImageScaleType(com.facebook.drawee.drawable.ScalingUtils.ScaleType.FIT_CENTER);
            return;
        } else
        {
            mImageView = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_full_imageview_stub);
            mImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            mImageView.setAdjustViewBounds(true);
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.enums.inappmessage.ClickAction;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            AppboyInAppMessageBaseView, InAppMessageViewUtils

public class AppboyInAppMessageSlideupView extends AppboyInAppMessageBaseView
{

    private ImageView mImageView;
    private View mSimpleDraweeView;

    public AppboyInAppMessageSlideupView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public View getMessageBackgroundObject()
    {
        return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_slideup);
    }

    public volatile Object getMessageBackgroundObject()
    {
        return getMessageBackgroundObject();
    }

    public View getMessageChevronView()
    {
        return findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_chevron);
    }

    public TextView getMessageIconView()
    {
        return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_icon);
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
        return (TextView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_message);
    }

    public void inflateStubViews()
    {
        if (mCanUseFresco)
        {
            mSimpleDraweeView = getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_drawee_stub);
            ((GenericDraweeHierarchy)((SimpleDraweeView)mSimpleDraweeView).getHierarchy()).setActualImageScaleType(com.facebook.drawee.drawable.ScalingUtils.ScaleType.FIT_CENTER);
            return;
        } else
        {
            mImageView = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_inappmessage_slideup_imageview_stub);
            return;
        }
    }

    public void setMessageChevron(int i, ClickAction clickaction)
    {
        class _cls1
        {

            static final int $SwitchMap$com$appboy$enums$inappmessage$ClickAction[];

            static 
            {
                $SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[ClickAction.values().length];
                try
                {
                    $SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1..SwitchMap.com.appboy.enums.inappmessage.ClickAction[clickaction.ordinal()])
        {
        default:
            InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageChevronView(), i, getContext().getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_chevron));
            return;

        case 1: // '\001'
            getMessageChevronView().setVisibility(8);
            break;
        }
    }
}

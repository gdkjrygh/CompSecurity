// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.facebook.share.widget:
//            ShareButtonBase, ShareDialog

public final class ShareButton extends ShareButtonBase
{

    public ShareButton(Context context)
    {
        super(context, null, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public ShareButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public ShareButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, "fb_share_button_create", "fb_share_button_did_tap");
    }

    protected int getDefaultRequestCode()
    {
        return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
    }

    protected int getDefaultStyleResource()
    {
        return com.facebook.R.style.com_facebook_button_share;
    }

    protected android.view.View.OnClickListener getShareOnClickListener()
    {
        return new android.view.View.OnClickListener() {

            final ShareButton this$0;

            public void onClick(View view)
            {
                callExternalOnClickListener(view);
                if (getFragment() != null)
                {
                    view = new ShareDialog(getFragment(), getRequestCode());
                } else
                {
                    view = new ShareDialog(getActivity(), getRequestCode());
                }
                view.show(getShareContent());
            }

            
            {
                this$0 = ShareButton.this;
                super();
            }
        };
    }


}

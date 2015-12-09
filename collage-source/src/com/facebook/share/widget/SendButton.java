// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.internal.FacebookDialogBase;

// Referenced classes of package com.facebook.share.widget:
//            ShareButtonBase, MessageDialog

public final class SendButton extends ShareButtonBase
{

    public SendButton(Context context)
    {
        super(context, null, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public SendButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public SendButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, "fb_send_button_create", "fb_send_button_did_tap");
    }

    protected int getDefaultRequestCode()
    {
        return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
    }

    protected int getDefaultStyleResource()
    {
        return com.facebook.R.style.com_facebook_button_send;
    }

    protected FacebookDialogBase getDialog()
    {
        if (getFragment() != null)
        {
            return new MessageDialog(getFragment(), getRequestCode());
        } else
        {
            return new MessageDialog(getActivity(), getRequestCode());
        }
    }
}

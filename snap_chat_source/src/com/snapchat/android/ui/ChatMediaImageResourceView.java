// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Fe;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatMedia;

// Referenced classes of package com.snapchat.android.ui:
//            FitWidthImageResourceView

public class ChatMediaImageResourceView extends FitWidthImageResourceView
{

    protected ViewGroup a;
    private View g;
    private View h;

    public ChatMediaImageResourceView(Context context)
    {
        super(context);
    }

    public ChatMediaImageResourceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ChatMediaImageResourceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void b(SnapchatResource.ResourceStatus resourcestatus)
    {
        if (c != null)
        {
            if (g != null)
            {
                if (resourcestatus == SnapchatResource.ResourceStatus.LOADING || c.a.Q())
                {
                    g.setVisibility(0);
                } else
                {
                    g.setVisibility(8);
                }
            }
            if (h != null)
            {
                if (resourcestatus == SnapchatResource.ResourceStatus.LOADING_FAILED)
                {
                    h.setVisibility(0);
                    return;
                } else
                {
                    h.setVisibility(8);
                    return;
                }
            }
        }
    }

    public final void a(SnapchatResource.ResourceStatus resourcestatus)
    {
        b(resourcestatus);
        super.a(resourcestatus);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a = (ViewGroup)getParent();
        if (a == null)
        {
            return;
        } else
        {
            g = a.findViewById(0x7f0d0154);
            h = a.findViewById(0x7f0d018b);
            return;
        }
    }

    public void setChatMedia(ChatMedia chatmedia, SnapchatResource.a a1)
    {
        super.setChatMedia(chatmedia, a1);
        b(f);
    }
}

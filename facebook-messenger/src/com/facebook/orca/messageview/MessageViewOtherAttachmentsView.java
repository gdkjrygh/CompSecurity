// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.attachments.OtherAttachmentData;
import com.facebook.orca.attachments.a;
import com.facebook.widget.images.UrlImage;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.messageview:
//            l

public class MessageViewOtherAttachmentsView extends LinearLayout
{

    private a a;
    private Message b;
    private es c;
    private int d;

    public MessageViewOtherAttachmentsView(Context context)
    {
        super(context);
        a(context, null);
    }

    public MessageViewOtherAttachmentsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    private void a()
    {
        for (; d < c.size(); d = d + 1)
        {
            addView(new l(getContext()), d);
        }

        int i;
        for (i = 0; i < d && i < c.size(); i++)
        {
            a(i);
        }

        for (; i < d; i++)
        {
            ((UrlImage)getChildAt(i)).setVisibility(8);
        }

    }

    private void a(int i)
    {
        ((l)getChildAt(i)).setAttachmentInfo((OtherAttachmentData)c.get(i));
    }

    private void a(Context context, AttributeSet attributeset)
    {
        a = (a)t.a(context).a(com/facebook/orca/attachments/a);
        setOrientation(1);
    }

    public Message getMessage()
    {
        return b;
    }

    public void setMessage(Message message)
    {
        b = message;
        c = a.g(message);
        a();
    }
}

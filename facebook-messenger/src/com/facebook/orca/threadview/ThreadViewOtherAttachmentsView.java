// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.attachments.OtherAttachmentData;
import com.facebook.orca.attachments.a;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.threadview:
//            dl

public class ThreadViewOtherAttachmentsView extends LinearLayout
{

    private a a;
    private Message b;
    private es c;
    private int d;

    public ThreadViewOtherAttachmentsView(Context context)
    {
        this(context, null);
    }

    public ThreadViewOtherAttachmentsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = (a)t.a(context).a(com/facebook/orca/attachments/a);
        setOrientation(1);
    }

    private void a()
    {
        for (; d < c.size(); d = d + 1)
        {
            addView(new dl(getContext()), d);
        }

        int i;
        for (i = 0; i < d && i < c.size(); i++)
        {
            a(i);
        }

        for (; i < d; i++)
        {
            ((dl)getChildAt(i)).setVisibility(8);
        }

    }

    private void a(int i)
    {
        ((dl)getChildAt(i)).setAttachmentInfo((OtherAttachmentData)c.get(i));
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.skype.android.util.ViewUtil;

// Referenced classes of package com.skype.android.app.chat:
//            MessageViewAdapter, SyntheticTypes, j, MessageHolder

final class d extends MessageViewAdapter
{
    private static final class a extends j
    {

        public a(View view)
        {
            super(view);
        }
    }


    private static final int supportedMessageTypes[];

    public d(Activity activity)
    {
        super(activity);
    }

    protected final void bindContentView(j j1, MessageHolder messageholder)
    {
    }

    protected final j createMessageViewHolder(View view)
    {
        return new a(view);
    }

    protected final CharSequence getDefaultContentDescription(j j1, MessageHolder messageholder)
    {
        return ViewUtil.b((TextView)j1.itemView);
    }

    protected final int getLayoutId(int i)
    {
        return 0x7f03003c;
    }

    public final int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    public final boolean isStandalone(MessageHolder messageholder)
    {
        return true;
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            SyntheticTypes.HEADER.getType()
        });
    }
}

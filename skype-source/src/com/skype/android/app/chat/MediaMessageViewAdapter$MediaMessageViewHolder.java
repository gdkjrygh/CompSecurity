// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.widget.ImageView;
import com.skype.android.widget.bubbles.BubbleTextView;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.chat:
//            f, MediaMessageViewAdapter

protected abstract class thumbnail extends f
{

    Future bitmapFuture;
    BubbleTextView mediaRemovedTextView;
    int messageId;
    final MediaMessageViewAdapter this$0;
    ImageView thumbnail;

    abstract void initializeViews();

    public (View view)
    {
        this$0 = MediaMessageViewAdapter.this;
        super(view);
        initializeViews();
        if (thumbnail == null)
        {
            throw new RuntimeException("Using this adapter probably means there is a thumbnail to display. No view for the thumbnail was provided.");
        } else
        {
            return;
        }
    }
}

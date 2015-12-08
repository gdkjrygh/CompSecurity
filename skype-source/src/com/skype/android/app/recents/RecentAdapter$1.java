// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.app.Activity;
import android.util.SparseArray;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.android.app.chat.ChatMessageUtils;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.widget.TranslationClickableSpan;

// Referenced classes of package com.skype.android.app.recents:
//            RecentAdapter

final class val.context
    implements AsyncCallback
{

    final RecentAdapter this$0;
    final Activity val$context;

    public final void done(AsyncResult asyncresult)
    {
        if (!asyncresult.d())
        {
            CharSequence charsequence = (CharSequence)asyncresult.a();
            TranslationClickableSpan.a(charsequence);
            centItemViewHolder centitemviewholder = (centItemViewHolder)asyncresult.b();
            asyncresult = val$context.getResources();
            centitemviewholder.lastMessageTextView.setText(charsequence);
            if (ChatMessageUtils.isSingleUrlSpanMessage(charsequence) && configuration.isUrlPreviewEnabled())
            {
                RecentAdapter.access$000(RecentAdapter.this, charsequence, centitemviewholder, asyncresult);
            }
            asyncresult = charsequence;
            Object obj = asyncresult;
            if (centitemviewholder.lastMessageTextView.getTag() != null)
            {
                Conversation conversation = (Conversation)centitemviewholder.lastMessageTextView.getTag();
                RecentAdapter.access$100(RecentAdapter.this).put(conversation.getObjectID(), charsequence);
                obj = asyncresult;
                if (conversation.getUnconsumedNormalMessagesProp() > 0)
                {
                    obj = (new StringBuilder()).append(RecentAdapter.access$200(RecentAdapter.this).getString(0x7f0800ea)).append(charsequence).toString();
                }
            }
            centitemviewholder.lastMessageTextView.setContentDescription(((CharSequence) (obj)));
        }
    }

    centItemViewHolder()
    {
        this$0 = final_recentadapter;
        val$context = Activity.this;
        super();
    }
}

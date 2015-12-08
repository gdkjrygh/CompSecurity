// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.EmoticonSize;
import com.skype.android.mediacontent.EmoticonSpan;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.FormattedMessageCache;

// Referenced classes of package com.skype.android.app.chat:
//            MessageViewAdapter, MessageViewAdapterComponent, MessageHolder, j

final class b extends MessageViewAdapter
{
    private static final class a extends j
    {

        TextView contents;
        TextView emoticon;
        View spacing;

        public a(View view)
        {
            super(view);
            contents = (TextView)ViewUtil.a(view, 0x7f1002aa);
            emoticon = (TextView)ViewUtil.a(view, 0x7f1002ae);
            if (emoticon != null)
            {
                new SpannedAnimationDrawableCallback(emoticon);
            }
            spacing = ViewUtil.a(view, 0x7f1002b1);
        }
    }


    private static final String CAKE_EMOTICON = "cake";
    private static final int supportedMessageTypes[];
    AccessibilityUtil accessibilityUtil;
    SkyLib lib;
    MediaContentRoster mediaContentRoster;
    FormattedMessageCache spanCache;

    b(Activity activity)
    {
        super(activity);
        getComponent().inject(this);
    }

    private void setEmoticon(TextView textview, int i)
    {
        EmoticonContent emoticoncontent;
label0:
        {
            if (i == com.skype.Message.TYPE.HAS_BIRTHDAY.toInt())
            {
                emoticoncontent = (EmoticonContent)mediaContentRoster.a("cake", com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
                if (emoticoncontent != null)
                {
                    break label0;
                }
                textview.setVisibility(8);
            }
            return;
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(" ");
        spannablestringbuilder.setSpan(new EmoticonSpan(emoticoncontent, EmoticonSize.c, true), 0, spannablestringbuilder.length(), 33);
        textview.setText(spannablestringbuilder);
        textview.setContentDescription(getContext().getString(0x7f0801c3));
    }

    protected final void bindContentView(j j1, MessageHolder messageholder)
    {
        a a1 = (a)j1;
        a1.itemView.setTag(a1);
        CharSequence charsequence = spanCache.a((Message)messageholder.getMessageObject(), 0x7f0f0050);
        a1.contents.setText(charsequence);
        accessibilityUtil.a(a1.contents, charsequence, true);
        if (a1.emoticon != null)
        {
            setEmoticon(((a)j1).emoticon, messageholder.getTypeOrdinal());
        }
        j1 = a1.spacing;
        byte byte0;
        if (a1.isChatItemExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        j1.setVisibility(byte0);
    }

    protected final j createMessageViewHolder(View view)
    {
        return new a(view);
    }

    protected final CharSequence getDefaultContentDescription(j j1, MessageHolder messageholder)
    {
        return ViewUtil.b(((a)j1).contents).concat(", ").concat(ViewUtil.b(j1.getTimestampView()));
    }

    protected final int getLayoutId(int i)
    {
        return i != com.skype.Message.TYPE.HAS_BIRTHDAY.toInt() ? 0x7f030042 : 0x7f030043;
    }

    public final int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    protected final long getTimestamp(MessageHolder messageholder)
    {
        return messageholder.getTimestamp();
    }

    public final boolean isStandalone(MessageHolder messageholder)
    {
        return true;
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_EMOTE.toInt(), com.skype.Message.TYPE.SET_METADATA.toInt(), com.skype.Message.TYPE.ADDED_CONSUMERS.toInt(), com.skype.Message.TYPE.ADDED_LEGACY_CONSUMERS.toInt(), com.skype.Message.TYPE.LEGACY_MEMBER_UPGRADED.toInt(), com.skype.Message.TYPE.RETIRED.toInt(), com.skype.Message.TYPE.RETIRED_OTHERS.toInt(), com.skype.Message.TYPE.SPAWNED_CONFERENCE.toInt(), com.skype.Message.TYPE.POSTED_CONTACTS.toInt(), com.skype.Message.TYPE.HAS_BIRTHDAY.toInt()
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.chat.ChatConversation;

public final class oz extends oD
{

    public static final String CHAT_TYPING_PATH = "/bq/chat_typing";
    private static final String TAG = "TellThemIAmTypingTask";
    private ChatConversation mConversation;

    public oz(ChatConversation chatconversation)
    {
        mConversation = chatconversation;
        mConversation.mIsNotifyingRecipientAboutTyping = true;
    }

    protected final String getPath()
    {
        return "/bq/chat_typing";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new Qp()).a(mConversation.F())));
    }

    public final void onResult(pi pi)
    {
        super.onResult(pi);
        mConversation.mIsNotifyingRecipientAboutTyping = false;
    }
}

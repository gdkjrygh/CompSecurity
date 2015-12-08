// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;

public final class ow extends oD
{

    private ChatConversation mConversation;
    private String mConversationId;

    public ow(ChatConversation chatconversation)
    {
        mConversation = chatconversation;
        mConversationId = chatconversation.mId;
    }

    protected final String getPath()
    {
        return "/loq/clear_conversation";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new Qr()).a(mConversationId)));
    }

    public final void onResult(pi pi1)
    {
        super.onResult(pi1);
        if (pi1.c())
        {
            By.c().b(mConversationId, true);
        } else
        {
            Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, 0x7f080261));
            mConversation.mBeingCleared = false;
        }
        Mf.a().a(new OE());
    }
}

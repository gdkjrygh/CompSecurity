// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.BaseToast;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.api.model.ConversationMessage;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import org.apache.commons.lang3.StringUtils;

public class ConversationMessageToast extends BaseToast
{

    private ConversationMessage _lastMessage;
    private User _sender;

    public ConversationMessageToast(ConversationMessage conversationmessage, User user)
    {
        _lastMessage = conversationmessage;
        _sender = user;
    }

    private String getSecondaryText()
    {
        if (StringUtils.isNotBlank(_lastMessage.getText()))
        {
            return _lastMessage.getText();
        }
        if (_lastMessage.getPinId() != null)
        {
            return Resources.string(0x7f070515);
        }
        if (_lastMessage.getBoardId() != null)
        {
            return Resources.string(0x7f070514);
        }
        if (_lastMessage.getUserId() != null)
        {
            return Resources.string(0x7f070516);
        } else
        {
            return null;
        }
    }

    public View getView(ToastContainer toastcontainer)
    {
        setLayoutGravity(81);
        setArrowVis(true);
        if (_sender != null && _lastMessage != null)
        {
            setMessage(_sender.getFullName());
            setImageUrl(_sender.getImageMediumUrl());
            setSecondaryMessage(getSecondaryText());
        }
        return super.getView(toastcontainer);
    }

    public void onToastClicked(Context context)
    {
        Events.post(new Navigation(Location.CONVERSATION, _lastMessage.getConversationId()));
    }
}

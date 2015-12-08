// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.pinterest.activity.contacts.UploadContactsUtil;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.events.SendEvent;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.api.remote.SendApi;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class SendToast extends BaseToast
{

    private final TypeAheadItem _item;
    private final String _message;
    private final SendableObject _objectToSend;

    public SendToast(SendEvent sendevent)
    {
        _item = sendevent.getItem();
        _objectToSend = sendevent.getObjectToSend();
        _message = sendevent.getMessage();
    }

    private void actuallySend()
    {
        String s;
        String s2;
        s = null;
        s2 = _objectToSend.getUid();
        if (!Arrays.asList(new com.pinterest.activity.search.model.TypeAheadItem.ItemType[] {
            com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_CONTACT, com.pinterest.activity.search.model.TypeAheadItem.ItemType.FACEBOOK_CONTACT, com.pinterest.activity.search.model.TypeAheadItem.ItemType.EXTERNAL_CONTACT
        }).contains(_item.getItemType())) goto _L2; else goto _L1
_L1:
        if (_item.getImageUri() != null)
        {
            s = _item.getImageUri().toString();
        }
        if (!_objectToSend.isPin()) goto _L4; else goto _L3
_L3:
        SendApi.a(s2, _item.getIdentifier(), _item.getTitle(), s, _message, new SendPinResponseHandler(_objectToSend));
_L6:
        return;
_L4:
        if (_objectToSend.isBoard())
        {
            SendApi.b(s2, _item.getIdentifier(), _item.getTitle(), s, _message, new BoardSendResponseHandler(_objectToSend));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (_item.getItemType() != com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONVERSATION)
        {
            break; /* Loop/switch isn't completed */
        }
        String s1;
        if (StringUtils.isEmpty(_message))
        {
            s1 = null;
        } else
        {
            s1 = _message;
        }
        if (_objectToSend.isPin())
        {
            ConversationApi.a(_item.getUid(), _objectToSend.getUid(), s1, new SendPinResponseHandler(_objectToSend), null);
            return;
        }
        if (_objectToSend.isBoard())
        {
            ConversationApi.a(_item.getUid(), _objectToSend.getUid(), s1, new BoardSendResponseHandler(_objectToSend));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (_objectToSend.isPin())
        {
            SendApi.a(s2, _item.getIdentifier(), _message, new SendPinResponseHandler(_objectToSend));
            return;
        }
        if (_objectToSend.isBoard())
        {
            SendApi.b(s2, _item.getIdentifier(), _message, new BoardSendResponseHandler(_objectToSend));
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    private void askContactUploadPermission(Activity activity)
    {
        if (UploadContactsUtil.shouldShowDialog(activity))
        {
            UploadContactsUtil.postContactUploadNavigation();
        }
    }

    public View getView(ToastContainer toastcontainer)
    {
        setLayoutGravity(81);
        if (_objectToSend.isPin())
        {
            setMessage(Resources.string(0x7f070418));
        } else
        if (_objectToSend.isBoard())
        {
            setMessage(Resources.string(0x7f07009e));
        }
        setSecondaryMessage(Resources.string(0x7f070599, new Object[] {
            _item.getTitle()
        }));
        setButtonText(Resources.string(0x7f0705b1));
        if (_item.getImageUri() != null)
        {
            setImageUri(Uri.parse(_item.getImageUri()));
        } else
        {
            setImageResource(0x7f020182);
        }
        return super.getView(toastcontainer);
    }

    public void onToastCancelled(Context context)
    {
        super.onToastCancelled(context);
        Pinalytics.a(ElementType.UNDO_BUTTON, ComponentType.TOAST);
        Application.forceShowToast(Resources.string(0x7f07050c));
    }

    public void onToastCompleted(Context context)
    {
        super.onToastCompleted(context);
        actuallySend();
        if (context instanceof Activity)
        {
            askContactUploadPermission((Activity)context);
        }
    }

    private class SendPinResponseHandler extends BaseApiResponseHandler
    {

        private SendableObject _objectToSend;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Application.forceShowToast(Resources.string(0x7f07050e));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.PIN_SEND, _objectToSend.getUid());
            RecentConversations.refresh();
        }

        public SendPinResponseHandler(SendableObject sendableobject)
        {
            _objectToSend = sendableobject;
        }
    }


    private class BoardSendResponseHandler extends BaseApiResponseHandler
    {

        private SendableObject _objectToSend;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Application.forceShowToast(Resources.string(0x7f07050a));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.BOARD_SEND, _objectToSend.getUid());
            RecentConversations.refresh();
        }

        public BoardSendResponseHandler(SendableObject sendableobject)
        {
            _objectToSend = sendableobject;
        }
    }

}

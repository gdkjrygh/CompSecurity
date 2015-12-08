// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare.util;

import android.text.TextUtils;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.events.SendEvent;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.SendToast;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class SendShareUtils
{

    private static final int SEND_DELAY = 250;
    private static SendShareUtils _instance = null;

    private SendShareUtils()
    {
    }

    public static SendShareUtils getInstance()
    {
        com/pinterest/activity/sendshare/util/SendShareUtils;
        JVM INSTR monitorenter ;
        SendShareUtils sendshareutils;
        if (_instance == null)
        {
            _instance = new SendShareUtils();
        }
        sendshareutils = _instance;
        com/pinterest/activity/sendshare/util/SendShareUtils;
        JVM INSTR monitorexit ;
        return sendshareutils;
        Exception exception;
        exception;
        throw exception;
    }

    private void savePinImage(BaseActivity baseactivity, final Pin pin)
    {
        Pinalytics.a(ElementType.PIN_SAVE_BUTTON, ComponentType.MODAL_PIN, pin.getUid());
        (new _cls2()).execute();
    }

    private void sendToRealContact(TypeAheadItem typeaheaditem, SendableObject sendableobject, String s)
    {
        typeaheaditem = new SendEvent(typeaheaditem);
        typeaheaditem.setObjectToSend(sendableobject);
        if (!TextUtils.isEmpty(s))
        {
            typeaheaditem.setMessage(s);
        }
        Events.postDelayed(new ToastEvent(new SendToast(typeaheaditem)), 250L);
    }

    public String getPinterestLink(SendableObject sendableobject)
    {
        if (sendableobject.getType() == 0)
        {
            return ModelHelper.getPin(sendableobject.getUid()).getPinterestLink();
        }
        if (sendableobject.getType() == 1)
        {
            return ModelHelper.getBoard(sendableobject.getUid()).getUrl();
        } else
        {
            return null;
        }
    }

    public void postSendShareNavigation(Model model)
    {
        int i = 0;
        Navigation navigation;
        if (!(model instanceof Pin))
        {
            if (model instanceof Board)
            {
                i = 1;
            } else
            {
                PLog.error("Model type not supported in send & share", new Object[0]);
                return;
            }
        }
        navigation = new Navigation(Location.SEND_SHARE);
        navigation.putExtra("sendableObject", new SendableObject(model.getUid(), i));
        Events.post(navigation);
    }

    public void reportPin(Pin pin)
    {
        Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.NAVIGATION);
        Events.post(new Navigation(Location.REPORT_PIN, pin));
    }

    public void sendToTypeAheadItem(TypeAheadItem typeaheaditem, SendableObject sendableobject)
    {
        sendToTypeAheadItem(typeaheaditem, sendableobject, null);
    }

    public void sendToTypeAheadItem(TypeAheadItem typeaheaditem, SendableObject sendableobject, String s)
    {
        switch (_cls3..SwitchMap.com.pinterest.activity.search.model.TypeAheadItem.ItemType[typeaheaditem.getItemType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            String s1 = typeaheaditem.getIdentifier();
            if (SignupFormUtils.isEmailValid(s1))
            {
                typeaheaditem.setTitle(s1);
                typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_CONTACT);
                sendToRealContact(typeaheaditem, sendableobject, s);
                return;
            } else
            {
                Application.showToast(0x7f0702fa);
                return;
            }

        case 3: // '\003'
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
            return;

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED);
            sendToRealContact(typeaheaditem, sendableobject, s);
            return;
        }
    }

    public void trySavePinImage(final BaseActivity activity, final Pin pin)
    {
        PermissionUtil.checkPermissionAsync(activity, "android.permission.WRITE_EXTERNAL_STORAGE", 0x7f070572, new _cls1());
    }



    private class _cls2 extends BackgroundTask
    {

        private boolean saved;
        final SendShareUtils this$0;
        final Pin val$pin;

        public void onFinish()
        {
            super.onFinish();
            Pinalytics.a(EventType.PIN_SAVE_TO_DEVICE, pin.getUid());
            int i;
            int j;
            if (saved)
            {
                i = 0x7f070410;
            } else
            {
                i = 0x7f07040f;
            }
            if (saved)
            {
                j = 0;
            } else
            {
                j = 0x7f020173;
            }
            Application.showToast(i, j);
        }

        public void run()
        {
            saved = ImageApi.a(pin.getImageLargeUrl());
        }

        _cls2()
        {
            this$0 = SendShareUtils.this;
            pin = pin1;
            super();
            saved = false;
        }
    }


    private class _cls3
    {

        static final int $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType = new int[com.pinterest.activity.search.model.TypeAheadItem.ItemType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.FACEBOOK_CONTACT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_PLACEHOLDER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONNECT_FB_PLACEHOLDER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.MUTUAL_FOLLOW.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_CONTACT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.EXTERNAL_CONTACT.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONVERSATION.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.PINNER.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONTACT_NOT_FOUND_MISSING_PERMISSION.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    {

        final SendShareUtils this$0;
        final BaseActivity val$activity;
        final Pin val$pin;

        public void onRequestPermissionsResult(int i, String as[], int ai[])
        {
            if (PermissionUtil.checkPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE"))
            {
                savePinImage(activity, pin);
                return;
            } else
            {
                Application.showToast(0x7f07040f);
                return;
            }
        }

        _cls1()
        {
            this$0 = SendShareUtils.this;
            activity = baseactivity;
            pin = pin1;
            super();
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ScrollView;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PButton;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            RepinFragment

public class PinEditFragment extends RepinFragment
{

    public android.view.View.OnClickListener onDeleteClick;

    public PinEditFragment()
    {
        onDeleteClick = new _cls2();
    }

    private void deletePin()
    {
        ModelHelper.deletePin(_pin.getUid(), new _cls4(0x7f0701f7), getApiTag());
    }

    public void askDeletePin()
    {
        final BaseDialog dialog = new BaseDialog();
        dialog.setTitle(0x7f070166);
        dialog.setMessage(0x7f0701ef);
        dialog.setPositiveButton(0x7f0701ee, new _cls3());
        dialog.setNegativeButton(0x7f0700af, null);
        dialog.setCancelable(true);
        Events.post(new DialogEvent(dialog));
    }

    public int getTitleId()
    {
        return 0x7f070218;
    }

    protected void init(View view)
    {
        super.init(view);
        scroller.setForeground(null);
        if (_pin != null)
        {
            updatePlaceDisplay(_pin.getPlace(), _pin.getDescription());
            _positiveBtn.setText(0x7f0704be);
            ViewHelper.setLeftDrawable(_positiveBtn, 0);
            setNegativeButtonAction(Resources.string(0x7f0701e7), onDeleteClick);
            _hideSocialContainer = true;
            MyUser.setLastSelectedBoardId(_pin.getBoardUid());
        }
    }

    public void pin()
    {
        Pinalytics.a(ElementType.PIN_EDIT_BUTTON, ComponentType.MODAL_ADD_PIN, _pin.getUid());
        String s = getActivity().getIntent().getStringExtra("com.pinterest.EXTRA_PLACE_ID");
        com.pinterest.api.remote.PinApi.PinDetailParams pindetailparams = new com.pinterest.api.remote.PinApi.PinDetailParams();
        pindetailparams.a = _pin.getUid();
        pindetailparams.b = boardUid;
        pindetailparams.c = s;
        pindetailparams.d = getDescriptionTextFromEditField();
        PinApi.a(pindetailparams, new _cls1(true), getApiTag());
    }

    protected void showBoardSelector()
    {
        Bundle bundle = new Bundle();
        if (_pin != null && !_pin.isSecret())
        {
            bundle.putBoolean("com.pinterest.EXTRA_HIDE_SECRET_BOARDS", true);
        }
        navigateBoardSelectorFragment(bundle);
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinEditFragment this$0;

        public void onClick(View view)
        {
            askDeletePin();
        }

        _cls2()
        {
            this$0 = PinEditFragment.this;
            super();
        }
    }


    private class _cls4 extends ApiResponseHandler
    {

        final PinEditFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            if (getActivity() != null)
            {
                getActivity().setResult(10400);
                getActivity().finish();
            }
            Application.showToast(0x7f070400);
            Pinalytics.a(EventType.PIN_DELETE, _pin.getUid());
            if (_pin != null)
            {
                apiresponse = ModelHelper.getBoard(_pin.getBoardUid());
                if (apiresponse != null && apiresponse.getPinCountDisplay() > 0)
                {
                    apiresponse.setPinCount(Integer.valueOf(apiresponse.getPinCountDisplay() - 1));
                    ModelHelper.setBoard(apiresponse);
                }
            }
        }

        _cls4(int i)
        {
            this$0 = PinEditFragment.this;
            super(i);
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PinEditFragment this$0;
        final BaseDialog val$dialog;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PIN_DELETE_BUTTON, ComponentType.MODAL_DIALOG, _pin.getUid());
            dialog.dismiss();
            deletePin();
        }

        _cls3()
        {
            this$0 = PinEditFragment.this;
            dialog = basedialog;
            super();
        }
    }


    private class _cls1 extends ApiResponseHandler
    {

        final PinEditFragment this$0;

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            Pin.make(pinterestjsonobject);
            Pinalytics.a(EventType.PIN_EDIT, _pin.getUid());
            Application.showToast(0x7f070219);
            Events.postSticky(new com.pinterest.api.model.Board.UpdateEvent(_pin.getBoard(), false, true));
            pinterestjsonobject = getActivity();
            if (pinterestjsonobject != null)
            {
                pinterestjsonobject.onBackPressed();
            }
        }

        _cls1(boolean flag)
        {
            this$0 = PinEditFragment.this;
            super(flag);
        }
    }

}

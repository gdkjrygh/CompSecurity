// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.sendshare:
//            ContactsSearchFragment

public final class SendShareSearchFragment extends BaseFragment
{

    TextView _descriptionTv;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    EditText _messageTv;
    WebImageView _previewIv;
    private SendableObject _sendableObject;
    ViewGroup _sendableObjectContainer;
    PTextView _titleTv;

    public SendShareSearchFragment()
    {
        _eventsSubscriber = new _cls3();
    }

    private void init()
    {
        _sendableObject.getType();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 55
    //                   1 100;
           goto _L1 _L2 _L3
_L1:
        final ContactsSearchFragment fragment = (ContactsSearchFragment)getChildFragmentManager().findFragmentById(0x7f0f02ba);
        fragment.setListViewOnItemClickListener(new _cls1());
        return;
_L2:
        _titleTv.setText(0x7f07050d);
        Pin pin = ModelHelper.getPin(_sendableObject.getUid());
        _previewIv.loadUrl(pin.getImageMediumUrl());
        _descriptionTv.setText(pin.getDescription());
        continue; /* Loop/switch isn't completed */
_L3:
        _titleTv.setText(0x7f070509);
        Board board = ModelHelper.getBoard(_sendableObject.getUid());
        _previewIv.loadUrl(board.getImageCoverUrl());
        _descriptionTv.setText(board.getDescription());
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void updateContactsSuggestionsCache()
    {
        (new _cls2()).schedule(2000L);
    }

    protected final void onActivate()
    {
        if (getActivity() != null)
        {
            getActivity().getWindow().setSoftInputMode(16);
        }
        super.onActivate();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030101;
    }

    protected final void onDeactivate()
    {
        if (getActivity() != null)
        {
            getActivity().getWindow().setSoftInputMode(32);
        }
        super.onDeactivate();
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.a(this);
        Events.unregister(_eventsSubscriber);
    }

    public final void onPause()
    {
        super.onPause();
        Device.hideSoftKeyboard(_messageTv);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        Events.register(_eventsSubscriber, com/pinterest/activity/sendshare/ContactsSearchFragment$SearchEditTextFocusEvent, new Class[0]);
        if (_sendableObject != null)
        {
            init();
        }
    }

    public final void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation != null && navigation.getExtra("sendableObject") != null)
        {
            _sendableObject = (SendableObject)navigation.getExtra("sendableObject");
            return;
        } else
        {
            PLog.error("No object to send and share", new Object[0]);
            return;
        }
    }





    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final SendShareSearchFragment this$0;

        public void onEventMainThread(ContactsSearchFragment.SearchEditTextFocusEvent searchedittextfocusevent)
        {
            ViewGroup viewgroup = _sendableObjectContainer;
            boolean flag;
            if (!searchedittextfocusevent.hasFocus)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ViewHelper.setVisibility(viewgroup, flag);
        }

        _cls3()
        {
            this$0 = SendShareSearchFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final SendShareSearchFragment this$0;
        final ContactsSearchFragment val$fragment;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            pressBackButton();
            Device.hideSoftKeyboard(_messageTv);
            adapterview = ((AdapterView) (fragment.getListViewAdapter().getItem(i)));
            if (adapterview instanceof TypeAheadItem)
            {
                adapterview = (TypeAheadItem)adapterview;
                SendShareUtils.getInstance().sendToTypeAheadItem(adapterview, _sendableObject, _messageTv.getText().toString());
                updateContactsSuggestionsCache();
                if (!TextUtils.isEmpty(_messageTv.getText()))
                {
                    Pinalytics.a(ElementType.SEARCH_CONTACT_INPUT, ComponentType.SEND_SHARE_SEARCH_CONTACT);
                }
                Pinalytics.a(ElementType.SEARCH_CONTACT_LIST_ITEM, ComponentType.SEND_SHARE_SEARCH_CONTACT, String.valueOf(i));
            }
        }

        _cls1()
        {
            this$0 = SendShareSearchFragment.this;
            fragment = contactssearchfragment;
            super();
        }
    }


}

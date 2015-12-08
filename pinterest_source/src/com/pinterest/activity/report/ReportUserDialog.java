// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.os.Bundle;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.dialog.EditFieldDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.pinterest.activity.report:
//            ReportReasonAdapter

public class ReportUserDialog extends BaseDialog
{

    private static final String REPORTED_USER_UID = "_reportedUserUid";
    private ReportReasonAdapter _adapter;
    private final List _reportReasons;
    private final List _serverPinreasons;
    public User _user;
    private android.widget.AdapterView.OnItemClickListener onReasonClicked;

    public ReportUserDialog()
    {
        _serverPinreasons = new _cls1();
        _reportReasons = Arrays.asList(Resources.stringArray(0x7f080036));
        onReasonClicked = new _cls2();
    }

    public ReportUserDialog(User user)
    {
        Object obj;
        boolean flag1 = true;
        super();
        _serverPinreasons = new _cls1();
        _reportReasons = Arrays.asList(Resources.stringArray(0x7f080036));
        onReasonClicked = new _cls2();
        obj = getArguments();
        boolean flag;
        if (user == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj == null)
        {
            flag1 = false;
        }
        if (!(flag1 & flag)) goto _L2; else goto _L1
_L1:
        obj = ModelHelper.getUser(((Bundle) (obj)).getString("_reportedUserUid"));
_L4:
        _user = ((User) (obj));
        setTitle(Resources.string(0x7f0704a8));
        _adapter = new ReportReasonAdapter();
        _adapter.setDataSource(_reportReasons);
        _adapter.setServerReasons(_serverPinreasons);
        setListViewOptions(_adapter, onReasonClicked);
        return;
_L2:
        obj = user;
        if (user != null)
        {
            (new Bundle()).putString("_reportedUserUid", user.getUid());
            obj = user;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void showReportOtherReasonDialog()
    {
        final EditFieldDialog dialog = new EditFieldDialog();
        dialog.setLayout(0x7f030085);
        dialog.setTitle(0x7f0704a9);
        if (_user.getFirstName() != null)
        {
            dialog.setHint(Resources.string(0x7f0704ac, new Object[] {
                _user.getFirstName()
            }));
        }
        dialog.setOnClickListener(new _cls3());
        Events.post(new DialogEvent(dialog));
    }

    private void submitUserReport(String s)
    {
        Pinalytics.a(ElementType.USER_REPORT_BUTTON, ComponentType.MODAL_DIALOG, _user.getUid());
        UserApi.a(_user.getUid(), _adapter.checkedText(), s, new _cls4());
    }




    private class _cls1 extends ArrayList
    {

        final ReportUserDialog this$0;

        _cls1()
        {
            this$0 = ReportUserDialog.this;
            super();
            add("nudity");
            add("attacks");
            add("graphic-violence");
            add("hate-speech");
            add("self-harm");
            add("copyright");
            add("spam");
            add("other");
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final ReportUserDialog this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_adapter == null) goto _L2; else goto _L1
_L1:
            _adapter.setCheckedIndex(i);
            i;
            JVM INSTR tableswitch 5 7: default 48
        //                       5 79
        //                       6 48
        //                       7 100;
               goto _L3 _L4 _L3 _L5
_L3:
            adapterview = (String)_adapter.getItem(i);
            submitUserReport(adapterview);
_L2:
            dismiss();
            return;
_L4:
            Events.post(new Navigation(Location.BROWSER, Resources.string(0x7f070742)));
            continue; /* Loop/switch isn't completed */
_L5:
            showReportOtherReasonDialog();
            if (true) goto _L2; else goto _L6
_L6:
        }

        _cls2()
        {
            this$0 = ReportUserDialog.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.activity.task.dialog.EditFieldDialog.OnClickListener
    {

        final ReportUserDialog this$0;
        final EditFieldDialog val$dialog;

        public void onNegativeClicked()
        {
            dialog.dismiss();
        }

        public void onPositiveClicked(String s, boolean flag)
        {
            if (flag)
            {
                s = s.trim();
                if (s.length() == 0)
                {
                    dialog.setText("");
                    return;
                }
                submitUserReport(s);
            }
            dialog.dismiss();
        }

        _cls3()
        {
            this$0 = ReportUserDialog.this;
            dialog = editfielddialog;
            super();
        }
    }


    private class _cls4 extends ApiResponseHandler
    {

        final ReportUserDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (apiresponse != null)
            {
                Application.showToast(apiresponse.getMessageDisplay());
            } else
            if (_user.getFullName() != null)
            {
                Application.showToast(Resources.string(0x7f0704b5, new Object[] {
                    _user.getFullName()
                }));
                return;
            }
        }

        public void onFinish()
        {
            super.onFinish();
            Events.post(new DialogHideEvent(true));
        }

        public void onStart()
        {
            if (_user.getFullName() != null)
            {
                Events.post(new DialogEvent(new LoadingDialog(String.format(Resources.string(0x7f0704b6), new Object[] {
                    _user.getFullName()
                }))));
            }
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.USER_REPORT, _user.getUid());
            if (_user.getFullName() != null)
            {
                Application.showToast(Resources.string(0x7f0704b7, new Object[] {
                    _user.getFullName()
                }));
            }
        }

        _cls4()
        {
            this$0 = ReportUserDialog.this;
            super();
        }
    }

}

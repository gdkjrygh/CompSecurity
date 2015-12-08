// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.os.Bundle;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.dialog.EditFieldDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.ViewParameterType;
import com.pinterest.schemas.event.ViewType;
import com.pinterest.ui.feedback.PinFeedbackBase;
import com.pinterest.ui.feedback.PinFeedbackState;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.pinterest.activity.report:
//            ReportReasonAdapter

public class ReportPinDialog extends BaseDialog
{

    private static final String PIN_ID = "_pinId";
    private ReportReasonAdapter _adapter;
    private boolean _fromGrid;
    public String _pinId;
    private final List _reportReasons;
    private final List _serverPinReasons;
    private android.widget.AdapterView.OnItemClickListener onReasonClicked;

    public ReportPinDialog()
    {
        _serverPinReasons = new _cls1();
        _reportReasons = Arrays.asList(Resources.stringArray(0x7f080036));
        onReasonClicked = new _cls2();
    }

    public ReportPinDialog(String s)
    {
        Object obj;
        _serverPinReasons = new _cls1();
        _reportReasons = Arrays.asList(Resources.stringArray(0x7f080036));
        onReasonClicked = new _cls2();
        obj = getArguments();
        if (s != null || obj == null) goto _L2; else goto _L1
_L1:
        obj = ((Bundle) (obj)).getString(s);
_L4:
        _pinId = ((String) (obj));
        setTitle(Resources.string(0x7f0704ad));
        _adapter = new ReportReasonAdapter();
        _adapter.setDataSource(_reportReasons);
        _adapter.setServerReasons(_serverPinReasons);
        setListViewOptions(_adapter, onReasonClicked);
        return;
_L2:
        obj = s;
        if (s != null)
        {
            (new Bundle()).putString("_pinId", s);
            obj = s;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void showReportOtherReasonDialog()
    {
        final EditFieldDialog dialog = new EditFieldDialog();
        dialog.setLayout(0x7f030085);
        dialog.setTitle(0x7f0704a9);
        dialog.setHint(0x7f0704ab);
        dialog.setOnClickListener(new _cls3());
        Events.post(new DialogEvent(dialog));
    }

    private void submitPinReport(String s)
    {
        if (_fromGrid)
        {
            updateGridCell();
        }
        Pinalytics.a(ElementType.PIN_REPORT_BUTTON, ComponentType.MODAL_DIALOG, _pinId);
        if (!(getActivity() instanceof MainActivity)) goto _L2; else goto _L1
_L1:
        Object obj = ((MainActivity)getActivity()).getNavigationSource(_pinId);
        if (obj == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        ViewType viewtype = ((Navigation) (obj)).getFragmentViewType();
        if (viewtype != null)
        {
            i = viewtype.getValue();
        } else
        {
            i = -1;
        }
        obj = ((Navigation) (obj)).getFragmentViewParameterType();
        if (obj != null)
        {
            j = ((ViewParameterType) (obj)).getValue();
        } else
        {
            j = -1;
        }
_L5:
        PinApi.a(_pinId, _adapter.checkedText(), s, i, j, new _cls4());
        return;
_L2:
        j = -1;
        i = -1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void updateGridCell()
    {
        Pin pin = ModelHelper.getPin(_pinId);
        if (pin == null)
        {
            return;
        } else
        {
            pin.setHiddenState(Integer.valueOf(3));
            pin.setFeedbackState(new PinFeedbackState(0x7f02003d, 0x7f020254, PinFeedbackBase.STR_REPORTED, null));
            Events.postSticky(new com.pinterest.api.model.Pin.EditEvent(pin));
            PinApi.a(pin.getUid(), null);
            return;
        }
    }

    public void setFromGrid(boolean flag)
    {
        _fromGrid = flag;
    }






    private class _cls1 extends ArrayList
    {

        final ReportPinDialog this$0;

        _cls1()
        {
            this$0 = ReportPinDialog.this;
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

        final ReportPinDialog this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_adapter == null) goto _L2; else goto _L1
_L1:
            _adapter.setCheckedIndex(i);
            i;
            JVM INSTR tableswitch 5 7: default 48
        //                       5 96
        //                       6 48
        //                       7 117;
               goto _L3 _L4 _L3 _L5
_L3:
            adapterview = (String)_adapter.getItem(i);
            submitPinReport(adapterview);
            if (_fromGrid)
            {
                updateGridCell();
            }
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
            this$0 = ReportPinDialog.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.activity.task.dialog.EditFieldDialog.OnClickListener
    {

        final ReportPinDialog this$0;
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
                submitPinReport(s);
            }
            dialog.dismiss();
        }

        _cls3()
        {
            this$0 = ReportPinDialog.this;
            dialog = editfielddialog;
            super();
        }
    }


    private class _cls4 extends ApiResponseHandler
    {

        final ReportPinDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (_fromGrid)
            {
                return;
            }
            if (apiresponse != null)
            {
                Application.showToast(apiresponse.getMessageDisplay());
                return;
            } else
            {
                Application.showToast(0x7f0704ae);
                return;
            }
        }

        public void onStart()
        {
            if (_fromGrid)
            {
                return;
            } else
            {
                Application.showToast(0x7f0704af);
                return;
            }
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.PIN_FLAG, _pinId);
            if (_fromGrid)
            {
                return;
            } else
            {
                Application.showToast(0x7f0704b0);
                return;
            }
        }

        _cls4()
        {
            this$0 = ReportPinDialog.this;
            super();
        }
    }

}

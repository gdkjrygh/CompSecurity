// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.os.Bundle;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.kit.application.Resources;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.pinterest.activity.report:
//            ReportReasonAdapter

public class ReportConversationDialog extends BaseDialog
{

    private static final String CONVERSATION_ID = "_conversationId";
    private ReportReasonAdapter _adapter;
    private String _conversationId;
    private final List _reportReasons;
    private final List _serverConversationReasons;
    private android.widget.AdapterView.OnItemClickListener onReasonClicked;

    public ReportConversationDialog()
    {
        _serverConversationReasons = new _cls1();
        _reportReasons = Arrays.asList(Resources.stringArray(0x7f080029));
        onReasonClicked = new _cls2();
    }

    public ReportConversationDialog(String s)
    {
        Object obj;
        _serverConversationReasons = new _cls1();
        _reportReasons = Arrays.asList(Resources.stringArray(0x7f080029));
        onReasonClicked = new _cls2();
        obj = getArguments();
        if (s != null || obj == null) goto _L2; else goto _L1
_L1:
        obj = ((Bundle) (obj)).getString(s);
_L4:
        _conversationId = ((String) (obj));
        setTitle(0x7f0704a8);
        _adapter = new ReportReasonAdapter();
        _adapter.setDataSource(_reportReasons);
        _adapter.setServerReasons(_serverConversationReasons);
        setListViewOptions(_adapter, onReasonClicked);
        return;
_L2:
        obj = s;
        if (s != null)
        {
            (new Bundle()).putString("_conversationId", s);
            obj = s;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void submitConversationReport(String s)
    {
        ConversationApi.a(_conversationId, _adapter.checkedText(), new _cls3());
    }




    private class _cls1 extends ArrayList
    {

        final ReportConversationDialog this$0;

        _cls1()
        {
            this$0 = ReportConversationDialog.this;
            super();
            add("spam");
            add("harassment-me");
            add("harassment-other");
            add("other");
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final ReportConversationDialog this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_adapter != null)
            {
                _adapter.setCheckedIndex(i);
                adapterview = (String)_adapter.getItem(i);
                submitConversationReport(adapterview);
            }
            dismiss();
        }

        _cls2()
        {
            this$0 = ReportConversationDialog.this;
            super();
        }
    }


    private class _cls3 extends ApiResponseHandler
    {

        final ReportConversationDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Application.showToast(Resources.string(0x7f0704a4));
        }

        public void onFinish()
        {
            super.onFinish();
            Events.post(new DialogHideEvent(true));
        }

        public void onStart()
        {
            Events.post(new DialogEvent(new LoadingDialog(Resources.string(0x7f0704a6))));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Application.showToast(Resources.string(0x7f0704a7));
            (new HideConversationTask(_conversationId)).execute();
        }

        _cls3()
        {
            this$0 = ReportConversationDialog.this;
            super();
        }
    }

}

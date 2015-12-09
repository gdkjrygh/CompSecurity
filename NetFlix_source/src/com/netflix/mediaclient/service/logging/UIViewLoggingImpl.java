// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.Event;
import com.netflix.mediaclient.service.logging.uiview.CommandSession;
import com.netflix.mediaclient.servicemgr.UIViewLogging;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            EventHandler

public class UIViewLoggingImpl
    implements UIViewLogging
{

    public static final String ACTIONS[] = {
        "com.netflix.mediaclient.intent.action.LOG_UIVIEW_CMD_START", "com.netflix.mediaclient.intent.action.LOG_UIVIEW_CMD_ENDED"
    };
    public static final String COMMAND_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIVIEW_CMD_ENDED";
    public static final String COMMAND_START = "com.netflix.mediaclient.intent.action.LOG_UIVIEW_CMD_START";
    public static final String EXTRA_CMD = "cmd";
    public static final String EXTRA_DATA_CONTEXT = "dataContext";
    public static final String EXTRA_VIEW = "view";
    private static final String TAG = "nf_log";
    private CommandSession mCommandSession;
    private DataContext mDataContext;
    private EventHandler mEventHandler;

    public UIViewLoggingImpl(EventHandler eventhandler)
    {
        mEventHandler = eventhandler;
    }

    private void handleUIViewCommandEnded(Intent intent)
    {
        endCommandSession();
    }

    private void handleUIViewCommandStart(Intent intent)
    {
        Object obj = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname = null;
        if (!StringUtils.isEmpty(((String) (obj))))
        {
            uiviewcommandname = com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.valueOf(((String) (obj)));
        }
        String s = intent.getStringExtra("view");
        obj = null;
        if (StringUtils.isNotEmpty(s))
        {
            obj = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        s = null;
        String s1 = intent.getStringExtra("dataContext");
        intent = s;
        if (StringUtils.isNotEmpty(s1))
        {
            try
            {
                intent = DataContext.createInstance(new JSONObject(s1));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.w("nf_log", (new StringBuilder()).append("failed to create dataContext: ").append(s1).toString());
                intent = s;
            }
        }
        startCommandSession(uiviewcommandname, ((com.netflix.mediaclient.servicemgr.IClientLogging.ModalView) (obj)), intent);
    }

    private void populateEvent(Event event, DataContext datacontext, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (event == null)
        {
            return;
        } else
        {
            event.setDataContext(datacontext);
            event.setModalView(modalview);
            return;
        }
    }

    public void endCommandSession()
    {
        Log.d("nf_log", "uiView command session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UIViewLoggingImpl this$0;
            final DataContext val$dataContext;

            public void run()
            {
                Log.d("nf_log", "uiView command session ended");
                if (mCommandSession == null)
                {
                    Log.w("nf_log", "uiView command session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiview.model.CommandEndedEvent commandendedevent = mCommandSession.createEndedEvent();
                if (commandendedevent == null)
                {
                    Log.d("nf_log", "uiView command session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(commandendedevent, dataContext, mCommandSession.getView());
                    mEventHandler.removeSession(mCommandSession);
                    Log.d("nf_log", "uiView command session end event posting...");
                    mEventHandler.post(commandendedevent);
                    mCommandSession = null;
                    Log.d("nf_log", "uiView command session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UIViewLoggingImpl.this;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "uiView command session end done.");
    }

    public boolean handleIntent(Intent intent, boolean flag)
    {
        String s = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.LOG_UIVIEW_CMD_START".equals(s))
        {
            Log.d("nf_log", "COMMAND_START");
            handleUIViewCommandStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIVIEW_CMD_ENDED".equals(s))
        {
            Log.d("nf_log", "COMMAND_ENDED");
            handleUIViewCommandEnded(intent);
            return true;
        }
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("We do not support action ").append(s).toString());
        }
        return false;
    }

    public void startCommandSession(com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, DataContext datacontext)
    {
        if (mCommandSession != null)
        {
            Log.e("nf_log", "uiView command session already started!");
            return;
        } else
        {
            Log.d("nf_log", "uiView command session starting...");
            uiviewcommandname = new CommandSession(uiviewcommandname, modalview);
            mEventHandler.addSession(uiviewcommandname);
            mCommandSession = uiviewcommandname;
            mDataContext = datacontext;
            Log.d("nf_log", "uiView command session start done.");
            return;
        }
    }




/*
    static CommandSession access$002(UIViewLoggingImpl uiviewloggingimpl, CommandSession commandsession)
    {
        uiviewloggingimpl.mCommandSession = commandsession;
        return commandsession;
    }

*/


}

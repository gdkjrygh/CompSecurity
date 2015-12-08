// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.chat;

import By;
import Ks;
import Mf;
import NG;
import Pg;
import Rw;
import Rx;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.analytics.framework.ErrorMetric;
import com.snapchat.android.model.chat.ChatConversation;
import com.squareup.otto.Bus;
import oD;
import oO;
import pi;
import pn;
import sw;

public final class LoadConversationPageTask extends oD
    implements oS.a
{
    public static final class TaskStatus extends Enum
    {

        private static final TaskStatus $VALUES[];
        public static final TaskStatus COMPLETION;
        public static final TaskStatus FAILED;
        public static final TaskStatus RUNNING;

        public static TaskStatus valueOf(String s)
        {
            return (TaskStatus)Enum.valueOf(com/snapchat/android/api2/chat/LoadConversationPageTask$TaskStatus, s);
        }

        public static TaskStatus[] values()
        {
            return (TaskStatus[])$VALUES.clone();
        }

        static 
        {
            RUNNING = new TaskStatus("RUNNING", 0);
            FAILED = new TaskStatus("FAILED", 1);
            COMPLETION = new TaskStatus("COMPLETION", 2);
            $VALUES = (new TaskStatus[] {
                RUNNING, FAILED, COMPLETION
            });
        }

        private TaskStatus(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a(boolean flag);
    }

    public static interface b
    {

        public abstract void a(String s, TaskStatus taskstatus, boolean flag);
    }


    private static final String PATH = "/loq/conversation";
    private static final String TAG = "LoadConversationPageTask";
    private final Bus mBus;
    private final a mCallback;
    private final sw mChatMessageReleaser;
    private final String mConversationId;
    private final By mConversationManager;
    private final String mIterToken;
    private final b mLoadConversationStatusUpdateCallback;
    private final EasyMetric mRequestLatencyMetric;
    private final boolean mWithPrefetch;

    public LoadConversationPageTask(String s, String s1, a a1, b b1)
    {
        this(s, s1, a1, b1, By.c(), Mf.a(), sw.a());
    }

    private LoadConversationPageTask(String s, String s1, a a1, b b1, By by, Bus bus, sw sw1)
    {
        mRequestLatencyMetric = new EasyMetric("LOQ_CONVERSATION_LATENCY", 0.050000000000000003D);
        mConversationId = s;
        mIterToken = s1;
        mWithPrefetch = true;
        mCallback = a1;
        mLoadConversationStatusUpdateCallback = b1;
        mConversationManager = by;
        mChatMessageReleaser = sw1;
        mBus = bus;
        registerCallback(Rx, this);
    }

    public final void execute()
    {
        mRequestLatencyMetric.b();
        super.execute();
    }

    public final String getPath()
    {
        return "/loq/conversation";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new Rw()).a(mConversationId).b(mIterToken)));
    }

    public final void onJsonResult(Object obj, pi pi1)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        obj = (Rx)obj;
        flag1 = pi1.c();
        mRequestLatencyMetric.a("reachability", Pg.b()).a("success", Boolean.valueOf(flag1)).b(false);
        if (!flag1) goto _L2; else goto _L1
_L1:
        pi1 = mLoadConversationStatusUpdateCallback;
        String s = mConversationId;
        TaskStatus taskstatus1 = TaskStatus.COMPLETION;
        if (mIterToken != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pi1.a(s, taskstatus1, flag);
        if (obj != null) goto _L4; else goto _L3
_L3:
        (new ErrorMetric("NULL_LOAD_CONVERSATION_RESPONSE")).e();
_L8:
        if (mCallback != null)
        {
            mCallback.a(true);
        }
_L6:
        return;
_L4:
        if (((Rx) (obj)).b())
        {
            Timber.f("LoadConversationPageTask", "[Conversation] Loaded conversation %s from the server successfully.", new Object[] {
                mConversationId
            });
            pi1 = Ks.b(mConversationId);
            if (!TextUtils.isEmpty(pi1))
            {
                pi1 = mConversationManager.a(pi1);
                if (pi1 != null)
                {
                    By by = mConversationManager;
                    obj = ((Rx) (obj)).a();
                    boolean flag2 = mWithPrefetch;
                    if (mIterToken == null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    by.a(pi1, ((Qi) (obj)), flag2, flag, mRequestStartTimeMillis);
                    mBus.a(new NG());
                    if (!((ChatConversation) (pi1)).mIsUserInConversation)
                    {
                        Timber.f("LoadConversationPageTask", "[Conversation] Sending release message for conversation %s.", new Object[] {
                            ((ChatConversation) (pi1)).mId
                        });
                        mChatMessageReleaser.a(pi1, Sk.a.DELETE);
                    }
                    mConversationManager.h();
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        Timber.f("LoadConversationPageTask", "[Conversation] Failed to load conversation %s from the server.", new Object[] {
            mConversationId
        });
        obj = mLoadConversationStatusUpdateCallback;
        pi1 = mConversationId;
        TaskStatus taskstatus = TaskStatus.FAILED;
        if (mIterToken == null)
        {
            flag = false;
        }
        ((b) (obj)).a(pi1, taskstatus, flag);
        if (mCallback == null) goto _L6; else goto _L5
_L5:
        mCallback.a(false);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;


public final class  extends Enum
{

    private static final QPL_CANCEL $VALUES[];
    public static final QPL_CANCEL ADAPTER_NOTIFY;
    public static final QPL_CANCEL ASYNC_CALL;
    public static final QPL_CANCEL ASYNC_TASK_BACKGROUND;
    public static final QPL_CANCEL ASYNC_TASK_END;
    public static final QPL_CANCEL ASYNC_TASK_POST;
    public static final QPL_CANCEL ASYNC_TASK_PRE;
    public static final QPL_CANCEL CALL_END;
    public static final QPL_CANCEL CALL_START;
    public static final QPL_CANCEL COUNTER;
    public static final QPL_CANCEL LIFECYCLE_ACTIVITY_END;
    public static final QPL_CANCEL LIFECYCLE_ACTIVITY_START;
    public static final QPL_CANCEL LIFECYCLE_APPLICATION_END;
    public static final QPL_CANCEL LIFECYCLE_APPLICATION_START;
    public static final QPL_CANCEL LIFECYCLE_BROADCAST_RECEIVER_END;
    public static final QPL_CANCEL LIFECYCLE_BROADCAST_RECEIVER_START;
    public static final QPL_CANCEL LIFECYCLE_CONTENT_PROVIDER_END;
    public static final QPL_CANCEL LIFECYCLE_CONTENT_PROVIDER_START;
    public static final QPL_CANCEL LIFECYCLE_FRAGMENT_END;
    public static final QPL_CANCEL LIFECYCLE_FRAGMENT_START;
    public static final QPL_CANCEL LIFECYCLE_SERVICE_END;
    public static final QPL_CANCEL LIFECYCLE_SERVICE_START;
    public static final QPL_CANCEL LIFECYCLE_VIEW_END;
    public static final QPL_CANCEL LIFECYCLE_VIEW_START;
    public static final QPL_CANCEL MARK_CANCEL;
    public static final QPL_CANCEL MARK_FAIL;
    public static final QPL_CANCEL MARK_FLAG;
    public static final QPL_CANCEL MARK_POP;
    public static final QPL_CANCEL MARK_PUSH;
    public static final QPL_CANCEL MARK_START;
    public static final QPL_CANCEL MARK_STOP;
    public static final QPL_CANCEL NETWORK_OP_END;
    public static final QPL_CANCEL NETWORK_OP_START;
    public static final QPL_CANCEL QPL_CANCEL;
    public static final QPL_CANCEL QPL_END;
    public static final QPL_CANCEL QPL_START;
    public static final QPL_CANCEL SERV_CONN;
    public static final QPL_CANCEL SERV_DISCONN;
    public static final QPL_CANCEL SERV_END;
    public static final QPL_CANCEL TEST_CLOCK_SYNC_END;
    public static final QPL_CANCEL TEST_CLOCK_SYNC_START;
    public static final QPL_CANCEL TRACE_ABORT;
    public static final QPL_CANCEL TRACE_BACKWARDS;
    public static final QPL_CANCEL TRACE_END;
    public static final QPL_CANCEL TRACE_START;
    public static final QPL_CANCEL UI_INPUT_END;
    public static final QPL_CANCEL UI_INPUT_START;
    public static final QPL_CANCEL UI_POST_INVAL;
    public static final QPL_CANCEL UI_UPDATE_END;
    public static final QPL_CANCEL UI_UPDATE_START;
    public static final QPL_CANCEL UNKNOWN_TYPE;
    public static final QPL_CANCEL VALUES[] = values();

    public static boolean isAsyncCall( )
    {
        return  == ASYNC_CALL ||  == ASYNC_TASK_END;
    }

    public static boolean isBlockEnd(ASYNC_TASK_END async_task_end)
    {
        return async_task_end == CALL_END || async_task_end == NETWORK_OP_END || async_task_end == SERV_END || async_task_end == ASYNC_TASK_END || async_task_end == UI_INPUT_END || async_task_end == UI_UPDATE_END || async_task_end == LIFECYCLE_ACTIVITY_END || async_task_end == LIFECYCLE_APPLICATION_END || async_task_end == LIFECYCLE_FRAGMENT_END || async_task_end == LIFECYCLE_SERVICE_END || async_task_end == LIFECYCLE_BROADCAST_RECEIVER_END || async_task_end == LIFECYCLE_CONTENT_PROVIDER_END || async_task_end == LIFECYCLE_VIEW_END;
    }

    public static boolean isBlockStart(LIFECYCLE_VIEW_END lifecycle_view_end)
    {
        return lifecycle_view_end == CALL_START || lifecycle_view_end == NETWORK_OP_START || lifecycle_view_end == SERV_CONN || lifecycle_view_end == SERV_DISCONN || lifecycle_view_end == ASYNC_TASK_PRE || lifecycle_view_end == ASYNC_TASK_BACKGROUND || lifecycle_view_end == ASYNC_TASK_POST || lifecycle_view_end == UI_INPUT_START || lifecycle_view_end == UI_UPDATE_START || lifecycle_view_end == LIFECYCLE_ACTIVITY_START || lifecycle_view_end == LIFECYCLE_APPLICATION_START || lifecycle_view_end == LIFECYCLE_FRAGMENT_START || lifecycle_view_end == LIFECYCLE_SERVICE_START || lifecycle_view_end == LIFECYCLE_BROADCAST_RECEIVER_START || lifecycle_view_end == LIFECYCLE_CONTENT_PROVIDER_START || lifecycle_view_end == LIFECYCLE_VIEW_START;
    }

    public static boolean isControlEntry(LIFECYCLE_VIEW_START lifecycle_view_start)
    {
        return lifecycle_view_start == TRACE_END || lifecycle_view_start == TRACE_START || lifecycle_view_start == TRACE_ABORT || lifecycle_view_start == TRACE_BACKWARDS;
    }

    public static boolean isFrameworkCallEnd(TRACE_BACKWARDS trace_backwards)
    {
        return trace_backwards == LIFECYCLE_ACTIVITY_END || trace_backwards == LIFECYCLE_APPLICATION_END || trace_backwards == LIFECYCLE_FRAGMENT_END || trace_backwards == LIFECYCLE_SERVICE_END || trace_backwards == LIFECYCLE_BROADCAST_RECEIVER_END || trace_backwards == LIFECYCLE_CONTENT_PROVIDER_END || trace_backwards == LIFECYCLE_VIEW_END || trace_backwards == UI_INPUT_END;
    }

    public static boolean isFrameworkCallStart(UI_INPUT_END ui_input_end)
    {
        return ui_input_end == LIFECYCLE_ACTIVITY_START || ui_input_end == LIFECYCLE_APPLICATION_START || ui_input_end == LIFECYCLE_FRAGMENT_START || ui_input_end == LIFECYCLE_SERVICE_START || ui_input_end == LIFECYCLE_BROADCAST_RECEIVER_START || ui_input_end == LIFECYCLE_CONTENT_PROVIDER_START || ui_input_end == LIFECYCLE_VIEW_START || ui_input_end == UI_INPUT_START;
    }

    public static UI_INPUT_START valueOf(String s)
    {
        return (UI_INPUT_START)Enum.valueOf(com/facebook/loom/logger/LogEntry$EntryType, s);
    }

    public static UI_INPUT_START[] values()
    {
        return (UI_INPUT_START[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN_TYPE = new <init>("UNKNOWN_TYPE", 0);
        UI_INPUT_START = new <init>("UI_INPUT_START", 1);
        UI_INPUT_END = new <init>("UI_INPUT_END", 2);
        UI_UPDATE_START = new <init>("UI_UPDATE_START", 3);
        UI_UPDATE_END = new <init>("UI_UPDATE_END", 4);
        CALL_START = new <init>("CALL_START", 5);
        CALL_END = new <init>("CALL_END", 6);
        ASYNC_CALL = new <init>("ASYNC_CALL", 7);
        UI_POST_INVAL = new <init>("UI_POST_INVAL", 8);
        SERV_CONN = new <init>("SERV_CONN", 9);
        SERV_DISCONN = new <init>("SERV_DISCONN", 10);
        SERV_END = new <init>("SERV_END", 11);
        ADAPTER_NOTIFY = new <init>("ADAPTER_NOTIFY", 12);
        ASYNC_TASK_PRE = new <init>("ASYNC_TASK_PRE", 13);
        ASYNC_TASK_BACKGROUND = new <init>("ASYNC_TASK_BACKGROUND", 14);
        ASYNC_TASK_POST = new <init>("ASYNC_TASK_POST", 15);
        ASYNC_TASK_END = new <init>("ASYNC_TASK_END", 16);
        NETWORK_OP_START = new <init>("NETWORK_OP_START", 17);
        NETWORK_OP_END = new <init>("NETWORK_OP_END", 18);
        MARK_FLAG = new <init>("MARK_FLAG", 19);
        MARK_START = new <init>("MARK_START", 20);
        MARK_STOP = new <init>("MARK_STOP", 21);
        MARK_FAIL = new <init>("MARK_FAIL", 22);
        MARK_CANCEL = new <init>("MARK_CANCEL", 23);
        MARK_PUSH = new <init>("MARK_PUSH", 24);
        MARK_POP = new <init>("MARK_POP", 25);
        LIFECYCLE_APPLICATION_START = new <init>("LIFECYCLE_APPLICATION_START", 26);
        LIFECYCLE_APPLICATION_END = new <init>("LIFECYCLE_APPLICATION_END", 27);
        LIFECYCLE_ACTIVITY_START = new <init>("LIFECYCLE_ACTIVITY_START", 28);
        LIFECYCLE_ACTIVITY_END = new <init>("LIFECYCLE_ACTIVITY_END", 29);
        LIFECYCLE_SERVICE_START = new <init>("LIFECYCLE_SERVICE_START", 30);
        LIFECYCLE_SERVICE_END = new <init>("LIFECYCLE_SERVICE_END", 31);
        LIFECYCLE_BROADCAST_RECEIVER_START = new <init>("LIFECYCLE_BROADCAST_RECEIVER_START", 32);
        LIFECYCLE_BROADCAST_RECEIVER_END = new <init>("LIFECYCLE_BROADCAST_RECEIVER_END", 33);
        LIFECYCLE_CONTENT_PROVIDER_START = new <init>("LIFECYCLE_CONTENT_PROVIDER_START", 34);
        LIFECYCLE_CONTENT_PROVIDER_END = new <init>("LIFECYCLE_CONTENT_PROVIDER_END", 35);
        LIFECYCLE_FRAGMENT_START = new <init>("LIFECYCLE_FRAGMENT_START", 36);
        LIFECYCLE_FRAGMENT_END = new <init>("LIFECYCLE_FRAGMENT_END", 37);
        LIFECYCLE_VIEW_START = new <init>("LIFECYCLE_VIEW_START", 38);
        LIFECYCLE_VIEW_END = new <init>("LIFECYCLE_VIEW_END", 39);
        TRACE_ABORT = new <init>("TRACE_ABORT", 40);
        TRACE_END = new <init>("TRACE_END", 41);
        TRACE_START = new <init>("TRACE_START", 42);
        TRACE_BACKWARDS = new <init>("TRACE_BACKWARDS", 43);
        COUNTER = new <init>("COUNTER", 44);
        TEST_CLOCK_SYNC_START = new <init>("TEST_CLOCK_SYNC_START", 45);
        TEST_CLOCK_SYNC_END = new <init>("TEST_CLOCK_SYNC_END", 46);
        QPL_START = new <init>("QPL_START", 47);
        QPL_END = new <init>("QPL_END", 48);
        QPL_CANCEL = new <init>("QPL_CANCEL", 49);
        $VALUES = (new .VALUES[] {
            UNKNOWN_TYPE, UI_INPUT_START, UI_INPUT_END, UI_UPDATE_START, UI_UPDATE_END, CALL_START, CALL_END, ASYNC_CALL, UI_POST_INVAL, SERV_CONN, 
            SERV_DISCONN, SERV_END, ADAPTER_NOTIFY, ASYNC_TASK_PRE, ASYNC_TASK_BACKGROUND, ASYNC_TASK_POST, ASYNC_TASK_END, NETWORK_OP_START, NETWORK_OP_END, MARK_FLAG, 
            MARK_START, MARK_STOP, MARK_FAIL, MARK_CANCEL, MARK_PUSH, MARK_POP, LIFECYCLE_APPLICATION_START, LIFECYCLE_APPLICATION_END, LIFECYCLE_ACTIVITY_START, LIFECYCLE_ACTIVITY_END, 
            LIFECYCLE_SERVICE_START, LIFECYCLE_SERVICE_END, LIFECYCLE_BROADCAST_RECEIVER_START, LIFECYCLE_BROADCAST_RECEIVER_END, LIFECYCLE_CONTENT_PROVIDER_START, LIFECYCLE_CONTENT_PROVIDER_END, LIFECYCLE_FRAGMENT_START, LIFECYCLE_FRAGMENT_END, LIFECYCLE_VIEW_START, LIFECYCLE_VIEW_END, 
            TRACE_ABORT, TRACE_END, TRACE_START, TRACE_BACKWARDS, COUNTER, TEST_CLOCK_SYNC_START, TEST_CLOCK_SYNC_END, QPL_START, QPL_END, QPL_CANCEL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;


public class LogEntry
{

    private int mCallID;
    private int mEntryID;
    private int mEntryType;
    private long mLongExtra;
    private int mMatchID;
    private int mThreadID;
    private long mTime;

    public LogEntry()
    {
    }

    public LogEntry(int i, EntryType entrytype, long l, int j, int k, int i1)
    {
        a(i, entrytype, l, j, k, i1, 0L);
    }

    public final int a()
    {
        return mEntryID;
    }

    final LogEntry a(int i, EntryType entrytype, long l, int j, int k, int i1, 
            long l1)
    {
        mEntryID = i;
        if (entrytype == null)
        {
            i = 0;
        } else
        {
            i = entrytype.ordinal();
        }
        mEntryType = i;
        mTime = l;
        mThreadID = j;
        mCallID = k;
        mMatchID = i1;
        mLongExtra = l1;
        return this;
    }

    public final EntryType b()
    {
        return EntryType.VALUES[mEntryType];
    }

    public final long c()
    {
        return mTime;
    }

    public final int d()
    {
        return mThreadID;
    }

    public final int e()
    {
        return mCallID;
    }

    public final int f()
    {
        return mMatchID;
    }

    public final long g()
    {
        return mLongExtra;
    }

    private class EntryType extends Enum
    {

        private static final EntryType $VALUES[];
        public static final EntryType ADAPTER_NOTIFY;
        public static final EntryType ASYNC_CALL;
        public static final EntryType ASYNC_TASK_BACKGROUND;
        public static final EntryType ASYNC_TASK_END;
        public static final EntryType ASYNC_TASK_POST;
        public static final EntryType ASYNC_TASK_PRE;
        public static final EntryType CALL_END;
        public static final EntryType CALL_START;
        public static final EntryType COUNTER;
        public static final EntryType LIFECYCLE_ACTIVITY_END;
        public static final EntryType LIFECYCLE_ACTIVITY_START;
        public static final EntryType LIFECYCLE_APPLICATION_END;
        public static final EntryType LIFECYCLE_APPLICATION_START;
        public static final EntryType LIFECYCLE_BROADCAST_RECEIVER_END;
        public static final EntryType LIFECYCLE_BROADCAST_RECEIVER_START;
        public static final EntryType LIFECYCLE_CONTENT_PROVIDER_END;
        public static final EntryType LIFECYCLE_CONTENT_PROVIDER_START;
        public static final EntryType LIFECYCLE_FRAGMENT_END;
        public static final EntryType LIFECYCLE_FRAGMENT_START;
        public static final EntryType LIFECYCLE_SERVICE_END;
        public static final EntryType LIFECYCLE_SERVICE_START;
        public static final EntryType LIFECYCLE_VIEW_END;
        public static final EntryType LIFECYCLE_VIEW_START;
        public static final EntryType MARK_CANCEL;
        public static final EntryType MARK_FAIL;
        public static final EntryType MARK_FLAG;
        public static final EntryType MARK_POP;
        public static final EntryType MARK_PUSH;
        public static final EntryType MARK_START;
        public static final EntryType MARK_STOP;
        public static final EntryType NETWORK_OP_END;
        public static final EntryType NETWORK_OP_START;
        public static final EntryType QPL_CANCEL;
        public static final EntryType QPL_END;
        public static final EntryType QPL_START;
        public static final EntryType SERV_CONN;
        public static final EntryType SERV_DISCONN;
        public static final EntryType SERV_END;
        public static final EntryType TEST_CLOCK_SYNC_END;
        public static final EntryType TEST_CLOCK_SYNC_START;
        public static final EntryType TRACE_ABORT;
        public static final EntryType TRACE_BACKWARDS;
        public static final EntryType TRACE_END;
        public static final EntryType TRACE_START;
        public static final EntryType UI_INPUT_END;
        public static final EntryType UI_INPUT_START;
        public static final EntryType UI_POST_INVAL;
        public static final EntryType UI_UPDATE_END;
        public static final EntryType UI_UPDATE_START;
        public static final EntryType UNKNOWN_TYPE;
        public static final EntryType VALUES[] = values();

        public static boolean isAsyncCall(EntryType entrytype)
        {
            return entrytype == ASYNC_CALL || entrytype == ASYNC_TASK_END;
        }

        public static boolean isBlockEnd(EntryType entrytype)
        {
            return entrytype == CALL_END || entrytype == NETWORK_OP_END || entrytype == SERV_END || entrytype == ASYNC_TASK_END || entrytype == UI_INPUT_END || entrytype == UI_UPDATE_END || entrytype == LIFECYCLE_ACTIVITY_END || entrytype == LIFECYCLE_APPLICATION_END || entrytype == LIFECYCLE_FRAGMENT_END || entrytype == LIFECYCLE_SERVICE_END || entrytype == LIFECYCLE_BROADCAST_RECEIVER_END || entrytype == LIFECYCLE_CONTENT_PROVIDER_END || entrytype == LIFECYCLE_VIEW_END;
        }

        public static boolean isBlockStart(EntryType entrytype)
        {
            return entrytype == CALL_START || entrytype == NETWORK_OP_START || entrytype == SERV_CONN || entrytype == SERV_DISCONN || entrytype == ASYNC_TASK_PRE || entrytype == ASYNC_TASK_BACKGROUND || entrytype == ASYNC_TASK_POST || entrytype == UI_INPUT_START || entrytype == UI_UPDATE_START || entrytype == LIFECYCLE_ACTIVITY_START || entrytype == LIFECYCLE_APPLICATION_START || entrytype == LIFECYCLE_FRAGMENT_START || entrytype == LIFECYCLE_SERVICE_START || entrytype == LIFECYCLE_BROADCAST_RECEIVER_START || entrytype == LIFECYCLE_CONTENT_PROVIDER_START || entrytype == LIFECYCLE_VIEW_START;
        }

        public static boolean isControlEntry(EntryType entrytype)
        {
            return entrytype == TRACE_END || entrytype == TRACE_START || entrytype == TRACE_ABORT || entrytype == TRACE_BACKWARDS;
        }

        public static boolean isFrameworkCallEnd(EntryType entrytype)
        {
            return entrytype == LIFECYCLE_ACTIVITY_END || entrytype == LIFECYCLE_APPLICATION_END || entrytype == LIFECYCLE_FRAGMENT_END || entrytype == LIFECYCLE_SERVICE_END || entrytype == LIFECYCLE_BROADCAST_RECEIVER_END || entrytype == LIFECYCLE_CONTENT_PROVIDER_END || entrytype == LIFECYCLE_VIEW_END || entrytype == UI_INPUT_END;
        }

        public static boolean isFrameworkCallStart(EntryType entrytype)
        {
            return entrytype == LIFECYCLE_ACTIVITY_START || entrytype == LIFECYCLE_APPLICATION_START || entrytype == LIFECYCLE_FRAGMENT_START || entrytype == LIFECYCLE_SERVICE_START || entrytype == LIFECYCLE_BROADCAST_RECEIVER_START || entrytype == LIFECYCLE_CONTENT_PROVIDER_START || entrytype == LIFECYCLE_VIEW_START || entrytype == UI_INPUT_START;
        }

        public static EntryType valueOf(String s)
        {
            return (EntryType)Enum.valueOf(com/facebook/loom/logger/LogEntry$EntryType, s);
        }

        public static EntryType[] values()
        {
            return (EntryType[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN_TYPE = new EntryType("UNKNOWN_TYPE", 0);
            UI_INPUT_START = new EntryType("UI_INPUT_START", 1);
            UI_INPUT_END = new EntryType("UI_INPUT_END", 2);
            UI_UPDATE_START = new EntryType("UI_UPDATE_START", 3);
            UI_UPDATE_END = new EntryType("UI_UPDATE_END", 4);
            CALL_START = new EntryType("CALL_START", 5);
            CALL_END = new EntryType("CALL_END", 6);
            ASYNC_CALL = new EntryType("ASYNC_CALL", 7);
            UI_POST_INVAL = new EntryType("UI_POST_INVAL", 8);
            SERV_CONN = new EntryType("SERV_CONN", 9);
            SERV_DISCONN = new EntryType("SERV_DISCONN", 10);
            SERV_END = new EntryType("SERV_END", 11);
            ADAPTER_NOTIFY = new EntryType("ADAPTER_NOTIFY", 12);
            ASYNC_TASK_PRE = new EntryType("ASYNC_TASK_PRE", 13);
            ASYNC_TASK_BACKGROUND = new EntryType("ASYNC_TASK_BACKGROUND", 14);
            ASYNC_TASK_POST = new EntryType("ASYNC_TASK_POST", 15);
            ASYNC_TASK_END = new EntryType("ASYNC_TASK_END", 16);
            NETWORK_OP_START = new EntryType("NETWORK_OP_START", 17);
            NETWORK_OP_END = new EntryType("NETWORK_OP_END", 18);
            MARK_FLAG = new EntryType("MARK_FLAG", 19);
            MARK_START = new EntryType("MARK_START", 20);
            MARK_STOP = new EntryType("MARK_STOP", 21);
            MARK_FAIL = new EntryType("MARK_FAIL", 22);
            MARK_CANCEL = new EntryType("MARK_CANCEL", 23);
            MARK_PUSH = new EntryType("MARK_PUSH", 24);
            MARK_POP = new EntryType("MARK_POP", 25);
            LIFECYCLE_APPLICATION_START = new EntryType("LIFECYCLE_APPLICATION_START", 26);
            LIFECYCLE_APPLICATION_END = new EntryType("LIFECYCLE_APPLICATION_END", 27);
            LIFECYCLE_ACTIVITY_START = new EntryType("LIFECYCLE_ACTIVITY_START", 28);
            LIFECYCLE_ACTIVITY_END = new EntryType("LIFECYCLE_ACTIVITY_END", 29);
            LIFECYCLE_SERVICE_START = new EntryType("LIFECYCLE_SERVICE_START", 30);
            LIFECYCLE_SERVICE_END = new EntryType("LIFECYCLE_SERVICE_END", 31);
            LIFECYCLE_BROADCAST_RECEIVER_START = new EntryType("LIFECYCLE_BROADCAST_RECEIVER_START", 32);
            LIFECYCLE_BROADCAST_RECEIVER_END = new EntryType("LIFECYCLE_BROADCAST_RECEIVER_END", 33);
            LIFECYCLE_CONTENT_PROVIDER_START = new EntryType("LIFECYCLE_CONTENT_PROVIDER_START", 34);
            LIFECYCLE_CONTENT_PROVIDER_END = new EntryType("LIFECYCLE_CONTENT_PROVIDER_END", 35);
            LIFECYCLE_FRAGMENT_START = new EntryType("LIFECYCLE_FRAGMENT_START", 36);
            LIFECYCLE_FRAGMENT_END = new EntryType("LIFECYCLE_FRAGMENT_END", 37);
            LIFECYCLE_VIEW_START = new EntryType("LIFECYCLE_VIEW_START", 38);
            LIFECYCLE_VIEW_END = new EntryType("LIFECYCLE_VIEW_END", 39);
            TRACE_ABORT = new EntryType("TRACE_ABORT", 40);
            TRACE_END = new EntryType("TRACE_END", 41);
            TRACE_START = new EntryType("TRACE_START", 42);
            TRACE_BACKWARDS = new EntryType("TRACE_BACKWARDS", 43);
            COUNTER = new EntryType("COUNTER", 44);
            TEST_CLOCK_SYNC_START = new EntryType("TEST_CLOCK_SYNC_START", 45);
            TEST_CLOCK_SYNC_END = new EntryType("TEST_CLOCK_SYNC_END", 46);
            QPL_START = new EntryType("QPL_START", 47);
            QPL_END = new EntryType("QPL_END", 48);
            QPL_CANCEL = new EntryType("QPL_CANCEL", 49);
            $VALUES = (new EntryType[] {
                UNKNOWN_TYPE, UI_INPUT_START, UI_INPUT_END, UI_UPDATE_START, UI_UPDATE_END, CALL_START, CALL_END, ASYNC_CALL, UI_POST_INVAL, SERV_CONN, 
                SERV_DISCONN, SERV_END, ADAPTER_NOTIFY, ASYNC_TASK_PRE, ASYNC_TASK_BACKGROUND, ASYNC_TASK_POST, ASYNC_TASK_END, NETWORK_OP_START, NETWORK_OP_END, MARK_FLAG, 
                MARK_START, MARK_STOP, MARK_FAIL, MARK_CANCEL, MARK_PUSH, MARK_POP, LIFECYCLE_APPLICATION_START, LIFECYCLE_APPLICATION_END, LIFECYCLE_ACTIVITY_START, LIFECYCLE_ACTIVITY_END, 
                LIFECYCLE_SERVICE_START, LIFECYCLE_SERVICE_END, LIFECYCLE_BROADCAST_RECEIVER_START, LIFECYCLE_BROADCAST_RECEIVER_END, LIFECYCLE_CONTENT_PROVIDER_START, LIFECYCLE_CONTENT_PROVIDER_END, LIFECYCLE_FRAGMENT_START, LIFECYCLE_FRAGMENT_END, LIFECYCLE_VIEW_START, LIFECYCLE_VIEW_END, 
                TRACE_ABORT, TRACE_END, TRACE_START, TRACE_BACKWARDS, COUNTER, TEST_CLOCK_SYNC_START, TEST_CLOCK_SYNC_END, QPL_START, QPL_END, QPL_CANCEL
            });
        }

        private EntryType(String s, int i)
        {
            super(s, i);
        }
    }

}

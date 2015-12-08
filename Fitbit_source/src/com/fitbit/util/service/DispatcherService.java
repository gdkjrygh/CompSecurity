// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.e.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.fitbit.util.service:
//            IntentMatcher, g

public abstract class DispatcherService extends IntentService
{
    public static final class TaskExecutionResult extends Enum
    {

        public static final TaskExecutionResult a;
        public static final TaskExecutionResult b;
        public static final TaskExecutionResult c;
        private static final TaskExecutionResult d[];

        public static TaskExecutionResult valueOf(String s)
        {
            return (TaskExecutionResult)Enum.valueOf(com/fitbit/util/service/DispatcherService$TaskExecutionResult, s);
        }

        public static TaskExecutionResult[] values()
        {
            return (TaskExecutionResult[])d.clone();
        }

        static 
        {
            a = new TaskExecutionResult("UNKNOWN", 0);
            b = new TaskExecutionResult("SUCCESS", 1);
            c = new TaskExecutionResult("FAIL", 2);
            d = (new TaskExecutionResult[] {
                a, b, c
            });
        }

        private TaskExecutionResult(String s, int j)
        {
            super(s, j);
        }
    }


    public static final String a = "com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK";
    public static final String b = "com.fitbit.util.service.DispatcherService.EXTRA_TASK_EXECUTION_RESULT";
    public static final String c = "com.fitbit.util.service.DispatcherService.ACTION_CANCEL";
    public static final String d = "com.fitbit.util.service.DispatcherService.GUID";
    public static final String e = "com.fitbit.util.service.DispatcherService.AFTER_LOGOUT_TASK_PERRMISSION";
    private static final String f = "DispatcherService";
    private boolean g;
    private IntentMatcher h;
    private Map i;

    public DispatcherService(String s)
    {
        super(s);
        i = Collections.synchronizedMap(new HashMap());
    }

    public static TaskExecutionResult a(Intent intent)
    {
        if (intent == null)
        {
            return com.fitbit.util.service.TaskExecutionResult.a;
        }
        if (!intent.hasExtra("com.fitbit.util.service.DispatcherService.EXTRA_TASK_EXECUTION_RESULT"))
        {
            return com.fitbit.util.service.TaskExecutionResult.a;
        } else
        {
            return (TaskExecutionResult)intent.getSerializableExtra("com.fitbit.util.service.DispatcherService.EXTRA_TASK_EXECUTION_RESULT");
        }
    }

    private void a(Intent intent, TaskExecutionResult taskexecutionresult)
    {
        if (intent.hasExtra("com.fitbit.util.service.DispatcherService.GUID"))
        {
            intent = (UUID)intent.getSerializableExtra("com.fitbit.util.service.DispatcherService.GUID");
            Intent intent1 = new Intent();
            intent1.setAction("com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK");
            intent1.putExtra("com.fitbit.util.service.DispatcherService.GUID", intent);
            intent1.putExtra("com.fitbit.util.service.DispatcherService.EXTRA_TASK_EXECUTION_RESULT", taskexecutionresult);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent1);
        }
    }

    protected void a()
    {
    }

    public IntentMatcher b()
    {
        return h;
    }

    public void onCreate()
    {
        super.onCreate();
        g = true;
        h = new IntentMatcher();
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        TaskExecutionResult taskexecutionresult;
        if (intent == null)
        {
            return;
        }
        obj1 = com.fitbit.util.service.TaskExecutionResult.a;
        taskexecutionresult = null;
        obj = null;
        obj3 = obj;
        obj2 = taskexecutionresult;
        g g1 = (g)((Class)h.a(intent)).newInstance();
        if (g1 == null) goto _L2; else goto _L1
_L1:
        obj3 = obj;
        obj2 = taskexecutionresult;
        obj = (UUID)intent.getSerializableExtra("com.fitbit.util.service.DispatcherService.GUID");
        Throwable throwable;
label0:
        {
            if (obj != null)
            {
                break label0;
            }
            boolean flag;
            boolean flag1;
            try
            {
                obj2 = UUID.randomUUID();
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
            finally
            {
                obj3 = obj;
                flag1 = false;
                obj = obj2;
                continue; /* Loop/switch isn't completed */
            }
_L6:
            obj = obj2;
        }
        obj3 = obj;
        obj2 = obj;
        com.fitbit.e.a.a("DispatcherService", "onHandleIntent %s %s", new Object[] {
            intent.getAction(), obj
        });
        obj3 = obj;
        obj2 = obj;
        if (!g1.b()) goto _L4; else goto _L3
_L3:
        obj3 = obj;
        obj2 = obj;
        i.put(obj, g1);
        obj3 = obj;
        obj2 = obj;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj3 = obj;
        obj2 = obj;
        a();
        obj3 = obj;
        obj2 = obj;
        g = false;
        obj3 = obj;
        obj2 = obj;
        g1.a(this, intent);
        obj3 = obj;
        obj2 = obj;
        flag = g1.a();
        flag1 = flag;
        obj3 = obj;
        obj2 = obj1;
        taskexecutionresult = TaskExecutionResult.b;
        obj1 = taskexecutionresult;
_L5:
        if (obj != null)
        {
            com.fitbit.e.a.a("DispatcherService", "onHandleIntent done %s %s %s", new Object[] {
                intent.getAction(), obj, Boolean.valueOf(flag)
            });
            i.remove(obj);
        }
        a(intent, ((TaskExecutionResult) (obj1)));
        return;
_L4:
        obj3 = obj;
        obj2 = obj;
        com.fitbit.e.a.a("DispatcherService", "Task %s cannot be executed. Task will be canceled.", new Object[] {
            g1
        });
        obj3 = obj;
        obj2 = obj;
        g1.E_();
        obj3 = obj;
        obj2 = obj;
        flag = g1.a();
        if (true) goto _L5; else goto _L2
_L2:
        obj3 = obj;
        obj2 = taskexecutionresult;
        throw new IllegalArgumentException((new StringBuilder()).append("task not found for intent ").append(intent).toString());
        throwable;
        flag = false;
        obj = obj3;
_L9:
        flag1 = flag;
        obj3 = obj;
        obj2 = obj1;
        obj1 = TaskExecutionResult.c;
        flag1 = flag;
        obj3 = obj;
        obj2 = obj1;
        com.fitbit.e.a.f("DispatcherService", "Throwable was thrown in ServiceTask", throwable, new Object[0]);
        if (obj != null)
        {
            com.fitbit.e.a.a("DispatcherService", "onHandleIntent done %s %s %s", new Object[] {
                intent.getAction(), obj, Boolean.valueOf(flag)
            });
            i.remove(obj);
        }
        a(intent, ((TaskExecutionResult) (obj1)));
        return;
        obj;
        flag1 = false;
        obj3 = obj2;
_L7:
        if (obj3 != null)
        {
            com.fitbit.e.a.a("DispatcherService", "onHandleIntent done %s %s %s", new Object[] {
                intent.getAction(), obj3, Boolean.valueOf(flag1)
            });
            i.remove(obj3);
        }
        a(intent, ((TaskExecutionResult) (obj1)));
        throw obj;
        obj;
        obj1 = obj2;
        if (true) goto _L7; else goto _L6
        throwable;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void onStart(Intent intent, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        g g1;
        if (!intent.getAction().equals("com.fitbit.util.service.DispatcherService.ACTION_CANCEL"))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        intent = (UUID)intent.getSerializableExtra("com.fitbit.util.service.DispatcherService.GUID");
        g1 = (g)i.get(intent);
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        com.fitbit.e.a.a("DispatcherService", "Canceling task %s with guid %s", new Object[] {
            g1, intent
        });
        g1.E_();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        super.onStart(intent, j);
        if (true) goto _L2; else goto _L1
_L1:
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
    }
}

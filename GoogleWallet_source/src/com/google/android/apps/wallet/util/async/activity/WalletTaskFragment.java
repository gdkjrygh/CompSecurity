// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ActionRequest;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.CompositeAction;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.util.async.activity:
//            WalletConcurrentActionException

public class WalletTaskFragment extends Fragment
{
    public static interface TaskCallback
    {

        public abstract boolean onActionFailure(String s, Callable callable, Exception exception);

        public abstract void onActionSuccess(String s, Callable callable, Object obj);
    }


    private static final String TAG = com/google/android/apps/wallet/util/async/activity/WalletTaskFragment.getSimpleName();
    private ActionExecutor actionExecutor;
    private final Map actionRequesters = Maps.newHashMap();
    private final Set notifiedActionIds = Sets.newHashSet();
    private final Map submittedActionFailures = Maps.newHashMap();
    private final Map submittedActionResults = Maps.newHashMap();
    private final Map submittedActions = Maps.newHashMap();
    final Map taskCallbacks = Maps.newHashMap();

    public WalletTaskFragment()
    {
    }

    private void notifyActionFailure(String s, Exception exception)
    {
        submittedActionFailures.put(s, exception);
        TaskCallback taskcallback = (TaskCallback)taskCallbacks.get(actionRequesters.get(s));
        if (taskcallback != null)
        {
            notifiedActionIds.add(s);
            taskcallback.onActionFailure(s, (Callable)submittedActions.get(s), exception);
        }
    }

    private void notifyActionSuccess(String s, Object obj)
    {
        submittedActionResults.put(s, obj);
        TaskCallback taskcallback = (TaskCallback)taskCallbacks.get(actionRequesters.get(s));
        if (taskcallback != null)
        {
            notifiedActionIds.add(s);
            taskcallback.onActionSuccess(s, (Callable)submittedActions.get(s), obj);
        }
    }

    public final void clearCallback(String s)
    {
        taskCallbacks.remove(s);
    }

    public final void executeAction(String s, final String actionId, Callable callable)
    {
label0:
        {
            if (!submittedActions.containsKey(actionId))
            {
                break label0;
            }
            Object obj = (Callable)submittedActions.get(actionId);
            obj = actionExecutor.getActiveRequests(((Callable) (obj))).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (((ActionRequest)((Iterator) (obj)).next()).isFinished());
            WLog.efmt(TAG, "current running action %s", new Object[] {
                actionId
            });
            notifyActionFailure(actionId, new WalletConcurrentActionException());
            return;
        }
        actionRequesters.put(actionId, s);
        submittedActions.put(actionId, callable);
        submittedActionResults.remove(actionId);
        submittedActionFailures.remove(actionId);
        notifiedActionIds.remove(actionId);
        if (callable instanceof CompositeAction)
        {
            actionExecutor.executeAllActions(((CompositeAction)callable).getActions(), new AsyncCallback() {

                final WalletTaskFragment this$0;
                final String val$actionId;

                private void onSuccess(Object aobj[])
                {
                    notifyActionSuccess(actionId, ((Object) (aobj)));
                }

                public final void onFailure(Exception exception)
                {
                    notifyActionFailure(actionId, exception);
                }

                public final volatile void onSuccess(Object obj1)
                {
                    onSuccess((Object[])obj1);
                }

            
            {
                this$0 = WalletTaskFragment.this;
                actionId = s;
                super();
            }
            });
            return;
        } else
        {
            actionExecutor.executeAction(callable, new AsyncCallback() {

                final WalletTaskFragment this$0;
                final String val$actionId;

                public final void onFailure(Exception exception)
                {
                    notifyActionFailure(actionId, exception);
                }

                public final void onSuccess(Object obj1)
                {
                    notifyActionSuccess(actionId, obj1);
                }

            
            {
                this$0 = WalletTaskFragment.this;
                actionId = s;
                super();
            }
            });
            return;
        }
    }

    public final boolean isActionRunning(String s)
    {
        return submittedActions.containsKey(s) && !submittedActionResults.containsKey(s) && !submittedActionFailures.containsKey(s);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy()
    {
        super.onDestroy();
        actionExecutor.cancelAll();
    }

    public final void setActionExecutor(ActionExecutor actionexecutor)
    {
        actionExecutor = actionexecutor;
    }

    public final void setCallback(String s, TaskCallback taskcallback)
    {
        Preconditions.checkNotNull(taskcallback);
        taskCallbacks.put(s, taskcallback);
        Iterator iterator = submittedActions.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!notifiedActionIds.contains(s1) && !isActionRunning(s1) && s.equals(actionRequesters.get(s1)))
            {
                notifiedActionIds.add(s1);
                if (submittedActionResults.containsKey(s1))
                {
                    taskcallback.onActionSuccess(s1, (Callable)submittedActions.get(s1), submittedActionResults.get(s1));
                } else
                if (submittedActionFailures.containsKey(s1))
                {
                    taskcallback.onActionFailure(s1, (Callable)submittedActions.get(s1), (Exception)submittedActionFailures.get(s1));
                }
            }
        } while (true);
    }



}

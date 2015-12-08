// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.lifecycle;

import android.app.Activity;
import android.content.Context;
import com.apptentive.android.sdk.ApptentiveInternal;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.SessionEvent;
import com.apptentive.android.sdk.module.engagement.EngagementModule;
import com.apptentive.android.sdk.storage.PersistentSessionQueue;
import com.apptentive.android.sdk.storage.SharedPreferencesPersistentSessionQueue;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActivityLifecycleManager
{

    private static final int SESSION_TIMEOUT_SECONDS = 10;
    private static Context appContext = null;
    private static PersistentSessionQueue queue = null;

    public ActivityLifecycleManager()
    {
    }

    public static void activityStarted(Activity activity)
    {
        SessionEvent sessionevent;
        SessionEvent sessionevent1;
        SessionEvent sessionevent2;
        int i;
        int j;
        init(activity);
        sessionevent = new SessionEvent((new Date()).getTime(), com.apptentive.android.sdk.SessionEvent.Action.START, activity.toString());
        sessionevent2 = getLastEvent(com.apptentive.android.sdk.SessionEvent.Action.STOP);
        sessionevent1 = getLastEvent(com.apptentive.android.sdk.SessionEvent.Action.START);
        removePairs(1);
        i = countStarts();
        j = countPairsInQueue();
        if (j == 0 && i == 0)
        {
            try
            {
                Log.v("First start.", new Object[0]);
                addEvents(new SessionEvent[] {
                    sessionevent
                });
                sendEvent(activity, sessionevent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                Log.e("Error while handling activity start.", activity, new Object[0]);
            }
            break MISSING_BLOCK_LABEL_136;
        }
        if (j != 0 || i != 1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        Log.v("Continuation Start. (1)", new Object[0]);
        addEvents(new SessionEvent[] {
            sessionevent
        });
        return;
        return;
        if (j != 0 || i != 2)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        Log.i("Starting new session after crash. (1)", new Object[0]);
        removeAllEvents();
        if (sessionevent1 != null)
        {
            sessionevent2 = sessionevent1;
        } else
        {
            sessionevent2 = sessionevent;
        }
        sendEvent(activity, sessionevent2, true);
        addEvents(new SessionEvent[] {
            sessionevent1, sessionevent
        });
        return;
        if (j != 1 || i != 1)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        if (sessionevent2.getTime() + 10000L < sessionevent.getTime())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        addEvents(new SessionEvent[] {
            sessionevent
        });
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        Log.d("Session expired. Starting new session.", new Object[0]);
        sendEvent(activity, sessionevent2);
        sendEvent(activity, sessionevent);
        return;
        Log.v("Continuation Start. (2)", new Object[0]);
        return;
        if (j != 1 || i != 2)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        Log.v("Continuation start. (3)", new Object[0]);
        addEvents(new SessionEvent[] {
            sessionevent
        });
        return;
        if (j != 1 || i != 3)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        Log.i("Starting new session after crash. (2)", new Object[0]);
        if (sessionevent1 != null)
        {
            sessionevent2 = sessionevent1;
        } else
        {
            sessionevent2 = sessionevent;
        }
        sendEvent(activity, sessionevent2, true);
        removeAllEvents();
        addEvents(new SessionEvent[] {
            sessionevent1, sessionevent
        });
        return;
        Log.w((new StringBuilder()).append("ERROR: Unexpected state in LifecycleManager: ").append(getQueueAsString()).toString(), new Object[0]);
        return;
    }

    public static void activityStopped(Activity activity)
    {
        try
        {
            init(activity);
            addEvents(new SessionEvent[] {
                new SessionEvent((new Date()).getTime(), com.apptentive.android.sdk.SessionEvent.Action.STOP, activity.toString())
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.e("Error while handling activity stop.", activity, new Object[0]);
        }
    }

    private static transient void addEvents(SessionEvent asessionevent[])
    {
        queue.addEvents(asessionevent);
    }

    private static int countPairsInQueue()
    {
        List list = getAllEvents();
        Object obj = new ArrayList();
        int i = 0;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SessionEvent sessionevent1 = (SessionEvent)iterator.next();
            if (sessionevent1.isStartEvent())
            {
                ((List) (obj)).add(sessionevent1);
            }
        } while (true);
        obj = ((List) (obj)).iterator();
label0:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            SessionEvent sessionevent = (SessionEvent)((Iterator) (obj)).next();
            Iterator iterator1 = list.iterator();
            SessionEvent sessionevent2;
            do
            {
                if (!iterator1.hasNext())
                {
                    continue label0;
                }
                sessionevent2 = (SessionEvent)iterator1.next();
            } while (!sessionevent2.isStopEvent() || !sessionevent.getActivityName().equals(sessionevent2.getActivityName()));
            i++;
            list.remove(sessionevent);
            list.remove(sessionevent2);
        } while (true);
        return i;
    }

    private static int countStarts()
    {
        int i = 0;
        Iterator iterator = getAllEvents().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((SessionEvent)iterator.next()).isStartEvent())
            {
                i++;
            }
        } while (true);
        return i;
    }

    private static List getAllEvents()
    {
        return queue.getAllEvents();
    }

    private static SessionEvent getLastEvent(com.apptentive.android.sdk.SessionEvent.Action action)
    {
        List list = getAllEvents();
        SessionEvent sessionevent = null;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SessionEvent sessionevent1 = (SessionEvent)iterator.next();
            if (sessionevent1.getAction() == action)
            {
                sessionevent = sessionevent1;
            }
        } while (true);
        return sessionevent;
    }

    private static String getQueueAsString()
    {
        StringBuilder stringbuilder = new StringBuilder("Queue: ");
        SessionEvent sessionevent;
        for (Iterator iterator = queue.getAllEvents().iterator(); iterator.hasNext(); stringbuilder.append("\n  ").append(sessionevent.getDebugString()))
        {
            sessionevent = (SessionEvent)iterator.next();
        }

        return stringbuilder.toString();
    }

    private static void init(Context context)
    {
        if (appContext == null)
        {
            appContext = context.getApplicationContext();
        }
        if (queue == null)
        {
            queue = new SharedPreferencesPersistentSessionQueue(appContext);
        }
    }

    private static void removeAllEvents()
    {
        queue.deleteAllEvents();
    }

    private static transient void removeEvent(SessionEvent asessionevent[])
    {
        queue.deleteEvents(asessionevent);
    }

    private static void removePairs(int i)
    {
        List list;
        ArrayList arraylist;
        Object obj;
        list = getAllEvents();
        obj = new ArrayList();
        arraylist = new ArrayList();
        i = Math.max(countPairsInQueue() - i, 0);
        if (i == 0)
        {
            return;
        }
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SessionEvent sessionevent1 = (SessionEvent)iterator.next();
            if (sessionevent1.isStartEvent())
            {
                ((List) (obj)).add(sessionevent1);
            }
        } while (true);
        obj = ((List) (obj)).iterator();
_L2:
        SessionEvent sessionevent;
        Iterator iterator1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        sessionevent = (SessionEvent)((Iterator) (obj)).next();
        iterator1 = list.iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        SessionEvent sessionevent2 = (SessionEvent)iterator1.next();
        if (!sessionevent2.isStopEvent() || !sessionevent.getActivityName().equals(sessionevent2.getActivityName())) goto _L4; else goto _L3
_L3:
        int j;
        j = i - 1;
        list.remove(sessionevent);
        list.remove(sessionevent2);
        arraylist.add(sessionevent);
        arraylist.add(sessionevent2);
        i = j;
        if (j != 0) goto _L2; else goto _L5
_L5:
        removeEvent((SessionEvent[])arraylist.toArray(new SessionEvent[arraylist.size()]));
        return;
    }

    private static void sendEvent(Activity activity, SessionEvent sessionevent)
    {
        sendEvent(activity, sessionevent, false);
    }

    private static void sendEvent(Activity activity, SessionEvent sessionevent, boolean flag)
    {
        Log.d((new StringBuilder()).append("Sending ").append(sessionevent.getDebugString()).toString(), new Object[0]);
        static class _cls1
        {

            static final int $SwitchMap$com$apptentive$android$sdk$SessionEvent$Action[];

            static 
            {
                $SwitchMap$com$apptentive$android$sdk$SessionEvent$Action = new int[com.apptentive.android.sdk.SessionEvent.Action.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$SessionEvent$Action[com.apptentive.android.sdk.SessionEvent.Action.START.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$SessionEvent$Action[com.apptentive.android.sdk.SessionEvent.Action.STOP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.apptentive.android.sdk.SessionEvent.Action[sessionevent.getAction().ordinal()];
        JVM INSTR tableswitch 1 2: default 64
    //                   1 65
    //                   2 74;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (!flag)
        {
            ApptentiveInternal.onAppLaunch(activity);
            return;
        }
          goto _L1
_L3:
        EngagementModule.engageInternal(activity, com.apptentive.android.sdk.model.Event.EventLabel.app__exit.getLabelName());
        return;
    }

}

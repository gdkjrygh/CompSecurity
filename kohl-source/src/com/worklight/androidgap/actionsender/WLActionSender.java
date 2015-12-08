// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.actionsender;

import com.worklight.androidgap.api.WLActionReceiver;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.worklight.androidgap.actionsender:
//            WLActionReceiverInternal, WLAction

public class WLActionSender
{

    private static final String TAG = "WLActionSender";
    private static WLActionSender instance;
    private ArrayList nativeActionReceivers;
    private ArrayList webActionReceivers;
    private ArrayList wlActionCacheForNative;
    private ArrayList wlActionCacheForWeb;

    private WLActionSender()
    {
        webActionReceivers = new ArrayList();
        nativeActionReceivers = new ArrayList();
        wlActionCacheForWeb = new ArrayList();
        wlActionCacheForNative = new ArrayList();
    }

    private ArrayList getClonedNativeReceiversList()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList(nativeActionReceivers);
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        throw exception;
    }

    private ArrayList getClonedWebReceiversList()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList(webActionReceivers);
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        throw exception;
    }

    public static WLActionSender getInstance()
    {
        if (instance == null)
        {
            instance = new WLActionSender();
        }
        return instance;
    }

    private void removeActionReceiverInternal(WLActionReceiver wlactionreceiver, ArrayList arraylist)
    {
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            if (((WLActionReceiverInternal)arraylist.next()).getWLActionReceiver() == wlactionreceiver)
            {
                arraylist.remove();
            }
        } while (true);
    }

    private void sendAction(WLAction wlaction, ArrayList arraylist, ArrayList arraylist1)
    {
        Boolean boolean1 = Boolean.valueOf(false);
        Iterator iterator = arraylist.iterator();
        arraylist = boolean1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WLActionReceiverInternal wlactionreceiverinternal = (WLActionReceiverInternal)iterator.next();
            if (shouldDeliverAction(wlactionreceiverinternal, wlaction))
            {
                sendActionOnBackgroundThead(wlaction, wlactionreceiverinternal.getWLActionReceiver());
                arraylist = Boolean.valueOf(true);
            }
        } while (true);
        if (!arraylist.booleanValue())
        {
            arraylist1.add(wlaction);
        }
    }

    private void sendActionOnBackgroundThead(final WLAction wlAction, final WLActionReceiver wlActionReceiver)
    {
        (new Thread(new Runnable() {

            final WLActionSender this$0;
            final WLAction val$wlAction;
            final WLActionReceiver val$wlActionReceiver;

            public void run()
            {
                wlActionReceiver.onActionReceived(wlAction.getAction(), wlAction.getData());
            }

            
            {
                this$0 = WLActionSender.this;
                wlActionReceiver = wlactionreceiver;
                wlAction = wlaction;
                super();
            }
        })).run();
    }

    private boolean shouldDeliverAction(WLActionReceiverInternal wlactionreceiverinternal, WLAction wlaction)
    {
        if (wlactionreceiverinternal != null && wlactionreceiverinternal.getWLActionReceiver() != null && wlaction != null)
        {
            wlactionreceiverinternal = wlactionreceiverinternal.getTag();
            wlaction = wlaction.getTag();
            if (wlactionreceiverinternal == null && wlaction == null)
            {
                return true;
            }
            if (wlactionreceiverinternal != null)
            {
                return wlactionreceiverinternal.equals(wlaction);
            }
        }
        return false;
    }

    private void tryToSendCachedActions(ArrayList arraylist, WLActionReceiverInternal wlactionreceiverinternal)
    {
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            WLAction wlaction = (WLAction)arraylist.next();
            if (shouldDeliverAction(wlactionreceiverinternal, wlaction))
            {
                arraylist.remove();
                sendActionOnBackgroundThead(wlaction, wlactionreceiverinternal.getWLActionReceiver());
            }
        } while (true);
    }

    public void addActionReceiver(WLActionReceiver wlactionreceiver, boolean flag, String s)
    {
        this;
        JVM INSTR monitorenter ;
        wlactionreceiver = new WLActionReceiverInternal(wlactionreceiver, s);
        if (!flag) goto _L2; else goto _L1
_L1:
        webActionReceivers.add(wlactionreceiver);
        tryToSendCachedActions(wlActionCacheForWeb, wlactionreceiver);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        nativeActionReceivers.add(wlactionreceiver);
        tryToSendCachedActions(wlActionCacheForNative, wlactionreceiver);
        if (true) goto _L4; else goto _L3
_L3:
        wlactionreceiver;
        throw wlactionreceiver;
    }

    public void removeActionReceiver(WLActionReceiver wlactionreceiver, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        removeActionReceiverInternal(wlactionreceiver, webActionReceivers);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        removeActionReceiverInternal(wlactionreceiver, nativeActionReceivers);
        if (true) goto _L4; else goto _L3
_L3:
        wlactionreceiver;
        throw wlactionreceiver;
    }

    public void sendActionToJS(WLAction wlaction)
    {
        this;
        JVM INSTR monitorenter ;
        sendAction(wlaction, getClonedWebReceiversList(), wlActionCacheForWeb);
        this;
        JVM INSTR monitorexit ;
        return;
        wlaction;
        throw wlaction;
    }

    public void sendActionToNative(WLAction wlaction)
    {
        this;
        JVM INSTR monitorenter ;
        sendAction(wlaction, getClonedNativeReceiversList(), wlActionCacheForNative);
        this;
        JVM INSTR monitorexit ;
        return;
        wlaction;
        throw wlaction;
    }
}

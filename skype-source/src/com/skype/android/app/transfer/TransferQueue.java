// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.util.SparseArray;
import com.skype.Transfer;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferUtil

public class TransferQueue
{

    private static final Logger log = Logger.getLogger("TransferQueue");
    private SparseArray incomingCompletedTransferMap;
    private SparseArray incomingOngoingTransferMap;
    private Map incomingTransfersMap;
    private SparseArray outgoingCompletedTransferMap;
    private SparseArray outgoingOngoingTransferMap;
    private Map outgoingTransfersMap;
    private TransferUtil transferUtil;

    public TransferQueue(TransferUtil transferutil)
    {
        incomingTransfersMap = new HashMap();
        outgoingTransfersMap = new HashMap();
        incomingOngoingTransferMap = new SparseArray();
        incomingCompletedTransferMap = new SparseArray();
        outgoingOngoingTransferMap = new SparseArray();
        outgoingCompletedTransferMap = new SparseArray();
        transferUtil = transferutil;
    }

    private void addToOngoingAndFutureTransferSet(int i, Transfer transfer)
    {
        if (transfer.getTypeProp() == com.skype.Transfer.TYPE.INCOMING)
        {
            Set set = getIncomingOngoingAndFutureTransferSet(i);
            Object obj = set;
            if (set == null)
            {
                obj = new HashSet();
            }
            if (!((Set) (obj)).contains(Integer.valueOf(transfer.getObjectID())))
            {
                ((Set) (obj)).add(Integer.valueOf(transfer.getObjectID()));
            }
            incomingOngoingTransferMap.put(i, obj);
            return;
        }
        Set set1 = getOutgoingOngoingAndFutureTransferSet(i);
        Object obj1 = set1;
        if (set1 == null)
        {
            obj1 = new HashSet();
        }
        if (!((Set) (obj1)).contains(Integer.valueOf(transfer.getObjectID())))
        {
            ((Set) (obj1)).add(Integer.valueOf(transfer.getObjectID()));
        }
        outgoingOngoingTransferMap.put(i, obj1);
    }

    private void clearAllTransferSets(Transfer transfer)
    {
        int i = transfer.getConvoIdProp();
        if (transferUtil.isIncoming(transfer))
        {
            clearIncomingOngoingAndFutureTransferSet(i);
            clearIncomingCompletedTransferSet(i);
            return;
        } else
        {
            clearOutgoingOngoingAndFutureTransferSet(i);
            clearOutgoingCompletedTransferSet(i);
            return;
        }
    }

    private void clearIncomingCompletedTransferSet(int i)
    {
        incomingCompletedTransferMap.remove(i);
    }

    private void clearIncomingOngoingAndFutureTransferSet(int i)
    {
        incomingOngoingTransferMap.remove(i);
    }

    private void clearOutgoingCompletedTransferSet(int i)
    {
        outgoingCompletedTransferMap.remove(i);
    }

    private void clearOutgoingOngoingAndFutureTransferSet(int i)
    {
        outgoingOngoingTransferMap.remove(i);
    }

    private Map getTransferMapFor(Transfer transfer)
    {
        if (transferUtil.isIncoming(transfer))
        {
            return incomingTransfersMap;
        } else
        {
            return outgoingTransfersMap;
        }
    }

    private void startFileTransfer(final Transfer transfer)
    {
        (new Thread(new Runnable() {

            final TransferQueue this$0;
            final Transfer val$transfer;

            public final void run()
            {
                if (transferUtil.isIncoming(transfer))
                {
                    transfer.accept((new StringBuilder()).append(transferUtil.getDownloadsDirectory()).append(File.separator).append(transferUtil.consolidateFileName(transfer)).toString());
                } else
                {
                    transfer.resume();
                }
                TransferQueue.log.info((new StringBuilder("transfer started for ")).append(transfer.getFilenameProp()).toString());
            }

            
            {
                this$0 = TransferQueue.this;
                transfer = transfer1;
                super();
            }
        })).start();
    }

    public void addToCompletedTransferSet(int i, Transfer transfer)
    {
        if (transfer.getTypeProp() == com.skype.Transfer.TYPE.INCOMING)
        {
            Set set = getIncomingCompletedTransferSet(i);
            Object obj = set;
            if (set == null)
            {
                obj = new HashSet();
            }
            if (!((Set) (obj)).contains(Integer.valueOf(transfer.getObjectID())))
            {
                ((Set) (obj)).add(Integer.valueOf(transfer.getObjectID()));
            }
            incomingCompletedTransferMap.put(i, obj);
            return;
        }
        Set set1 = getOutgoingCompletedTransferSet(i);
        Object obj1 = set1;
        if (set1 == null)
        {
            obj1 = new HashSet();
        }
        if (!((Set) (obj1)).contains(Integer.valueOf(transfer.getObjectID())))
        {
            ((Set) (obj1)).add(Integer.valueOf(transfer.getObjectID()));
        }
        outgoingCompletedTransferMap.put(i, obj1);
    }

    public void addTransfer(Transfer transfer)
    {
        int i;
        boolean flag;
label0:
        {
            i = transfer.getConvoIdProp();
            addToOngoingAndFutureTransferSet(i, transfer);
            synchronized (getTransferMapFor(transfer))
            {
                flag = transferUtil.isIncoming(transfer);
                if (map.containsKey(Integer.valueOf(i)))
                {
                    break label0;
                }
                LinkedList linkedlist = new LinkedList();
                map.put(Integer.valueOf(i), linkedlist);
                linkedlist.addLast(transfer);
                startFileTransfer(transfer);
            }
            return;
        }
        LinkedList linkedlist1;
        linkedlist1 = (LinkedList)map.get(Integer.valueOf(i));
        if (linkedlist1.contains(transfer))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        linkedlist1.addLast(transfer);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        transfer.pause();
        log.info((new StringBuilder("outgoing transfer ")).append(transfer.getFilenameProp()).append(" paused").toString());
        log.info((new StringBuilder("transfer add queued for file ")).append(transfer.getFilenameProp()).append(", queue size is ").append(linkedlist1.size()).toString());
        map;
        JVM INSTR monitorexit ;
        return;
        transfer;
        map;
        JVM INSTR monitorexit ;
        throw transfer;
    }

    public Set getIncomingCompletedTransferSet(int i)
    {
        return (Set)incomingCompletedTransferMap.get(i);
    }

    public Set getIncomingOngoingAndFutureTransferSet(int i)
    {
        return (Set)incomingOngoingTransferMap.get(i);
    }

    public Set getOutgoingCompletedTransferSet(int i)
    {
        return (Set)outgoingCompletedTransferMap.get(i);
    }

    public Set getOutgoingOngoingAndFutureTransferSet(int i)
    {
        return (Set)outgoingOngoingTransferMap.get(i);
    }

    public LinkedList getOutgoingTransferQueue(int i)
    {
        return (LinkedList)outgoingTransfersMap.get(Integer.valueOf(i));
    }

    public LinkedList getTransferQueue(int i)
    {
        return (LinkedList)incomingTransfersMap.get(Integer.valueOf(i));
    }

    public boolean isFirstInQueue(Transfer transfer)
    {
        LinkedList linkedlist;
        boolean flag;
label0:
        {
            flag = false;
            synchronized (getTransferMapFor(transfer))
            {
                linkedlist = (LinkedList)map.get(Integer.valueOf(transfer.getConvoIdProp()));
                if (map.containsKey(Integer.valueOf(transfer.getConvoIdProp())))
                {
                    break label0;
                }
            }
            return false;
        }
        if (linkedlist.peek() == transfer)
        {
            flag = true;
        }
        map;
        JVM INSTR monitorexit ;
        return flag;
        transfer;
        map;
        JVM INSTR monitorexit ;
        throw transfer;
    }

    public boolean isTransferQueued(Transfer transfer)
    {
        LinkedList linkedlist;
label0:
        {
            synchronized (getTransferMapFor(transfer))
            {
                linkedlist = (LinkedList)map.get(Integer.valueOf(transfer.getConvoIdProp()));
                if (map.containsKey(Integer.valueOf(transfer.getConvoIdProp())))
                {
                    break label0;
                }
            }
            return false;
        }
        boolean flag = linkedlist.contains(transfer);
        map;
        JVM INSTR monitorexit ;
        return flag;
        transfer;
        map;
        JVM INSTR monitorexit ;
        throw transfer;
    }

    protected void transferCompleted(Transfer transfer)
    {
        Map map = getTransferMapFor(transfer);
        map;
        JVM INSTR monitorenter ;
        LinkedList linkedlist = (LinkedList)map.get(Integer.valueOf(transfer.getConvoIdProp()));
        if (linkedlist != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        clearAllTransferSets(transfer);
        if (linkedlist == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (isTransferQueued(transfer))
        {
            break MISSING_BLOCK_LABEL_51;
        }
        map;
        JVM INSTR monitorexit ;
        return;
        if (linkedlist.size() != 1) goto _L2; else goto _L1
_L1:
        map.remove(Integer.valueOf(transfer.getConvoIdProp()));
        log.info((new StringBuilder("queue is empty for conversation id ")).append(transfer.getPartnerDispnameProp()).append(", removing it...").toString());
        clearAllTransferSets(transfer);
_L3:
        map;
        JVM INSTR monitorexit ;
        return;
        transfer;
        map;
        JVM INSTR monitorexit ;
        throw transfer;
_L2:
label0:
        {
            if (transfer != linkedlist.peek())
            {
                break label0;
            }
            linkedlist.removeFirst();
            startFileTransfer((Transfer)linkedlist.peek());
            log.info((new StringBuilder("transfer started for file ")).append(transfer.getFilenameProp()).append(", queue size is ").append(linkedlist.size()).toString());
        }
          goto _L3
        linkedlist.remove(transfer);
          goto _L3
    }



}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.util.SparseIntArray;
import com.skype.Message;
import com.skype.android.skylib.ObjectIdMap;
import java.util.HashSet;
import java.util.Set;

final class c
{

    private final SparseIntArray failedUploads = new SparseIntArray();
    private ObjectIdMap map;
    private final SparseIntArray queuedUploads = new SparseIntArray();

    public c(ObjectIdMap objectidmap)
    {
        map = objectidmap;
    }

    private int getMessageIdForUpload(SparseIntArray sparseintarray, int i)
    {
        sparseintarray;
        JVM INSTR monitorenter ;
        i = sparseintarray.get(i, -1);
        sparseintarray;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        sparseintarray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void putMediaDocumentUploadInformation(SparseIntArray sparseintarray, int i, int j)
    {
        sparseintarray;
        JVM INSTR monitorenter ;
        sparseintarray.put(j, i);
        sparseintarray;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        sparseintarray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void removeMediaDocumentUploadInformation(SparseIntArray sparseintarray, int i)
    {
        sparseintarray;
        JVM INSTR monitorenter ;
        sparseintarray.delete(i);
        sparseintarray;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        sparseintarray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void addFailedUpload(int i)
    {
        SparseIntArray sparseintarray = queuedUploads;
        sparseintarray;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        if (j < queuedUploads.size())
        {
            if (i == queuedUploads.keyAt(j))
            {
                int k = queuedUploads.valueAt(j);
                putMediaDocumentUploadInformation(failedUploads, k, i);
            }
            break MISSING_BLOCK_LABEL_77;
        }
        removeMediaDocumentUploadInformation(queuedUploads, i);
        sparseintarray;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        sparseintarray;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void addFailedUpload(int i, int j)
    {
        putMediaDocumentUploadInformation(failedUploads, i, j);
    }

    public final void addToUploadQueue(int i, int j)
    {
        putMediaDocumentUploadInformation(queuedUploads, i, j);
    }

    public final void clear()
    {
        queuedUploads.clear();
        failedUploads.clear();
    }

    public final Set getConvoDbIdForFailedUploads()
    {
        HashSet hashset = new HashSet();
        SparseIntArray sparseintarray = failedUploads;
        sparseintarray;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= failedUploads.size())
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(Integer.valueOf(((Message)map.a(failedUploads.valueAt(i), com/skype/Message)).getConvoIdProp()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sparseintarray;
        JVM INSTR monitorexit ;
        return hashset;
        Exception exception;
        exception;
        sparseintarray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Set getFailedUploadsByConvoDbId(int i)
    {
        HashSet hashset = new HashSet();
        SparseIntArray sparseintarray = failedUploads;
        sparseintarray;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        if (j < failedUploads.size())
        {
            if (((Message)map.a(failedUploads.valueAt(j), com/skype/Message)).getConvoIdProp() == i)
            {
                hashset.add(Integer.valueOf(failedUploads.keyAt(j)));
            }
            break MISSING_BLOCK_LABEL_93;
        }
        sparseintarray;
        JVM INSTR monitorexit ;
        return hashset;
        Exception exception;
        exception;
        sparseintarray;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int getFailedUploadsCountForConversation(int i)
    {
        int k = 0;
        SparseIntArray sparseintarray = failedUploads;
        sparseintarray;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        if (j >= failedUploads.size())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        int l = k;
        if (((Message)map.a(failedUploads.valueAt(j), com/skype/Message)).getConvoIdProp() == i)
        {
            l = k + 1;
        }
        break MISSING_BLOCK_LABEL_80;
        sparseintarray;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        sparseintarray;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        k = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int getMessageIdForFailedUpload(int i)
    {
        return getMessageIdForUpload(failedUploads, i);
    }

    public final int getMessageIdForQueuedUpload(int i)
    {
        return getMessageIdForUpload(queuedUploads, i);
    }

    public final boolean hasFailedUploads()
    {
        return failedUploads.size() > 0;
    }

    public final boolean hasFailedUploadsForConversation(int i)
    {
        return getFailedUploadsCountForConversation(i) > 0;
    }

    public final void removeFromUploadQueue(int i)
    {
        removeMediaDocumentUploadInformation(queuedUploads, i);
        removeMediaDocumentUploadInformation(failedUploads, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.LongSparseArray;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetQueueEntryParcelable

public final class QueueEntryBufferImpl extends AbstractDataBuffer
    implements com.google.android.gms.wearable.LargeAssetApi.QueueEntryBuffer
{
    private static final class EntryMetadata
    {

        public final int refuseCode;
        public final int state;

        public final String toString()
        {
            return (new StringBuilder("EntryMetadata{state=")).append(state).append(", refuseCode=").append(refuseCode).append("}").toString();
        }

        public EntryMetadata(int i, int j)
        {
            state = QueueEntryBufferImpl.access$000(i);
            refuseCode = j;
        }
    }


    private static final int EMPTY_INT_ARRAY[] = new int[0];
    private static final long EMPTY_LONG_ARRAY[] = new long[0];
    private final LongSparseArray mEntryMetadataByTransferId;
    private final Status mStatus;

    public QueueEntryBufferImpl(DataHolder dataholder)
    {
        int i;
        int k;
        i = 0;
        super(dataholder);
        k = dataholder.mStatusCode;
        k;
        JVM INSTR tableswitch 4000 4005: default 56
    //                   4000 100
    //                   4001 106
    //                   4002 112
    //                   4003 118
    //                   4004 124
    //                   4005 130;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_130;
_L1:
        Object obj = CommonStatusCodes.getStatusCodeString(k);
_L8:
        mStatus = new Status(k, ((String) (obj)));
        obj = dataholder.mMetadata;
        if (obj == null)
        {
            dataholder = new LongSparseArray(0);
        } else
        {
            dataholder = ((Bundle) (obj)).getLongArray("notPausedTransferIds");
            int ai1[];
            if (dataholder == null)
            {
                dataholder = EMPTY_LONG_ARRAY;
            }
            ai1 = ((Bundle) (obj)).getIntArray("notPausedStates");
            if (ai1 == null)
            {
                EntryMetadata entrymetadata = new EntryMetadata(2, 0);
                Preconditions.checkNotNull(entrymetadata);
                obj = new LongSparseArray(dataholder.length);
                for (int l = dataholder.length; i < l; i++)
                {
                    ((LongSparseArray) (obj)).put(dataholder[i], entrymetadata);
                }

                dataholder = ((DataHolder) (obj));
            } else
            {
                int ai[] = ((Bundle) (obj)).getIntArray("refuseCodes");
                LongSparseArray longsparsearray;
                int j;
                int i1;
                boolean flag;
                if (ai == null)
                {
                    ai = EMPTY_INT_ARRAY;
                }
                if (dataholder.length == ai1.length)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "transferIds and states differ in length.");
                Preconditions.checkNotNull(ai);
                longsparsearray = new LongSparseArray(dataholder.length);
                j = 0;
                i1 = 0;
                while (j < dataholder.length) 
                {
                    int j1;
                    if (ai1[j] == 4)
                    {
                        EntryMetadata entrymetadata1;
                        if (i1 < ai.length)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        Preconditions.checkArgument(flag, "More entries in STATE_REFUSED than refuseCodes");
                        j1 = ai[i1];
                        i1++;
                    } else
                    {
                        j1 = 0;
                    }
                    entrymetadata1 = new EntryMetadata(ai1[j], j1);
                    longsparsearray.put(dataholder[j], entrymetadata1);
                    j++;
                }
                dataholder = longsparsearray;
            }
        }
        mEntryMetadataByTransferId = dataholder;
        return;
_L2:
        obj = "TARGET_NODE_NOT_CONNECTED";
          goto _L8
_L3:
        obj = "DUPLICATE_LISTENER";
          goto _L8
_L4:
        obj = "UNKNOWN_LISTENER";
          goto _L8
_L5:
        obj = "DATA_ITEM_TOO_LARGE";
          goto _L8
_L6:
        obj = "INVALID_TARGET_NODE";
          goto _L8
        obj = "ASSET_UNAVAILABLE";
          goto _L8
    }

    public final volatile Object get(int i)
    {
        int l = mDataHolder.getWindowIndex(i);
        long l1 = mDataHolder.getLong("transferId", i, l);
        Object obj = (EntryMetadata)mEntryMetadataByTransferId.get(l1);
        String s;
        Uri uri;
        EntryMetadata entrymetadata;
        int j;
        int k;
        if (obj == null)
        {
            j = 1;
        } else
        {
            j = ((EntryMetadata) (obj)).state;
        }
        obj = mDataHolder.getString("path", i, l);
        s = mDataHolder.getString("nodeId", i, l);
        uri = Uri.parse(mDataHolder.getString("destinationUri", i, l));
        entrymetadata = (EntryMetadata)mEntryMetadataByTransferId.get(l1);
        if (entrymetadata == null)
        {
            k = 0;
        } else
        {
            k = entrymetadata.refuseCode;
        }
        return new LargeAssetQueueEntryParcelable(l1, j, ((String) (obj)), s, uri, k, mDataHolder.getBoolean("append", i, l), mDataHolder.getBoolean("allowedOverMetered", i, l), mDataHolder.getBoolean("allowedWithLowBattery", i, l));
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final String toString()
    {
        return (new StringBuilder("QueueEntryBufferImpl{status=")).append(mStatus).append(", entryMetadataByTransferId=").append(mEntryMetadataByTransferId).append("}").toString();
    }



/*
    static int access$000(int i)
    {
        boolean flag;
        if (i == 2 || i == 1 || i == 3 || i == 4 || i == 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid queue entry state: %s", new Object[] {
            Integer.valueOf(i)
        });
        return i;
    }

*/
}

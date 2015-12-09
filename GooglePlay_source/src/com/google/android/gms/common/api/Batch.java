// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, BatchResult, GoogleApiClient, Status, 
//            Result, BatchResultToken

public final class Batch extends BasePendingResult
{
    public static final class Builder
    {

        private GoogleApiClient mApiClient;
        private List mResultList;

        public final BatchResultToken add(PendingResult pendingresult)
        {
            BatchResultToken batchresulttoken = new BatchResultToken(mResultList.size());
            mResultList.add(pendingresult);
            return batchresulttoken;
        }

        public final Batch build()
        {
            return new Batch(mResultList, mApiClient, (byte)0);
        }

        public Builder(GoogleApiClient googleapiclient)
        {
            mResultList = new ArrayList();
            mApiClient = googleapiclient;
        }
    }


    boolean mAnyFailures;
    final Object mLock;
    boolean mPendingResultCanceled;
    final PendingResult mPendingResults[];
    int mRemainingItems;

    private Batch(List list, GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
        mLock = new Object();
        mRemainingItems = list.size();
        mPendingResults = new PendingResult[mRemainingItems];
        for (int i = 0; i < list.size(); i++)
        {
            googleapiclient = (PendingResult)list.get(i);
            mPendingResults[i] = googleapiclient;
            googleapiclient.addStatusListener(new PendingResult.StatusListener() {

                final Batch this$0;

                public final void onComplete(Status status)
                {
                    boolean flag;
label0:
                    {
                        flag = true;
                        synchronized (mLock)
                        {
                            if (!isCanceled())
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    if (status.mStatusCode != 16)
                    {
                        flag = false;
                    }
                    if (!flag) goto _L2; else goto _L1
_L1:
                    mPendingResultCanceled = true;
_L8:
                    status = Batch.this;
                    status.mRemainingItems = ((Batch) (status)).mRemainingItems - 1;
                    if (mRemainingItems != 0) goto _L4; else goto _L3
_L3:
                    if (!mPendingResultCanceled) goto _L6; else goto _L5
_L5:
                    cancel();
_L4:
                    obj;
                    JVM INSTR monitorexit ;
                    return;
                    status;
                    obj;
                    JVM INSTR monitorexit ;
                    throw status;
_L2:
                    if (status.isSuccess()) goto _L8; else goto _L7
_L7:
                    mAnyFailures = true;
                      goto _L8
_L6:
                    if (!mAnyFailures)
                    {
                        break MISSING_BLOCK_LABEL_164;
                    }
                    status = new Status(13);
_L9:
                    setResult(new BatchResult(status, mPendingResults));
                      goto _L4
                    status = Status.RESULT_SUCCESS;
                      goto _L9
                }

            
            {
                this$0 = Batch.this;
                super();
            }
            });
        }

    }

    Batch(List list, GoogleApiClient googleapiclient, byte byte0)
    {
        this(list, googleapiclient);
    }

    public final void cancel()
    {
        super.cancel();
        PendingResult apendingresult[] = mPendingResults;
        int j = apendingresult.length;
        for (int i = 0; i < j; i++)
        {
            apendingresult[i].cancel();
        }

    }

    public final volatile Result createFailedResult(Status status)
    {
        return new BatchResult(status, mPendingResults);
    }

}

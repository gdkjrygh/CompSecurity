// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.util.Log;

// Referenced classes of package android.support.v8.renderscript:
//            RenderScript, RSDriverException, RSInvalidStateException, RSRuntimeException

static class mRS extends Thread
{

    static final int RS_ERROR_FATAL_UNKNOWN = 4096;
    static final int RS_MESSAGE_TO_CLIENT_ERROR = 3;
    static final int RS_MESSAGE_TO_CLIENT_EXCEPTION = 1;
    static final int RS_MESSAGE_TO_CLIENT_NONE = 0;
    static final int RS_MESSAGE_TO_CLIENT_RESIZE = 2;
    static final int RS_MESSAGE_TO_CLIENT_USER = 4;
    int mAuxData[];
    RenderScript mRS;
    boolean mRun;

    public void run()
    {
        int ai[] = new int[16];
        mRS.nContextInitToClient(mRS.mContext);
        while (mRun) 
        {
            ai[0] = 0;
            int i = mRS.nContextPeekMessage(mRS.mContext, mAuxData);
            int j = mAuxData[1];
            int k = mAuxData[0];
            if (i == 4)
            {
                int ai1[] = ai;
                if (j >> 2 >= ai.length)
                {
                    ai1 = new int[j + 3 >> 2];
                }
                if (mRS.nContextGetUserMessage(mRS.mContext, ai1) != 4)
                {
                    throw new RSDriverException("Error processing message from RenderScript.");
                }
                if (mRS.mMessageCallback != null)
                {
                    mRS.mMessageCallback.mData = ai1;
                    mRS.mMessageCallback.mID = k;
                    mRS.mMessageCallback.mLength = j;
                    mRS.mMessageCallback.run();
                    ai = ai1;
                } else
                {
                    throw new RSInvalidStateException("Received a message from the script with no message handler installed.");
                }
            } else
            if (i == 3)
            {
                String s = mRS.nContextGetErrorMessage(mRS.mContext);
                if (k >= 4096)
                {
                    throw new RSRuntimeException((new StringBuilder()).append("Fatal error ").append(k).append(", details: ").append(s).toString());
                }
                if (mRS.mErrorCallback != null)
                {
                    mRS.mErrorCallback.mErrorMessage = s;
                    mRS.mErrorCallback.mErrorNum = k;
                    mRS.mErrorCallback.run();
                } else
                {
                    Log.e("RenderScript_jni", (new StringBuilder()).append("non fatal RS error, ").append(s).toString());
                }
            } else
            {
                try
                {
                    sleep(1L, 0);
                }
                catch (InterruptedException interruptedexception) { }
            }
        }
    }

    (RenderScript renderscript)
    {
        super("RSMessageThread");
        mRun = true;
        mAuxData = new int[2];
        mRS = renderscript;
    }
}

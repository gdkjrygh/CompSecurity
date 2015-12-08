// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import bQ;
import bS;
import bT;

// Referenced classes of package android.support.v8.renderscript:
//            RenderScript

static final class b extends Thread
{

    boolean a;
    private RenderScript b;
    private int c[];

    public final void run()
    {
        Object obj = new int[16];
        b.nContextInitToClient(b.mContext);
        do
        {
            if (!a)
            {
                break;
            }
            obj[0] = 0;
            int i = b.nContextPeekMessage(b.mContext, c);
            int j = c[1];
            int k = c[0];
            if (i == 4)
            {
                int ai[] = ((int []) (obj));
                if (j >> 2 >= obj.length)
                {
                    ai = new int[j + 3 >> 2];
                }
                if (b.nContextGetUserMessage(b.mContext, ai) != 4)
                {
                    throw new bQ("Error processing message from RenderScript.");
                }
                if (b.mMessageCallback != null)
                {
                    obj = b.mMessageCallback;
                    obj = b.mMessageCallback;
                    obj = b.mMessageCallback;
                    b.mMessageCallback.run();
                    obj = ai;
                } else
                {
                    throw new bS("Received a message from the script with no message handler installed.");
                }
            } else
            if (i == 3)
            {
                String s = b.nContextGetErrorMessage(b.mContext);
                if (k >= 4096)
                {
                    throw new bT((new StringBuilder("Fatal error ")).append(k).append(", details: ").append(s).toString());
                }
                if (b.mErrorCallback != null)
                {
                    b b1 = b.mErrorCallback;
                    b1 = b.mErrorCallback;
                    b.mErrorCallback.run();
                }
            } else
            {
                try
                {
                    sleep(1L, 0);
                }
                catch (InterruptedException interruptedexception) { }
            }
        } while (true);
    }

    (RenderScript renderscript)
    {
        super("RSMessageThread");
        a = true;
        c = new int[2];
        b = renderscript;
    }
}
